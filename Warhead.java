public abstract class Warhead {
    private String target;
    private int payload;
    private String launchCode;

    public Warhead(String target, int payload, String launchCode) {
        this.target = target;
        this.payload = payload;
        this.launchCode = launchCode;
    }

    public abstract void launch();

    public String getTarget() {
        return target;
    }

    public int getPayload() {
        return payload;
    }

    public String getLaunchCode() {
        return launchCode;
    }
}

// ICBM.java (Subclass)
public class ICBM extends Warhead {
    public ICBM(String target, int payload, String launchCode) {
        super(target, payload, launchCode);
    }

    @Override
    public void launch() {
        System.out.println("Launching ICBM with target: " + getTarget());
    }
}

// CruiseMissile.java (Subclass)
public class CruiseMissile extends Warhead {
    public CruiseMissile(String target, int payload, String launchCode) {
        super(target, payload, launchCode);
    }

    @Override
    public void launch() {
        System.out.println("Launching Cruise Missile with target: " + getTarget());
    }
}

// TacticalNuke.java (Subclass)
public class TacticalNuke extends Warhead {
    public TacticalNuke(String target, int payload, String launchCode) {
        super(target, payload, launchCode);
    }

    @Override
    public void launch() {
        System.out.println("Launching Tactical Nuke with target: " + getTarget());
    }
}

// AuthenticationMechanism.java (Interface)
public interface AuthenticationMechanism {
    boolean validateCredentials(String credentials);
    boolean authorizeLaunch();
}

// BiometricAuth.java (Implementation)
public class BiometricAuth implements AuthenticationMechanism {
    private String biometricData;

    public BiometricAuth(String biometricData) {
        this.biometricData = biometricData;
    }

    @Override
    public boolean validateCredentials(String credentials) {
        return biometricData.equals(credentials);
    }

    @Override
    public boolean authorizeLaunch() {
        return true; // Assume authorized
    }
}

// KeypadAuth.java (Implementation)
public class KeypadAuth implements AuthenticationMechanism {
    private String password;

    public KeypadAuth(String password) {
        this.password = password;
    }

    @Override
    public boolean validateCredentials(String credentials) {
        return password.equals(credentials);
    }

    @Override
    public boolean authorizeLaunch() {
        return true; // Assume authorized
    }
}

// LaunchSystem.java
import java.util.ArrayList;
import java.util.List;

public class LaunchSystem {
    private AuthenticationMechanism auth;
    private List<Warhead> warheads;
    private LaunchState state;

    public LaunchSystem(AuthenticationMechanism auth) {
        this.auth = auth;
        this.warheads = new ArrayList<>();
        this.state = new IdleState();
    }

    public void authorize() throws UnauthorizedAccessException {
        if (!auth.validateCredentials("retinaScan123")) {
            throw new UnauthorizedAccessException("Invalid credentials");
        }
        System.out.println("Authorization successful");
    }

    public void addWarhead(Warhead warhead) {
        warheads.add(warhead);
    }

    public void initiateLaunch() {
        state = new ReadyState();
        for (Warhead warhead : warheads) {
            warhead.launch();
        }
        state = new LaunchState();
    }

    private class IdleState implements LaunchState {
        @Override
        public void launch() {
            System.out.println("Launch system is idle");
        }
    }

    private class ReadyState implements LaunchState {
        @Override
        public void launch() {
            System.out.println("Launch system is ready");
        }
    }

    private class LaunchState implements LaunchState {
        @Override
        public void launch() {
            System.out.println("Launch initiated");
        }
    }

    private interface LaunchState {
        void launch();
    }
}

// UnauthorizedAccessException.java
public class UnauthorizedAccessException extends Exception {
    public UnauthorizedAccessException(String message) {
        super(message);
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        AuthenticationMechanism auth = new BiometricAuth("retinaScan123");
        Warhead icbm = new ICBM("NorthTarget", 1000, "NuclearPayload");
        LaunchSystem system = new LaunchSystem(auth);

        try {
            system.authorize();
            system.addWarhead(icbm);
            system.initiateLaunch();
        } catch (UnauthorizedAccessException e) {
            System.out.println("Launch aborted: Unauthorized access");
        }
    }
}


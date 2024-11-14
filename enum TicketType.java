enum TicketType {
    REGULAR(10),
    VIP(15),
    STUDENT(10 * 0.8), // 20% discount
    SENIOR(10 * 0.7);  // 30% discount

    private final double price;

    TicketType(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
class MovieTicket {
    private TicketType type;

    public MovieTicket(TicketType type) {
        this.type = type;
    }

    public double getTicketPrice() {
        return type.getPrice();
    }
}

public class Main {
    public static void main(String[] args) {
        MovieTicket regularTicket = new MovieTicket(TicketType.REGULAR);
        MovieTicket vipTicket = new MovieTicket(TicketType.VIP);
        MovieTicket studentTicket = new MovieTicket(TicketType.STUDENT);
        MovieTicket seniorTicket = new MovieTicket(TicketType.SENIOR);

        System.out.println("Regular Ticket Price: $" + regularTicket.getTicketPrice());
        System.out.println("VIP Ticket Price: $" + vipTicket.getTicketPrice());
        System.out.println("Student Ticket Price: $" + studentTicket.getTicketPrice());
        System.out.println("Senior Ticket Price: $" + seniorTicket.getTicketPrice());
    }
}

abstract class Car  
{  
//abstract method   
abstract void start();  
//non-abstract method  
public void stop()  
{  
System.out.println("The car engine is not started.");  
}  
}  
//inherit abstract class  
public class Owner extends Car  
{  
//defining the body of the abstract method of the abstract class  
void start()  
{  
System.out.println("The car engine has been started.");  
}  
public static void main(String[] args)  
{  
Owner obj = new Owner();  
//calling abstract method  
obj.start();  
//calling non-abstract method  
obj.stop();  
}  
}  
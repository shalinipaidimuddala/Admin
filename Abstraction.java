abstract class Demo  
{  
//abstract method  
abstract void display();  
}  
//extends the abstract class  
public class MainClass extends Demo  
{  
//defining the body of the method of the abstract class  
void display()  
{  
System.out.println("Abstract method called.");  
}  
public static void main(String[] args)  
{    
MainClass obj = new MainClass ();  
//invoking abstract method  
obj.display();  
}  
}  
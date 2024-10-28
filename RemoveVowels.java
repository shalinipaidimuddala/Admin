import java.utl.Scanner;
public class RemoveVowels{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter a string:");
String input=sc.nextLine();
String output=input.replaceAll("[aeiouAEIOU]","");
System.out.println("string after removing vowels:"+output);
sc.close();
}
}
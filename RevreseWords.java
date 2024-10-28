import java.util.Scanner{
public class ReverseWords{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a new line:");
String sentence = sc.nextLine();
String[]words=sentence.split(" ");
StringBuilder reverseSentence=new StringBuilder();
for(int i=words.length-1;i>=0;i--{
reverseSentence.append(words[i]).append(" ");
}
System.out.println("Reversesentence:" + reverseSentence.toString().trim());
sc.close();
}
}
import java.util.HashSet;
import java.util.Set;
public class PangramCheck{
public static void main(String[]args){
String sentence="The quick brown fox jumps over the lazy dog".toLowerCase();
Set<Character>letters=new HashSet<>();
for(char c:sentence.toCharArray()){
if(c>='a'&&c<='z'){
letters.add(c);
}
}
if(letters.size()==26){
System.out.println("The string is a pangram");
}else{
System.out.println("The string is not a pangram");
}
}
}
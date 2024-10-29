import java.util.HashMap;
import java.util.Map;
public class WordFrequency{
public static void main(String[]args){
String str="Java is awesome and java is fun";
String[]words=str.split(" ");
Map<String,Integer>wordCount=new HashMap<>();
for(String word:words){
wordcount.put(word,wordCount.getOrDefault(word,0)+1);
}
for(Map.Entry<String,Integer>entity:wordCount.entrySet()){
System.out.println(entry.getKey()+":"+entry.getValue());
}
}
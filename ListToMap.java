public class ListToMap{
public static void main(String[]args){
List<String>items=Arrays.asList("apple","banana");
Map<String,Integer>map=new HashMap<>();
for(String item:items){
map.put(item,item.length());
}
System.out.println(map);//output:{apple=5,banana=6}
}
}
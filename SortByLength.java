import java.util.Arrays;
import java.util.Comparator;
public class SortByLength{
public static void main(String[]args){
String[]arr={"Tech","Mahindra","is","awesome"};
Arrays.sort(arr,Comparator,comparingInt(String::length));
System.out.pritnln("sorted array by length:"+Arrays.toString(arr);
}
}
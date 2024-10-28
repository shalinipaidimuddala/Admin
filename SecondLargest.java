public class SecondLargest{
public static void main(String[]args){
int[]arr={5,1,9,7,3};
if(arr.length<2){
System.out.println("Array needs at least two elements"?);
return ;
}
int firstLargest=Integer.MIN_VALUE;
int secondLargest=Interger.MIN_VALUE;
for(int num:arr){
if(num>firstLargest){
secondLargest=firstLargest;
firstLargest=num;
}else if(num>secondLargest&& num!= firstLargest){
secondLargst=num;
}
}
if(secondLargest==Integer.MIN_VALUE){
System.out.println("There is no second largest element");
}else{
System.out.println("Second largest element is:
"+secondLargest);
}
}
}

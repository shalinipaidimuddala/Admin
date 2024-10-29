public class Fibonacci{
public static void main(String[]args){
int limit=10;
int a=0;int b=1;
while(a<=limit){
System.out.println(a+" ");
int next=a+b;
a=b;
b=next;
}
}
}

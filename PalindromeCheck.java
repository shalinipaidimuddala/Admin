public class PalindromeCheck{
public static void main(String[]args){
String str="madam";
Boolean isPalindrome=checkPalindrome(str);
System.out.println("is the string a palindrome?"+isPalindrome);
}
public static Boolean checkPalindrome(String str){
int left=0;
int right=str.length()-1;
while(left<right){
if(str.charAt(left)!=str.charAt(right)){
return false;
}
left++;
right--;
}
return tre;
}}
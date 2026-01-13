public class PalindromeCheck {
public static void main(String[] args) {
    String s="madaam";

    int left=0;
    int right=s.length()-1;

    boolean palindrome=true;

    while(left<right){
        if(s.charAt(left) != s.charAt(right)){
            palindrome=false;
            break;
        }
        left++;
        right--;
    }
   if(palindrome){
     System.out.println("string is palindrome " );
   }else{
 System.out.println("string is not palindrome");
   }
}
}

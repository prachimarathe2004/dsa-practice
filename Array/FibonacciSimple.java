
public class FibonacciSimple {
    public static void main(String[] args) {
        int n=6;

        int a=0,b=1;
      
        for(int i=2;i<=n;i++){
            int c=a+b;
            a=b;
            b=c;
        }
        System.out.println(n== 0 ? 0 : b);
    }
}

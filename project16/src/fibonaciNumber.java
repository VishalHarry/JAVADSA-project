public class fibonaciNumber {
    public static void main(String[] args) {
        int ans=fibo(6);
        System.out.println(ans);
    }
    //find the fibonaci number of the n th number
    static int fibo(int n){
        //base conditions
        if(n<2){
            return n;
        }
        //tail recursion(Which is the last recurision function)
        return fibo(n-1)+fibo(n-2);

    }
}

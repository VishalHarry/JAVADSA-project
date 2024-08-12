public class NUmberExampleRecussion {
    public static void main(String[] args) {
print(1);
    }
    static void print(int n){
        if(n>5){
            return;
        }
        System.out.println(n);
        //tail recursion(Which is the last recurision function)
        print(n+1);
    }
}

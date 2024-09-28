public class Question12 {
    public static void main(String[] args) {
        swap(12,10);
        swap1(12,10);
    }

    //swap

    static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a + " " + b);
    }

    static void swap1(int a,int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a + " " + b);
    }
}

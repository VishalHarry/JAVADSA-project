import java.util.Arrays;

public class variArgs {
    public static void main(String[] args) {
        fun(12,3,35,67,575,3,45,32,23,4,3);
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));

    }

}

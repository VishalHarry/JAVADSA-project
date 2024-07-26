public class scop {

    public static void main(String[] args) {
        int x=10;
        System.out.println(x);
        {
            x=80;
            System.out.println(x);
        }
        sum();

    }

    static void sum(){
        int x=20;
        System.out.println(x);
    }

}

public class shadowing {
     static int x=10;
    public static void main(String[] args) {
        System.out.println(x);//10 this will be shadow at line 6
        int x=12;
        System.out.println(x);//12
        num();
    }
    static void num(){
        System.out.println(x);//10
    }


}

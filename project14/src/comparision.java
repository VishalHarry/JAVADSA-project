import java.util.Arrays;



public class comparision {
    public static void main(String[] args) {
        String a="Vishal";
        String b="Vishal";
        String c=b;
        System.out.println(a.charAt(0));

        System.out.println(a + " " + b + " " + c );
        c="shiva";
        System.out.println(a + " " + b + " " + c );

        // ==
        System.out.println(a==b);//give true


        String name1=new String("Vishal");
        String name2=new String("Vishal");
        System.out.println(name1==name2); //give false







        //another example for better understanding about mutable and immutable
       int[] n={1,2,3,4,5};
       int[] v=n;
        System.out.println(Arrays.toString(v));
        v[1]=10;
        System.out.println(Arrays.toString(v));


      float t=1221.23231f;
        System.out.printf("%.2f",t);

        System.out.println(Math.PI);
        System.out.printf("Hello my name is %s and i am %s","Vishal" ,"cool");




    }
}

public class qouestion1 {
    public static void main(String[] args) {
    patern(4);
    }

    //        *
    //        * *
    //        * * *
    //        * * * *


    static void patern(int n){
        for(int i=1;i<=n;i++){
            //for every row run the colunm
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
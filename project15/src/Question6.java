public class Question6 {
    public static void main(String[] args) {
        patern(5);

    }
//              *
//              * *
//              * * *
//              * * * *
//              * * * * *

    static void patern(int n) {
        for (int i = 1; i <= n; i++) {
            //for every row run the colunm
            for (int j = 1; j <= n - i ; j++) {
                System.out.print(" ");
            }
            for (int j = n-i+1; j <= n ; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

    }

}

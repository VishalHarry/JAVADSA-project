public class Questio5 {
    public static void main(String[] args) {
        patern(5);
    }

//            *
//            * *
//            * * *
//            * * * *
//            * * * * *
//            * * * *
//            * * *
//            * *
//            *


    static void patern(int n) {
        for (int i = 0; i <2*n; i++) {
            //for every row run the colunm
            int totalColInRow=i>n ? 2*n-i : i;
            for (int j = 0; j < totalColInRow; j++) {
                System.out.print("* ");
            }



            System.out.println();

        }
    }

}

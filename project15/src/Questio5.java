public class Questio5 {
    public static void main(String[] args) {
        patern(5);
    }
    static void patern(int n) {
        for (int i = 0; i <2*n; i++) {
            //for every row run the colunm
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }



            System.out.println();

        }
    }

}

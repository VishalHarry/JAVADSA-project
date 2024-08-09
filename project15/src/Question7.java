public class Question7 {
    public static void main(String[] args) {
        patern(5);
    }

//                 1
//                212
//               32123
//              4321234

    static void patern(int n){
        for(int i=0;i<n;i++){
           //for col space
            for(int s=0;s<n-i;s++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
}

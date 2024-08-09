public class Question8 {
    public static void main(String[] args) {
        patern(5);
    }

//              1
//             212
//            32123
//           4321234
//          543212345
//           4321234
//            32123
//             212
//              1
    static void patern(int n){
        for(int i=1;i<= 2*n;i++){
            //for col space
            int c=i>n ? 2*n-i : i;
            for(int s=0;s<n-c;s++){
                System.out.print(" ");
            }
            for(int j=c;j>=1;j--){
                System.out.print(j);
            }
            for(int j=2;j<=c;j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
}

import java.util.Arrays;
import java.util.Scanner;
public class Array {

    public static void main(String[] args) {
        demo();

    }
    static void printarray(int[] arr){
        System.out.println(Arrays.toString(arr));
    }

    static void demo(){
//        Scanner in=new Scanner(System.in);
//        System.out.println("enter the size of the array");
//        int n=in.nextInt();
//        int[] arr=new int[n];
//        for(int i=0;i<arr.length;i++){
//            arr[i]=in.nextInt();
//        }
        int[] arr={1,2,3,4,5,6};
        System.out.println("original array ");
        printarray(arr);

        //try the copy the arr into new array
        int[] arr2=arr.clone();
        System.out.println("copied array ");
        printarray(arr2);

        //change the value of the array
        arr2[0]=0;
        arr2[1]=0;
        System.out.println("original array ");
        printarray(arr);
        System.out.println("copied array ");
        printarray(arr2);


//        int[] age=new int[5];
//        age[0]=1;
//        age[1]=2;
//        age[2]=3;
//        age[3]=4;
//        age[4]=5;
//        System.out.println(Arrays.toString(age));
//
//        String[] name={"vishal tomar","dev tomar","shiva tomar"};
//        for(String a: name){
//            System.out.println(a);
//        }

//        int[][] age={
//                {1,2,3,4},
//                {5,4,3},
//                {2,1}
//        };
//        for(int i=0;i<age.length;i++){
//            for(int j=0;j<age[i].length;j++){
//                System.out.print(age[i][j] + " ");
//            }
//            System.out.println();
//        }

    }
}

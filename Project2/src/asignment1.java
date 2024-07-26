import java.util.Scanner;

public class asignment1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int a=in.nextInt();
//        int b=in.nextInt();
//        int c=in.nextInt();
////        int ans1= max(a,b,c);
//        System.out.println("The maximum is:" + ans1);
//       int ans2= min(a,b,c);
//        System.out.println("The minimum is:" + ans2);
//        int ans=isOddEven(a);
//        System.out.println(ans);
//        eligible(a);
//        sum(a,b);
//        int ans =sum1(a,b);
//        System.out.println(ans);
//        System.out.println(area(a));
//        System.out.println(cic(a));
//        boolean ans=isPrime(a);
////        System.out.println(ans);
//          grade(a);
//        System.out.println(factorail(a));
//        System.out.println(pal(a));
//        System.out.println(isPythagoreanTriplate(a,b,c));
//        System.out.println(primeNum(a));
//        for(int i=100;i<1000;i++){
//            if(primeNum(i)){
//                System.out.println(i);
//            }
//        }
        System.out.println(sum2(a));



    }
    static int sum2(int n){
        int sum=0;
        for(int i=0;i<=n;i++){
            sum+=i;

        }
        return sum;
    }
    static boolean primeNum(int n){
        if(n<=1){
            return false;
        }
        int c=2;
        while(c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        if(c*c>n){
            return true;
        }
        else{
            return false;
        }
    }

    static boolean isPythagoreanTriplate(int a,int b,int c){
         if(a*a+b*b==c*c){
             return true;
         }
         else{
             return false;

         }


    }

    static boolean pal(int n){
        int orignal=n;
       int ans=0;
       while(n>0){
           int rem=n%10;
           ans=ans*10+rem;
           n=n/10;
       }
        return ans == orignal;


    }

    static int factorail(int n){
        if(n<=0){
            return 1;
        }
        int fact=1;
       for(int i=1;i<=n;i++){
           fact=fact*i;
       }
        return fact;
    }
    static void grade(int marks){


        if(marks>=91&&marks<=100){
            System.out.println("The grade is AA");
        }
        if(marks>=81&&marks<=90){
            System.out.println("The grade is AB");
        }
        if(marks>=71&&marks<=80){
            System.out.println("The grade is BB");
        }
        if(marks>=61&&marks<=70){
            System.out.println("The grade is BC");
        }
        if(marks>=51&&marks<=60){
            System.out.println("The grade is CD");
        }
        if(marks>=41&&marks<=50){
            System.out.println("The grade is DD");
        }
        if(marks<=40){
            System.out.println("Sorry boy/girl. please try again next time");
        }
        else{
            System.out.println("Invalid input");
        }



    }



    static boolean isPrime(int n){
        if(n<=1){
            return false;

        }
        int c=2;
        while(c*c<=n){
            if(n%c==0){
                return false;


            }
            c++;

        }
        return c * c > n;
    }

    static float area(int a){
        float pi=3.141f;
        float area=pi*a*a;
        return area;

    }
    static float cic(int a){
        float pi=3.141f;
        float circu=2f*pi*a;
        return circu;

    }
    static int sum1(int a,int b){
        return a*b;
    }
    static void sum(int a,int b){
        int ans=a+b;
        System.out.println(ans);
    }

    static void eligible(int age){
  if(age>=18){
      System.out.println("Yes! you are eligible for driving. Enjoy your Driving Life");
  }
  else{
      System.out.println("OOH soory!! you are not eligible for driving ");

        }
    }

    static int isOddEven(int a){
        if(a%2==0){
            System.out.println("The given number is even");
        }
        else{
            System.out.println("The given number is odd");
        }
        return 0;
    }


    static int max(int a,int b,int c){
        int max=a;
        if(b>max){
            max=b;

        }
         if(c>max){
            max=c;

        }
        return max;
    }
    static int min(int a,int b,int c){
        int min=0;
        if(a<b){
            min=a;
        }
        else{
            min=b;
        }
        if(c<min){
            min=c;
        }
        return min;
    }



}

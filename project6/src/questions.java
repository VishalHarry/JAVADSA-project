public class questions {
    public static void main(String[] args) {
     int[] arr={12,3,6,1234};
     int ans=evenDigit(arr);
        System.out.println(ans);

    }
    //how many number contain even digit
    static int evenDigit(int[] nums){
        int count =0;
        for (int num:nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
   //function for check wether the number  contain the even digit//

    static boolean even(int num){
        int numOfDigit=digit(num);
        if(numOfDigit%2==0){
           return true;
        }
        return false;
    }
    static int digit(int num){
        int count =0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count;

    }


}

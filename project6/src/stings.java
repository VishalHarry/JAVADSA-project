public class stings {
    public static void main(String[] args) {
    String str="Vishaltomar";
    char target='o';
    boolean ans=search(str,target);
        System.out.println(ans);
    }
    static boolean search(String str,char target){
        if(str.length()==0){
            return false;
        }
        for(int i=0;i<str.length();i++){
            char element=str.charAt(i);
            if(element==target){
                return true;
            }

        }
        return false;

    }

}

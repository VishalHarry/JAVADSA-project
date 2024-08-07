public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder builder=new StringBuilder();
        for(int i=0;i<26;i++){

            char ch=(char)('a'+ i);
            System.out.println(ch);
           builder.append(ch);//this is mulable like array

        }
        System.out.println(builder);
    }
}

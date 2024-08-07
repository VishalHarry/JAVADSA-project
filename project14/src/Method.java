import java.util.Arrays;

public class Method {
    public static void main(String[] args) {
        String name="    Vishal tomar";
        System.out.println(name.strip());
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.indent('a'));
        System.out.println(name.split(" "));
        

    }
}

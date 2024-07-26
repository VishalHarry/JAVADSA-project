
import java.util.Scanner;
public class Switch {

    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);

       int id=in.nextInt();
       String depart=in.next();
       switch(id){
           case 1:
               System.out.println("VIshal");
               break;
           case 2:
               System.out.println("Dev");
               break;
           case 3:
               switch(depart){
                   case "It":
                       System.out.println("IT departmaent");
                       break;
                   case "MAnagement":
                       System.out.println("Managements departments");
                       break;
                   default:
                       System.out.println("NO department");

               }
               break;
           default:
               System.out.println("Not ID is real");

       }
//       String fruit=in.next();
//        switch (fruit) {
//            case "Mango" -> System.out.println("King of the fruits");
//            case "Apple" -> System.out.println("The red and sweete");
//            default -> System.out.println("KIng not found");
//        }
    }
}

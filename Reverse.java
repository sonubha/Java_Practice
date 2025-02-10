
import java.util.Scanner;




public class Reverse {

    public static void result(StringBuilder sb){
 sb.reverse();  
        System.out.println("Reversed String: " + sb);

}
    public static void main(String[] args) {


Scanner SC =new Scanner(System.in);
System.out.println("Enter a sentence:");
StringBuilder sb=new StringBuilder(SC.nextLine());


result(sb);


    }
}

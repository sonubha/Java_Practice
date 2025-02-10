import java.util.Scanner;

public class Factorial {

public static void Fact(int n){
int result=1;
for (int i = n; i >= 1; i--){
    result=result*i;



}
System.out.println("Factorial of " + n + " is: " + result);

}


public static void main(String[] args) {
Scanner sn = new Scanner(System.in);
System.out.println("Enter the number for factorial");

        int num = sn.nextInt();
if(num==0){
    System.out.println("enter number greaten than 0");
    
}
else{
    Fact(num);
    
}



    }
}
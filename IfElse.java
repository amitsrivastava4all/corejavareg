import java.util.Scanner;

class IfElse{

    public static void main(String[] args) {
        int a ;
        int b ;
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Enter the First Number");
        a = scanner.nextInt(); //nextXXX();
        System.out.println("Enter the Second Number");
        b = scanner.nextInt();
        scanner.nextLine();
        scanner.close();
        scanner = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = scanner.nextLine();
        System.out.println("Name is "+name);
        if(a>b){
                System.out.println("A is Greater");
        }
        else{
            System.out.println("B is Greater");
        }
        
        // while(true){

        // }
    }
}
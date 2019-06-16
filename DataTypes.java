/*class BO{
    void recData(User user){

    }
    void recData(int id , char name[], char gender, 
    char[] city, char []phone, course, duration , mail,){

    }
}
class User{
    id, name, gender, city, phone, 
}*/
import java.math.BigDecimal;
import java.math.BigInteger;
strictfp class DataTypes{
    public  static void main(String args[]){
        
        int k1 = 1000;
        String.valueOf(k1);
        short s2 = (short) k1;
        double tt  = k1;
        String a = "Ram";
        Integer s = 1000;
        byte qq = s.byteValue();  // xxxValue()
        double w1 = s.doubleValue();
        Strinng h1  = s.toString();
        BigDecimal bb = new BigDecimal("1244548843.992");
        String name = "Amit";
        BigInteger bg = new BigInteger("1000000000");
        BigInteger bg2 = new BigInteger("12000000000");
        BigInteger bg3  = bg.add(bg2);
        System.out.println("Sum is "+bg3);
        
        boolean flag = true; //1 , 2 , 4 byte
        char w4 = 'A'; // 2 Byte
        long w11 = 10000L; // 8 Byte
        float w2 = 90.20F; // 4 Byte
        double w3 = 90.12;  // 8 Byte

        short q = 100; //2 byte
        int w = 100000; // 4 byte
        byte x = 10; // 1 Byte 
        x = (byte)130;
        System.out.println("X is "+x);
        byte a = 100;
        byte b = 100;
        b+=a; // Arithmetic Assignment Operator
        // += -= *= /=
        //b =(byte) (b + a);
        byte c = (byte)(a+b);
        //byte c = a + b;
        System.out.println("Sum is "+b);


    }
}
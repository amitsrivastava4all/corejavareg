

class MyClass{

}
class Data{
    public static void main(String[] args) {
        MyClass cls = new MyClass();
        String msg1 = "Welcome User";
        String msg2 = "Welcome User";
        String msg3 = "Welcome User";
        String msg4 = "Welcome User";
        String msg5 = "Welcome User";
        String msg6 = "Welcome User";
        System.out.println(msg1==msg6);
        msg6 = "Bye User";
        System.out.println(msg1==msg6);
        System.out.println("#############################");
        // ClassName@
        // MyClass@HashCode(HexaDecimal)
        System.out.println(cls.toString());
        String name = "Amit".intern();  // 1  or 0
        String name2 = "Amit".intern();
        String name3 = new String("Amit").intern(); // 2 or 1
        System.out.println(name==name2); //true
        System.out.println(name==name3);
        System.out.println("*************************");

        int x1 = 10;
        int y1 = 10;
        System.out.println(x1==y1); //true
        System.out.println(name);
        System.out.println(name.toString());

        boolean flag = true;
        char tt = 'A';
        String str = "नमस्ते"; // char []
        int x =100000;
        long w = 123L;
        float q1 = 90.20f;
        double q2 = 90.44;
        byte q = (byte)130;
        System.out.println(str);

    }
}
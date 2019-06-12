class StringRef{
    public static void main(String args[]){
        int x= 100;
        int y = 100;
        System.out.println(x==y);

        String name = "Amit";
        String name3 = "Amit";
        String name2 = new String("Amit");
        System.out.println(name==name3);
        System.out.println(name==name2);
    }
}
class Add{
    //static int count;
    public static void main(int x){
        System.out.println("My Main Method");
    }
   static public  void main(String args[]){
       int sum = 0;
       for(int i = 0; i<args.length; i++){
        sum+=Integer.parseInt(args[i]);
       }
       System.out.println("Sum is "+sum);
      /* if(args.length==2){
    int a=Integer.parseInt(args[0]);
    int b=Integer.parseInt(args[1]);
    int c = a + b;
   // main(10);    
    System.out.println("Sum is "+c);
       }*/
    }

}
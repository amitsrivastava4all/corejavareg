public class FirstClass{
    static public  void main(String []arr){
        //int a = 100;
        //int b = 200;
        long rr = 10000;
        int w = (int)rr;  // Type casting
        //int a = Integer.parseInt(arr[0]);
       // int b = Integer.parseInt(arr[1]);
      //  int c= a + b;
      int c=0;
    //   if(arr.length==0){
    //     System.out.println(c);
    //     return ;
    //   }
    if(arr.length>0){
      for(int i = 0 ; i<arr.length; i++){
        c = c + Integer.parseInt(arr[i]);
      }
    }
        System.out.println("Sum is "+c);
    }
}
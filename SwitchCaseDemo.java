class SwitchCaseDemo{
    public static void main(String[] args) {
        outer:
        for(int i = 1; i<=3; i++){
            for(int j = 1; j<=3; j++){
                if(i==j){
                    //break;
                    continue outer;
                }
                System.out.println("I is "+i+" and J is "+j);
            }
        }
        System.out.println("############################");
        int a[] = {10,20,30,40,50};
        for(int x : a){
            System.out.println(x);
        }
        System.out.println("*****************************");
        // for(int i = 0 ; i<a.length; i++){
        //     System.out.println(a[i]);
        // }
        //int b [][] = new int [3][5];
       // int [][]b = new int [3][5];
       //int []b[] = new int [3][5];
       int [][]b = new int [3][];
       b[0] = new int[10];
       b[1] = new int[20];
       b[2] = new int[30];
       b[2][1] = 1;
       b[2][2] = 1;
        //int b[][] ={{10,20,30},{40,50,60},{70,80,90}};
       for(int x[]:b){
        for(int y:x){
            System.out.print(y+" ");
        }
        System.out.println();
       }
        /*for(int i = 0 ; i<b.length; i++){
            for(int j = 0;j<b[i].length; j++){
                System.out.print(b[i][j]+"  ");
            }
           System.out.println();
        } */
        int j = 1;
        for(;j<=10;){
            if(j<5){
                j++;
            }
            else{
                j+=2;
            }
        }
        for(int i = 1; i<=10; i++){

        }
        // while(true){

        // }
        int i = 1;
        while(i<=10){
                if(i<5){
                    i++;
                }
                else{
                    i+=2;
                }
        }
        // do{

        // }while(true);
        //int day = 1;
        String day = "sunday";

        final int SUNDAY = 1;
        final int MONDAY = 2;
       switch(day){
            case "sunday":
                System.out.println("");
                break;
            case "monday":
                System.out.println("");
                break;
            case "t":
            System.out.println("");
            break;
            default:
            System.out.println("");
            break;       
       } 
    }
}
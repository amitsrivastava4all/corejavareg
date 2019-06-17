import java.util.Scanner;

//import java.lang.*;

class ScannerDemo{
    public static void main(String[] args) {
        
       Scanner scanner = new Scanner("Hello how are You\n I am good\n Hi There");
       int wordCount = 0;
       int lineCount = 0;
       while(scanner.hasNext()){
           String line = scanner.nextLine();
           lineCount++;
           System.out.println(line.trim());
          // String word = scanner.next();

        //    if(word.toUpperCase().startsWith("H")  ){
        //     wordCount++;
        //    }
           // current and move to next
          // System.out.println("Word is "+word);
       }
       System.out.println(lineCount);
      // System.out.println(wordCount); 
    }
}
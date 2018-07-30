import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class InputFromKeyboard {



    public static void main(String[] args) {

        System.out.println("ENTER MARKS");

        Scanner input = new Scanner(System.in);
        int marks = input.nextInt();





        if(marks>=70&&marks<=100){
            System.out.println("EXCELENT");
        }
         else if(marks>=60&&marks<=70){
            System.out.println("GOOD");
        }
          else if (marks>=50 && marks<=60){
            System.out.println("FAIR");
        }
        else if(marks>=40 && marks<=50) {
            System.out.println("WORK HARDER");
        }
        else if(marks<40 && marks>=0){
            System.out.println("COME SEE ME FOR ASSISTANCE");
        }
             else{
            System.out.println("ENTER VALID MARKS");
        }


    }
}

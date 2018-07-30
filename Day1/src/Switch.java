import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        System.out.println("ENTER GRADE");
        Scanner input = new Scanner(System.in);
        String grade = input.nextLine();

        switch (grade) {
            case "A":
                System.out.println("EXCELENT");
                break;




            case "B":

                System.out.println("GOOD");
                break;

            case "C":

                System.out.println("FAIR");
                break;

             case "D":

                System.out.println("WORK HARDER");
                 break;

            case "E":

                System.out.println("COME SEE ME FOR ASSISTANCE");
                break;

            default:
                System.out.println("ENTER VALID GRADE");
            }
        }


    }

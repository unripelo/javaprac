import java.util.Scanner;

public class daynight {
    public static int getMinutes (int time) {

        switch (time) {
            case 1: 
                return 1140;
            case 7:
                return 10080;
            case 14:
                return 36000;
            case 32:
                return 46080;
            default:
                return -1;
        }
    }


     public static void main(String[]argts) {
       Scanner scan = new Scanner( System.in);

       System.out.println("Input day(s): ");
       int time = scan.nextInt();
       scan.close();
       int min = getMinutes(time); 

       System.out.println(min + " minutes");
    }
}


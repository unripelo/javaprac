import java.util.Scanner;

public class light {
    public static int getlumens (int watts) {

        switch (watts) {
            case 15: 
                return 125;
            case 25:
                return 215;
            case 40:
                return 500;
            case 60:
                return 880;
            case 75:
                return 1000;
            case 100:
                return 1675;
            default:
                return -1;
        }
    }

    public static void main(String[]argts) {
       Scanner scan = new Scanner( System.in);

       System.out.println("Input watts: ");
       int watts = scan.nextInt();
       scan.close();
       int bulb = getlumens(watts); 

       System.out.println("Lumens is: "+ bulb);
    }
}


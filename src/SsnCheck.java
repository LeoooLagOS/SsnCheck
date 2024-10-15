import java.util.Scanner;

public class SsnCheck{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ssn;
        ssn = getSsn(in);
        if (validSsn(ssn))
            System.out.println(ssn + " is a valid SSN");
        else
            System.out.println("Not a valid SSN, must be in format of (999-99-9999)");
        in.close();
    }

    static boolean validSsn(String ssn){
        return ssn.matches("[0-9]{3}-[0-9]{2}-[0-9]{4}");
    }

    private static String getSsn(Scanner in){
        System.out.println("Please enter your Social Security Number: ");
        return in.next();
    }
}
import java.util.Scanner;

public class MonthOfYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December" };
        while (true) {
            System.out.print("Enter month's number or 0 to exit: ");
            int month = scanner.nextInt();
            if (month == 0) {
                break;
            }
            if (month >= 1 && month <= 12) {
                System.out.println(months[month - 1]);
            } else {
                System.out.println("Invalid month");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {

        String title = "Виробничий процес WPT";

        int engineer_1 = 8, engineer_2 = 12, engineer_3 = 4;

        float total_days = engineer_1 + engineer_2 + engineer_3;

        float average_day = (total_days / 3);

        String result = "%n%s" +
                "%nEngineer 1 works: %d days.%n" +
                "Engineer 2 works: %d days.%n" +
                "Engineer 3 works: %d days.%n" +
                "All engineers work: %.2f days.%n" +
                "Average working days: %.2f%n%n.";

        System.out.printf(result, title, engineer_1, engineer_2, engineer_3, total_days, average_day);
    }
}
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter hero name: ");
        String heroName = scanner.nextLine();
        System.out.print("Enter hero accumulated experience: ");
        int heroXp = scanner.nextInt();

        String level;
        if (heroXp <= 1000) {
            level = "Iron";
        } else if (heroXp <= 2000) {
            level = "Bronze";
        } else if (heroXp <= 5000) {
            level = "Silver";
        } else if (heroXp <= 7000) {
            level = "Gold";
        } else if (heroXp <= 8000) {
            level = "Platinum";
        } else if (heroXp <= 9000) {
            level = "Ascendant";
        } else if (heroXp <= 10000) {
            level = "Immortal";
        } else {
            level = "Radiant";
        }

        System.out.printf("The hero named %s is at the %s level.", heroName, level);
        System.out.println();
        scanner.close();
    }
}

package OppsAssignment;
import java.util.Scanner;
class Video {
    String name;
    boolean isCheckedOut;
    int rating;
    Video(String name) {
        this.name = name;
        this.isCheckedOut = false;
        this.rating = 0;
    }
    void checkOut() {
        isCheckedOut = true;
    }
    void returnVideo() {
        isCheckedOut = false;
    }
    void giveRating(int r) {
        rating = r;
    }
    void showDetails() {
        System.out.println(name + " | " + isCheckedOut + " | " + rating);
    }
}
public class VideoRentalSystem {
    static Video[] videos = new Video[10];
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n--- VIDEO RENTAL MENU ---");
            System.out.println("1. Add Video");
            System.out.println("2. Check Out Video");
            System.out.println("3. Return Video");
            System.out.println("4. Give Rating");
            System.out.println("5. Show Inventory");
            System.out.println("6. Exit");
            System.out.print("Enter choice ");
            choice = sc.nextInt();
            sc.nextLine();
            if (choice == 1) {
                System.out.print("Enter video name ");
                String name = sc.nextLine();
                videos[count] = new Video(name);
                count++;
                System.out.println("Video added.");
            } else if (choice == 2) {
                System.out.print("Enter video name to check out:");
                String name = sc.nextLine();
                for (int i = 0; i < count; i++) {
                    if (videos[i].name.equalsIgnoreCase(name)) {
                        videos[i].checkOut();
                        System.out.println("Checked out successfully.");
                    }
                }
            } else if (choice == 3) {
                System.out.print("Enter video name to return ");
                String name = sc.nextLine();
                for (int i = 0; i < count; i++) {
                    if (videos[i].name.equalsIgnoreCase(name)) {
                        videos[i].returnVideo();
                        System.out.println("Returned successfully.");
                    }
                }
            } else if (choice == 4) {
                System.out.print("Enter video name:");
                String name = sc.nextLine();
                System.out.print("Enter rating(1-10):");
                int rate = sc.nextInt();
                for (int i = 0; i < count; i++) {
                    if (videos[i].name.equalsIgnoreCase(name)) {
                        videos[i].giveRating(rate);
                        System.out.println("Rating added.");
                    }
                }
            } else if (choice == 5) {
                System.out.println("\n--- INVENTORY ---");
                System.out.println("Name|Checked Out|Rating");
                for (int i = 0; i < count; i++) {
                    videos[i].showDetails();
                }
            } else if (choice == 6) {
                System.out.println("Thanks for using!");
            } else {
                System.out.println("Invalid choice.");
            }

        } while (choice!= 6);

        sc.close();
    }
}

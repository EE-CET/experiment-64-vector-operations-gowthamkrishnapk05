import java.util.Scanner;
import java.util.Vector;

public class StudentVectorMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<String> students = new Vector<>();

        while (true) {
            int choice = sc.nextInt();

            switch (choice) {
                case 1: // Add student
                    String nameAdd = sc.next();
                    students.add(nameAdd);
                    System.out.println("Added");
                    break;

                case 2: // Insert at index (1-based)
                    String nameInsert = sc.next();
                    int index = sc.nextInt();

                    if (index >= 1 && index <= students.size() + 1) {
                        students.add(index - 1, nameInsert); // convert to 0-based
                        System.out.println("Inserted");
                    }
                    break;

                case 3: // Remove student
                    String nameRemove = sc.next();
                    if (students.remove(nameRemove)) {
                        System.out.println("Removed");
                    }
                    break;

                case 4: // Display
                    System.out.println(students);
                    break;

                case 5: // Exit
                    sc.close();
                    return;
            }
        }
    }
}
import java.util.Scanner;

public class TaskManagementDemo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Insert at Begin\n2. Insert at End\n3. Insert at Position\n4. Delete at Position\n5. Display\n6. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task ID: ");
                    int id1 = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter task name: ");
                    String name1 = sc.nextLine();
                    System.out.print("Enter status: ");
                    String status1 = sc.nextLine();
                    Task task1 = new Task.Builder()
                            .setTaskId(id1)
                            .setTaskName(name1)
                            .setStatus(status1)
                            .build();
                    list.insertAtBegin(task1);
                    break;
                case 2:
                    System.out.print("Enter task ID: ");
                    int id2 = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter task name: ");
                    String name2 = sc.nextLine();
                    System.out.print("Enter status: ");
                    String status2 = sc.nextLine();
                    Task task2 = new Task.Builder()
                            .setTaskId(id2)
                            .setTaskName(name2)
                            .setStatus(status2)
                            .build();
                    list.insertAtEnd(task2);
                    break;
                case 3:
                    System.out.print("Enter task ID: ");
                    int id3 = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter task name: ");
                    String name3 = sc.nextLine();
                    System.out.print("Enter status: ");
                    String status3 = sc.nextLine();
                    System.out.print("Enter position (starting from 0): ");
                    int pos = sc.nextInt();
                    Task task3 = new Task.Builder()
                            .setTaskId(id3)
                            .setTaskName(name3)
                            .setStatus(status3)
                            .build();
                    list.insertAtPos(task3, pos);
                    break;
                case 4:
                    System.out.print("Enter position to delete (starting from 0): ");
                    int delPos = sc.nextInt();
                    list.deleteAtPos(delPos);
                    break;
                case 5:
                    list.display();
                    break;
                case 6:
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
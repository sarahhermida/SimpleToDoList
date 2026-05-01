import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
   static ArrayList<String> tasks = new ArrayList<>();
   
   public static void printMenu(){
    System.out.println("");
    System.out.println("1. Add a task");
    System.out.println("2. View tasks");
    System.out.println("3. Delete task");
    System.out.println("4. Exit");
   }
   
   public static void printTasks(){
    int userIndex = 1;
   
    if (tasks.size() == 0){
        System.out.println("You have no tasks!");
        return;
    }
    
    for (int i = 0; i < tasks.size(); i++ ){
        System.out.println(userIndex + ". "+ tasks.get(i));
        userIndex++;
    }
   }
   
    public static void addTask(String task){
        tasks.add(task);
        System.out.println("Task Added!");
    }

    public static void deleteTask(int userIndex){
        int arrayIndex = userIndex - 1;

        if (arrayIndex >= tasks.size()){
            System.out.println("Invalid index");
            return;
        }

        tasks.remove(arrayIndex);
        System.out.println("Task Deleted!");
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        int selection;

        System.out.println("This is your personal To Do List!");
     
       
        while(!quit){
            printMenu();
            System.out.println("Enter selection:");
            selection = Integer.parseInt(sc.nextLine());

            switch (selection){
                
                //Add a Task
                case 1:
                    System.out.println("");
                    System.out.println("Enter the task:");
                    String task = sc.nextLine();
                    addTask(task);
                    break;
                
                //View Tasks
                case 2: 
                    System.out.println("");
                    System.out.println("==== Your Tasks ====");
                    printTasks();
                    break;

                //Delete a Task 
                case 3: 
                System.out.println("");
                System.out.println("Here are the list of tasks:");
                printTasks();
                System.out.println("Enter the number of the task you wish to be deleted:");
                int userIndex = Integer.parseInt(sc.nextLine());
                deleteTask(userIndex);
                break;

                //Exit
                case 4:
                    System.out.println("");
                    System.out.println("Exiting program...");
                    quit = true;
                    break;
                
                default:
                    break;
            }

        }
        sc.close();
    }
}

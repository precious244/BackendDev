import java.util.ArrayList;
import java.util.Scanner;

public class DigiJobs {

    public static void main(String[] args) {

        ArrayList<String> job_id = new ArrayList<>();
        ArrayList<String> job_address = new ArrayList<>();
        ArrayList<String> job_position_id = new ArrayList<>();
        ArrayList<String> job_position_name = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        int choose;

        do {
            System.out.println("==========DIGIJOBS========");
            System.out.println("Please choose following command :");

            System.out.println("1. Add new job");
            System.out.println("2. Print all jobs");
            System.out.println("3. Delete job");
            System.out.println("4. Exit");

            System.out.print("What menu do you want to choose?");
            choose = input.nextInt();

            if (choose == 1) {
                System.out.println("Please input new job using following format : [job_id], [job_address], [job_position_id], [job_position_name]");
                System.out.println("Job_id :");
                String Job_id = input.next();
                job_id.add(Job_id);

                System.out.println("Job_address :");
                String Job_address = input.next();
                job_address.add(Job_address);

                System.out.println("Job_position_id :");
                String Job_position_id = input.next();
                job_position_id.add(Job_position_id);

                System.out.println("Job_position_name :");
                String Job_position_name = input.next();
                job_position_name.add(Job_position_name);
            }
            else if (choose == 2) {

                System.out.println("\nAll Jobs Id: ");
                for (int i = 0; i < job_id.size(); i++) {
                    System.out.println(i + 1 + "." + job_id.get(i));
                }

                System.out.print("Please input job id you want to print : ");
                int looking = input.nextInt();
                if (looking == 1) {
                    System.out.println("\nJob_id : " + job_id.get(0));
                    System.out.println("Job_address : " + job_address.get(0));
                    System.out.println("Job_position_id : " + job_position_id.get(0));
                    System.out.println("Job_position_name : " + job_position_name.get(0));
                } else if (looking == 2) {
                    System.out.println("\nJob_id : " + job_id.get(1));
                    System.out.println("Job_address : " + job_address.get(1));
                    System.out.println("Job_position_id : " + job_position_id.get(1));
                    System.out.println("Job_position_name : " + job_position_name.get(1));
                } else if (looking == 3) {
                    System.out.println("\nJob_id : " + job_id.get(2));
                    System.out.println("Job_address : " + job_address.get(2));
                    System.out.println("Job_position_id : " + job_position_id.get(2));
                    System.out.println("Job_position_name : " + job_position_name.get(2));
                } else if (looking == 4) {
                    System.out.println("\nJob_id : " + job_id.get(3));
                    System.out.println("Job_address : " + job_address.get(3));
                    System.out.println("Job_position_id : " + job_position_id.get(3));
                    System.out.println("Job_position_name : " + job_position_name.get(3));
                } else if (looking == 5) {
                    System.out.println("\nJob_id : " + job_id.get(4));
                    System.out.println("Job_address : " + job_address.get(4));
                    System.out.println("Job_position_id : " + job_position_id.get(4));
                    System.out.println("Job_position_name : " + job_position_name.get(4));
                } else {
                    System.err.println("job not found!");
                }
            }

            else if (choose == 3) {

                System.out.print("\nPlease input job_id to delete: ");
                String Job_id = input.next();
                job_id.remove(Job_id);
            }
            else if (choose == 4) {
                System.out.println("Thank you");
            }

            else {
                System.err.println("Menu is not available!");
            }

        } while (choose != 4);

    }
}

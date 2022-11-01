import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> jobId = new ArrayList<>();
        ArrayList<String> jobAddress = new ArrayList<>();
        ArrayList<Integer> jobPositionId = new ArrayList<>();
        ArrayList<String> jobPositionName = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\n=====DIGIJOBS=====");
            System.out.println("1. Add new job");
            System.out.println("2. Print all jobs");
            System.out.println("3. Delete Job");
            System.out.println("4. Exit\n");

            System.out.print("Pilih : ");
            pilih = input.nextInt();

            if (pilih == 1) {
                System.out.print("Job id : ");
                Integer JobId = input.nextInt();
                jobId.add(JobId);

                System.out.print("Job address : ");
                String JobAddress = input.next();
                jobAddress.add(JobAddress);

                System.out.print("Job position id : ");
                Integer JobPositionId = input.nextInt();
                jobPositionId.add(JobPositionId);

                System.out.print("Job position name : ");
                String JobPositionName = input.next();
                jobPositionName.add(JobPositionName);

            } else if (pilih == 2) {
                System.out.println("All Jobs");
                for (int i = 0; i < jobId.size(); i++) {
                    System.out.println(i + 1 + ". " + jobId.get(i) + ", " + jobAddress.get(i) + ", " + jobPositionId.get(i) + ", " + jobPositionName.get(i) );
                }
            } else if (pilih == 3) {
                System.out.print("Masukan id untuk menghapus data : ");
                Integer JobId = input.nextInt();
                jobId.remove(JobId);
            }

        } while (pilih != 4);
    }
}
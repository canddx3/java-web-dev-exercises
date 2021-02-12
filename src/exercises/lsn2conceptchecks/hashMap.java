package exercises.lsn2conceptchecks;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hashMap {
        public static void main(String[] args) {
            Map<Integer, String> studId = new HashMap<>();
            Scanner input = new Scanner(System.in);
            String newStudent;

            // Get student ID and names
            do {
                System.out.println("Student Name: ");
                newStudent = input.nextLine();

                if (!newStudent.equals("")) {
                    System.out.println("Student ID: ");
                    Integer newId = input.nextInt();
                    studId.put(newId, newStudent);
                }
                    // Read in the newline before looping back
                    input.nextLine();

            } while(!newStudent.equals(""));
                // Print class roster
                System.out.println("\nClass roster:");
                for (Map.Entry<Integer, String> stud : studId.entrySet()) {
                    System.out.println("Student Id: " + stud.getKey() + " " + "Student Name: " + stud.getValue());
                }
            System.out.println("Class Size: " + studId.size());
            }
        }


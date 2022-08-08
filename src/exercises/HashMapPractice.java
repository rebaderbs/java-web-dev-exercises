package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main (String[] args) {
        HashMap<Integer, String> classRoster = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your student name and ID number:");

        do {
            System.out.print("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("ID: ");
                Integer idNumber = input.nextInt();
                classRoster.put(idNumber, newStudent);

                input.nextLine();
            }
        } while(!newStudent.equals(""));

        input.close();

        System.out.println("\nClass roster:");
//        int total = 0;

        for (Map.Entry<Integer, String> student : classRoster.entrySet())  {
            System.out.println(student.getValue() + "'s ID: " + student.getKey());
//            int total += student.getValue();
        }

//        int classTotal = total;
        System.out.println("Class size: " + classRoster.size());

    }

}

//    Make a program similar to GradebookHashMap that does the following:
//
//        It takes in student names and ID numbers (as integers) instead of names and grades.
//        The keys should be the IDs and the values should be the names.
//        Modify the roster printing code accordingly.

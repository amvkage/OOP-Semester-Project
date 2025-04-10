import java.util.Scanner;
import java.time.LocalDate;

public class UniversityExaminationProcessing {
    static final int NUMBER_OF_STUDENTS = 20;
    static final int NUMBER_OF_SUBJECTS = 5;
    static final String[] SUBJECTS = {"OOP", "Calculus I", "Database Systems", "Web Application Development", "Data Structures and Algorithms"};

    static String[] studentNames = new String[NUMBER_OF_STUDENTS];
    static String[] studentIDs = new String[NUMBER_OF_STUDENTS];
    static int[][] scores = new int[NUMBER_OF_STUDENTS][NUMBER_OF_SUBJECTS];
    static double[] averages = new double[NUMBER_OF_STUDENTS];
    static String[] grades = new String[NUMBER_OF_STUDENTS];
    static String[] recommendations = new String[NUMBER_OF_STUDENTS];

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        readStudentDetails(input);
        readScores(input);
        calculateAveragesAndGrades();
        displayReportCards();

        input.close();
    }

    static void readStudentDetails(Scanner input) {
        for (int i = 0; i < NUMBER_OF_STUDENTS; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            studentNames[i] = input.nextLine();

            System.out.print("Enter ID of student " + (i + 1) + ": ");
            studentIDs[i] = input.nextLine();
        }
    }

    static void readScores(Scanner input) {
        for (int i = 0; i < NUMBER_OF_STUDENTS; i++) {
            System.out.println("\nEnter scores for " + studentNames[i] + ":");
            for (int j = 0; j < NUMBER_OF_SUBJECTS; j++) {
                System.out.print(SUBJECTS[j] + ": ");
                scores[i][j] = input.nextInt();
            }
            input.nextLine(); // clear newline
        }
    }

    static void calculateAveragesAndGrades() {
        for (int i = 0; i < NUMBER_OF_STUDENTS; i++) {
            int sum = 0;
            for (int j = 0; j < NUMBER_OF_SUBJECTS; j++) {
                sum += scores[i][j];
            }
            averages[i] = sum / (double) NUMBER_OF_SUBJECTS;

            // Sample grading system
            if (averages[i] >= 70) {
                grades[i] = "A";
                recommendations[i] = "Excellent";
            } else if (averages[i] >= 60) {
                grades[i] = "A-";
                recommendations[i] = "Good";
            } else if (averages[i] >= 50) {
                grades[i] = "B";
                recommendations[i] = "Satisfactory";
            } else if (averages[i] >= 40) {
                grades[i] = "C";
                recommendations[i] = "Pass";
            } else {
                grades[i] = "F";
                recommendations[i] = "Fail";
            }
        }
    }

    static void displayReportCards() {
        LocalDate today = LocalDate.now();

        for (int i = 0; i < NUMBER_OF_STUDENTS; i++) {
            System.out.println("\n---------------- REPORT CARD ----------------");
            System.out.println("Date: " + today);
            System.out.println("Name: " + studentNames[i]);
            System.out.println("ID: " + studentIDs[i]);
            System.out.println("Subjects and Scores:");
            for (int j = 0; j < NUMBER_OF_SUBJECTS; j++) {
                System.out.println("  " + SUBJECTS[j] + ": " + scores[i][j]);
            }
            System.out.printf("Average Score: %.2f\n", averages[i]);
            System.out.println("Grade: " + grades[i]);
            System.out.println("Recommendation: " + recommendations[i]);
            System.out.println("---------------------------------------------");
        }
    }
}

public class ResultManager {

    // Calculate total marks
    public static int calculateTotal(int[] marks) {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return sum;
    }

    // Calculate average marks
    public static double calculateAverage(int[] marks) {
        int total = calculateTotal(marks);
        return (double) total / marks.length;
    }

    // Assign grade based on average
    public static String assignGrade(double average) {
        if (average >= 90) return "A+";
        else if (average >= 80) return "A";
        else if (average >= 70) return "B";
        else if (average >= 60) return "C";
        else if (average >= 50) return "D";
        else return "F";
    }

    // Print the result card
    public static void printResultCard(Student student) {
        int total = calculateTotal(student.getMarks());
        double avg = calculateAverage(student.getMarks());
        String grade = assignGrade(avg);
        int maxMarks = student.getMarks().length * 100;

        System.out.println("Student: " + student.getName());
        System.out.println("Total Marks: " + total + "/" + maxMarks);
        System.out.println("Average: " + avg);
        System.out.println("Grade: " + grade);
    }

    // Main method to test
    public static void main(String[] args) {
        int[] marks = {90, 85, 95}; // 270/300
        Student student = new Student("Sushma", marks);

        printResultCard(student);
    }
}

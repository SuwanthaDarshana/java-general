package JavaTest.loops;

public class NestedLoop {
    public static void main(String[] args) {

        int studentCount = 5;
        int noOfExams = 2;

        for (int i = 1; i <= studentCount; i++) {
            for (int j = 1; j <= noOfExams; j++){
                System.out.println("Student " + i + " is seated for exam "+j);
            }
        }

    }
}

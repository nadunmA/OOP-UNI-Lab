package n2;

public class ExTwo {
    
    public static void main(String[] args) {
        
        if (args.length != 3) {
            System.out.println("Please provide the student's first name, student ID, and district.");
            return;
        }

        // Assign command line arguments to variables
        String firstName = args[0];
        String studentID = args[1];
        String district = args[2];

        // Display the user inputs
        System.out.println("Student ID : " + studentID);
        System.out.println("Name : " + firstName);
        System.out.println("District : " + district);
    }

}

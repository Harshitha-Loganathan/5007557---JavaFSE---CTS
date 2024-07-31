public class MVCDriver {
    public static void main(String[] args) {
        // Fetch student record from the database (simulated here)
        Student model = new Student("1", "John Doe", "A");

        // Create a view to display student details
        StudentView view = new StudentView();

        // Create the controller
        StudentController controller = new StudentController(model, view);

        // Update the view
        controller.updateView();

        // Update the model data
        controller.setStudentName("Jane Doe");
        controller.setStudentGrade("B");

        // Update the view again
        controller.updateView();
    }
}

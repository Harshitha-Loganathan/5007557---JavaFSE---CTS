public class TaskManagement {
    private class Node {
        Task task;
        Node next;

        Node(Task task) {
            this.task = task;
            this.next = null;
        }
    }

    private Node head;

    public TaskManagement() {
        head = null;
    }

    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public Task searchTask(int taskId) {
        Node temp = head;
        while (temp != null) {
            if (temp.task.getTaskId() == taskId) {
                return temp.task;
            }
            temp = temp.next;
        }
        return null;
    }

    public void deleteTask(int taskId) {
        if (head == null) {
            return;
        }
        if (head.task.getTaskId() == taskId) {
            head = head.next;
            return;
        }
        Node temp = head;
        while (temp.next != null && temp.next.task.getTaskId() != taskId) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    public void traverseTasks() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.task.getTaskName() + ": " + temp.task.getStatus());
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        TaskManagement management = new TaskManagement();

        management.addTask(new Task(1, "Task 1", "Pending"));
        management.addTask(new Task(2, "Task 2", "Completed"));

        System.out.println("Traverse Tasks:");
        management.traverseTasks();
        System.out.println();

        System.out.println("Search Task:");
        System.out.println(management.searchTask(2).getTaskName());
        System.out.println();

        management.deleteTask(1);
        System.out.println("After Deletion:");
        management.traverseTasks();
    }
}

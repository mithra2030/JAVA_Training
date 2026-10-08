import java.util.LinkedList;
public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<String> students = new LinkedList<>();

        students.add("Mithra");
        students.add("Jaya");
        students.add("Rudra");

        System.out.println("Students: " + students);

        System.out.println("First student: " + students.get(0));

        students.set(1, "Deva");

        System.out.println("After update: " + students);

        students.remove("Rudra");

        System.out.println("After removal: " + students);

        System.out.println("Size of the list: " + students.size());
    }
}
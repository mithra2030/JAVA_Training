import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Alice");
        students.add("Bob");
        students.add("Charlie");

        System.out.println("Students: " + students);

        System.out.println("First student: " + students.get(0));

        students.set(1, "David");

        System.out.println("After update: " + students);

        students.remove("Charlie");

        System.out.println("After removal: " + students);

        System.out.println("Size of the list: " + students.size());
    }
}
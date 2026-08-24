import java.util.HashSet;

public class r4 {

    public static void main(String[] args) {

        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(10);
        numbers.add(50);
        numbers.add(40);

        int target = 40;

        boolean found = numbers.contains(target);

        if (found) {
            System.out.println("Number found");
        } else {
            System.out.println("Number not found");
        }
    }
}
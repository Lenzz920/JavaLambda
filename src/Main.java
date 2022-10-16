import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);

        System.out.println(items);

        items.forEach(item -> { int square = item* item;
                                System.out.println(square);} );
    }
}
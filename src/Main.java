import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        List<List<Integer>> listOfLists = new ArrayList<>();

        listOfLists.add(Arrays.asList(1, 2, 3));
        listOfLists.add(Arrays.asList(4, 5, 6));
        listOfLists.add(Arrays.asList(7, 8, 9));

        List<Integer> transformed_list =
                listOfLists.stream()
                        .flatMap(List::stream)
                        .collect(Collectors.toList());

        System.out.println(transformed_list);
    }
}
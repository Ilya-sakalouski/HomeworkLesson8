package src.task3;

import java.util.Arrays;
import java.util.function.Function;

import static java.util.stream.Collectors.*;

public class Admin {
    public static void countTheVotes() {
        System.out.println("Result: " +
                Arrays.stream(Izbirateli.giveMeVoicesArray()).collect(groupingBy(Function.identity(), counting())));
    }
}


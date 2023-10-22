package org.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();
        List<Integer> Abc = new ArrayList<>(Arrays.asList(1, 5, -1, 4, 1, 5, 6, 10, 1, 2));
        solution.counterQniqueElements(Abc);

    }
}

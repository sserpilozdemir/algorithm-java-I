package org.algorithm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Solution {

    public int counterQniqueElements(List<Integer> arr){

        List<Integer> finalList = new ArrayList<>();
        Collections.sort(arr);
        for(Integer i :  arr){
            if(!finalList.contains(i)){
                finalList.add(i);
            }
        }
        System.out.printf("the counter is %s", finalList.size());

        return finalList.size();
    }
}

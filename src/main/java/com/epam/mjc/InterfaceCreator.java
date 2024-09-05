package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        List <Integer> list = new ArrayList<>();
        return x -> {
            for (Integer integer : x) {
                list.add(integer / 3);
            }
            return list;
        };
    }
}

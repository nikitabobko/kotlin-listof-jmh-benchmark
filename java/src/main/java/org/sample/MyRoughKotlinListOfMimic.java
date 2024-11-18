package org.sample;

import java.util.Arrays;
import java.util.List;

public class MyRoughKotlinListOfMimic {
    public static <T> List<T> of (T a01, T a02, T a03, T a04, T a05, T a06, T a07, T a08, T a09, T a10) {
        return Arrays.asList(a01, a02, a03, a04, a05, a06, a07, a08, a09, a10);
    }
}

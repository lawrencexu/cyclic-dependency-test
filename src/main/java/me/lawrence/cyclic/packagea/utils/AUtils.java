package me.lawrence.cyclic.packagea.utils;

import me.lawrence.cyclic.packageb.Constants;

public final class AUtils {

    private AUtils() {
    }

    public static void trivial() {
        System.out.println("trivial util method");
        System.out.println(Constants.TEST_STR);
    }
}

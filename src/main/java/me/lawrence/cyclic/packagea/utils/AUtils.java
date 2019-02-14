package me.lawrence.cyclic.packagea.utils;

import me.lawrence.cyclic.packageb.BUtils;

public final class AUtils {

    private AUtils() {
    }

    public static void trivial() {
        System.out.println("trivial util method");
        System.out.println(BUtils.getTestStr());
    }
}

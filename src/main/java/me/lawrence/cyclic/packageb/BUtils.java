package me.lawrence.cyclic.packageb;

public final class BUtils {

    private BUtils() {
    }

    public static String getTestStr() {
        return "testStr" + System.currentTimeMillis();
    }
}

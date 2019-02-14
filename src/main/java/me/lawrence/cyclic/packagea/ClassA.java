package me.lawrence.cyclic.packagea;

import me.lawrence.cyclic.packageb.ClassB;

public final class ClassA {

    public void trivial() {
        System.out.println("trivial util method");
        System.out.println(new ClassB().getTestStr());
    }
}

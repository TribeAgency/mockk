package io.mockk.core;

public class ClassImplementingInterfaceWithoutDefaultMethod implements AnInterface {
    @Override
    public int foo() {
        return 15;
    }
}

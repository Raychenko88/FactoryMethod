package org.example;

public class JavaDeveloper extends Developer {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public void writeCode() {
        System.out.println("java code");
    }
}

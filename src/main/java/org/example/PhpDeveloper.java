package org.example;

public class PhpDeveloper extends Developer {
    @Override
    public Developer createDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public void writeCode() {
        System.out.println("php code");
    }
}

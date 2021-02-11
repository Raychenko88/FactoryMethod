package org.example;

public class App {
    public static void main(String[] args) throws Exception {
        DeveloperFactory developerFactory = createDeveloperFactoryBySpeciality("php");
        Developer developer = developerFactory.createDeveloper();

        developer.writeCode();
    }

    static DeveloperFactory createDeveloperFactoryBySpeciality(String spec) throws Exception {
        if (spec.equalsIgnoreCase("java")) {
            return new JavaDeveloper();
        } else if (spec.equalsIgnoreCase("php")) {
            return new PhpDeveloper();
        } else {
            throw new Exception(spec + " is unknown");
        }
    }
}

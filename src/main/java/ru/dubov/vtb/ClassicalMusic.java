package ru.dubov.vtb;

public class ClassicalMusic implements Music {
    private ClassicalMusic() {
    }

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    public void doMyInit() {
        System.out.println("Initialization...");
    }

    @Override
    public String getSong() {
        return "Classical Music";
    }

    public void doMyDestroy() {
        System.out.println("Destruction...");
    }
}

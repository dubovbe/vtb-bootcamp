package ru.dubov.vtb.lesson13;

import org.springframework.stereotype.Component;

@Component
public class BlackAndWhiteCameraRoll implements CameraRoll {
    @Override
    public void processing() {
        System.out.println("-1 черно-белый кадр");
    }
}

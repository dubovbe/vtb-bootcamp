package ru.dubov.vtb.lesson13;

import org.springframework.stereotype.Component;

@Component
public class ColorCameraRoll implements CameraRoll {
    @Override
    public void processing() {
        System.out.println("-1 цветной кадр");
    }
}

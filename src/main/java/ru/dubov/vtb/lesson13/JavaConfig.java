package ru.dubov.vtb.lesson13;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    @Bean
    public CameraRoll cameraRoll() {
        return new ColorCameraRoll();
    }

    @Bean
    public CameraImpl camera(CameraRoll cameraRoll) {
        CameraImpl cameraImpl = new CameraImpl();
        cameraImpl.setCameraRoll(cameraRoll);
        return cameraImpl;
    }
}

package ru.dubov.vtb.lesson13;

public interface Camera {
    CameraRoll getCameraRoll();
    void setCameraRoll(CameraRoll cameraRoll);
    void doPhotograph();
    void breaking();
    boolean isBroken();
}

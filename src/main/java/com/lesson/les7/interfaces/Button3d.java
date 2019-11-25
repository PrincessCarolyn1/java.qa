package com.lesson.les7.interfaces;

public class Button3d implements Component3D {

    @Override
    public void draw3D() {
        System.out.println("3D");
    }

    @Override
    public void draw() {
        System.out.println("Button3D-> draw");
    }
}

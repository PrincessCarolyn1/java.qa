package com.lesson.les7.interfaces;

import java.awt.*;

public class Button implements Component, Sound{
    @Override
    public void draw() {
        System.out.println("Button");
    }

    public void draw1() {
        System.out.println("Button 1");
    }

    @Override
    public void play() {
        System.out.println("Sound");
    }
}

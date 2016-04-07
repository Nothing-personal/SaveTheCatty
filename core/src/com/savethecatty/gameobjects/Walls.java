package com.savethecatty.gameobjects;

import java.util.Random;

public class Walls extends Scrollable{

    private Random r;

    public Walls(float x, float y, int width, int height, float scrollSpeed) {
        super(x, y, width, height, scrollSpeed);

        r = new Random();
    }

    @Override
    public void reset(float newX) {
        super.reset(newX);
        width = r.nextInt(90) + 15;
    }
}

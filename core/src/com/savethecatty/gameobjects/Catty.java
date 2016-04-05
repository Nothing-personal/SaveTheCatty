package com.savethecatty.gameobjects;

import com.badlogic.gdx.math.Vector2;

/**
 * Created by Кевин on 27.03.2016.
 */
public class Catty {

    private Vector2 position; // Position will change only on x-axis while tapping and holding left or right part of screen
    private Vector2 velocity; // This parameter will change position of cat on x axis while tapping
    private float rotation; // Angle will be changed when catty moves right or left
    private int width;
    private int height;

    public Catty(float x, float y, int width, int height) {
        this.width = width;
        this.height = height;
        position = new Vector2(x, y);
        velocity = new Vector2(0, 0);
    }

    // Should make it smooth
    public void update(float delta) {
        position.add(velocity.cpy().scl(delta * 2));
        velocity.x = 0;
    }

    // Need testing of tapping in game
    public void rightTap() {
        velocity.x = 100;
    }

    public void leftTap() {
        velocity.x = -100;
    }

    public float getX() {
        return position.x;
    }

    public float getY() {
        return position.y;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    public float getRotation() {
        return rotation;
    }
}

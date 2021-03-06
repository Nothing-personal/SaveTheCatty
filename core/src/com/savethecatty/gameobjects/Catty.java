package com.savethecatty.gameobjects;

import com.badlogic.gdx.math.Vector2;

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

    // Now it is smooth. So the only thing is left here - to check tapping with textures uploaded.
    public void update(float delta) {
        position.add(velocity.cpy().scl(delta));
        if (velocity.x < 0) {
            rotation += 360 * delta;
            if ( rotation > 45) {
                rotation = 45;
            }
        }
        if (isRight()) {
            rotation -= 360 * delta;
            if (rotation < -45) {
                rotation = -45;
            }
        }
        if (velocity.x == 0) {
            rotation = 0;
        }
    }

    // Need testing of tapping in game
    public void rightTap() {
        velocity.x = 75;
    }

    public void leftTap() {
        velocity.x = -75;
    }

    public void stop() {
        velocity.x = 0;
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

    public float getVelocityX() { return velocity.x; }

    public boolean isRight() {
        return velocity.x > 0;
    }
}

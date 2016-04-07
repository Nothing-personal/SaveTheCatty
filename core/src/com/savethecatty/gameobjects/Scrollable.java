package com.savethecatty.gameobjects;

import com.badlogic.gdx.math.Vector2;

public class Scrollable {
    protected Vector2 position;
    protected Vector2 velocity;
    protected Vector2 acceleration;
    protected int width;
    protected int height;
    protected boolean isScrolledUp;

    public Scrollable(float x, float y, int width, int height, float scrollSpeed) {
        position = new Vector2(x, y);
        velocity = new Vector2 (0, scrollSpeed);
        acceleration = new Vector2(0, 100); // Check this after testing
        this.width = width;
        this.height = height;
        isScrolledUp = false;
    }

    public void update(float delta) {
        position.add(velocity.cpy().scl(delta));
        if (position.y + height < 0) {
            isScrolledUp = true;
        }
    }

    public void reset(float newY) {
        position.y = newY;
        isScrolledUp = false;
    }

    public boolean isScrolledUp() {
        return isScrolledUp;
    }

    public float getTailY() {
        return position.y + height;
    }

    public float getOriginX() {
        return position.x - width;
    }

    public float getTailX() {
        return position.x + width;
    }

    public float getX() {
        return position.x;
    }

    public float getY() {
        return position.y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}

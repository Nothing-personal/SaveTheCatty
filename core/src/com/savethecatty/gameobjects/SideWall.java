package com.savethecatty.gameobjects;

public class SideWall extends Scrollable{

    private boolean isLast;
    private boolean isFirst;

    public SideWall(float x, float y, int width, int height, float scrollSpeed) {
        super(x, y, width, height, scrollSpeed);
    }

    public boolean isFirst() {
        if (getY() + height > 204 ) {
            isFirst = true;
        }
        return isFirst;
    }

    public boolean isLast() {
        if (getY() + height < 0) {
            isLast = true;
        }
        return isLast;
    }
}

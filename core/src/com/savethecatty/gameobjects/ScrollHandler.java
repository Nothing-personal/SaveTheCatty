package com.savethecatty.gameobjects;

public class ScrollHandler {

    private SideWall lastSideWall, firstSideWall; // Maybe it is better to use an array for this
    private Walls rightWall, leftWall, leftAngleWall, rightAngleWall;

    public static final int SCROLL_SPEED = -59;
    public static final int WALL_GAP = 60;

    public ScrollHandler(float xPos) {

    }

    public void update(float delta) {

    }


    public SideWall getLastSideWall() {
        return lastSideWall;
    }

    public SideWall getFirstSideWall() {
        return firstSideWall;
    }

    public Walls getRightWall() {
        return rightWall;
    }

    public Walls getLeftWall() {
        return leftWall;
    }

    public Walls getLeftAngleWall() {
        return leftAngleWall;
    }

    public Walls getRightAngleWall() {
        return rightAngleWall;
    }
}

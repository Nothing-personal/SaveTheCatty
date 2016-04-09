package com.savethecatty.gameobjects;

public class ScrollHandler {

    private Walls leftAngleWallDown, leftAngleWallUp, rightAngleWallDown, rightAngleWallUp,
            rightBorder1, rightBorder2, rightBorder3, leftBorder1, leftBorder2, getLeftBorder3;
    private SideWall leftSideWallFront, leftSideWallBack, rightSideWallFront, rightSideWallBack;

    public static final int SCROLL_SPEED = -59;
    public static final int WALLS_GAP = 31;

    public ScrollHandler(float xPos) {
        leftSideWallFront = new SideWall(0, 0, 21, 204, SCROLL_SPEED);
        leftSideWallBack = new SideWall(0, leftSideWallFront.getTailY(), 21, 204, SCROLL_SPEED);

        rightSideWallFront = new SideWall(115, 0, 21, 204, SCROLL_SPEED);
        rightSideWallBack = new SideWall(115, rightSideWallFront.getTailY(), 21, 204, SCROLL_SPEED);

    }

    public void update(float delta) {

    }

    public SideWall getLeftSideWallFront() {
        return leftSideWallFront;
    }

    public SideWall getLeftSideWallBack() {
        return leftSideWallBack;
    }

    public SideWall getRightSideWallFront() {
        return rightSideWallFront;
    }

    public SideWall getRightSideWallBack() {
        return rightSideWallBack;
    }

    public Walls getLeftAngleWallDown() {
        return leftAngleWallDown;
    }

    public Walls getLeftAngleWallUp() {
        return leftAngleWallUp;
    }

    public Walls getRightAngleWallDown() {
        return rightAngleWallDown;
    }

    public Walls getRightAngleWallUp() {
        return rightAngleWallUp;
    }


}

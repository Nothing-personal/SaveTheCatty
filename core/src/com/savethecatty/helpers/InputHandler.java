package com.savethecatty.helpers;

import com.badlogic.gdx.InputProcessor;
import com.savethecatty.gameobjects.Catty;

/**
 * Class InputHandler will receive players taps as an input and then convert it into actions in game.
 */
public class InputHandler implements InputProcessor{

    private Catty myCatty;
    private int midPointX;

    public InputHandler(Catty catty, int midX ) {
        myCatty = catty;
        midPointX = midX;
    }

    @Override
    public boolean keyDown(int keycode) {
        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    // Moves right or left, while tapping on left or right side of screen
    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        if (screenX > midPointX) {
            myCatty.rightTap();
        } else {
            myCatty.leftTap();
        }
        return true;
    }

    // Stop moves, when finger is lifted from a screen
    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        myCatty.stop();
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(int amount) {
        return false;
    }
}

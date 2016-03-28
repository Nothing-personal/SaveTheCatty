package com.savethecatty.helpers;

import com.badlogic.gdx.InputProcessor;
import com.savethecatty.gameobjects.Catty;

/**
 * Class InputHandler will receive players taps as an input and then convert it into actions in game.
 */
public class InputHandler implements InputProcessor{

    private Catty myCatty;

    public InputHandler(Catty catty) {
        myCatty = catty;
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


    // Pay attention to this method. Guess that first I should create object of game screen to receive x.
    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        if (screenX > 68) {
            myCatty.rightTap();
        } else {
            myCatty.leftTap();
        }
        return true;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
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
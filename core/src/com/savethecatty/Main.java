package com.savethecatty;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.savethecatty.helpers.AssetLoader;
import com.savethecatty.screens.GameScreen;

public class Main extends Game {

	@Override
	public void create() {
		Gdx.app.log("Main method", "created");
		AssetLoader.load();
        setScreen(new GameScreen());
	}

    @Override
    public void dispose() {
        super.dispose();
        AssetLoader.dispose();
    }
}

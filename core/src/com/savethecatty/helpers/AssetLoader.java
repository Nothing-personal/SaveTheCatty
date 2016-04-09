package com.savethecatty.helpers;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

/**
 * Class AssetLoader will load sprites.
 */
public class AssetLoader {

    public static Texture textureCatty, textureBackground, textureWalls, textureSideWalls;
    public static TextureRegion background, wall, borderWallLeft, borderWallRight, angleWallLeft, angleWallLeftUp,
            angleWallRight, angleWallRightUp, sideWallRight, sideWallLeft;

    public static Animation cattyLeftAnimation, cattyRightAnimation;
    public static TextureRegion catty, cattyLeftUp, cattyRightUp, cattyRightDown, cattyLeftDown;

    public static void load() {

        textureCatty = new Texture(Gdx.files.internal("data/SaveTheCattyRed (3).png"));
        textureCatty.setFilter(Texture.TextureFilter.Nearest, Texture.TextureFilter.Nearest); // Filters for increasing/decreasing.

        textureBackground = new Texture(Gdx.files.internal("data/bg.png"));
        textureBackground.setFilter(Texture.TextureFilter.Nearest, Texture.TextureFilter.Nearest);

        textureWalls = new Texture(Gdx.files.internal("data/Borders.png"));
        textureWalls.setFilter(Texture.TextureFilter.Nearest, Texture.TextureFilter.Nearest);

        textureSideWalls = new Texture(Gdx.files.internal("data/SideWall.png"));
        textureSideWalls.setFilter(Texture.TextureFilter.Nearest, Texture.TextureFilter.Nearest);

        background = new TextureRegion(textureBackground);
        background.flip(false, true);

        // Should go on straight areas inside pipe
        borderWallLeft = new TextureRegion(textureWalls, 0, 0, 31, 31);
        borderWallLeft.flip(false, true);

        borderWallRight = new TextureRegion(borderWallLeft);
        borderWallRight.flip(true, true);

        //Angle walls to create a pipe
        angleWallLeft = new TextureRegion(textureWalls, 32, 0, 31, 31);
        angleWallLeft.flip(false, true);

        angleWallLeftUp = new TextureRegion(angleWallLeftUp);
        angleWallLeftUp.flip(false, false);

        angleWallRight = new TextureRegion(angleWallLeft);
        angleWallRight.flip(true, true);

        angleWallRightUp = new TextureRegion(angleWallRight);
        angleWallRightUp.flip(false, false);

        angleWallLeftUp = new TextureRegion(angleWallRight);

        sideWallRight = new TextureRegion(textureSideWalls, 0, 0, 21, 204);
        sideWallRight.flip(false, true);

        sideWallLeft = new TextureRegion(sideWallRight);
        sideWallLeft.flip(true, true);

        catty = new TextureRegion(textureCatty, 0, 0, 28, 40);
        catty.flip(false, true);

        cattyRightUp = new TextureRegion(textureCatty, 28, 0, 28, 40);
        cattyRightUp.flip(false, true);

        cattyLeftUp = new TextureRegion(textureCatty, 56, 0, 28, 40);
        cattyLeftUp.flip(false, true);

        cattyRightDown = new TextureRegion(textureCatty, 84, 0, 28, 40);
        cattyRightDown.flip(false, true);

        cattyLeftDown = new TextureRegion(textureCatty, 112, 0, 28, 40);
        cattyLeftDown.flip(false, true);

        TextureRegion[] cattyLeft = { cattyLeftDown, cattyLeftUp };
        cattyLeftAnimation = new Animation(0.1f, cattyLeft);
        cattyLeftAnimation.setPlayMode(Animation.PlayMode.LOOP_PINGPONG);

        TextureRegion[] cattyRight = { cattyRightDown, cattyRightUp };
        cattyRightAnimation = new Animation(0.1f, cattyRight);
        cattyRightAnimation.setPlayMode(Animation.PlayMode.LOOP_PINGPONG);
    }

    public static void dispose() {
        textureWalls.dispose();
    }
}

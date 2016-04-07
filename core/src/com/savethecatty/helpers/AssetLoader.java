package com.savethecatty.helpers;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

/**
 * Class AssetLoader will load sprites.
 */
public class AssetLoader {

    public static Texture textureCatty, textureBackground, textureWalls;
    public static TextureRegion background, wall, borderWall, angleWall, sideWall;

    public static Animation cattyAnimation;
    public static TextureRegion catty, cattyLeftUp, cattyRightUp, cattyRightDown, cattyLeftDown;

    public static void load() {

        textureCatty = new Texture(Gdx.files.internal("data/SaveTheCattyRed (3).png"));
        textureCatty.setFilter(Texture.TextureFilter.Nearest, Texture.TextureFilter.Nearest); // Filters for increasing/decreasing.

        textureBackground = new Texture(Gdx.files.internal("data/Background.png"));
        textureBackground.setFilter(Texture.TextureFilter.Nearest, Texture.TextureFilter.Nearest);

        textureWalls = new Texture(Gdx.files.internal("data/Walls (2).png"));
        textureWalls.setFilter(Texture.TextureFilter.Nearest, Texture.TextureFilter.Nearest);

        background = new TextureRegion(textureBackground);
        background.flip(false, true);

        wall = new TextureRegion(textureWalls, 0, 0, 31, 31);
        wall.flip(false, true);

        borderWall = new TextureRegion(textureWalls, 34, 0, 31, 31);

        angleWall = new TextureRegion(textureWalls, 102, 0, 31, 31);
        angleWall.flip(false, true);

        sideWall = new TextureRegion(textureWalls, 238, 0, 31, 31);
        sideWall.flip(false, true);

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

        TextureRegion[] catties = { cattyLeftUp, cattyLeftDown, catty, cattyRightDown,cattyRightUp };
        cattyAnimation = new Animation(0.5f, catties); // Creating new object of type Animation in which every frame continue 0.06s
        cattyAnimation.setPlayMode(Animation.PlayMode.LOOP_PINGPONG); // Type of animation ping-pong. It will play back and forth
    }

    public static void dispose() {
        System.out.println("Object dispose");
    }
}

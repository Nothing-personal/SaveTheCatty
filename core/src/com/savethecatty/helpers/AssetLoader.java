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
    public static TextureRegion background, wall, sideWall, borderWall;

    public static Animation cattyAnimation;
    public static TextureRegion catty, cattyLeft, cattyRight;

    public static void load() {

        textureCatty = new Texture(Gdx.files.internal("data/SaveTheCattyRed (7).png"));
        textureCatty.setFilter(Texture.TextureFilter.Nearest, Texture.TextureFilter.Nearest); // Filters for increasing/decreasing.

        catty = new TextureRegion(textureCatty, 0, 0, 14, 20);
        catty.flip(false, true);

        cattyRight = new TextureRegion(textureCatty, 14, 0, 14, 20);
        cattyRight.flip(false, true);

        cattyLeft = new TextureRegion(textureCatty, 28, 0, 14, 20);
        cattyLeft.flip(false, true);

        TextureRegion[] catties = { cattyLeft, catty, cattyRight };
        cattyAnimation = new Animation(0.06f, catties); // Creating new object of type Animation in which every frame continue 0.06s
        cattyAnimation.setPlayMode(Animation.PlayMode.LOOP_PINGPONG); // Type of animation ping-pong. It will play back and forth
    }

    public static void dispose() {
        System.out.println("Object dispose");
    }
}

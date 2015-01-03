package com.example.vegilicious.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by Vegilicious on 12/27/14.
 */
public class ColorWheel {
    private String[] colors = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
    }; //member variable

    public int returnColor() {

        Random colorIndexGenerator = new Random();
        int colorIndex = colorIndexGenerator.nextInt(colors.length);

        String colorString = colors[colorIndex];
        return Color.parseColor(colorString);
    } //member method
}

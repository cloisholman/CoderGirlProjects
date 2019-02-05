package com.company;
import static java.lang.System.out;
import java.util.Scanner;

public class Entertainment_ {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String weatherToday;
        String moodToday;
        String weatherActivity;


        out.println("What is the weather like today? Answer: sunny, cloudy or rainy.");

        weatherToday = keyboard.nextLine();

        out.println("What kind of mood are you in for activities? Answer: exercise, party or quiet.");

        moodToday = keyboard.nextLine();

        if (weatherToday.equals("sunny")) {
            out.println();
            if (moodToday.equals("quiet")) {
                out.println("A sunny day is a beautiful time to sit under a tree and read a book.");

            }
            if (moodToday.equals("party")) {
                out.println("For a fun party on a sunny day, look for a street festival.");
            }
            if (moodToday.equals("exercise")){
                out.println("For exercise on a sunny day, try a brisk walk in a nature preserve.");
            }
            if (moodToday.equals("quiet")|| moodToday.equals("party") || moodToday.equals("exercise")) {
            } else {
                out.println("Your mood wasn't one of the valid options");


            }

        }
        if (weatherToday.equals("cloudy")) {
            out.println();
            if (moodToday.equals("quiet")) {
                out.println("On a cloudy day, take a camera or paints to sketch the flowers at the lakeside.");

            }
            if (moodToday.equals("party")) {
                out.println("For a fun party on a cloudy day, ride the paddle boats at the park.");
            }
            if (moodToday.equals("exercise")){
                out.println("For exercise on a cloudy day, the botanical gardens are a lovely walk.");
            }
            if (moodToday.equals("quiet")|| moodToday.equals("party") || moodToday.equals("exercise")) {
            } else {
                out.println("Your mood wasn't one of the valid options");


            }

        }
        if (weatherToday.equals("rainy")) {
            out.println();
            if (moodToday.equals("quiet")) {
                out.println("A rainy day is a peaceful time to journal and daydream.");

            }
            if (moodToday.equals("party")) {
                out.println("See if your friends are playing board games to pass a rainy day.");
            }
            if (moodToday.equals("exercise")){
                out.println("Giant indoor trampolines are a fin place to exercise on a rainy day.");
            }
            if (moodToday.equals("quiet")|| moodToday.equals("party") || moodToday.equals("exercise")) {
            } else {
                out.println("Your mood wasn't one of the valid options");
    }

}
        if (weatherToday.equals("sunny")|| weatherToday.equals("rainy") || weatherToday.equals("cloudy")) {
        } else {
            out.println("Your weather answer wasn't one of the valid options");
    }
}
}

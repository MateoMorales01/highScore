package com.pluralsight;

public class highscore {
    public static void main(String[] args) {

        String code = "Blue:Red|21:9";

        String[] parts = code.split("\\|");

        String header = parts[0];
        String score = parts[1];

        String[] teams = header.split(":");

        String blueTeam = teams[0];
        String redTeam = teams[1];

        String[] scoreValues = score.split(":");

        String blueScore = scoreValues[0];
        String redScore = scoreValues[1];

        System.out.println("Home: " + blueTeam);
        System.out.println("Visitor: " + redTeam);
        System.out.println("Blue Score " + blueScore);
        System.out.println("Red Score " + redScore);
    }
}

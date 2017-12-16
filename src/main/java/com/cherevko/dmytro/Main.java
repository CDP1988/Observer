package com.cherevko.dmytro;

public class Main {

    /**
     * The main method is where the FootballNews and Observers are created.
     * When the news are set, observers are commenting
     */
    public static void main(String[] args) {

        FootballNews footballNews = new FootballNews();

        Observer dynamoFan = new DynamoFan(footballNews);
        Observer shahterFan = new ShahterFan(footballNews);
        Observer otherFan = new OtherFan(footballNews);

        footballNews.setNews("Besiktas");
        footballNews.setNews("Roma");
    }
}
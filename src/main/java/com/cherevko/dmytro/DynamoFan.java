package com.cherevko.dmytro;

public class DynamoFan extends Observer {

    public DynamoFan(FootballNews footballNews) {
        this.footballNews = footballNews;
        this.footballNews.attach(this);
    }

    @Override
    public void update() {
        System.out.println("\nDynamoFans says: " + footballNews.getNews() + " - easy team!");
        System.out.println("Dynamo! Dynamo! Dynamo!");
    }
}
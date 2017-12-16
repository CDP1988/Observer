package com.cherevko.dmytro;

public class ShahterFan extends Observer {

    public ShahterFan(FootballNews footballNews) {
        this.footballNews = footballNews;
        this.footballNews.attach(this);
    }

    @Override
    public void update() {
        System.out.println("\nShahterfans says: Very good chance, " + footballNews.getNews()
                            + " it is not Barcelona or PSG");
    }
}
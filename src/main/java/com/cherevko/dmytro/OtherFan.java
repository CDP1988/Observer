package com.cherevko.dmytro;

public class OtherFan extends Observer {

    public OtherFan(FootballNews footballNews) {
        this.footballNews = footballNews;
        this.footballNews.attach(this);
    }

    @Override
    public void update() {
        System.out.println("\nOtherFans says: Ow. Shahter againts " + footballNews.getNews()
                            + " We will be watch Real - PSG");
    }
}

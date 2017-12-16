package com.cherevko.dmytro;

import java.util.ArrayList;
import java.util.List;

public class FootballNews {

    private String news;
    private List<Observer> observers = new ArrayList<>();

    public String getNews() {
        return news;
    }

    /**
     * The setNews method is where the set news.
     * When the news are set, observers are notifying
     * @param news String
     */
    public void setNews(String news) throws InterruptedException {
        this.news = news;
        System.out.println("\nTeam: " + news);
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    /**
     * The notifyAllObservers method is where the notify all observers.
     */
    private void notifyAllObservers() throws InterruptedException {
        for (Observer observer : observers) {
            Thread.sleep(1500);
            observer.update();
        }
    }
}
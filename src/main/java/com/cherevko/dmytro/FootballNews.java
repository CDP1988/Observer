package com.cherevko.dmytro;

import java.util.ArrayList;
import java.util.List;

public class FootballNews {

    String news;
    List<Observer> observers = new ArrayList<>();

    public String getNews() {
        return news;
    }

    /**
     * The setNews method is where the set news.
     * When the news are set, observers are notifying
     * @param news String
     */
    public void setNews(String news) {
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
    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
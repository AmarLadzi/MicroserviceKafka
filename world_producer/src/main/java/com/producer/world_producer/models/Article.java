package com.producer.world_producer.models;

import com.github.javafaker.*;

import java.util.*;

public class Article {

    private Faker faker = new Faker();
    private Random random = new Random();
    private Type[] someType = Type.values();


    private String title;
    private String subTitle;
    private String address;
    private String country;
    private String color;
    private String DateAndTime;
    private String author;
    private Type type;


    public Article() {
        this.title = faker.animal().name();
        this.subTitle = faker.aviation().aircraft();
        this.address = faker.address().fullAddress();
        this.country = faker.country().name();
        this.color = faker.color().name();
        this.DateAndTime = faker.date().toString();
        this.author = faker.artist().name();
        this.type = someType[random.nextInt(someType.length)];
    }

    public enum Type {
        ECONOMY, SPORT, BESTNEWS
    }

    @Override
    public String toString() {
        return
                "title='" + title + '\'' +
                        ", subTitle='" + subTitle + '\'' +
                        ", address='" + address + '\'' +
                        ", country='" + country + '\'' +
                        ", color='" + color + '\'' +
                        ", author='" + author + '\'' +
                        ", type=" + type;
    }
}

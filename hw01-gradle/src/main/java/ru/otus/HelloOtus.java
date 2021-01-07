package ru.otus;

import com.google.common.cache.CacheBuilder;

import java.time.Duration;

public class HelloOtus {
    void test(){
        CacheBuilder.newBuilder().expireAfterAccess(Duration.ofSeconds(5));
    }

    public static void main(String[] args) {
        System.out.println("hw01-gradle");
    }
}

package com.heeverse.itlabapi.bookmark.service.preprocess;

import org.springframework.stereotype.Component;

import java.util.concurrent.ThreadLocalRandom;

@Component
public class Base64Shortener implements Shortener{

    private final ThreadLocalRandom random = ThreadLocalRandom.current();
    private static final int SHORT_URL_LENGTH = 8;

    @Override
    public String shorten(String value) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < SHORT_URL_LENGTH; i++) {
            sb.append(value.charAt(random.nextInt(value.length())));
        }
        return sb.toString();
    }
}

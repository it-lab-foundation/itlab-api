package com.heeverse.itlabapi.bookmark.service;

import com.heeverse.itlabapi.bookmark.domain.vo.DomainUrl;
import com.heeverse.itlabapi.bookmark.domain.vo.ShortenUrl;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Base64;

@Component
public class UrlPreprocessor {


    public DomainUrl split(String fullUrl) {

        return null;
    }

    public ShortenUrl shorten(DomainUrl domainUrl) {
        String shortenPath = transform(domainUrl.path());
        return new ShortenUrl(domainUrl, shortenPath);
    }

    private String transform(String path) {
        return Arrays.toString(Base64.getDecoder().decode(path));
    }
}

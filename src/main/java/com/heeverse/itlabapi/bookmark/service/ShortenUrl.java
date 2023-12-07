package com.heeverse.itlabapi.bookmark.service;

import lombok.Getter;

public class ShortenUrl {

    @Getter
    private String shortUrl;
    private String longUrl;

    public ShortenUrl(DomainUrl domainUrl, String shortenPath) {
        this.longUrl = domainUrl.getFullUrl();
        this.shortUrl = domainUrl.domain() + shortenPath;
    }
}

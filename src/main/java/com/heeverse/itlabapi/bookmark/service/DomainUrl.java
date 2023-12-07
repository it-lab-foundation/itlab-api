package com.heeverse.itlabapi.bookmark.service;

public record DomainUrl(
        String original,
        String domain,
        String path
) {

    public String getFullUrl() {
        return original;
    }
}

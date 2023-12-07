package com.heeverse.itlabapi.bookmark.domain.vo;

public record DomainUrl(
        String original,
        String domain,
        String path
) {

    public String getFullUrl() {
        return original;
    }
}

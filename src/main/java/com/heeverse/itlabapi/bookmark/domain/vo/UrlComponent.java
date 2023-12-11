package com.heeverse.itlabapi.bookmark.domain.vo;

import lombok.NonNull;

@NonNull
public record UrlComponent(
        String original,
        String scheme,
        String domain,
        String path
) {
    public String getShortenUrl(String shortenPath) {
        return scheme + domain + shortenPath;
    }
}

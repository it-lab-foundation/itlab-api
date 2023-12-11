package com.heeverse.itlabapi.bookmark.presentation.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author gutenlee
 * @since 2023/11/27
 */
@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class BookmarkResponse {

    private String memberId;
    private String longUrl;
    private String shortUrl;

    public BookmarkResponse(String memberId, String longUrl, String shortUrl) {
        this.memberId = memberId;
        this.longUrl = longUrl;
        this.shortUrl = shortUrl;
    }
}

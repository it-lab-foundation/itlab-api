package com.heeverse.itlabapi.bookmark.presentation.dto;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * @author gutenlee
 * @since 2023/11/27
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class BookmarkResponse {

    private String memberId;
    private String bookmarkUrl;

    public BookmarkResponse(String memberId, String bookmarkUrl) {
        this.memberId = memberId;
        this.bookmarkUrl = bookmarkUrl;
    }
}

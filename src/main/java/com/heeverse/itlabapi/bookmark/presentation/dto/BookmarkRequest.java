package com.heeverse.itlabapi.bookmark.presentation.dto;

import lombok.Getter;

/**
 * @author gutenlee
 * @since 2023/11/26
 */
public record BookmarkRequest(
        String memberId,
        String bookmarkUrl
){}
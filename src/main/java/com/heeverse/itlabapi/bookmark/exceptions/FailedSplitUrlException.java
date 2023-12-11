package com.heeverse.itlabapi.bookmark.exceptions;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FailedSplitUrlException extends RuntimeException {
    private String message;
    public FailedSplitUrlException(String message) {
        super();
        log.info("Failed Splitting URL [{}]", message);
    }
}

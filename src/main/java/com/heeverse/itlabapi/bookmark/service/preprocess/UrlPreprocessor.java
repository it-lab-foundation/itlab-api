package com.heeverse.itlabapi.bookmark.service.preprocess;

import com.heeverse.itlabapi.bookmark.domain.vo.UrlComponent;

public interface UrlPreprocessor {
    UrlComponent preprocess(String url);
}

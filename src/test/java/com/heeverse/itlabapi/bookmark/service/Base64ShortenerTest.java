package com.heeverse.itlabapi.bookmark.service;

import com.heeverse.itlabapi.bookmark.domain.vo.UrlComponent;
import com.heeverse.itlabapi.bookmark.service.preprocess.Base64Shortener;
import com.heeverse.itlabapi.bookmark.service.preprocess.SplitUrlPreprocessor;
import com.heeverse.itlabapi.common.utils.HostInfo;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Base64ShortenerTest {

    private final SplitUrlPreprocessor urlPreprocessor = new SplitUrlPreprocessor(new HostInfo());
    private final Base64Shortener base64Shortener = new Base64Shortener();

    @Test
    @DisplayName("Base64로 인코딩하기")
    public void encodeTest() {

        String testUrl = "https://incheol-jung.gitbook.io/docs/q-and-a/architecture/undefined-2";
        UrlComponent split = urlPreprocessor.preprocess(testUrl);

        String shorten = base64Shortener.shorten(split.path());
        System.out.println("shorten = " + shorten);
    }

}
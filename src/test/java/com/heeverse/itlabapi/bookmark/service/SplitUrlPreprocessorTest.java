package com.heeverse.itlabapi.bookmark.service;

import com.heeverse.itlabapi.bookmark.domain.vo.UrlComponent;
import com.heeverse.itlabapi.bookmark.service.preprocess.SplitUrlPreprocessor;
import com.heeverse.itlabapi.common.utils.HostInfo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class SplitUrlPreprocessorTest {

    private final SplitUrlPreprocessor urlPreprocessor = new SplitUrlPreprocessor(new HostInfo());

    @Nested
    class UrlSplit {
        @Test
        @DisplayName("URL 분해 테스트")
        public void splitTest() {
            String testUrl = "https://incheol-jung.gitbook.io/docs/q-and-a/architecture/undefined-2";
            UrlComponent split = urlPreprocessor.preprocess(testUrl);
            Assertions.assertEquals(testUrl, split.original());
            Assertions.assertEquals("https://", split.scheme());
            Assertions.assertEquals("incheol-jung.gitbook.io", split.domain());
            Assertions.assertEquals("/docs/q-and-a/architecture/undefined-2", split.path());
        }

    }

}
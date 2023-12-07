package com.heeverse.itlabapi.bookmark.service;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class UrlPreprocessorUnitTest {

    private UrlPreprocessor urlPreprocessor = new UrlPreprocessor();

    @Test
    public void splitTest() {
        DomainUrl domainUrl = urlPreprocessor.split("https://guui-dev-lee.tistory.com/20");

        assertThat(domainUrl.path()).isEqualTo("20");
    }

}
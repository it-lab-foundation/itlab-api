package com.heeverse.itlabapi.bookmark.service;

import com.heeverse.itlabapi.bookmark.presentation.dto.BookmarkRequest;
import com.heeverse.itlabapi.bookmark.presentation.dto.BookmarkResponse;
import com.heeverse.itlabapi.member.MemberTestHelper;
import com.heeverse.itlabapi.member.domain.Member;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("local")
@SpringBootTest
class BookmarkServiceIntegrationTest {

    @Autowired
    private BookmarkFacadeService bookmarkFacadeService;
    @Autowired
    private MemberTestHelper memberTestHelper;

    @Test
    @DisplayName("멤버의 북마크에 URL 추가 성공")
    public void bookmarkTest() {

        //given
        Member member = memberTestHelper.createMember();
        BookmarkRequest bookmarkRequest = new BookmarkRequest(member.getMemberId(), "https://incheol-jung.gitbook.io/docs/q-and-a/architecture/undefined-2");

        //when
        BookmarkResponse bookmarkResponse = bookmarkFacadeService.doBookmark(bookmarkRequest);

        //then
        Assertions.assertEquals("https://incheol-jung.gitbook.io/docs/q-and-a/architecture/undefined-2", bookmarkResponse.getLongUrl());
    }

}
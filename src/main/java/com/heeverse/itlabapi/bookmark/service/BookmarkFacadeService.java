package com.heeverse.itlabapi.bookmark.service;

import com.heeverse.itlabapi.bookmark.domain.vo.DomainUrl;
import com.heeverse.itlabapi.bookmark.domain.entity.Bookmark;
import com.heeverse.itlabapi.bookmark.domain.entity.Domain;
import com.heeverse.itlabapi.bookmark.domain.entity.Url;
import com.heeverse.itlabapi.bookmark.presentation.dto.BookmarkRequest;
import com.heeverse.itlabapi.bookmark.presentation.dto.BookmarkResponse;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author gutenlee
 * @since 2023/11/26
 */
@Service
@RequiredArgsConstructor
public class BookmarkFacadeService {

    private final BookmarkService bookmarkService;
    private final UrlService urlService;
    private final DomainService domainService;
    private final UrlPreprocessor urlPreprocessor;

    @Transactional
    public BookmarkResponse doBookmark(BookmarkRequest bookmarkRequest) {

        DomainUrl domainUrl = urlPreprocessor.split(bookmarkRequest.bookmarkUrl());
        Domain domain = domainService.createDomain(domainUrl.domain());
        Bookmark memberBookmark = bookmarkService.findBookmark(bookmarkRequest.memberId());
        Url url = urlService.createUrl(domain.getDomainSeq(), domainUrl, bookmarkRequest.memberId());

        return new BookmarkResponse(bookmarkRequest.memberId(), bookmarkRequest.bookmarkUrl());
    }
}

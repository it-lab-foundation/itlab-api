package com.heeverse.itlabapi.bookmark.service;

import com.heeverse.itlabapi.bookmark.domain.entity.Bookmark;
import com.heeverse.itlabapi.bookmark.domain.entity.Domain;
import com.heeverse.itlabapi.bookmark.domain.entity.Url;
import com.heeverse.itlabapi.bookmark.presentation.dto.BookmarkRequest;
import com.heeverse.itlabapi.bookmark.presentation.dto.BookmarkResponse;
import com.heeverse.itlabapi.bookmark.domain.vo.UrlComponent;
import com.heeverse.itlabapi.bookmark.service.preprocess.SplitUrlPreprocessor;
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
    private final SplitUrlPreprocessor splitUrlPreprocessor;

    @Transactional
    public BookmarkResponse doBookmark(BookmarkRequest bookmarkRequest) {

        UrlComponent urlComponent = splitUrlPreprocessor.preprocess(bookmarkRequest.bookmarkUrl());

        Domain domain = domainService.createDomain(urlComponent.domain());
        Bookmark memberBookmark = bookmarkService.findBookmark(bookmarkRequest.memberId());
        Url url = urlService.createUrl(domain, memberBookmark, urlComponent);

        return new BookmarkResponse(bookmarkRequest.memberId(), url.getLongUrl(), url.getShortUrl());
    }
}

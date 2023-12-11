package com.heeverse.itlabapi.bookmark.service;

import com.heeverse.itlabapi.bookmark.domain.entity.Bookmark;
import com.heeverse.itlabapi.bookmark.domain.entity.Domain;
import com.heeverse.itlabapi.bookmark.domain.entity.Url;
import com.heeverse.itlabapi.bookmark.repository.UrlRepository;
import com.heeverse.itlabapi.bookmark.domain.vo.UrlComponent;
import com.heeverse.itlabapi.bookmark.service.preprocess.Base64Shortener;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UrlService {

    private final UrlRepository urlRepository;
    private final Base64Shortener base64Shortener;

    public Url createUrl(Domain domain, Bookmark memberBookmark, UrlComponent urlComponent) {
        String shortenPath = base64Shortener.shorten(urlComponent.path());
        Url url = new Url(domain, memberBookmark, urlComponent, shortenPath);
        return urlRepository.save(url);
    }
}

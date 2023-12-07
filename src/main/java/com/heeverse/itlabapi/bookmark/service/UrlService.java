package com.heeverse.itlabapi.bookmark.service;

import com.heeverse.itlabapi.bookmark.domain.vo.DomainUrl;
import com.heeverse.itlabapi.bookmark.domain.vo.ShortenUrl;
import com.heeverse.itlabapi.bookmark.domain.entity.Url;
import com.heeverse.itlabapi.bookmark.repository.UrlRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UrlService {

    private final UrlRepository urlRepository;
    private final UrlPreprocessor urlPreprocessor;

    public Url createUrl(Long domainSeq, DomainUrl domainUrl, String memberId) {
        ShortenUrl shortenUrl = urlPreprocessor.shorten(domainUrl);
        Url url = new Url(shortenUrl.getShortUrl(), domainUrl.getFullUrl(), domainSeq);
        return urlRepository.save(url);
    }
}

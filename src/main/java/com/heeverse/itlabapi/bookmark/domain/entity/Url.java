package com.heeverse.itlabapi.bookmark.domain.entity;

import com.heeverse.itlabapi.common.BaseEntity;
import com.heeverse.itlabapi.bookmark.domain.vo.UrlComponent;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author gutenlee
 * @since 2023/11/27
 */
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Url extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long urlSeq;
    @Getter
    private String longUrl;
    @Getter
    private String shortUrl;
    @ManyToOne(targetEntity = Domain.class)
    private Domain domain;

    @ManyToOne(targetEntity = Bookmark.class)
    private Bookmark bookmark;

    public Url(Domain domain, Bookmark bookmark, UrlComponent urlComponent, String shortenPath) {
        this.domain = domain;
        this.bookmark = bookmark;
        this.longUrl = urlComponent.original();
        this.shortUrl = urlComponent.getShortenUrl(shortenPath);
    }
}

package com.heeverse.itlabapi.bookmark.domain.entity;

import com.heeverse.itlabapi.common.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * @author gutenlee
 * @since 2023/11/27
 */
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Url extends BaseEntity {

    @Id
    private Long bookmarkSeq;
    private String shortUrl;
    private String longUrl;
    @OneToOne(targetEntity = Domain.class)
    private Long belongToDomain;

    public Url(String shortUrl, String longUrl, Long belongToDomain) {
        this.shortUrl = shortUrl;
        this.longUrl = longUrl;
        this.belongToDomain = belongToDomain;
    }
}

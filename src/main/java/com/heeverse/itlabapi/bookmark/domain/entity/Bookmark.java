package com.heeverse.itlabapi.bookmark.domain.entity;

import com.heeverse.itlabapi.common.BaseEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * @author gutenlee
 * @since 2023/11/24
 */
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Bookmark extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookmarkSeq;
    private String memberId;

    public Bookmark(String memberId) {
        this.memberId = memberId;
    }
}

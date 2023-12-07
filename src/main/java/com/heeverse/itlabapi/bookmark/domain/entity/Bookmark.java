package com.heeverse.itlabapi.bookmark.domain.entity;

import com.heeverse.itlabapi.common.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

/**
 * @author gutenlee
 * @since 2023/11/24
 */
@Entity
public class Bookmark extends BaseEntity {

    @Id
    private Long bookmarkSeq;
    private Long memberId;



}

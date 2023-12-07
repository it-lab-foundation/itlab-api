package com.heeverse.itlabapi.bookmark.domain.entity;

import com.heeverse.itlabapi.common.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author gutenlee
 * @since 2023/11/27
 */
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Domain extends BaseEntity {

    @Getter
    @Id
    private Long domainSeq;

    private String domain;

    public Domain(String domain) {
        this.domain = domain;
    }

}

package com.heeverse.itlabapi.member.domain;

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
public class Member extends BaseEntity {

    @Id
    @Getter
    private String memberId;
    private String password;
    private String email;
    private String jobs;

    public Member(String memberId, String password, String email, String jobs) {
        this.memberId = memberId;
        this.password = password;
        this.email = email;
        this.jobs = jobs;
    }
}

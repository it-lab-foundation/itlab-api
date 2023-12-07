package com.heeverse.itlabapi.member.domain;

import com.heeverse.itlabapi.common.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/**
 * @author gutenlee
 * @since 2023/11/27
 */
@Entity
public class Member extends BaseEntity {

    @Id
    private String memberId;
    private String password;
    private String email;
    private String jobs;

}

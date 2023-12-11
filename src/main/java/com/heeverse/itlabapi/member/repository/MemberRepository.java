package com.heeverse.itlabapi.member.repository;

import com.heeverse.itlabapi.member.domain.Member;
import org.springframework.data.repository.CrudRepository;

public interface MemberRepository extends CrudRepository<Member, String> {
}

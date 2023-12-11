package com.heeverse.itlabapi.member;

import com.heeverse.itlabapi.member.domain.Member;
import com.heeverse.itlabapi.member.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberTestHelper {

    @Autowired
    private MemberRepository memberRepository;

    public Member createMember() {
        Member member = new Member("bnm1128", "test", "test", "Backend");
        return memberRepository.save(member);
    }
}

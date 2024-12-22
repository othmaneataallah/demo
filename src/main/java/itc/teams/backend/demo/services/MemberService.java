package itc.teams.backend.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import itc.teams.backend.demo.models.Member;
import itc.teams.backend.demo.models.MemberRepository;

@Service
public class MemberService {
    
    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }

    public void addMember(String email, String firstName, String lastName) {
        Member member = new Member(email, firstName, lastName);
        memberRepository.save(member);
    }

}

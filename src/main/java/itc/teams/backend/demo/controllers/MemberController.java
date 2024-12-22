package itc.teams.backend.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import itc.teams.backend.demo.models.Member;
import itc.teams.backend.demo.services.MemberService;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/members")
public class MemberController {

    private final MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping("/add")
    public String addMember(@RequestBody Member member) {
        memberService.addMember(member.getEmail(), member.getFirstName(), member.getLastName());
        return "Member added";
    }

    @GetMapping("/list")
    public List<Member> getAllMembers() {
        return memberService.getAllMembers();
    }
    
}

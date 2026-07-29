package com.groupx.Member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@CrossOrigin
public class MemberController {
    @Autowired
    private MemberService memberService;

    @GetMapping("/Members")
    public List<Member> getAllMembers() {
        return memberService.getAllMembers();
    }

    @GetMapping("/Members/Name/{MemberName}")
    public Member getMemberByName(@PathVariable String MemberName) {
        return memberService.getMemberByName(MemberName);
    }

    @GetMapping("/Members/Type/{MembershipType}")
    public Member getMemberByMemberShip(@PathVariable String MembershipType) {
        return memberService.getMemberByType(MembershipType);
    }

    @GetMapping("/Members/PhoneNum/{PhoneNum}")
    public Member getMemberByPhoneNum(@PathVariable String PhoneNum) {
        return memberService.getMemberByPhoneNum(PhoneNum);
    }


    @PostMapping("/Members")
    public Member AddMember(@RequestBody Member member){
        return memberService.addNewMember(member);
    }
}




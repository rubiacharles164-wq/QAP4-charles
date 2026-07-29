package Member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.time.LocalDate;
import java.util.List;


@Service
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;

    public List<Member> getAllMembers(){
        return (List<Member>) memberRepository.findAll();
    }

    public Member getMemberByName(String MemberName) {
        List<Member> MemberLocator = memberRepository.findByNameIgnoreCase(MemberName);

        return (Member) MemberLocator;
    }

    public Member getMemberByType(String MemberType) {
        List<Member> MemberLocator = memberRepository.findByNameContainingIgnoreCase(MemberType);

        return (Member) MemberLocator;
    }

    public Member getMemberByPhoneNum(String PhoneNum) {
        List<Member> MemberLocator = memberRepository.findByNameContainingIgnoreCase(PhoneNum);

        return (Member) MemberLocator;
    }

    public Member findByTournamentDate(LocalDate StartDate) {
        List<Member> MemberLocator = memberRepository.findByTournamentDate(StartDate);

        return (Member) MemberLocator;
    }

    public Member addNewMember(Member newMember) {
        return memberRepository.save(newMember);
    }


}


package com.groupx.Tournament.Tournament;

import com.groupx.Member.Member;
import com.groupx.Member.MemberRepository;
import com.groupx.Member.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;


@Service
public class TournamentService {


    @Autowired
    private TournamentRepository tournamentRepository;

//    @Autowired
//    private MemberRepository memberRepository;
//    private Member member;

    public List<Tournament> getAllTournamentS(){
        return (List<Tournament>) tournamentRepository.findAll();
    }

//    public Tournament registartParticipatingMember(Long TournamentID, Long MemberID) {
//        Tournament tournament = tournamentRepository.findById(TournamentID)
//                .orElseThrow(()-> new RuntimeException("Tournament not found"));
//        Member member = memberRepository.findById(MemberID)
//                .orElseThrow(() -> new RuntimeException("Member not found"));
//        if (!tournament.getParticipatingMembers().contains(member)) {
//            tournament.getParticipatingMembers().add(member);
//        }
//
//        return tournamentRepository.save(tournament);
//    }

    public Tournament findByTournamentDate(LocalDate StartDate) {
        List<Tournament> TournamentLocator = tournamentRepository.findTournamentByStartDate(StartDate);

        return (Tournament) TournamentLocator;
    }

    public Tournament findByLocation(String Location) {
        return (Tournament) tournamentRepository.findByLocation(Location);
    }

    public Tournament addTournament(Tournament newTournament) {
        return tournamentRepository.save(newTournament);
    }

    public Tournament findMembersbyStartDate(String StartDate) {
        return (Tournament) tournamentRepository.findMembersByStartDate(StartDate);
    }


}

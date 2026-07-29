package com.groupx.Tournament.Tournament;

import com.groupx.Member.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;


@Service
public class TournamentService {

    @Autowired
    private TournamentRepository tournamentRepository;

    public List<Tournament> getAllTournamentS(){
        return (List<Tournament>) tournamentRepository.findAll();
    }

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

    public Tournament findMembersbyStartDate(LocalDate StartDate) {
        return (Tournament) tournamentRepository.findMembersByStartDate(StartDate);
    }
}

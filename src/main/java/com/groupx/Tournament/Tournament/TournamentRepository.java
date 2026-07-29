package com.groupx.Tournament.Tournament;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface TournamentRepository extends CrudRepository<Tournament, Long> {
    List<Tournament> findByLocation(String location);

    List<Tournament> findTournamentByStartDate(LocalDate tournamentDate);

    List<Tournament> findMembersByStartDate(LocalDate StartDate);


}
package com.groupx.Tournament.Tournament;

import com.groupx.Member.Member;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Tournament {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long TournamentID;
    private LocalDate StartDate;
    private LocalDate EndDate;
    private String Location;
    private String PrizeAmount;

    @ManyToMany
    private List<Member> ParticipatingMembers = new ArrayList<>();

    public Long getTournamentID() {
        return TournamentID;
    }

    public void setTournamentID(Long TournamentID) {
        this.TournamentID = TournamentID;
    }

    public LocalDate getStartDate() {
        return StartDate;
    }

    public void setStartDate(LocalDate startDate) {
        StartDate = startDate;
    }

    public LocalDate getEndDate() {
        return EndDate;
    }

    public void setEndDate(LocalDate endDate) {
        EndDate = endDate;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getPrizeAmount() {
        return PrizeAmount;
    }

    public void setPrizeAmount(String prizeAmount) {
        PrizeAmount = prizeAmount;
    }

    public List<Member> getParticipatingMembers() {
        return ParticipatingMembers;
    }

    public void setParticipatingMembers(List<Member> participatingMembers) {
        ParticipatingMembers = participatingMembers;
    }
}

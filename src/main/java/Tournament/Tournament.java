package Tournament;

import Member.Member;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Tournament {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private LocalDate StartDate;
    private LocalDate EndDate;
    private String Location;
    private String PrizeAmount;

    private List<Member> ParticipatingMembers = new ArrayList<>();


    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
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

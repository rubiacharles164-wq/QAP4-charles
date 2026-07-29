package Member;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;


@Repository
public interface MemberRepository extends CrudRepository<Member, Long>{
    List<Member> findByNameIgnoreCase(String Name);

    List<Member> findByNameContainingIgnoreCase(String keyword);

    List<Member> findByTournamentDate(LocalDate tournamentDate);
}

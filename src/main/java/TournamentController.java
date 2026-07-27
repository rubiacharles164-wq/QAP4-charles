import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@CrossOrigin
public class TournamentController {

    @Autowired
    private TournamentService tournamentService;

    @GetMapping("/Tournaments")
    public List<Tournament> getAllTournaments() {
        return tournamentService.getAllTournamentS();
    }

    @GetMapping("/Tournaments/{StartDate}")
    public Tournament getTournamentByStartDate(@PathVariable String StartDate) {
        return tournamentService.findByTournamentDate(LocalDate.parse(StartDate));
    }

    @GetMapping("/Tournaments/{Location}")
    public Tournament getTournamentByLocation(@PathVariable String Location) {
        return tournamentService.findByLocation(Location);
    }

    @PostMapping("/Tournaments")
    public Tournament AddTournament(@RequestBody Tournament tournament){
        return tournamentService.addTournament(tournament);
    }
}

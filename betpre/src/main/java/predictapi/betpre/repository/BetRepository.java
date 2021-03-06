package predictapi.betpre.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import predictapi.betpre.domain.Bet;

import java.util.List;


@Repository
public interface BetRepository extends JpaRepository<Bet, Long>{

    List<Bet> findByTips(String tips);

}

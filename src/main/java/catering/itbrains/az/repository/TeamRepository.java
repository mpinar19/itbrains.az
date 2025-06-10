package catering.itbrains.az.repository;

import catering.itbrains.az.models.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team,Long> {
}

package catering.itbrains.az.repository;

import catering.itbrains.az.models.Cater;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CaterRepository extends JpaRepository<Cater,Long> {
}

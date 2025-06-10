package catering.itbrains.az.repository;

import catering.itbrains.az.models.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event,Long> {
}

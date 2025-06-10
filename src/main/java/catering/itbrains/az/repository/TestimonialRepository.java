package catering.itbrains.az.repository;

import catering.itbrains.az.models.Testimonial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestimonialRepository extends JpaRepository<Testimonial,Long> {
}

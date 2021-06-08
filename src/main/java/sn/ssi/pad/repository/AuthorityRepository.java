package sn.ssi.pad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.ssi.pad.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}

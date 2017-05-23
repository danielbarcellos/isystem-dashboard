package br.com.isystem.dashboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.isystem.dashboard.domain.Authority;

/**
 * Spring Data JPA repository for the Authority entity.
 */
@Repository
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}

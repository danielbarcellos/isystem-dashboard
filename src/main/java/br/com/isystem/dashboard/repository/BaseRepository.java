package br.com.isystem.dashboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.isystem.dashboard.domain.Base;
@Repository
public interface BaseRepository extends JpaRepository<Base, Long>{

}

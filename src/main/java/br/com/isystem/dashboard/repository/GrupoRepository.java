package br.com.isystem.dashboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.isystem.dashboard.domain.Grupo;
@Repository
public interface GrupoRepository extends JpaRepository<Grupo, Long>  {

}

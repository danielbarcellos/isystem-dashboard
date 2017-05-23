package br.com.isystem.dashboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.isystem.dashboard.domain.Grupo;

public interface GrupoRepository extends JpaRepository<Grupo, Long>  {

}

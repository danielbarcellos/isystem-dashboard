package br.com.isystem.dashboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.isystem.dashboard.domain.Base;

public interface BaseRepository extends JpaRepository<Base, Long>{

}

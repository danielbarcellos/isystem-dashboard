package br.com.isystem.dashboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.isystem.dashboard.domain.Monitor;

public interface MonitorRepository extends JpaRepository<Monitor, Long> {

}

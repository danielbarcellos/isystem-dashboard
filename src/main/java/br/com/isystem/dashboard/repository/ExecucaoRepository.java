package br.com.isystem.dashboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.isystem.dashboard.domain.Execucao;

public interface ExecucaoRepository extends JpaRepository<Execucao, Long>{

}

package br.com.isystem.dashboard.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.com.isystem.dashboard.service.dto.GrupoDTO;

public interface MonitorService {

	Page<GrupoDTO> getAllGroups(Pageable pageable);
}

package br.com.isystem.dashboard.web.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.isystem.dashboard.security.AuthoritiesConstants;
import br.com.isystem.dashboard.service.MonitorService;
import br.com.isystem.dashboard.service.dto.GrupoDTO;

@RestController
@RequestMapping("/api/monitor")
public class MonitorResource {
	
	private final Logger log = LoggerFactory.getLogger(UserResource.class);
	
	@Autowired
	MonitorService service;

	@GetMapping("/grupos")
    @Secured(AuthoritiesConstants.USER)
	public ResponseEntity<List<GrupoDTO>> getAllGrupos(Pageable pageable) {
		Page<GrupoDTO> page = this.service.getAllGroups(pageable);
		return new ResponseEntity<List<GrupoDTO>>(page.getContent(), HttpStatus.OK);
	}
	
}

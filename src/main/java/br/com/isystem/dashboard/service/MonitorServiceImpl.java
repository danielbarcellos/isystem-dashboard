package br.com.isystem.dashboard.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.isystem.dashboard.domain.Grupo;
import br.com.isystem.dashboard.repository.GrupoRepository;
import br.com.isystem.dashboard.service.dto.GrupoDTO;

@Service
@Transactional
public class MonitorServiceImpl implements MonitorService {

	private final Logger log = LoggerFactory.getLogger(MonitorServiceImpl.class);

//	@Autowired
//	private GrupoRepository grupoRepository;

	@Override
	public Page<GrupoDTO> getAllGroups(Pageable pageable) {
//		List<Grupo> all = this.grupoRepository.findAll();
//		if (CollectionUtils.isEmpty(all)) {
//			if (log.isDebugEnabled()) {
//				log.debug("grupos not found!");
//			}
//			return null;
//		}
//
//		final ArrayList<GrupoDTO> dtos = new ArrayList<GrupoDTO>();
//
//		all.stream().map(grupo -> {
//			GrupoDTO dto = new GrupoDTO();
//			dto.setIdGrupo(grupo.getIdGrupo());
//			dto.setHdCol1(grupo.getHdCol1());
//			dto.setHdCol2(grupo.getHdCol2());
//			dto.setHdCol3(grupo.getHdCol3());
//			dto.setHdCol4(grupo.getHdCol4());
//			dto.setHdCol5(grupo.getHdCol5());
//			dto.setNmGrupo(grupo.getNmGrupo());
//			dto.setQtCol(grupo.getQtCol());
//			dto.setSgGrupo(dto.getSgGrupo());
//			return dto;
//		}).forEach(dto -> dtos.add(dto));
//		;
//
//		return new PageImpl<GrupoDTO>(dtos);
		return null;
	}
}

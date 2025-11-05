package com.busmove.api.service;

import com.busmove.api.dto.request.VeiculoRequestDTO;
import com.busmove.api.dto.response.VeiculoResponseDTO;
import org.springframework.stereotype.Service;

@Service
public interface VeiculoService {

    VeiculoResponseDTO cadastrar(VeiculoRequestDTO dto);
}

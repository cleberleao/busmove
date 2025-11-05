package com.busmove.api.service;

import com.busmove.api.dto.request.VeiculoRequestDTO;
import com.busmove.api.dto.response.VeiculoResponseDTO;
import com.busmove.api.entity.Veiculo;
import com.busmove.api.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VeiculoService {

    @Autowired
    VeiculoRepository veiculoRepository;

    public VeiculoResponseDTO cadastrar(VeiculoRequestDTO dto) {
        Veiculo veiculo = new Veiculo(dto);
        Veiculo save = veiculoRepository.save(veiculo);
        return new VeiculoResponseDTO(save);
    }
}

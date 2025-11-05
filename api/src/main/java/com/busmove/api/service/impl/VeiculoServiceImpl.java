package com.busmove.api.service.impl;

import com.busmove.api.dto.request.VeiculoRequestDTO;
import com.busmove.api.dto.response.VeiculoResponseDTO;
import com.busmove.api.entity.Veiculo;
import com.busmove.api.repository.VeiculoRepository;
import com.busmove.api.service.VeiculoService;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class VeiculoServiceImpl implements VeiculoService {
    @Autowired
    private VeiculoRepository veiculoRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public VeiculoResponseDTO cadastrar(VeiculoRequestDTO dto) {
        Veiculo veiculo = modelMapper.map(dto, Veiculo.class);
        Veiculo save = veiculoRepository.save(veiculo);
        return modelMapper.map(save, VeiculoResponseDTO.class);
    }
}

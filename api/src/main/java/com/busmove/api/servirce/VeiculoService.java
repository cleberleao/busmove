package com.busmove.api.servirce;

import com.busmove.api.dto.RequestVeiculoDTO;
import com.busmove.api.dto.ResponseVeiculoDTO;
import com.busmove.api.entity.Veiculo;
import com.busmove.api.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VeiculoService {

    @Autowired
    VeiculoRepository veiculoRepository;

    public ResponseVeiculoDTO cadastrar(RequestVeiculoDTO dto) {
        Veiculo veiculo = new Veiculo(dto);
        Veiculo save = veiculoRepository.save(veiculo);
        return new ResponseVeiculoDTO(save);
    }
}

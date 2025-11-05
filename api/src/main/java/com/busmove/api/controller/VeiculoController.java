package com.busmove.api.controller;

import com.busmove.api.dto.RequestVeiculoDTO;
import com.busmove.api.dto.ResponseVeiculoDTO;
import com.busmove.api.entity.Veiculo;
import com.busmove.api.servirce.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/veiculos")
@CrossOrigin("*")
public class VeiculoController {

    @Autowired
    VeiculoService veiculoService;

    @PostMapping
    public ResponseEntity<ResponseVeiculoDTO> cadastrar(@RequestBody RequestVeiculoDTO dto){
        ResponseVeiculoDTO responseVeiculoDTO = veiculoService.cadastrar(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(responseVeiculoDTO);
    }
}

package com.busmove.api.controller;

import com.busmove.api.dto.request.VeiculoRequestDTO;
import com.busmove.api.dto.response.VeiculoResponseDTO;
import com.busmove.api.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/veiculos")
@CrossOrigin("*")
public class VeiculoController {

    @Autowired
    VeiculoService veiculoService;

    @PostMapping
    public ResponseEntity<VeiculoResponseDTO> cadastrar(@RequestBody VeiculoRequestDTO dto){
        VeiculoResponseDTO responseVeiculoDTO = veiculoService.cadastrar(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(responseVeiculoDTO);
    }
}

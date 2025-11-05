package com.busmove.api.controller;

import com.busmove.api.dto.request.VeiculoRequestDTO;
import com.busmove.api.dto.response.VeiculoResponseDTO;
import com.busmove.api.service.VeiculoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/veiculos")
@CrossOrigin("*")
public class VeiculoController {

    @Autowired
    VeiculoService veiculoService;

    @PostMapping
    @Operation(summary = "Cadastrar veiculo",
            description = "Cria um novo veiculo no sistema")
    @ApiResponses({
            @ApiResponse(responseCode = "201", description = "Veiculo criado com sucesso"),
            @ApiResponse(responseCode = "400", description = "Dados inválidos"),
            @ApiResponse(responseCode = "409", description = "Veiculo já existe")
    })
    @PreAuthorize("hasRole('EMPRESA') or hasRole('ADMIN')")
    public ResponseEntity<VeiculoResponseDTO> cadastrar(@Valid @RequestBody VeiculoRequestDTO dto){
        VeiculoResponseDTO cadastrar = veiculoService.cadastrar(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(cadastrar);
    }
}

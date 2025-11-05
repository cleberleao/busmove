package com.busmove.api.dto.response;

import com.busmove.api.entity.Veiculo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VeiculoResponseDTO {

    private int id;

    private String placa;

    private String modelo;

    private String cor;

    private String numeroLinha;

    public VeiculoResponseDTO(Veiculo veiculo) {
        this.id = veiculo.getId();
        this.modelo = veiculo.getModelo();
        this.cor = veiculo.getCor();
        this.placa = veiculo.getPlaca();
    }
}

package com.busmove.api.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VeiculoRequestDTO {
    private String placa;

    private String modelo;

    private String cor;

    private String numeroLinha;
}

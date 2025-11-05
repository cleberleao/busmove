package com.busmove.api.entity;

import com.busmove.api.dto.request.VeiculoRequestDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String placa;

    private String modelo;

    private String cor;

    private String numeroLinha;

    private LocalDate dataCriacao;

    private LocalDate dataUpdate;

    public Veiculo(VeiculoRequestDTO dto) {
        this.modelo = dto.getModelo();
        this.cor = dto.getCor();
        this.placa = dto.getPlaca();
        this.dataCriacao = LocalDate.now();
    }
}

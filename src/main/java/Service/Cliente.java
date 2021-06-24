package Service;


import lombok.Data;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


@Data
public class Cliente {

    private String nome;
    private String cpf;
    private LocalDate dataNascimeto;
    private Integer numeroDeFamiliar;

    public Cliente(String nome, String cpf, LocalDate dataNascimeto, Integer numeroDeFamiliar) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimeto = dataNascimeto;
        this.numeroDeFamiliar =numeroDeFamiliar;
    }
}

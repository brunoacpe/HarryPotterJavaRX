package br.com.letscode.ProjetoHarry.Entity;

import lombok.Data;

@Data
public class StudentDTO {

    private String nome;

    private String houseId;

    public StudentDTO(String nome, String houseId) {
        this.nome = nome;
        this.houseId = houseId;
    }


    public static StudentDTO of(Student student){
        return new StudentDTO(student.getNome(),student.getHouseId());
    }
}

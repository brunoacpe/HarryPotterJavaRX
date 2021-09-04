package br.com.letscode.ProjetoHarry.Entity;

import br.com.letscode.ProjetoHarry.Repository.HarryRepository;
import br.com.letscode.ProjetoHarry.RetrofitConfigs.RetrofitHarryService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class StudentWithHouse {

    private String nome;

    private String houseId;

    private String id;

    private House house;

    public StudentWithHouse(String nome, String houseId, String id) {
        this.nome = nome;
        this.houseId = houseId;
        this.id = id;
    }


    public static StudentWithHouse of(Student student, House house){

        return new StudentWithHouse(
                student.getNome(),
                student.getHouseId(),
                student.getId(),
                house
        );
    }
}

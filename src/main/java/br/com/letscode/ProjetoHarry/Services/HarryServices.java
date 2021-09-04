package br.com.letscode.ProjetoHarry.Services;

import br.com.letscode.ProjetoHarry.Entity.House;
import br.com.letscode.ProjetoHarry.Entity.Student;
import br.com.letscode.ProjetoHarry.Entity.StudentDTO;
import br.com.letscode.ProjetoHarry.Entity.StudentWithHouse;
import br.com.letscode.ProjetoHarry.Repository.HarryRepository;
import br.com.letscode.ProjetoHarry.RetrofitConfigs.RetrofitHarryService;
import br.com.letscode.ProjetoHarry.RetrofitConfigs.RetrofitInitializer;

import lombok.Getter;
import lombok.Setter;

import org.springframework.stereotype.Service;

import retrofit2.Retrofit;

import rx.Observable;


@Getter
@Setter
@Service
public class HarryServices {

    private final Retrofit retrofit;

    private final HarryRepository repository;
    public HarryServices(HarryRepository harryRepository){
        this.retrofit = RetrofitInitializer.getRetrofit();
        this.repository = harryRepository;
    }

    public StudentDTO getHouseId(String nome) {
        Student student = new Student();
        student.setNome(nome);
        student.setHouseId(retrofit.create(RetrofitHarryService.class)
                .getSortingHat()
                .toBlocking()
                .value()
                .getHouseId());
        repository.save(student);


        return StudentDTO.of(student);
    }

    public Observable<StudentWithHouse> getHousesById(String idHouse){
        House house = retrofit
                .create(RetrofitHarryService.class)
                .getHousesById(idHouse)
                .toBlocking()
                .first();

        return Observable.from(repository.findByHouseId(idHouse))
                .map(student -> StudentWithHouse.of(student,house));
    }
}

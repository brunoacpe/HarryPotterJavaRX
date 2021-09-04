package br.com.letscode.ProjetoHarry.Controller;



import br.com.letscode.ProjetoHarry.Entity.StudentDTO;
import br.com.letscode.ProjetoHarry.Entity.StudentRequest;
import br.com.letscode.ProjetoHarry.Entity.StudentWithHouse;
import br.com.letscode.ProjetoHarry.Services.HarryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rx.Observable;
import rx.Single;




@RestController
@RequestMapping("harry")
public class HarryController {

    @Autowired
    private HarryServices services;

    @PostMapping("/create")
    public Single<StudentDTO> createStudent(@RequestBody StudentRequest studentRequest) {
        return Single.just(services.getHouseId(studentRequest.getNome()));
    }

    @GetMapping("houses/{id}")
    public Observable<StudentWithHouse> getHousesById(@PathVariable String id) {
        return services.getHousesById(id);
    }

}

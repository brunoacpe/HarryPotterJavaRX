package br.com.letscode.ProjetoHarry.Repository;

import br.com.letscode.ProjetoHarry.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HarryRepository extends JpaRepository<Student,String> {

    List<Student> findByHouseId(String houseId);
}

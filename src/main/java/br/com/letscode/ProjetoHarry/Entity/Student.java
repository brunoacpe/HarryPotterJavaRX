package br.com.letscode.ProjetoHarry.Entity;

import com.google.gson.annotations.SerializedName;
import lombok.Data;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table
public class Student implements Serializable {

    private String nome;


    private String houseId;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

}

package br.com.letscode.ProjetoHarry.Entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;


@Data
public class House implements Serializable {

    private String id;

    private String name;

    private String animal;

    private String founder;

    private List<Object> values;
}

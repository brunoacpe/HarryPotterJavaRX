package br.com.letscode.ProjetoHarry.Entity;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class HouseID {

    @SerializedName(value="sorting-hat-choice")
    private String houseId;
}

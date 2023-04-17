package db.rawmaterial;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "material_type")
public class MaterialType extends Material{
    @Column(name = "drying")
    private boolean drying;

    public boolean isDrying() {
        return drying;
    }

    public void setDrying(boolean drying) {
        this.drying = drying;
    }
}

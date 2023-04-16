package db.equipment.equipmentmatching;

import db.equipment.mold.MoldBase;
import db.equipment.mold.MoldModifier;

import javax.persistence.*;

@Entity
@Table(name = "modifier_to_moldbase")
public class ModifierToMoldBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @ManyToOne(targetEntity = MoldModifier.class)
    @JoinColumn(name = "mold_modifier", referencedColumnName = "equipment_id", nullable = false)
    private MoldModifier moldModifier;
    @ManyToOne(targetEntity = MoldBase.class)
    @JoinColumn(name = "mold_base", referencedColumnName = "equipment_id", nullable = false)
    private MoldBase moldBase;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MoldModifier getMoldModifier() {
        return moldModifier;
    }

    public void setMoldModifier(MoldModifier moldModifier) {
        this.moldModifier = moldModifier;
    }

    public MoldBase getMoldBase() {
        return moldBase;
    }

    public void setMoldBase(MoldBase moldBase) {
        this.moldBase = moldBase;
    }
}

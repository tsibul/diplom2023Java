package db.equipment.equipmentmatching;

import db.equipment.mold.MoldInsert;
import db.equipment.mold.MoldModifier;

import javax.persistence.*;

@Entity
@Table(name = "insert_to_modifier")
public class InsertToModifier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @ManyToOne(targetEntity = MoldInsert.class)
    @JoinColumn(name = "mold_insert", referencedColumnName = "equipment_id", nullable = false)
    private MoldInsert moldInsert;
    @ManyToOne(targetEntity = MoldModifier.class)
    @JoinColumn(name = "mold_modifier", referencedColumnName = "equipment_id", nullable = false)
    private MoldModifier moldModifier;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MoldInsert getMoldInsert() {
        return moldInsert;
    }

    public void setMoldInsert(MoldInsert moldInsert) {
        this.moldInsert = moldInsert;
    }

    public MoldModifier getMoldModifier() {
        return moldModifier;
    }

    public void setMoldModifier(MoldModifier moldModifier) {
        this.moldModifier = moldModifier;
    }
}

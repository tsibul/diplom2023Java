package db.equipment;

import javax.persistence.*;

@Entity
@Table (name = "equipment_kind")
public class EquipmentKind {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "kind_id")
    private Long id;
    @Column(name = "kind_code", length = 2, nullable = false)
    private String kindCode;
    @Column(name = "kind_node", length = 40, nullable = false)
    private String kindName;

    public Long getId() {
        return id;
    }

    public String getKindCode() {
        return kindCode;
    }

    public void setKindCode(String kindCode) {
        this.kindCode = kindCode;
    }

    public String getKindName() {
        return kindName;
    }

    public void setKindName(String kindName) {
        this.kindName = kindName;
    }

}

package db.equipment.equipmentmatching;

import db.equipment.injectionmoldingmachine.InjectionMoldingMachine;
import db.equipment.mold.MoldBase;

import javax.persistence.*;

public class MoldBaseToInjectionMoldingMachine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @ManyToOne(targetEntity = MoldBase.class)
    @JoinColumn(name = "mold_base", referencedColumnName = "equipment_id", nullable = false)
    private MoldBase moldBase;
    @ManyToOne(targetEntity = InjectionMoldingMachine.class)
    @JoinColumn(name = "injection_molding_machine", referencedColumnName = "equipment_id", nullable = false)
    private InjectionMoldingMachine injectionMoldingMachine;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MoldBase getMoldBase() {
        return moldBase;
    }

    public void setMoldBase(MoldBase moldBase) {
        this.moldBase = moldBase;
    }

    public InjectionMoldingMachine getInjectionMoldingMachine() {
        return injectionMoldingMachine;
    }

    public void setInjectionMoldingMachine(InjectionMoldingMachine injectionMoldingMachine) {
        this.injectionMoldingMachine = injectionMoldingMachine;
    }
}

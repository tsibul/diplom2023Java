package db.equipment.equipmentmatching;

import db.equipment.injectionmoldingmachine.InjectionMoldingMachine;
import db.equipment.injectionmoldingmachine.SpacerPlate;
import db.equipment.mold.MoldBase;

import javax.persistence.*;
@Entity
@Table(name = "spacerplate_to_injectionmoldingmachine")
public class SpacerPlateToInjectionMoldingMachine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @ManyToOne(targetEntity = SpacerPlate.class)
    @JoinColumn(name = "spacer_plate", referencedColumnName = "equipment_id", nullable = false)
    private SpacerPlate spacerPlate;
    @ManyToOne(targetEntity = InjectionMoldingMachine.class)
    @JoinColumn(name = "injection_molding_machine", referencedColumnName = "equipment_id", nullable = false)
    private InjectionMoldingMachine injectionMoldingMachine;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SpacerPlate getSpacerPlate() {
        return spacerPlate;
    }

    public void setSpacerPlate(SpacerPlate spacerPlate) {
        this.spacerPlate = spacerPlate;
    }

    public InjectionMoldingMachine getInjectionMoldingMachine() {
        return injectionMoldingMachine;
    }

    public void setInjectionMoldingMachine(InjectionMoldingMachine injectionMoldingMachine) {
        this.injectionMoldingMachine = injectionMoldingMachine;
    }
}

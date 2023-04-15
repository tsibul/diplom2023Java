package db.equipment.mold;

import db.equipment.Equipment;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "mold_modifier")
public class MoldModifier extends Equipment {

    @Column(name = "mold_weight_kg")
    private int moldWeightKg;
    @Column(name = "mold_height_mm")
    private int moldHeightMm;
    @Column(name = "if_air")
    @ColumnDefault("false")
    private boolean ifAir;
    @Column(name = "if_hydraulic")
    @ColumnDefault("false")
    private boolean ifHydraulic;
    @Column(name = "number_air_valves")
    private int numberAirValves;
    @Column(name = "number_hydraulic_cylinders")
    private int numberHydraulicCylinders;
    @Column(name = "number_cavities")
    private int numberCavities;
    @Column(name = "if_changeable_insert")
    @ColumnDefault("false")
    private boolean ifChangeableInsert;
    @Column(name = "modifier_mount_time")
    private int modifierMountTime;
    @Column(name = "modifier_release_time")
    private int modifierReleaseTime;

    public int getMoldWeightKg() {
        return moldWeightKg;
    }

    public void setMoldWeightKg(int moldWeightKg) {
        this.moldWeightKg = moldWeightKg;
    }

    public int getMoldHeightMm() {
        return moldHeightMm;
    }

    public void setMoldHeightMm(int moldHeightMm) {
        this.moldHeightMm = moldHeightMm;
    }

    public boolean isIfAir() {
        return ifAir;
    }

    public void setIfAir(boolean ifAir) {
        this.ifAir = ifAir;
    }

    public boolean isIfHydraulic() {
        return ifHydraulic;
    }

    public void setIfHydraulic(boolean ifHydraulic) {
        this.ifHydraulic = ifHydraulic;
    }

    public int getNumberAirValves() {
        return numberAirValves;
    }

    public void setNumberAirValves(int numberAirValves) {
        this.numberAirValves = numberAirValves;
    }

    public int getNumberHydraulicCylinders() {
        return numberHydraulicCylinders;
    }

    public void setNumberHydraulicCylinders(int numberHydraulicCylinders) {
        this.numberHydraulicCylinders = numberHydraulicCylinders;
    }

    public int getNumberCavities() {
        return numberCavities;
    }

    public void setNumberCavities(int numberCavities) {
        this.numberCavities = numberCavities;
    }

    public boolean isIfChangeableInsert() {
        return ifChangeableInsert;
    }

    public void setIfChangeableInsert(boolean ifChangeableInsert) {
        this.ifChangeableInsert = ifChangeableInsert;
    }

    public int getModifierMountTime() {
        return modifierMountTime;
    }

    public void setModifierMountTime(int modifierMountTime) {
        this.modifierMountTime = modifierMountTime;
    }

    public int getModifierReleaseTime() {
        return modifierReleaseTime;
    }

    public void setModifierReleaseTime(int modifierReleaseTime) {
        this.modifierReleaseTime = modifierReleaseTime;
    }
}

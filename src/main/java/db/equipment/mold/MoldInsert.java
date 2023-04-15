package db.equipment.mold;

import db.equipment.Equipment;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;

@Entity
@Table(name = "mold_insert")
public class MoldInsert extends Equipment {
    @Column(name = "insert_code", length = 2)
    private String modifierCode;
    @Column(name = "insert_name", length = 100)
    private String modifierName;
    @Column(name = "number_cavities", nullable = false)
    private int numberCavities;
    @Column(name = "number_working_cavities", nullable = false)
    private int numberWorkingCavities;
    @Column(name = "plan_cycle_time")
    private int planCycleTime;
    @Column(name = "insert_mount_time")
    private int insertMountTime;
    @Column(name = "insert_release_time")
    private int insertReleaseTime;
    @Column(name = "single_insert")
    @ColumnDefault("true")
    private boolean singleInsert;
    @Column(name = "insert_mounted")
    @ColumnDefault("true")
    private boolean insertMounted;
    @ManyToOne(targetEntity = MoldModifier.class)
    @JoinColumn(name = "insert_mounted_to", referencedColumnName = "equipment_id")
    private MoldModifier insertMountedTo;

    public boolean isInsertMounted() {
        return insertMounted;
    }

    public void setInsertMounted(boolean insertMounted) {
        if(!this.isSingleInsert()){
        this.insertMounted = insertMounted;}
    }


    public MoldModifier getInsertMountedTo() {
        return insertMountedTo;
    }

    public void setInsertMountedTo(MoldModifier insertMountedTo) {
        if(!this.isSingleInsert()){
        this.insertMountedTo = insertMountedTo;}
    }

    public String getModifierCode() {
        return modifierCode;
    }

    public void setModifierCode(String modifierCode) {
        this.modifierCode = modifierCode;
    }

    public String getModifierName() {
        return modifierName;
    }

    public void setModifierName(String modifierName) {
        this.modifierName = modifierName;
    }

    public int getNumberCavities() {
        return numberCavities;
    }

    public void setNumberCavities(int numberCavities) {
        this.numberCavities = numberCavities;
    }

    public int getNumberWorkingCavities() {
        return numberWorkingCavities;
    }

    public void setNumberWorkingCavities(int numberWorkingCavities) {
        this.numberWorkingCavities = numberWorkingCavities;
    }

    public int getPlanCycleTime() {
        return planCycleTime;
    }

    public void setPlanCycleTime(int planCycleTime) {
        this.planCycleTime = planCycleTime;
    }

    public int getInsertMountTime() {
        return insertMountTime;
    }

    public void setInsertMountTime(int insertMountTime) {
        this.insertMountTime = insertMountTime;
    }

    public int getInsertReleaseTime() {
        return insertReleaseTime;
    }

    public void setInsertReleaseTime(int insertReleaseTime) {
        this.insertReleaseTime = insertReleaseTime;
    }

    public boolean isSingleInsert() {
        return singleInsert;
    }

    public void setSingleInsert(boolean singleInsert) {
        this.singleInsert = singleInsert;
    }
}

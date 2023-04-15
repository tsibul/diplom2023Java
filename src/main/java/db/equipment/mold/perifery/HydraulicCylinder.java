package db.equipment.mold.perifery;

import db.equipment.Equipment;
import db.equipment.injectionmoldingmachine.InjectionMoldingMachine;
import db.equipment.mold.MoldInsert;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;

@Entity
@Table(name = "hydraulic_cylinder")
public class HydraulicCylinder extends Equipment {
    @Column(name = "stroke_length", nullable = false)
    private int strokeLengthMm;
    @Column(name = "cylinder_length_mm")
    private int cylinderLengthMm;
    @Column(name = "cylinder_width_mm")
    private int cylinderWidthMm;
    @Column(name = "cylinder_mounted")
    @ColumnDefault("true")
    private boolean cylinderMounted;
    @ManyToOne(targetEntity = MoldInsert.class)
    @JoinColumn(name = "cylinder_mounted_to", referencedColumnName = "equipment_id")
    private MoldInsert cylinderMountedTo;

    public boolean isCylinderMounted() {
        return cylinderMounted;
    }

    public void setCylinderMounted(boolean cylinderMounted) {
        this.cylinderMounted = cylinderMounted;
    }

    public MoldInsert getCylinderMountedTo() {
        return cylinderMountedTo;
    }

    public void setCylinderMountedTo(MoldInsert cylinderMountedTo) {
        this.cylinderMountedTo = cylinderMountedTo;
    }

    public int getStrokeLengthMm() {
        return strokeLengthMm;
    }

    public void setStrokeLengthMm(int strokeLengthMm) {
        this.strokeLengthMm = strokeLengthMm;
    }

    public int getCylinderLengthMm() {
        return cylinderLengthMm;
    }

    public void setCylinderLengthMm(int cylinderLengthMm) {
        this.cylinderLengthMm = cylinderLengthMm;
    }

    public int getCylinderWidthMm() {
        return cylinderWidthMm;
    }

    public void setCylinderWidthMm(int cylinderWidthMm) {
        this.cylinderWidthMm = cylinderWidthMm;
    }
}

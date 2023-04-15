package db.equipment.mold.perifery;

import db.equipment.Equipment;

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

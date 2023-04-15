package db.equipment.injectionmoldingmachine;

import db.equipment.Equipment;

import javax.persistence.*;

@Entity
@Table(name = "spacer_plate")
public class SpacerPlate extends Equipment {
    @Column(name = "plate_height_mm", nullable = false)
    private int plateHeightMm;
    @Column(name = "plate_width_mm", nullable = false)
    private int plateWidthMm;
    @Column(name = "plate_length_mm", nullable = false)
    private int plateLengthMm;
    @Column(name = "plate_weight_kg")
    private int plateWeightKg;
    @Column(name = "plate_mount_time_min")
    private int plateMountTimeMin;
    @Column(name = "plate_release_time_min")
    private int plateReleaseTimeMin;
    @Column(name = "mounting_ring_diameter_mm")
    private int mountingRingDiameterMm;
    @Column(name = "mold_ring_diameter_mm")
    private int moldRingDiameterMm;

    public int getPlateHeightMm() {
        return plateHeightMm;
    }

    public void setPlateHeightMm(int plateHeightMm) {
        this.plateHeightMm = plateHeightMm;
    }

    public int getPlateWidthMm() {
        return plateWidthMm;
    }

    public void setPlateWidthMm(int plateWidthMm) {
        this.plateWidthMm = plateWidthMm;
    }

    public int getPlateLengthMm() {
        return plateLengthMm;
    }

    public void setPlateLengthMm(int plateLengthMm) {
        this.plateLengthMm = plateLengthMm;
    }

    public int getPlateWeightKg() {
        return plateWeightKg;
    }

    public void setPlateWeightKg(int plateWeightKg) {
        this.plateWeightKg = plateWeightKg;
    }

    public int getPlateMountTimeMin() {
        return plateMountTimeMin;
    }

    public void setPlateMountTimeMin(int plateMountTimeMin) {
        this.plateMountTimeMin = plateMountTimeMin;
    }

    public int getPlateReleaseTimeMin() {
        return plateReleaseTimeMin;
    }

    public void setPlateReleaseTimeMin(int plateReleaseTimeMin) {
        this.plateReleaseTimeMin = plateReleaseTimeMin;
    }

    public int getMountingRingDiameterMm() {
        return mountingRingDiameterMm;
    }

    public void setMountingRingDiameterMm(int mountingRingDiameterMm) {
        this.mountingRingDiameterMm = mountingRingDiameterMm;
    }

    public int getMoldRingDiameterMm() {
        return moldRingDiameterMm;
    }

    public void setMoldRingDiameterMm(int moldRingDiameterMm) {
        this.moldRingDiameterMm = moldRingDiameterMm;
    }
}

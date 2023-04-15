package db.equipment.mold;

import db.equipment.Equipment;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;

@Entity
@Table(name = "mold_base")
public class MoldBase extends Equipment {
    @Column(name = "mold_base_width_mm", nullable = false)
    private int moldBaseWidthMm;
    @Column(name = "mold_base_length_mm", nullable = false)
    private int moldBaseLengthMm;
    @Column(name = "if_changeable_modifier")
    @ColumnDefault("false")
    private boolean ifChangeableModifier;
    @Column(name = "hot_runner")
    @ColumnDefault("false")
    private boolean hotRunner;
    @Column(name = "moving_plate_diameter_mm")
    private int movingPlateRingDiameterMm;
    @Column(name = "fixed_plate_diameter_mm")
    private int fixedPlateRingDiameterMm;
    @Column(name = "mold_mount_time_min")
    private int moldMountTimeMin;
    @Column(name = "mold_release_time_min")
    private int moldReleaseTimeMin;

    public int getMoldBaseWidthMm() {
        return moldBaseWidthMm;
    }

    public void setMoldBaseWidthMm(int moldBaseWidthMm) {
        this.moldBaseWidthMm = moldBaseWidthMm;
    }

    public int getMoldBaseLengthMm() {
        return moldBaseLengthMm;
    }

    public void setMoldBaseLengthMm(int moldBaseLengthMm) {
        this.moldBaseLengthMm = moldBaseLengthMm;
    }

    public boolean isIfChangeableModifier() {
        return ifChangeableModifier;
    }

    public void setIfChangeableModifier(boolean ifChangeableModifier) {
        this.ifChangeableModifier = ifChangeableModifier;
    }

    public boolean isHotRunner() {
        return hotRunner;
    }

    public void setHotRunner(boolean hotRunner) {
        this.hotRunner = hotRunner;
    }

    public int getMovingPlateRingDiameterMm() {
        return movingPlateRingDiameterMm;
    }

    public void setMovingPlateRingDiameterMm(int movingPlateRingDiameterMm) {
        this.movingPlateRingDiameterMm = movingPlateRingDiameterMm;
    }

    public int getFixedPlateRingDiameterMm() {
        return fixedPlateRingDiameterMm;
    }

    public void setFixedPlateRingDiameterMm(int fixedPlateRingDiameterMm) {
        this.fixedPlateRingDiameterMm = fixedPlateRingDiameterMm;
    }

    public int getMoldMountTimeMin() {
        return moldMountTimeMin;
    }

    public void setMoldMountTimeMin(int moldMountTimeMin) {
        this.moldMountTimeMin = moldMountTimeMin;
    }

    public int getMoldReleaseTimeMin() {
        return moldReleaseTimeMin;
    }

    public void setMoldReleaseTimeMin(int moldReleaseTimeMin) {
        this.moldReleaseTimeMin = moldReleaseTimeMin;
    }
}

package db.equipment;

import javax.persistence.*;

@Entity
@Table (name = "imm")
public class Imm extends Equipment {
    @Column(name = "molding_pressure_kn")
    private int moldingPressureKn;
    private int plateHeight;
    private int plateWidth;
    private int columnGap;
    private int strokeVolume;
    private int strokeWeight;
    private int heightMm;
    private int widthMm;
    private int lengthMm;
    private int weightKg;
    private int electricCapacityW;
    private int maxMoldWeightKg;
    private int minMoldHeightMm;
    private int maxMoldHeightMm;
    private int movingPlateRingDiameterMm;
    private int fixedPlateRingDiameterMm;
    private int numberAirValves;
    private int numberHydraulicValves;
    private boolean euroMapInterface;
    private String immType;



}

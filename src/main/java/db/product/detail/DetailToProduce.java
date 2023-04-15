package db.product.detail;

import db.product.color.Color;

import javax.persistence.*;

@Entity
@Table(name = "detail_to_produce")
public class DetailToProduce extends Detail{
    @Column(name = "actual_weight_g", nullable = false, precision = 1)
    private double actualWeightG;
    @Column(name = "actual_material", length = 40)
    private String actualMaterial;
    @Column(name = "doze_master_batch", precision = 2, nullable = false)
    private double dozeMasterBatch;
    @Column(name = "masterBatchName", length = 40)
    private String masterBatchName;
    @ManyToOne(targetEntity = Color.class)
    @JoinColumn(name = "color", referencedColumnName = "color_id", nullable = false)
    private Color color;

    public double getActualWeightG() {
        return actualWeightG;
    }

    public void setActualWeightG(int actualWeightG) {
        this.actualWeightG = actualWeightG;
    }

    public String getActualMaterial() {
        return actualMaterial;
    }

    public void setActualMaterial(String actualMaterial) {
        this.actualMaterial = actualMaterial;
    }

    public double getDozeMasterBatch() {
        return dozeMasterBatch;
    }

    public void setDozeMasterBatch(double dozeMasterBatch) {
        this.dozeMasterBatch = dozeMasterBatch;
    }

    public String getMasterBatchName() {
        return masterBatchName;
    }

    public void setMasterBatchName(String masterBatchName) {
        this.masterBatchName = masterBatchName;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}

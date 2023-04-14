package db.equipment;

import db.producer.Producer;

import javax.persistence.*;
import java.util.Date;
import db.equipment.EquipmentKind;
@MappedSuperclass
public abstract class Equipment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne(targetEntity = EquipmentKind.class)
    @JoinColumn(name = "equpment_kind", referencedColumnName = "kind_id")
    protected EquipmentKind equipmentKind;

    @ManyToOne(targetEntity = EquipmentType.class)
    @JoinColumn(name = "equipment_type", referencedColumnName = "type_id")
    private EquipmentType equipmentType;
    private String equipmentCode;
    protected String equipmentName;
    private String modificatorCode;
    private String modificatorName;
    private String insertCode;
    private String insertName;
    @ManyToOne(targetEntity = Producer.class)
    @JoinColumn(name = "producer", referencedColumnName = "id")
    private Producer equipmentProducer;
    private String partNumber;
    private String yearProduction;
    private Date receiveDate;

    public EquipmentKind getEquipmentKind() {
        return equipmentKind;
    }

    public void setEquipmentKind(EquipmentKind equipmentKind) {
        this.equipmentKind = equipmentKind;
    }

    public EquipmentType getEquipmentType() {
        return equipmentType;
    }

    public void setEquipmentType(EquipmentType equipmentType) {
        this.equipmentType = equipmentType;
    }

    public String getEquipmentCode() {
        return equipmentCode;
    }

    public void setEquipmentCode(String equipmentCode) {
        this.equipmentCode = equipmentCode;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    public String getModificatorCode() {
        return modificatorCode;
    }

    public void setModificatorCode(String modificatorCode) {
        this.modificatorCode = modificatorCode;
    }

    public String getModificatorName() {
        return modificatorName;
    }

    public void setModificatorName(String modificatorName) {
        this.modificatorName = modificatorName;
    }

    public String getInsertCode() {
        return insertCode;
    }

    public void setInsertCode(String insertCode) {
        this.insertCode = insertCode;
    }

    public String getInsertName() {
        return insertName;
    }

    public void setInsertName(String insertName) {
        this.insertName = insertName;
    }

    public Producer getEquipmentProducer() {
        return equipmentProducer;
    }

    public void setEquipmentProducer(Producer equipmentProducer) {
        this.equipmentProducer = equipmentProducer;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getYearProduction() {
        return yearProduction;
    }

    public void setYearProduction(String yearProduction) {
        this.yearProduction = yearProduction;
    }

    public Date getReceiveDate() {
        return receiveDate;
    }

    public void setReceiveDate(Date receiveDate) {
        this.receiveDate = receiveDate;
    }
}

package lists.equipment.mold;

import db.equipment.Equipment;
import db.equipment.mold.MoldBase;
import db.equipment.mold.MoldModifier;
import lists.equipment.EquipmentList;

import java.util.ArrayList;

public class MoldModifierList implements EquipmentList<MoldModifier, MoldBase> {
    private ArrayList<MoldModifier> moldModifiers;

    @Override
    public void addEquipment(MoldModifier moldModifier) {

    }

    @Override
    public int mountEquipment(MoldModifier moldModifier, MoldBase moldBase) {
        return 0;
    }

    @Override
    public int releaseEquipment(MoldModifier moldModifier) {
        return 0;
    }

    @Override
    public ArrayList equipmentMounted() {
        return null;
    }

    @Override
    public ArrayList equipmentReleased() {
        return null;
    }

    @Override
    public boolean equipmentReady(MoldModifier moldModifier) {
        return false;
    }

    @Override
    public boolean equipmentDismounted(MoldModifier moldModifier) {
        return false;
    }

}

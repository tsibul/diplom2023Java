package lists.equipment;

import db.equipment.Equipment;

import java.util.ArrayList;

public interface EquipmentList<Eq extends Equipment, EqParent extends Equipment> {
    void addEquipment(Eq eq);
    int mountEquipment(Eq eq, EqParent eqTo);
    int releaseEquipment(Eq eq);
    ArrayList<Eq> equipmentMounted();
    ArrayList<Eq> equipmentReleased();
    boolean equipmentReady(Eq eq);
    boolean equipmentDismounted(Eq eq);
}

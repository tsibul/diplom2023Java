package init;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class DbInit {

    public static void dbInit(){
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();

        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

        SessionFactory factory = meta.getSessionFactoryBuilder().build();
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();
/*
        EquipmentKind equipmentK =new EquipmentKind();
        equipmentK.setKindCode("01");
        equipmentK.setKindName("Станок/Линия");

        session.save(equipmentK);
*/
        t.commit();
        System.out.println("successfully saved");
        factory.close();
        session.close();

    }
}

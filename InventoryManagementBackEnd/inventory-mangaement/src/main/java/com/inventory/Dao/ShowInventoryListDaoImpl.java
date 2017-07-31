package com.inventory.Dao;

import com.inventory.Entity.ProductDetails;
import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.type.IntegerType;
import org.hibernate.type.StringType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.Collection;

/**
 * Created by abin on 7/31/2017.
 */
@Repository
public class ShowInventoryListDaoImpl implements ShowInventoryListDao {
    @Autowired
    SessionFactory sessionFactory;
    Session session;
    @Override
    public Collection<ProductDetails> getInventoryList() {
        try {
            session=sessionFactory.openSession();
            String sql="select * from productdetails";
            SQLQuery query= session.createSQLQuery(sql);
             query.addScalar("id", IntegerType.INSTANCE);
             query.addScalar("productName", StringType.INSTANCE);
             query.addScalar("price",IntegerType.INSTANCE);
             query.addScalar("weight", IntegerType.INSTANCE);
             return query.list();
        } catch (HibernateException e) {
            e.printStackTrace();
            return null;
        } finally {
            session.close();
        }

    }
}

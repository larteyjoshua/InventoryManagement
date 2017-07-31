package com.inventory.Dao;

import com.inventory.Entity.ProductDetails;
import com.inventory.Models.ProductDetailsPojo;
import org.hibernate.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;

/**
 * Created by abin on 7/31/2017.
 */
@Repository
public class AddInventoryDaoImpl implements AddInventoryDao {
    @Autowired
    SessionFactory sessionFactory;
    Session session;
    Transaction transaction;
    @Override
    public void addInventory(ProductDetailsPojo productDetailsPojo) {
        System.out.println("inside dao");
        try {
            session=sessionFactory.openSession();
            String sql="INSERT into productdetails(productName,price,weight) values (:prodName,:price,:weight)";
            SQLQuery query=  session.createSQLQuery(sql);
            query.setParameter("prodName",productDetailsPojo.getProductName());
            query.setParameter("price",productDetailsPojo.getProductPrice());
            query.setParameter("weight",productDetailsPojo.getProductWeight());
            query.executeUpdate();
        } catch (HibernateException e) {
            e.printStackTrace();
            System.out.println("error detected");

        } finally {
            session.close();
        }
    }
}

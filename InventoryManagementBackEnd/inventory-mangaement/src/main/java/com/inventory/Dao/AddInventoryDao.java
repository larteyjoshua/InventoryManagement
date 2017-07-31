package com.inventory.Dao;

import com.inventory.Entity.ProductDetails;
import com.inventory.Models.ProductDetailsPojo;

import java.util.Collection;

/**
 * Created by abin on 7/31/2017.
 */
public interface AddInventoryDao {
    public void addInventory(ProductDetailsPojo productDetailsPojo);
}

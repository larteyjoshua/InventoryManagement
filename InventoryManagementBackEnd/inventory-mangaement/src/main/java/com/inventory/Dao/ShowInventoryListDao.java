package com.inventory.Dao;

import com.inventory.Entity.ProductDetails;

import java.util.Collection;

/**
 * Created by abin on 7/31/2017.
 */
public interface ShowInventoryListDao {
    Collection <ProductDetails> getInventoryList();
}

package com.inventory.Services;

import com.inventory.Dao.AddInventoryDao;
import com.inventory.Models.ProductDetailsPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by abin on 7/31/2017.
 */
@Service
public class AddInvetoryServiceImpl implements AddInvetoryService {
    @Autowired
    AddInventoryDao addInventoryDao;

    @Override
    public void addInventory(ProductDetailsPojo productDetailsPojo) {
        System.out.println("inside service layer");
        addInventoryDao.addInventory(productDetailsPojo);
    }
}

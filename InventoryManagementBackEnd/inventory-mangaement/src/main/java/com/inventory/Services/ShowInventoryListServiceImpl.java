package com.inventory.Services;

import com.inventory.Dao.ShowInventoryListDao;
import com.inventory.Entity.ProductDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created by abin on 7/31/2017.
 */
@Service
public class ShowInventoryListServiceImpl implements ShowInventoryListService {
    @Autowired
    ShowInventoryListDao showInventoryListDao;
    @Override
    public List<Map<String, Object>> showInventories() {
        Collection<ProductDetails> response=showInventoryListDao.getInventoryList();
        List<Map<String,Object>> finalList=new ArrayList<>();
        for (Object object:response){
            Object[] objects= (Object[]) object;
            Integer id= (Integer) objects[0];
            String prodName= (String) objects[1];
            Integer price= (Integer) objects[2];
            Integer weight= (Integer) objects[3];
            Map<String,Object> finalMap=new LinkedHashMap<>();
            finalMap.put("id",id);
            finalMap.put("productName",prodName);
            finalMap.put("price",price);
            finalMap.put("weight",weight);
            finalList.add(finalMap);
        }
        return finalList;
    }
}

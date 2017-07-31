package com.inventory.Controllers;

import com.inventory.Models.ProductDetailsPojo;
import com.inventory.Services.AddInvetoryService;
import com.inventory.Services.ShowInventoryListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * Created by abin on 7/31/2017.
 */
@CrossOrigin
@RestController
public class DefaultController {
    @Autowired
    ShowInventoryListService showInventoryListService;
    @Autowired
    AddInvetoryService addInvetoryService;
    @RequestMapping(value = "/products",method = RequestMethod.POST)

    public List<Map<String, Object>> home(){
        return showInventoryListService.showInventories();
    }
    @RequestMapping(value="/addProducts",method=RequestMethod.POST)
    public void addInventory(@RequestBody ProductDetailsPojo productDetailsPojo){
        System.out.println("inside contorlller");
        addInvetoryService.addInventory(productDetailsPojo);
    }
}

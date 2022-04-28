package com.alpha.toptotop.controllers;

import com.alpha.toptotop.models.Top;
import com.alpha.toptotop.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/admin")
public class InventoryManagementController {

    @Autowired
    AdminService adminService;

    @PostMapping(path = "/create-new-top")
    public String createNewTop(@RequestBody Top top){
        return adminService.addNewTop(top);
    }

    @PutMapping(path = "/update-top")
    public String updateTop(Top top){
        return adminService.addNewTop(top);
    }

    @GetMapping(path = "{id}")
    public String getTop(@PathVariable ("id") int id ){
        return adminService.getTop(id);
    }

    @GetMapping(path = "/tops")
    public String getTops(){
        return adminService.getAllTops();
    }

    @DeleteMapping(path = "/delete/{id}")
    public String deleteTops(@PathVariable ("id") String id){
        return adminService.deleteTops(id);
    }
}

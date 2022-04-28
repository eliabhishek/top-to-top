package com.alpha.toptotop.controllers;

import com.alpha.toptotop.models.Top;
import com.alpha.toptotop.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/admin")
public class InventoryManagementController {

    @Autowired
    AdminService adminService;

    @PostMapping(path = "/create-new-top")
    public String createNewTop(@RequestBody Top top){
        return adminService.addNewTop(top);
    }

    @PutMapping(path = "/update-top/{id}")
    public String updateTop(@PathVariable ("id") String id, @RequestBody Top top){
        return adminService.updateTop(id,top);
    }

    @GetMapping(path = "{id}")
    public Optional<Top> getTop(@PathVariable ("id") String id ){
        return adminService.getTop(id);
    }

    @GetMapping(path = "/tops")
    public Iterable<Top> getTops(){
        return adminService.getAllTops();
    }

    @DeleteMapping(path = "/delete/{id}")
    public String deleteTops(@PathVariable ("id") String id){
        return adminService.deleteTops(id);
    }
}

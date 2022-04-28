package com.alpha.toptotop.services;

import com.alpha.toptotop.models.Top;
import com.alpha.toptotop.repositories.TopsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    TopsRepository topsRepository;

    public String addNewTop(Top top) {
        topsRepository.save(top);
        return "added";
    }

    public String getTop(int id) {
//        topsRepository.getById(id);
        return Integer.toString(id);
    }

    public String getAllTops() {
//        topsRepository.getall;
        return "all tops";
    }

    public String deleteTops(String id) {
        topsRepository.deleteById(id);
        return "deleted";
    }
}

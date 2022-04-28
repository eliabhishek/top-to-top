package com.alpha.toptotop.services;

import com.alpha.toptotop.models.Top;
import com.alpha.toptotop.repositories.TopsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AdminService {

    @Autowired
    TopsRepository topsRepository;

    public String addNewTop(Top top) {
        topsRepository.save(top);
        return "added";
    }

    public Optional<Top> getTop(String id) {
        return topsRepository.findById(id);
    }

    public Iterable<Top> getAllTops() {
       return topsRepository.findAll();
    }

    public String deleteTops(String id) {
        topsRepository.deleteById(id);
        return "deleted";
    }

    public String updateTop(String id, Top top) {
        if (topsRepository.existsById(id)){
            topsRepository.deleteById(id);
            topsRepository.save(top);
        }
        return "updated";
    }
}

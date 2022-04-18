package com.alpha.toptotop.services;

import com.alpha.toptotop.models.Top;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    public String addNewTop(Top top) {
        return "added";
    }

    public String getTop(int id) {
        return Integer.toString(id);
    }

    public String getAllTops() {
        return "all tops";
    }

    public String deleteTops() {
        return "deleted";
    }
}

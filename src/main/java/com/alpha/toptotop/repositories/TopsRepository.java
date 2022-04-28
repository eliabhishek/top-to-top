package com.alpha.toptotop.repositories;

import com.alpha.toptotop.models.Top;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopsRepository extends JpaRepository<Top, String> {
}

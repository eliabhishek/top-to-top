package com.alpha.toptotop.repositories;

import com.alpha.toptotop.models.Top;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopsRepository extends CrudRepository<Top, String> {
}

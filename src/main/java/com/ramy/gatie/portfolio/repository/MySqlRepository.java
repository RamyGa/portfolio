package com.ramy.gatie.portfolio.repository;

import com.ramy.gatie.portfolio.models.MySqlDataEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MySqlRepository extends JpaRepository<MySqlDataEntity, Integer> {

    List<MySqlDataEntity> findAllByName(String name);


}

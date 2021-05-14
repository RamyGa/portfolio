package com.ramy.gatie.portfolio.service;

import com.ramy.gatie.portfolio.models.MySqlDataEntity;
import com.ramy.gatie.portfolio.models.dto.MySqlDataDTO;
import com.ramy.gatie.portfolio.repository.MySqlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class PortfolioService {

    private final MySqlRepository mySqlRepository;


    @Autowired
    public PortfolioService(MySqlRepository mySqlRepository) {
        this.mySqlRepository = mySqlRepository;
    }

    public void SaveDataToDatabase(MySqlDataEntity mySqlDataEntity){
        mySqlRepository.save(mySqlDataEntity);
    }

    public List<MySqlDataDTO> RetrieveDataFromDatabase(String name){
        List<MySqlDataEntity> mySqlDataEntities = mySqlRepository.findAllByName(name);
        List<MySqlDataDTO> mySqlDataDTOList = new ArrayList<>();
        for (MySqlDataEntity mySqlDataEntity: mySqlDataEntities) {
            mySqlDataDTOList.add(new MySqlDataDTO(mySqlDataEntity.getName(),mySqlDataEntity.getFavoritePokemon(),mySqlDataEntity.getId()));
        }
       return mySqlDataDTOList;
    }



}

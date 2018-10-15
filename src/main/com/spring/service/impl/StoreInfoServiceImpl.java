package main.com.spring.service.impl;

import main.com.spring.mapper.StoreInfoMapper;
import main.com.spring.model.StoreInfo;
import main.com.spring.service.StoreInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoreInfoServiceImpl implements StoreInfoService {
    @Autowired
    private StoreInfoMapper storeInfoMapper;
    @Override
    public int insertUserInfo(StoreInfo storeInfo) {
        return storeInfoMapper.insert(storeInfo);
    }
}

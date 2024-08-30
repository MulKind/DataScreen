package com.klind.service.impl;

import com.klind.entity.data;
import com.klind.service.DataService;
import com.klind.mapper.DataMapper;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Slf4j
@Service
public class DataServiceImpl implements DataService {
    @Resource
    DataMapper dataMapper;

    @Override
    @Transactional
    public List<data> getData(){
        return dataMapper.getData();
    }
}

package com.bai.service.impl;

import com.bai.dao.ItemsMapper;
import com.bai.domain.Items;
import com.bai.service.IItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ItemsService implements IItemsService {

    @Autowired
    private ItemsMapper itemsMapper;
    @Override
    public List<Items> findall() {
        return itemsMapper.findall();
    }

    @Override
    public int deleteById(Integer id) {
        return 0;
    }

    @Override
    public int addItems(Items items) {
        return 0;
    }

    @Override
    public Items findById(Integer id) {
        return null;
    }

    @Override
    public int saveItems(Items items) {
        return 0;
    }
}

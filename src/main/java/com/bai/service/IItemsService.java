package com.bai.service;

import com.bai.domain.Items;

import java.util.List;

public interface IItemsService {
    public List<Items> findall();
    public int deleteById(Integer id);
    public int  addItems(Items items);
    public Items findById(Integer id);
    public int saveItems(Items items);
}

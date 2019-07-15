package com.bai.dao;

import com.bai.domain.Items;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ItemsMapper {

    public List<Items> findall();
    public int deleteById(Integer id);
    public int  addItems(Items items);
    public Items findById(Integer id);
    public int saveItems(Items items);
}

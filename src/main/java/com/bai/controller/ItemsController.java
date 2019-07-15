package com.bai.controller;

import com.bai.domain.Items;
import com.bai.service.IItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ItemsController {
    @Autowired
    private IItemsService itemsService;
    @RequestMapping("/findall")
    public  String findAll(Model model){
        List<Items> itemsList=itemsService.findall();
        model.addAttribute("itemsList",itemsList);
        return "showitems";
    }


}

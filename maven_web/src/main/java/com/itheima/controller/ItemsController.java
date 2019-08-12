package com.itheima.controller;

import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/items")
public class ItemsController {

    @Autowired
    private ItemsService itemService;

    @RequestMapping("/showItem")
    public String showItem(Model model) {
        Items item = itemService.findById(1);
        System.out.println(item);
        model.addAttribute("item", item);
        return "itemDetail";
    }
}

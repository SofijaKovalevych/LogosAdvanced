package ua.shop.controller.adminControllers;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.support.SessionStatus;

import ua.shop.entity.Items;
import ua.shop.service.ItemsService;

@Controller
@RequestMapping("/admin/itemForm")
public class ItemController {
	
	@Autowired
	private ItemsService itemsService;
	
	@ModelAttribute("item")
	public Items getForm() {
		return new Items();
	}
	
	@GetMapping
	public String show() {
		return "admin-itemForm";
	}
	
	@PostMapping
	public String save(@ModelAttribute("item")Items items, SessionStatus status) {
		items.setCreatedAt(new Date());
		itemsService.save(items);
		status.setComplete();
		return"redirect:/admin/itemForm";
	}
	

}

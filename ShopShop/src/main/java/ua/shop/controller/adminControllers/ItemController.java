package ua.shop.controller.adminControllers;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import ua.shop.entity.Items;
import ua.shop.service.ItemsService;

@Controller
@RequestMapping("/admin/itemForm")
@SessionAttributes("item")
public class ItemController {
	
	@Autowired
	private ItemsService itemsService;
	
	@ModelAttribute("item")
	public Items getForm() {
		return new Items();
	}
	
	@GetMapping
	public String show(Model model) {
		return "admin/itemForm";
	}
	
	@GetMapping("/update/{id}")
	public String update(Model model, @PathVariable Integer id) {
		model.addAttribute("item", itemsService.findOne(id));
		return show(model);
	}
	
	@PostMapping
	public String save(@ModelAttribute("item")Items items, SessionStatus status) {
		if(items.getCreatedAt() == null) {
			items.setCreatedAt(new Date());
		}
		itemsService.save(items);
		status.setComplete();
		return"redirect:/user/itemView";
	}
	

}

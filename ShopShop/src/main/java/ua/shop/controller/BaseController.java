package ua.shop.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ua.shop.entity.Items;

@Controller
public class BaseController {

	@GetMapping("/")
	public String showHome(Model model) {
		
		return "base-home";
	}

	@GetMapping("/info")
	public String userInfo(Model model) {
		List<Items> items = new ArrayList<>();
		for(int i = 0; i < 10; i++) {
			Items fuck = new Items();
			fuck.setTitle("Bui" + i);
			items.add(fuck);
		}
		model.addAttribute("be", items);
		return "base-info";
	}
	
}


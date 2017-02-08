package com.yj.mvc;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.yj.dto.JHL_VacationJoinDto;
import com.yj.page.PageUtil;
import com.yj.service.JHL_VacationService;

@Controller
public class JHL_VacationController {
	@Autowired private JHL_VacationService vService;
	
	@RequestMapping(value="/hl/vacation/list", method=RequestMethod.GET)
	public String getvlist(@RequestParam(value="pageNum",defaultValue="1")int pageNum, 
			Model model){
		HashMap<String, Object> map = new HashMap<String, Object>();
		int rowcnt = vService.getcnt();
		PageUtil pu = new PageUtil(pageNum, rowcnt, 10, 10);
		map.put("startRow", pu.getStartRow());
		map.put("endRow", pu.getEndRow());
		List<JHL_VacationJoinDto> vlist = vService.getvlist(map);
		model.addAttribute("vlist", vlist);
		model.addAttribute("pu", pu);
		return ".hl.pay_menu2.vacation_list";
	}
	
	@RequestMapping(value="hl/vacation/update", method=RequestMethod.GET)
	public String updateVcnt(int vcnt){
		int n = vService.updateVcnt(vcnt);
		int rowcnt = vService.getcnt();
		if(n == rowcnt){
			// 성공
			return "redirect:/hl/vacation/list";
		}else{
			// 실패
			return ".hl.pay_menu2.fail";
		}
	}
}

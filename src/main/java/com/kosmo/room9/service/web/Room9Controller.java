package com.kosmo.room9.service.web;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kosmo.room9.service.Room9DTO;
import com.kosmo.room9.service.impl.Room9ServiceImpl;

@Controller
public class Room9Controller {
	
	// Room9ServiceImpl 주입
	@Resource(name="room9ServiceImpl")
	Room9ServiceImpl service;
	
	@RequestMapping("/open.room9")
	public String open(Model model) throws Exception{
		List<Room9DTO> list = service.selectList(null);
		model.addAttribute("list", list);
		
		List<String> category = new ArrayList<String>();
		
		// 한글로 되어있는 카테고리를 영어로 치환 (jsp 에서 사용하기 위해서)
		for(int i = 0; i < list.size(); i++) {
			String temp = list.get(i).getR_category();
			switch(temp) {
			case "서울":
				category.add("seoul");
    			break;
    		case "경기":
    			category.add("gyeonggi");
    			break;
    		case "강원":
    			category.add("gangwon");
    			break;
    		case "충청":
    			category.add("chungcheong");
    			break;
    		case "전라":
    			category.add("jeonla");
    			break;
    		case "경상":
    			category.add("gyeongsang");
    			break;
    		case "카페":
    			category.add("cafa");
    			break;
    		case "스터디":
    			category.add("study");
    			break;
    		case "세미나":
    			category.add("seminar");
    			break;
    		case "강연":
    			category.add("lecture");
    			break;
    		case "동창회":
    			category.add("reunion");
    			break;
    		case "돌잔치":
    			category.add("doljanchi");
    			break;
    		case "오피스":
    			category.add("office");
    			break;
    		case "밴드":
    			category.add("band");
    			break;
    		case "파티룸":
    			category.add("party");
    			break;
    		default:
    			category.add("null");
    			break;
			}
		}
		model.addAttribute("category", category);
		
		return "open.tiles";
	}
	
	@RequestMapping("/reservation.room9")
	public String reservation(Model model) throws Exception{
		List<Room9DTO> list = service.selectList(null);
		model.addAttribute("list", list);	
		return "reservation.tiles";
	}
	
	@RequestMapping("/notice.room9")
	public String notice() throws Exception{
		System.out.println("들어옴?");
		return "notice.tiles";
	}
	@RequestMapping("/UserInfo.room9")
	public String UserInfo() throws Exception{
		System.out.println("들어옴?");
		return "UserInfo.tiles";
	}
}
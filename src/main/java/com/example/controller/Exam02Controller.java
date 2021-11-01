package com.example.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 足し算結果を表示します
 * 
 * @author ootomokenji
 *
 */
@Controller
@RequestMapping("/exam02")
public class Exam02Controller {

	/**
	 * 最初のページに飛びます
	 * 
	 * @return
	 */
	@RequestMapping("")
	public String index() {
		
		return "exam02";
	}
	
	/**
	 * 数字を２つ受け取り、２つの数字と足した数をセットして時間内であれば取り出せるようにします
	 * @param num1　1つ目の数字をセット
	 * @param num2　2つ目の数字をセット
	 * @param session　セッションスコープ使います
	 * @return　結果画面１に飛びます
	 */
	@RequestMapping("/result")
	public String result(Integer num1,Integer num2,HttpSession session) {
		
		session.setAttribute("num1", num1);
		session.setAttribute("num2", num2);
		session.setAttribute("sum", num1+num2);
		
		return "exam02-result";
	}
	
	/**
	 * @return　結果画面２に飛びます
	 */
	@RequestMapping("/toPage2")
	public String toPage2() {
		return "exam02-result2";
	}
}

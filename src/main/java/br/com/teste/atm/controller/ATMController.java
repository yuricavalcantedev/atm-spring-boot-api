package br.com.teste.atm.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.teste.atm.model.ATM;
import br.com.teste.atm.service.ATMService;

@RestController
@RequestMapping("/atm")
public class ATMController {
	
	@Autowired
	ATMService atmService;
	
	@GetMapping("/")
	public String home() {
		//login
		return "";
	}
	
	@GetMapping("/login")
	public String login(@PathVariable String username, @PathVariable String password) {
		
		return "";
	}
	
	@GetMapping("/seeCash")
	public ATM seeCash() {
		return atmService.seeCash();
	}
	
	@PutMapping("/withdrawMoney/{value}")
	@ResponseBody
	public String withdrawMoney(@PathVariable Integer value) {
		return atmService.withdrawMoney(value);
	}
	
	@PutMapping("/addCash/{bankNote}/{amount}")
	public ATM addCash(@PathVariable("bankNote") Integer bankNote, @PathVariable("amount") Integer amount) {
		
		ATM atm = atmService.addCash(bankNote, amount);
		if(atm.equals(null))
			return null;
		return atm;
		//"This ATM dosn't work with this type of cedule";
	}
}

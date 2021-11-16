package predictapi.betpre.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import predictapi.betpre.domain.Bet;
import predictapi.betpre.service.BetService;

import javax.validation.Valid;
import java.util.List;



@RestController
@CrossOrigin
@RequestMapping("/api")
public class BetController {
	
	@Autowired
	BetService betService;
	
	//Get all bet post
	@GetMapping("/bet-day")
	public List<Bet> getToday (){
		
		return betService.findAllb();
		
	}
	
	//creating new bet post
	@PostMapping("/betp")
	public Bet createBet(@Valid @RequestBody Bet bet) {
		
		return betService.save(bet);
		
	}
	
	//Get a Single Bet
	@GetMapping("/bet/{id}")
	public Bet getBetId(@PathVariable(value="id") Long betId) {
		return betService.findById(betId);
				
		   
	}
	
	//updatebet
	@PutMapping("/betp")
	public Bet updateBB(@RequestBody Bet betdetails ) {
		Bet bet= betService.findById(betdetails.getId());
		bet.setTips(betdetails.getTips());
		
		Bet uBet = betService.save(bet);
		
		return uBet;
	}
	
	//delete bet
	@DeleteMapping("/bet/{id}")
	public ResponseEntity <?> deleteNote(@PathVariable (value="id") Long betid){
		Bet bet= betService.findById(betid);
		betService.delete(bet);
		return ResponseEntity.ok().build();
		
	
		
	}
	

	
	
	
	

}

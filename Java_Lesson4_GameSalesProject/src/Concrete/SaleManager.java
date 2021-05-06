package Concrete;

import Abstract.SaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.User;


public class SaleManager implements SaleService{

	public void sale(User user, Game game, Campaign campaign) {
		double discountPrice = game.getGamePrice() - (game.getGamePrice()*campaign.getDiscount()/100);
		
		System.out.println(user.getFirstName()+" "+user.getLastName()+" adlı kullanıcı "+
		game.getGameName()+" oyununu "+campaign.getCampaingName()+" kampanyası ile %" + 
				campaign.getDiscount()+" indirim oranı ile " + discountPrice+" TL'ye satın aldı.");
	}
	
}

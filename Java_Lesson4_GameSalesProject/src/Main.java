import java.util.Date;

import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.SaleManager;
import Concrete.UserManager;
import Entities.Campaign;
import Entities.Game;
import Entities.User;

public class Main {

	public static void main(String[] args) {
	User user1=new User(1,"Muhammed Murat","ACAR",new Date(1996,8,2),"12553095662");
		
		Game game1=new Game(1,"Grand Theft Auto V PC ",110);
		
		Campaign campaign1=new Campaign(1,"Mayıs Ayı indirimi",30);
		
		UserManager userManager=new UserManager(new MernisServiceAdapter());
		GameManager gameManager=new GameManager();
		CampaignManager campaignManager=new CampaignManager();
		SaleManager saleManager=new SaleManager();
		campaignManager.add(campaign1);
		userManager.add(user1);
		gameManager.add(game1);
		
		saleManager.sale(user1, game1, campaign1);

	}

}

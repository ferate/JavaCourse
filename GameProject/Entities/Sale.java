
import java.time.LocalDate;

public class Sale implements IEntity{
	private int id;
	private int gamerId;
	private int gameId;
	private int campaignId;
	private double salePrice;
	private LocalDate saleDate;
	
	public Sale() {
		
	}

	public Sale(int id, int gamerId,int gameId ,int campaignId, double salePrice, LocalDate saleDate) {
		super();
		this.id = id;
		this.gamerId = gamerId;
		this.gameId = gameId;
		this.campaignId = campaignId;
		this.salePrice = salePrice;
		this.saleDate = saleDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGamerId() {
		return gamerId;
	}

	public void setGamerId(int gamerId) {
		this.gamerId = gamerId;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}

	public double getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(double salePrice) {
		this.salePrice = salePrice;
	}

	public LocalDate getSaleDate() {
		return saleDate;
	}

	public void setSaleDate(LocalDate saleDate) {
		this.saleDate = saleDate;
	}

		
	
	
	
	

}

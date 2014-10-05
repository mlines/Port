package pit;

public class Security {
	private String name;
	private String symbol;
	
	//constructor
	public Security() {
		name = "Crescent Point";
	}
	
	public String getName() {
		return name;
	}	
	
	public void setName(String securityName) {
		name = securityName;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
		
}

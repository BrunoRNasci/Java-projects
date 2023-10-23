package entities;

public class ImportedProduct extends Product {

	private Double customFees;

	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double price, Double customFees) {
		super(name, price);
		this.customFees = customFees;
	}

	public Double getCustomFees() {
		return customFees;
	}

	public void setCustomFees(Double customFees) {
		this.customFees = customFees;
	}
	public Double totalPrice() {
		return super.getPrice() + customFees;
	}

	@Override
	public String priceTag() {
		return super.getName() + " $ " + String.format("%.2f", totalPrice()) + " (Custom Fee: $ "
				+ String.format("%.2f", customFees) + ")";
	}
	
	
}

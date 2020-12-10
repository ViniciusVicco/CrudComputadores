package submodelHardware;

public enum Fonte {
	E_ATX(1,"E-ATX"),
	ATX(2,"ATX"),
	MICRO_ATX(3,"Micro-ATX"),
	MINI_ITX(4,"Mini-ITX");
	
	private int id;
	private String label;
	
	Fonte(int id, String label){
		this.id = id;
		this.setLabel(label);
	}

	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public static Fonte valueOf(int id) {
		for(Fonte gabinete : values()) {
			if(id == gabinete.getId())
				return gabinete;
		}
		return null;
	}


	public String getLabel() {
		return label;
	}


	public void setLabel(String label) {
		this.label = label;
	}
	


}
package realestaterentalfun

class Unit {

	static belongsTo = [Property, Landlord]
	
	String unitNo
	String sqFeet
	byte[] photo
	
    static constraints = {
    }
}

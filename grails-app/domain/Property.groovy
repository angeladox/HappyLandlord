 package happylandlord

class Property {

	static belongsTo = Landlord
	
	byte[] photo
	String address
	
	
    static constraints = {
    }
}

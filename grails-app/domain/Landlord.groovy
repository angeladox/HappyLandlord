package happylandlord

class Landlord {
	static searchable = true
	
	String userId
	String firstName
	String lastName
	String email
	String password
	Date dateCreated

    static constraints = {
   // right now the constraints are empty!!!
    }
	
	static hasMany = [properties:Property, units:Unit] 
}

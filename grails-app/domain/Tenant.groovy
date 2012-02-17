package happylandlord

class Tenant {
	
    String firstName
    String lastName
    Date DOB
    String email
    String phone
    static belongsTo = [Unit, Property]
        
    static constraints = {
    firstName(blank:false)
    lastName(blank:false)
    DOB()
    email(email:true)
    phone(blank:false, unique:true, matches:/^\([1-9]\d{2}\)\s?\d{3}\-\d{4}$/)
    
    
    
    }
}

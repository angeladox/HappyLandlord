package happylandlord

class Tenant {
    // current tenant info	
    String firstName
    String lastName
    Date DOB
    String email
    String phone
    String creditScore
    // tenant last address info
    String prevAddress
    String prevLandlord
    String prevLandlordPhone
    
    String comments
    Date dateCreated
    
    
    
    static belongsTo = [Unit, Property]
        
    static constraints = {
        
    //constraints for tenant
    firstName(blank:false)
    lastName(blank:false)
    DOB(blank: false)
    email(email:true,unique:true)
    //regex for telephone number - must be unique. 
    phone(blank:false, unique:true, matches:/^\([1-9]\d{2}\)\s?\d{3}\-\d{4}$/)
    creditScore(inList:["800","700","600","500","400"])
    prevLandlord(blank:true)
    prevAddress(blank:true, maxSize:100)
    prevLandlordPhone(blank:true, unique:true, matches:/^\([1-9]\d{2}\)\s?\d{3}\-\d{4}$/)
    
    comments(blank:true,maxSize:500)
    dateCreated()
    
    
    }
}

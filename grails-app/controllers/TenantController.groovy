package happylandlord

class TenantController {
    
    def scaffold = true
    
    def index={ redirect(action:'list')}
}

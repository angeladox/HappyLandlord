package happylandlord

class UnitController {

    def scaffold = true
    
    def index={ redirect(action:'list') }
}
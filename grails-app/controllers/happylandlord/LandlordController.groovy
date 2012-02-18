package happylandlord

class LandlordController {

	def scaffold = true
	
	def index = {
		redirect(action:home)
	}
	
	def home = {
		render(view:'/landlord/home', model: [landlord : Landlord.get(params.id) ]) 
	}
	
	def create = {
		[landlordInstance: new Landlord(params)]
	}
	
}

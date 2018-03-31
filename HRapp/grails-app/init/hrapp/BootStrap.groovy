package hrapp

class BootStrap {


    def init = { servletContext ->
	
	//Manager
	def manSteveCross= new com.HRmanagement.Manager(
		fullName:'Steve Crossbar',
		userName:'scross',
		password:'secret2018',
		managerEmail:'scross@email.com',
		office:'B1-900',
		department:'Grocery, Electronics, Clothing'
		).save()

	def manJaneCross= new com.HRmanagement.Manager(
		fullName: 'Jane Crossbar',
		userName:'jcross',
		password:'jecret2018',
		managerEmail:'jcross@email.com',
		office:'B1-900',
		department:'Grocery, Electronics, Clothing'
		).save()
	
	//TeamLeader
	def tlJohn = new com.HRmanagement.TeamLeader(
		fullName: 'John Leadfarmer',
		department: 'Gardening',
		employeeID: 'GarJL',
		sectionName: 'Trees',
		officePhone: '01111777',
		leaderEmail: 'jleadfarmer@email.com',
		password: 'secret2018'
		).save()

	def tlJoane = new com.HRmanagement.TeamLeader(
		fullName: 'Joane Leadfarmer',
		department: 'Meat',
		employeeID: 'MeatJL',
		sectionName: 'Beef',
		officePhone: '01112777',
		leaderEmail: 'jleadfarmer@email.com',
		password: 'secret2018'
		).save()

	//Employee
	def empCraig = new com.HRmanagement.Employee(
		fullName: 'Craig David',
		dateOfBirth: new Date('18/10/1986'),
		residence: 'Manchester',
		hourlyRate: 9.55,
		employeeID: 'CD86',
		dateEmployed: new Date('26/02/2018'),
		taxCode: 'TX345',
		contract: 'Full-time'
		).save()

	def empCharlie = new com.HRmanagement.Employee(
		fullName: 'Charlie David',
		dateOfBirth: new Date('18/10/1986'),
		residence: 'Poynton',
		hourlyRate: 9.55,
		employeeID: 'CD56',
		dateEmployed: new Date('26/02/2008'),
		taxCode: 'TX345',
		contract: 'Part-time'
		).save()

	//Team
	def tmGard = new com.HRmanagement.Team(
		teamName:'Gardening',
		numberOfEmployees: 10,
		sectionName: 'Gardining',
		description: 'Maintaining gardens'
		).save(failOnError:true)
	
	def tmLoading = new com.HRmanagement.Team(
		teamName:'Loading',
		numberOfEmployees: 3,
		sectionName: 'Bakery',
		description: 'Restocking sausage rolls'
		).save()

	//Task
	def taskReplenish = new com.HRmanagement.Task(
		taskName: 'Replenishing',
		numberOfPeople: 2,
		sectionName: 'Floral',
		department: 'Gardening',
		timeRequired: '1 Hour',
		description: 'Replenishing flowers',
		taskCompleted: false
		).save(failOnError:true)

	def taskClean = new com.HRmanagement.Task(
		taskName: 'Cleaning',
		numberOfPeople: 4,
		sectionName: 'Shop Floor',
		department: 'Cleaning Staff',
		timeRequired: '4 Hours',
		description: 'Clean the supermarket',
		taskCompleted: true
		).save()

	//Shift
	def sftMorn = new com.HRmanagement.Shift(
		timeOfDay: 'Morning',
		dayOfWeek: 'Thursday',
		numberOfHours: 6,
		startingTime: '6:00am'
		).save()

	def sftAfternoon = new com.HRmanagement.Shift(
		timeOfDay: 'Afternoon',
		dayOfWeek: 'Sunday',
		numberOfHours: 6,
		startingTime: '8:00pm'
		).save()

    }
    def destroy = {
    }
}

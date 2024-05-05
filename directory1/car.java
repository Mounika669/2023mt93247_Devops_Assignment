class Car 
{
	Engine e;
	double topspeed;
	Car(Engine e,double topspeed)
	{
		this.topspeed=topspeed;
		this.e=e;
	}
	void drive(){
		System.out.println("driving");
	}
}

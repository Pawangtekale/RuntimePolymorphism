class Subg2 extends Subg
{
	public Subg2(){}
	public Subg2(String user,String pass){
		super(user,pass);
		
	}
	public void backward(){
		System.out.println("Move 1 step backward");	
	}
	public void turnRight(){
		System.out.println("Turned Right");
	}	
}

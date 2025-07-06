class Subg
{
	String username;
	String pass;
	
	public Subg(){}
	public Subg(String username,String pass){
		this.username=username;
		this.pass=pass;
		System.out.println("Login success!");	
	}
	int bullets=15;
	
	public void farward(){
		System.out.println("Moved 1 Step Forward");
	}
	public void backward(){
		System.out.println("Moved 1 Step Forward");
	}
	public void turnRight(){
		System.out.println("Turned Left");
	}
	public void turnLeft(){
		System.out.println("Turned Left");
	}
	public void fire(){
		if (bullets>0){
			System.out.println("Bullet Fired!");
			bullets--;
	        System.out.println(bullets+" Bullets Left");
		 }
		else{
			System.out.println("reload!");
		}
	}
	public void reload(){
		bullets=15;
		System.out.println("Reloaded: "+bullets);
	}
	
}

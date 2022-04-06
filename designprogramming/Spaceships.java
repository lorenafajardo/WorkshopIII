package designprogramming;

import java.util.Date;

public  abstract class  Spaceships {
	
	protected float thrust;
	protected float weight;
	protected boolean manned;
	protected Date firstFlight;
	protected Date lastFlight;
    
	
	public abstract void Despegar();
	public abstract void Aterrizar();
}

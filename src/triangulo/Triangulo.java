package triangulo;

class Triangulo {
	  public static void main(String[] args) {
	}

	private double a;
	private double b;
	private double c;

	  public Triangulo(double a, double b, double c) 
	{
	  this.a = a;
	  this.b = b;
	  this.b = c;    
	}

	public double getA(){
	  return this.a;  
	}

	public double getB(){
	  return this.b;  
	}

	  public boolean eEquilatero () {

	    if(this.a == this.b && this.b == this.c)
	      return true;
	    return false; 
	  }
	

}

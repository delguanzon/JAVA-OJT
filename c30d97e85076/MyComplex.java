package OOP;

public class MyComplex {

	double real;
	double imag;
	
	public MyComplex(double real, double imag)	{
		this.real = real;
		this.imag = imag;
	}
	
	public double getReal()	{
		return real;
	}
	
	public void setReal(double real) {
		this.real = real;
	}
	
	public double getImag()	{
		return imag;
	}
	
	public void setImag(double imag) {
		this.imag = imag;
	}
	
	public void setValue(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}
	
	public String toString() {
		
		return "";
	}
	
	public boolean isReal(){
		return (real >= 0);
	}
	
	public boolean isImaginary(){
		return (imag <= 0);
	}
	
	public boolean equals(double real, double imag){
		return (this.imag==imag && this.real == real);
	}
	
	public boolean equals(MyComplex complex){
		return (complex.real == this.real && complex.imag == this.imag);
	}
	
	public double magnitude()	{
		return Math.sqrt(real + imag);
	}
	
	public double inRadians(){
		return Math.atan2(real, imag) * 0.0174532925;
	
	}
	
	public MyComplex conjugate()
	{
		return new MyComplex(real, -imag);
	}
	
	public MyComplex add(MyComplex another)
	{
		return  new MyComplex((this.real + another.real) , (this.imag + another.imag));
	}
	
	public MyComplex subtract(MyComplex another)
	{
		return  new MyComplex((this.real - another.real) , (this.imag - another.imag));
	}
	
	
	public MyComplex multiply(MyComplex another)
	{
		return  new MyComplex(((this.real * another.real) - (this.imag * another.imag)) , (this.real * another.imag) + (this.imag * another.real) );
	}
	
	public MyComplex divide(MyComplex another)
	{
		return  new MyComplex(((this.real * another.real) - (this.imag * another.imag)) , (this.real * another.imag) + (this.imag * another.real) );
	}
	
	
}

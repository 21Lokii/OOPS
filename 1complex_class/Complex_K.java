class Complex_K 
{ 
float real,imag; 
Complex_K() 
{ 
real=0; 
imag=0; 
} 
Complex_K(float Comp1,float Comp2) 
{ 
real=Comp1; 
imag=Comp2; 
} 
public void AddNumbers(Complex_K C1,Complex_K C2) 
{ 
float real,imag; 
real= (C1.real + C2.real); 
imag= (C1.imag + C2.imag); 
System.out.println("Addition is:("+real+") + ("+imag+")i"); 
} 
public void SubNumbers(Complex_K C1,Complex_K C2) 
{ 
float real,imag; 
real= (C1.real - C2.real); 
imag= (C1.imag - C2.imag); 
System.out.println("Substraction is:("+real+") + ("+imag+")i"); 
} 
public void MulNumbers(Complex_K C1,Complex_K C2) 
{ 
float real,imag; 
real = (C1.real*C2.real)-(C1.imag*C2.imag); 
imag = (C1.imag*C2.real)+(C1.real*C2.imag); 
System.out.println("Multiplication is:("+real+") + ("+imag+")i"); 
} 
public void DivNumbers(Complex_K C1,Complex_K C2) 
{ 
float real,imag; 
float den; 
den=C2.real*C2.real+C2.imag*C2.imag; 
real = ((C1.real*C2.real)+(C1.imag*C2.imag))/den; 
imag= ((C1.imag*C2.real)-(C1.real*C2.imag))/den; 
System.out.println("Division is:("+real+") + ("+imag+")i"); 
} 
} 

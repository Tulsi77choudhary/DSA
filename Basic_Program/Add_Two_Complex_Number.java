package Basic_Program;
 class Complex {

    int real, imag;
    Complex(int real,int imag){
        this.real = real;
        this.real = real;
    }

    Complex add(Complex c){
        return new Complex(this.real + c.real, this.imag + c.imag);
    }

    void display(){
        if(imag >= 0){
            System.out.println(real + " + " + imag + "i");
        } else{
            System.out.println(real + " - " + (-imag) + "i");
        }
    }

}

public class Add_Two_Complex_Number{
    public static void main(String[] args) {
        
        Complex c1 = new Complex(3, 2);
        Complex c2 = new Complex(1, 7);

        Complex sum =  c1.add(c2);

        c1.display();
        c2.display();

        sum.display();
    }
}

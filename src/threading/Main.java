package threading;
public class Main  {

	public static void main(String[] args) {
         Maintest M1 = new Maintest();
         Maintest M2 = new Maintest();
        M1.start();
        M2.start();
       
}
}

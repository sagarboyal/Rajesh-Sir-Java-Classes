//Functional Interfaces
//Lambda expression

@FunctionalInterface
interface SimpleInterest{
    public float findSimpleInterest(int p,int t, float r);

}

class SimpInt
{
    static public float getSimpleInterest(int p, int t, float r) {
        System.out.println("Called get simple interest method");
        return p*t*r/100;
    }
}

//Method reference

public class Main {
    public static void main(String[] args) {

        SimpleInterest si3 = SimpInt::getSimpleInterest;

        SimpleInterest si2 = (p,r,t) -> {
            return p*t*r/100;
        };

        SimpleInterest si = new SimpleInterest()
        {
            @Override
            public float findSimpleInterest(int p, int t, float r) {
                return p*t*r/100;
            }
        };
        System.out.println("Simple interest : "+si.findSimpleInterest(1000,2,14.5f));
        System.out.println("Simple interest : "+si2.findSimpleInterest(1000,2,14.5f));
        System.out.println("Simple interest : "+si3.findSimpleInterest(1000,2,14.5f));
    }
}
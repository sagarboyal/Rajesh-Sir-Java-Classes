interface CalculateResult{
    int findResult(int i,int j);
}

class Sum implements CalculateResult{

    @Override
    public int findResult(int i, int j) {
        return i+j;
    }
}

class Difference implements CalculateResult{

    @Override
    public int findResult(int i, int j) {
        return i-j;
    }
}

class DisplayResult
{
    public void displayResult(CalculateResult calculateResult,int x,int y){
        System.out.println("Result : "+calculateResult.findResult(x,y));
    }
}


public class Main2 {
    public static void main(String[] args){
        DisplayResult result = new DisplayResult();
        result.displayResult(new Sum(),10,20);
        result.displayResult(new Difference(),10,20);
    }

}

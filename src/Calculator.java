public class Calculator {
    public int calculator(int firstOperator ,int secondOperator,String operator) throws Exception {
        switch (operator){
            case "plus":
                return firstOperator+secondOperator;
            case "sub":
                return firstOperator-secondOperator;

            case "mul":
                return firstOperator*secondOperator;

            case "div":
                if (secondOperator==0){
                    throw new Exception("second operator must be other number");
                }
                break;
        }
        return 0;
    }
}

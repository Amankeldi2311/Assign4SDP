package interpreterPattern;

public class OperationExpression implements IExpression {
    private IExpression left;
    private IExpression right;
    private char operation;

    public OperationExpression(IExpression left, IExpression right, char operation) {
        this.left = left;
        this.right = right;
        this.operation = operation;
    }

    @Override
    public int interpret() {
        switch (operation) {
            case '+':
                return left.interpret() + right.interpret();
            case '-':
                return left.interpret() - right.interpret();
            case '*':
                return left.interpret() * right.interpret();
            case '/':
                return left.interpret() / right.interpret();
            default:
                return 0;
        }
    }
}

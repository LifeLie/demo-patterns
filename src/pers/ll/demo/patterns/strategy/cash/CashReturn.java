package pers.ll.demo.patterns.strategy.cash;

/**
 * 返利收费
 * @author ll
 * @date 2018/7/27 上午11:15
 */
public class CashReturn extends CashSuper {

    private double moneyCondition;

    private double moneyReturn;

    public CashReturn(String moneyCondition, String moneyReturn) {
        this.moneyCondition = Double.parseDouble(moneyCondition);
        this.moneyReturn = Double.parseDouble(moneyReturn);
    }

    @Override
    public double acceptCash(double money) {
        double result = money;
        if (money >= moneyCondition) {
            result = money - Math.floor(money / moneyCondition * moneyReturn);
        }
        return result;
    }
}


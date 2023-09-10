package org.adbs.vtlabs.task9;

import org.adbs.vtlabs.task9.model.Ball;
import org.adbs.vtlabs.task9.model.Basket;
import org.adbs.vtlabs.task9.util.BasketUtils;

public class BasketApplication {
    public static void main(String[] args) {
        Basket basket = new Basket();
        basket
                .add(new Ball(1.2, Ball.Color.BLUE))
                .add(new Ball(1.45, Ball.Color.RED))
                .add(new Ball(2.1, Ball.Color.GREEN))
                .add(new Ball(0.3, Ball.Color.BLUE))
                .add(new Ball(0.21, Ball.Color.BLUE));

        BasketUtils basketUtils = new BasketUtils(basket);

        int blueCount = basketUtils.getBallsByColor(Ball.Color.BLUE).size();
        double totalWeight = basketUtils
                .getAll().stream()
                .map(Ball::getWeight)
                .reduce(Double::sum)
                .orElse(0.0);

        System.out.println("Blue balls in a basket: " + blueCount);
        System.out.println("Total basket weight:  " + totalWeight);
    }
}

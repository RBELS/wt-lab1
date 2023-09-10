package org.adbs.vtlabs.task9.util;

import org.adbs.vtlabs.task9.model.Ball;
import org.adbs.vtlabs.task9.model.Basket;

import java.util.Set;
import java.util.stream.Collectors;

public class BasketUtils {
    private final Basket basket;

    public BasketUtils(Basket basket) {
        this.basket = basket;
    }

    public Set<Ball> getBallsByColor(Ball.Color color) {
        return basket
                .getBalls().stream()
                .filter(ball -> color.equals(ball.getColor()))
                .collect(Collectors.toSet());
    }

    public Set<Ball> getAll() {
        return basket.getBalls();
    }
}

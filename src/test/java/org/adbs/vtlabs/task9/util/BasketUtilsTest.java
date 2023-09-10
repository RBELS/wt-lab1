package org.adbs.vtlabs.task9.util;

import org.adbs.vtlabs.task9.model.Ball;
import org.adbs.vtlabs.task9.model.Basket;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class BasketUtilsTest {

    @Test
    @DisplayName("Task9: Получение мячей по цвету")
    void getBallsByColor() {
        Basket basket = new Basket();
        basket
                .add(new Ball(2.2, Ball.Color.BLUE))
                .add(new Ball(2.21, Ball.Color.RED))
                .add(new Ball(0.5, Ball.Color.BLUE))
                .add(new Ball(2.21, Ball.Color.BLUE));
        BasketUtils basketUtils = new BasketUtils(basket);

        assertAll(
                () -> assertEquals(Set.of(
                        new Ball(2.2, Ball.Color.BLUE),
                        new Ball(0.5, Ball.Color.BLUE),
                        new Ball(2.21, Ball.Color.BLUE)
                ), basketUtils.getBallsByColor(Ball.Color.BLUE)),
                () -> assertEquals(Set.of(
                        new Ball(2.21, Ball.Color.RED)
                ), basketUtils.getBallsByColor(Ball.Color.RED)),
                () -> assertEquals(Collections.EMPTY_SET, basketUtils.getBallsByColor(Ball.Color.GREEN))
        );
    }

    @Test
    @DisplayName("Task9: Получение всех мячей")
    void getAll() {
        Basket basket = new Basket();
        basket
                .add(new Ball(2.2, Ball.Color.BLUE))
                .add(new Ball(2.21, Ball.Color.RED))
                .add(new Ball(0.5, Ball.Color.BLUE))
                .add(new Ball(2.21, Ball.Color.BLUE));
        BasketUtils basketUtils = new BasketUtils(basket);

        assertEquals(Set.of(
                new Ball(2.2, Ball.Color.BLUE),
                new Ball(2.21, Ball.Color.RED),
                new Ball(0.5, Ball.Color.BLUE),
                new Ball(2.21, Ball.Color.BLUE)
        ), basketUtils.getAll());
    }
}
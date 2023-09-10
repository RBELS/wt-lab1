package org.adbs.vtlabs.task9.model;

import java.util.HashSet;
import java.util.Set;

public class Basket {
    private final Set<Ball> balls = new HashSet<>();

    public Basket add(Ball ball) {
        balls.add(ball);
        return this;
    }

    public Basket remove(Ball ball) {
        balls.remove(ball);
        return this;
    }

    public Set<Ball> getBalls() {
        return balls;
    }
}

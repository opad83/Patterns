package com.company.p1.strategy;

public final class FightWithSword implements FightingTool {
    @Override
    public void useInFight() {
        System.out.println("I am fighting with sword");
    }
}

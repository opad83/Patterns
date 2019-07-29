package com.company.p1.strategy;

public final class FightWithArrows implements FightingTool {
    @Override
    public void useInFight() {
        System.out.println("I am using arrows");
    }
}

package com.company.p1.strategy;

public abstract class Character {

    private FightingTool fightingTool;

    public Character(FightingTool fightingTool) {
        this.fightingTool = fightingTool;
    }

    void fight() {
        fightingTool.useInFight();
    }
}

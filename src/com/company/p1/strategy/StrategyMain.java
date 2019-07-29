package com.company.p1.strategy;

public class StrategyMain {

    public static void main(String[] args) {
        Archer archer = new Archer(new FightWithArrows());
        Knight knight = new Knight(new FightWithSword());
        Dwarf dwarf = new Dwarf(new FightWithAxe());
        archer.fight();
        knight.fight();
        dwarf.fight();
    }
}

package org.designPattern;

public class Contexto {
    private Strategy strategy;

    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }
    public void executeStrategy(){
        if(strategy != null){
            strategy.execute();
        }
    }

}

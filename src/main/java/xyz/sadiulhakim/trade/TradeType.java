package xyz.sadiulhakim.trade;

import lombok.Getter;

@Getter
public enum TradeType {
    BUY(1,"Buy"),
    SELL(2,"Sell");

    private final int id;
    private final String name;

    TradeType(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

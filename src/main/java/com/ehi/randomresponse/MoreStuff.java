package com.ehi.randomresponse;

public class MoreStuff {
    public String[] lots;

    public MoreStuff() {
    }

    public MoreStuff(String one, String two, String three, String four) {
        this.lots = new String[4];
        this.lots[0] = one;
        this.lots[1]= two;
        this.lots[2]= three;
        this.lots[3] = four;
    } 
}

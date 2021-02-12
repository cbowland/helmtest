package com.ehi.randomresponse;

import java.util.HashMap;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

public class Stuff {
    public String name;
    public String description;
    public HashMap moreStuff;

    public Stuff() {
    }

    public Stuff(String name, String description) {
        this.name = name;
        this.description = description;
        this.moreStuff = new HashMap();
        
        this.moreStuff.put("extrastuff", new MoreStuff(RandomStringUtils.randomAlphanumeric(RandomUtils.nextInt(0, 15)),
                                                      RandomStringUtils.randomAlphanumeric(RandomUtils.nextInt(9, 23)),
                                                      RandomStringUtils.randomAlphanumeric(RandomUtils.nextInt(2, 30)),
                                                      RandomStringUtils.randomAlphanumeric(RandomUtils.nextInt(1, 5))));
                                                      
    }
}

package com.ehi.randomresponse.rest.json;

import java.util.LinkedHashMap;
import java.util.Set;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.Collections;
import javax.ws.rs.core.MediaType;

import com.ehi.randomresponse.Stuff;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

@Path("/randomresponse")
public class RandomResource {


    @GET
    public Set<Stuff> list() {
        Set<Stuff> stuff = Collections.newSetFromMap(Collections.synchronizedMap(new LinkedHashMap<>()));
        createRandomStuff(stuff, RandomUtils.nextInt(0, 50));
        return stuff;
    }

    private void createRandomStuff(Set<Stuff> stuff, int size) {
        for (int i = 0; i < size; i++) {
            int c1 = RandomUtils.nextInt(1,11);
            int c2 = RandomUtils.nextInt(4, 32);
            stuff.add(new Stuff(RandomStringUtils.randomAlphanumeric(c1), RandomStringUtils.randomAlphanumeric(c2)));
        }
    }
}

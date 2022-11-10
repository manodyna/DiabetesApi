package com.dyna.miniproject.constants;

public enum Region {

//    Attaching geographical regions 1,2 and 3 with their names
    REGION1("region1"),
    REGION2("region2"),
    REGION3("region3");

    public final String region;

    private Region(String region){
        this.region = region;
    }
}

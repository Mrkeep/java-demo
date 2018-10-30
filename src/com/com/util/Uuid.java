package com.util;

import java.util.UUID;

public class Uuid {
    //the way to form uuid
    String myUuid (){
        String myFirstUuid = UUID.randomUUID().toString().replaceAll("-","");
        return myFirstUuid;
    };
}

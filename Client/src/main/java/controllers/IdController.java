package controllers;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

import models.Id;

public class IdController {
    URL url;
    private HashMap<String, Id> allIds;

    Id myId;

    public IdController() throws MalformedURLException {
        url = new URL("http://zipcode.rocks:8085");
    }

    public ArrayList<Id> getIds() {
        ArrayList<Id> id = new ArrayList<>(allIds.values());
        return id;
    }

    public Id postId(Id id) {
        // create json from id
        // call server, get json result Or error
        // result json to Id obj

        return null;
    }

    public Id putId(Id id) {
        return null;
    }

}
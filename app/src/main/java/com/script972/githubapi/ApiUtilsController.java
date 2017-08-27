package com.script972.githubapi;

/**
 * Created by script972 on 26.08.2017.
 */

public class ApiUtilsController {

    public static final String BASE_URL = "https://api.stackexchange.com/2.2/";

    public static SOService getSOService() {
        return RetrofitClient.getClient(BASE_URL).create(SOService.class);
    }
}

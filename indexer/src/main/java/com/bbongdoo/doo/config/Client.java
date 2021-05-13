package com.bbongdoo.doo.config;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Value;

public class Client {

    @Value("${elasticsearch.host}")
    private static String host;

    @Value("${elasticsearch.port}")
    private static Integer port;

    public static RestHighLevelClient getClient() {
        RestHighLevelClient client = new RestHighLevelClient(
                RestClient.builder(
                        new HttpHost("localhost", 9200, "http")
                ));
        return client;
    }
}

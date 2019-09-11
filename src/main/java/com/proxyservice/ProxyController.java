package com.proxyservice;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

/*
 * Written by Gaurav Sharma on 11 Sep 2019
 */
@RestController
@RequestMapping("/bp")
public class ProxyController {

    private ObjectMapper objectMapper = new ObjectMapper();

    @GetMapping(value = "/**",
            produces = {APPLICATION_JSON_VALUE})
    public void proxyGet(HttpServletRequest request) {
        StringBuffer url = request.getRequestURL();
        System.out.println(url);
    }

    @PostMapping(value = "/**",
            consumes = {APPLICATION_JSON_VALUE},
            produces = {APPLICATION_JSON_VALUE})
    public void proxyPost(@RequestBody String body, HttpMethod method, HttpServletRequest request, HttpServletResponse response) throws IOException {
        RequestProxyDto requestProxyDto = objectMapper.readValue(body, RequestProxyDto.class);
        StringBuffer url = request.getRequestURL();
        System.out.println(url);
    }

}

package com.ndogga.portfolio;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/portfolioApi")
public class PortfolioApiController {

    @Get(uri = "/", produces = "text/plain")
    public String index() {
        return "Example Response";
    }
}
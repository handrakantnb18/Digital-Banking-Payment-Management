package com.digitalbank.APIGateway.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {

        return builder.routes()
                .route()
    }

}

package com.example.Actuator_example.helper;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthContributorRegistry;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Controller;

@Controller
public class MyDBHealthService implements HealthIndicator {
   public static final String DB_Service="Database Service";

    public boolean isHealthy() {
        return true; // status is up
//        return false;// status is down
    }
@Override
    public Health health() {
        if(isHealthy()) {
            return Health.up().withDetail(DB_Service,"statu UP").build();
        }
        return Health.down().withDetail(DB_Service,"DOWN").build();
}
}

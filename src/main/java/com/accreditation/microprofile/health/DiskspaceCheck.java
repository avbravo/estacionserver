/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.accreditation.microprofile.health;

import com.jmoordb.core.util.JmoordbCoreUtil;
import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Readiness;

/**
 *
 * @author avbravo
 */
@Readiness
@ApplicationScoped
public class DiskspaceCheck implements HealthCheck {

       
    @Override
    public HealthCheckResponse call() {
        return HealthCheckResponse.named("Espacio en disco")
                .withData("MB", JmoordbCoreUtil.freeSpaceOfDisk())
                .up()
                .build();

    }
}

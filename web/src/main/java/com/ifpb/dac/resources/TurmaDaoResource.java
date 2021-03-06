/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.dac.resources;

import com.ifpb.dac.interfaces.AulaDao;
import com.ifpb.dac.interfaces.TurmaDao;
import com.ifpb.dac.servicelocater.ServiceLocator;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Default;
import javax.enterprise.inject.Produces;

/**
 *
 * @author rodrigobento
 */
@ApplicationScoped
public class TurmaDaoResource {
    
    private static final String RESOURCE = "java:global/core/TurmaDaoImpl!com.ifpb.dac.interfaces.TurmaDao";
    
    @Dependent
    @Produces
    @Default
    public static TurmaDao getAulaDao(){
        return ServiceLocator.lookup(RESOURCE);
    }
    
}

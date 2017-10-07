package com.ifpb.dac.resources;
import com.ifpb.dac.interfaces.UsuarioDao;
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
public class UsuarioDaoResource {
    
    private static final String RESOURCE = "java:global/core/UsuarioDaoImpl!com.ifpb.dac.interfaces.UsuarioDao";
    
    @Dependent
    @Produces
    @Default
    public static UsuarioDao getLaboratorioDao(){
        return ServiceLocator.lookup(RESOURCE);
    }
    
}

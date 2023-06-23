package com.rutas.capacitacion.web.config;

import org.hibernate.envers.RevisionListener;

import com.rutas.capacitacion.web.entity.revision.Revision;

public class CustomRevisionListener implements RevisionListener{

    public void newRevision(Object revisionEntity) {
        final Revision revision = (Revision) revisionEntity; 
    }
    
}

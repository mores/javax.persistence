/*
 * Copyright (c) 2008, 2009, 2011 Oracle, Inc. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0
 * which accompanies this distribution.  The Eclipse Public License is available
 * at http://www.eclipse.org/legal/epl-v10.html and the Eclipse Distribution License
 * is available at http://www.eclipse.org/org/documents/edl-v10.php.
 */
package javax.persistence;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Describes a single container or persistence provider property. Used in {@link PersistenceContext}.
 * <p>
 * Vendor specific properties may be included in the set of properties, and are passed to the persistence
 * provider by the container when the entity manager is created. Properties that are not recognized by a
 * vendor will be ignored.
 * @since Java Persistence 1.0
 */
@Target({})
@Retention(RUNTIME)
public @interface PersistenceProperty
{
    /**
     * The name of the property
     * @return Name
     */
    String name();

    /**
     * The value of the property
     * @return value
     */
    String value();
}

package org.fractalstudio.jcollada;

import org.fractalstudio.jcollada.dataflow.uri.ColladaURI;

/**
 * Copyright (C) 2013 Steffen Evensen
 *
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 *
 * You should have received a copy of the GNU General Public License along with
 * this program. If not, see <http://www.gnu.org/licenses/>.
 *
 *
 * This is just a ridicolous placeholder for the uri type
 *
 * @author Meanz
 */
public abstract class ColladaElement {

    /**
     *
     */
    public ColladaURI elementUri;

    /**
     *
     * @param uri
     */
    public ColladaElement(ColladaURI uri) {
        this.elementUri = elementUri;
    }

    /**
     *
     * @return
     */
    public ColladaURI getElementUri() {
        return elementUri;
    }
}

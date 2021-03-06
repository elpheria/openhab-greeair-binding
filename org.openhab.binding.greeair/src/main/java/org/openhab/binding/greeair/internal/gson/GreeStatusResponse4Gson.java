/**
 * Copyright (c) 2010-2018 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.greeair.internal.gson;

/**
 *
 * The GreeStatusResponse4Gson class is used by Gson to hold values returned from
 * the Air Conditioner during requests for Status Updates to the
 * Air Conditioner.
 *
 * @author John Cunha - Initial contribution
 */
public class GreeStatusResponse4Gson {

    public String t = null;
    public int i = 0;
    public int uid = 0;
    public String cid = null;
    public String tcid = null;
    public String pack = null;

    public transient String decryptedPack = null;
    public transient GreeStatusResponsePack4Gson packJson = null;
}

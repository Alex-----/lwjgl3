/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bullet;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/**
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*) (
 *     btCollisionWorld *collisionWorld,
 *     btScalar deltaTimeStep
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("p_btActionInterface_updateAction")
public interface BTActionInterfaceUpdateActionI extends CallbackI.V {

    String SIGNATURE = "(pf)v";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default void callback(long args) {
        invoke(
            dcbArgPointer(args),
            dcbArgFloat(args)
        );
    }

    void invoke(@NativeType("btCollisionWorld *") long collisionWorld, @NativeType("btScalar") float deltaTimeStep);

}
/*
 * Copyright (c) 2009 Sun Microsystems, Inc.  All rights reserved.
 *
 * Sun Microsystems, Inc. has intellectual property rights relating to technology embodied in the product
 * that is described in this document. In particular, and without limitation, these intellectual property
 * rights may include one or more of the U.S. patents listed at http://www.sun.com/patents and one or
 * more additional patents or pending patent applications in the U.S. and in other countries.
 *
 * U.S. Government Rights - Commercial software. Government users are subject to the Sun
 * Microsystems, Inc. standard license agreement and applicable provisions of the FAR and its
 * supplements.
 *
 * Use is subject to license terms. Sun, Sun Microsystems, the Sun logo, Java and Solaris are trademarks or
 * registered trademarks of Sun Microsystems, Inc. in the U.S. and other countries. All SPARC trademarks
 * are used under license and are trademarks or registered trademarks of SPARC International, Inc. in the
 * U.S. and other countries.
 *
 * UNIX is a registered trademark in the U.S. and other countries, exclusively licensed through X/Open
 * Company, Ltd.
 */
package com.sun.cri.ri;

import com.sun.cri.ci.*;

/**
 * This interface represents method profiling information from the runtime system, including the
 * locations for invocation counters, bytecode location counters, etc.
 *
 * @author Ben L. Titzer
 */
public interface RiMethodProfile {
    CiConstant encoding();
    int invocationCountOffset();
    int bciCountOffset(int bci);
    int branchTakenCountOffset(int bci);
    int branchNotTakenCountOffset(int bci);

    int headerOffset(int bci);
    int countOffset(int bci);
    RiType receiver(int bci, int i);
    int receiverCountOffset(int bci, int i);
    int receiverOffset(int bci, int i);
}

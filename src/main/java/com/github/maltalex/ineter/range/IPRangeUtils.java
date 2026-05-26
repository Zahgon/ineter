/*
 * Copyright (c) 2020, ineter contributors
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package com.github.maltalex.ineter.range;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import com.github.maltalex.ineter.base.IPAddress;

abstract class IPRangeUtils {

    static <T> T parseRange(String from, BiFunction<String, String, ? extends T> rangeProducer, Function<String, ? extends T> subnetProducer) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static <T> T parseSubnet(String from, BiFunction<String, Integer, ? extends T> subnetProducer, int singleAddressMask) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static <L extends Number & Comparable<L>, I extends IPAddress & Comparable<I>, R extends IPRange<R, ?, I, L>> List<R> merge(Collection<R> rangesToMerge, BiFunction<I, I, R> rangeCreator) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static <L extends Number & Comparable<L>, I extends IPAddress & Comparable<I>, R extends IPRange<R, ?, I, L>> boolean overlapsOrAdjacent(R mergedRange, R candidateRange) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}

/*
 * Copyright (c) 2020, ineter contributors
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package com.github.maltalex.ineter.range;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicLong;
import com.github.maltalex.ineter.base.IPAddress;
import com.github.maltalex.ineter.base.IPv4Address;

public class IPv4Range implements IPRange<IPv4Range, IPv4Subnet, IPv4Address, Long> {

    private static final long serialVersionUID = 3L;

    public static IPv4Range of(IPv4Address firstAddress, IPv4Address lastAddress) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static IPv4Range of(IPv4Address address) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static IPv4Range of(String firstAddress, String lastAddress) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static IPv4Range of(String address) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static IPv4Range of(byte[] firstAddress, byte[] lastAddress) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static IPv4Range of(byte[] address) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static IPv4Range of(Inet4Address firstAddress, Inet4Address lastAddress) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static IPv4Range of(Inet4Address address) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * merges the given {@link IPv4Range} instances to a minimal list of
     * non-overlapping ranges
     *
     * @return a list of {@link IPv4Range}
     */
    public static List<IPv4Range> merge(IPv4Range... ranges) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * merges the given collection of {@link IPv4Range} instances to a minimal list
     * of non-overlapping ranges
     *
     * @return a list of {@link IPv4Range}
     */
    public static List<IPv4Range> merge(Collection<IPv4Range> ranges) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Parses the given String into an {@link IPv4Range} The String can be either a
     * single address, a range such as "192.168.0.0-192.168.1.2" or a subnet such as
     * "192.168.0.0/16"
     *
     * @param from - a String representation of a single IPv4 address, a range or a
     *             subnet
     * @return An {@link IPv4Range}
     */
    public static IPv4Range parse(String from) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected final IPv4Address firstAddress;

    protected final IPv4Address lastAddress;

    public IPv4Range(IPv4Address firstAddress, IPv4Address lastAddress) {
        this.firstAddress = firstAddress;
        this.lastAddress = lastAddress;
        if (this.firstAddress == null || this.lastAddress == null) {
            throw new NullPointerException("Neither the first nor the last address can be null");
        }
        if (this.firstAddress.compareTo(lastAddress) > 0) {
            throw new IllegalArgumentException(String.format("The first address in the range (%s) has to be lower than the last address (%s)", firstAddress.toString(), lastAddress.toString()));
        }
    }

    @Override
    public IPv4Address getFirst() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public IPv4Address getLast() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Long length() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int hashCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean equals(Object obj) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Iterator<IPv4Address> iterator(boolean skipFirst, boolean skipLast) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected IPv4Subnet maxSubnetInRange(IPv4Address addr) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public List<IPv4Subnet> toSubnets() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int intLength() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public IPv4Range withFirst(IPv4Address address) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public IPv4Range withLast(IPv4Address address) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<IPv4Range> withRemoved(Collection<IPv4Range> ranges) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<IPv4Range> withRemoved(IPv4Range r) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}

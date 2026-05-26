/*
 * Copyright (c) 2020, ineter contributors
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package com.github.maltalex.ineter.range;

import java.math.BigInteger;
import java.net.Inet6Address;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicLong;
import com.github.maltalex.ineter.base.IPAddress;
import com.github.maltalex.ineter.base.IPv6Address;

public class IPv6Range implements IPRange<IPv6Range, IPv6Subnet, IPv6Address, BigInteger> {

    private static final BigInteger INTEGER_MAX_VALUE = new BigInteger(new byte[] { 0x7f, (byte) 0xff, (byte) 0xff, (byte) 0xff });

    private static final long serialVersionUID = 3L;

    public static IPv6Range of(IPv6Address firstAddress, IPv6Address lastAddress) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static IPv6Range of(IPv6Address address) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static IPv6Range of(String firstAddress, String lastAddress) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static IPv6Range of(String address) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static IPv6Range of(byte[] firstAddress, byte[] lastAddress) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static IPv6Range of(byte[] address) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static IPv6Range of(Inet6Address firstAddress, Inet6Address lastAddress) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static IPv6Range of(Inet6Address address) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * merges the given {@link IPv6Range} instances to a minimal list of
     * non-overlapping ranges
     *
     * @return a list of {@link IPv6Range}
     */
    public static List<IPv6Range> merge(IPv6Range... ranges) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * merges the given collection of {@link IPv6Range} instances to a minimal list
     * of non-overlapping ranges
     *
     * @return a list of {@link IPv6Range}
     */
    public static List<IPv6Range> merge(Collection<IPv6Range> ranges) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Parses the given String into an {@link IPv6Range} The String can be either a
     * single address, a range such as "2001::-2002::" or a subnet such as
     * "2001::/16"
     *
     * @param from - a String representation of a single IPv6 address, a range or a
     *             subnet
     * @return An {@link IPv6Range}
     */
    public static IPv6Range parse(String from) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    final IPv6Address firstAddress;

    final IPv6Address lastAddress;

    public IPv6Range(IPv6Address firstAddress, IPv6Address lastAddress) {
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
    public IPv6Address getFirst() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public IPv6Address getLast() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public BigInteger length() {
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
    public Iterator<IPv6Address> iterator(boolean skipFirst, boolean skipLast) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected int numberOfTrailingOnes(IPv6Address a) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected int numberOfTrailingZeros(IPv6Address a) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected int numberOfLeadingEq(IPv6Address a, IPv6Address b) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected IPv6Subnet maxSubnetInRange(IPv6Address addr) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public List<IPv6Subnet> toSubnets() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int intLength() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public IPv6Range withFirst(IPv6Address address) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public IPv6Range withLast(IPv6Address address) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<IPv6Range> withRemoved(Collection<IPv6Range> ranges) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<IPv6Range> withRemoved(IPv6Range r) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}

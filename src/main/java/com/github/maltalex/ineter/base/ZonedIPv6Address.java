/*
 * Copyright (c) 2020, ineter contributors
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package com.github.maltalex.ineter.base;

import java.net.Inet6Address;
import java.util.Objects;

public class ZonedIPv6Address extends IPv6Address {

    private static final long serialVersionUID = 1L;

    /**
     * Build an ZonedIPv6Address from a literal IPv6 with a zone designation such as
     * "[fe80::1%2]","fe80::1%eth0", and similar valid forms
     *
     * @param address with zone
     * @return new ZonedIPv6Address instance
     * @throws IllegalArgumentException if the provided address is invalid
     */
    public static ZonedIPv6Address of(String address) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Build a ZonedIPv6Address from two longs and zone - upper and lower 64 bits in
     * form of longs, and a String zone
     *
     * @param upper upper 64 bits of the IPv6Address
     * @param lower lower 64 bits of the IPv6Address
     * @param zone  zone String
     * @return new IPv6Address instance
     */
    public static ZonedIPv6Address of(long upper, long lower, String zone) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Build a ZonedIPv6Address from a 16 byte long big-endian (highest byte first)
     * byte array and a zone String
     *
     * @param bigEndianByteArr 16 byte big-endian byte array
     * @param zone             zone String
     * @return new ZoneIPv6Address instance
     */
    public static ZonedIPv6Address of(byte[] bigEndianByteArr, String zone) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Build a ZonedIPv6Address from an IPv6Address and a separate zone String
     *
     * @param address
     * @param zone
     * @return new ZonedIPv6Address instance
     */
    public static ZonedIPv6Address of(IPv6Address address, String zone) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Build a ZonedIPv6Address from an Inet6Address with a scoped interface or
     * scope id
     *
     * @param address
     * @return new IPv6Address instance
     */
    public static ZonedIPv6Address of(Inet6Address address) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected final String zone;

    /**
     * Build a ZonedIPv6Address from two longs an a String - upper and lower 64 bits
     * in form of longs and a zone
     *
     * @param upper upper 64 bits of the IPv6Address
     * @param lower lower 64 bits of the IPv6Address
     * @param zone  the IPv6Address
     */
    public ZonedIPv6Address(long upper, long lower, String zone) {
        super(upper, lower);
        this.zone = zone;
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
    public int compareTo(IPv6Address o) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public ZonedIPv6Address next() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public ZonedIPv6Address plus(long n) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public ZonedIPv6Address plus(int n) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public ZonedIPv6Address previous() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public ZonedIPv6Address minus(int n) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public ZonedIPv6Address minus(long n) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Does this address have a specific zone?
     *
     * @return true
     */
    @Override
    public boolean isZoned() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns the zone this address belongs to
     *
     * @return the zone
     */
    public String getZone() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}

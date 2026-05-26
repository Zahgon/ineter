/*
 * Copyright (c) 2020, ineter contributors
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package com.github.maltalex.ineter.base;

import java.net.Inet4Address;
import com.github.maltalex.ineter.range.IPv4Range;
import com.github.maltalex.ineter.range.IPv4Subnet;

public class IPv4Address implements IPAddress, Comparable<IPv4Address> {

    public static enum IPv4KnownRange {

        //@formatter:off
        /**
         * 127.0.0.0/8 - RFC 990
         */
        LOOPBACK(IPv4Subnet.of("127.0.0.0/8")),
        /**
         * 0.0.0.0/8 - RFC 1700
         */
        UNSPECIFIED(IPv4Subnet.of("0.0.0.0/8")),
        /**
         * 10.0.0.0/8 - RFC 1918
         */
        PRIVATE_10(IPv4Subnet.of("10.0.0.0/8")),
        /**
         * 172.16.0.0/12 - RFC 1918
         */
        PRIVATE_172_16(IPv4Subnet.of("172.16.0.0/12")),
        /**
         * 192.168.0.0/16 - RFC 1918
         */
        PRIVATE_192_168(IPv4Subnet.of("192.168.0.0/16")),
        /**
         * 198.18.0.0/15 - RFC 2544
         */
        TESTING(IPv4Subnet.of("198.18.0.0/15")),
        /**
         * 192.88.99.0/24 - RFC 3068
         */
        TRANSLATION_6_TO_4(IPv4Subnet.of("192.88.99.0/24")),
        /**
         * 169.254.0.0/16 - RFC 3927
         */
        LINK_LOCAL(IPv4Subnet.of("169.254.0.0/16")),
        /**
         * 192.0.0.0/24 - RFC 5736
         */
        SPECIAL_PURPOSE(IPv4Subnet.of("192.0.0.0/24")),
        /**
         * 192.0.2.0/24 - RFC 5737
         */
        TEST_NET1(IPv4Subnet.of("192.0.2.0/24")),
        /**
         * 198.51.100.0/24 - RFC 5737
         */
        TEST_NET2(IPv4Subnet.of("198.51.100.0/24")),
        /**
         * 203.0.113.0/24 - RFC 5737
         */
        TEST_NET3(IPv4Subnet.of("203.0.113.0/24")),
        /**
         * 224.0.0.0/4 - RFC 5771
         */
        MULTICAST(IPv4Subnet.of("224.0.0.0/4")),
        /**
         * "100.64.0.0/10 - RFC 6598
         */
        CGNAT(IPv4Subnet.of("100.64.0.0/10")),
        /**
         * 240.0.0.0/4 - RFC 6890
         */
        RESERVED_240(IPv4Subnet.of("240.0.0.0/4")),
        /**
         * 255.255.255.255/32 - RFC 6890
         */
        BROADCAST(IPv4Subnet.of("255.255.255.255/32"));

        //@formatter:on
        private IPv4Range range;

        private IPv4KnownRange(IPv4Range range) {
            this.range = range;
        }

        public boolean contains(IPv4Address address) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public IPv4Range range() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    protected static enum Ip4Octet {

        OCTET_A(0), OCTET_B(1), OCTET_C(2), OCTET_D(3);

        private final int mask;

        private final int shift;

        private Ip4Octet(int byteShift) {
            this.shift = 24 - (byteShift << 3);
            this.mask = 0xff000000 >>> (byteShift << 3);
        }

        public int isolateAsInt(int ip) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public byte isolateAsByte(int ip) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    public static final int ADDRESS_BITS = 32;

    public static final int ADDRESS_BYTES = 4;

    public static final IPv4Address MIN_ADDR = IPv4Address.of("0.0.0.0");

    public static final IPv4Address MAX_ADDR = IPv4Address.of("255.255.255.255");

    private static final long serialVersionUID = 2L;

    /**
     * Build an IPv4Address from a 4 byte long big-endian (highest byte first) byte
     * array
     *
     * @param bigEndianByteArr 4 byte big-endian byte array
     * @return new IPv4Address instance
     */
    public static IPv4Address of(byte[] bigEndianByteArr) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Build an IPv4Address from an int (32 bit)
     *
     * @param intIp
     * @return new IPv4Address instance
     */
    public static IPv4Address of(int intIp) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Build an IPv4Address from a literal String representations such as
     * "192.168.1.1"
     *
     * @param ip literal IP address String
     * @return new IPv4Address instance
     */
    public static IPv4Address of(String ip) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Build an IPv4Address from an java.net.Inet4Address
     *
     * @param address
     * @return new IPv4Address instance
     */
    public static IPv4Address of(Inet4Address address) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected static int shiftToInt(int a, int b, int c, int d) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected static int shiftToInt(byte a, byte b, byte c, byte d) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected final int ip;

    /**
     * IPv4Address int constructor
     *
     * @param intIp
     */
    public IPv4Address(int intIp) {
        this.ip = intIp;
    }

    @Override
    public int version() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int compareTo(IPv4Address o) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean equals(Object obj) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int hashCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean is6To4() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Is this the broadcast address?
     *
     * @return true if the address is 255.255.255.255
     */
    public boolean isBroadcast() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean isMartian() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean isLinkLocal() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean isLoopback() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean isMulticast() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean isPrivate() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean isReserved() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean isUnspecified() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public IPv4Address next() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public IPv4Address plus(int n) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public IPv4Address previous() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public IPv4Address minus(int n) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public byte[] toBigEndianArray() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Return a copy of this address, in Inet4Address form
     *
     * @return new Inet4Address instance
     */
    public Inet4Address toInet4Address() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public byte[] toLittleEndianArray() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Return a copy of this address in int form
     *
     * @return int representation of this address
     */
    public int toInt() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Return a copy of this address in long form
     *
     * @return long representation of this address
     */
    public long toLong() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Return this address in /32 subnet form. Note that {@link IPv4Subnet} is a
     * type of {@link IPv4Range}, so the returned value is also a single address
     * range
     *
     * @return This address as a single /32 subnet
     */
    public IPv4Subnet toSubnet() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a range between this address and an arbitrary one This method takes
     * care of comparing the addresses so they're always passed to the range factory
     * in the right order
     *
     * @return an IPv4Range between this address and a given one
     */
    public IPv4Range toRange(IPv4Address address) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns true iff the given address is adjacent (above or below) the current
     * one
     *
     * @return true iff the given address is adjacent to this one
     */
    public boolean isAdjacentTo(IPv4Address other) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns the distance to the given address. If the provided address is bigger,
     * the result will be positive. If it's smaller, the result will be negative.
     *
     * For example, the distance from 10.0.0.1 to 10.0.0.3 is 2, the distance from
     * 10.0.0.3 to 10.0.0.1 is -2
     *
     * @return the distance between this address and the given one
     */
    public Long distanceTo(IPv4Address other) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns the address which is the results of a bitwise AND between this
     * address and the given one. This operation is useful for masking and various
     * low level bit manipulation
     *
     * @return a bitwise AND between this address and the given one
     */
    public IPv4Address and(IPv4Address other) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns the address which is the results of a bitwise OR between this address
     * and the given one. This operation is useful for masking and various low level
     * bit manipulation
     *
     * @return a bitwise OR between this address and the given one
     */
    public IPv4Address or(IPv4Address other) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns the address which is the results of a bitwise XOR between this
     * address and the given one. This operation is useful for masking and various
     * low level bit manipulation
     *
     * @return a bitwise XOR between this address and the given one
     */
    public IPv4Address xor(IPv4Address other) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns the address which is the results of a bitwise NOT of this address
     * This operation is useful for masking and various low level bit manipulation
     *
     * @return a bitwise NOT of this address
     */
    public IPv4Address not() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}

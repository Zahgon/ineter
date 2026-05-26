/*
 * Copyright (c) 2020, ineter contributors
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package com.github.maltalex.ineter.base;

import java.math.BigInteger;
import java.net.Inet6Address;
import com.github.maltalex.ineter.range.IPv6Range;
import com.github.maltalex.ineter.range.IPv6Subnet;

public class IPv6Address implements IPAddress, Comparable<IPv6Address> {

    public static enum IPv6KnownRange {

        //@formatter:off
        /**
         * ::/128 - RFC 4291
         */
        UNSPECIFIED(IPv6Subnet.of("::/128")),
        /**
         * ::1/128 - RFC 4291
         */
        LOOPBACK(IPv6Subnet.of("::1/128")),
        /**
         * 100::/64 - RFC 6666
         */
        DISCARD(IPv6Subnet.of("100::/64")),
        /**
         * 2001:10::/28 - RFC 4843
         */
        ORCHID(IPv6Subnet.of("2001:10::/28")),
        /**
         * 2001:20::/28
         */
        ORCHID_2(IPv6Subnet.of("2001:20::/28")),
        /**
         * 2001:db8::/32 - RFC 3849
         */
        DOCUMENTATION(IPv6Subnet.of("2001:db8::/32")),
        /**
         * ::/96 - RFC 4291
         */
        IPV4_COMPATIBLE_IPV6_DEPRECATED(IPv6Subnet.of("::/96")),
        /**
         * ::ffff:0:0/96 - RFC 4291
         */
        IPV4_MAPPED_IPV6(IPv6Subnet.of("::ffff:0:0/96")),
        /**
         * 64:ff9b::/96 - RFC 6052
         */
        IPV4_IPV6_TRANSLATION_WELL_KNOWN(IPv6Subnet.of("64:ff9b::/96")),
        /**
         * 2002::/16 - RFC 3056
         */
        TRANSLATION_6_TO_4(IPv6Subnet.of("2002::/16")),
        /**
         * 2001:0000:/32 - RFC 4380
         */
        TEREDO(IPv6Subnet.of("2001::/32")),
        /**
         * fc00::/7 - RFC 4193
         */
        ULA(IPv6Subnet.of("fc00::/7")),
        /**
         * ff00::/8 - RFC 4291
         */
        MULTICAST(IPv6Subnet.of("ff00::/8")),
        /**
         * ff0e::/16 - RFC 4291
         */
        GLOBAL_MULTICAST(IPv6Subnet.of("ff0e::/16")),
        /**
         * ff05::/16 - RFC 4291
         */
        SITE_LOCAL_MULTICAST(IPv6Subnet.of("ff05::/16")),
        /**
         * ff02::/16 - RFC 4291
         */
        LINK_LOCAL_MULTICAST(IPv6Subnet.of("ff02::/16")),
        /**
         * ff01::/16 - RFC 4291
         */
        INTERFACE_LOCAL_MULTICAST(IPv6Subnet.of("ff01::/16")),
        /**
         * 2000::/3 - RFC 3587
         */
        GLOBAL_UNICAST(IPv6Subnet.of("2000::/3")),
        /**
         * fe80::/10 - RFC 4291
         */
        LINK_LOCAL_UNICAST(IPv6Subnet.of("fe80::/10")),
        /**
         * fec::/10 - RFC 4291
         */
        SITE_LOCAL_UNICAST_DEPRECATED(IPv6Subnet.of("fec::/10"));

        //@formatter:on
        private IPv6Range range;

        private IPv6KnownRange(IPv6Range subnet) {
            this.range = subnet;
        }

        public boolean contains(IPv6Address address) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public IPv6Range range() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    /**
     * Enum for extracting 16-bit shorts from 64-bit longs
     */
    protected static enum LongShort {

        SHORT_A(0), SHORT_B(1), SHORT_C(2), SHORT_D(3);

        private final long mask;

        private final int shift;

        private LongShort(int shortShift) {
            this.shift = 48 - (shortShift << 4);
            this.mask = 0xffff000000000000L >>> (shortShift << 4);
        }

        public long isolateAsLong(long l) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public int isolateAsInt(long l) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    /**
     * Enum for extracting bytes from 64-bit longs
     */
    protected static enum LongByte {

        BYTE_A(0),
        BYTE_B(1),
        BYTE_C(2),
        BYTE_D(3),
        BYTE_E(4),
        BYTE_F(5),
        BYTE_G(6),
        BYTE_H(7);

        private final long mask;

        private final int shift;

        private LongByte(int shortShift) {
            this.shift = 56 - (shortShift << 3);
            this.mask = 0xff00000000000000L >>> (shortShift << 3);
        }

        public long isolateAsLong(long l) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public byte isolateAsByte(long l) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public long expand(byte b) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        static long extractLong(byte[] bigEndianByteArr, int offset) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    public static final int ADDRESS_BITS = 128;

    public static final int ADDRESS_BYTES = 16;

    public static final int ADDRESS_SHORTS = 8;

    public static final int HOLDER_BITS = 64;

    public static final IPv6Address MIN_ADDR = IPv6Address.of("::");

    public static final IPv6Address MAX_ADDR = IPv6Address.of("ffff:ffff:ffff:ffff:ffff:ffff:ffff:ffff");

    private static final long serialVersionUID = 2L;

    private static final BigInteger NEGATIVE_ONE = BigInteger.ONE.negate();

    /**
     * Build an IPv6Address from two longs - upper and lower 64 bits in form of
     * longs
     *
     * @param upper upper 64 bits of the IPv6Address
     * @param lower lower 64 bits of the IPv6Address
     * @return new IPv6Address instance
     */
    public static IPv6Address of(long upper, long lower) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected static void verifyArray(byte[] bigEndianByteArr) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Build an IPv6Address from a 16 byte long big-endian (highest byte first) byte
     * array
     *
     * @param bigEndianByteArr 16 byte big-endian byte array
     * @return new IPv6Address instance
     */
    public static IPv6Address of(byte[] bigEndianByteArr) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Build an IPv6Address from an Inet6Address
     *
     * @param address
     * @return new IPv6Address instance
     */
    public static IPv6Address of(Inet6Address address) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Build an IPv6Address or a ZonedIPv6Address from a literal IPv6 address in
     * String from such as "2001:1:2:3:4:5:6:7", "2001::", "[::]", "fe80::1%eth0",
     * and similar valid forms
     *
     * @param address
     * @return new IPv6Address instance
     */
    public static IPv6Address of(String address) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected static boolean isHexDigit(char c) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected static int unsignedCompare(long a, long b) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static boolean hasCarry(long a, long b, long result) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static boolean hasBorrow(long a, long b, long result) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected final long upper;

    protected final long lower;

    /**
     * Build an IPv6Address from two longs - upper and lower 64 bits in form of
     * longs
     *
     * @param upper upper 64 bits of the IPv6Address
     * @param lower lower 64 bits of the IPv6Address
     */
    public IPv6Address(long upper, long lower) {
        this.upper = upper;
        this.lower = lower;
    }

    @Override
    public int hashCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean equals(Object obj) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * return upper 64 bits of the address in long form
     *
     * @return upper 64 bits
     */
    public long getUpper() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * return lower 64 bits of the address in long form
     *
     * @return lower 64 bits
     */
    public long getLower() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean is6To4() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean isMartian() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Is this one of the IPv6 addresses reserved for IPv4-IPv6 translation -
     * Teredo, IPv4-mapped-IPv6, 6to4, or IPv4-embedded-IPv6?
     *
     * @return true if this is a IPv4-IPv6 translation address
     */
    public boolean isIPv4Translation() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean isLoopback() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Is this an IPv6 global unicast address?
     *
     * @return true if this is a global unicast address
     */
    public boolean isGlobalUnicast() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean isLinkLocal() {
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
    public IPv6Address next() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Return an address larger than the current one by n, with wraparound
     *
     * @param n
     * @return an address larger by n
     */
    public IPv6Address plus(long n) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public IPv6Address plus(int n) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public IPv6Address previous() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public IPv6Address minus(int n) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Return an address smaller than the current one by n, with wraparound
     *
     * @param n
     * @return an address smaller by n
     */
    public IPv6Address minus(long n) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public byte[] toBigEndianArray() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public byte[] toLittleEndianArray() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int compareTo(IPv6Address o) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected int longCompare(IPv6Address o) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Inet6Address toInet6Address() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int version() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * does this address have a specific zone?
     *
     * @return false
     */
    public boolean isZoned() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Return this address in /128 subnet form. Note that {@link IPv6Subnet} is a
     * type of {@link IPv6Range}, so the returned value is also a single address
     * range
     *
     * @return This address as a single /128 subnet
     */
    public IPv6Subnet toSubnet() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a range between this address and an arbitrary one This method takes
     * care of comparing the addresses so they're always passed to the range factory
     * in the right order
     *
     * @return an IPv6Range between this address and a given one
     */
    public IPv6Range toRange(IPv6Address address) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns true iff the given address is adjacent (above or below) the current
     * one
     *
     * @return true iff the given address is adjacent to this one
     */
    public boolean isAdjacentTo(IPv6Address other) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns the distance to the given address. If the provided address is bigger,
     * the result will be positive. If it's smaller, the result will be negative.
     *
     * For example, the distance from ::1 to ::3 is 2, the distance from ::3 to ::1
     * is -2
     *
     * @return the distance between this address and the given one
     */
    public BigInteger distanceTo(IPv6Address other) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns the address which is the results of a bitwise AND between this
     * address and the given one. This operation is useful for masking and various
     * low level bit manipulation
     *
     * @return a bitwise AND between this address and the given one
     */
    public IPv6Address and(IPv6Address other) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns the address which is the results of a bitwise OR between this address
     * and the given one. This operation is useful for masking and various low level
     * bit manipulation
     *
     * @return a bitwise OR between this address and the given one
     */
    public IPv6Address or(IPv6Address other) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns the address which is the results of a bitwise XOR between this
     * address and the given one. This operation is useful for masking and various
     * low level bit manipulation
     *
     * @return a bitwise XOR between this address and the given one
     */
    public IPv6Address xor(IPv6Address other) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns the address which is the results of a bitwise NOT of this address
     * This operation is useful for masking and various low level bit manipulation
     *
     * @return a bitwise NOT of this address
     */
    public IPv6Address not() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}

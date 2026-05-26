/*
 * Copyright (c) 2020, ineter contributors
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package com.github.maltalex.ineter.base;

import java.io.Serializable;
import java.math.BigInteger;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Abstract class that represents a single IP address
 *
 * @author maltalex
 */
public interface IPAddress extends Serializable {

    /**
     * Returns either an IPv4 or an IPv6 address
     *
     * @param bigEndianByteArr array of 4 or 16 bytes
     * @return new IPv4Address / IPv6Address
     * @throws IllegalArgumentException if the given array isn't 4 or 16 bytes long
     */
    public static IPAddress of(byte[] bigEndianByteArr) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns either an IPv4 or an IPv6 address
     *
     * @param ip an IPv4 or IPv6 address in literal String form
     * @return new IPv4Address / IPv6Address
     * @throws IllegalArgumentException if the given array isn't an IPv4/IPv6
     *                                  address
     */
    public static IPAddress of(String ip) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns either an IPv4 or an IPv6 address built from an InetAddress
     *
     * @param address to copy from
     * @return IPv4Address or IPv6Address instance
     */
    public static IPAddress of(InetAddress address) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <C extends Comparable<C> & IPAddress> C max(C a, C b) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <C extends Comparable<C> & IPAddress> C min(C a, C b) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Checks whether the given address is a 6to4 address
     *
     * @return true if the give address is a 6to4 address, false otherwise
     */
    public boolean is6To4();

    /**
     * Martian addresses are reserved and private addresses that should not appear
     * on the public internet
     *
     * @return true if the address is martian, false otherwise
     */
    public boolean isMartian();

    /**
     * Checks whether the address is a loopback address
     *
     * @return true if the address is for a loopback, false otherwise
     */
    public boolean isLoopback();

    /**
     * Checks whether the address is part of a range reserved for multicast
     *
     * @return true if the address is reserved for multicast, false otherwise
     */
    public boolean isMulticast();

    /**
     * Checks whether the address is private
     *
     * @return true if the address is private, false otherwise
     */
    public boolean isPrivate();

    /**
     * Checks whether the address part of a reserved range
     *
     * @return true if the address is part of a reserved range, false otherwise
     */
    public boolean isReserved();

    /**
     * Checks whether the address is "unspecified"
     *
     * @return true if the address is "unspecified", false otherwise
     */
    public boolean isUnspecified();

    /**
     * Checks whether the address is link-local
     *
     * @return true if the address is link-local, false otherwise
     */
    public boolean isLinkLocal();

    /**
     * Returns the version of the IP address
     *
     * @return 4 for IPv4, 6 for IPv6
     */
    public int version();

    /**
     * Returns the following address, with wraparound
     *
     * @return the address following this one
     */
    public IPAddress next();

    /**
     * Return an address larger than the current one by n, with wraparound
     *
     * @param n
     * @return an address larger by n
     */
    public IPAddress plus(int n);

    /**
     * Returns the previous address, with wraparound
     *
     * @return the address before this one
     */
    public IPAddress previous();

    /**
     * Return an address smaller than the current one by n, with wraparound
     *
     * @param n
     * @return an address smaller by n
     */
    public IPAddress minus(int n);

    /**
     * The address as an array of bytes, with the highest byte first
     *
     * @return big-endian byte array
     */
    public byte[] toBigEndianArray();

    /**
     * The address as an array of bytes, with the highest byte last
     *
     * @return little-endian byte array
     */
    public byte[] toLittleEndianArray();

    /**
     * The address as an array of bytes, with the highest byte first
     *
     * @return big-endian byte array
     */
    default byte[] toArray() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * The address as a BigInteger, unsigned
     *
     * @return The address as an BigInteger
     */
    default BigInteger toBigInteger() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * The address as a BigInteger, signed
     *
     * @return The address as an BigInteger
     */
    default BigInteger toSignedBigInteger() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * The address as an InetAddress
     *
     * @return The address as an InetAddress
     */
    default InetAddress toInetAddress() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}

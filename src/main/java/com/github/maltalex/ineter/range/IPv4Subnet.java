/*
 * Copyright (c) 2020, ineter contributors
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package com.github.maltalex.ineter.range;

import com.github.maltalex.ineter.base.IPv4Address;

public class IPv4Subnet extends IPv4Range implements IPSubnet<IPv4Subnet, IPv4Range, IPv4Address, Long> {

    protected enum IPv4SubnetMask {

        // @formatter:off
        MASK_00,
        MASK_01,
        MASK_02,
        MASK_03,
        MASK_04,
        MASK_05,
        MASK_06,
        MASK_07,
        MASK_08,
        MASK_09,
        MASK_10,
        MASK_11,
        MASK_12,
        MASK_13,
        MASK_14,
        MASK_15,
        MASK_16,
        MASK_17,
        MASK_18,
        MASK_19,
        MASK_20,
        MASK_21,
        MASK_22,
        MASK_23,
        MASK_24,
        MASK_25,
        MASK_26,
        MASK_27,
        MASK_28,
        MASK_29,
        MASK_30,
        MASK_31,
        MASK_32;

        // @formatter:on
        public static IPv4SubnetMask fromMaskLen(int maskLen) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        private final int mask;

        private final int bitCount;

        IPv4SubnetMask() {
            this.bitCount = ordinal();
            this.mask = this.bitCount != 0 ? 0xffffffff << (32 - this.bitCount) : 0;
        }

        public int mask() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public int maskBitCount() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public int and(int ip) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public IPv4Address and(IPv4Address ip) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public int orInverted(int ip) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public IPv4Address orInverted(IPv4Address ip) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public IPv4Address toAddress() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    private static final long serialVersionUID = 3L;

    public static IPv4Subnet of(String cidr) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static IPv4Subnet of(String address, int maskLen) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static IPv4Subnet of(IPv4Address address, int maskLen) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static IPv4Subnet of(String address, String maskLen) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static IPv4Subnet parse(String from) throws IllegalArgumentException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static IPv4Subnet of(String address, Integer subnet) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected final int networkBitCount;

    public IPv4Subnet(IPv4Address address, IPv4SubnetMask mask) {
        super(mask.and(address), mask.orInverted(address));
        this.networkBitCount = mask.maskBitCount();
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int getNetworkBitCount() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public IPv4Address getNetworkMask() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int getHostBitCount() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public IPv4Address getNetworkAddress() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}

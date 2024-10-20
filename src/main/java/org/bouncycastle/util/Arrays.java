package org.bouncycastle.util;

import java.math.BigInteger;
import java.util.NoSuchElementException;

public final class Arrays {

    public static int hashCode(short[] arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var1 = arg0.length;
        int var2 = var1 + 1;
        while (true) {
            var1--;
            if (var1 < 0) {
                return var2;
            }
            int var3 = var2 * 257;
            var2 = var3 ^ arg0[var1] & 0xFF;
        }
    }

    public static boolean areEqual(boolean[] arg0, boolean[] arg1) {
        if (arg0 == arg1) {
            return true;
        } else if (arg0 == null || arg1 == null) {
            return false;
        } else if (arg0.length == arg1.length) {
            for (int var2 = 0; var2 != arg0.length; var2++) {
                if (arg0[var2] != arg1[var2]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public static void fill(int[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            arg0[var2] = arg1;
        }
    }

    public static short[] prepend(short[] arg0, short arg1) {
        if (arg0 == null) {
            return new short[] { arg1 };
        }
        int var2 = arg0.length;
        short[] var3 = new short[var2 + 1];
        System.arraycopy(arg0, 0, var3, 1, var2);
        var3[0] = arg1;
        return var3;
    }

    public static boolean contains(int[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            if (arg0[var2] == arg1) {
                return true;
            }
        }
        return false;
    }

    public static BigInteger[] clone(BigInteger[] arg0) {
        if (arg0 == null) {
            return null;
        } else {
            BigInteger[] var1 = new BigInteger[arg0.length];
            System.arraycopy(arg0, 0, var1, 0, arg0.length);
            return var1;
        }
    }

    public static int[] append(int[] arg0, int arg1) {
        if (arg0 == null) {
            return new int[] { arg1 };
        }
        int var2 = arg0.length;
        int[] var3 = new int[var2 + 1];
        System.arraycopy(arg0, 0, var3, 0, var2);
        var3[var2] = arg1;
        return var3;
    }

    public static int[] prepend(int[] arg0, int arg1) {
        if (arg0 == null) {
            return new int[] { arg1 };
        }
        int var2 = arg0.length;
        int[] var3 = new int[var2 + 1];
        System.arraycopy(arg0, 0, var3, 1, var2);
        var3[0] = arg1;
        return var3;
    }

    public static boolean areEqual(Object[] arg0, Object[] arg1) {
        if (arg0 == arg1) {
            return true;
        } else if (arg0 == null || arg1 == null) {
            return false;
        } else if (arg0.length == arg1.length) {
            for (int var2 = 0; var2 != arg0.length; var2++) {
                Object var3 = arg0[var2];
                Object var4 = arg1[var2];
                if (var3 == null) {
                    if (var4 != null) {
                        return false;
                    }
                } else if (!var3.equals(var4)) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public static BigInteger[] copyOfRange(BigInteger[] arg0, int arg1, int arg2) {
        int var3 = getLength(arg1, arg2);
        BigInteger[] var4 = new BigInteger[var3];
        if (arg0.length - arg1 < var3) {
            System.arraycopy(arg0, arg1, var4, 0, arg0.length - arg1);
        } else {
            System.arraycopy(arg0, arg1, var4, 0, var3);
        }
        return var4;
    }

    public static boolean contains(short[] arg0, short arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            if (arg0[var2] == arg1) {
                return true;
            }
        }
        return false;
    }

    public static long[] clone(long[] arg0) {
        if (arg0 == null) {
            return null;
        } else {
            long[] var1 = new long[arg0.length];
            System.arraycopy(arg0, 0, var1, 0, arg0.length);
            return var1;
        }
    }

    public static void fill(byte[] arg0, byte arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            arg0[var2] = arg1;
        }
    }

    public static void fill(char[] arg0, char arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            arg0[var2] = arg1;
        }
    }

    public static void fill(long[] arg0, long arg1) {
        for (int var3 = 0; var3 < arg0.length; var3++) {
            arg0[var3] = arg1;
        }
    }

    public static void fill(short[] arg0, short arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            arg0[var2] = arg1;
        }
    }

    public static byte[] concatenate(byte[] arg0, byte[] arg1, byte[] arg2, byte[] arg3) {
        if (arg0 != null && arg1 != null && arg2 != null && arg3 != null) {
            byte[] var4 = new byte[arg0.length + arg1.length + arg2.length + arg3.length];
            System.arraycopy(arg0, 0, var4, 0, arg0.length);
            System.arraycopy(arg1, 0, var4, arg0.length, arg1.length);
            System.arraycopy(arg2, 0, var4, arg0.length + arg1.length, arg2.length);
            System.arraycopy(arg3, 0, var4, arg0.length + arg1.length + arg2.length, arg3.length);
            return var4;
        } else if (arg3 == null) {
            return concatenate(arg0, arg1, arg2);
        } else if (arg2 == null) {
            return concatenate(arg0, arg1, arg3);
        } else if (arg1 == null) {
            return concatenate(arg0, arg2, arg3);
        } else {
            return concatenate(arg1, arg2, arg3);
        }
    }

    public static int hashCode(byte[] arg0, int arg1, int arg2) {
        if (arg0 == null) {
            return 0;
        }
        int var3 = arg2;
        int var4 = arg2 + 1;
        while (true) {
            var3--;
            if (var3 < 0) {
                return var4;
            }
            int var5 = var4 * 257;
            var4 = var5 ^ arg0[arg1 + var3];
        }
    }

    public static byte[] concatenate(byte[][] arg0) {
        int var1 = 0;
        for (int var2 = 0; var2 != arg0.length; var2++) {
            var1 += arg0[var2].length;
        }
        byte[] var3 = new byte[var1];
        int var4 = 0;
        for (int var5 = 0; var5 != arg0.length; var5++) {
            System.arraycopy(arg0[var5], 0, var3, var4, arg0[var5].length);
            var4 += arg0[var5].length;
        }
        return var3;
    }

    public static int hashCode(char[] arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var1 = arg0.length;
        int var2 = var1 + 1;
        while (true) {
            var1--;
            if (var1 < 0) {
                return var2;
            }
            int var3 = var2 * 257;
            var2 = var3 ^ arg0[var1];
        }
    }

    public static int hashCode(int[][] arg0) {
        int var1 = 0;
        for (int var2 = 0; var2 != arg0.length; var2++) {
            var1 = var1 * 257 + hashCode(arg0[var2]);
        }
        return var1;
    }

    public static int hashCode(int[] arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var1 = arg0.length;
        int var2 = var1 + 1;
        while (true) {
            var1--;
            if (var1 < 0) {
                return var2;
            }
            int var3 = var2 * 257;
            var2 = var3 ^ arg0[var1];
        }
    }

    public static int hashCode(int[] arg0, int arg1, int arg2) {
        if (arg0 == null) {
            return 0;
        }
        int var3 = arg2;
        int var4 = arg2 + 1;
        while (true) {
            var3--;
            if (var3 < 0) {
                return var4;
            }
            int var5 = var4 * 257;
            var4 = var5 ^ arg0[arg1 + var3];
        }
    }

    public static int compareUnsigned(byte[] arg0, byte[] arg1) {
        if (arg0 == arg1) {
            return 0;
        } else if (arg0 == null) {
            return -1;
        } else if (arg1 == null) {
            return 1;
        } else {
            int var2 = Math.min(arg0.length, arg1.length);
            for (int var3 = 0; var3 < var2; var3++) {
                int var4 = arg0[var3] & 0xFF;
                int var5 = arg1[var3] & 0xFF;
                if (var4 < var5) {
                    return -1;
                }
                if (var4 > var5) {
                    return 1;
                }
            }
            if (arg0.length < arg1.length) {
                return -1;
            } else if (arg0.length > arg1.length) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    public static int hashCode(long[] arg0, int arg1, int arg2) {
        if (arg0 == null) {
            return 0;
        }
        int var3 = arg2;
        int var4 = arg2 + 1;
        while (true) {
            var3--;
            if (var3 < 0) {
                return var4;
            }
            long var5 = arg0[arg1 + var3];
            int var7 = var4 * 257;
            int var8 = var7 ^ (int) var5;
            int var9 = var8 * 257;
            var4 = var9 ^ (int) (var5 >>> 32);
        }
    }

    public static int hashCode(short[][][] arg0) {
        int var1 = 0;
        for (int var2 = 0; var2 != arg0.length; var2++) {
            var1 = var1 * 257 + hashCode(arg0[var2]);
        }
        return var1;
    }

    public static int hashCode(short[][] arg0) {
        int var1 = 0;
        for (int var2 = 0; var2 != arg0.length; var2++) {
            var1 = var1 * 257 + hashCode(arg0[var2]);
        }
        return var1;
    }

    public static int hashCode(long[] arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var1 = arg0.length;
        int var2 = var1 + 1;
        while (true) {
            var1--;
            if (var1 < 0) {
                return var2;
            }
            long var3 = arg0[var1];
            int var5 = var2 * 257;
            int var6 = var5 ^ (int) var3;
            int var7 = var6 * 257;
            var2 = var7 ^ (int) (var3 >>> 32);
        }
    }

    public static int[] clone(int[] arg0) {
        if (arg0 == null) {
            return null;
        } else {
            int[] var1 = new int[arg0.length];
            System.arraycopy(arg0, 0, var1, 0, arg0.length);
            return var1;
        }
    }

    public static byte[] clone(byte[] arg0) {
        if (arg0 == null) {
            return null;
        } else {
            byte[] var1 = new byte[arg0.length];
            System.arraycopy(arg0, 0, var1, 0, arg0.length);
            return var1;
        }
    }

    public static char[] clone(char[] arg0) {
        if (arg0 == null) {
            return null;
        } else {
            char[] var1 = new char[arg0.length];
            System.arraycopy(arg0, 0, var1, 0, arg0.length);
            return var1;
        }
    }

    public static byte[] clone(byte[] arg0, byte[] arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg1 != null && arg0.length == arg1.length) {
            System.arraycopy(arg0, 0, arg1, 0, arg1.length);
            return arg1;
        } else {
            return clone(arg0);
        }
    }

    public static byte[][] clone(byte[][] arg0) {
        if (arg0 == null) {
            return (byte[][]) null;
        }
        byte[][] var1 = new byte[arg0.length][];
        for (int var2 = 0; var2 != var1.length; var2++) {
            var1[var2] = clone(arg0[var2]);
        }
        return var1;
    }

    public static long[] copyOfRange(long[] arg0, int arg1, int arg2) {
        int var3 = getLength(arg1, arg2);
        long[] var4 = new long[var3];
        if (arg0.length - arg1 < var3) {
            System.arraycopy(arg0, arg1, var4, 0, arg0.length - arg1);
        } else {
            System.arraycopy(arg0, arg1, var4, 0, var3);
        }
        return var4;
    }

    public static boolean areEqual(byte[] arg0, byte[] arg1) {
        if (arg0 == arg1) {
            return true;
        } else if (arg0 == null || arg1 == null) {
            return false;
        } else if (arg0.length == arg1.length) {
            for (int var2 = 0; var2 != arg0.length; var2++) {
                if (arg0[var2] != arg1[var2]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public static boolean areEqual(int[] arg0, int[] arg1) {
        if (arg0 == arg1) {
            return true;
        } else if (arg0 == null || arg1 == null) {
            return false;
        } else if (arg0.length == arg1.length) {
            for (int var2 = 0; var2 != arg0.length; var2++) {
                if (arg0[var2] != arg1[var2]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public static long[] clone(long[] arg0, long[] arg1) {
        if (arg0 == null) {
            return null;
        } else if (arg1 != null && arg0.length == arg1.length) {
            System.arraycopy(arg0, 0, arg1, 0, arg1.length);
            return arg1;
        } else {
            return clone(arg0);
        }
    }

    public static short[] clone(short[] arg0) {
        if (arg0 == null) {
            return null;
        } else {
            short[] var1 = new short[arg0.length];
            System.arraycopy(arg0, 0, var1, 0, arg0.length);
            return var1;
        }
    }

    public static boolean constantTimeAreEqual(byte[] arg0, byte[] arg1) {
        if (arg0 == arg1) {
            return true;
        } else if (arg0 == null || arg1 == null) {
            return false;
        } else if (arg0.length == arg1.length) {
            int var2 = 0;
            for (int var3 = 0; var3 != arg0.length; var3++) {
                var2 |= arg0[var3] ^ arg1[var3];
            }
            return var2 == 0;
        } else {
            return false;
        }
    }

    public static byte[] copyOf(byte[] arg0, int arg1) {
        byte[] var2 = new byte[arg1];
        if (arg1 < arg0.length) {
            System.arraycopy(arg0, 0, var2, 0, arg1);
        } else {
            System.arraycopy(arg0, 0, var2, 0, arg0.length);
        }
        return var2;
    }

    public static int[] concatenate(int[] arg0, int[] arg1) {
        if (arg0 == null) {
            return clone(arg1);
        } else if (arg1 == null) {
            return clone(arg0);
        } else {
            int[] var2 = new int[arg0.length + arg1.length];
            System.arraycopy(arg0, 0, var2, 0, arg0.length);
            System.arraycopy(arg1, 0, var2, arg0.length, arg1.length);
            return var2;
        }
    }

    public static int[] copyOf(int[] arg0, int arg1) {
        int[] var2 = new int[arg1];
        if (arg1 < arg0.length) {
            System.arraycopy(arg0, 0, var2, 0, arg1);
        } else {
            System.arraycopy(arg0, 0, var2, 0, arg0.length);
        }
        return var2;
    }

    public static long[] copyOf(long[] arg0, int arg1) {
        long[] var2 = new long[arg1];
        if (arg1 < arg0.length) {
            System.arraycopy(arg0, 0, var2, 0, arg1);
        } else {
            System.arraycopy(arg0, 0, var2, 0, arg0.length);
        }
        return var2;
    }

    public static BigInteger[] copyOf(BigInteger[] arg0, int arg1) {
        BigInteger[] var2 = new BigInteger[arg1];
        if (arg1 < arg0.length) {
            System.arraycopy(arg0, 0, var2, 0, arg1);
        } else {
            System.arraycopy(arg0, 0, var2, 0, arg0.length);
        }
        return var2;
    }

    public static byte[] copyOfRange(byte[] arg0, int arg1, int arg2) {
        int var3 = getLength(arg1, arg2);
        byte[] var4 = new byte[var3];
        if (arg0.length - arg1 < var3) {
            System.arraycopy(arg0, arg1, var4, 0, arg0.length - arg1);
        } else {
            System.arraycopy(arg0, arg1, var4, 0, var3);
        }
        return var4;
    }

    public static int[] copyOfRange(int[] arg0, int arg1, int arg2) {
        int var3 = getLength(arg1, arg2);
        int[] var4 = new int[var3];
        if (arg0.length - arg1 < var3) {
            System.arraycopy(arg0, arg1, var4, 0, arg0.length - arg1);
        } else {
            System.arraycopy(arg0, arg1, var4, 0, var3);
        }
        return var4;
    }

    public static boolean areEqual(short[] arg0, short[] arg1) {
        if (arg0 == arg1) {
            return true;
        } else if (arg0 == null || arg1 == null) {
            return false;
        } else if (arg0.length == arg1.length) {
            for (int var2 = 0; var2 != arg0.length; var2++) {
                if (arg0[var2] != arg1[var2]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public static byte[][][] clone(byte[][][] arg0) {
        if (arg0 == null) {
            return (byte[][][]) null;
        }
        byte[][][] var1 = new byte[arg0.length][][];
        for (int var2 = 0; var2 != var1.length; var2++) {
            var1[var2] = clone(arg0[var2]);
        }
        return var1;
    }

    public static int getLength(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < 0) {
            StringBuffer var3 = new StringBuffer(arg0);
            var3.append(" > ").append(arg1);
            throw new IllegalArgumentException(var3.toString());
        } else {
            return var2;
        }
    }

    public static byte[] append(byte[] arg0, byte arg1) {
        if (arg0 == null) {
            return new byte[] { arg1 };
        }
        int var2 = arg0.length;
        byte[] var3 = new byte[var2 + 1];
        System.arraycopy(arg0, 0, var3, 0, var2);
        var3[var2] = arg1;
        return var3;
    }

    public static short[] append(short[] arg0, short arg1) {
        if (arg0 == null) {
            return new short[] { arg1 };
        }
        int var2 = arg0.length;
        short[] var3 = new short[var2 + 1];
        System.arraycopy(arg0, 0, var3, 0, var2);
        var3[var2] = arg1;
        return var3;
    }

    public static int hashCode(Object[] arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var1 = arg0.length;
        int var2 = var1 + 1;
        while (true) {
            var1--;
            if (var1 < 0) {
                return var2;
            }
            int var3 = var2 * 257;
            var2 = var3 ^ arg0[var1].hashCode();
        }
    }

    public static byte[] concatenate(byte[] arg0, byte[] arg1) {
        if (arg0 == null || arg1 == null) {
            return arg1 == null ? clone(arg0) : clone(arg1);
        } else {
            byte[] var2 = new byte[arg0.length + arg1.length];
            System.arraycopy(arg0, 0, var2, 0, arg0.length);
            System.arraycopy(arg1, 0, var2, arg0.length, arg1.length);
            return var2;
        }
    }

    public static byte[] concatenate(byte[] arg0, byte[] arg1, byte[] arg2) {
        if (arg0 != null && arg1 != null && arg2 != null) {
            byte[] var3 = new byte[arg0.length + arg1.length + arg2.length];
            System.arraycopy(arg0, 0, var3, 0, arg0.length);
            System.arraycopy(arg1, 0, var3, arg0.length, arg1.length);
            System.arraycopy(arg2, 0, var3, arg0.length + arg1.length, arg2.length);
            return var3;
        } else if (arg0 == null) {
            return concatenate(arg1, arg2);
        } else if (arg1 == null) {
            return concatenate(arg0, arg2);
        } else {
            return concatenate(arg0, arg1);
        }
    }

    public static char[] copyOf(char[] arg0, int arg1) {
        char[] var2 = new char[arg1];
        if (arg1 < arg0.length) {
            System.arraycopy(arg0, 0, var2, 0, arg1);
        } else {
            System.arraycopy(arg0, 0, var2, 0, arg0.length);
        }
        return var2;
    }

    public static boolean areEqual(long[] arg0, long[] arg1) {
        if (arg0 == arg1) {
            return true;
        } else if (arg0 == null || arg1 == null) {
            return false;
        } else if (arg0.length == arg1.length) {
            for (int var2 = 0; var2 != arg0.length; var2++) {
                if (arg0[var2] != arg1[var2]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public static byte[] prepend(byte[] arg0, byte arg1) {
        if (arg0 == null) {
            return new byte[] { arg1 };
        }
        int var2 = arg0.length;
        byte[] var3 = new byte[var2 + 1];
        System.arraycopy(arg0, 0, var3, 1, var2);
        var3[0] = arg1;
        return var3;
    }

    public static boolean areEqual(char[] arg0, char[] arg1) {
        if (arg0 == arg1) {
            return true;
        } else if (arg0 == null || arg1 == null) {
            return false;
        } else if (arg0.length == arg1.length) {
            for (int var2 = 0; var2 != arg0.length; var2++) {
                if (arg0[var2] != arg1[var2]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public static int hashCode(byte[] arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var1 = arg0.length;
        int var2 = var1 + 1;
        while (true) {
            var1--;
            if (var1 < 0) {
                return var2;
            }
            int var3 = var2 * 257;
            var2 = var3 ^ arg0[var1];
        }
    }

    public static byte[] reverse(byte[] arg0) {
        if (arg0 == null) {
            return null;
        }
        int var1 = 0;
        int var2 = arg0.length;
        byte[] var3 = new byte[var2];
        while (true) {
            var2--;
            if (var2 < 0) {
                return var3;
            }
            var3[var2] = arg0[var1++];
        }
    }

    public static int[] reverse(int[] arg0) {
        if (arg0 == null) {
            return null;
        }
        int var1 = 0;
        int var2 = arg0.length;
        int[] var3 = new int[var2];
        while (true) {
            var2--;
            if (var2 < 0) {
                return var3;
            }
            var3[var2] = arg0[var1++];
        }
    }

    public static class Iterator implements java.util.Iterator {

        public int position = 0;

        public final Object[] dataArray;

        public boolean t() {
            return this.position < this.dataArray.length;
        }

        public boolean hasNext() {
            return this.position < this.dataArray.length;
        }

        public void n() {
            throw new UnsupportedOperationException("Cannot remove element from an Array.");
        }

        public void remove() {
            throw new UnsupportedOperationException("Cannot remove element from an Array.");
        }

        public Object p() {
            if (this.dataArray.length == this.position) {
                throw new NoSuchElementException("Out of elements: " + this.position);
            }
            return this.dataArray[this.position++];
        }

        public Iterator(Object[] arg0) {
            this.dataArray = arg0;
        }

        public Object s() {
            if (this.dataArray.length == this.position) {
                throw new NoSuchElementException("Out of elements: " + this.position);
            }
            return this.dataArray[this.position++];
        }

        public boolean v() {
            return this.position < this.dataArray.length;
        }

        public boolean y() {
            return this.position < this.dataArray.length;
        }

        public boolean c() {
            return this.position < this.dataArray.length;
        }

        public boolean w() {
            return this.position < this.dataArray.length;
        }

        public void g() {
            throw new UnsupportedOperationException("Cannot remove element from an Array.");
        }

        public Object r() {
            if (this.dataArray.length == this.position) {
                throw new NoSuchElementException("Out of elements: " + this.position);
            }
            return this.dataArray[this.position++];
        }

        public boolean b() {
            return this.position < this.dataArray.length;
        }

        public void x() {
            throw new UnsupportedOperationException("Cannot remove element from an Array.");
        }

        public Object next() {
            if (this.dataArray.length == this.position) {
                throw new NoSuchElementException("Out of elements: " + this.position);
            }
            return this.dataArray[this.position++];
        }

        public void e() {
            throw new UnsupportedOperationException("Cannot remove element from an Array.");
        }
    }
}

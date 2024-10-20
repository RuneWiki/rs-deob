package deob;

@ObfuscatedName("gx")
public class class207 {

    @ObfuscatedName("gx.f")
    public static boolean field2493 = false;

    @ObfuscatedName("gx.e")
    public static int field2494 = 0;

    @ObfuscatedName("gx.v")
    public static int field2498 = 0;

    @ObfuscatedName("gx.y")
    public static boolean field2492 = false;

    @ObfuscatedName("gx.k")
    public static int field2501 = 0;

    @ObfuscatedName("gx.g")
    public static long[] field2490 = new long[1000];

    public class207() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ej.f(J)Z")
    public static boolean method2357(long arg0) {
        int var2 = (int) (arg0 >>> 14 & 0x3L);
        return var2 == 2;
    }

    @ObfuscatedName("dc.e(II)J")
    public static long method2238(int arg0) {
        return field2490[arg0];
    }

    @ObfuscatedName("gj.v(J)I")
    public static int method3812(long arg0) {
        return (int) (arg0 >>> 7 & 0x7FL);
    }

    @ObfuscatedName("w.y(J)Z")
    public static boolean method193(long arg0) {
        return (int) (arg0 >>> 16 & 0x1L) == 1;
    }

    @ObfuscatedName("bl.j(J)I")
    public static int method1030(long arg0) {
        return (int) (arg0 >>> 17 & 0xFFFFFFFFL);
    }

    @ObfuscatedName("de.o(IIIZIB)J")
    public static long method2277(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        long var5 = (long) ((arg0 & 0x7F) << 0 | (arg1 & 0x7F) << 7 | (arg2 & 0x3) << 14) | ((long) arg4 & 0xFFFFFFFFL) << 17;
        if (arg3) {
            var5 |= 0x10000L;
        }
        return var5;
    }

    @ObfuscatedName("a.m(IIB)V")
    public static final void method198(int arg0, int arg1) {
        field2494 = arg0;
        field2498 = arg1;
        field2493 = true;
        field2501 = 0;
        field2492 = false;
    }

    @ObfuscatedName("h.r(B)Z")
    public static final boolean method63() {
        return field2493;
    }

    @ObfuscatedName("eo.h(B)I")
    public static final int method2611() {
        return field2494;
    }

    @ObfuscatedName("fs.d(I)I")
    public static final int method3016() {
        return field2498;
    }

    @ObfuscatedName("mb.z(IIIIIIII)Z")
    public static final boolean method5648(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = field2498 + arg6;
        if (var7 < arg0 && var7 < arg1 && var7 < arg2) {
            return false;
        }
        int var8 = field2498 - arg6;
        if (var8 > arg0 && var8 > arg1 && var8 > arg2) {
            return false;
        }
        int var9 = field2494 + arg6;
        if (var9 < arg3 && var9 < arg4 && var9 < arg5) {
            return false;
        } else {
            int var10 = field2494 - arg6;
            return var10 <= arg3 || var10 <= arg4 || var10 <= arg5;
        }
    }
}

package deob;

@ObfuscatedName("gv")
public class class205 {

    @ObfuscatedName("gv.c")
    public static boolean field2524 = false;

    @ObfuscatedName("gv.l")
    public static int field2521 = 0;

    @ObfuscatedName("gv.s")
    public static int field2515 = 0;

    @ObfuscatedName("gv.e")
    public static boolean field2516 = false;

    @ObfuscatedName("gv.q")
    public static int field2520 = 0;

    @ObfuscatedName("gv.x")
    public static long[] field2513 = new long[1000];

    public class205() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hy.c(B)I")
    public static int method4304() {
        return field2520;
    }

    @ObfuscatedName("ns.s(II)J")
    public static long method6152(int arg0) {
        return field2513[arg0];
    }

    @ObfuscatedName("gd.e(IB)I")
    public static int method3366(int arg0) {
        return method351(field2513[arg0]);
    }

    @ObfuscatedName("k.r(J)I")
    public static int method351(long arg0) {
        return (int) (arg0 >>> 7 & 0x7FL);
    }

    @ObfuscatedName("cs.o(II)I")
    public static int method2115(int arg0) {
        return method3358(field2513[arg0]);
    }

    @ObfuscatedName("gx.i(J)I")
    public static int method3358(long arg0) {
        return (int) (arg0 >>> 14 & 0x3L);
    }

    @ObfuscatedName("gs.w(J)I")
    public static int method3561(long arg0) {
        return (int) (arg0 >>> 17 & 0xFFFFFFFFL);
    }

    @ObfuscatedName("cg.v(IIIZII)J")
    public static long method1993(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        long var5 = (long) ((arg0 & 0x7F) << 0 | (arg1 & 0x7F) << 7 | (arg2 & 0x3) << 14) | ((long) arg4 & 0xFFFFFFFFL) << 17;
        if (arg3) {
            var5 |= 0x10000L;
        }
        return var5;
    }

    @ObfuscatedName("d.a(I)V")
    public static final void method256() {
        field2524 = false;
        field2520 = 0;
    }

    @ObfuscatedName("ej.y(I)Z")
    public static final boolean method2694() {
        return field2524;
    }

    @ObfuscatedName("gk.u(I)I")
    public static final int method3767() {
        return field2521;
    }

    @ObfuscatedName("bf.h(IIIIIIII)Z")
    public static final boolean method1803(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = field2515 + arg6;
        if (var7 < arg0 && var7 < arg1 && var7 < arg2) {
            return false;
        }
        int var8 = field2515 - arg6;
        if (var8 > arg0 && var8 > arg1 && var8 > arg2) {
            return false;
        }
        int var9 = field2521 + arg6;
        if (var9 < arg3 && var9 < arg4 && var9 < arg5) {
            return false;
        } else {
            int var10 = field2521 - arg6;
            return var10 <= arg3 || var10 <= arg4 || var10 <= arg5;
        }
    }
}

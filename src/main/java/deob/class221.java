package deob;

@ObfuscatedName("hk")
public class class221 {

    @ObfuscatedName("hk.i")
    public static boolean field2584 = false;

    @ObfuscatedName("hk.w")
    public static int field2590 = 0;

    @ObfuscatedName("hk.s")
    public static int field2581 = 0;

    @ObfuscatedName("hk.a")
    public static boolean field2582 = false;

    @ObfuscatedName("hk.t")
    public static int field2587 = 0;

    @ObfuscatedName("hk.l")
    public static long[] field2588 = new long[1000];

    public class221() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gy.i(J)Z")
    public static boolean method3654(long arg0) {
        boolean var2 = arg0 != 0L;
        if (var2) {
            boolean var3 = (int) (arg0 >>> 16 & 0x1L) == 1;
            var2 = !var3;
        }
        return var2;
    }

    @ObfuscatedName("cx.w(II)J")
    public static long method2048(int arg0) {
        return field2588[arg0];
    }

    @ObfuscatedName("bx.s(II)I")
    public static int method1036(int arg0) {
        return method2556(field2588[arg0]);
    }

    @ObfuscatedName("ep.a(J)I")
    public static int method2556(long arg0) {
        return (int) (arg0 >>> 0 & 0x7FL);
    }

    @ObfuscatedName("hr.o(II)I")
    public static int method4061(int arg0) {
        long var1 = field2588[arg0];
        return (int) (var1 >>> 7 & 0x7FL);
    }

    @ObfuscatedName("ar.g(II)I")
    public static int method760(int arg0) {
        return method300(field2588[arg0]);
    }

    @ObfuscatedName("m.e(J)I")
    public static int method300(long arg0) {
        return (int) (arg0 >>> 17 & 0xFFFFFFFFL);
    }

    @ObfuscatedName("oj.p(IIIZIB)J")
    public static long method6189(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        long var5 = (long) ((arg0 & 0x7F) << 0 | (arg1 & 0x7F) << 7 | (arg2 & 0x3) << 14) | ((long) arg4 & 0xFFFFFFFFL) << 17;
        if (arg3) {
            var5 |= 0x10000L;
        }
        return var5;
    }

    @ObfuscatedName("fz.b(S)Z")
    public static final boolean method3211() {
        return field2584;
    }

    @ObfuscatedName("fn.x(I)I")
    public static final int method2911() {
        return field2581;
    }
}

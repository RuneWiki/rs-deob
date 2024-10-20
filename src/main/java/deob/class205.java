package deob;

@ObfuscatedName("gz")
public class class205 {

    @ObfuscatedName("gz.c")
    public static boolean field2499 = false;

    @ObfuscatedName("gz.b")
    public static int field2500 = 0;

    @ObfuscatedName("gz.p")
    public static int field2501 = 0;

    @ObfuscatedName("gz.m")
    public static boolean field2502 = false;

    @ObfuscatedName("gz.h")
    public static int field2507 = 0;

    @ObfuscatedName("gz.g")
    public static long[] field2505 = new long[1000];

    public class205() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("df.c(I)I")
    public static int method2493() {
        return field2507;
    }

    @ObfuscatedName("bf.b(J)Z")
    public static boolean method2026(long arg0) {
        int var2 = (int) (arg0 >>> 14 & 0x3L);
        return var2 == 2;
    }

    @ObfuscatedName("dx.p(J)Z")
    public static boolean method2538(long arg0) {
        return arg0 != 0L && !method180(arg0);
    }

    @ObfuscatedName("bb.m(IB)J")
    public static long method1873(int arg0) {
        return field2505[arg0];
    }

    @ObfuscatedName("fw.t(II)I")
    public static int method3309(int arg0) {
        return method2062(field2505[arg0]);
    }

    @ObfuscatedName("cd.s(J)I")
    public static int method2062(long arg0) {
        return (int) (arg0 >>> 0 & 0x7FL);
    }

    @ObfuscatedName("dh.j(II)I")
    public static int method2501(int arg0) {
        long var1 = field2505[arg0];
        return (int) (var1 >>> 14 & 0x3L);
    }

    @ObfuscatedName("d.w(J)Z")
    public static boolean method180(long arg0) {
        return (int) (arg0 >>> 16 & 0x1L) == 1;
    }

    @ObfuscatedName("ch.n(J)I")
    public static int method2352(long arg0) {
        return (int) (arg0 >>> 17 & 0xFFFFFFFFL);
    }

    @ObfuscatedName("bh.r(IIIZII)J")
    public static long method1932(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        long var5 = (long) ((arg0 & 0x7F) << 0 | (arg1 & 0x7F) << 7 | (arg2 & 0x3) << 14) | ((long) arg4 & 0xFFFFFFFFL) << 17;
        if (arg3) {
            var5 |= 0x10000L;
        }
        return var5;
    }

    @ObfuscatedName("ev.o(I)V")
    public static final void method2629() {
        field2499 = false;
        field2507 = 0;
    }

    @ObfuscatedName("em.v(I)Z")
    public static final boolean method2709() {
        return field2499;
    }

    @ObfuscatedName("cb.d(I)I")
    public static final int method2219() {
        return field2500;
    }
}

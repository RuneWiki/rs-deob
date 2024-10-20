package deob;

@ObfuscatedName("ee")
public class class138 {

    @ObfuscatedName("ee.h")
    public static boolean field1757 = false;

    @ObfuscatedName("ee.v")
    public static int field1765 = 0;

    @ObfuscatedName("ee.x")
    public static int field1756 = 0;

    @ObfuscatedName("ee.w")
    public static boolean field1758 = false;

    @ObfuscatedName("ee.c")
    public static int field1764 = 0;

    @ObfuscatedName("ee.i")
    public static long[] field1769 = new long[1000];

    public class138() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gv.h(J)Z")
    public static boolean method3384(long arg0) {
        return method3727(arg0) == 2;
    }

    @ObfuscatedName("cm.v(J)Z")
    public static boolean method1795(long arg0) {
        return arg0 != 0L && !method571(arg0);
    }

    @ObfuscatedName("ca.x(IB)I")
    public static int method1756(int arg0) {
        return method3373(field1769[arg0]);
    }

    @ObfuscatedName("gb.w(J)I")
    public static int method3373(long arg0) {
        return (int) (arg0 >>> 0 & 0x7FL);
    }

    @ObfuscatedName("bi.t(IB)I")
    public static int method1049(int arg0) {
        long var1 = field1769[arg0];
        return (int) (var1 >>> 7 & 0x7FL);
    }

    @ObfuscatedName("he.j(J)I")
    public static int method3727(long arg0) {
        return (int) (arg0 >>> 14 & 0x3L);
    }

    @ObfuscatedName("ap.n(J)Z")
    public static boolean method571(long arg0) {
        return (int) (arg0 >>> 16 & 0x1L) == 1;
    }

    @ObfuscatedName("ed.p(J)I")
    public static int method3119(long arg0) {
        return (int) (arg0 >>> 17 & 0xFFFFFFFFL);
    }

    @ObfuscatedName("cf.l(IIIZIB)J")
    public static long method1957(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        long var5 = (long) ((arg0 & 0x7F) << 0 | (arg1 & 0x7F) << 7 | (arg2 & 0x3) << 14) | ((long) arg4 & 0xFFFFFFFFL) << 17;
        if (arg3) {
            var5 |= 0x10000L;
        }
        return var5;
    }

    @ObfuscatedName("w.z(III)V")
    public static final void method32(int arg0, int arg1) {
        field1765 = arg0;
        field1756 = arg1;
        field1757 = true;
        field1764 = 0;
        field1758 = false;
    }

    @ObfuscatedName("kr.u(I)Z")
    public static final boolean method4936() {
        return field1757;
    }

    @ObfuscatedName("cz.e(I)I")
    public static final int method1845() {
        return field1765;
    }
}

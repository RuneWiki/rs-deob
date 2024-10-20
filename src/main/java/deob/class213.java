package deob;

@ObfuscatedName("hi")
public class class213 {

    @ObfuscatedName("hi.o")
    public static boolean field2630 = false;

    @ObfuscatedName("hi.q")
    public static int field2633 = 0;

    @ObfuscatedName("hi.l")
    public static int field2628 = 0;

    @ObfuscatedName("hi.k")
    public static boolean field2629 = false;

    @ObfuscatedName("hi.b")
    public static int field2632 = 0;

    @ObfuscatedName("hi.t")
    public static long[] field2626 = new long[1000];

    public class213() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("de.o(I)I")
    public static int method2498() {
        return field2632;
    }

    @ObfuscatedName("fe.q(J)Z")
    public static boolean method3034(long arg0) {
        return method5896(arg0) == 2;
    }

    @ObfuscatedName("jn.l(J)Z")
    public static boolean method4600(long arg0) {
        return arg0 != 0L && !method2647(arg0);
    }

    @ObfuscatedName("ej.k(IS)J")
    public static long method2660(int arg0) {
        return field2626[arg0];
    }

    @ObfuscatedName("n.a(J)I")
    public static int method229(long arg0) {
        return (int) (arg0 >>> 0 & 0x7FL);
    }

    @ObfuscatedName("em.m(IB)I")
    public static int method2649(int arg0) {
        return Statics.method1980(field2626[arg0]);
    }

    @ObfuscatedName("la.s(II)I")
    public static int method5308(int arg0) {
        return method5896(field2626[arg0]);
    }

    @ObfuscatedName("mb.r(J)I")
    public static int method5896(long arg0) {
        return (int) (arg0 >>> 14 & 0x3L);
    }

    @ObfuscatedName("du.v(J)Z")
    public static boolean method2647(long arg0) {
        return (int) (arg0 >>> 16 & 0x1L) == 1;
    }

    @ObfuscatedName("fh.y(J)I")
    public static int method2942(long arg0) {
        return (int) (arg0 >>> 17 & 0xFFFFFFFFL);
    }

    @ObfuscatedName("ge.c(IIIZIB)J")
    public static long method3193(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        long var5 = (long) ((arg0 & 0x7F) << 0 | (arg1 & 0x7F) << 7 | (arg2 & 0x3) << 14) | ((long) arg4 & 0xFFFFFFFFL) << 17;
        if (arg3) {
            var5 |= 0x10000L;
        }
        return var5;
    }

    @ObfuscatedName("er.w(III)V")
    public static final void method2675(int arg0, int arg1) {
        field2633 = arg0;
        field2628 = arg1;
        field2630 = true;
        field2632 = 0;
        field2629 = false;
    }

    @ObfuscatedName("es.b(I)I")
    public static final int method2759() {
        return field2633;
    }

    @ObfuscatedName("hf.t(I)I")
    public static final int method4068() {
        return field2628;
    }
}

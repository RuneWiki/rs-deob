package deob;

@ObfuscatedName("he")
public class class212 {

    @ObfuscatedName("he.c")
    public static boolean field2594 = false;

    @ObfuscatedName("he.v")
    public static int field2586 = 0;

    @ObfuscatedName("he.q")
    public static int field2587 = 0;

    @ObfuscatedName("he.f")
    public static boolean field2588 = false;

    @ObfuscatedName("he.r")
    public static int field2592 = 0;

    @ObfuscatedName("he.u")
    public static long[] field2585 = new long[1000];

    public class212() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gh.c(B)I")
    public static int method4015() {
        return field2592;
    }

    @ObfuscatedName("ew.v(J)Z")
    public static boolean method2697(long arg0) {
        return method49(arg0) == 2;
    }

    @ObfuscatedName("d.q(J)Z")
    public static boolean method317(long arg0) {
        boolean var2 = arg0 != 0L;
        if (var2) {
            boolean var3 = (int) (arg0 >>> 16 & 0x1L) == 1;
            var2 = !var3;
        }
        return var2;
    }

    @ObfuscatedName("cq.f(II)I")
    public static int method2000(int arg0) {
        long var1 = field2585[arg0];
        return (int) (var1 >>> 7 & 0x7FL);
    }

    @ObfuscatedName("cy.j(II)I")
    public static int method2293(int arg0) {
        return method49(field2585[arg0]);
    }

    @ObfuscatedName("w.e(J)I")
    public static int method49(long arg0) {
        return (int) (arg0 >>> 14 & 0x3L);
    }

    @ObfuscatedName("fz.g(II)I")
    public static int method2965(int arg0) {
        return method937(field2585[arg0]);
    }

    @ObfuscatedName("be.w(J)I")
    public static int method937(long arg0) {
        return (int) (arg0 >>> 17 & 0xFFFFFFFFL);
    }

    @ObfuscatedName("fr.y(IIIZII)J")
    public static long method2959(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        long var5 = (long) ((arg0 & 0x7F) << 0 | (arg1 & 0x7F) << 7 | (arg2 & 0x3) << 14) | ((long) arg4 & 0xFFFFFFFFL) << 17;
        if (arg3) {
            var5 |= 0x10000L;
        }
        return var5;
    }

    @ObfuscatedName("iw.i(J)V")
    public static final void method4656(long arg0) {
        field2585[++field2592 - 1] = arg0;
    }

    @ObfuscatedName("fu.s(B)Z")
    public static final boolean method3139() {
        return field2594;
    }

    @ObfuscatedName("dw.t(I)I")
    public static final int method2624() {
        return field2586;
    }

    @ObfuscatedName("cl.z(IIIIIIII)Z")
    public static final boolean method2424(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = field2587 + arg6;
        if (var7 < arg0 && var7 < arg1 && var7 < arg2) {
            return false;
        }
        int var8 = field2587 - arg6;
        if (var8 > arg0 && var8 > arg1 && var8 > arg2) {
            return false;
        }
        int var9 = field2586 + arg6;
        if (var9 < arg3 && var9 < arg4 && var9 < arg5) {
            return false;
        } else {
            int var10 = field2586 - arg6;
            return var10 <= arg3 || var10 <= arg4 || var10 <= arg5;
        }
    }
}

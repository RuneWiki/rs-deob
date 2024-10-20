package deob;

@ObfuscatedName("hg")
public class class225 {

    @ObfuscatedName("hg.h")
    public static boolean field2745 = false;

    @ObfuscatedName("hg.e")
    public static int field2744 = 0;

    @ObfuscatedName("hg.v")
    public static int field2753 = 0;

    @ObfuscatedName("hg.x")
    public static boolean field2746 = false;

    @ObfuscatedName("hg.o")
    public static int field2754 = 0;

    @ObfuscatedName("hg.n")
    public static long[] field2751 = new long[1000];

    public class225() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cn.h(II)I")
    public static int method2211(int arg0) {
        return method2893(field2751[arg0]);
    }

    @ObfuscatedName("ee.e(J)I")
    public static int method2893(long arg0) {
        return (int) (arg0 >>> 0 & 0x7FL);
    }

    @ObfuscatedName("ir.v(IB)I")
    public static int method4792(int arg0) {
        return method5222(field2751[arg0]);
    }

    @ObfuscatedName("ks.x(J)I")
    public static int method5222(long arg0) {
        return (int) (arg0 >>> 14 & 0x3L);
    }

    @ObfuscatedName("jb.m(J)Z")
    public static boolean method4928(long arg0) {
        return (int) (arg0 >>> 16 & 0x1L) == 1;
    }

    @ObfuscatedName("hv.f(J)I")
    public static int method4236(long arg0) {
        return (int) (arg0 >>> 17 & 0xFFFFFFFFL);
    }

    @ObfuscatedName("an.r(IIIZIB)J")
    public static long method574(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        long var5 = (long) ((arg0 & 0x7F) << 0 | (arg1 & 0x7F) << 7 | (arg2 & 0x3) << 14) | ((long) arg4 & 0xFFFFFFFFL) << 17;
        if (arg3) {
            var5 |= 0x10000L;
        }
        return var5;
    }

    @ObfuscatedName("s.u(S)V")
    public static final void method243() {
        field2745 = false;
        field2754 = 0;
    }

    @ObfuscatedName("mn.b(J)V")
    public static final void method5981(long arg0) {
        field2751[++field2754 - 1] = arg0;
    }

    @ObfuscatedName("fm.j(I)Z")
    public static final boolean method3223() {
        return field2745;
    }

    @ObfuscatedName("ea.g(IIIIIIII)Z")
    public static final boolean method2904(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = field2753 + arg6;
        if (var7 < arg0 && var7 < arg1 && var7 < arg2) {
            return false;
        }
        int var8 = field2753 - arg6;
        if (var8 > arg0 && var8 > arg1 && var8 > arg2) {
            return false;
        }
        int var9 = field2744 + arg6;
        if (var9 < arg3 && var9 < arg4 && var9 < arg5) {
            return false;
        } else {
            int var10 = field2744 - arg6;
            return var10 <= arg3 || var10 <= arg4 || var10 <= arg5;
        }
    }
}

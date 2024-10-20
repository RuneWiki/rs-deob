package deob;

@ObfuscatedName("jc")
public class class241 {

    @ObfuscatedName("jc.au")
    public static boolean field2785 = false;

    @ObfuscatedName("jc.ae")
    public static int field2781 = 0;

    @ObfuscatedName("jc.ao")
    public static int field2784 = 0;

    @ObfuscatedName("jc.at")
    public static boolean field2783 = false;

    @ObfuscatedName("jc.an")
    public static int field2789 = 0;

    @ObfuscatedName("jc.ar")
    public static long[] field2796 = new long[1000];

    public class241() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ko.au(IB)J")
    public static long method5009(int arg0) {
        return field2796[arg0];
    }

    @ObfuscatedName("cb.ae(IB)I")
    public static int method1984(int arg0) {
        long var1 = field2796[arg0];
        return (int) (var1 >>> 0 & 0x7FL);
    }

    @ObfuscatedName("bb.ao(IB)I")
    public static int method830(int arg0) {
        long var1 = field2796[arg0];
        return (int) (var1 >>> 7 & 0x7FL);
    }

    @ObfuscatedName("gq.at(J)I")
    public static int method3250(long arg0) {
        return (int) (arg0 >>> 14 & 0x3L);
    }

    @ObfuscatedName("hh.ac(J)I")
    public static int method3275(long arg0) {
        return (int) (arg0 >>> 17 & 0xFFFFFFFFL);
    }

    @ObfuscatedName("sp.ai(IIIZIB)J")
    public static long method7981(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        long var5 = (long) ((arg0 & 0x7F) << 0 | (arg1 & 0x7F) << 7 | (arg2 & 0x3) << 14) | ((long) arg4 & 0xFFFFFFFFL) << 17;
        if (arg3) {
            var5 |= 0x10000L;
        }
        return var5;
    }

    @ObfuscatedName("cz.az(III)V")
    public static final void method1998(int arg0, int arg1) {
        field2781 = arg0;
        field2784 = arg1;
        field2785 = true;
        field2789 = 0;
        field2783 = false;
    }

    @ObfuscatedName("ee.ap(I)V")
    public static final void method2584() {
        field2785 = false;
        field2789 = 0;
    }

    @ObfuscatedName("cx.aa(B)Z")
    public static final boolean method1075() {
        return field2785;
    }

    @ObfuscatedName("aq.af(S)V")
    public static final void method90() {
        if (field2783) {
            return;
        }
        int var0 = Statics.field2589;
        int var1 = Statics.field2590;
        int var2 = Statics.field2629;
        int var3 = Statics.field2592;
        byte var4 = 50;
        short var5 = 3500;
        int var6 = (field2781 - class227.method4056()) * var4 / class227.method4062();
        int var7 = (field2784 - class227.method4057()) * var4 / class227.method4062();
        int var8 = (field2781 - class227.method4056()) * var5 / class227.method4062();
        int var9 = (field2784 - class227.method4057()) * var5 / class227.method4062();
        int var10 = class239.method486(var7, var4, var1, var0);
        int var11 = var1 * var4 - var0 * var7 >> 16;
        int var14 = class239.method486(var9, var5, var1, var0);
        int var15 = var1 * var5 - var0 * var9 >> 16;
        int var18 = class239.method2150(var6, var11, var3, var2);
        int var19 = class239.method2961(var6, var11, var3, var2);
        int var21 = class239.method2150(var8, var15, var3, var2);
        int var22 = class239.method2961(var8, var15, var3, var2);
        Statics.field2780 = (var18 + var21) / 2;
        Statics.field2794 = (var10 + var14) / 2;
        Statics.field2786 = (var19 + var22) / 2;
        Statics.field2968 = (var21 - var18) / 2;
        Statics.field2782 = (var14 - var10) / 2;
        Statics.field2643 = (var22 - var19) / 2;
        Statics.field2788 = Math.abs(Statics.field2968);
        Statics.field26 = Math.abs(Statics.field2782);
        Statics.field168 = Math.abs(Statics.field2643);
    }
}

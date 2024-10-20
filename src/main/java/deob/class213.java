package deob;

@ObfuscatedName("hn")
public class class213 {

    @ObfuscatedName("hn.c")
    public static boolean field2623 = false;

    @ObfuscatedName("hn.p")
    public static int field2625 = 0;

    @ObfuscatedName("hn.f")
    public static int field2622 = 0;

    @ObfuscatedName("hn.n")
    public static boolean field2629 = false;

    @ObfuscatedName("hn.t")
    public static int field2627 = 0;

    @ObfuscatedName("hn.u")
    public static long[] field2628 = new long[1000];

    public class213() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dn.c(J)Z")
    public static boolean method2794(long arg0) {
        return method265(arg0) == 2;
    }

    @ObfuscatedName("ej.p(II)I")
    public static int method2948(int arg0) {
        long var1 = field2628[arg0];
        return (int) (var1 >>> 0 & 0x7FL);
    }

    @ObfuscatedName("fj.f(J)I")
    public static int method3137(long arg0) {
        return (int) (arg0 >>> 7 & 0x7FL);
    }

    @ObfuscatedName("a.n(J)I")
    public static int method265(long arg0) {
        return (int) (arg0 >>> 14 & 0x3L);
    }

    @ObfuscatedName("fe.k(II)I")
    public static int method3266(int arg0) {
        return method3085(field2628[arg0]);
    }

    @ObfuscatedName("fc.w(J)I")
    public static int method3085(long arg0) {
        return (int) (arg0 >>> 17 & 0xFFFFFFFFL);
    }

    @ObfuscatedName("id.s(IIIZII)J")
    public static long method4796(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        long var5 = (long) ((arg0 & 0x7F) << 0 | (arg1 & 0x7F) << 7 | (arg2 & 0x3) << 14) | ((long) arg4 & 0xFFFFFFFFL) << 17;
        if (arg3) {
            var5 |= 0x10000L;
        }
        return var5;
    }

    @ObfuscatedName("o.q(IIB)V")
    public static final void method373(int arg0, int arg1) {
        field2625 = arg0;
        field2622 = arg1;
        field2623 = true;
        field2627 = 0;
        field2629 = false;
    }

    @ObfuscatedName("fa.x(I)V")
    public static final void method3228() {
        if (field2629) {
            return;
        }
        int var0 = Statics.field2437;
        int var1 = Statics.field2447;
        int var2 = Statics.field2428;
        int var3 = Statics.field2456;
        byte var4 = 50;
        short var5 = 3500;
        int var6 = (field2625 - Statics.field2383) * var4 / class202.field2382;
        int var7 = (field2622 - Statics.field2384) * var4 / class202.field2382;
        int var8 = (field2625 - Statics.field2383) * var5 / class202.field2382;
        int var9 = (field2622 - Statics.field2384) * var5 / class202.field2382;
        int var10 = class202.method3848(var7, var4, var1, var0);
        int var11 = class202.method3785(var7, var4, var1, var0);
        int var13 = class202.method3848(var9, var5, var1, var0);
        int var14 = class202.method3785(var9, var5, var1, var0);
        int var16 = class202.method3782(var6, var11, var3, var2);
        int var17 = class202.method3778(var6, var11, var3, var2);
        int var19 = class202.method3782(var8, var14, var3, var2);
        int var20 = class202.method3778(var8, var14, var3, var2);
        Statics.field2620 = (var16 + var19) / 2;
        Statics.field488 = (var10 + var13) / 2;
        Statics.field2871 = (var17 + var20) / 2;
        Statics.field1726 = (var19 - var16) / 2;
        Statics.field2631 = (var13 - var10) / 2;
        Statics.field1397 = (var20 - var17) / 2;
        Statics.field2626 = Math.abs(Statics.field1726);
        Statics.field1690 = Math.abs(Statics.field2631);
        Statics.field4129 = Math.abs(Statics.field1397);
    }

    @ObfuscatedName("fg.j(Lha;IIIB)Z")
    public static final boolean method3115(class212 arg0, int arg1, int arg2, int arg3) {
        boolean var4 = field2623;
        if (!var4) {
            return false;
        }
        method3228();
        int var5 = arg0.field2608 + arg1;
        int var6 = arg0.field2578 + arg2;
        int var7 = arg0.field2579 + arg3;
        int var8 = arg0.field2540;
        int var9 = arg0.field2581;
        int var10 = arg0.field2582;
        int var11 = Statics.field2620 - var5;
        int var12 = Statics.field488 - var6;
        int var13 = Statics.field2871 - var7;
        if (Math.abs(var11) > Statics.field2626 + var8) {
            return false;
        } else if (Math.abs(var12) > Statics.field1690 + var9) {
            return false;
        } else if (Math.abs(var13) > Statics.field4129 + var10) {
            return false;
        } else if (Math.abs(Statics.field2631 * var13 - Statics.field1397 * var12) > Statics.field4129 * var9 + Statics.field1690 * var10) {
            return false;
        } else if (Math.abs(Statics.field1397 * var11 - Statics.field1726 * var13) > Statics.field4129 * var8 + Statics.field2626 * var10) {
            return false;
        } else {
            return Math.abs(Statics.field1726 * var12 - Statics.field2631 * var11) <= Statics.field2626 * var9 + Statics.field1690 * var8;
        }
    }
}

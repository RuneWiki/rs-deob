package deob;

@ObfuscatedName("ah")
public final class class32 extends class128 {

    @ObfuscatedName("ah.x")
    public int field731;

    @ObfuscatedName("ah.j")
    public static class129 field742 = new class129();

    @ObfuscatedName("ah.c")
    public int field730;

    @ObfuscatedName("ah.d")
    public int field732;

    @ObfuscatedName("ah.w")
    public int field743;

    @ObfuscatedName("ah.h")
    public int field733;

    @ObfuscatedName("ah.u")
    public int field734;

    @ObfuscatedName("ah.k")
    public int field735;

    @ObfuscatedName("ah.g")
    public class67 field729;

    @ObfuscatedName("ah.y")
    public int field737;

    @ObfuscatedName("ah.e")
    public int field738;

    @ObfuscatedName("ah.q")
    public int[] field739;

    @ObfuscatedName("ah.v")
    public int field740;

    @ObfuscatedName("ah.l")
    public class67 field741;

    @ObfuscatedName("ah.s")
    public class198 field746;

    @ObfuscatedName("af.x(I)V")
    public static void method668() {
        for (class32 var0 = (class32) field742.method2290(); var0 != null; var0 = (class32) field742.method2287()) {
            if (var0.field729 != null) {
                Statics.field2864.method965(var0.field729);
                var0.field729 = null;
            }
            if (var0.field741 != null) {
                Statics.field2864.method965(var0.field741);
                var0.field741 = null;
            }
        }
        field742.method2284();
    }

    @ObfuscatedName("ah.j(B)V")
    public void method689() {
        int var1 = this.field735;
        class198 var2 = this.field746.method3409();
        if (var2 == null) {
            this.field735 = -1;
            this.field734 = 0;
            this.field737 = 0;
            this.field738 = 0;
            this.field739 = null;
        } else {
            this.field735 = var2.field2939;
            this.field734 = var2.field2940 * 128;
            this.field737 = var2.field2924;
            this.field738 = var2.field2942;
            this.field739 = var2.field2903;
        }
        if (this.field735 != var1 && this.field729 != null) {
            Statics.field2864.method965(this.field729);
            this.field729 = null;
        }
    }

    @ObfuscatedName("l.c(IIILgl;IB)V")
    public static void method195(int arg0, int arg1, int arg2, class198 arg3, int arg4) {
        class32 var5 = new class32();
        var5.field730 = arg0;
        var5.field732 = arg1 * 128;
        var5.field731 = arg2 * 128;
        int var6 = arg3.field2910;
        int var7 = arg3.field2911;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field2911;
            var7 = arg3.field2910;
        }
        var5.field743 = (arg1 + var6) * 128;
        var5.field733 = (arg2 + var7) * 128;
        var5.field735 = arg3.field2939;
        var5.field734 = arg3.field2940 * 128;
        var5.field737 = arg3.field2924;
        var5.field738 = arg3.field2942;
        var5.field739 = arg3.field2903;
        if (arg3.field2935 != null) {
            var5.field746 = arg3;
            var5.method689();
        }
        field742.method2300(var5);
        if (var5.field739 != null) {
            var5.field740 = var5.field737 + (int) (Math.random() * (double) (var5.field738 - var5.field737));
        }
    }

    @ObfuscatedName("fz.d(IIIII)V")
    public static void method3093(int arg0, int arg1, int arg2, int arg3) {
        for (class32 var4 = (class32) field742.method2290(); var4 != null; var4 = (class32) field742.method2287()) {
            if (var4.field735 != -1 || var4.field739 != null) {
                int var5 = 0;
                if (arg1 > var4.field743) {
                    var5 += arg1 - var4.field743;
                } else if (arg1 < var4.field732) {
                    var5 += var4.field732 - arg1;
                }
                if (arg2 > var4.field733) {
                    var5 += arg2 - var4.field733;
                } else if (arg2 < var4.field731) {
                    var5 += var4.field731 - arg2;
                }
                if (var5 - 64 > var4.field734 || client.field555 == 0 || var4.field730 != arg0) {
                    if (var4.field729 != null) {
                        Statics.field2864.method965(var4.field729);
                        var4.field729 = null;
                    }
                    if (var4.field741 != null) {
                        Statics.field2864.method965(var4.field741);
                        var4.field741 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field555 * (var4.field734 - var5) / var4.field734;
                    if (var4.field729 != null) {
                        var4.field729.method1214(var6);
                    } else if (var4.field735 >= 0) {
                        class54 var7 = class54.method1032(Statics.field2779, var4.field735, 0);
                        if (var7 != null) {
                            class56 var8 = var7.method1023().method1065(Statics.field1225);
                            class67 var9 = class67.method1213(var8, 100, var6);
                            var9.method1279(-1);
                            Statics.field2864.method973(var9);
                            var4.field729 = var9;
                        }
                    }
                    if (var4.field741 != null) {
                        var4.field741.method1214(var6);
                        if (!var4.field741.method2279()) {
                            var4.field741 = null;
                        }
                    } else if (var4.field739 != null && (var4.field740 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field739.length);
                        class54 var11 = class54.method1032(Statics.field2779, var4.field739[var10], 0);
                        if (var11 != null) {
                            class56 var12 = var11.method1023().method1065(Statics.field1225);
                            class67 var13 = class67.method1213(var12, 100, var6);
                            var13.method1279(0);
                            Statics.field2864.method973(var13);
                            var4.field741 = var13;
                            var4.field740 = var4.field737 + (int) (Math.random() * (double) (var4.field738 - var4.field737));
                        }
                    }
                }
            }
        }
    }
}

package deob;

@ObfuscatedName("ad")
public final class class32 extends class128 {

    @ObfuscatedName("ad.q")
    public static class129 field734 = new class129();

    @ObfuscatedName("ad.d")
    public int field728;

    @ObfuscatedName("ad.h")
    public int field724;

    @ObfuscatedName("ad.p")
    public int field738;

    @ObfuscatedName("ad.j")
    public int field726;

    @ObfuscatedName("ad.n")
    public int field731;

    @ObfuscatedName("ad.r")
    public class198 field736;

    @ObfuscatedName("ad.c")
    public int field725;

    @ObfuscatedName("ad.i")
    public int field737;

    @ObfuscatedName("ad.o")
    public class67 field730;

    @ObfuscatedName("ad.m")
    public int field729;

    @ObfuscatedName("ad.s")
    public int field732;

    @ObfuscatedName("ad.u")
    public int[] field733;

    @ObfuscatedName("ad.b")
    public int field722;

    @ObfuscatedName("ad.v")
    public class67 field735;

    @ObfuscatedName("da.q(I)V")
    public static void method2126() {
        for (class32 var0 = (class32) field734.method2319(); var0 != null; var0 = (class32) field734.method2333()) {
            if (var0.field730 != null) {
                Statics.field185.method973(var0.field730);
                var0.field730 = null;
            }
            if (var0.field735 != null) {
                Statics.field185.method973(var0.field735);
                var0.field735 = null;
            }
        }
        field734.method2313();
    }

    @ObfuscatedName("ad.h(B)V")
    public void method704() {
        int var1 = this.field737;
        class198 var2 = this.field736.method3432();
        if (var2 == null) {
            this.field737 = -1;
            this.field725 = 0;
            this.field729 = 0;
            this.field732 = 0;
            this.field733 = null;
        } else {
            this.field737 = var2.field2938;
            this.field725 = var2.field2923 * 128;
            this.field729 = var2.field2939;
            this.field732 = var2.field2937;
            this.field733 = var2.field2942;
        }
        if (this.field737 != var1 && this.field730 != null) {
            Statics.field185.method973(this.field730);
            this.field730 = null;
        }
    }

    @ObfuscatedName("y.p(IIILgx;II)V")
    public static void method201(int arg0, int arg1, int arg2, class198 arg3, int arg4) {
        class32 var5 = new class32();
        var5.field728 = arg0;
        var5.field724 = arg1 * 128;
        var5.field738 = arg2 * 128;
        int var6 = arg3.field2909;
        int var7 = arg3.field2917;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field2917;
            var7 = arg3.field2909;
        }
        var5.field726 = (arg1 + var6) * 128;
        var5.field731 = (arg2 + var7) * 128;
        var5.field737 = arg3.field2938;
        var5.field725 = arg3.field2923 * 128;
        var5.field729 = arg3.field2939;
        var5.field732 = arg3.field2937;
        var5.field733 = arg3.field2942;
        if (arg3.field2935 != null) {
            var5.field736 = arg3;
            var5.method704();
        }
        field734.method2314(var5);
        if (var5.field733 != null) {
            var5.field722 = var5.field729 + (int) (Math.random() * (double) (var5.field732 - var5.field729));
        }
    }

    @ObfuscatedName("q.j(IIIII)V")
    public static void method2(int arg0, int arg1, int arg2, int arg3) {
        for (class32 var4 = (class32) field734.method2319(); var4 != null; var4 = (class32) field734.method2333()) {
            if (var4.field737 != -1 || var4.field733 != null) {
                int var5 = 0;
                if (arg1 > var4.field726) {
                    var5 += arg1 - var4.field726;
                } else if (arg1 < var4.field724) {
                    var5 += var4.field724 - arg1;
                }
                if (arg2 > var4.field731) {
                    var5 += arg2 - var4.field731;
                } else if (arg2 < var4.field738) {
                    var5 += var4.field738 - arg2;
                }
                if (var5 - 64 > var4.field725 || client.field547 == 0 || var4.field728 != arg0) {
                    if (var4.field730 != null) {
                        Statics.field185.method973(var4.field730);
                        var4.field730 = null;
                    }
                    if (var4.field735 != null) {
                        Statics.field185.method973(var4.field735);
                        var4.field735 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field547 * (var4.field725 - var5) / var4.field725;
                    if (var4.field730 != null) {
                        var4.field730.method1202(var6);
                    } else if (var4.field737 >= 0) {
                        class54 var7 = class54.method1022(Statics.field337, var4.field737, 0);
                        if (var7 != null) {
                            class56 var8 = var7.method1023().method1067(Statics.field707);
                            class67 var9 = class67.method1200(var8, 100, var6);
                            var9.method1208(-1);
                            Statics.field185.method968(var9);
                            var4.field730 = var9;
                        }
                    }
                    if (var4.field735 != null) {
                        var4.field735.method1202(var6);
                        if (!var4.field735.method2308()) {
                            var4.field735 = null;
                        }
                    } else if (var4.field733 != null && (var4.field722 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field733.length);
                        class54 var11 = class54.method1022(Statics.field337, var4.field733[var10], 0);
                        if (var11 != null) {
                            class56 var12 = var11.method1023().method1067(Statics.field707);
                            class67 var13 = class67.method1200(var12, 100, var6);
                            var13.method1208(0);
                            Statics.field185.method968(var13);
                            var4.field735 = var13;
                            var4.field722 = var4.field729 + (int) (Math.random() * (double) (var4.field732 - var4.field729));
                        }
                    }
                }
            }
        }
    }
}

package deob;

@ObfuscatedName("ap")
public final class class32 extends class128 {

    @ObfuscatedName("ap.i")
    public static class129 field707 = new class129();

    @ObfuscatedName("ap.e")
    public int field700;

    @ObfuscatedName("ap.f")
    public int field701;

    @ObfuscatedName("ap.k")
    public int field702;

    @ObfuscatedName("ap.g")
    public int field703;

    @ObfuscatedName("ap.n")
    public int field704;

    @ObfuscatedName("ap.a")
    public int field705;

    @ObfuscatedName("ap.q")
    public int field706;

    @ObfuscatedName("ap.w")
    public class67 field710;

    @ObfuscatedName("ap.v")
    public int field714;

    @ObfuscatedName("ap.h")
    public int field709;

    @ObfuscatedName("ap.p")
    public int[] field708;

    @ObfuscatedName("ap.l")
    public int field711;

    @ObfuscatedName("ap.c")
    public class67 field715;

    @ObfuscatedName("ap.m")
    public class198 field713;

    @ObfuscatedName("gf.i(I)V")
    public static void method3528() {
        for (class32 var0 = (class32) field707.method2209(); var0 != null; var0 = (class32) field707.method2211()) {
            if (var0.field710 != null) {
                Statics.field4.method894(var0.field710);
                var0.field710 = null;
            }
            if (var0.field715 != null) {
                Statics.field4.method894(var0.field715);
                var0.field715 = null;
            }
        }
        field707.method2203();
    }

    @ObfuscatedName("ap.e(S)V")
    public void method634() {
        int var1 = this.field706;
        class198 var2 = this.field713.method3342();
        if (var2 == null) {
            this.field706 = -1;
            this.field705 = 0;
            this.field714 = 0;
            this.field709 = 0;
            this.field708 = null;
        } else {
            this.field706 = var2.field2937;
            this.field705 = var2.field2921 * 128;
            this.field714 = var2.field2939;
            this.field709 = var2.field2903;
            this.field708 = var2.field2941;
        }
        if (this.field706 != var1 && this.field710 != null) {
            Statics.field4.method894(this.field710);
            this.field710 = null;
        }
    }

    @ObfuscatedName("ek.f(IIILgy;II)V")
    public static void method2511(int arg0, int arg1, int arg2, class198 arg3, int arg4) {
        class32 var5 = new class32();
        var5.field700 = arg0;
        var5.field701 = arg1 * 128;
        var5.field702 = arg2 * 128;
        int var6 = arg3.field2908;
        int var7 = arg3.field2909;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field2909;
            var7 = arg3.field2908;
        }
        var5.field703 = (arg1 + var6) * 128;
        var5.field704 = (arg2 + var7) * 128;
        var5.field706 = arg3.field2937;
        var5.field705 = arg3.field2921 * 128;
        var5.field714 = arg3.field2939;
        var5.field709 = arg3.field2903;
        var5.field708 = arg3.field2941;
        if (arg3.field2934 != null) {
            var5.field713 = arg3;
            var5.method634();
        }
        field707.method2226(var5);
        if (var5.field708 != null) {
            var5.field711 = var5.field714 + (int) (Math.random() * (double) (var5.field709 - var5.field714));
        }
    }

    @ObfuscatedName("bx.k(IIIIS)V")
    public static void method1029(int arg0, int arg1, int arg2, int arg3) {
        for (class32 var4 = (class32) field707.method2209(); var4 != null; var4 = (class32) field707.method2211()) {
            if (var4.field706 != -1 || var4.field708 != null) {
                int var5 = 0;
                if (arg1 > var4.field703) {
                    var5 += arg1 - var4.field703;
                } else if (arg1 < var4.field701) {
                    var5 += var4.field701 - arg1;
                }
                if (arg2 > var4.field704) {
                    var5 += arg2 - var4.field704;
                } else if (arg2 < var4.field702) {
                    var5 += var4.field702 - arg2;
                }
                if (var5 - 64 > var4.field705 || client.field528 == 0 || var4.field700 != arg0) {
                    if (var4.field710 != null) {
                        Statics.field4.method894(var4.field710);
                        var4.field710 = null;
                    }
                    if (var4.field715 != null) {
                        Statics.field4.method894(var4.field715);
                        var4.field715 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field528 * (var4.field705 - var5) / var4.field705;
                    if (var4.field710 != null) {
                        var4.field710.method1126(var6);
                    } else if (var4.field706 >= 0) {
                        class54 var7 = class54.method933(Statics.field1426, var4.field706, 0);
                        if (var7 != null) {
                            class56 var8 = var7.method921().method972(Statics.field230);
                            class67 var9 = class67.method1122(var8, 100, var6);
                            var9.method1125(-1);
                            Statics.field4.method865(var9);
                            var4.field710 = var9;
                        }
                    }
                    if (var4.field715 != null) {
                        var4.field715.method1126(var6);
                        if (!var4.field715.method2195()) {
                            var4.field715 = null;
                        }
                    } else if (var4.field708 != null && (var4.field711 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field708.length);
                        class54 var11 = class54.method933(Statics.field1426, var4.field708[var10], 0);
                        if (var11 != null) {
                            class56 var12 = var11.method921().method972(Statics.field230);
                            class67 var13 = class67.method1122(var12, 100, var6);
                            var13.method1125(0);
                            Statics.field4.method865(var13);
                            var4.field715 = var13;
                            var4.field711 = var4.field714 + (int) (Math.random() * (double) (var4.field709 - var4.field714));
                        }
                    }
                }
            }
        }
    }
}

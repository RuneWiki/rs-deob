package deob;

@ObfuscatedName("ak")
public final class class32 extends class149 {

    @ObfuscatedName("ak.d")
    public static class150 field710 = new class150();

    @ObfuscatedName("ak.c")
    public int field699;

    @ObfuscatedName("ak.n")
    public int field700;

    @ObfuscatedName("ak.q")
    public int field701;

    @ObfuscatedName("ak.t")
    public int field702;

    @ObfuscatedName("ak.p")
    public int field703;

    @ObfuscatedName("ak.u")
    public int field704;

    @ObfuscatedName("ak.z")
    public int field705;

    @ObfuscatedName("ak.l")
    public class67 field706;

    @ObfuscatedName("ak.v")
    public int field714;

    @ObfuscatedName("ak.g")
    public int field708;

    @ObfuscatedName("ak.w")
    public int[] field709;

    @ObfuscatedName("ak.r")
    public class203 field712;

    @ObfuscatedName("ak.s")
    public int field713;

    @ObfuscatedName("ak.k")
    public class67 field711;

    @ObfuscatedName("ak.d(I)V")
    public void method652() {
        int var1 = this.field705;
        class203 var2 = this.field712.method3475();
        if (var2 == null) {
            this.field705 = -1;
            this.field704 = 0;
            this.field714 = 0;
            this.field708 = 0;
            this.field709 = null;
        } else {
            this.field705 = var2.field2969;
            this.field704 = var2.field2970 * 128;
            this.field714 = var2.field2924;
            this.field708 = var2.field2972;
            this.field709 = var2.field2960;
        }
        if (this.field705 != var1 && this.field706 != null) {
            Statics.field1792.method917(this.field706);
            this.field706 = null;
        }
    }

    @ObfuscatedName("cg.c(IIILgy;II)V")
    public static void method1815(int arg0, int arg1, int arg2, class203 arg3, int arg4) {
        class32 var5 = new class32();
        var5.field699 = arg0;
        var5.field700 = arg1 * 128;
        var5.field701 = arg2 * 128;
        int var6 = arg3.field2964;
        int var7 = arg3.field2941;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field2941;
            var7 = arg3.field2964;
        }
        var5.field702 = (arg1 + var6) * 128;
        var5.field703 = (arg2 + var7) * 128;
        var5.field705 = arg3.field2969;
        var5.field704 = arg3.field2970 * 128;
        var5.field714 = arg3.field2924;
        var5.field708 = arg3.field2972;
        var5.field709 = arg3.field2960;
        if (arg3.field2966 != null) {
            var5.field712 = arg3;
            var5.method652();
        }
        field710.method2662(var5);
        if (var5.field709 != null) {
            var5.field713 = var5.field714 + (int) (Math.random() * (double) (var5.field708 - var5.field714));
        }
    }

    @ObfuscatedName("fb.n(IIIIB)V")
    public static void method3054(int arg0, int arg1, int arg2, int arg3) {
        for (class32 var4 = (class32) field710.method2666(); var4 != null; var4 = (class32) field710.method2668()) {
            if (var4.field705 != -1 || var4.field709 != null) {
                int var5 = 0;
                if (arg1 > var4.field702) {
                    var5 += arg1 - var4.field702;
                } else if (arg1 < var4.field700) {
                    var5 += var4.field700 - arg1;
                }
                if (arg2 > var4.field703) {
                    var5 += arg2 - var4.field703;
                } else if (arg2 < var4.field701) {
                    var5 += var4.field701 - arg2;
                }
                if (var5 - 64 > var4.field704 || client.field528 == 0 || var4.field699 != arg0) {
                    if (var4.field706 != null) {
                        Statics.field1792.method917(var4.field706);
                        var4.field706 = null;
                    }
                    if (var4.field711 != null) {
                        Statics.field1792.method917(var4.field711);
                        var4.field711 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field528 * (var4.field704 - var5) / var4.field704;
                    if (var4.field706 != null) {
                        var4.field706.method1156(var6);
                    } else if (var4.field705 >= 0) {
                        class54 var7 = class54.method965(Statics.field2883, var4.field705, 0);
                        if (var7 != null) {
                            class56 var8 = var7.method963().method1008(Statics.field1849);
                            class67 var9 = class67.method1225(var8, 100, var6);
                            var9.method1220(-1);
                            Statics.field1792.method907(var9);
                            var4.field706 = var9;
                        }
                    }
                    if (var4.field711 != null) {
                        var4.field711.method1156(var6);
                        if (!var4.field711.method2653()) {
                            var4.field711 = null;
                        }
                    } else if (var4.field709 != null && (var4.field713 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field709.length);
                        class54 var11 = class54.method965(Statics.field2883, var4.field709[var10], 0);
                        if (var11 != null) {
                            class56 var12 = var11.method963().method1008(Statics.field1849);
                            class67 var13 = class67.method1225(var12, 100, var6);
                            var13.method1220(0);
                            Statics.field1792.method907(var13);
                            var4.field711 = var13;
                            var4.field713 = var4.field714 + (int) (Math.random() * (double) (var4.field708 - var4.field714));
                        }
                    }
                }
            }
        }
    }
}

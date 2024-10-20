package deob;

@ObfuscatedName("bf")
public final class class78 extends class353 {

    @ObfuscatedName("bf.f")
    public static class295 field939 = new class295();

    @ObfuscatedName("bf.e")
    public int field934;

    @ObfuscatedName("bf.v")
    public int field941;

    @ObfuscatedName("bf.y")
    public int field937;

    @ObfuscatedName("bf.j")
    public int field938;

    @ObfuscatedName("bf.o")
    public int field945;

    @ObfuscatedName("bf.m")
    public int field940;

    @ObfuscatedName("bf.r")
    public class155 field948;

    @ObfuscatedName("bf.h")
    public int field936;

    @ObfuscatedName("bf.d")
    public class58 field935;

    @ObfuscatedName("bf.z")
    public int field942;

    @ObfuscatedName("bf.b")
    public int field944;

    @ObfuscatedName("bf.i")
    public int[] field947;

    @ObfuscatedName("bf.k")
    public int field946;

    @ObfuscatedName("bf.g")
    public class58 field943;

    @ObfuscatedName("aj.f(B)V")
    public static void method332() {
        for (class78 var0 = (class78) field939.method4721(); var0 != null; var0 = (class78) field939.method4723()) {
            if (var0.field948 != null) {
                var0.method1620();
            }
        }
    }

    @ObfuscatedName("bf.e(B)V")
    public void method1620() {
        int var1 = this.field936;
        class155 var2 = this.field948.method2712();
        if (var2 == null) {
            this.field936 = -1;
            this.field940 = 0;
            this.field942 = 0;
            this.field944 = 0;
            this.field947 = null;
        } else {
            this.field936 = var2.field1806;
            this.field940 = var2.field1802 * 128;
            this.field942 = var2.field1803;
            this.field944 = var2.field1804;
            this.field947 = var2.field1801;
        }
        if (this.field936 != var1 && this.field935 != null) {
            Statics.field1442.method620(this.field935);
            this.field935 = null;
        }
    }

    @ObfuscatedName("fp.v(IIILez;II)V")
    public static void method3269(int arg0, int arg1, int arg2, class155 arg3, int arg4) {
        class78 var5 = new class78();
        var5.field934 = arg0;
        var5.field941 = arg1 * 128;
        var5.field937 = arg2 * 128;
        int var6 = arg3.field1772;
        int var7 = arg3.field1773;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field1773;
            var7 = arg3.field1772;
        }
        var5.field938 = (arg1 + var6) * 128;
        var5.field945 = (arg2 + var7) * 128;
        var5.field936 = arg3.field1806;
        var5.field940 = arg3.field1802 * 128;
        var5.field942 = arg3.field1803;
        var5.field944 = arg3.field1804;
        var5.field947 = arg3.field1801;
        if (arg3.field1798 != null) {
            var5.field948 = arg3;
            var5.method1620();
        }
        field939.method4716(var5);
        if (var5.field947 != null) {
            var5.field946 = var5.field942 + (int) (Math.random() * (double) (var5.field944 - var5.field942));
        }
    }

    @ObfuscatedName("dc.y(IIIIB)V")
    public static void method2241(int arg0, int arg1, int arg2, int arg3) {
        for (class78 var4 = (class78) field939.method4721(); var4 != null; var4 = (class78) field939.method4723()) {
            if (var4.field936 != -1 || var4.field947 != null) {
                int var5 = 0;
                if (arg1 > var4.field938) {
                    var5 += arg1 - var4.field938;
                } else if (arg1 < var4.field941) {
                    var5 += var4.field941 - arg1;
                }
                if (arg2 > var4.field945) {
                    var5 += arg2 - var4.field945;
                } else if (arg2 < var4.field937) {
                    var5 += var4.field937 - arg2;
                }
                if (var5 - 64 > var4.field940 || Statics.field40.field1322 == 0 || var4.field934 != arg0) {
                    if (var4.field935 != null) {
                        Statics.field1442.method620(var4.field935);
                        var4.field935 = null;
                    }
                    if (var4.field943 != null) {
                        Statics.field1442.method620(var4.field943);
                        var4.field943 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = Statics.field40.field1322 * (var4.field940 - var5) / var4.field940;
                    if (var4.field935 != null) {
                        var4.field935.method752(var6);
                    } else if (var4.field936 >= 0) {
                        class50 var7 = class50.method633(Statics.field212, var4.field936, 0);
                        if (var7 != null) {
                            class51 var8 = var7.method639().method644(Statics.field2142);
                            class58 var9 = class58.method871(var8, 100, var6);
                            var9.method875(-1);
                            Statics.field1442.method619(var9);
                            var4.field935 = var9;
                        }
                    }
                    if (var4.field943 != null) {
                        var4.field943.method752(var6);
                        if (!var4.field943.method5408()) {
                            var4.field943 = null;
                        }
                    } else if (var4.field947 != null && (var4.field946 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field947.length);
                        class50 var11 = class50.method633(Statics.field212, var4.field947[var10], 0);
                        if (var11 != null) {
                            class51 var12 = var11.method639().method644(Statics.field2142);
                            class58 var13 = class58.method871(var12, 100, var6);
                            var13.method875(0);
                            Statics.field1442.method619(var13);
                            var4.field943 = var13;
                            var4.field946 = var4.field942 + (int) (Math.random() * (double) (var4.field944 - var4.field942));
                        }
                    }
                }
            }
        }
    }
}

package deob;

@ObfuscatedName("f")
public final class class20 extends class187 {

    @ObfuscatedName("f.n")
    public static class178 field571 = new class178();

    @ObfuscatedName("f.x")
    public int field557;

    @ObfuscatedName("f.k")
    public int field563;

    @ObfuscatedName("f.i")
    public int field556;

    @ObfuscatedName("f.d")
    public int field558;

    @ObfuscatedName("f.q")
    public int field555;

    @ObfuscatedName("f.m")
    public int field560;

    @ObfuscatedName("f.a")
    public int field561;

    @ObfuscatedName("f.w")
    public class58 field570;

    @ObfuscatedName("f.e")
    public int field559;

    @ObfuscatedName("f.o")
    public int field564;

    @ObfuscatedName("f.v")
    public int[] field562;

    @ObfuscatedName("f.z")
    public int field566;

    @ObfuscatedName("f.j")
    public class58 field567;

    @ObfuscatedName("f.r")
    public class36 field568;

    @ObfuscatedName("co.n(I)V")
    public static void method1972() {
        for (class20 var0 = (class20) field571.method3179(); var0 != null; var0 = (class20) field571.method3199()) {
            if (var0.field568 != null) {
                var0.method496();
            }
        }
    }

    @ObfuscatedName("f.x(I)V")
    public void method496() {
        int var1 = this.field561;
        class36 var2 = this.field568.method670();
        if (var2 == null) {
            this.field561 = -1;
            this.field560 = 0;
            this.field559 = 0;
            this.field564 = 0;
            this.field562 = null;
        } else {
            this.field561 = var2.field884;
            this.field560 = var2.field886 * 128;
            this.field559 = var2.field879;
            this.field564 = var2.field887;
            this.field562 = var2.field888;
        }
        if (this.field561 != var1 && this.field570 != null) {
            Statics.field243.method957(this.field570);
            this.field570 = null;
        }
    }

    @ObfuscatedName("cz.k(IIIII)V")
    public static void method2068(int arg0, int arg1, int arg2, int arg3) {
        for (class20 var4 = (class20) field571.method3179(); var4 != null; var4 = (class20) field571.method3199()) {
            if (var4.field561 != -1 || var4.field562 != null) {
                int var5 = 0;
                if (arg1 > var4.field558) {
                    var5 += arg1 - var4.field558;
                } else if (arg1 < var4.field556) {
                    var5 += var4.field556 - arg1;
                }
                if (arg2 > var4.field555) {
                    var5 += arg2 - var4.field555;
                } else if (arg2 < var4.field557) {
                    var5 += var4.field557 - arg2;
                }
                if (var5 - 64 > var4.field560 || client.field254 == 0 || var4.field563 != arg0) {
                    if (var4.field570 != null) {
                        Statics.field243.method957(var4.field570);
                        var4.field570 = null;
                    }
                    if (var4.field567 != null) {
                        Statics.field243.method957(var4.field567);
                        var4.field567 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field254 * (var4.field560 - var5) / var4.field560;
                    if (var4.field570 != null) {
                        var4.field570.method1158(var6);
                    } else if (var4.field561 >= 0) {
                        class52 var7 = class52.method1064(Statics.field1831, var4.field561, 0);
                        if (var7 != null) {
                            class56 var8 = var7.method1057().method1093(Statics.field80);
                            class58 var9 = class58.method1186(var8, 100, var6);
                            var9.method1117(-1);
                            Statics.field243.method956(var9);
                            var4.field570 = var9;
                        }
                    }
                    if (var4.field567 != null) {
                        var4.field567.method1158(var6);
                        if (!var4.field567.method3275()) {
                            var4.field567 = null;
                        }
                    } else if (var4.field562 != null && (var4.field566 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field562.length);
                        class52 var11 = class52.method1064(Statics.field1831, var4.field562[var10], 0);
                        if (var11 != null) {
                            class56 var12 = var11.method1057().method1093(Statics.field80);
                            class58 var13 = class58.method1186(var12, 100, var6);
                            var13.method1117(0);
                            Statics.field243.method956(var13);
                            var4.field567 = var13;
                            var4.field566 = var4.field559 + (int) (Math.random() * (double) (var4.field564 - var4.field559));
                        }
                    }
                }
            }
        }
    }
}

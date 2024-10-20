package deob;

@ObfuscatedName("t")
public final class class7 extends class179 {

    @ObfuscatedName("t.b")
    public static class177 field112 = new class177();

    @ObfuscatedName("t.c")
    public int field110;

    @ObfuscatedName("t.j")
    public int field117;

    @ObfuscatedName("t.i")
    public int field120;

    @ObfuscatedName("t.k")
    public int field113;

    @ObfuscatedName("t.q")
    public int field114;

    @ObfuscatedName("t.t")
    public int field115;

    @ObfuscatedName("t.v")
    public int field124;

    @ObfuscatedName("t.y")
    public class45 field109;

    @ObfuscatedName("t.w")
    public int field118;

    @ObfuscatedName("t.g")
    public int field111;

    @ObfuscatedName("t.s")
    public int[] field119;

    @ObfuscatedName("t.n")
    public int field121;

    @ObfuscatedName("t.x")
    public class45 field122;

    @ObfuscatedName("t.o")
    public class32 field123;

    @ObfuscatedName("i.b(I)V")
    public static void method26() {
        for (class7 var0 = (class7) field112.method3246(); var0 != null; var0 = (class7) field112.method3248()) {
            if (var0.field123 != null) {
                var0.method62();
            }
        }
    }

    @ObfuscatedName("t.c(I)V")
    public void method62() {
        int var1 = this.field124;
        class32 var2 = this.field123.method630();
        if (var2 == null) {
            this.field124 = -1;
            this.field115 = 0;
            this.field118 = 0;
            this.field111 = 0;
            this.field119 = null;
        } else {
            this.field124 = var2.field842;
            this.field115 = var2.field855 * 128;
            this.field118 = var2.field829;
            this.field111 = var2.field860;
            this.field119 = var2.field844;
        }
        if (this.field124 != var1 && this.field109 != null) {
            Statics.field1216.method1088(this.field109);
            this.field109 = null;
        }
    }

    @ObfuscatedName("c.j(IIIIB)V")
    public static void method11(int arg0, int arg1, int arg2, int arg3) {
        for (class7 var4 = (class7) field112.method3246(); var4 != null; var4 = (class7) field112.method3248()) {
            if (var4.field124 != -1 || var4.field119 != null) {
                int var5 = 0;
                if (arg1 > var4.field113) {
                    var5 += arg1 - var4.field113;
                } else if (arg1 < var4.field117) {
                    var5 += var4.field117 - arg1;
                }
                if (arg2 > var4.field114) {
                    var5 += arg2 - var4.field114;
                } else if (arg2 < var4.field120) {
                    var5 += var4.field120 - arg2;
                }
                if (var5 - 64 > var4.field115 || client.field716 == 0 || var4.field110 != arg0) {
                    if (var4.field109 != null) {
                        Statics.field1216.method1088(var4.field109);
                        var4.field109 = null;
                    }
                    if (var4.field122 != null) {
                        Statics.field1216.method1088(var4.field122);
                        var4.field122 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field716 * (var4.field115 - var5) / var4.field115;
                    if (var4.field109 != null) {
                        var4.field109.method944(var6);
                    } else if (var4.field124 >= 0) {
                        class57 var7 = class57.method1249(Statics.field1193, var4.field124, 0);
                        if (var7 != null) {
                            class63 var8 = var7.method1239().method1302(Statics.field1317);
                            class45 var9 = class45.method964(var8, 100, var6);
                            var9.method965(-1);
                            Statics.field1216.method1087(var9);
                            var4.field109 = var9;
                        }
                    }
                    if (var4.field122 != null) {
                        var4.field122.method944(var6);
                        if (!var4.field122.method3291()) {
                            var4.field122 = null;
                        }
                    } else if (var4.field119 != null && (var4.field121 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field119.length);
                        class57 var11 = class57.method1249(Statics.field1193, var4.field119[var10], 0);
                        if (var11 != null) {
                            class63 var12 = var11.method1239().method1302(Statics.field1317);
                            class45 var13 = class45.method964(var12, 100, var6);
                            var13.method965(0);
                            Statics.field1216.method1087(var13);
                            var4.field122 = var13;
                            var4.field121 = var4.field118 + (int) (Math.random() * (double) (var4.field111 - var4.field118));
                        }
                    }
                }
            }
        }
    }
}

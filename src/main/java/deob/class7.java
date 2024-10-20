package deob;

@ObfuscatedName("a")
public final class class7 extends class178 {

    @ObfuscatedName("a.u")
    public static class176 field111 = new class176();

    @ObfuscatedName("a.k")
    public int field92;

    @ObfuscatedName("a.x")
    public int field104;

    @ObfuscatedName("a.m")
    public int field93;

    @ObfuscatedName("a.n")
    public int field95;

    @ObfuscatedName("a.q")
    public int field91;

    @ObfuscatedName("a.a")
    public int field97;

    @ObfuscatedName("a.g")
    public int field98;

    @ObfuscatedName("a.j")
    public class44 field103;

    @ObfuscatedName("a.l")
    public int field94;

    @ObfuscatedName("a.w")
    public int field101;

    @ObfuscatedName("a.z")
    public int[] field102;

    @ObfuscatedName("a.e")
    public int field100;

    @ObfuscatedName("a.b")
    public class44 field105;

    @ObfuscatedName("a.c")
    public class31 field99;

    @ObfuscatedName("ev.u(I)V")
    public static void method2884() {
        for (class7 var0 = (class7) field111.method3326(); var0 != null; var0 = (class7) field111.method3330()) {
            if (var0.field103 != null) {
                Statics.field778.method1096(var0.field103);
                var0.field103 = null;
            }
            if (var0.field105 != null) {
                Statics.field778.method1096(var0.field105);
                var0.field105 = null;
            }
        }
        field111.method3322();
    }

    @ObfuscatedName("an.k(B)V")
    public static void method892() {
        for (class7 var0 = (class7) field111.method3326(); var0 != null; var0 = (class7) field111.method3330()) {
            if (var0.field99 != null) {
                var0.method49();
            }
        }
    }

    @ObfuscatedName("a.x(S)V")
    public void method49() {
        int var1 = this.field98;
        class31 var2 = this.field99.method622();
        if (var2 == null) {
            this.field98 = -1;
            this.field97 = 0;
            this.field94 = 0;
            this.field101 = 0;
            this.field102 = null;
        } else {
            this.field98 = var2.field854;
            this.field97 = var2.field855 * 128;
            this.field94 = var2.field856;
            this.field101 = var2.field825;
            this.field102 = var2.field858;
        }
        if (this.field98 != var1 && this.field103 != null) {
            Statics.field778.method1096(this.field103);
            this.field103 = null;
        }
    }

    @ObfuscatedName("fz.m(IIILav;II)V")
    public static void method3139(int arg0, int arg1, int arg2, class31 arg3, int arg4) {
        class7 var5 = new class7();
        var5.field92 = arg0;
        var5.field93 = arg1 * 128;
        var5.field104 = arg2 * 128;
        int var6 = arg3.field852;
        int var7 = arg3.field840;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field840;
            var7 = arg3.field852;
        }
        var5.field95 = (arg1 + var6) * 128;
        var5.field91 = (arg2 + var7) * 128;
        var5.field98 = arg3.field854;
        var5.field97 = arg3.field855 * 128;
        var5.field94 = arg3.field856;
        var5.field101 = arg3.field825;
        var5.field102 = arg3.field858;
        if (arg3.field851 != null) {
            var5.field99 = arg3;
            var5.method49();
        }
        field111.method3323(var5);
        if (var5.field102 != null) {
            var5.field100 = var5.field94 + (int) (Math.random() * (double) (var5.field101 - var5.field94));
        }
    }

    @ObfuscatedName("bz.n(IIIIB)V")
    public static void method1485(int arg0, int arg1, int arg2, int arg3) {
        for (class7 var4 = (class7) field111.method3326(); var4 != null; var4 = (class7) field111.method3330()) {
            if (var4.field98 != -1 || var4.field102 != null) {
                int var5 = 0;
                if (arg1 > var4.field95) {
                    var5 += arg1 - var4.field95;
                } else if (arg1 < var4.field93) {
                    var5 += var4.field93 - arg1;
                }
                if (arg2 > var4.field91) {
                    var5 += arg2 - var4.field91;
                } else if (arg2 < var4.field104) {
                    var5 += var4.field104 - arg2;
                }
                if (var5 - 64 > var4.field97 || client.field711 == 0 || var4.field92 != arg0) {
                    if (var4.field103 != null) {
                        Statics.field778.method1096(var4.field103);
                        var4.field103 = null;
                    }
                    if (var4.field105 != null) {
                        Statics.field778.method1096(var4.field105);
                        var4.field105 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field711 * (var4.field97 - var5) / var4.field97;
                    if (var4.field103 != null) {
                        var4.field103.method949(var6);
                    } else if (var4.field98 >= 0) {
                        class56 var7 = class56.method1248(Statics.field690, var4.field98, 0);
                        if (var7 != null) {
                            class62 var8 = var7.method1256().method1311(Statics.field1260);
                            class44 var9 = class44.method945(var8, 100, var6);
                            var9.method948(-1);
                            Statics.field778.method1095(var9);
                            var4.field103 = var9;
                        }
                    }
                    if (var4.field105 != null) {
                        var4.field105.method949(var6);
                        if (!var4.field105.method3360()) {
                            var4.field105 = null;
                        }
                    } else if (var4.field102 != null && (var4.field100 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field102.length);
                        class56 var11 = class56.method1248(Statics.field690, var4.field102[var10], 0);
                        if (var11 != null) {
                            class62 var12 = var11.method1256().method1311(Statics.field1260);
                            class44 var13 = class44.method945(var12, 100, var6);
                            var13.method948(0);
                            Statics.field778.method1095(var13);
                            var4.field105 = var13;
                            var4.field100 = var4.field94 + (int) (Math.random() * (double) (var4.field101 - var4.field94));
                        }
                    }
                }
            }
        }
    }
}

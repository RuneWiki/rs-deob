package deob;

@ObfuscatedName("bx")
public final class class78 extends class351 {

    @ObfuscatedName("bx.f")
    public static class272 field920 = new class272();

    @ObfuscatedName("bx.o")
    public int field914;

    @ObfuscatedName("bx.u")
    public int field915;

    @ObfuscatedName("bx.p")
    public int field913;

    @ObfuscatedName("bx.b")
    public int field917;

    @ObfuscatedName("bx.e")
    public int field918;

    @ObfuscatedName("bx.k")
    public int field919;

    @ObfuscatedName("bx.g")
    public int field926;

    @ObfuscatedName("bx.h")
    public class58 field921;

    @ObfuscatedName("bx.n")
    public int field922;

    @ObfuscatedName("bx.l")
    public int field923;

    @ObfuscatedName("bx.m")
    public int[] field916;

    @ObfuscatedName("bx.d")
    public int field925;

    @ObfuscatedName("bx.c")
    public class58 field924;

    @ObfuscatedName("bx.j")
    public class295 field927;

    @ObfuscatedName("bx.f(I)V")
    public void method1531() {
        int var1 = this.field926;
        class295 var2 = this.field927.method4611();
        if (var2 == null) {
            this.field926 = -1;
            this.field919 = 0;
            this.field922 = 0;
            this.field923 = 0;
            this.field916 = null;
        } else {
            this.field926 = var2.field3633;
            this.field919 = var2.field3634 * 128;
            this.field922 = var2.field3635;
            this.field923 = var2.field3636;
            this.field916 = var2.field3628;
        }
        if (this.field926 != var1 && this.field921 != null) {
            Statics.field2784.method553(this.field921);
            this.field921 = null;
        }
    }

    @ObfuscatedName("io.o(IIIII)V")
    public static void method4055(int arg0, int arg1, int arg2, int arg3) {
        for (class78 var4 = (class78) field920.method4160(); var4 != null; var4 = (class78) field920.method4182()) {
            if (var4.field926 != -1 || var4.field916 != null) {
                int var5 = 0;
                if (arg1 > var4.field917) {
                    var5 += arg1 - var4.field917;
                } else if (arg1 < var4.field915) {
                    var5 += var4.field915 - arg1;
                }
                if (arg2 > var4.field918) {
                    var5 += arg2 - var4.field918;
                } else if (arg2 < var4.field913) {
                    var5 += var4.field913 - arg2;
                }
                if (var5 - 64 > var4.field919 || Statics.field988.field1308 == 0 || var4.field914 != arg0) {
                    if (var4.field921 != null) {
                        Statics.field2784.method553(var4.field921);
                        var4.field921 = null;
                    }
                    if (var4.field924 != null) {
                        Statics.field2784.method553(var4.field924);
                        var4.field924 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = Statics.field988.field1308 * (var4.field919 - var5) / var4.field919;
                    if (var4.field921 != null) {
                        var4.field921.method704(var6);
                    } else if (var4.field926 >= 0) {
                        class50 var7 = class50.method602(Statics.field1121, var4.field926, 0);
                        if (var7 != null) {
                            class51 var8 = var7.method590().method606(Statics.field235);
                            class58 var9 = class58.method700(var8, 100, var6);
                            var9.method703(-1);
                            Statics.field2784.method583(var9);
                            var4.field921 = var9;
                        }
                    }
                    if (var4.field924 != null) {
                        var4.field924.method704(var6);
                        if (!var4.field924.method5353()) {
                            var4.field924 = null;
                        }
                    } else if (var4.field916 != null && (var4.field925 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field916.length);
                        class50 var11 = class50.method602(Statics.field1121, var4.field916[var10], 0);
                        if (var11 != null) {
                            class51 var12 = var11.method590().method606(Statics.field235);
                            class58 var13 = class58.method700(var12, 100, var6);
                            var13.method703(0);
                            Statics.field2784.method583(var13);
                            var4.field924 = var13;
                            var4.field925 = var4.field922 + (int) (Math.random() * (double) (var4.field923 - var4.field922));
                        }
                    }
                }
            }
        }
    }
}

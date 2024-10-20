package deob;

@ObfuscatedName("a")
public final class class20 extends class186 {

    @ObfuscatedName("a.e")
    public static class177 field567 = new class177();

    @ObfuscatedName("a.v")
    public int field552;

    @ObfuscatedName("a.i")
    public int field553;

    @ObfuscatedName("a.g")
    public int field554;

    @ObfuscatedName("a.x")
    public int field563;

    @ObfuscatedName("a.b")
    public int field555;

    @ObfuscatedName("a.q")
    public int field557;

    @ObfuscatedName("a.l")
    public int field558;

    @ObfuscatedName("a.m")
    public class58 field559;

    @ObfuscatedName("a.u")
    public int field560;

    @ObfuscatedName("a.s")
    public int field551;

    @ObfuscatedName("a.f")
    public int[] field562;

    @ObfuscatedName("a.p")
    public int field561;

    @ObfuscatedName("a.w")
    public class58 field568;

    @ObfuscatedName("a.y")
    public class36 field565;

    @ObfuscatedName("a.e(B)V")
    public void method474() {
        int var1 = this.field558;
        class36 var2 = this.field565.method634();
        if (var2 == null) {
            this.field558 = -1;
            this.field557 = 0;
            this.field560 = 0;
            this.field551 = 0;
            this.field562 = null;
        } else {
            this.field558 = var2.field855;
            this.field557 = var2.field831 * 128;
            this.field560 = var2.field847;
            this.field551 = var2.field879;
            this.field562 = var2.field880;
        }
        if (this.field558 != var1 && this.field559 != null) {
            Statics.field206.method965(this.field559);
            this.field559 = null;
        }
    }

    @ObfuscatedName("cs.v(IIILay;II)V")
    public static void method1874(int arg0, int arg1, int arg2, class36 arg3, int arg4) {
        class20 var5 = new class20();
        var5.field552 = arg0;
        var5.field553 = arg1 * 128;
        var5.field554 = arg2 * 128;
        int var6 = arg3.field877;
        int var7 = arg3.field848;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field848;
            var7 = arg3.field877;
        }
        var5.field563 = (arg1 + var6) * 128;
        var5.field555 = (arg2 + var7) * 128;
        var5.field558 = arg3.field855;
        var5.field557 = arg3.field831 * 128;
        var5.field560 = arg3.field847;
        var5.field551 = arg3.field879;
        var5.field562 = arg3.field880;
        if (arg3.field873 != null) {
            var5.field565 = arg3;
            var5.method474();
        }
        field567.method3183(var5);
        if (var5.field562 != null) {
            var5.field561 = var5.field560 + (int) (Math.random() * (double) (var5.field551 - var5.field560));
        }
    }

    @ObfuscatedName("m.i(IIIII)V")
    public static void method99(int arg0, int arg1, int arg2, int arg3) {
        for (class20 var4 = (class20) field567.method3210(); var4 != null; var4 = (class20) field567.method3182()) {
            if (var4.field558 != -1 || var4.field562 != null) {
                int var5 = 0;
                if (arg1 > var4.field563) {
                    var5 += arg1 - var4.field563;
                } else if (arg1 < var4.field553) {
                    var5 += var4.field553 - arg1;
                }
                if (arg2 > var4.field555) {
                    var5 += arg2 - var4.field555;
                } else if (arg2 < var4.field554) {
                    var5 += var4.field554 - arg2;
                }
                if (var5 - 64 > var4.field557 || client.field381 == 0 || var4.field552 != arg0) {
                    if (var4.field559 != null) {
                        Statics.field206.method965(var4.field559);
                        var4.field559 = null;
                    }
                    if (var4.field568 != null) {
                        Statics.field206.method965(var4.field568);
                        var4.field568 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field381 * (var4.field557 - var5) / var4.field557;
                    if (var4.field559 != null) {
                        var4.field559.method1210(var6);
                    } else if (var4.field558 >= 0) {
                        class52 var7 = class52.method1030(Statics.field1455, var4.field558, 0);
                        if (var7 != null) {
                            class56 var8 = var7.method1017().method1064(Statics.field1989);
                            class58 var9 = class58.method1090(var8, 100, var6);
                            var9.method1093(-1);
                            Statics.field206.method947(var9);
                            var4.field559 = var9;
                        }
                    }
                    if (var4.field568 != null) {
                        var4.field568.method1210(var6);
                        if (!var4.field568.method3274()) {
                            var4.field568 = null;
                        }
                    } else if (var4.field562 != null && (var4.field561 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field562.length);
                        class52 var11 = class52.method1030(Statics.field1455, var4.field562[var10], 0);
                        if (var11 != null) {
                            class56 var12 = var11.method1017().method1064(Statics.field1989);
                            class58 var13 = class58.method1090(var12, 100, var6);
                            var13.method1093(0);
                            Statics.field206.method947(var13);
                            var4.field568 = var13;
                            var4.field561 = var4.field560 + (int) (Math.random() * (double) (var4.field551 - var4.field560));
                        }
                    }
                }
            }
        }
    }
}

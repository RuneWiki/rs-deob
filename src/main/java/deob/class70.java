package deob;

@ObfuscatedName("bg")
public final class class70 extends class207 {

    @ObfuscatedName("bg.f")
    public static class208 field1018 = new class208();

    @ObfuscatedName("bg.h")
    public int field1007;

    @ObfuscatedName("bg.e")
    public int field1008;

    @ObfuscatedName("bg.b")
    public int field1009;

    @ObfuscatedName("bg.l")
    public int field1010;

    @ObfuscatedName("bg.w")
    public int field1011;

    @ObfuscatedName("bg.d")
    public int field1019;

    @ObfuscatedName("bg.n")
    public int field1013;

    @ObfuscatedName("bg.s")
    public int field1015;

    @ObfuscatedName("bg.g")
    public class106 field1014;

    @ObfuscatedName("bg.a")
    public int field1016;

    @ObfuscatedName("bg.r")
    public class271 field1020;

    @ObfuscatedName("bg.k")
    public int[] field1017;

    @ObfuscatedName("bg.m")
    public int field1006;

    @ObfuscatedName("bg.q")
    public class106 field1021;

    @ObfuscatedName("cy.f(B)V")
    public static void method1772() {
        for (class70 var0 = (class70) field1018.method3823(); var0 != null; var0 = (class70) field1018.method3822()) {
            if (var0.field1020 != null) {
                var0.method1607();
            }
        }
    }

    @ObfuscatedName("bg.h(I)V")
    public void method1607() {
        int var1 = this.field1013;
        class271 var2 = this.field1020.method4682();
        if (var2 == null) {
            this.field1013 = -1;
            this.field1019 = 0;
            this.field1015 = 0;
            this.field1016 = 0;
            this.field1017 = null;
        } else {
            this.field1013 = var2.field3475;
            this.field1019 = var2.field3476 * 128;
            this.field1015 = var2.field3477;
            this.field1016 = var2.field3445;
            this.field1017 = var2.field3479;
        }
        if (this.field1013 != var1 && this.field1014 != null) {
            Statics.field2095.method1910(this.field1014);
            this.field1014 = null;
        }
    }

    @ObfuscatedName("ek.e(IIILju;II)V")
    public static void method3010(int arg0, int arg1, int arg2, class271 arg3, int arg4) {
        class70 var5 = new class70();
        var5.field1007 = arg0;
        var5.field1008 = arg1 * 128;
        var5.field1009 = arg2 * 128;
        int var6 = arg3.field3446;
        int var7 = arg3.field3447;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field3447;
            var7 = arg3.field3446;
        }
        var5.field1010 = (arg1 + var6) * 128;
        var5.field1011 = (arg2 + var7) * 128;
        var5.field1013 = arg3.field3475;
        var5.field1019 = arg3.field3476 * 128;
        var5.field1015 = arg3.field3477;
        var5.field1016 = arg3.field3445;
        var5.field1017 = arg3.field3479;
        if (arg3.field3472 != null) {
            var5.field1020 = arg3;
            var5.method1607();
        }
        field1018.method3831(var5);
        if (var5.field1017 != null) {
            var5.field1006 = var5.field1015 + (int) (Math.random() * (double) (var5.field1016 - var5.field1015));
        }
    }

    @ObfuscatedName("t.b(IIIII)V")
    public static void method214(int arg0, int arg1, int arg2, int arg3) {
        for (class70 var4 = (class70) field1018.method3823(); var4 != null; var4 = (class70) field1018.method3822()) {
            if (var4.field1013 != -1 || var4.field1017 != null) {
                int var5 = 0;
                if (arg1 > var4.field1010) {
                    var5 += arg1 - var4.field1010;
                } else if (arg1 < var4.field1008) {
                    var5 += var4.field1008 - arg1;
                }
                if (arg2 > var4.field1011) {
                    var5 += arg2 - var4.field1011;
                } else if (arg2 < var4.field1009) {
                    var5 += var4.field1009 - arg2;
                }
                if (var5 - 64 > var4.field1019 || client.field755 == 0 || var4.field1007 != arg0) {
                    if (var4.field1014 != null) {
                        Statics.field2095.method1910(var4.field1014);
                        var4.field1014 = null;
                    }
                    if (var4.field1021 != null) {
                        Statics.field2095.method1910(var4.field1021);
                        var4.field1021 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field755 * (var4.field1019 - var5) / var4.field1019;
                    if (var4.field1014 != null) {
                        var4.field1014.method2133(var6);
                    } else if (var4.field1013 >= 0) {
                        class94 var7 = class94.method1971(Statics.field38, var4.field1013, 0);
                        if (var7 != null) {
                            class96 var8 = var7.method1959().method2010(Statics.field1053);
                            class106 var9 = class106.method2134(var8, 100, var6);
                            var9.method2252(-1);
                            Statics.field2095.method1916(var9);
                            var4.field1014 = var9;
                        }
                    }
                    if (var4.field1021 != null) {
                        var4.field1021.method2133(var6);
                        if (!var4.field1021.method3808()) {
                            var4.field1021 = null;
                        }
                    } else if (var4.field1017 != null && (var4.field1006 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field1017.length);
                        class94 var11 = class94.method1971(Statics.field38, var4.field1017[var10], 0);
                        if (var11 != null) {
                            class96 var12 = var11.method1959().method2010(Statics.field1053);
                            class106 var13 = class106.method2134(var12, 100, var6);
                            var13.method2252(0);
                            Statics.field2095.method1916(var13);
                            var4.field1021 = var13;
                            var4.field1006 = var4.field1015 + (int) (Math.random() * (double) (var4.field1016 - var4.field1015));
                        }
                    }
                }
            }
        }
    }
}

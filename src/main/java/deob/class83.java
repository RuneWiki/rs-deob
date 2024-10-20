package deob;

@ObfuscatedName("co")
public final class class83 extends class196 {

    @ObfuscatedName("co.s")
    public int field1329;

    @ObfuscatedName("co.c")
    public static class197 field1326 = new class197();

    @ObfuscatedName("co.f")
    public int field1321;

    @ObfuscatedName("co.m")
    public int field1322;

    @ObfuscatedName("co.h")
    public int field1323;

    @ObfuscatedName("co.t")
    public int field1324;

    @ObfuscatedName("co.p")
    public int field1325;

    @ObfuscatedName("co.d")
    public int field1333;

    @ObfuscatedName("co.n")
    public int field1327;

    @ObfuscatedName("co.z")
    public class118 field1328;

    @ObfuscatedName("co.o")
    public int field1330;

    @ObfuscatedName("co.q")
    public int[] field1331;

    @ObfuscatedName("co.u")
    public int field1332;

    @ObfuscatedName("co.k")
    public class118 field1335;

    @ObfuscatedName("co.e")
    public class259 field1334;

    @ObfuscatedName("co.s(I)V")
    public void method1473() {
        int var1 = this.field1327;
        class259 var2 = this.field1334.method4246();
        if (var2 == null) {
            this.field1327 = -1;
            this.field1333 = 0;
            this.field1329 = 0;
            this.field1330 = 0;
            this.field1331 = null;
        } else {
            this.field1327 = var2.field3472;
            this.field1333 = var2.field3492 * 128;
            this.field1329 = var2.field3493;
            this.field1330 = var2.field3481;
            this.field1331 = var2.field3495;
        }
        if (this.field1327 != var1 && this.field1328 != null) {
            Statics.field283.method1766(this.field1328);
            this.field1328 = null;
        }
    }

    @ObfuscatedName("gj.c(IIILih;II)V")
    public static void method3236(int arg0, int arg1, int arg2, class259 arg3, int arg4) {
        class83 var5 = new class83();
        var5.field1321 = arg0;
        var5.field1322 = arg1 * 128;
        var5.field1323 = arg2 * 128;
        int var6 = arg3.field3484;
        int var7 = arg3.field3463;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field3463;
            var7 = arg3.field3484;
        }
        var5.field1324 = (arg1 + var6) * 128;
        var5.field1325 = (arg2 + var7) * 128;
        var5.field1327 = arg3.field3472;
        var5.field1333 = arg3.field3492 * 128;
        var5.field1329 = arg3.field3493;
        var5.field1330 = arg3.field3481;
        var5.field1331 = arg3.field3495;
        if (arg3.field3488 != null) {
            var5.field1334 = arg3;
            var5.method1473();
        }
        field1326.method3394(var5);
        if (var5.field1331 != null) {
            var5.field1332 = var5.field1329 + (int) (Math.random() * (double) (var5.field1330 - var5.field1329));
        }
    }

    @ObfuscatedName("az.f(IIIII)V")
    public static void method541(int arg0, int arg1, int arg2, int arg3) {
        for (class83 var4 = (class83) field1326.method3389(); var4 != null; var4 = (class83) field1326.method3385()) {
            if (var4.field1327 != -1 || var4.field1331 != null) {
                int var5 = 0;
                if (arg1 > var4.field1324) {
                    var5 += arg1 - var4.field1324;
                } else if (arg1 < var4.field1322) {
                    var5 += var4.field1322 - arg1;
                }
                if (arg2 > var4.field1325) {
                    var5 += arg2 - var4.field1325;
                } else if (arg2 < var4.field1323) {
                    var5 += var4.field1323 - arg2;
                }
                if (var5 - 64 > var4.field1333 || client.field1155 == 0 || var4.field1321 != arg0) {
                    if (var4.field1328 != null) {
                        Statics.field283.method1766(var4.field1328);
                        var4.field1328 = null;
                    }
                    if (var4.field1335 != null) {
                        Statics.field283.method1766(var4.field1335);
                        var4.field1335 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field1155 * (var4.field1333 - var5) / var4.field1333;
                    if (var4.field1328 != null) {
                        var4.field1328.method2005(var6);
                    } else if (var4.field1327 >= 0) {
                        class106 var7 = class106.method1822(Statics.field582, var4.field1327, 0);
                        if (var7 != null) {
                            class108 var8 = var7.method1821().method1864(Statics.field248);
                            class118 var9 = class118.method1991(var8, 100, var6);
                            var9.method2072(-1);
                            Statics.field283.method1800(var9);
                            var4.field1328 = var9;
                        }
                    }
                    if (var4.field1335 != null) {
                        var4.field1335.method2005(var6);
                        if (!var4.field1335.method3375()) {
                            var4.field1335 = null;
                        }
                    } else if (var4.field1331 != null && (var4.field1332 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field1331.length);
                        class106 var11 = class106.method1822(Statics.field582, var4.field1331[var10], 0);
                        if (var11 != null) {
                            class108 var12 = var11.method1821().method1864(Statics.field248);
                            class118 var13 = class118.method1991(var12, 100, var6);
                            var13.method2072(0);
                            Statics.field283.method1800(var13);
                            var4.field1335 = var13;
                            var4.field1332 = var4.field1329 + (int) (Math.random() * (double) (var4.field1330 - var4.field1329));
                        }
                    }
                }
            }
        }
    }
}

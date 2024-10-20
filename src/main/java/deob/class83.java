package deob;

@ObfuscatedName("cl")
public final class class83 extends class196 {

    @ObfuscatedName("cl.w")
    public static class197 field1329 = new class197();

    @ObfuscatedName("cl.o")
    public int field1327;

    @ObfuscatedName("cl.x")
    public int field1326;

    @ObfuscatedName("cl.k")
    public int field1328;

    @ObfuscatedName("cl.f")
    public int field1331;

    @ObfuscatedName("cl.i")
    public int field1341;

    @ObfuscatedName("cl.j")
    public int field1332;

    @ObfuscatedName("cl.m")
    public int field1333;

    @ObfuscatedName("cl.u")
    public class118 field1330;

    @ObfuscatedName("cl.r")
    public class259 field1340;

    @ObfuscatedName("cl.v")
    public int field1334;

    @ObfuscatedName("cl.h")
    public int field1336;

    @ObfuscatedName("cl.a")
    public int[] field1335;

    @ObfuscatedName("cl.p")
    public int field1338;

    @ObfuscatedName("cl.q")
    public class118 field1339;

    @ObfuscatedName("cl.o(I)V")
    public void method1455() {
        int var1 = this.field1333;
        class259 var2 = this.field1340.method4176();
        if (var2 == null) {
            this.field1333 = -1;
            this.field1332 = 0;
            this.field1334 = 0;
            this.field1336 = 0;
            this.field1335 = null;
        } else {
            this.field1333 = var2.field3479;
            this.field1332 = var2.field3453 * 128;
            this.field1334 = var2.field3494;
            this.field1336 = var2.field3495;
            this.field1335 = var2.field3458;
        }
        if (this.field1333 != var1 && this.field1330 != null) {
            Statics.field619.method1687(this.field1330);
            this.field1330 = null;
        }
    }

    @ObfuscatedName("bi.x(IIIII)V")
    public static void method1388(int arg0, int arg1, int arg2, int arg3) {
        for (class83 var4 = (class83) field1329.method3304(); var4 != null; var4 = (class83) field1329.method3306()) {
            if (var4.field1333 != -1 || var4.field1335 != null) {
                int var5 = 0;
                if (arg1 > var4.field1331) {
                    var5 += arg1 - var4.field1331;
                } else if (arg1 < var4.field1328) {
                    var5 += var4.field1328 - arg1;
                }
                if (arg2 > var4.field1341) {
                    var5 += arg2 - var4.field1341;
                } else if (arg2 < var4.field1326) {
                    var5 += var4.field1326 - arg2;
                }
                if (var5 - 64 > var4.field1332 || client.field1167 == 0 || var4.field1327 != arg0) {
                    if (var4.field1330 != null) {
                        Statics.field619.method1687(var4.field1330);
                        var4.field1330 = null;
                    }
                    if (var4.field1339 != null) {
                        Statics.field619.method1687(var4.field1339);
                        var4.field1339 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field1167 * (var4.field1332 - var5) / var4.field1332;
                    if (var4.field1330 != null) {
                        var4.field1330.method1919(var6);
                    } else if (var4.field1333 >= 0) {
                        class106 var7 = class106.method1749(Statics.field2274, var4.field1333, 0);
                        if (var7 != null) {
                            class108 var8 = var7.method1756().method1798(Statics.field706);
                            class118 var9 = class118.method1915(var8, 100, var6);
                            var9.method1918(-1);
                            Statics.field619.method1686(var9);
                            var4.field1330 = var9;
                        }
                    }
                    if (var4.field1339 != null) {
                        var4.field1339.method1919(var6);
                        if (!var4.field1339.method3295()) {
                            var4.field1339 = null;
                        }
                    } else if (var4.field1335 != null && (var4.field1338 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field1335.length);
                        class106 var11 = class106.method1749(Statics.field2274, var4.field1335[var10], 0);
                        if (var11 != null) {
                            class108 var12 = var11.method1756().method1798(Statics.field706);
                            class118 var13 = class118.method1915(var12, 100, var6);
                            var13.method1918(0);
                            Statics.field619.method1686(var13);
                            var4.field1339 = var13;
                            var4.field1338 = var4.field1334 + (int) (Math.random() * (double) (var4.field1336 - var4.field1334));
                        }
                    }
                }
            }
        }
    }
}

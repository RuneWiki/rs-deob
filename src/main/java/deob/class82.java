package deob;

@ObfuscatedName("cz")
public final class class82 extends class194 {

    @ObfuscatedName("cz.i")
    public static class195 field1335 = new class195();

    @ObfuscatedName("cz.j")
    public int field1327;

    @ObfuscatedName("cz.a")
    public int field1338;

    @ObfuscatedName("cz.r")
    public class257 field1340;

    @ObfuscatedName("cz.o")
    public int field1329;

    @ObfuscatedName("cz.n")
    public int field1336;

    @ObfuscatedName("cz.q")
    public int field1334;

    @ObfuscatedName("cz.b")
    public int field1332;

    @ObfuscatedName("cz.k")
    public int field1333;

    @ObfuscatedName("cz.s")
    public int field1343;

    @ObfuscatedName("cz.d")
    public class117 field1328;

    @ObfuscatedName("cz.l")
    public int field1331;

    @ObfuscatedName("cz.t")
    public int[] field1337;

    @ObfuscatedName("cz.y")
    public int field1326;

    @ObfuscatedName("cz.v")
    public class117 field1339;

    @ObfuscatedName("ga.i(I)V")
    public static void method3486() {
        for (class82 var0 = (class82) field1335.method3410(); var0 != null; var0 = (class82) field1335.method3412()) {
            if (var0.field1328 != null) {
                Statics.field480.method1726(var0.field1328);
                var0.field1328 = null;
            }
            if (var0.field1339 != null) {
                Statics.field480.method1726(var0.field1339);
                var0.field1339 = null;
            }
        }
        field1335.method3404();
    }

    @ObfuscatedName("cz.j(I)V")
    public void method1471() {
        int var1 = this.field1333;
        class257 var2 = this.field1340.method4204();
        if (var2 == null) {
            this.field1333 = -1;
            this.field1332 = 0;
            this.field1343 = 0;
            this.field1331 = 0;
            this.field1337 = null;
        } else {
            this.field1333 = var2.field3479;
            this.field1332 = var2.field3480 * 128;
            this.field1343 = var2.field3481;
            this.field1331 = var2.field3462;
            this.field1337 = var2.field3483;
        }
        if (this.field1333 != var1 && this.field1328 != null) {
            Statics.field480.method1726(this.field1328);
            this.field1328 = null;
        }
    }

    @ObfuscatedName("cj.a(IIILiq;IS)V")
    public static void method1409(int arg0, int arg1, int arg2, class257 arg3, int arg4) {
        class82 var5 = new class82();
        var5.field1327 = arg0;
        var5.field1338 = arg1 * 128;
        var5.field1329 = arg2 * 128;
        int var6 = arg3.field3450;
        int var7 = arg3.field3451;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field3451;
            var7 = arg3.field3450;
        }
        var5.field1336 = (arg1 + var6) * 128;
        var5.field1334 = (arg2 + var7) * 128;
        var5.field1333 = arg3.field3479;
        var5.field1332 = arg3.field3480 * 128;
        var5.field1343 = arg3.field3481;
        var5.field1331 = arg3.field3462;
        var5.field1337 = arg3.field3483;
        if (arg3.field3476 != null) {
            var5.field1340 = arg3;
            var5.method1471();
        }
        field1335.method3405(var5);
        if (var5.field1337 != null) {
            var5.field1326 = var5.field1343 + (int) (Math.random() * (double) (var5.field1331 - var5.field1343));
        }
    }

    @ObfuscatedName("bf.r(IIIII)V")
    public static void method1002(int arg0, int arg1, int arg2, int arg3) {
        for (class82 var4 = (class82) field1335.method3410(); var4 != null; var4 = (class82) field1335.method3412()) {
            if (var4.field1333 != -1 || var4.field1337 != null) {
                int var5 = 0;
                if (arg1 > var4.field1336) {
                    var5 += arg1 - var4.field1336;
                } else if (arg1 < var4.field1338) {
                    var5 += var4.field1338 - arg1;
                }
                if (arg2 > var4.field1334) {
                    var5 += arg2 - var4.field1334;
                } else if (arg2 < var4.field1329) {
                    var5 += var4.field1329 - arg2;
                }
                if (var5 - 64 > var4.field1332 || client.field1172 == 0 || var4.field1327 != arg0) {
                    if (var4.field1328 != null) {
                        Statics.field480.method1726(var4.field1328);
                        var4.field1328 = null;
                    }
                    if (var4.field1339 != null) {
                        Statics.field480.method1726(var4.field1339);
                        var4.field1339 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field1172 * (var4.field1332 - var5) / var4.field1332;
                    if (var4.field1328 != null) {
                        var4.field1328.method1959(var6);
                    } else if (var4.field1333 >= 0) {
                        class105 var7 = class105.method1794(Statics.field2420, var4.field1333, 0);
                        if (var7 != null) {
                            class107 var8 = var7.method1787().method1828(Statics.field2593);
                            class117 var9 = class117.method1955(var8, 100, var6);
                            var9.method1958(-1);
                            Statics.field480.method1761(var9);
                            var4.field1328 = var9;
                        }
                    }
                    if (var4.field1339 != null) {
                        var4.field1339.method1959(var6);
                        if (!var4.field1339.method3398()) {
                            var4.field1339 = null;
                        }
                    } else if (var4.field1337 != null && (var4.field1326 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field1337.length);
                        class105 var11 = class105.method1794(Statics.field2420, var4.field1337[var10], 0);
                        if (var11 != null) {
                            class107 var12 = var11.method1787().method1828(Statics.field2593);
                            class117 var13 = class117.method1955(var12, 100, var6);
                            var13.method1958(0);
                            Statics.field480.method1761(var13);
                            var4.field1339 = var13;
                            var4.field1326 = var4.field1343 + (int) (Math.random() * (double) (var4.field1331 - var4.field1343));
                        }
                    }
                }
            }
        }
    }
}

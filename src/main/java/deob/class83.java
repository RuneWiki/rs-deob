package deob;

@ObfuscatedName("cq")
public final class class83 extends class193 {

    @ObfuscatedName("cq.i")
    public static class194 field1350 = new class194();

    @ObfuscatedName("cq.w")
    public int field1340;

    @ObfuscatedName("cq.a")
    public int field1341;

    @ObfuscatedName("cq.t")
    public int field1342;

    @ObfuscatedName("cq.s")
    public int field1348;

    @ObfuscatedName("cq.r")
    public class256 field1346;

    @ObfuscatedName("cq.v")
    public int field1353;

    @ObfuscatedName("cq.y")
    public int field1344;

    @ObfuscatedName("cq.j")
    public int field1345;

    @ObfuscatedName("cq.k")
    public int field1339;

    @ObfuscatedName("cq.e")
    public class118 field1347;

    @ObfuscatedName("cq.o")
    public int field1349;

    @ObfuscatedName("cq.z")
    public int[] field1354;

    @ObfuscatedName("cq.l")
    public int field1351;

    @ObfuscatedName("cq.c")
    public class118 field1352;

    @ObfuscatedName("fy.i(I)V")
    public static void method2842() {
        for (class83 var0 = (class83) field1350.method3303(); var0 != null; var0 = (class83) field1350.method3297()) {
            if (var0.field1347 != null) {
                Statics.field329.method1730(var0.field1347);
                var0.field1347 = null;
            }
            if (var0.field1352 != null) {
                Statics.field329.method1730(var0.field1352);
                var0.field1352 = null;
            }
        }
        field1350.method3301();
    }

    @ObfuscatedName("cq.w(B)V")
    public void method1484() {
        int var1 = this.field1339;
        class256 var2 = this.field1346.method4199();
        if (var2 == null) {
            this.field1339 = -1;
            this.field1345 = 0;
            this.field1348 = 0;
            this.field1349 = 0;
            this.field1354 = null;
        } else {
            this.field1339 = var2.field3491;
            this.field1345 = var2.field3492 * 128;
            this.field1348 = var2.field3493;
            this.field1349 = var2.field3494;
            this.field1354 = var2.field3495;
        }
        if (this.field1339 != var1 && this.field1347 != null) {
            Statics.field329.method1730(this.field1347);
            this.field1347 = null;
        }
    }

    @ObfuscatedName("r.a(IIIIB)V")
    public static void method21(int arg0, int arg1, int arg2, int arg3) {
        for (class83 var4 = (class83) field1350.method3303(); var4 != null; var4 = (class83) field1350.method3297()) {
            if (var4.field1339 != -1 || var4.field1354 != null) {
                int var5 = 0;
                if (arg1 > var4.field1353) {
                    var5 += arg1 - var4.field1353;
                } else if (arg1 < var4.field1341) {
                    var5 += var4.field1341 - arg1;
                }
                if (arg2 > var4.field1344) {
                    var5 += arg2 - var4.field1344;
                } else if (arg2 < var4.field1342) {
                    var5 += var4.field1342 - arg2;
                }
                if (var5 - 64 > var4.field1345 || client.field1099 == 0 || var4.field1340 != arg0) {
                    if (var4.field1347 != null) {
                        Statics.field329.method1730(var4.field1347);
                        var4.field1347 = null;
                    }
                    if (var4.field1352 != null) {
                        Statics.field329.method1730(var4.field1352);
                        var4.field1352 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field1099 * (var4.field1345 - var5) / var4.field1345;
                    if (var4.field1347 != null) {
                        var4.field1347.method1950(var6);
                    } else if (var4.field1339 >= 0) {
                        class106 var7 = class106.method1795(Statics.field1546, var4.field1339, 0);
                        if (var7 != null) {
                            class108 var8 = var7.method1783().method1830(Statics.field2897);
                            class118 var9 = class118.method2032(var8, 100, var6);
                            var9.method1946(-1);
                            Statics.field329.method1733(var9);
                            var4.field1347 = var9;
                        }
                    }
                    if (var4.field1352 != null) {
                        var4.field1352.method1950(var6);
                        if (!var4.field1352.method3291()) {
                            var4.field1352 = null;
                        }
                    } else if (var4.field1354 != null && (var4.field1351 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field1354.length);
                        class106 var11 = class106.method1795(Statics.field1546, var4.field1354[var10], 0);
                        if (var11 != null) {
                            class108 var12 = var11.method1783().method1830(Statics.field2897);
                            class118 var13 = class118.method2032(var12, 100, var6);
                            var13.method1946(0);
                            Statics.field329.method1733(var13);
                            var4.field1352 = var13;
                            var4.field1351 = var4.field1348 + (int) (Math.random() * (double) (var4.field1349 - var4.field1348));
                        }
                    }
                }
            }
        }
    }
}

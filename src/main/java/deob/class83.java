package deob;

@ObfuscatedName("cu")
public final class class83 extends class193 {

    @ObfuscatedName("cu.d")
    public static class194 field1287 = new class194();

    @ObfuscatedName("cu.q")
    public int field1285;

    @ObfuscatedName("cu.x")
    public int field1299;

    @ObfuscatedName("cu.y")
    public int field1286;

    @ObfuscatedName("cu.e")
    public int field1288;

    @ObfuscatedName("cu.f")
    public int field1293;

    @ObfuscatedName("cu.v")
    public int field1290;

    @ObfuscatedName("cu.t")
    public int field1291;

    @ObfuscatedName("cu.i")
    public class120 field1292;

    @ObfuscatedName("cu.r")
    public class256 field1296;

    @ObfuscatedName("cu.g")
    public int field1298;

    @ObfuscatedName("cu.s")
    public int field1294;

    @ObfuscatedName("cu.o")
    public int[] field1295;

    @ObfuscatedName("cu.p")
    public int field1284;

    @ObfuscatedName("cu.u")
    public class120 field1297;

    @ObfuscatedName("gh.d(I)V")
    public static void method3562() {
        for (class83 var0 = (class83) field1287.method3323(); var0 != null; var0 = (class83) field1287.method3325()) {
            if (var0.field1296 != null) {
                var0.method1465();
            }
        }
    }

    @ObfuscatedName("cu.q(I)V")
    public void method1465() {
        int var1 = this.field1291;
        class256 var2 = this.field1296.method4127();
        if (var2 == null) {
            this.field1291 = -1;
            this.field1290 = 0;
            this.field1298 = 0;
            this.field1294 = 0;
            this.field1295 = null;
        } else {
            this.field1291 = var2.field3429;
            this.field1290 = var2.field3461 * 128;
            this.field1298 = var2.field3462;
            this.field1294 = var2.field3463;
            this.field1295 = var2.field3450;
        }
        if (this.field1291 != var1 && this.field1292 != null) {
            Statics.field19.method1775(this.field1292);
            this.field1292 = null;
        }
    }

    @ObfuscatedName("bc.x(IIILiv;II)V")
    public static void method1009(int arg0, int arg1, int arg2, class256 arg3, int arg4) {
        class83 var5 = new class83();
        var5.field1285 = arg0;
        var5.field1286 = arg1 * 128;
        var5.field1299 = arg2 * 128;
        int var6 = arg3.field3431;
        int var7 = arg3.field3453;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field3453;
            var7 = arg3.field3431;
        }
        var5.field1288 = (arg1 + var6) * 128;
        var5.field1293 = (arg2 + var7) * 128;
        var5.field1291 = arg3.field3429;
        var5.field1290 = arg3.field3461 * 128;
        var5.field1298 = arg3.field3462;
        var5.field1294 = arg3.field3463;
        var5.field1295 = arg3.field3450;
        if (arg3.field3457 != null) {
            var5.field1296 = arg3;
            var5.method1465();
        }
        field1287.method3318(var5);
        if (var5.field1295 != null) {
            var5.field1284 = var5.field1298 + (int) (Math.random() * (double) (var5.field1294 - var5.field1298));
        }
    }

    @ObfuscatedName("av.y(IIIII)V")
    public static void method481(int arg0, int arg1, int arg2, int arg3) {
        for (class83 var4 = (class83) field1287.method3323(); var4 != null; var4 = (class83) field1287.method3325()) {
            if (var4.field1291 != -1 || var4.field1295 != null) {
                int var5 = 0;
                if (arg1 > var4.field1288) {
                    var5 += arg1 - var4.field1288;
                } else if (arg1 < var4.field1286) {
                    var5 += var4.field1286 - arg1;
                }
                if (arg2 > var4.field1293) {
                    var5 += arg2 - var4.field1293;
                } else if (arg2 < var4.field1299) {
                    var5 += var4.field1299 - arg2;
                }
                if (var5 - 64 > var4.field1290 || client.field1124 == 0 || var4.field1285 != arg0) {
                    if (var4.field1292 != null) {
                        Statics.field19.method1775(var4.field1292);
                        var4.field1292 = null;
                    }
                    if (var4.field1297 != null) {
                        Statics.field19.method1775(var4.field1297);
                        var4.field1297 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field1124 * (var4.field1290 - var5) / var4.field1290;
                    if (var4.field1292 != null) {
                        var4.field1292.method2008(var6);
                    } else if (var4.field1291 >= 0) {
                        class108 var7 = class108.method1835(Statics.field2556, var4.field1291, 0);
                        if (var7 != null) {
                            class110 var8 = var7.method1833().method1881(Statics.field1540);
                            class120 var9 = class120.method2004(var8, 100, var6);
                            var9.method2007(-1);
                            Statics.field19.method1774(var9);
                            var4.field1292 = var9;
                        }
                    }
                    if (var4.field1297 != null) {
                        var4.field1297.method2008(var6);
                        if (!var4.field1297.method3311()) {
                            var4.field1297 = null;
                        }
                    } else if (var4.field1295 != null && (var4.field1284 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field1295.length);
                        class108 var11 = class108.method1835(Statics.field2556, var4.field1295[var10], 0);
                        if (var11 != null) {
                            class110 var12 = var11.method1833().method1881(Statics.field1540);
                            class120 var13 = class120.method2004(var12, 100, var6);
                            var13.method2007(0);
                            Statics.field19.method1774(var13);
                            var4.field1297 = var13;
                            var4.field1284 = var4.field1298 + (int) (Math.random() * (double) (var4.field1294 - var4.field1298));
                        }
                    }
                }
            }
        }
    }
}

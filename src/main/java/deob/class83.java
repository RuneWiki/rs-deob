package deob;

@ObfuscatedName("cm")
public final class class83 extends class194 {

    @ObfuscatedName("cm.e")
    public static class195 field1315 = new class195();

    @ObfuscatedName("cm.n")
    public int field1316;

    @ObfuscatedName("cm.g")
    public int field1306;

    @ObfuscatedName("cm.y")
    public int field1305;

    @ObfuscatedName("cm.w")
    public int field1308;

    @ObfuscatedName("cm.k")
    public int field1309;

    @ObfuscatedName("cm.v")
    public int field1307;

    @ObfuscatedName("cm.z")
    public int field1311;

    @ObfuscatedName("cm.r")
    public class257 field1318;

    @ObfuscatedName("cm.u")
    public class119 field1317;

    @ObfuscatedName("cm.d")
    public int field1304;

    @ObfuscatedName("cm.o")
    public int field1314;

    @ObfuscatedName("cm.l")
    public int[] field1312;

    @ObfuscatedName("cm.h")
    public int field1310;

    @ObfuscatedName("cm.s")
    public class119 field1313;

    @ObfuscatedName("i.e(I)V")
    public static void method164() {
        for (class83 var0 = (class83) field1315.method3348(); var0 != null; var0 = (class83) field1315.method3350()) {
            if (var0.field1317 != null) {
                Statics.field514.method1792(var0.field1317);
                var0.field1317 = null;
            }
            if (var0.field1313 != null) {
                Statics.field514.method1792(var0.field1313);
                var0.field1313 = null;
            }
        }
        field1315.method3366();
    }

    @ObfuscatedName("je.n(I)V")
    public static void method4727() {
        for (class83 var0 = (class83) field1315.method3348(); var0 != null; var0 = (class83) field1315.method3350()) {
            if (var0.field1318 != null) {
                var0.method1489();
            }
        }
    }

    @ObfuscatedName("cm.g(B)V")
    public void method1489() {
        int var1 = this.field1311;
        class257 var2 = this.field1318.method4229();
        if (var2 == null) {
            this.field1311 = -1;
            this.field1307 = 0;
            this.field1304 = 0;
            this.field1314 = 0;
            this.field1312 = null;
        } else {
            this.field1311 = var2.field3471;
            this.field1307 = var2.field3458 * 128;
            this.field1304 = var2.field3473;
            this.field1314 = var2.field3474;
            this.field1312 = var2.field3475;
        }
        if (this.field1311 != var1 && this.field1317 != null) {
            Statics.field514.method1792(this.field1317);
            this.field1317 = null;
        }
    }

    @ObfuscatedName("bc.y(IIILia;II)V")
    public static void method975(int arg0, int arg1, int arg2, class257 arg3, int arg4) {
        class83 var5 = new class83();
        var5.field1316 = arg0;
        var5.field1306 = arg1 * 128;
        var5.field1305 = arg2 * 128;
        int var6 = arg3.field3476;
        int var7 = arg3.field3443;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field3443;
            var7 = arg3.field3476;
        }
        var5.field1308 = (arg1 + var6) * 128;
        var5.field1309 = (arg2 + var7) * 128;
        var5.field1311 = arg3.field3471;
        var5.field1307 = arg3.field3458 * 128;
        var5.field1304 = arg3.field3473;
        var5.field1314 = arg3.field3474;
        var5.field1312 = arg3.field3475;
        if (arg3.field3468 != null) {
            var5.field1318 = arg3;
            var5.method1489();
        }
        field1315.method3379(var5);
        if (var5.field1312 != null) {
            var5.field1310 = var5.field1304 + (int) (Math.random() * (double) (var5.field1314 - var5.field1304));
        }
    }
}

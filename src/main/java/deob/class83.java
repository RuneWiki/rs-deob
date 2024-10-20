package deob;

@ObfuscatedName("ci")
public final class class83 extends class193 {

    @ObfuscatedName("ci.p")
    public static class194 field1315 = new class194();

    @ObfuscatedName("ci.m")
    public int field1307;

    @ObfuscatedName("ci.e")
    public int field1323;

    @ObfuscatedName("ci.t")
    public int field1311;

    @ObfuscatedName("ci.w")
    public int field1310;

    @ObfuscatedName("ci.z")
    public int field1321;

    @ObfuscatedName("ci.j")
    public int field1312;

    @ObfuscatedName("ci.i")
    public int field1309;

    @ObfuscatedName("ci.f")
    public class118 field1314;

    @ObfuscatedName("ci.c")
    public int field1308;

    @ObfuscatedName("ci.o")
    public int field1316;

    @ObfuscatedName("ci.q")
    public int[] field1317;

    @ObfuscatedName("ci.n")
    public int field1318;

    @ObfuscatedName("ci.a")
    public class118 field1319;

    @ObfuscatedName("ci.g")
    public class256 field1320;

    @ObfuscatedName("bo.p(I)V")
    public static void method957() {
        for (class83 var0 = (class83) field1315.method3252(); var0 != null; var0 = (class83) field1315.method3277()) {
            if (var0.field1314 != null) {
                Statics.field443.method1664(var0.field1314);
                var0.field1314 = null;
            }
            if (var0.field1319 != null) {
                Statics.field443.method1664(var0.field1319);
                var0.field1319 = null;
            }
        }
        field1315.method3246();
    }

    @ObfuscatedName("ej.m(B)V")
    public static void method2583() {
        for (class83 var0 = (class83) field1315.method3252(); var0 != null; var0 = (class83) field1315.method3277()) {
            if (var0.field1320 != null) {
                var0.method1420();
            }
        }
    }

    @ObfuscatedName("ci.e(I)V")
    public void method1420() {
        int var1 = this.field1309;
        class256 var2 = this.field1320.method4121();
        if (var2 == null) {
            this.field1309 = -1;
            this.field1312 = 0;
            this.field1308 = 0;
            this.field1316 = 0;
            this.field1317 = null;
        } else {
            this.field1309 = var2.field3475;
            this.field1312 = var2.field3467 * 128;
            this.field1308 = var2.field3489;
            this.field1316 = var2.field3443;
            this.field1317 = var2.field3491;
        }
        if (this.field1309 != var1 && this.field1314 != null) {
            Statics.field443.method1664(this.field1314);
            this.field1314 = null;
        }
    }

    @ObfuscatedName("ck.t(IIILij;IB)V")
    public static void method1518(int arg0, int arg1, int arg2, class256 arg3, int arg4) {
        class83 var5 = new class83();
        var5.field1307 = arg0;
        var5.field1323 = arg1 * 128;
        var5.field1311 = arg2 * 128;
        int var6 = arg3.field3458;
        int var7 = arg3.field3459;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field3459;
            var7 = arg3.field3458;
        }
        var5.field1310 = (arg1 + var6) * 128;
        var5.field1321 = (arg2 + var7) * 128;
        var5.field1309 = arg3.field3475;
        var5.field1312 = arg3.field3467 * 128;
        var5.field1308 = arg3.field3489;
        var5.field1316 = arg3.field3443;
        var5.field1317 = arg3.field3491;
        if (arg3.field3484 != null) {
            var5.field1320 = arg3;
            var5.method1420();
        }
        field1315.method3270(var5);
        if (var5.field1317 != null) {
            var5.field1318 = var5.field1308 + (int) (Math.random() * (double) (var5.field1316 - var5.field1308));
        }
    }
}

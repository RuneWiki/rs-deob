package deob;

@ObfuscatedName("cp")
public final class class83 extends class193 {

    @ObfuscatedName("cp.i")
    public static class194 field1300 = new class194();

    @ObfuscatedName("cp.h")
    public int field1292;

    @ObfuscatedName("cp.u")
    public int field1306;

    @ObfuscatedName("cp.q")
    public int field1301;

    @ObfuscatedName("cp.g")
    public int field1305;

    @ObfuscatedName("cp.v")
    public int field1296;

    @ObfuscatedName("cp.t")
    public int field1297;

    @ObfuscatedName("cp.p")
    public int field1298;

    @ObfuscatedName("cp.l")
    public class118 field1299;

    @ObfuscatedName("cp.a")
    public int field1293;

    @ObfuscatedName("cp.k")
    public int field1291;

    @ObfuscatedName("cp.r")
    public class256 field1308;

    @ObfuscatedName("cp.b")
    public int[] field1302;

    @ObfuscatedName("cp.x")
    public int field1294;

    @ObfuscatedName("cp.o")
    public class118 field1304;

    @ObfuscatedName("cd.i(B)V")
    public static void method1469() {
        for (class83 var0 = (class83) field1300.method3376(); var0 != null; var0 = (class83) field1300.method3377()) {
            if (var0.field1308 != null) {
                var0.method1489();
            }
        }
    }

    @ObfuscatedName("cp.h(I)V")
    public void method1489() {
        int var1 = this.field1298;
        class256 var2 = this.field1308.method4253();
        if (var2 == null) {
            this.field1298 = -1;
            this.field1297 = 0;
            this.field1293 = 0;
            this.field1291 = 0;
            this.field1302 = null;
        } else {
            this.field1298 = var2.field3433;
            this.field1297 = var2.field3475 * 128;
            this.field1293 = var2.field3470;
            this.field1291 = var2.field3477;
            this.field1302 = var2.field3460;
        }
        if (this.field1298 != var1 && this.field1299 != null) {
            Statics.field2292.method1755(this.field1299);
            this.field1299 = null;
        }
    }

    @ObfuscatedName("fw.u(IIILif;II)V")
    public static void method2901(int arg0, int arg1, int arg2, class256 arg3, int arg4) {
        class83 var5 = new class83();
        var5.field1292 = arg0;
        var5.field1306 = arg1 * 128;
        var5.field1301 = arg2 * 128;
        int var6 = arg3.field3453;
        int var7 = arg3.field3431;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field3431;
            var7 = arg3.field3453;
        }
        var5.field1305 = (arg1 + var6) * 128;
        var5.field1296 = (arg2 + var7) * 128;
        var5.field1298 = arg3.field3433;
        var5.field1297 = arg3.field3475 * 128;
        var5.field1293 = arg3.field3470;
        var5.field1291 = arg3.field3477;
        var5.field1302 = arg3.field3460;
        if (arg3.field3471 != null) {
            var5.field1308 = arg3;
            var5.method1489();
        }
        field1300.method3371(var5);
        if (var5.field1302 != null) {
            var5.field1294 = var5.field1293 + (int) (Math.random() * (double) (var5.field1291 - var5.field1293));
        }
    }
}

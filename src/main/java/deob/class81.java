package deob;

@ObfuscatedName("ck")
public final class class81 extends class217 {

    @ObfuscatedName("ck.c")
    public static class218 field1262 = new class218();

    @ObfuscatedName("ck.i")
    public int field1266;

    @ObfuscatedName("ck.o")
    public int field1265;

    @ObfuscatedName("ck.j")
    public int field1256;

    @ObfuscatedName("ck.k")
    public int field1257;

    @ObfuscatedName("ck.x")
    public int field1258;

    @ObfuscatedName("ck.z")
    public int field1259;

    @ObfuscatedName("ck.p")
    public int field1260;

    @ObfuscatedName("ck.w")
    public class116 field1261;

    @ObfuscatedName("ck.r")
    public class283 field1253;

    @ObfuscatedName("ck.d")
    public int field1267;

    @ObfuscatedName("ck.a")
    public int field1263;

    @ObfuscatedName("ck.e")
    public int[] field1264;

    @ObfuscatedName("ck.f")
    public int field1254;

    @ObfuscatedName("ck.l")
    public class116 field1255;

    @ObfuscatedName("eh.i(B)V")
    public static void method2925() {
        for (class81 var0 = (class81) field1262.method3723(); var0 != null; var0 = (class81) field1262.method3722()) {
            if (var0.field1253 != null) {
                var0.method1596();
            }
        }
    }

    @ObfuscatedName("ck.o(I)V")
    public void method1596() {
        int var1 = this.field1260;
        class283 var2 = this.field1253.method4635();
        if (var2 == null) {
            this.field1260 = -1;
            this.field1259 = 0;
            this.field1267 = 0;
            this.field1263 = 0;
            this.field1264 = null;
        } else {
            this.field1260 = var2.field3631;
            this.field1259 = var2.field3623 * 128;
            this.field1267 = var2.field3590;
            this.field1263 = var2.field3634;
            this.field1264 = var2.field3635;
        }
        if (this.field1260 != var1 && this.field1261 != null) {
            Statics.field633.method1910(this.field1261);
            this.field1261 = null;
        }
    }

    @ObfuscatedName("ai.j(IIILjj;IB)V")
    public static void method256(int arg0, int arg1, int arg2, class283 arg3, int arg4) {
        class81 var5 = new class81();
        var5.field1266 = arg0;
        var5.field1265 = arg1 * 128;
        var5.field1256 = arg2 * 128;
        int var6 = arg3.field3602;
        int var7 = arg3.field3603;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field3603;
            var7 = arg3.field3602;
        }
        var5.field1257 = (arg1 + var6) * 128;
        var5.field1258 = (arg2 + var7) * 128;
        var5.field1260 = arg3.field3631;
        var5.field1259 = arg3.field3623 * 128;
        var5.field1267 = arg3.field3590;
        var5.field1263 = arg3.field3634;
        var5.field1264 = arg3.field3635;
        if (arg3.field3628 != null) {
            var5.field1253 = arg3;
            var5.method1596();
        }
        field1262.method3716(var5);
        if (var5.field1264 != null) {
            var5.field1254 = var5.field1267 + (int) (Math.random() * (double) (var5.field1263 - var5.field1267));
        }
    }
}

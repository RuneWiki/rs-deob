package deob;

@ObfuscatedName("cp")
public final class class81 extends class193 {

    @ObfuscatedName("cp.w")
    public static class194 field1324 = new class194();

    @ObfuscatedName("cp.s")
    public int field1321;

    @ObfuscatedName("cp.q")
    public int field1313;

    @ObfuscatedName("cp.o")
    public int field1314;

    @ObfuscatedName("cp.g")
    public int field1315;

    @ObfuscatedName("cp.v")
    public int field1316;

    @ObfuscatedName("cp.p")
    public int field1317;

    @ObfuscatedName("cp.e")
    public int field1312;

    @ObfuscatedName("cp.d")
    public int field1319;

    @ObfuscatedName("cp.x")
    public class116 field1318;

    @ObfuscatedName("cp.z")
    public int field1322;

    @ObfuscatedName("cp.n")
    public int[] field1320;

    @ObfuscatedName("cp.u")
    public int field1323;

    @ObfuscatedName("cp.t")
    public class116 field1325;

    @ObfuscatedName("cp.a")
    public class256 field1326;

    @ObfuscatedName("af.w(I)V")
    public static void method205() {
        for (class81 var0 = (class81) field1324.method3427(); var0 != null; var0 = (class81) field1324.method3435()) {
            if (var0.field1318 != null) {
                Statics.field279.method1780(var0.field1318);
                var0.field1318 = null;
            }
            if (var0.field1325 != null) {
                Statics.field279.method1780(var0.field1325);
                var0.field1325 = null;
            }
        }
        field1324.method3428();
    }

    @ObfuscatedName("cp.s(B)V")
    public void method1487() {
        int var1 = this.field1319;
        class256 var2 = this.field1326.method4279();
        if (var2 == null) {
            this.field1319 = -1;
            this.field1312 = 0;
            this.field1321 = 0;
            this.field1322 = 0;
            this.field1320 = null;
        } else {
            this.field1319 = var2.field3480;
            this.field1312 = var2.field3481 * 128;
            this.field1321 = var2.field3444;
            this.field1322 = var2.field3459;
            this.field1320 = var2.field3484;
        }
        if (this.field1319 != var1 && this.field1318 != null) {
            Statics.field279.method1780(this.field1318);
            this.field1318 = null;
        }
    }
}

package deob;

@ObfuscatedName("cu")
public final class class81 extends class193 {

    @ObfuscatedName("cu.d")
    public static class194 field1325 = new class194();

    @ObfuscatedName("cu.k")
    public int field1313;

    @ObfuscatedName("cu.e")
    public int field1312;

    @ObfuscatedName("cu.p")
    public int field1327;

    @ObfuscatedName("cu.q")
    public int field1320;

    @ObfuscatedName("cu.s")
    public int field1321;

    @ObfuscatedName("cu.r")
    public class256 field1326;

    @ObfuscatedName("cu.g")
    public int field1317;

    @ObfuscatedName("cu.v")
    public int field1318;

    @ObfuscatedName("cu.t")
    public int field1319;

    @ObfuscatedName("cu.y")
    public class116 field1314;

    @ObfuscatedName("cu.o")
    public int field1322;

    @ObfuscatedName("cu.i")
    public int[] field1323;

    @ObfuscatedName("cu.u")
    public int field1324;

    @ObfuscatedName("cu.b")
    public class116 field1316;

    @ObfuscatedName("ae.d(I)V")
    public static void method186() {
        for (class81 var0 = (class81) field1325.method3409(); var0 != null; var0 = (class81) field1325.method3429()) {
            if (var0.field1326 != null) {
                var0.method1523();
            }
        }
    }

    @ObfuscatedName("cu.k(I)V")
    public void method1523() {
        int var1 = this.field1319;
        class256 var2 = this.field1326.method4300();
        if (var2 == null) {
            this.field1319 = -1;
            this.field1318 = 0;
            this.field1321 = 0;
            this.field1322 = 0;
            this.field1323 = null;
        } else {
            this.field1319 = var2.field3483;
            this.field1318 = var2.field3484 * 128;
            this.field1321 = var2.field3446;
            this.field1322 = var2.field3471;
            this.field1323 = var2.field3487;
        }
        if (this.field1319 != var1 && this.field1314 != null) {
            Statics.field1365.method1791(this.field1314);
            this.field1314 = null;
        }
    }
}

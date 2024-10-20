package deob;

@ObfuscatedName("cn")
public final class class83 extends class193 {

    @ObfuscatedName("cn.a")
    public static class194 field1323 = new class194();

    @ObfuscatedName("cn.j")
    public int field1313;

    @ObfuscatedName("cn.n")
    public int field1314;

    @ObfuscatedName("cn.r")
    public class256 field1312;

    @ObfuscatedName("cn.v")
    public int field1315;

    @ObfuscatedName("cn.e")
    public int field1316;

    @ObfuscatedName("cn.l")
    public int field1320;

    @ObfuscatedName("cn.s")
    public int field1321;

    @ObfuscatedName("cn.w")
    public int field1317;

    @ObfuscatedName("cn.p")
    public int field1319;

    @ObfuscatedName("cn.m")
    public class118 field1325;

    @ObfuscatedName("cn.u")
    public int field1318;

    @ObfuscatedName("cn.g")
    public int[] field1326;

    @ObfuscatedName("cn.k")
    public int field1324;

    @ObfuscatedName("cn.t")
    public class118 field1322;

    @ObfuscatedName("g.a(I)V")
    public static void method60() {
        for (class83 var0 = (class83) field1323.method3318(); var0 != null; var0 = (class83) field1323.method3338()) {
            if (var0.field1325 != null) {
                Statics.field2512.method1707(var0.field1325);
                var0.field1325 = null;
            }
            if (var0.field1322 != null) {
                Statics.field2512.method1707(var0.field1322);
                var0.field1322 = null;
            }
        }
        field1323.method3319();
    }

    @ObfuscatedName("cn.j(B)V")
    public void method1432() {
        int var1 = this.field1319;
        class256 var2 = this.field1312.method4144();
        if (var2 == null) {
            this.field1319 = -1;
            this.field1317 = 0;
            this.field1321 = 0;
            this.field1318 = 0;
            this.field1326 = null;
        } else {
            this.field1319 = var2.field3451;
            this.field1317 = var2.field3458 * 128;
            this.field1321 = var2.field3481;
            this.field1318 = var2.field3482;
            this.field1326 = var2.field3479;
        }
        if (this.field1319 != var1 && this.field1325 != null) {
            Statics.field2512.method1707(this.field1325);
            this.field1325 = null;
        }
    }
}

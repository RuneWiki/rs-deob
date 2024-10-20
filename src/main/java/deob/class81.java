package deob;

@ObfuscatedName("ce")
public final class class81 extends class217 {

    @ObfuscatedName("ce.o")
    public static class218 field1264 = new class218();

    @ObfuscatedName("ce.k")
    public int field1260;

    @ObfuscatedName("ce.t")
    public int field1266;

    @ObfuscatedName("ce.d")
    public int field1262;

    @ObfuscatedName("ce.h")
    public int field1270;

    @ObfuscatedName("ce.m")
    public int field1263;

    @ObfuscatedName("ce.z")
    public int field1274;

    @ObfuscatedName("ce.i")
    public int field1265;

    @ObfuscatedName("ce.u")
    public class116 field1267;

    @ObfuscatedName("ce.x")
    public int field1268;

    @ObfuscatedName("ce.y")
    public int field1269;

    @ObfuscatedName("ce.a")
    public int[] field1275;

    @ObfuscatedName("ce.w")
    public int field1271;

    @ObfuscatedName("ce.n")
    public class116 field1272;

    @ObfuscatedName("ce.l")
    public class283 field1273;

    @ObfuscatedName("bn.o(I)V")
    public static void method958() {
        for (class81 var0 = (class81) field1264.method3707(); var0 != null; var0 = (class81) field1264.method3697()) {
            if (var0.field1267 != null) {
                Statics.field728.method1890(var0.field1267);
                var0.field1267 = null;
            }
            if (var0.field1272 != null) {
                Statics.field728.method1890(var0.field1272);
                var0.field1272 = null;
            }
        }
        field1264.method3695();
    }

    @ObfuscatedName("ce.k(I)V")
    public void method1649() {
        int var1 = this.field1265;
        class283 var2 = this.field1273.method4616();
        if (var2 == null) {
            this.field1265 = -1;
            this.field1274 = 0;
            this.field1268 = 0;
            this.field1269 = 0;
            this.field1275 = null;
        } else {
            this.field1265 = var2.field3635;
            this.field1274 = var2.field3636 * 128;
            this.field1268 = var2.field3637;
            this.field1269 = var2.field3616;
            this.field1275 = var2.field3615;
        }
        if (this.field1265 != var1 && this.field1267 != null) {
            Statics.field728.method1890(this.field1267);
            this.field1267 = null;
        }
    }
}

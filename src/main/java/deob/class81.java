package deob;

@ObfuscatedName("cu")
public final class class81 extends class217 {

    @ObfuscatedName("cu.t")
    public static class218 field1241 = new class218();

    @ObfuscatedName("cu.q")
    public int field1238;

    @ObfuscatedName("cu.i")
    public int field1244;

    @ObfuscatedName("cu.a")
    public int field1240;

    @ObfuscatedName("cu.l")
    public int field1250;

    @ObfuscatedName("cu.b")
    public int field1246;

    @ObfuscatedName("cu.e")
    public int field1243;

    @ObfuscatedName("cu.x")
    public int field1242;

    @ObfuscatedName("cu.p")
    public class116 field1245;

    @ObfuscatedName("cu.g")
    public int field1247;

    @ObfuscatedName("cu.n")
    public int field1248;

    @ObfuscatedName("cu.o")
    public int[] field1237;

    @ObfuscatedName("cu.c")
    public int field1249;

    @ObfuscatedName("cu.v")
    public class116 field1239;

    @ObfuscatedName("cu.u")
    public class283 field1251;

    @ObfuscatedName("cu.t(I)V")
    public void method1653() {
        int var1 = this.field1242;
        class283 var2 = this.field1251.method4615();
        if (var2 == null) {
            this.field1242 = -1;
            this.field1243 = 0;
            this.field1247 = 0;
            this.field1248 = 0;
            this.field1237 = null;
        } else {
            this.field1242 = var2.field3639;
            this.field1243 = var2.field3640 * 128;
            this.field1247 = var2.field3626;
            this.field1248 = var2.field3636;
            this.field1237 = var2.field3643;
        }
        if (this.field1242 != var1 && this.field1245 != null) {
            Statics.field3885.method1930(this.field1245);
            this.field1245 = null;
        }
    }
}

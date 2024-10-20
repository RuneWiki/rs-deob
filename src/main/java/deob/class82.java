package deob;

@ObfuscatedName("cl")
public final class class82 extends class204 {

    @ObfuscatedName("cl.n")
    public static class205 field1248 = new class205();

    @ObfuscatedName("cl.v")
    public int field1243;

    @ObfuscatedName("cl.y")
    public int field1253;

    @ObfuscatedName("cl.r")
    public class267 field1256;

    @ObfuscatedName("cl.h")
    public int field1244;

    @ObfuscatedName("cl.d")
    public int field1242;

    @ObfuscatedName("cl.s")
    public int field1255;

    @ObfuscatedName("cl.b")
    public int field1247;

    @ObfuscatedName("cl.e")
    public int field1245;

    @ObfuscatedName("cl.f")
    public int field1249;

    @ObfuscatedName("cl.z")
    public class117 field1250;

    @ObfuscatedName("cl.u")
    public int field1252;

    @ObfuscatedName("cl.p")
    public int[] field1246;

    @ObfuscatedName("cl.w")
    public int field1254;

    @ObfuscatedName("cl.t")
    public class117 field1251;

    @ObfuscatedName("cl.n(I)V")
    public void method1513() {
        int var1 = this.field1249;
        class267 var2 = this.field1256.method4334();
        if (var2 == null) {
            this.field1249 = -1;
            this.field1245 = 0;
            this.field1255 = 0;
            this.field1252 = 0;
            this.field1246 = null;
        } else {
            this.field1249 = var2.field3566;
            this.field1245 = var2.field3567 * 128;
            this.field1255 = var2.field3568;
            this.field1252 = var2.field3569;
            this.field1246 = var2.field3570;
        }
        if (this.field1249 != var1 && this.field1250 != null) {
            Statics.field1329.method1773(this.field1250);
            this.field1250 = null;
        }
    }
}

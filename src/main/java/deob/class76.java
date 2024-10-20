package deob;

@ObfuscatedName("bv")
public final class class76 extends class181 {

    @ObfuscatedName("bv.q")
    public static class262 field1081 = new class262();

    @ObfuscatedName("bv.w")
    public int field1079;

    @ObfuscatedName("bv.e")
    public int field1084;

    @ObfuscatedName("bv.p")
    public int field1091;

    @ObfuscatedName("bv.k")
    public int field1078;

    @ObfuscatedName("bv.l")
    public int field1083;

    @ObfuscatedName("bv.b")
    public int field1092;

    @ObfuscatedName("bv.i")
    public int field1080;

    @ObfuscatedName("bv.c")
    public class114 field1086;

    @ObfuscatedName("bv.f")
    public int field1087;

    @ObfuscatedName("bv.m")
    public int field1082;

    @ObfuscatedName("bv.u")
    public int[] field1089;

    @ObfuscatedName("bv.x")
    public int field1090;

    @ObfuscatedName("bv.r")
    public class254 field1088;

    @ObfuscatedName("bv.v")
    public class114 field1085;

    @ObfuscatedName("bv.q(I)V")
    public void method1656() {
        int var1 = this.field1080;
        class254 var2 = this.field1088.method4212();
        if (var2 == null) {
            this.field1080 = -1;
            this.field1092 = 0;
            this.field1087 = 0;
            this.field1082 = 0;
            this.field1089 = null;
        } else {
            this.field1080 = var2.field3395;
            this.field1092 = var2.field3400 * 128;
            this.field1087 = var2.field3393;
            this.field1082 = var2.field3398;
            this.field1089 = var2.field3368;
        }
        if (this.field1080 != var1 && this.field1086 != null) {
            Statics.field533.method2097(this.field1086);
            this.field1086 = null;
        }
    }

    @ObfuscatedName("cy.w(IIILiy;II)V")
    public static void method1817(int arg0, int arg1, int arg2, class254 arg3, int arg4) {
        class76 var5 = new class76();
        var5.field1079 = arg0;
        var5.field1084 = arg1 * 128;
        var5.field1091 = arg2 * 128;
        int var6 = arg3.field3366;
        int var7 = arg3.field3367;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field3367;
            var7 = arg3.field3366;
        }
        var5.field1078 = (arg1 + var6) * 128;
        var5.field1083 = (arg2 + var7) * 128;
        var5.field1080 = arg3.field3395;
        var5.field1092 = arg3.field3400 * 128;
        var5.field1087 = arg3.field3393;
        var5.field1082 = arg3.field3398;
        var5.field1089 = arg3.field3368;
        if (arg3.field3392 != null) {
            var5.field1088 = arg3;
            var5.method1656();
        }
        field1081.method4532(var5);
        if (var5.field1089 != null) {
            var5.field1090 = var5.field1087 + (int) (Math.random() * (double) (var5.field1082 - var5.field1087));
        }
    }
}

package deob;

@ObfuscatedName("cm")
public final class class85 extends class190 {

    @ObfuscatedName("cm.x")
    public int field1099;

    @ObfuscatedName("cm.m")
    public static class272 field1098 = new class272();

    @ObfuscatedName("cm.k")
    public int field1097;

    @ObfuscatedName("cm.d")
    public int field1100;

    @ObfuscatedName("cm.w")
    public int field1111;

    @ObfuscatedName("cm.v")
    public int field1101;

    @ObfuscatedName("cm.q")
    public int field1107;

    @ObfuscatedName("cm.z")
    public int field1103;

    @ObfuscatedName("cm.t")
    public class123 field1109;

    @ObfuscatedName("cm.e")
    public int field1105;

    @ObfuscatedName("cm.s")
    public int field1106;

    @ObfuscatedName("cm.p")
    public int[] field1096;

    @ObfuscatedName("cm.n")
    public int field1108;

    @ObfuscatedName("cm.u")
    public class123 field1104;

    @ObfuscatedName("cm.h")
    public class264 field1110;

    @ObfuscatedName("kv.x(I)V")
    public static void method4838() {
        for (class85 var0 = (class85) field1098.method4559(); var0 != null; var0 = (class85) field1098.method4577()) {
            if (var0.field1109 != null) {
                Statics.field554.method2196(var0.field1109);
                var0.field1109 = null;
            }
            if (var0.field1104 != null) {
                Statics.field554.method2196(var0.field1104);
                var0.field1104 = null;
            }
        }
        field1098.method4553();
    }

    @ObfuscatedName("cm.m(B)V")
    public void method1839() {
        int var1 = this.field1103;
        class264 var2 = this.field1110.method4277();
        if (var2 == null) {
            this.field1103 = -1;
            this.field1107 = 0;
            this.field1105 = 0;
            this.field1106 = 0;
            this.field1096 = null;
        } else {
            this.field1103 = var2.field3351;
            this.field1107 = var2.field3389 * 128;
            this.field1105 = var2.field3391;
            this.field1106 = var2.field3367;
            this.field1096 = var2.field3393;
        }
        if (this.field1103 != var1 && this.field1109 != null) {
            Statics.field554.method2196(this.field1109);
            this.field1109 = null;
        }
    }
}

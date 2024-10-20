package deob;

@ObfuscatedName("be")
public final class class76 extends class186 {

    @ObfuscatedName("be.m")
    public static class273 field1053 = new class273();

    @ObfuscatedName("be.f")
    public int field1042;

    @ObfuscatedName("be.q")
    public int field1045;

    @ObfuscatedName("be.w")
    public int field1051;

    @ObfuscatedName("be.o")
    public int field1041;

    @ObfuscatedName("be.u")
    public int field1046;

    @ObfuscatedName("be.g")
    public int field1047;

    @ObfuscatedName("be.l")
    public int field1048;

    @ObfuscatedName("be.e")
    public class112 field1052;

    @ObfuscatedName("be.x")
    public int field1050;

    @ObfuscatedName("be.d")
    public int field1049;

    @ObfuscatedName("be.k")
    public int[] field1054;

    @ObfuscatedName("be.n")
    public int field1057;

    @ObfuscatedName("be.i")
    public class112 field1044;

    @ObfuscatedName("be.a")
    public class265 field1055;

    @ObfuscatedName("hp.m(I)V")
    public static void method3996() {
        for (class76 var0 = (class76) field1053.method4856(); var0 != null; var0 = (class76) field1053.method4858()) {
            if (var0.field1052 != null) {
                Statics.field2033.method2074(var0.field1052);
                var0.field1052 = null;
            }
            if (var0.field1044 != null) {
                Statics.field2033.method2074(var0.field1044);
                var0.field1044 = null;
            }
        }
        field1053.method4850();
    }

    @ObfuscatedName("be.f(I)V")
    public void method1705() {
        int var1 = this.field1048;
        class265 var2 = this.field1055.method4601();
        if (var2 == null) {
            this.field1048 = -1;
            this.field1047 = 0;
            this.field1050 = 0;
            this.field1049 = 0;
            this.field1054 = null;
        } else {
            this.field1048 = var2.field3466;
            this.field1047 = var2.field3468 * 128;
            this.field1050 = var2.field3444;
            this.field1049 = var2.field3469;
            this.field1054 = var2.field3427;
        }
        if (this.field1048 != var1 && this.field1052 != null) {
            Statics.field2033.method2074(this.field1052);
            this.field1052 = null;
        }
    }
}

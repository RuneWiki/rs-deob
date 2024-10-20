package deob;

@ObfuscatedName("br")
public final class class76 extends class188 {

    @ObfuscatedName("br.f")
    public static class262 field1057 = new class262();

    @ObfuscatedName("br.i")
    public int field1064;

    @ObfuscatedName("br.y")
    public int field1055;

    @ObfuscatedName("br.w")
    public int field1058;

    @ObfuscatedName("br.p")
    public int field1065;

    @ObfuscatedName("br.b")
    public int field1053;

    @ObfuscatedName("br.e")
    public int field1054;

    @ObfuscatedName("br.x")
    public int field1059;

    @ObfuscatedName("br.a")
    public class112 field1060;

    @ObfuscatedName("br.d")
    public int field1061;

    @ObfuscatedName("br.c")
    public int field1062;

    @ObfuscatedName("br.o")
    public int[] field1063;

    @ObfuscatedName("br.v")
    public int field1056;

    @ObfuscatedName("br.k")
    public class112 field1052;

    @ObfuscatedName("br.s")
    public class254 field1066;

    @ObfuscatedName("z.f(B)V")
    public static void method212() {
        for (class76 var0 = (class76) field1057.method4540(); var0 != null; var0 = (class76) field1057.method4533()) {
            if (var0.field1060 != null) {
                Statics.field509.method2109(var0.field1060);
                var0.field1060 = null;
            }
            if (var0.field1052 != null) {
                Statics.field509.method2109(var0.field1052);
                var0.field1052 = null;
            }
        }
        field1057.method4525();
    }

    @ObfuscatedName("bo.i(I)V")
    public static void method1046() {
        for (class76 var0 = (class76) field1057.method4540(); var0 != null; var0 = (class76) field1057.method4533()) {
            if (var0.field1066 != null) {
                var0.method1737();
            }
        }
    }

    @ObfuscatedName("br.y(I)V")
    public void method1737() {
        int var1 = this.field1059;
        class254 var2 = this.field1066.method4241();
        if (var2 == null) {
            this.field1059 = -1;
            this.field1054 = 0;
            this.field1061 = 0;
            this.field1062 = 0;
            this.field1063 = null;
        } else {
            this.field1059 = var2.field3359;
            this.field1054 = var2.field3348 * 128;
            this.field1061 = var2.field3351;
            this.field1062 = var2.field3361;
            this.field1063 = var2.field3363;
        }
        if (this.field1059 != var1 && this.field1060 != null) {
            Statics.field509.method2109(this.field1060);
            this.field1060 = null;
        }
    }
}

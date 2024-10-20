package deob;

@ObfuscatedName("bp")
public final class class75 extends class212 {

    @ObfuscatedName("bp.n")
    public static class213 field1034 = new class213();

    @ObfuscatedName("bp.h")
    public int field1033;

    @ObfuscatedName("bp.l")
    public int field1044;

    @ObfuscatedName("bp.g")
    public int field1035;

    @ObfuscatedName("bp.b")
    public int field1036;

    @ObfuscatedName("bp.a")
    public int field1046;

    @ObfuscatedName("bp.c")
    public int field1038;

    @ObfuscatedName("bp.z")
    public int field1047;

    @ObfuscatedName("bp.j")
    public class111 field1040;

    @ObfuscatedName("bp.d")
    public int field1032;

    @ObfuscatedName("bp.t")
    public int field1042;

    @ObfuscatedName("bp.f")
    public int[] field1043;

    @ObfuscatedName("bp.i")
    public int field1037;

    @ObfuscatedName("bp.m")
    public class111 field1045;

    @ObfuscatedName("bp.v")
    public class274 field1039;

    @ObfuscatedName("bp.n(B)V")
    public void method1721() {
        int var1 = this.field1047;
        class274 var2 = this.field1039.method4892();
        if (var2 == null) {
            this.field1047 = -1;
            this.field1038 = 0;
            this.field1032 = 0;
            this.field1042 = 0;
            this.field1043 = null;
        } else {
            this.field1047 = var2.field3486;
            this.field1038 = var2.field3485 * 128;
            this.field1032 = var2.field3475;
            this.field1042 = var2.field3487;
            this.field1043 = var2.field3488;
        }
        if (this.field1047 != var1 && this.field1040 != null) {
            Statics.field197.method2117(this.field1040);
            this.field1040 = null;
        }
    }
}

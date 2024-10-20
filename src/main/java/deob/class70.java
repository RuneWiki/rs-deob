package deob;

@ObfuscatedName("be")
public final class class70 extends class207 {

    @ObfuscatedName("be.c")
    public static class208 field1037 = new class208();

    @ObfuscatedName("be.q")
    public int field1033;

    @ObfuscatedName("be.m")
    public int field1034;

    @ObfuscatedName("be.j")
    public int field1035;

    @ObfuscatedName("be.g")
    public int field1036;

    @ObfuscatedName("be.i")
    public int field1046;

    @ObfuscatedName("be.h")
    public int field1042;

    @ObfuscatedName("be.l")
    public int field1039;

    @ObfuscatedName("be.d")
    public class106 field1038;

    @ObfuscatedName("be.o")
    public int field1041;

    @ObfuscatedName("be.s")
    public int field1040;

    @ObfuscatedName("be.k")
    public int[] field1043;

    @ObfuscatedName("be.v")
    public int field1044;

    @ObfuscatedName("be.p")
    public class106 field1045;

    @ObfuscatedName("be.n")
    public class271 field1032;

    @ObfuscatedName("be.c(S)V")
    public void method1578() {
        int var1 = this.field1039;
        class271 var2 = this.field1032.method4668();
        if (var2 == null) {
            this.field1039 = -1;
            this.field1042 = 0;
            this.field1041 = 0;
            this.field1040 = 0;
            this.field1043 = null;
        } else {
            this.field1039 = var2.field3460;
            this.field1042 = var2.field3450 * 128;
            this.field1041 = var2.field3442;
            this.field1040 = var2.field3417;
            this.field1043 = var2.field3464;
        }
        if (this.field1039 != var1 && this.field1038 != null) {
            Statics.field3676.method1869(this.field1038);
            this.field1038 = null;
        }
    }
}

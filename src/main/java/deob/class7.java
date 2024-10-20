package deob;

@ObfuscatedName("m")
public final class class7 extends class181 {

    @ObfuscatedName("m.e")
    public static class179 field115 = new class179();

    @ObfuscatedName("m.i")
    public int field95;

    @ObfuscatedName("m.k")
    public int field96;

    @ObfuscatedName("m.q")
    public int field114;

    @ObfuscatedName("m.j")
    public int field104;

    @ObfuscatedName("m.z")
    public int field99;

    @ObfuscatedName("m.m")
    public int field110;

    @ObfuscatedName("m.w")
    public int field101;

    @ObfuscatedName("m.a")
    public class46 field102;

    @ObfuscatedName("m.d")
    public int field103;

    @ObfuscatedName("m.u")
    public int field113;

    @ObfuscatedName("m.p")
    public int[] field94;

    @ObfuscatedName("m.t")
    public int field100;

    @ObfuscatedName("m.g")
    public class46 field107;

    @ObfuscatedName("m.o")
    public class33 field108;

    @ObfuscatedName("m.e(B)V")
    public void method45() {
        int var1 = this.field101;
        class33 var2 = this.field108.method692();
        if (var2 == null) {
            this.field101 = -1;
            this.field110 = 0;
            this.field103 = 0;
            this.field113 = 0;
            this.field94 = null;
        } else {
            this.field101 = var2.field877;
            this.field110 = var2.field849 * 128;
            this.field103 = var2.field879;
            this.field113 = var2.field880;
            this.field94 = var2.field881;
        }
        if (this.field101 != var1 && this.field102 != null) {
            Statics.field1048.method1149(this.field102);
            this.field102 = null;
        }
    }
}

package deob;

@ObfuscatedName("cl")
public final class class85 extends class190 {

    @ObfuscatedName("cl.f")
    public static class273 field1106 = new class273();

    @ObfuscatedName("cl.b")
    public int field1101;

    @ObfuscatedName("cl.l")
    public int field1102;

    @ObfuscatedName("cl.m")
    public int field1103;

    @ObfuscatedName("cl.z")
    public int field1104;

    @ObfuscatedName("cl.q")
    public int field1113;

    @ObfuscatedName("cl.k")
    public int field1105;

    @ObfuscatedName("cl.c")
    public int field1112;

    @ObfuscatedName("cl.u")
    public class123 field1107;

    @ObfuscatedName("cl.t")
    public int field1108;

    @ObfuscatedName("cl.e")
    public int field1110;

    @ObfuscatedName("cl.o")
    public int[] field1111;

    @ObfuscatedName("cl.n")
    public int field1109;

    @ObfuscatedName("cl.x")
    public class123 field1100;

    @ObfuscatedName("cl.p")
    public class265 field1114;

    @ObfuscatedName("cl.f(I)V")
    public void method1838() {
        int var1 = this.field1112;
        class265 var2 = this.field1114.method4361();
        if (var2 == null) {
            this.field1112 = -1;
            this.field1105 = 0;
            this.field1108 = 0;
            this.field1110 = 0;
            this.field1111 = null;
        } else {
            this.field1112 = var2.field3418;
            this.field1105 = var2.field3376 * 128;
            this.field1108 = var2.field3396;
            this.field1110 = var2.field3400;
            this.field1111 = var2.field3422;
        }
        if (this.field1112 != var1 && this.field1107 != null) {
            Statics.field70.method2225(this.field1107);
            this.field1107 = null;
        }
    }
}

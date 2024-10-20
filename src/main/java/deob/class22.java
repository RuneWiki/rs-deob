package deob;

@ObfuscatedName("t")
public final class class22 extends class199 {

    @ObfuscatedName("t.n")
    public static class190 field577 = new class190();

    @ObfuscatedName("t.w")
    public int field568;

    @ObfuscatedName("t.i")
    public int field570;

    @ObfuscatedName("t.e")
    public int field571;

    @ObfuscatedName("t.h")
    public int field572;

    @ObfuscatedName("t.q")
    public int field585;

    @ObfuscatedName("t.l")
    public int field574;

    @ObfuscatedName("t.c")
    public int field575;

    @ObfuscatedName("t.f")
    public class60 field576;

    @ObfuscatedName("t.s")
    public int field569;

    @ObfuscatedName("t.m")
    public int field583;

    @ObfuscatedName("t.y")
    public int[] field579;

    @ObfuscatedName("t.b")
    public int field580;

    @ObfuscatedName("t.v")
    public class60 field573;

    @ObfuscatedName("t.z")
    public class38 field581;

    @ObfuscatedName("t.n(I)V")
    public void method506() {
        int var1 = this.field575;
        class38 var2 = this.field581.method684();
        if (var2 == null) {
            this.field575 = -1;
            this.field574 = 0;
            this.field569 = 0;
            this.field583 = 0;
            this.field579 = null;
        } else {
            this.field575 = var2.field911;
            this.field574 = var2.field912 * 128;
            this.field569 = var2.field913;
            this.field583 = var2.field914;
            this.field579 = var2.field915;
        }
        if (this.field575 != var1 && this.field576 != null) {
            Statics.field241.method1001(this.field576);
            this.field576 = null;
        }
    }
}

package deob;

@ObfuscatedName("l")
public final class class20 extends class187 {

    @ObfuscatedName("l.g")
    public static class178 field542 = new class178();

    @ObfuscatedName("l.s")
    public int field535;

    @ObfuscatedName("l.h")
    public int field539;

    @ObfuscatedName("l.m")
    public int field534;

    @ObfuscatedName("l.u")
    public int field538;

    @ObfuscatedName("l.j")
    public int field536;

    @ObfuscatedName("l.b")
    public int field537;

    @ObfuscatedName("l.v")
    public int field532;

    @ObfuscatedName("l.y")
    public int field551;

    @ObfuscatedName("l.w")
    public class58 field540;

    @ObfuscatedName("l.x")
    public int field533;

    @ObfuscatedName("l.k")
    public int[] field543;

    @ObfuscatedName("l.o")
    public int field544;

    @ObfuscatedName("l.a")
    public class58 field552;

    @ObfuscatedName("l.f")
    public class36 field546;

    @ObfuscatedName("l.g(I)V")
    public void method498() {
        int var1 = this.field551;
        class36 var2 = this.field546.method660();
        if (var2 == null) {
            this.field551 = -1;
            this.field532 = 0;
            this.field535 = 0;
            this.field533 = 0;
            this.field543 = null;
        } else {
            this.field551 = var2.field873;
            this.field532 = var2.field874 * 128;
            this.field535 = var2.field875;
            this.field533 = var2.field876;
            this.field543 = var2.field877;
        }
        if (this.field551 != var1 && this.field540 != null) {
            Statics.field1060.method954(this.field540);
            this.field540 = null;
        }
    }
}

package deob;

@ObfuscatedName("w")
public final class class7 extends class179 {

    @ObfuscatedName("w.p")
    public static class177 field107 = new class177();

    @ObfuscatedName("w.l")
    public int field85;

    @ObfuscatedName("w.d")
    public int field86;

    @ObfuscatedName("w.x")
    public int field84;

    @ObfuscatedName("w.o")
    public int field105;

    @ObfuscatedName("w.a")
    public int field100;

    @ObfuscatedName("w.w")
    public int field95;

    @ObfuscatedName("w.i")
    public int field91;

    @ObfuscatedName("w.y")
    public class45 field92;

    @ObfuscatedName("w.m")
    public int field93;

    @ObfuscatedName("w.u")
    public int field94;

    @ObfuscatedName("w.s")
    public int[] field88;

    @ObfuscatedName("w.e")
    public int field87;

    @ObfuscatedName("w.r")
    public class32 field98;

    @ObfuscatedName("w.n")
    public class45 field97;

    @ObfuscatedName("w.l(I)V")
    public void method40() {
        int var1 = this.field91;
        class32 var2 = this.field98.method684();
        if (var2 == null) {
            this.field91 = -1;
            this.field95 = 0;
            this.field93 = 0;
            this.field94 = 0;
            this.field88 = null;
        } else {
            this.field91 = var2.field833;
            this.field95 = var2.field840 * 128;
            this.field93 = var2.field813;
            this.field94 = var2.field839;
            this.field88 = var2.field843;
        }
        if (this.field91 != var1 && this.field92 != null) {
            Statics.field2522.method1158(this.field92);
            this.field92 = null;
        }
    }
}

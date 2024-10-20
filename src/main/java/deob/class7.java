package deob;

@ObfuscatedName("x")
public final class class7 extends class179 {

    @ObfuscatedName("x.y")
    public static class177 field103 = new class177();

    @ObfuscatedName("x.m")
    public int field88;

    @ObfuscatedName("x.d")
    public int field89;

    @ObfuscatedName("x.k")
    public int field91;

    @ObfuscatedName("x.n")
    public int field97;

    @ObfuscatedName("x.s")
    public int field95;

    @ObfuscatedName("x.x")
    public int field96;

    @ObfuscatedName("x.b")
    public int field92;

    @ObfuscatedName("x.j")
    public int field94;

    @ObfuscatedName("x.p")
    public class45 field102;

    @ObfuscatedName("x.l")
    public int field100;

    @ObfuscatedName("x.i")
    public int[] field98;

    @ObfuscatedName("x.r")
    public class32 field101;

    @ObfuscatedName("x.o")
    public int field99;

    @ObfuscatedName("x.c")
    public class45 field87;

    @ObfuscatedName("n.y(I)V")
    public static void method38() {
        for (class7 var0 = (class7) field103.method3355(); var0 != null; var0 = (class7) field103.method3357()) {
            if (var0.field102 != null) {
                Statics.field11.method1119(var0.field102);
                var0.field102 = null;
            }
            if (var0.field87 != null) {
                Statics.field11.method1119(var0.field87);
                var0.field87 = null;
            }
        }
        field103.method3349();
    }

    @ObfuscatedName("x.m(I)V")
    public void method43() {
        int var1 = this.field94;
        class32 var2 = this.field101.method684();
        if (var2 == null) {
            this.field94 = -1;
            this.field92 = 0;
            this.field95 = 0;
            this.field100 = 0;
            this.field98 = null;
        } else {
            this.field94 = var2.field841;
            this.field92 = var2.field842 * 128;
            this.field95 = var2.field843;
            this.field100 = var2.field844;
            this.field98 = var2.field808;
        }
        if (this.field94 != var1 && this.field102 != null) {
            Statics.field11.method1119(this.field102);
            this.field102 = null;
        }
    }
}

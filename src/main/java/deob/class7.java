package deob;

@ObfuscatedName("s")
public final class class7 extends class179 {

    @ObfuscatedName("s.g")
    public static class177 field100 = new class177();

    @ObfuscatedName("s.m")
    public int field99;

    @ObfuscatedName("s.v")
    public int field88;

    @ObfuscatedName("s.r")
    public class32 field102;

    @ObfuscatedName("s.n")
    public int field89;

    @ObfuscatedName("s.i")
    public int field90;

    @ObfuscatedName("s.s")
    public int field86;

    @ObfuscatedName("s.w")
    public int field91;

    @ObfuscatedName("s.d")
    public int field93;

    @ObfuscatedName("s.t")
    public int field103;

    @ObfuscatedName("s.f")
    public class45 field94;

    @ObfuscatedName("s.b")
    public int field95;

    @ObfuscatedName("s.z")
    public int[] field97;

    @ObfuscatedName("s.l")
    public int field98;

    @ObfuscatedName("s.e")
    public class45 field101;

    @ObfuscatedName("cy.g(B)V")
    public static void method1847() {
        for (class7 var0 = (class7) field100.method3321(); var0 != null; var0 = (class7) field100.method3323()) {
            if (var0.field94 != null) {
                Statics.field766.method1104(var0.field94);
                var0.field94 = null;
            }
            if (var0.field101 != null) {
                Statics.field766.method1104(var0.field101);
                var0.field101 = null;
            }
        }
        field100.method3315();
    }

    @ObfuscatedName("s.m(I)V")
    public void method49() {
        int var1 = this.field103;
        class32 var2 = this.field102.method638();
        if (var2 == null) {
            this.field103 = -1;
            this.field93 = 0;
            this.field86 = 0;
            this.field95 = 0;
            this.field97 = null;
        } else {
            this.field103 = var2.field824;
            this.field93 = var2.field850 * 128;
            this.field86 = var2.field851;
            this.field95 = var2.field849;
            this.field97 = var2.field810;
        }
        if (this.field103 != var1 && this.field94 != null) {
            Statics.field766.method1104(this.field94);
            this.field94 = null;
        }
    }
}

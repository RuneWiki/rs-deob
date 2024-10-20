package deob;

@ObfuscatedName("br")
public final class class67 extends class433 {

    @ObfuscatedName("br.h")
    public static class352 field849 = new class352();

    @ObfuscatedName("br.e")
    public int field845;

    @ObfuscatedName("br.v")
    public int field841;

    @ObfuscatedName("br.x")
    public int field839;

    @ObfuscatedName("br.m")
    public int field842;

    @ObfuscatedName("br.q")
    public int field844;

    @ObfuscatedName("br.f")
    public int field848;

    @ObfuscatedName("br.r")
    public class196 field853;

    @ObfuscatedName("br.u")
    public int field846;

    @ObfuscatedName("br.b")
    public class49 field847;

    @ObfuscatedName("br.j")
    public int field843;

    @ObfuscatedName("br.g")
    public int field840;

    @ObfuscatedName("br.i")
    public int[] field850;

    @ObfuscatedName("br.o")
    public int field851;

    @ObfuscatedName("br.n")
    public class49 field852;

    @ObfuscatedName("dl.h(B)V")
    public static void method2628() {
        for (class67 var0 = (class67) field849.method6086(); var0 != null; var0 = (class67) field849.method6088()) {
            if (var0.field847 != null) {
                Statics.field498.method708(var0.field847);
                var0.field847 = null;
            }
            if (var0.field852 != null) {
                Statics.field498.method708(var0.field852);
                var0.field852 = null;
            }
        }
        field849.method6092();
    }

    @ObfuscatedName("ce.e(I)V")
    public static void method2399() {
        for (class67 var0 = (class67) field849.method6086(); var0 != null; var0 = (class67) field849.method6088()) {
            if (var0.field853 != null) {
                var0.method1757();
            }
        }
    }

    @ObfuscatedName("br.v(I)V")
    public void method1757() {
        int var1 = this.field846;
        class196 var2 = this.field853.method3560();
        if (var2 == null) {
            this.field846 = -1;
            this.field848 = 0;
            this.field843 = 0;
            this.field840 = 0;
            this.field850 = null;
        } else {
            this.field846 = var2.field2201;
            this.field848 = var2.field2182 * 128;
            this.field843 = var2.field2199;
            this.field840 = var2.field2200;
            this.field850 = var2.field2161;
        }
        if (this.field846 != var1 && this.field847 != null) {
            Statics.field498.method708(this.field847);
            this.field847 = null;
        }
    }
}

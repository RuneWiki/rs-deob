package deob;

@ObfuscatedName("g")
public final class class7 extends class179 {

    @ObfuscatedName("g.i")
    public static class177 field101 = new class177();

    @ObfuscatedName("g.v")
    public int field99;

    @ObfuscatedName("g.m")
    public int field119;

    @ObfuscatedName("g.j")
    public int field100;

    @ObfuscatedName("g.o")
    public int field102;

    @ObfuscatedName("g.l")
    public int field103;

    @ObfuscatedName("g.g")
    public int field104;

    @ObfuscatedName("g.w")
    public int field105;

    @ObfuscatedName("g.c")
    public class45 field106;

    @ObfuscatedName("g.z")
    public int field121;

    @ObfuscatedName("g.f")
    public int field108;

    @ObfuscatedName("g.a")
    public int[] field109;

    @ObfuscatedName("g.d")
    public int field118;

    @ObfuscatedName("g.e")
    public class45 field107;

    @ObfuscatedName("g.y")
    public class32 field111;

    @ObfuscatedName("j.i(B)V")
    public static void method25() {
        for (class7 var0 = (class7) field101.method3369(); var0 != null; var0 = (class7) field101.method3371()) {
            if (var0.field111 != null) {
                var0.method45();
            }
        }
    }

    @ObfuscatedName("g.v(B)V")
    public void method45() {
        int var1 = this.field105;
        class32 var2 = this.field111.method668();
        if (var2 == null) {
            this.field105 = -1;
            this.field104 = 0;
            this.field121 = 0;
            this.field108 = 0;
            this.field109 = null;
        } else {
            this.field105 = var2.field871;
            this.field104 = var2.field868 * 128;
            this.field121 = var2.field839;
            this.field108 = var2.field837;
            this.field109 = var2.field873;
        }
        if (this.field105 != var1 && this.field106 != null) {
            Statics.field55.method1133(this.field106);
            this.field106 = null;
        }
    }
}

package deob;

@ObfuscatedName("o")
public final class class7 extends class179 {

    @ObfuscatedName("o.a")
    public static class177 field86 = new class177();

    @ObfuscatedName("o.x")
    public int field87;

    @ObfuscatedName("o.e")
    public int field85;

    @ObfuscatedName("o.r")
    public class32 field102;

    @ObfuscatedName("o.p")
    public int field106;

    @ObfuscatedName("o.n")
    public int field88;

    @ObfuscatedName("o.o")
    public int field89;

    @ObfuscatedName("o.l")
    public int field107;

    @ObfuscatedName("o.t")
    public int field91;

    @ObfuscatedName("o.q")
    public class45 field92;

    @ObfuscatedName("o.c")
    public int field93;

    @ObfuscatedName("o.z")
    public int field94;

    @ObfuscatedName("o.s")
    public int[] field95;

    @ObfuscatedName("o.h")
    public int field96;

    @ObfuscatedName("o.f")
    public class45 field97;

    @ObfuscatedName("ay.a(I)V")
    public static void method572() {
        for (class7 var0 = (class7) field86.method3252(); var0 != null; var0 = (class7) field86.method3268()) {
            if (var0.field92 != null) {
                Statics.field258.method1095(var0.field92);
                var0.field92 = null;
            }
            if (var0.field97 != null) {
                Statics.field258.method1095(var0.field97);
                var0.field97 = null;
            }
        }
        field86.method3266();
    }

    @ObfuscatedName("o.x(B)V")
    public void method47() {
        int var1 = this.field91;
        class32 var2 = this.field102.method652();
        if (var2 == null) {
            this.field91 = -1;
            this.field107 = 0;
            this.field93 = 0;
            this.field94 = 0;
            this.field95 = null;
        } else {
            this.field91 = var2.field866;
            this.field107 = var2.field833 * 128;
            this.field93 = var2.field826;
            this.field94 = var2.field868;
            this.field95 = var2.field854;
        }
        if (this.field91 != var1 && this.field92 != null) {
            Statics.field258.method1095(this.field92);
            this.field92 = null;
        }
    }
}

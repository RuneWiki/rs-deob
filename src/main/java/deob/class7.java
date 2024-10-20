package deob;

@ObfuscatedName("q")
public final class class7 extends class179 {

    @ObfuscatedName("q.j")
    public static class177 field101 = new class177();

    @ObfuscatedName("q.f")
    public int field88;

    @ObfuscatedName("q.o")
    public int field89;

    @ObfuscatedName("q.h")
    public int field107;

    @ObfuscatedName("q.u")
    public int field91;

    @ObfuscatedName("q.a")
    public int field92;

    @ObfuscatedName("q.q")
    public int field93;

    @ObfuscatedName("q.t")
    public int field94;

    @ObfuscatedName("q.n")
    public class45 field95;

    @ObfuscatedName("q.i")
    public int field96;

    @ObfuscatedName("q.c")
    public int field90;

    @ObfuscatedName("q.b")
    public int[] field98;

    @ObfuscatedName("q.m")
    public int field99;

    @ObfuscatedName("q.g")
    public class45 field100;

    @ObfuscatedName("q.x")
    public class32 field97;

    @ObfuscatedName("c.j(I)V")
    public static void method117() {
        for (class7 var0 = (class7) field101.method3338(); var0 != null; var0 = (class7) field101.method3323()) {
            if (var0.field95 != null) {
                Statics.field1999.method1108(var0.field95);
                var0.field95 = null;
            }
            if (var0.field100 != null) {
                Statics.field1999.method1108(var0.field100);
                var0.field100 = null;
            }
        }
        field101.method3340();
    }

    @ObfuscatedName("q.f(B)V")
    public void method47() {
        int var1 = this.field94;
        class32 var2 = this.field97.method660();
        if (var2 == null) {
            this.field94 = -1;
            this.field93 = 0;
            this.field96 = 0;
            this.field90 = 0;
            this.field98 = null;
        } else {
            this.field94 = var2.field827;
            this.field93 = var2.field840 * 128;
            this.field96 = var2.field848;
            this.field90 = var2.field849;
            this.field98 = var2.field830;
        }
        if (this.field94 != var1 && this.field95 != null) {
            Statics.field1999.method1108(this.field95);
            this.field95 = null;
        }
    }
}

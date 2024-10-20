package deob;

@ObfuscatedName("bj")
public final class class63 extends class411 {

    @ObfuscatedName("bj.o")
    public static class335 field815 = new class335();

    @ObfuscatedName("bj.q")
    public int field806;

    @ObfuscatedName("bj.l")
    public int field807;

    @ObfuscatedName("bj.k")
    public int field808;

    @ObfuscatedName("bj.a")
    public int field817;

    @ObfuscatedName("bj.m")
    public int field810;

    @ObfuscatedName("bj.p")
    public int field818;

    @ObfuscatedName("bj.s")
    public int field814;

    @ObfuscatedName("bj.r")
    public class188 field819;

    @ObfuscatedName("bj.v")
    public int field812;

    @ObfuscatedName("bj.y")
    public class45 field813;

    @ObfuscatedName("bj.c")
    public int field809;

    @ObfuscatedName("bj.w")
    public int[] field816;

    @ObfuscatedName("bj.b")
    public int field811;

    @ObfuscatedName("bj.t")
    public class45 field805;

    @ObfuscatedName("cu.o(I)V")
    public static void method2331() {
        for (class63 var0 = (class63) field815.method5431(); var0 != null; var0 = (class63) field815.method5419()) {
            if (var0.field813 != null) {
                Statics.field1539.method597(var0.field813);
                var0.field813 = null;
            }
            if (var0.field805 != null) {
                Statics.field1539.method597(var0.field805);
                var0.field805 = null;
            }
        }
        field815.method5412();
    }

    @ObfuscatedName("bj.q(I)V")
    public void method1633() {
        int var1 = this.field812;
        class188 var2 = this.field819.method3299();
        if (var2 == null) {
            this.field812 = -1;
            this.field818 = 0;
            this.field814 = 0;
            this.field809 = 0;
            this.field816 = null;
        } else {
            this.field812 = var2.field2124;
            this.field818 = var2.field2125 * 128;
            this.field814 = var2.field2126;
            this.field809 = var2.field2105;
            this.field816 = var2.field2128;
        }
        if (this.field812 != var1 && this.field813 != null) {
            Statics.field1539.method597(this.field813);
            this.field813 = null;
        }
    }
}

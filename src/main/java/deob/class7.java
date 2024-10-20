package deob;

@ObfuscatedName("z")
public final class class7 extends class180 {

    @ObfuscatedName("z.l")
    public static class178 field91 = new class178();

    @ObfuscatedName("z.b")
    public int field81;

    @ObfuscatedName("z.o")
    public int field95;

    @ObfuscatedName("z.w")
    public int field83;

    @ObfuscatedName("z.r")
    public class32 field94;

    @ObfuscatedName("z.k")
    public int field84;

    @ObfuscatedName("z.z")
    public int field93;

    @ObfuscatedName("z.g")
    public int field86;

    @ObfuscatedName("z.n")
    public int field87;

    @ObfuscatedName("z.j")
    public class45 field92;

    @ObfuscatedName("z.c")
    public int field89;

    @ObfuscatedName("z.m")
    public int field90;

    @ObfuscatedName("z.a")
    public int[] field82;

    @ObfuscatedName("z.e")
    public int field80;

    @ObfuscatedName("z.q")
    public class45 field85;

    @ObfuscatedName("n.l(I)V")
    public static void method106() {
        for (class7 var0 = (class7) field91.method3343(); var0 != null; var0 = (class7) field91.method3328()) {
            if (var0.field94 != null) {
                var0.method39();
            }
        }
    }

    @ObfuscatedName("z.b(I)V")
    public void method39() {
        int var1 = this.field87;
        class32 var2 = this.field94.method639();
        if (var2 == null) {
            this.field87 = -1;
            this.field86 = 0;
            this.field89 = 0;
            this.field90 = 0;
            this.field82 = null;
        } else {
            this.field87 = var2.field836;
            this.field86 = var2.field849 * 128;
            this.field89 = var2.field850;
            this.field90 = var2.field846;
            this.field82 = var2.field832;
        }
        if (this.field87 != var1 && this.field92 != null) {
            Statics.field276.method1102(this.field92);
            this.field92 = null;
        }
    }

    @ObfuscatedName("d.o(IIILay;IB)V")
    public static void method176(int arg0, int arg1, int arg2, class32 arg3, int arg4) {
        class7 var5 = new class7();
        var5.field81 = arg0;
        var5.field95 = arg1 * 128;
        var5.field83 = arg2 * 128;
        int var6 = arg3.field819;
        int var7 = arg3.field820;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field820;
            var7 = arg3.field819;
        }
        var5.field84 = (arg1 + var6) * 128;
        var5.field93 = (arg2 + var7) * 128;
        var5.field87 = arg3.field836;
        var5.field86 = arg3.field849 * 128;
        var5.field89 = arg3.field850;
        var5.field90 = arg3.field846;
        var5.field82 = arg3.field832;
        if (arg3.field845 != null) {
            var5.field94 = arg3;
            var5.method39();
        }
        field91.method3321(var5);
        if (var5.field82 != null) {
            var5.field80 = var5.field89 + (int) (Math.random() * (double) (var5.field90 - var5.field89));
        }
    }
}

package deob;

@ObfuscatedName("bx")
public final class class63 extends class409 {

    @ObfuscatedName("bx.v")
    public static class335 field814 = new class335();

    @ObfuscatedName("bx.c")
    public int field816;

    @ObfuscatedName("bx.i")
    public int field812;

    @ObfuscatedName("bx.f")
    public int field813;

    @ObfuscatedName("bx.b")
    public int field817;

    @ObfuscatedName("bx.n")
    public int field820;

    @ObfuscatedName("bx.s")
    public int field819;

    @ObfuscatedName("bx.l")
    public int field815;

    @ObfuscatedName("bx.q")
    public int field810;

    @ObfuscatedName("bx.o")
    public class43 field818;

    @ObfuscatedName("bx.r")
    public class188 field824;

    @ObfuscatedName("bx.p")
    public int field811;

    @ObfuscatedName("bx.w")
    public int[] field821;

    @ObfuscatedName("bx.k")
    public int field822;

    @ObfuscatedName("bx.d")
    public class43 field823;

    @ObfuscatedName("ca.v(I)V")
    public static void method2155() {
        for (class63 var0 = (class63) field814.method5540(); var0 != null; var0 = (class63) field814.method5534()) {
            if (var0.field818 != null) {
                Statics.field1985.method637(var0.field818);
                var0.field818 = null;
            }
            if (var0.field823 != null) {
                Statics.field1985.method637(var0.field823);
                var0.field823 = null;
            }
        }
        field814.method5526();
    }

    @ObfuscatedName("bx.c(I)V")
    public void method1664() {
        int var1 = this.field810;
        class188 var2 = this.field824.method3333();
        if (var2 == null) {
            this.field810 = -1;
            this.field815 = 0;
            this.field819 = 0;
            this.field811 = 0;
            this.field821 = null;
        } else {
            this.field810 = var2.field2059;
            this.field815 = var2.field2060 * 128;
            this.field819 = var2.field2020;
            this.field811 = var2.field2058;
            this.field821 = var2.field2063;
        }
        if (this.field810 != var1 && this.field818 != null) {
            Statics.field1985.method637(this.field818);
            this.field818 = null;
        }
    }

    @ObfuscatedName("ml.i(IIILgj;II)V")
    public static void method5995(int arg0, int arg1, int arg2, class188 arg3, int arg4) {
        class63 var5 = new class63();
        var5.field816 = arg0;
        var5.field812 = arg1 * 128;
        var5.field813 = arg2 * 128;
        int var6 = arg3.field2031;
        int var7 = arg3.field2057;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field2057;
            var7 = arg3.field2031;
        }
        var5.field817 = (arg1 + var6) * 128;
        var5.field820 = (arg2 + var7) * 128;
        var5.field810 = arg3.field2059;
        var5.field815 = arg3.field2060 * 128;
        var5.field819 = arg3.field2020;
        var5.field811 = arg3.field2058;
        var5.field821 = arg3.field2063;
        if (arg3.field2062 != null) {
            var5.field824 = arg3;
            var5.method1664();
        }
        field814.method5530(var5);
        if (var5.field821 != null) {
            var5.field822 = var5.field819 + (int) (Math.random() * (double) (var5.field811 - var5.field819));
        }
    }
}

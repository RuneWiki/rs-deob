package deob;

@ObfuscatedName("be")
public final class class63 extends class369 {

    @ObfuscatedName("be.n")
    public static class309 field797 = new class309();

    @ObfuscatedName("be.c")
    public int field798;

    @ObfuscatedName("be.m")
    public int field799;

    @ObfuscatedName("be.k")
    public int field800;

    @ObfuscatedName("be.o")
    public int field807;

    @ObfuscatedName("be.g")
    public int field802;

    @ObfuscatedName("be.z")
    public int field805;

    @ObfuscatedName("be.a")
    public int field804;

    @ObfuscatedName("be.u")
    public class43 field811;

    @ObfuscatedName("be.e")
    public int field806;

    @ObfuscatedName("be.l")
    public int field801;

    @ObfuscatedName("be.y")
    public int[] field803;

    @ObfuscatedName("be.v")
    public int field809;

    @ObfuscatedName("be.f")
    public class43 field810;

    @ObfuscatedName("be.s")
    public class169 field813;

    @ObfuscatedName("as.n(I)V")
    public static void method604() {
        for (class63 var0 = (class63) field797.method4962(); var0 != null; var0 = (class63) field797.method4985()) {
            if (var0.field813 != null) {
                var0.method1638();
            }
        }
    }

    @ObfuscatedName("be.c(I)V")
    public void method1638() {
        int var1 = this.field804;
        class169 var2 = this.field813.method2895();
        if (var2 == null) {
            this.field804 = -1;
            this.field805 = 0;
            this.field806 = 0;
            this.field801 = 0;
            this.field803 = null;
        } else {
            this.field804 = var2.field1868;
            this.field805 = var2.field1865 * 128;
            this.field806 = var2.field1866;
            this.field801 = var2.field1867;
            this.field803 = var2.field1872;
        }
        if (this.field804 != var1 && this.field811 != null) {
            Statics.field2965.method608(this.field811);
            this.field811 = null;
        }
    }

    @ObfuscatedName("a.m(IIILff;IS)V")
    public static void method62(int arg0, int arg1, int arg2, class169 arg3, int arg4) {
        class63 var5 = new class63();
        var5.field798 = arg0;
        var5.field799 = arg1 * 128;
        var5.field800 = arg2 * 128;
        int var6 = arg3.field1835;
        int var7 = arg3.field1836;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field1836;
            var7 = arg3.field1835;
        }
        var5.field807 = (arg1 + var6) * 128;
        var5.field802 = (arg2 + var7) * 128;
        var5.field804 = arg3.field1868;
        var5.field805 = arg3.field1865 * 128;
        var5.field806 = arg3.field1866;
        var5.field801 = arg3.field1867;
        var5.field803 = arg3.field1872;
        if (arg3.field1861 != null) {
            var5.field813 = arg3;
            var5.method1638();
        }
        field797.method4986(var5);
        if (var5.field803 != null) {
            var5.field809 = var5.field806 + (int) (Math.random() * (double) (var5.field801 - var5.field806));
        }
    }
}

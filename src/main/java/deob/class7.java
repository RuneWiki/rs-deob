package deob;

@ObfuscatedName("k")
public final class class7 extends class179 {

    @ObfuscatedName("k.g")
    public static class177 field109 = new class177();

    @ObfuscatedName("k.h")
    public int field96;

    @ObfuscatedName("k.s")
    public int field111;

    @ObfuscatedName("k.o")
    public int field97;

    @ObfuscatedName("k.p")
    public int field98;

    @ObfuscatedName("k.x")
    public int field99;

    @ObfuscatedName("k.k")
    public int field100;

    @ObfuscatedName("k.r")
    public class32 field112;

    @ObfuscatedName("k.z")
    public int field101;

    @ObfuscatedName("k.n")
    public int field95;

    @ObfuscatedName("k.j")
    public class45 field104;

    @ObfuscatedName("k.b")
    public int field102;

    @ObfuscatedName("k.t")
    public int[] field106;

    @ObfuscatedName("k.q")
    public int field105;

    @ObfuscatedName("k.e")
    public class45 field108;

    @ObfuscatedName("t.g(I)V")
    public static void method149() {
        for (class7 var0 = (class7) field109.method3373(); var0 != null; var0 = (class7) field109.method3375()) {
            if (var0.field104 != null) {
                Statics.field1284.method1123(var0.field104);
                var0.field104 = null;
            }
            if (var0.field108 != null) {
                Statics.field1284.method1123(var0.field108);
                var0.field108 = null;
            }
        }
        field109.method3382();
    }

    @ObfuscatedName("i.h(S)V")
    public static void method235() {
        for (class7 var0 = (class7) field109.method3373(); var0 != null; var0 = (class7) field109.method3375()) {
            if (var0.field112 != null) {
                var0.method54();
            }
        }
    }

    @ObfuscatedName("k.s(I)V")
    public void method54() {
        int var1 = this.field95;
        class32 var2 = this.field112.method656();
        if (var2 == null) {
            this.field95 = -1;
            this.field101 = 0;
            this.field111 = 0;
            this.field102 = 0;
            this.field106 = null;
        } else {
            this.field95 = var2.field861;
            this.field101 = var2.field862 * 128;
            this.field111 = var2.field858;
            this.field102 = var2.field849;
            this.field106 = var2.field865;
        }
        if (this.field95 != var1 && this.field104 != null) {
            Statics.field1284.method1123(this.field104);
            this.field104 = null;
        }
    }

    @ObfuscatedName("dm.o(IIILak;II)V")
    public static void method2240(int arg0, int arg1, int arg2, class32 arg3, int arg4) {
        class7 var5 = new class7();
        var5.field96 = arg0;
        var5.field97 = arg1 * 128;
        var5.field98 = arg2 * 128;
        int var6 = arg3.field823;
        int var7 = arg3.field833;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field833;
            var7 = arg3.field823;
        }
        var5.field99 = (arg1 + var6) * 128;
        var5.field100 = (arg2 + var7) * 128;
        var5.field95 = arg3.field861;
        var5.field101 = arg3.field862 * 128;
        var5.field111 = arg3.field858;
        var5.field102 = arg3.field849;
        var5.field106 = arg3.field865;
        if (arg3.field816 != null) {
            var5.field112 = arg3;
            var5.method54();
        }
        field109.method3381(var5);
        if (var5.field106 != null) {
            var5.field105 = var5.field111 + (int) (Math.random() * (double) (var5.field102 - var5.field111));
        }
    }
}

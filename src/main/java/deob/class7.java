package deob;

@ObfuscatedName("m")
public final class class7 extends class177 {

    @ObfuscatedName("m.c")
    public static class175 field119 = new class175();

    @ObfuscatedName("m.j")
    public int field104;

    @ObfuscatedName("m.f")
    public int field105;

    @ObfuscatedName("m.y")
    public int field118;

    @ObfuscatedName("m.x")
    public int field107;

    @ObfuscatedName("m.e")
    public int field103;

    @ObfuscatedName("m.m")
    public int field109;

    @ObfuscatedName("m.s")
    public int field112;

    @ObfuscatedName("m.p")
    public int field125;

    @ObfuscatedName("m.w")
    public class44 field111;

    @ObfuscatedName("m.r")
    public class31 field108;

    @ObfuscatedName("m.n")
    public int field113;

    @ObfuscatedName("m.b")
    public int[] field114;

    @ObfuscatedName("m.z")
    public int field121;

    @ObfuscatedName("m.h")
    public class44 field116;

    @ObfuscatedName("d.c(I)V")
    public static void method232() {
        for (class7 var0 = (class7) field119.method3145(); var0 != null; var0 = (class7) field119.method3154()) {
            if (var0.field111 != null) {
                Statics.field61.method1055(var0.field111);
                var0.field111 = null;
            }
            if (var0.field116 != null) {
                Statics.field61.method1055(var0.field116);
                var0.field116 = null;
            }
        }
        field119.method3146();
    }

    @ObfuscatedName("j.j(I)V")
    public static void method14() {
        for (class7 var0 = (class7) field119.method3145(); var0 != null; var0 = (class7) field119.method3154()) {
            if (var0.field108 != null) {
                var0.method33();
            }
        }
    }

    @ObfuscatedName("m.f(I)V")
    public void method33() {
        int var1 = this.field125;
        class31 var2 = this.field108.method594();
        if (var2 == null) {
            this.field125 = -1;
            this.field109 = 0;
            this.field112 = 0;
            this.field113 = 0;
            this.field114 = null;
        } else {
            this.field125 = var2.field840;
            this.field109 = var2.field841 * 128;
            this.field112 = var2.field820;
            this.field113 = var2.field843;
            this.field114 = var2.field844;
        }
        if (this.field125 != var1 && this.field111 != null) {
            Statics.field61.method1055(this.field111);
            this.field111 = null;
        }
    }

    @ObfuscatedName("ax.y(IIILaf;II)V")
    public static void method704(int arg0, int arg1, int arg2, class31 arg3, int arg4) {
        class7 var5 = new class7();
        var5.field104 = arg0;
        var5.field105 = arg1 * 128;
        var5.field118 = arg2 * 128;
        int var6 = arg3.field810;
        int var7 = arg3.field796;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field796;
            var7 = arg3.field810;
        }
        var5.field107 = (arg1 + var6) * 128;
        var5.field103 = (arg2 + var7) * 128;
        var5.field125 = arg3.field840;
        var5.field109 = arg3.field841 * 128;
        var5.field112 = arg3.field820;
        var5.field113 = arg3.field843;
        var5.field114 = arg3.field844;
        if (arg3.field812 != null) {
            var5.field108 = arg3;
            var5.method33();
        }
        field119.method3147(var5);
        if (var5.field114 != null) {
            var5.field121 = var5.field112 + (int) (Math.random() * (double) (var5.field113 - var5.field112));
        }
    }

    @ObfuscatedName("s.x(IIIIB)V")
    public static void method58(int arg0, int arg1, int arg2, int arg3) {
        for (class7 var4 = (class7) field119.method3145(); var4 != null; var4 = (class7) field119.method3154()) {
            if (var4.field125 != -1 || var4.field114 != null) {
                int var5 = 0;
                if (arg1 > var4.field107) {
                    var5 += arg1 - var4.field107;
                } else if (arg1 < var4.field105) {
                    var5 += var4.field105 - arg1;
                }
                if (arg2 > var4.field103) {
                    var5 += arg2 - var4.field103;
                } else if (arg2 < var4.field118) {
                    var5 += var4.field118 - arg2;
                }
                if (var5 - 64 > var4.field109 || client.field469 == 0 || var4.field104 != arg0) {
                    if (var4.field111 != null) {
                        Statics.field61.method1055(var4.field111);
                        var4.field111 = null;
                    }
                    if (var4.field116 != null) {
                        Statics.field61.method1055(var4.field116);
                        var4.field116 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field469 * (var4.field109 - var5) / var4.field109;
                    if (var4.field111 != null) {
                        var4.field111.method984(var6);
                    } else if (var4.field125 >= 0) {
                        class56 var7 = class56.method1216(Statics.field1237, var4.field125, 0);
                        if (var7 != null) {
                            class62 var8 = var7.method1211().method1278(Statics.field1967);
                            class44 var9 = class44.method907(var8, 100, var6);
                            var9.method910(-1);
                            Statics.field61.method1054(var9);
                            var4.field111 = var9;
                        }
                    }
                    if (var4.field116 != null) {
                        var4.field116.method984(var6);
                        if (!var4.field116.method3181()) {
                            var4.field116 = null;
                        }
                    } else if (var4.field114 != null && (var4.field121 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field114.length);
                        class56 var11 = class56.method1216(Statics.field1237, var4.field114[var10], 0);
                        if (var11 != null) {
                            class62 var12 = var11.method1211().method1278(Statics.field1967);
                            class44 var13 = class44.method907(var12, 100, var6);
                            var13.method910(0);
                            Statics.field61.method1054(var13);
                            var4.field116 = var13;
                            var4.field121 = var4.field112 + (int) (Math.random() * (double) (var4.field113 - var4.field112));
                        }
                    }
                }
            }
        }
    }
}

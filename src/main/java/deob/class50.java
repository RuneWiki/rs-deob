package deob;

@ObfuscatedName("ad")
public final class class50 extends class354 {

    @ObfuscatedName("ad.s")
    public int field728;

    @ObfuscatedName("ad.t")
    public static class296 field720 = new class296();

    @ObfuscatedName("ad.v")
    public int field722;

    @ObfuscatedName("ad.j")
    public int field721;

    @ObfuscatedName("ad.l")
    public int field731;

    @ObfuscatedName("ad.n")
    public int field723;

    @ObfuscatedName("ad.w")
    public int field724;

    @ObfuscatedName("ad.f")
    public int field719;

    @ObfuscatedName("ad.o")
    public int field734;

    @ObfuscatedName("ad.x")
    public class30 field727;

    @ObfuscatedName("ad.r")
    public class156 field733;

    @ObfuscatedName("ad.p")
    public int field729;

    @ObfuscatedName("ad.h")
    public int[] field730;

    @ObfuscatedName("ad.k")
    public int field726;

    @ObfuscatedName("ad.a")
    public class30 field725;

    @ObfuscatedName("ep.s(B)V")
    public static void method2432() {
        for (class50 var0 = (class50) field720.method4721(); var0 != null; var0 = (class50) field720.method4712()) {
            if (var0.field733 != null) {
                var0.method1408();
            }
        }
    }

    @ObfuscatedName("ad.t(I)V")
    public void method1408() {
        int var1 = this.field734;
        class156 var2 = this.field733.method2681();
        if (var2 == null) {
            this.field734 = -1;
            this.field719 = 0;
            this.field728 = 0;
            this.field729 = 0;
            this.field730 = null;
        } else {
            this.field734 = var2.field1766;
            this.field719 = var2.field1780 * 128;
            this.field728 = var2.field1756;
            this.field729 = var2.field1782;
            this.field730 = var2.field1781;
        }
        if (this.field734 != var1 && this.field727 != null) {
            Statics.field1163.method380(this.field727);
            this.field727 = null;
        }
    }

    @ObfuscatedName("fa.v(IIILem;II)V")
    public static void method3037(int arg0, int arg1, int arg2, class156 arg3, int arg4) {
        class50 var5 = new class50();
        var5.field722 = arg0;
        var5.field721 = arg1 * 128;
        var5.field731 = arg2 * 128;
        int var6 = arg3.field1750;
        int var7 = arg3.field1751;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field1751;
            var7 = arg3.field1750;
        }
        var5.field723 = (arg1 + var6) * 128;
        var5.field724 = (arg2 + var7) * 128;
        var5.field734 = arg3.field1766;
        var5.field719 = arg3.field1780 * 128;
        var5.field728 = arg3.field1756;
        var5.field729 = arg3.field1782;
        var5.field730 = arg3.field1781;
        if (arg3.field1762 != null) {
            var5.field733 = arg3;
            var5.method1408();
        }
        field720.method4706(var5);
        if (var5.field730 != null) {
            var5.field726 = var5.field728 + (int) (Math.random() * (double) (var5.field729 - var5.field728));
        }
    }

    @ObfuscatedName("ag.j(IIIII)V")
    public static void method1338(int arg0, int arg1, int arg2, int arg3) {
        for (class50 var4 = (class50) field720.method4721(); var4 != null; var4 = (class50) field720.method4712()) {
            if (var4.field734 != -1 || var4.field730 != null) {
                int var5 = 0;
                if (arg1 > var4.field723) {
                    var5 += arg1 - var4.field723;
                } else if (arg1 < var4.field721) {
                    var5 += var4.field721 - arg1;
                }
                if (arg2 > var4.field724) {
                    var5 += arg2 - var4.field724;
                } else if (arg2 < var4.field731) {
                    var5 += var4.field731 - arg2;
                }
                if (var5 - 64 > var4.field719 || Statics.field308.field1116 == 0 || var4.field722 != arg0) {
                    if (var4.field727 != null) {
                        Statics.field1163.method380(var4.field727);
                        var4.field727 = null;
                    }
                    if (var4.field725 != null) {
                        Statics.field1163.method380(var4.field725);
                        var4.field725 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = Statics.field308.field1116 * (var4.field719 - var5) / var4.field719;
                    if (var4.field727 != null) {
                        var4.field727.method532(var6);
                    } else if (var4.field734 >= 0) {
                        class22 var7 = class22.method413(Statics.field1521, var4.field734, 0);
                        if (var7 != null) {
                            class23 var8 = var7.method407().method418(Statics.field1842);
                            class30 var9 = class30.method573(var8, 100, var6);
                            var9.method603(-1);
                            Statics.field1163.method368(var9);
                            var4.field727 = var9;
                        }
                    }
                    if (var4.field725 != null) {
                        var4.field725.method532(var6);
                        if (!var4.field725.method5448()) {
                            var4.field725 = null;
                        }
                    } else if (var4.field730 != null && (var4.field726 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field730.length);
                        class22 var11 = class22.method413(Statics.field1521, var4.field730[var10], 0);
                        if (var11 != null) {
                            class23 var12 = var11.method407().method418(Statics.field1842);
                            class30 var13 = class30.method573(var12, 100, var6);
                            var13.method603(0);
                            Statics.field1163.method368(var13);
                            var4.field725 = var13;
                            var4.field726 = var4.field728 + (int) (Math.random() * (double) (var4.field729 - var4.field728));
                        }
                    }
                }
            }
        }
    }
}

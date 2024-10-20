package deob;

@ObfuscatedName("x")
public final class class21 extends class191 {

    @ObfuscatedName("x.p")
    public static class182 field531 = new class182();

    @ObfuscatedName("x.y")
    public int field528;

    @ObfuscatedName("x.d")
    public int field529;

    @ObfuscatedName("x.c")
    public int field530;

    @ObfuscatedName("x.r")
    public class37 field535;

    @ObfuscatedName("x.f")
    public int field539;

    @ObfuscatedName("x.z")
    public int field533;

    @ObfuscatedName("x.o")
    public int field527;

    @ObfuscatedName("x.k")
    public int field532;

    @ObfuscatedName("x.s")
    public int field536;

    @ObfuscatedName("x.h")
    public class59 field534;

    @ObfuscatedName("x.m")
    public int field537;

    @ObfuscatedName("x.w")
    public int[] field538;

    @ObfuscatedName("x.q")
    public int field544;

    @ObfuscatedName("x.u")
    public class59 field540;

    @ObfuscatedName("x.p(B)V")
    public void method512() {
        int var1 = this.field532;
        class37 var2 = this.field535.method678();
        if (var2 == null) {
            this.field532 = -1;
            this.field527 = 0;
            this.field536 = 0;
            this.field537 = 0;
            this.field538 = null;
        } else {
            this.field532 = var2.field859;
            this.field527 = var2.field860 * 128;
            this.field536 = var2.field861;
            this.field537 = var2.field862;
            this.field538 = var2.field863;
        }
        if (this.field532 != var1 && this.field534 != null) {
            Statics.field543.method1012(this.field534);
            this.field534 = null;
        }
    }

    @ObfuscatedName("ar.y(IIIII)V")
    public static void method559(int arg0, int arg1, int arg2, int arg3) {
        for (class21 var4 = (class21) field531.method3270(); var4 != null; var4 = (class21) field531.method3262()) {
            if (var4.field532 != -1 || var4.field538 != null) {
                int var5 = 0;
                if (arg1 > var4.field539) {
                    var5 += arg1 - var4.field539;
                } else if (arg1 < var4.field529) {
                    var5 += var4.field529 - arg1;
                }
                if (arg2 > var4.field533) {
                    var5 += arg2 - var4.field533;
                } else if (arg2 < var4.field530) {
                    var5 += var4.field530 - arg2;
                }
                if (var5 - 64 > var4.field527 || client.field474 == 0 || var4.field528 != arg0) {
                    if (var4.field534 != null) {
                        Statics.field543.method1012(var4.field534);
                        var4.field534 = null;
                    }
                    if (var4.field540 != null) {
                        Statics.field543.method1012(var4.field540);
                        var4.field540 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field474 * (var4.field527 - var5) / var4.field527;
                    if (var4.field534 != null) {
                        var4.field534.method1131(var6);
                    } else if (var4.field532 >= 0) {
                        class53 var7 = class53.method1069(Statics.field63, var4.field532, 0);
                        if (var7 != null) {
                            class57 var8 = var7.method1062().method1098(Statics.field687);
                            class59 var9 = class59.method1167(var8, 100, var6);
                            var9.method1248(-1);
                            Statics.field543.method978(var9);
                            var4.field534 = var9;
                        }
                    }
                    if (var4.field540 != null) {
                        var4.field540.method1131(var6);
                        if (!var4.field540.method3353()) {
                            var4.field540 = null;
                        }
                    } else if (var4.field538 != null && (var4.field544 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field538.length);
                        class53 var11 = class53.method1069(Statics.field63, var4.field538[var10], 0);
                        if (var11 != null) {
                            class57 var12 = var11.method1062().method1098(Statics.field687);
                            class59 var13 = class59.method1167(var12, 100, var6);
                            var13.method1248(0);
                            Statics.field543.method978(var13);
                            var4.field540 = var13;
                            var4.field544 = var4.field536 + (int) (Math.random() * (double) (var4.field537 - var4.field536));
                        }
                    }
                }
            }
        }
    }
}

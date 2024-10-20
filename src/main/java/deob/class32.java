package deob;

@ObfuscatedName("av")
public final class class32 extends class128 {

    @ObfuscatedName("av.o")
    public static class129 field724 = new class129();

    @ObfuscatedName("av.m")
    public int field710;

    @ObfuscatedName("av.b")
    public int field711;

    @ObfuscatedName("av.g")
    public int field712;

    @ObfuscatedName("av.h")
    public int field713;

    @ObfuscatedName("av.v")
    public int field714;

    @ObfuscatedName("av.l")
    public int field719;

    @ObfuscatedName("av.c")
    public int field716;

    @ObfuscatedName("av.u")
    public class67 field717;

    @ObfuscatedName("av.k")
    public int field723;

    @ObfuscatedName("av.z")
    public int field709;

    @ObfuscatedName("av.y")
    public int[] field722;

    @ObfuscatedName("av.j")
    public int field721;

    @ObfuscatedName("av.f")
    public class67 field715;

    @ObfuscatedName("av.p")
    public class198 field726;

    @ObfuscatedName("av.o(B)V")
    public void method650() {
        int var1 = this.field716;
        class198 var2 = this.field726.method3323();
        if (var2 == null) {
            this.field716 = -1;
            this.field719 = 0;
            this.field723 = 0;
            this.field709 = 0;
            this.field722 = null;
        } else {
            this.field716 = var2.field2935;
            this.field719 = var2.field2899 * 128;
            this.field723 = var2.field2937;
            this.field709 = var2.field2894;
            this.field722 = var2.field2924;
        }
        if (this.field716 != var1 && this.field717 != null) {
            Statics.field1555.method905(this.field717);
            this.field717 = null;
        }
    }

    @ObfuscatedName("cx.m(IIILgg;II)V")
    public static void method1586(int arg0, int arg1, int arg2, class198 arg3, int arg4) {
        class32 var5 = new class32();
        var5.field710 = arg0;
        var5.field711 = arg1 * 128;
        var5.field712 = arg2 * 128;
        int var6 = arg3.field2906;
        int var7 = arg3.field2939;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field2939;
            var7 = arg3.field2906;
        }
        var5.field713 = (arg1 + var6) * 128;
        var5.field714 = (arg2 + var7) * 128;
        var5.field716 = arg3.field2935;
        var5.field719 = arg3.field2899 * 128;
        var5.field723 = arg3.field2937;
        var5.field709 = arg3.field2894;
        var5.field722 = arg3.field2924;
        if (arg3.field2932 != null) {
            var5.field726 = arg3;
            var5.method650();
        }
        field724.method2213(var5);
        if (var5.field722 != null) {
            var5.field721 = var5.field723 + (int) (Math.random() * (double) (var5.field709 - var5.field723));
        }
    }

    @ObfuscatedName("fr.b(IIIII)V")
    public static void method2998(int arg0, int arg1, int arg2, int arg3) {
        for (class32 var4 = (class32) field724.method2201(); var4 != null; var4 = (class32) field724.method2203()) {
            if (var4.field716 != -1 || var4.field722 != null) {
                int var5 = 0;
                if (arg1 > var4.field713) {
                    var5 += arg1 - var4.field713;
                } else if (arg1 < var4.field711) {
                    var5 += var4.field711 - arg1;
                }
                if (arg2 > var4.field714) {
                    var5 += arg2 - var4.field714;
                } else if (arg2 < var4.field712) {
                    var5 += var4.field712 - arg2;
                }
                if (var5 - 64 > var4.field719 || client.field526 == 0 || var4.field710 != arg0) {
                    if (var4.field717 != null) {
                        Statics.field1555.method905(var4.field717);
                        var4.field717 = null;
                    }
                    if (var4.field715 != null) {
                        Statics.field1555.method905(var4.field715);
                        var4.field715 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field526 * (var4.field719 - var5) / var4.field719;
                    if (var4.field717 != null) {
                        var4.field717.method1125(var6);
                    } else if (var4.field716 >= 0) {
                        class54 var7 = class54.method937(Statics.field1666, var4.field716, 0);
                        if (var7 != null) {
                            class56 var8 = var7.method926().method972(Statics.field142);
                            class67 var9 = class67.method1194(var8, 100, var6);
                            var9.method1210(-1);
                            Statics.field1555.method880(var9);
                            var4.field717 = var9;
                        }
                    }
                    if (var4.field715 != null) {
                        var4.field715.method1125(var6);
                        if (!var4.field715.method2191()) {
                            var4.field715 = null;
                        }
                    } else if (var4.field722 != null && (var4.field721 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field722.length);
                        class54 var11 = class54.method937(Statics.field1666, var4.field722[var10], 0);
                        if (var11 != null) {
                            class56 var12 = var11.method926().method972(Statics.field142);
                            class67 var13 = class67.method1194(var12, 100, var6);
                            var13.method1210(0);
                            Statics.field1555.method880(var13);
                            var4.field715 = var13;
                            var4.field721 = var4.field723 + (int) (Math.random() * (double) (var4.field709 - var4.field723));
                        }
                    }
                }
            }
        }
    }
}

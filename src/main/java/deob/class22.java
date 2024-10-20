package deob;

@ObfuscatedName("x")
public final class class22 extends class198 {

    @ObfuscatedName("x.q")
    public static class189 field577 = new class189();

    @ObfuscatedName("x.s")
    public int field565;

    @ObfuscatedName("x.h")
    public int field566;

    @ObfuscatedName("x.e")
    public int field567;

    @ObfuscatedName("x.n")
    public int field570;

    @ObfuscatedName("x.t")
    public int field569;

    @ObfuscatedName("x.l")
    public int field579;

    @ObfuscatedName("x.m")
    public int field571;

    @ObfuscatedName("x.o")
    public int field572;

    @ObfuscatedName("x.k")
    public class60 field573;

    @ObfuscatedName("x.p")
    public int field575;

    @ObfuscatedName("x.u")
    public int[] field576;

    @ObfuscatedName("x.g")
    public int field568;

    @ObfuscatedName("x.a")
    public class60 field578;

    @ObfuscatedName("x.y")
    public class38 field574;

    @ObfuscatedName("x.q(I)V")
    public void method498() {
        int var1 = this.field572;
        class38 var2 = this.field574.method670();
        if (var2 == null) {
            this.field572 = -1;
            this.field571 = 0;
            this.field565 = 0;
            this.field575 = 0;
            this.field576 = null;
        } else {
            this.field572 = var2.field856;
            this.field571 = var2.field894 * 128;
            this.field565 = var2.field895;
            this.field575 = var2.field896;
            this.field576 = var2.field897;
        }
        if (this.field572 != var1 && this.field573 != null) {
            Statics.field1812.method983(this.field573);
            this.field573 = null;
        }
    }

    @ObfuscatedName("dx.s(IIILao;II)V")
    public static void method2333(int arg0, int arg1, int arg2, class38 arg3, int arg4) {
        class22 var5 = new class22();
        var5.field566 = arg0;
        var5.field567 = arg1 * 128;
        var5.field570 = arg2 * 128;
        int var6 = arg3.field863;
        int var7 = arg3.field865;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field865;
            var7 = arg3.field863;
        }
        var5.field569 = (arg1 + var6) * 128;
        var5.field579 = (arg2 + var7) * 128;
        var5.field572 = arg3.field856;
        var5.field571 = arg3.field894 * 128;
        var5.field565 = arg3.field895;
        var5.field575 = arg3.field896;
        var5.field576 = arg3.field897;
        if (arg3.field875 != null) {
            var5.field574 = arg3;
            var5.method498();
        }
        field577.method3327(var5);
        if (var5.field576 != null) {
            var5.field568 = var5.field565 + (int) (Math.random() * (double) (var5.field575 - var5.field565));
        }
    }

    @ObfuscatedName("bb.h(IIIII)V")
    public static void method1062(int arg0, int arg1, int arg2, int arg3) {
        for (class22 var4 = (class22) field577.method3309(); var4 != null; var4 = (class22) field577.method3311()) {
            if (var4.field572 != -1 || var4.field576 != null) {
                int var5 = 0;
                if (arg1 > var4.field569) {
                    var5 += arg1 - var4.field569;
                } else if (arg1 < var4.field567) {
                    var5 += var4.field567 - arg1;
                }
                if (arg2 > var4.field579) {
                    var5 += arg2 - var4.field579;
                } else if (arg2 < var4.field570) {
                    var5 += var4.field570 - arg2;
                }
                if (var5 - 64 > var4.field571 || client.field352 == 0 || var4.field566 != arg0) {
                    if (var4.field573 != null) {
                        Statics.field1812.method983(var4.field573);
                        var4.field573 = null;
                    }
                    if (var4.field578 != null) {
                        Statics.field1812.method983(var4.field578);
                        var4.field578 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field352 * (var4.field571 - var5) / var4.field571;
                    if (var4.field573 != null) {
                        var4.field573.method1109(var6);
                    } else if (var4.field572 >= 0) {
                        class54 var7 = class54.method1050(Statics.field236, var4.field572, 0);
                        if (var7 != null) {
                            class58 var8 = var7.method1043().method1079(Statics.field1100);
                            class60 var9 = class60.method1106(var8, 100, var6);
                            var9.method1192(-1);
                            Statics.field1812.method990(var9);
                            var4.field573 = var9;
                        }
                    }
                    if (var4.field578 != null) {
                        var4.field578.method1109(var6);
                        if (!var4.field578.method3399()) {
                            var4.field578 = null;
                        }
                    } else if (var4.field576 != null && (var4.field568 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field576.length);
                        class54 var11 = class54.method1050(Statics.field236, var4.field576[var10], 0);
                        if (var11 != null) {
                            class58 var12 = var11.method1043().method1079(Statics.field1100);
                            class60 var13 = class60.method1106(var12, 100, var6);
                            var13.method1192(0);
                            Statics.field1812.method990(var13);
                            var4.field578 = var13;
                            var4.field568 = var4.field565 + (int) (Math.random() * (double) (var4.field575 - var4.field565));
                        }
                    }
                }
            }
        }
    }
}

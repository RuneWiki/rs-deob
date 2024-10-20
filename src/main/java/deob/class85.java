package deob;

@ObfuscatedName("cn")
public final class class85 extends class190 {

    @ObfuscatedName("cn.m")
    public static class272 field1107 = new class272();

    @ObfuscatedName("cn.o")
    public int field1101;

    @ObfuscatedName("cn.q")
    public int field1102;

    @ObfuscatedName("cn.j")
    public int field1108;

    @ObfuscatedName("cn.p")
    public int field1104;

    @ObfuscatedName("cn.g")
    public int field1105;

    @ObfuscatedName("cn.n")
    public int field1106;

    @ObfuscatedName("cn.u")
    public int field1103;

    @ObfuscatedName("cn.a")
    public class123 field1110;

    @ObfuscatedName("cn.z")
    public int field1109;

    @ObfuscatedName("cn.w")
    public int field1116;

    @ObfuscatedName("cn.y")
    public int[] field1111;

    @ObfuscatedName("cn.c")
    public int field1112;

    @ObfuscatedName("cn.h")
    public class123 field1113;

    @ObfuscatedName("cn.k")
    public class264 field1114;

    @ObfuscatedName("cm.m(I)V")
    public static void method2030() {
        for (class85 var0 = (class85) field1107.method4651(); var0 != null; var0 = (class85) field1107.method4656()) {
            if (var0.field1114 != null) {
                var0.method1802();
            }
        }
    }

    @ObfuscatedName("cn.o(I)V")
    public void method1802() {
        int var1 = this.field1103;
        class264 var2 = this.field1114.method4361();
        if (var2 == null) {
            this.field1103 = -1;
            this.field1106 = 0;
            this.field1109 = 0;
            this.field1116 = 0;
            this.field1111 = null;
        } else {
            this.field1103 = var2.field3425;
            this.field1106 = var2.field3413 * 128;
            this.field1109 = var2.field3409;
            this.field1116 = var2.field3428;
            this.field1111 = var2.field3429;
        }
        if (this.field1103 != var1 && this.field1110 != null) {
            Statics.field450.method2194(this.field1110);
            this.field1110 = null;
        }
    }

    @ObfuscatedName("go.q(IIILjg;IB)V")
    public static void method3399(int arg0, int arg1, int arg2, class264 arg3, int arg4) {
        class85 var5 = new class85();
        var5.field1101 = arg0;
        var5.field1102 = arg1 * 128;
        var5.field1108 = arg2 * 128;
        int var6 = arg3.field3396;
        int var7 = arg3.field3397;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field3397;
            var7 = arg3.field3396;
        }
        var5.field1104 = (arg1 + var6) * 128;
        var5.field1105 = (arg2 + var7) * 128;
        var5.field1103 = arg3.field3425;
        var5.field1106 = arg3.field3413 * 128;
        var5.field1109 = arg3.field3409;
        var5.field1116 = arg3.field3428;
        var5.field1111 = arg3.field3429;
        if (arg3.field3422 != null) {
            var5.field1114 = arg3;
            var5.method1802();
        }
        field1107.method4644(var5);
        if (var5.field1111 != null) {
            var5.field1112 = var5.field1109 + (int) (Math.random() * (double) (var5.field1116 - var5.field1109));
        }
    }

    @ObfuscatedName("o.j(IIIII)V")
    public static void method11(int arg0, int arg1, int arg2, int arg3) {
        for (class85 var4 = (class85) field1107.method4651(); var4 != null; var4 = (class85) field1107.method4656()) {
            if (var4.field1103 != -1 || var4.field1111 != null) {
                int var5 = 0;
                if (arg1 > var4.field1104) {
                    var5 += arg1 - var4.field1104;
                } else if (arg1 < var4.field1102) {
                    var5 += var4.field1102 - arg1;
                }
                if (arg2 > var4.field1105) {
                    var5 += arg2 - var4.field1105;
                } else if (arg2 < var4.field1108) {
                    var5 += var4.field1108 - arg2;
                }
                if (var5 - 64 > var4.field1106 || client.field911 == 0 || var4.field1101 != arg0) {
                    if (var4.field1110 != null) {
                        Statics.field450.method2194(var4.field1110);
                        var4.field1110 = null;
                    }
                    if (var4.field1113 != null) {
                        Statics.field450.method2194(var4.field1113);
                        var4.field1113 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field911 * (var4.field1106 - var5) / var4.field1106;
                    if (var4.field1110 != null) {
                        var4.field1110.method2423(var6);
                    } else if (var4.field1103 >= 0) {
                        class111 var7 = class111.method2253(Statics.field82, var4.field1103, 0);
                        if (var7 != null) {
                            class113 var8 = var7.method2248().method2296(Statics.field2382);
                            class123 var9 = class123.method2419(var8, 100, var6);
                            var9.method2422(-1);
                            Statics.field450.method2193(var9);
                            var4.field1110 = var9;
                        }
                    }
                    if (var4.field1113 != null) {
                        var4.field1113.method2423(var6);
                        if (!var4.field1113.method3387()) {
                            var4.field1113 = null;
                        }
                    } else if (var4.field1111 != null && (var4.field1112 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field1111.length);
                        class111 var11 = class111.method2253(Statics.field82, var4.field1111[var10], 0);
                        if (var11 != null) {
                            class113 var12 = var11.method2248().method2296(Statics.field2382);
                            class123 var13 = class123.method2419(var12, 100, var6);
                            var13.method2422(0);
                            Statics.field450.method2193(var13);
                            var4.field1113 = var13;
                            var4.field1112 = var4.field1109 + (int) (Math.random() * (double) (var4.field1116 - var4.field1109));
                        }
                    }
                }
            }
        }
    }
}

package deob;

@ObfuscatedName("cn")
public final class class85 extends class190 {

    @ObfuscatedName("cn.z")
    public int field1107;

    @ObfuscatedName("cn.k")
    public static class272 field1113 = new class272();

    @ObfuscatedName("cn.s")
    public int field1110;

    @ObfuscatedName("cn.t")
    public int field1104;

    @ObfuscatedName("cn.i")
    public int field1112;

    @ObfuscatedName("cn.o")
    public int field1106;

    @ObfuscatedName("cn.x")
    public int field1118;

    @ObfuscatedName("cn.w")
    public int field1109;

    @ObfuscatedName("cn.g")
    public int field1103;

    @ObfuscatedName("cn.m")
    public class123 field1111;

    @ObfuscatedName("cn.n")
    public int field1116;

    @ObfuscatedName("cn.d")
    public int[] field1114;

    @ObfuscatedName("cn.h")
    public int field1119;

    @ObfuscatedName("cn.a")
    public class123 field1108;

    @ObfuscatedName("cn.q")
    public class264 field1117;

    @ObfuscatedName("gy.z(I)V")
    public static void method3466() {
        for (class85 var0 = (class85) field1113.method4621(); var0 != null; var0 = (class85) field1113.method4641()) {
            if (var0.field1111 != null) {
                Statics.field1277.method2196(var0.field1111);
                var0.field1111 = null;
            }
            if (var0.field1108 != null) {
                Statics.field1277.method2196(var0.field1108);
                var0.field1108 = null;
            }
        }
        field1113.method4627();
    }

    @ObfuscatedName("cn.k(S)V")
    public void method1809() {
        int var1 = this.field1103;
        class264 var2 = this.field1117.method4325();
        if (var2 == null) {
            this.field1103 = -1;
            this.field1109 = 0;
            this.field1110 = 0;
            this.field1116 = 0;
            this.field1114 = null;
        } else {
            this.field1103 = var2.field3416;
            this.field1109 = var2.field3418 * 128;
            this.field1110 = var2.field3379;
            this.field1116 = var2.field3419;
            this.field1114 = var2.field3420;
        }
        if (this.field1103 != var1 && this.field1111 != null) {
            Statics.field1277.method2196(this.field1111);
            this.field1111 = null;
        }
    }

    @ObfuscatedName("jy.s(IIILjg;II)V")
    public static void method4703(int arg0, int arg1, int arg2, class264 arg3, int arg4) {
        class85 var5 = new class85();
        var5.field1104 = arg0;
        var5.field1112 = arg1 * 128;
        var5.field1106 = arg2 * 128;
        int var6 = arg3.field3387;
        int var7 = arg3.field3388;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field3388;
            var7 = arg3.field3387;
        }
        var5.field1107 = (arg1 + var6) * 128;
        var5.field1118 = (arg2 + var7) * 128;
        var5.field1103 = arg3.field3416;
        var5.field1109 = arg3.field3418 * 128;
        var5.field1110 = arg3.field3379;
        var5.field1116 = arg3.field3419;
        var5.field1114 = arg3.field3420;
        if (arg3.field3413 != null) {
            var5.field1117 = arg3;
            var5.method1809();
        }
        field1113.method4616(var5);
        if (var5.field1114 != null) {
            var5.field1119 = var5.field1110 + (int) (Math.random() * (double) (var5.field1116 - var5.field1110));
        }
    }

    @ObfuscatedName("gp.t(IIIIB)V")
    public static void method3449(int arg0, int arg1, int arg2, int arg3) {
        for (class85 var4 = (class85) field1113.method4621(); var4 != null; var4 = (class85) field1113.method4641()) {
            if (var4.field1103 != -1 || var4.field1114 != null) {
                int var5 = 0;
                if (arg1 > var4.field1107) {
                    var5 += arg1 - var4.field1107;
                } else if (arg1 < var4.field1112) {
                    var5 += var4.field1112 - arg1;
                }
                if (arg2 > var4.field1118) {
                    var5 += arg2 - var4.field1118;
                } else if (arg2 < var4.field1106) {
                    var5 += var4.field1106 - arg2;
                }
                if (var5 - 64 > var4.field1109 || client.field915 == 0 || var4.field1104 != arg0) {
                    if (var4.field1111 != null) {
                        Statics.field1277.method2196(var4.field1111);
                        var4.field1111 = null;
                    }
                    if (var4.field1108 != null) {
                        Statics.field1277.method2196(var4.field1108);
                        var4.field1108 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field915 * (var4.field1109 - var5) / var4.field1109;
                    if (var4.field1111 != null) {
                        var4.field1111.method2427(var6);
                    } else if (var4.field1103 >= 0) {
                        class111 var7 = class111.method2267(Statics.field103, var4.field1103, 0);
                        if (var7 != null) {
                            class113 var8 = var7.method2253().method2300(Statics.field54);
                            class123 var9 = class123.method2450(var8, 100, var6);
                            var9.method2443(-1);
                            Statics.field1277.method2195(var9);
                            var4.field1111 = var9;
                        }
                    }
                    if (var4.field1108 != null) {
                        var4.field1108.method2427(var6);
                        if (!var4.field1108.method3406()) {
                            var4.field1108 = null;
                        }
                    } else if (var4.field1114 != null && (var4.field1119 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field1114.length);
                        class111 var11 = class111.method2267(Statics.field103, var4.field1114[var10], 0);
                        if (var11 != null) {
                            class113 var12 = var11.method2253().method2300(Statics.field54);
                            class123 var13 = class123.method2450(var12, 100, var6);
                            var13.method2443(0);
                            Statics.field1277.method2195(var13);
                            var4.field1108 = var13;
                            var4.field1119 = var4.field1110 + (int) (Math.random() * (double) (var4.field1116 - var4.field1110));
                        }
                    }
                }
            }
        }
    }
}

package deob;

@ObfuscatedName("bg")
public final class class76 extends class181 {

    @ObfuscatedName("bg.s")
    public int field1058;

    @ObfuscatedName("bg.j")
    public static class262 field1060 = new class262();

    @ObfuscatedName("bg.i")
    public int field1050;

    @ObfuscatedName("bg.k")
    public int field1051;

    @ObfuscatedName("bg.u")
    public int field1049;

    @ObfuscatedName("bg.n")
    public int field1053;

    @ObfuscatedName("bg.t")
    public int field1054;

    @ObfuscatedName("bg.q")
    public int field1055;

    @ObfuscatedName("bg.x")
    public int field1056;

    @ObfuscatedName("bg.d")
    public class114 field1062;

    @ObfuscatedName("bg.f")
    public int field1059;

    @ObfuscatedName("bg.c")
    public int[] field1061;

    @ObfuscatedName("bg.r")
    public class254 field1063;

    @ObfuscatedName("bg.y")
    public int field1057;

    @ObfuscatedName("bg.p")
    public class114 field1052;

    @ObfuscatedName("ab.s(I)V")
    public static void method687() {
        for (class76 var0 = (class76) field1060.method4480(); var0 != null; var0 = (class76) field1060.method4491()) {
            if (var0.field1063 != null) {
                var0.method1733();
            }
        }
    }

    @ObfuscatedName("bg.j(B)V")
    public void method1733() {
        int var1 = this.field1056;
        class254 var2 = this.field1063.method4204();
        if (var2 == null) {
            this.field1056 = -1;
            this.field1055 = 0;
            this.field1058 = 0;
            this.field1059 = 0;
            this.field1061 = null;
        } else {
            this.field1056 = var2.field3346;
            this.field1055 = var2.field3376 * 128;
            this.field1058 = var2.field3353;
            this.field1059 = var2.field3378;
            this.field1061 = var2.field3379;
        }
        if (this.field1056 != var1 && this.field1062 != null) {
            Statics.field3576.method2109(this.field1062);
            this.field1062 = null;
        }
    }

    @ObfuscatedName("r.i(IIIIB)V")
    public static void method133(int arg0, int arg1, int arg2, int arg3) {
        for (class76 var4 = (class76) field1060.method4480(); var4 != null; var4 = (class76) field1060.method4491()) {
            if (var4.field1056 != -1 || var4.field1061 != null) {
                int var5 = 0;
                if (arg1 > var4.field1053) {
                    var5 += arg1 - var4.field1053;
                } else if (arg1 < var4.field1051) {
                    var5 += var4.field1051 - arg1;
                }
                if (arg2 > var4.field1054) {
                    var5 += arg2 - var4.field1054;
                } else if (arg2 < var4.field1049) {
                    var5 += var4.field1049 - arg2;
                }
                if (var5 - 64 > var4.field1055 || client.field861 == 0 || var4.field1050 != arg0) {
                    if (var4.field1062 != null) {
                        Statics.field3576.method2109(var4.field1062);
                        var4.field1062 = null;
                    }
                    if (var4.field1052 != null) {
                        Statics.field3576.method2109(var4.field1052);
                        var4.field1052 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field861 * (var4.field1055 - var5) / var4.field1055;
                    if (var4.field1062 != null) {
                        var4.field1062.method2436(var6);
                    } else if (var4.field1056 >= 0) {
                        class102 var7 = class102.method2146(Statics.field226, var4.field1056, 0);
                        if (var7 != null) {
                            class104 var8 = var7.method2137().method2182(Statics.field3274);
                            class114 var9 = class114.method2309(var8, 100, var6);
                            var9.method2312(-1);
                            Statics.field3576.method2103(var9);
                            var4.field1062 = var9;
                        }
                    }
                    if (var4.field1052 != null) {
                        var4.field1052.method2436(var6);
                        if (!var4.field1052.method3305()) {
                            var4.field1052 = null;
                        }
                    } else if (var4.field1061 != null && (var4.field1057 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field1061.length);
                        class102 var11 = class102.method2146(Statics.field226, var4.field1061[var10], 0);
                        if (var11 != null) {
                            class104 var12 = var11.method2137().method2182(Statics.field3274);
                            class114 var13 = class114.method2309(var12, 100, var6);
                            var13.method2312(0);
                            Statics.field3576.method2103(var13);
                            var4.field1052 = var13;
                            var4.field1057 = var4.field1058 + (int) (Math.random() * (double) (var4.field1059 - var4.field1058));
                        }
                    }
                }
            }
        }
    }
}

package deob;

@ObfuscatedName("br")
public final class class76 extends class181 {

    @ObfuscatedName("br.c")
    public static class262 field1046 = new class262();

    @ObfuscatedName("br.x")
    public int field1048;

    @ObfuscatedName("br.t")
    public int field1045;

    @ObfuscatedName("br.g")
    public int field1042;

    @ObfuscatedName("br.l")
    public int field1044;

    @ObfuscatedName("br.u")
    public int field1052;

    @ObfuscatedName("br.j")
    public int field1040;

    @ObfuscatedName("br.v")
    public int field1047;

    @ObfuscatedName("br.d")
    public class114 field1041;

    @ObfuscatedName("br.z")
    public int field1049;

    @ObfuscatedName("br.n")
    public int field1050;

    @ObfuscatedName("br.h")
    public int[] field1051;

    @ObfuscatedName("br.f")
    public int field1043;

    @ObfuscatedName("br.s")
    public class114 field1053;

    @ObfuscatedName("br.p")
    public class254 field1054;

    @ObfuscatedName("hy.c(I)V")
    public static void method3772() {
        for (class76 var0 = (class76) field1046.method4550(); var0 != null; var0 = (class76) field1046.method4573()) {
            if (var0.field1041 != null) {
                Statics.field409.method2114(var0.field1041);
                var0.field1041 = null;
            }
            if (var0.field1053 != null) {
                Statics.field409.method2114(var0.field1053);
                var0.field1053 = null;
            }
        }
        field1046.method4544();
    }

    @ObfuscatedName("e.x(I)V")
    public static void method143() {
        for (class76 var0 = (class76) field1046.method4550(); var0 != null; var0 = (class76) field1046.method4573()) {
            if (var0.field1054 != null) {
                var0.method1743();
            }
        }
    }

    @ObfuscatedName("br.t(I)V")
    public void method1743() {
        int var1 = this.field1047;
        class254 var2 = this.field1054.method4291();
        if (var2 == null) {
            this.field1047 = -1;
            this.field1040 = 0;
            this.field1049 = 0;
            this.field1050 = 0;
            this.field1051 = null;
        } else {
            this.field1047 = var2.field3358;
            this.field1040 = var2.field3367 * 128;
            this.field1049 = var2.field3368;
            this.field1050 = var2.field3369;
            this.field1051 = var2.field3370;
        }
        if (this.field1047 != var1 && this.field1041 != null) {
            Statics.field409.method2114(this.field1041);
            this.field1041 = null;
        }
    }

    @ObfuscatedName("al.g(IIIIB)V")
    public static void method465(int arg0, int arg1, int arg2, int arg3) {
        for (class76 var4 = (class76) field1046.method4550(); var4 != null; var4 = (class76) field1046.method4573()) {
            if (var4.field1047 != -1 || var4.field1051 != null) {
                int var5 = 0;
                if (arg1 > var4.field1044) {
                    var5 += arg1 - var4.field1044;
                } else if (arg1 < var4.field1042) {
                    var5 += var4.field1042 - arg1;
                }
                if (arg2 > var4.field1052) {
                    var5 += arg2 - var4.field1052;
                } else if (arg2 < var4.field1048) {
                    var5 += var4.field1048 - arg2;
                }
                if (var5 - 64 > var4.field1040 || client.field861 == 0 || var4.field1045 != arg0) {
                    if (var4.field1041 != null) {
                        Statics.field409.method2114(var4.field1041);
                        var4.field1041 = null;
                    }
                    if (var4.field1053 != null) {
                        Statics.field409.method2114(var4.field1053);
                        var4.field1053 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field861 * (var4.field1040 - var5) / var4.field1040;
                    if (var4.field1041 != null) {
                        var4.field1041.method2337(var6);
                    } else if (var4.field1047 >= 0) {
                        class102 var7 = class102.method2179(Statics.field93, var4.field1047, 0);
                        if (var7 != null) {
                            class104 var8 = var7.method2170().method2215(Statics.field1128);
                            class114 var9 = class114.method2333(var8, 100, var6);
                            var9.method2336(-1);
                            Statics.field409.method2144(var9);
                            var4.field1041 = var9;
                        }
                    }
                    if (var4.field1053 != null) {
                        var4.field1053.method2337(var6);
                        if (!var4.field1053.method3329()) {
                            var4.field1053 = null;
                        }
                    } else if (var4.field1051 != null && (var4.field1043 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field1051.length);
                        class102 var11 = class102.method2179(Statics.field93, var4.field1051[var10], 0);
                        if (var11 != null) {
                            class104 var12 = var11.method2170().method2215(Statics.field1128);
                            class114 var13 = class114.method2333(var12, 100, var6);
                            var13.method2336(0);
                            Statics.field409.method2144(var13);
                            var4.field1053 = var13;
                            var4.field1043 = var4.field1049 + (int) (Math.random() * (double) (var4.field1050 - var4.field1049));
                        }
                    }
                }
            }
        }
    }
}

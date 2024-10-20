package deob;

@ObfuscatedName("by")
public final class class70 extends class207 {

    @ObfuscatedName("by.g")
    public static class208 field1052 = new class208();

    @ObfuscatedName("by.r")
    public class271 field1062;

    @ObfuscatedName("by.e")
    public int field1049;

    @ObfuscatedName("by.q")
    public int field1050;

    @ObfuscatedName("by.c")
    public int field1060;

    @ObfuscatedName("by.l")
    public int field1063;

    @ObfuscatedName("by.b")
    public int field1053;

    @ObfuscatedName("by.w")
    public int field1054;

    @ObfuscatedName("by.n")
    public int field1055;

    @ObfuscatedName("by.i")
    public class106 field1065;

    @ObfuscatedName("by.p")
    public int field1057;

    @ObfuscatedName("by.m")
    public int field1058;

    @ObfuscatedName("by.d")
    public int[] field1059;

    @ObfuscatedName("by.j")
    public int field1056;

    @ObfuscatedName("by.x")
    public class106 field1061;

    @ObfuscatedName("ea.g(I)V")
    public static void method3139() {
        for (class70 var0 = (class70) field1052.method3979(); var0 != null; var0 = (class70) field1052.method3964()) {
            if (var0.field1065 != null) {
                Statics.field414.method2081(var0.field1065);
                var0.field1065 = null;
            }
            if (var0.field1061 != null) {
                Statics.field414.method2081(var0.field1061);
                var0.field1061 = null;
            }
        }
        field1052.method3956();
    }

    @ObfuscatedName("by.e(I)V")
    public void method1725() {
        int var1 = this.field1055;
        class271 var2 = this.field1062.method4871();
        if (var2 == null) {
            this.field1055 = -1;
            this.field1054 = 0;
            this.field1057 = 0;
            this.field1058 = 0;
            this.field1059 = null;
        } else {
            this.field1055 = var2.field3492;
            this.field1054 = var2.field3497 * 128;
            this.field1057 = var2.field3498;
            this.field1058 = var2.field3499;
            this.field1059 = var2.field3500;
        }
        if (this.field1055 != var1 && this.field1065 != null) {
            Statics.field414.method2081(this.field1065);
            this.field1065 = null;
        }
    }

    @ObfuscatedName("z.q(IIIII)V")
    public static void method303(int arg0, int arg1, int arg2, int arg3) {
        for (class70 var4 = (class70) field1052.method3979(); var4 != null; var4 = (class70) field1052.method3964()) {
            if (var4.field1055 != -1 || var4.field1059 != null) {
                int var5 = 0;
                if (arg1 > var4.field1063) {
                    var5 += arg1 - var4.field1063;
                } else if (arg1 < var4.field1050) {
                    var5 += var4.field1050 - arg1;
                }
                if (arg2 > var4.field1053) {
                    var5 += arg2 - var4.field1053;
                } else if (arg2 < var4.field1060) {
                    var5 += var4.field1060 - arg2;
                }
                if (var5 - 64 > var4.field1054 || client.field882 == 0 || var4.field1049 != arg0) {
                    if (var4.field1065 != null) {
                        Statics.field414.method2081(var4.field1065);
                        var4.field1065 = null;
                    }
                    if (var4.field1061 != null) {
                        Statics.field414.method2081(var4.field1061);
                        var4.field1061 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field882 * (var4.field1054 - var5) / var4.field1054;
                    if (var4.field1065 != null) {
                        var4.field1065.method2313(var6);
                    } else if (var4.field1055 >= 0) {
                        class94 var7 = class94.method2138(Statics.field73, var4.field1055, 0);
                        if (var7 != null) {
                            class96 var8 = var7.method2144().method2185(Statics.field3698);
                            class106 var9 = class106.method2320(var8, 100, var6);
                            var9.method2312(-1);
                            Statics.field414.method2082(var9);
                            var4.field1065 = var9;
                        }
                    }
                    if (var4.field1061 != null) {
                        var4.field1061.method2313(var6);
                        if (!var4.field1061.method3953()) {
                            var4.field1061 = null;
                        }
                    } else if (var4.field1059 != null && (var4.field1056 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field1059.length);
                        class94 var11 = class94.method2138(Statics.field73, var4.field1059[var10], 0);
                        if (var11 != null) {
                            class96 var12 = var11.method2144().method2185(Statics.field3698);
                            class106 var13 = class106.method2320(var12, 100, var6);
                            var13.method2312(0);
                            Statics.field414.method2082(var13);
                            var4.field1061 = var13;
                            var4.field1056 = var4.field1057 + (int) (Math.random() * (double) (var4.field1058 - var4.field1057));
                        }
                    }
                }
            }
        }
    }
}

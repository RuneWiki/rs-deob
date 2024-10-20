package deob;

@ObfuscatedName("ck")
public final class class85 extends class190 {

    @ObfuscatedName("ck.n")
    public static class273 field1101 = new class273();

    @ObfuscatedName("ck.v")
    public int field1088;

    @ObfuscatedName("ck.d")
    public int field1089;

    @ObfuscatedName("ck.c")
    public int field1090;

    @ObfuscatedName("ck.y")
    public int field1091;

    @ObfuscatedName("ck.h")
    public int field1095;

    @ObfuscatedName("ck.z")
    public int field1093;

    @ObfuscatedName("ck.e")
    public int field1092;

    @ObfuscatedName("ck.q")
    public class123 field1105;

    @ObfuscatedName("ck.l")
    public int field1096;

    @ObfuscatedName("ck.s")
    public int field1097;

    @ObfuscatedName("ck.b")
    public int[] field1094;

    @ObfuscatedName("ck.a")
    public int field1098;

    @ObfuscatedName("ck.w")
    public class123 field1100;

    @ObfuscatedName("ck.k")
    public class265 field1103;

    @ObfuscatedName("ck.n(B)V")
    public void method1875() {
        int var1 = this.field1092;
        class265 var2 = this.field1103.method4417();
        if (var2 == null) {
            this.field1092 = -1;
            this.field1093 = 0;
            this.field1096 = 0;
            this.field1097 = 0;
            this.field1094 = null;
        } else {
            this.field1092 = var2.field3425;
            this.field1093 = var2.field3426 * 128;
            this.field1096 = var2.field3427;
            this.field1097 = var2.field3428;
            this.field1094 = var2.field3429;
        }
        if (this.field1092 != var1 && this.field1105 != null) {
            Statics.field3325.method2284(this.field1105);
            this.field1105 = null;
        }
    }

    @ObfuscatedName("ag.v(IIIIS)V")
    public static void method285(int arg0, int arg1, int arg2, int arg3) {
        for (class85 var4 = (class85) field1101.method4721(); var4 != null; var4 = (class85) field1101.method4706()) {
            if (var4.field1092 != -1 || var4.field1094 != null) {
                int var5 = 0;
                if (arg1 > var4.field1091) {
                    var5 += arg1 - var4.field1091;
                } else if (arg1 < var4.field1089) {
                    var5 += var4.field1089 - arg1;
                }
                if (arg2 > var4.field1095) {
                    var5 += arg2 - var4.field1095;
                } else if (arg2 < var4.field1090) {
                    var5 += var4.field1090 - arg2;
                }
                if (var5 - 64 > var4.field1093 || Statics.field191.field1071 == 0 || var4.field1088 != arg0) {
                    if (var4.field1105 != null) {
                        Statics.field3325.method2284(var4.field1105);
                        var4.field1105 = null;
                    }
                    if (var4.field1100 != null) {
                        Statics.field3325.method2284(var4.field1100);
                        var4.field1100 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = Statics.field191.field1071 * (var4.field1093 - var5) / var4.field1093;
                    if (var4.field1105 != null) {
                        var4.field1105.method2576(var6);
                    } else if (var4.field1092 >= 0) {
                        class111 var7 = class111.method2351(Statics.field333, var4.field1092, 0);
                        if (var7 != null) {
                            class113 var8 = var7.method2343().method2397(Statics.field1041);
                            class123 var9 = class123.method2508(var8, 100, var6);
                            var9.method2572(-1);
                            Statics.field3325.method2304(var9);
                            var4.field1105 = var9;
                        }
                    }
                    if (var4.field1100 != null) {
                        var4.field1100.method2576(var6);
                        if (!var4.field1100.method3487()) {
                            var4.field1100 = null;
                        }
                    } else if (var4.field1094 != null && (var4.field1098 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field1094.length);
                        class111 var11 = class111.method2351(Statics.field333, var4.field1094[var10], 0);
                        if (var11 != null) {
                            class113 var12 = var11.method2343().method2397(Statics.field1041);
                            class123 var13 = class123.method2508(var12, 100, var6);
                            var13.method2572(0);
                            Statics.field3325.method2304(var13);
                            var4.field1100 = var13;
                            var4.field1098 = var4.field1096 + (int) (Math.random() * (double) (var4.field1097 - var4.field1096));
                        }
                    }
                }
            }
        }
    }
}

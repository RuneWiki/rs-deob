package deob;

@ObfuscatedName("cc")
public final class class80 extends class204 {

    @ObfuscatedName("cc.s")
    public int field1230;

    @ObfuscatedName("cc.g")
    public static class205 field1234 = new class205();

    @ObfuscatedName("cc.m")
    public int field1222;

    @ObfuscatedName("cc.h")
    public int field1223;

    @ObfuscatedName("cc.i")
    public int field1236;

    @ObfuscatedName("cc.w")
    public int field1225;

    @ObfuscatedName("cc.t")
    public int field1226;

    @ObfuscatedName("cc.d")
    public int field1227;

    @ObfuscatedName("cc.z")
    public int field1228;

    @ObfuscatedName("cc.k")
    public class117 field1232;

    @ObfuscatedName("cc.c")
    public int field1231;

    @ObfuscatedName("cc.o")
    public int[] field1229;

    @ObfuscatedName("cc.l")
    public int field1233;

    @ObfuscatedName("cc.f")
    public class117 field1221;

    @ObfuscatedName("cc.q")
    public class267 field1235;

    @ObfuscatedName("gy.s(B)V")
    public static void method3480() {
        for (class80 var0 = (class80) field1234.method3752(); var0 != null; var0 = (class80) field1234.method3762()) {
            if (var0.field1235 != null) {
                var0.method1644();
            }
        }
    }

    @ObfuscatedName("cc.g(I)V")
    public void method1644() {
        int var1 = this.field1228;
        class267 var2 = this.field1235.method4596();
        if (var2 == null) {
            this.field1228 = -1;
            this.field1227 = 0;
            this.field1230 = 0;
            this.field1231 = 0;
            this.field1229 = null;
        } else {
            this.field1228 = var2.field3518;
            this.field1227 = var2.field3563 * 128;
            this.field1230 = var2.field3564;
            this.field1231 = var2.field3565;
            this.field1229 = var2.field3566;
        }
        if (this.field1228 != var1 && this.field1232 != null) {
            Statics.field451.method1980(this.field1232);
            this.field1232 = null;
        }
    }

    @ObfuscatedName("ab.m(IIIIB)V")
    public static void method464(int arg0, int arg1, int arg2, int arg3) {
        for (class80 var4 = (class80) field1234.method3752(); var4 != null; var4 = (class80) field1234.method3762()) {
            if (var4.field1228 != -1 || var4.field1229 != null) {
                int var5 = 0;
                if (arg1 > var4.field1225) {
                    var5 += arg1 - var4.field1225;
                } else if (arg1 < var4.field1223) {
                    var5 += var4.field1223 - arg1;
                }
                if (arg2 > var4.field1226) {
                    var5 += arg2 - var4.field1226;
                } else if (arg2 < var4.field1236) {
                    var5 += var4.field1236 - arg2;
                }
                if (var5 - 64 > var4.field1227 || client.field879 == 0 || var4.field1222 != arg0) {
                    if (var4.field1232 != null) {
                        Statics.field451.method1980(var4.field1232);
                        var4.field1232 = null;
                    }
                    if (var4.field1221 != null) {
                        Statics.field451.method1980(var4.field1221);
                        var4.field1221 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field879 * (var4.field1227 - var5) / var4.field1227;
                    if (var4.field1232 != null) {
                        var4.field1232.method2228(var6);
                    } else if (var4.field1228 >= 0) {
                        class105 var7 = class105.method2043(Statics.field741, var4.field1228, 0);
                        if (var7 != null) {
                            class107 var8 = var7.method2040().method2092(Statics.field3371);
                            class117 var9 = class117.method2351(var8, 100, var6);
                            var9.method2227(-1);
                            Statics.field451.method1992(var9);
                            var4.field1232 = var9;
                        }
                    }
                    if (var4.field1221 != null) {
                        var4.field1221.method2228(var6);
                        if (!var4.field1221.method3743()) {
                            var4.field1221 = null;
                        }
                    } else if (var4.field1229 != null && (var4.field1233 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field1229.length);
                        class105 var11 = class105.method2043(Statics.field741, var4.field1229[var10], 0);
                        if (var11 != null) {
                            class107 var12 = var11.method2040().method2092(Statics.field3371);
                            class117 var13 = class117.method2351(var12, 100, var6);
                            var13.method2227(0);
                            Statics.field451.method1992(var13);
                            var4.field1221 = var13;
                            var4.field1233 = var4.field1230 + (int) (Math.random() * (double) (var4.field1231 - var4.field1230));
                        }
                    }
                }
            }
        }
    }
}

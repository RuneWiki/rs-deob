package deob;

@ObfuscatedName("bb")
public final class class70 extends class207 {

    @ObfuscatedName("bb.f")
    public static class208 field1044 = new class208();

    @ObfuscatedName("bb.l")
    public int field1033;

    @ObfuscatedName("bb.w")
    public int field1034;

    @ObfuscatedName("bb.s")
    public int field1041;

    @ObfuscatedName("bb.e")
    public int field1035;

    @ObfuscatedName("bb.a")
    public int field1043;

    @ObfuscatedName("bb.c")
    public int field1037;

    @ObfuscatedName("bb.p")
    public int field1038;

    @ObfuscatedName("bb.r")
    public class271 field1046;

    @ObfuscatedName("bb.m")
    public int field1036;

    @ObfuscatedName("bb.d")
    public class106 field1040;

    @ObfuscatedName("bb.z")
    public int field1042;

    @ObfuscatedName("bb.x")
    public int[] field1032;

    @ObfuscatedName("bb.v")
    public int field1039;

    @ObfuscatedName("bb.g")
    public class106 field1045;

    @ObfuscatedName("bw.f(I)V")
    public static void method1061() {
        for (class70 var0 = (class70) field1044.method3827(); var0 != null; var0 = (class70) field1044.method3829()) {
            if (var0.field1046 != null) {
                var0.method1637();
            }
        }
    }

    @ObfuscatedName("bb.l(B)V")
    public void method1637() {
        int var1 = this.field1036;
        class271 var2 = this.field1046.method4721();
        if (var2 == null) {
            this.field1036 = -1;
            this.field1038 = 0;
            this.field1041 = 0;
            this.field1042 = 0;
            this.field1032 = null;
        } else {
            this.field1036 = var2.field3491;
            this.field1038 = var2.field3450 * 128;
            this.field1041 = var2.field3493;
            this.field1042 = var2.field3494;
            this.field1032 = var2.field3459;
        }
        if (this.field1036 != var1 && this.field1040 != null) {
            Statics.field3384.method1969(this.field1040);
            this.field1040 = null;
        }
    }

    @ObfuscatedName("af.w(IIIII)V")
    public static void method460(int arg0, int arg1, int arg2, int arg3) {
        for (class70 var4 = (class70) field1044.method3827(); var4 != null; var4 = (class70) field1044.method3829()) {
            if (var4.field1036 != -1 || var4.field1032 != null) {
                int var5 = 0;
                if (arg1 > var4.field1043) {
                    var5 += arg1 - var4.field1043;
                } else if (arg1 < var4.field1034) {
                    var5 += var4.field1034 - arg1;
                }
                if (arg2 > var4.field1037) {
                    var5 += arg2 - var4.field1037;
                } else if (arg2 < var4.field1035) {
                    var5 += var4.field1035 - arg2;
                }
                if (var5 - 64 > var4.field1038 || client.field867 == 0 || var4.field1033 != arg0) {
                    if (var4.field1040 != null) {
                        Statics.field3384.method1969(var4.field1040);
                        var4.field1040 = null;
                    }
                    if (var4.field1045 != null) {
                        Statics.field3384.method1969(var4.field1045);
                        var4.field1045 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field867 * (var4.field1038 - var5) / var4.field1038;
                    if (var4.field1040 != null) {
                        var4.field1040.method2184(var6);
                    } else if (var4.field1036 >= 0) {
                        class94 var7 = class94.method2024(Statics.field1940, var4.field1036, 0);
                        if (var7 != null) {
                            class96 var8 = var7.method2034().method2065(Statics.field3354);
                            class106 var9 = class106.method2180(var8, 100, var6);
                            var9.method2183(-1);
                            Statics.field3384.method1967(var9);
                            var4.field1040 = var9;
                        }
                    }
                    if (var4.field1045 != null) {
                        var4.field1045.method2184(var6);
                        if (!var4.field1045.method3819()) {
                            var4.field1045 = null;
                        }
                    } else if (var4.field1032 != null && (var4.field1039 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field1032.length);
                        class94 var11 = class94.method2024(Statics.field1940, var4.field1032[var10], 0);
                        if (var11 != null) {
                            class96 var12 = var11.method2034().method2065(Statics.field3354);
                            class106 var13 = class106.method2180(var12, 100, var6);
                            var13.method2183(0);
                            Statics.field3384.method1967(var13);
                            var4.field1045 = var13;
                            var4.field1039 = var4.field1041 + (int) (Math.random() * (double) (var4.field1042 - var4.field1041));
                        }
                    }
                }
            }
        }
    }
}

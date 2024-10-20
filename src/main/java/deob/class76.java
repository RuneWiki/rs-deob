package deob;

@ObfuscatedName("bg")
public final class class76 extends class181 {

    @ObfuscatedName("bg.z")
    public int field1060;

    @ObfuscatedName("bg.n")
    public static class262 field1066 = new class262();

    @ObfuscatedName("bg.v")
    public int field1073;

    @ObfuscatedName("bg.u")
    public int field1058;

    @ObfuscatedName("bg.r")
    public class254 field1070;

    @ObfuscatedName("bg.p")
    public int field1059;

    @ObfuscatedName("bg.q")
    public int field1061;

    @ObfuscatedName("bg.m")
    public int field1062;

    @ObfuscatedName("bg.y")
    public int field1056;

    @ObfuscatedName("bg.i")
    public class114 field1064;

    @ObfuscatedName("bg.c")
    public int field1065;

    @ObfuscatedName("bg.b")
    public int field1071;

    @ObfuscatedName("bg.o")
    public int[] field1067;

    @ObfuscatedName("bg.a")
    public int field1068;

    @ObfuscatedName("bg.e")
    public class114 field1063;

    @ObfuscatedName("gy.z(I)V")
    public static void method3258() {
        for (class76 var0 = (class76) field1066.method4431(); var0 != null; var0 = (class76) field1066.method4454()) {
            if (var0.field1064 != null) {
                Statics.field105.method2071(var0.field1064);
                var0.field1064 = null;
            }
            if (var0.field1063 != null) {
                Statics.field105.method2071(var0.field1063);
                var0.field1063 = null;
            }
        }
        field1066.method4432();
    }

    @ObfuscatedName("bg.n(B)V")
    public void method1736() {
        int var1 = this.field1056;
        class254 var2 = this.field1070.method4158();
        if (var2 == null) {
            this.field1056 = -1;
            this.field1062 = 0;
            this.field1065 = 0;
            this.field1071 = 0;
            this.field1067 = null;
        } else {
            this.field1056 = var2.field3381;
            this.field1062 = var2.field3382 * 128;
            this.field1065 = var2.field3373;
            this.field1071 = var2.field3384;
            this.field1067 = var2.field3385;
        }
        if (this.field1056 != var1 && this.field1064 != null) {
            Statics.field105.method2071(this.field1064);
            this.field1064 = null;
        }
    }

    @ObfuscatedName("u.v(IIIII)V")
    public static void method42(int arg0, int arg1, int arg2, int arg3) {
        for (class76 var4 = (class76) field1066.method4431(); var4 != null; var4 = (class76) field1066.method4454()) {
            if (var4.field1056 != -1 || var4.field1067 != null) {
                int var5 = 0;
                if (arg1 > var4.field1060) {
                    var5 += arg1 - var4.field1060;
                } else if (arg1 < var4.field1058) {
                    var5 += var4.field1058 - arg1;
                }
                if (arg2 > var4.field1061) {
                    var5 += arg2 - var4.field1061;
                } else if (arg2 < var4.field1059) {
                    var5 += var4.field1059 - arg2;
                }
                if (var5 - 64 > var4.field1062 || client.field869 == 0 || var4.field1073 != arg0) {
                    if (var4.field1064 != null) {
                        Statics.field105.method2071(var4.field1064);
                        var4.field1064 = null;
                    }
                    if (var4.field1063 != null) {
                        Statics.field105.method2071(var4.field1063);
                        var4.field1063 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field869 * (var4.field1062 - var5) / var4.field1062;
                    if (var4.field1064 != null) {
                        var4.field1064.method2293(var6);
                    } else if (var4.field1056 >= 0) {
                        class102 var7 = class102.method2129(Statics.field78, var4.field1056, 0);
                        if (var7 != null) {
                            class104 var8 = var7.method2123().method2163(Statics.field1077);
                            class114 var9 = class114.method2335(var8, 100, var6);
                            var9.method2292(-1);
                            Statics.field105.method2070(var9);
                            var4.field1064 = var9;
                        }
                    }
                    if (var4.field1063 != null) {
                        var4.field1063.method2293(var6);
                        if (!var4.field1063.method3246()) {
                            var4.field1063 = null;
                        }
                    } else if (var4.field1067 != null && (var4.field1068 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field1067.length);
                        class102 var11 = class102.method2129(Statics.field78, var4.field1067[var10], 0);
                        if (var11 != null) {
                            class104 var12 = var11.method2123().method2163(Statics.field1077);
                            class114 var13 = class114.method2335(var12, 100, var6);
                            var13.method2292(0);
                            Statics.field105.method2070(var13);
                            var4.field1063 = var13;
                            var4.field1068 = var4.field1065 + (int) (Math.random() * (double) (var4.field1071 - var4.field1065));
                        }
                    }
                }
            }
        }
    }
}

package deob;

@ObfuscatedName("cz")
public final class class85 extends class190 {

    @ObfuscatedName("cz.h")
    public static class273 field1076 = new class273();

    @ObfuscatedName("cz.v")
    public int field1075;

    @ObfuscatedName("cz.x")
    public int field1077;

    @ObfuscatedName("cz.w")
    public int field1080;

    @ObfuscatedName("cz.t")
    public int field1074;

    @ObfuscatedName("cz.j")
    public int field1079;

    @ObfuscatedName("cz.n")
    public int field1087;

    @ObfuscatedName("cz.p")
    public int field1081;

    @ObfuscatedName("cz.l")
    public class123 field1089;

    @ObfuscatedName("cz.z")
    public int field1086;

    @ObfuscatedName("cz.u")
    public int field1084;

    @ObfuscatedName("cz.e")
    public int[] field1085;

    @ObfuscatedName("cz.m")
    public int field1082;

    @ObfuscatedName("cz.c")
    public class123 field1083;

    @ObfuscatedName("cz.i")
    public class265 field1088;

    @ObfuscatedName("cz.h(I)V")
    public void method1839() {
        int var1 = this.field1081;
        class265 var2 = this.field1088.method4263();
        if (var2 == null) {
            this.field1081 = -1;
            this.field1087 = 0;
            this.field1086 = 0;
            this.field1084 = 0;
            this.field1085 = null;
        } else {
            this.field1081 = var2.field3425;
            this.field1087 = var2.field3409 * 128;
            this.field1086 = var2.field3427;
            this.field1084 = var2.field3389;
            this.field1085 = var2.field3429;
        }
        if (this.field1081 != var1 && this.field1089 != null) {
            Statics.field351.method2185(this.field1089);
            this.field1089 = null;
        }
    }

    @ObfuscatedName("ko.v(IIIII)V")
    public static void method4819(int arg0, int arg1, int arg2, int arg3) {
        for (class85 var4 = (class85) field1076.method4540(); var4 != null; var4 = (class85) field1076.method4545()) {
            if (var4.field1081 != -1 || var4.field1085 != null) {
                int var5 = 0;
                if (arg1 > var4.field1074) {
                    var5 += arg1 - var4.field1074;
                } else if (arg1 < var4.field1080) {
                    var5 += var4.field1080 - arg1;
                }
                if (arg2 > var4.field1079) {
                    var5 += arg2 - var4.field1079;
                } else if (arg2 < var4.field1077) {
                    var5 += var4.field1077 - arg2;
                }
                if (var5 - 64 > var4.field1087 || Statics.field3618.field1061 == 0 || var4.field1075 != arg0) {
                    if (var4.field1089 != null) {
                        Statics.field351.method2185(var4.field1089);
                        var4.field1089 = null;
                    }
                    if (var4.field1083 != null) {
                        Statics.field351.method2185(var4.field1083);
                        var4.field1083 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = Statics.field3618.field1061 * (var4.field1087 - var5) / var4.field1087;
                    if (var4.field1089 != null) {
                        var4.field1089.method2418(var6);
                    } else if (var4.field1081 >= 0) {
                        class111 var7 = class111.method2243(Statics.field2731, var4.field1081, 0);
                        if (var7 != null) {
                            class113 var8 = var7.method2245().method2286(Statics.field1558);
                            class123 var9 = class123.method2414(var8, 100, var6);
                            var9.method2417(-1);
                            Statics.field351.method2184(var9);
                            var4.field1089 = var9;
                        }
                    }
                    if (var4.field1083 != null) {
                        var4.field1083.method2418(var6);
                        if (!var4.field1083.method3360()) {
                            var4.field1083 = null;
                        }
                    } else if (var4.field1085 != null && (var4.field1082 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field1085.length);
                        class111 var11 = class111.method2243(Statics.field2731, var4.field1085[var10], 0);
                        if (var11 != null) {
                            class113 var12 = var11.method2245().method2286(Statics.field1558);
                            class123 var13 = class123.method2414(var12, 100, var6);
                            var13.method2417(0);
                            Statics.field351.method2184(var13);
                            var4.field1083 = var13;
                            var4.field1082 = var4.field1086 + (int) (Math.random() * (double) (var4.field1084 - var4.field1086));
                        }
                    }
                }
            }
        }
    }
}

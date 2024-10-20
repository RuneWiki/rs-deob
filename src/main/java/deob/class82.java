package deob;

@ObfuscatedName("ce")
public final class class82 extends class200 {

    @ObfuscatedName("ce.m")
    public static class201 field1251 = new class201();

    @ObfuscatedName("ce.p")
    public int field1245;

    @ObfuscatedName("ce.i")
    public int field1240;

    @ObfuscatedName("ce.j")
    public int field1241;

    @ObfuscatedName("ce.v")
    public int field1238;

    @ObfuscatedName("ce.x")
    public int field1243;

    @ObfuscatedName("ce.e")
    public int field1242;

    @ObfuscatedName("ce.l")
    public int field1239;

    @ObfuscatedName("ce.b")
    public class117 field1246;

    @ObfuscatedName("ce.n")
    public int field1247;

    @ObfuscatedName("ce.c")
    public int field1248;

    @ObfuscatedName("ce.a")
    public int[] field1249;

    @ObfuscatedName("ce.y")
    public int field1250;

    @ObfuscatedName("ce.w")
    public class117 field1244;

    @ObfuscatedName("ce.k")
    public class263 field1252;

    @ObfuscatedName("iz.m(I)V")
    public static void method4226() {
        for (class82 var0 = (class82) field1251.method3486(); var0 != null; var0 = (class82) field1251.method3507()) {
            if (var0.field1246 != null) {
                Statics.field3676.method1816(var0.field1246);
                var0.field1246 = null;
            }
            if (var0.field1244 != null) {
                Statics.field3676.method1816(var0.field1244);
                var0.field1244 = null;
            }
        }
        field1251.method3506();
    }

    @ObfuscatedName("ce.p(I)V")
    public void method1543() {
        int var1 = this.field1239;
        class263 var2 = this.field1252.method4337();
        if (var2 == null) {
            this.field1239 = -1;
            this.field1242 = 0;
            this.field1247 = 0;
            this.field1248 = 0;
            this.field1249 = null;
        } else {
            this.field1239 = var2.field3533;
            this.field1242 = var2.field3512 * 128;
            this.field1247 = var2.field3534;
            this.field1248 = var2.field3535;
            this.field1249 = var2.field3536;
        }
        if (this.field1239 != var1 && this.field1246 != null) {
            Statics.field3676.method1816(this.field1246);
            this.field1246 = null;
        }
    }

    @ObfuscatedName("im.i(IIILjj;II)V")
    public static void method4279(int arg0, int arg1, int arg2, class263 arg3, int arg4) {
        class82 var5 = new class82();
        var5.field1245 = arg0;
        var5.field1240 = arg1 * 128;
        var5.field1241 = arg2 * 128;
        int var6 = arg3.field3503;
        int var7 = arg3.field3525;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field3525;
            var7 = arg3.field3503;
        }
        var5.field1238 = (arg1 + var6) * 128;
        var5.field1243 = (arg2 + var7) * 128;
        var5.field1239 = arg3.field3533;
        var5.field1242 = arg3.field3512 * 128;
        var5.field1247 = arg3.field3534;
        var5.field1248 = arg3.field3535;
        var5.field1249 = arg3.field3536;
        if (arg3.field3519 != null) {
            var5.field1252 = arg3;
            var5.method1543();
        }
        field1251.method3480(var5);
        if (var5.field1249 != null) {
            var5.field1250 = var5.field1247 + (int) (Math.random() * (double) (var5.field1248 - var5.field1247));
        }
    }

    @ObfuscatedName("cg.j(IIIII)V")
    public static void method1694(int arg0, int arg1, int arg2, int arg3) {
        for (class82 var4 = (class82) field1251.method3486(); var4 != null; var4 = (class82) field1251.method3507()) {
            if (var4.field1239 != -1 || var4.field1249 != null) {
                int var5 = 0;
                if (arg1 > var4.field1238) {
                    var5 += arg1 - var4.field1238;
                } else if (arg1 < var4.field1240) {
                    var5 += var4.field1240 - arg1;
                }
                if (arg2 > var4.field1243) {
                    var5 += arg2 - var4.field1243;
                } else if (arg2 < var4.field1241) {
                    var5 += var4.field1241 - arg2;
                }
                if (var5 - 64 > var4.field1242 || client.field1068 == 0 || var4.field1245 != arg0) {
                    if (var4.field1246 != null) {
                        Statics.field3676.method1816(var4.field1246);
                        var4.field1246 = null;
                    }
                    if (var4.field1244 != null) {
                        Statics.field3676.method1816(var4.field1244);
                        var4.field1244 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field1068 * (var4.field1242 - var5) / var4.field1242;
                    if (var4.field1246 != null) {
                        var4.field1246.method2028(var6);
                    } else if (var4.field1239 >= 0) {
                        class105 var7 = class105.method1859(Statics.field1839, var4.field1239, 0);
                        if (var7 != null) {
                            class107 var8 = var7.method1866().method1908(Statics.field2921);
                            class117 var9 = class117.method2042(var8, 100, var6);
                            var9.method2027(-1);
                            Statics.field3676.method1804(var9);
                            var4.field1246 = var9;
                        }
                    }
                    if (var4.field1244 != null) {
                        var4.field1244.method2028(var6);
                        if (!var4.field1244.method3475()) {
                            var4.field1244 = null;
                        }
                    } else if (var4.field1249 != null && (var4.field1250 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field1249.length);
                        class105 var11 = class105.method1859(Statics.field1839, var4.field1249[var10], 0);
                        if (var11 != null) {
                            class107 var12 = var11.method1866().method1908(Statics.field2921);
                            class117 var13 = class117.method2042(var12, 100, var6);
                            var13.method2027(0);
                            Statics.field3676.method1804(var13);
                            var4.field1244 = var13;
                            var4.field1250 = var4.field1247 + (int) (Math.random() * (double) (var4.field1248 - var4.field1247));
                        }
                    }
                }
            }
        }
    }
}

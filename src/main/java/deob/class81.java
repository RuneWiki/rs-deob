package deob;

@ObfuscatedName("cl")
public final class class81 extends class217 {

    @ObfuscatedName("cl.d")
    public static class218 field1254 = new class218();

    @ObfuscatedName("cl.z")
    public int field1244;

    @ObfuscatedName("cl.n")
    public int field1241;

    @ObfuscatedName("cl.r")
    public class283 field1243;

    @ObfuscatedName("cl.e")
    public int field1242;

    @ObfuscatedName("cl.y")
    public int field1257;

    @ObfuscatedName("cl.k")
    public int field1247;

    @ObfuscatedName("cl.s")
    public int field1249;

    @ObfuscatedName("cl.p")
    public int field1246;

    @ObfuscatedName("cl.x")
    public int field1245;

    @ObfuscatedName("cl.m")
    public class116 field1248;

    @ObfuscatedName("cl.h")
    public int field1250;

    @ObfuscatedName("cl.t")
    public int[] field1251;

    @ObfuscatedName("cl.i")
    public int field1252;

    @ObfuscatedName("cl.u")
    public class116 field1253;

    @ObfuscatedName("y.d(I)V")
    public static void method17() {
        for (class81 var0 = (class81) field1254.method3798(); var0 != null; var0 = (class81) field1254.method3800()) {
            if (var0.field1248 != null) {
                Statics.field432.method1968(var0.field1248);
                var0.field1248 = null;
            }
            if (var0.field1253 != null) {
                Statics.field432.method1968(var0.field1253);
                var0.field1253 = null;
            }
        }
        field1254.method3792();
    }

    @ObfuscatedName("cl.z(I)V")
    public void method1652() {
        int var1 = this.field1245;
        class283 var2 = this.field1243.method4723();
        if (var2 == null) {
            this.field1245 = -1;
            this.field1246 = 0;
            this.field1249 = 0;
            this.field1250 = 0;
            this.field1251 = null;
        } else {
            this.field1245 = var2.field3633;
            this.field1246 = var2.field3600 * 128;
            this.field1249 = var2.field3634;
            this.field1250 = var2.field3636;
            this.field1251 = var2.field3597;
        }
        if (this.field1245 != var1 && this.field1248 != null) {
            Statics.field432.method1968(this.field1248);
            this.field1248 = null;
        }
    }

    @ObfuscatedName("kq.n(IIILjd;IB)V")
    public static void method4984(int arg0, int arg1, int arg2, class283 arg3, int arg4) {
        class81 var5 = new class81();
        var5.field1241 = arg0;
        var5.field1242 = arg1 * 128;
        var5.field1257 = arg2 * 128;
        int var6 = arg3.field3604;
        int var7 = arg3.field3605;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field3605;
            var7 = arg3.field3604;
        }
        var5.field1244 = (arg1 + var6) * 128;
        var5.field1247 = (arg2 + var7) * 128;
        var5.field1245 = arg3.field3633;
        var5.field1246 = arg3.field3600 * 128;
        var5.field1249 = arg3.field3634;
        var5.field1250 = arg3.field3636;
        var5.field1251 = arg3.field3597;
        if (arg3.field3630 != null) {
            var5.field1243 = arg3;
            var5.method1652();
        }
        field1254.method3793(var5);
        if (var5.field1251 != null) {
            var5.field1252 = var5.field1249 + (int) (Math.random() * (double) (var5.field1250 - var5.field1249));
        }
    }

    @ObfuscatedName("t.r(IIIII)V")
    public static void method64(int arg0, int arg1, int arg2, int arg3) {
        for (class81 var4 = (class81) field1254.method3798(); var4 != null; var4 = (class81) field1254.method3800()) {
            if (var4.field1245 != -1 || var4.field1251 != null) {
                int var5 = 0;
                if (arg1 > var4.field1244) {
                    var5 += arg1 - var4.field1244;
                } else if (arg1 < var4.field1242) {
                    var5 += var4.field1242 - arg1;
                }
                if (arg2 > var4.field1247) {
                    var5 += arg2 - var4.field1247;
                } else if (arg2 < var4.field1257) {
                    var5 += var4.field1257 - arg2;
                }
                if (var5 - 64 > var4.field1246 || client.field912 == 0 || var4.field1241 != arg0) {
                    if (var4.field1248 != null) {
                        Statics.field432.method1968(var4.field1248);
                        var4.field1248 = null;
                    }
                    if (var4.field1253 != null) {
                        Statics.field432.method1968(var4.field1253);
                        var4.field1253 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field912 * (var4.field1246 - var5) / var4.field1246;
                    if (var4.field1248 != null) {
                        var4.field1248.method2177(var6);
                    } else if (var4.field1245 >= 0) {
                        class104 var7 = class104.method2011(Statics.field2279, var4.field1245, 0);
                        if (var7 != null) {
                            class106 var8 = var7.method2001().method2050(Statics.field674);
                            class116 var9 = class116.method2174(var8, 100, var6);
                            var9.method2176(-1);
                            Statics.field432.method1942(var9);
                            var4.field1248 = var9;
                        }
                    }
                    if (var4.field1253 != null) {
                        var4.field1253.method2177(var6);
                        if (!var4.field1253.method3786()) {
                            var4.field1253 = null;
                        }
                    } else if (var4.field1251 != null && (var4.field1252 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field1251.length);
                        class104 var11 = class104.method2011(Statics.field2279, var4.field1251[var10], 0);
                        if (var11 != null) {
                            class106 var12 = var11.method2001().method2050(Statics.field674);
                            class116 var13 = class116.method2174(var12, 100, var6);
                            var13.method2176(0);
                            Statics.field432.method1942(var13);
                            var4.field1253 = var13;
                            var4.field1252 = var4.field1249 + (int) (Math.random() * (double) (var4.field1250 - var4.field1249));
                        }
                    }
                }
            }
        }
    }
}

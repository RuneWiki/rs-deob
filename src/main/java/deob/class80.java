package deob;

@ObfuscatedName("cv")
public final class class80 extends class204 {

    @ObfuscatedName("cv.p")
    public static class205 field1209 = new class205();

    @ObfuscatedName("cv.i")
    public int field1202;

    @ObfuscatedName("cv.w")
    public int field1211;

    @ObfuscatedName("cv.s")
    public int field1204;

    @ObfuscatedName("cv.j")
    public int field1206;

    @ObfuscatedName("cv.a")
    public int field1203;

    @ObfuscatedName("cv.t")
    public int field1207;

    @ObfuscatedName("cv.r")
    public class267 field1216;

    @ObfuscatedName("cv.m")
    public int field1205;

    @ObfuscatedName("cv.h")
    public int field1208;

    @ObfuscatedName("cv.o")
    public class115 field1210;

    @ObfuscatedName("cv.x")
    public int field1212;

    @ObfuscatedName("cv.q")
    public int[] field1213;

    @ObfuscatedName("cv.v")
    public int field1214;

    @ObfuscatedName("cv.n")
    public class115 field1215;

    @ObfuscatedName("dx.p(I)V")
    public static void method2362() {
        for (class80 var0 = (class80) field1209.method3581(); var0 != null; var0 = (class80) field1209.method3597()) {
            if (var0.field1210 != null) {
                Statics.field1252.method1940(var0.field1210);
                var0.field1210 = null;
            }
            if (var0.field1215 != null) {
                Statics.field1252.method1940(var0.field1215);
                var0.field1215 = null;
            }
        }
        field1209.method3586();
    }

    @ObfuscatedName("cv.i(B)V")
    public void method1625() {
        int var1 = this.field1208;
        class267 var2 = this.field1216.method4438();
        if (var2 == null) {
            this.field1208 = -1;
            this.field1205 = 0;
            this.field1204 = 0;
            this.field1212 = 0;
            this.field1213 = null;
        } else {
            this.field1208 = var2.field3545;
            this.field1205 = var2.field3539 * 128;
            this.field1204 = var2.field3522;
            this.field1212 = var2.field3528;
            this.field1213 = var2.field3544;
        }
        if (this.field1208 != var1 && this.field1210 != null) {
            Statics.field1252.method1940(this.field1210);
            this.field1210 = null;
        }
    }

    @ObfuscatedName("q.w(IIILjv;II)V")
    public static void method75(int arg0, int arg1, int arg2, class267 arg3, int arg4) {
        class80 var5 = new class80();
        var5.field1202 = arg0;
        var5.field1211 = arg1 * 128;
        var5.field1206 = arg2 * 128;
        int var6 = arg3.field3511;
        int var7 = arg3.field3512;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field3512;
            var7 = arg3.field3511;
        }
        var5.field1203 = (arg1 + var6) * 128;
        var5.field1207 = (arg2 + var7) * 128;
        var5.field1208 = arg3.field3545;
        var5.field1205 = arg3.field3539 * 128;
        var5.field1204 = arg3.field3522;
        var5.field1212 = arg3.field3528;
        var5.field1213 = arg3.field3544;
        if (arg3.field3529 != null) {
            var5.field1216 = arg3;
            var5.method1625();
        }
        field1209.method3572(var5);
        if (var5.field1213 != null) {
            var5.field1214 = var5.field1204 + (int) (Math.random() * (double) (var5.field1212 - var5.field1204));
        }
    }

    @ObfuscatedName("bo.s(IIIIB)V")
    public static void method1031(int arg0, int arg1, int arg2, int arg3) {
        for (class80 var4 = (class80) field1209.method3581(); var4 != null; var4 = (class80) field1209.method3597()) {
            if (var4.field1208 != -1 || var4.field1213 != null) {
                int var5 = 0;
                if (arg1 > var4.field1203) {
                    var5 += arg1 - var4.field1203;
                } else if (arg1 < var4.field1211) {
                    var5 += var4.field1211 - arg1;
                }
                if (arg2 > var4.field1207) {
                    var5 += arg2 - var4.field1207;
                } else if (arg2 < var4.field1206) {
                    var5 += var4.field1206 - arg2;
                }
                if (var5 - 64 > var4.field1205 || client.field880 == 0 || var4.field1202 != arg0) {
                    if (var4.field1210 != null) {
                        Statics.field1252.method1940(var4.field1210);
                        var4.field1210 = null;
                    }
                    if (var4.field1215 != null) {
                        Statics.field1252.method1940(var4.field1215);
                        var4.field1215 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field880 * (var4.field1205 - var5) / var4.field1205;
                    if (var4.field1210 != null) {
                        var4.field1210.method2127(var6);
                    } else if (var4.field1208 >= 0) {
                        class103 var7 = class103.method1961(Statics.field326, var4.field1208, 0);
                        if (var7 != null) {
                            class105 var8 = var7.method1965().method2004(Statics.field2407);
                            class115 var9 = class115.method2124(var8, 100, var6);
                            var9.method2126(-1);
                            Statics.field1252.method1938(var9);
                            var4.field1210 = var9;
                        }
                    }
                    if (var4.field1215 != null) {
                        var4.field1215.method2127(var6);
                        if (!var4.field1215.method3563()) {
                            var4.field1215 = null;
                        }
                    } else if (var4.field1213 != null && (var4.field1214 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field1213.length);
                        class103 var11 = class103.method1961(Statics.field326, var4.field1213[var10], 0);
                        if (var11 != null) {
                            class105 var12 = var11.method1965().method2004(Statics.field2407);
                            class115 var13 = class115.method2124(var12, 100, var6);
                            var13.method2126(0);
                            Statics.field1252.method1938(var13);
                            var4.field1215 = var13;
                            var4.field1214 = var4.field1204 + (int) (Math.random() * (double) (var4.field1212 - var4.field1204));
                        }
                    }
                }
            }
        }
    }
}

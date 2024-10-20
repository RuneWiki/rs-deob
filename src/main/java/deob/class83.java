package deob;

@ObfuscatedName("ct")
public final class class83 extends class194 {

    @ObfuscatedName("ct.j")
    public static class195 field1331 = new class195();

    @ObfuscatedName("ct.h")
    public int field1322;

    @ObfuscatedName("ct.f")
    public int field1318;

    @ObfuscatedName("ct.p")
    public int field1328;

    @ObfuscatedName("ct.x")
    public int field1320;

    @ObfuscatedName("ct.g")
    public int field1323;

    @ObfuscatedName("ct.c")
    public int field1326;

    @ObfuscatedName("ct.l")
    public int field1327;

    @ObfuscatedName("ct.w")
    public class119 field1324;

    @ObfuscatedName("ct.b")
    public int field1325;

    @ObfuscatedName("ct.o")
    public int field1332;

    @ObfuscatedName("ct.m")
    public int[] field1317;

    @ObfuscatedName("ct.i")
    public int field1316;

    @ObfuscatedName("ct.s")
    public class119 field1329;

    @ObfuscatedName("ct.r")
    public class257 field1330;

    @ObfuscatedName("by.j(B)V")
    public static void method758() {
        for (class83 var0 = (class83) field1331.method3326(); var0 != null; var0 = (class83) field1331.method3323()) {
            if (var0.field1324 != null) {
                Statics.field680.method1766(var0.field1324);
                var0.field1324 = null;
            }
            if (var0.field1329 != null) {
                Statics.field680.method1766(var0.field1329);
                var0.field1329 = null;
            }
        }
        field1331.method3334();
    }

    @ObfuscatedName("bh.h(B)V")
    public static void method918() {
        for (class83 var0 = (class83) field1331.method3326(); var0 != null; var0 = (class83) field1331.method3323()) {
            if (var0.field1330 != null) {
                var0.method1461();
            }
        }
    }

    @ObfuscatedName("ct.f(B)V")
    public void method1461() {
        int var1 = this.field1327;
        class257 var2 = this.field1330.method4210();
        if (var2 == null) {
            this.field1327 = -1;
            this.field1326 = 0;
            this.field1325 = 0;
            this.field1332 = 0;
            this.field1317 = null;
        } else {
            this.field1327 = var2.field3471;
            this.field1326 = var2.field3438 * 128;
            this.field1325 = var2.field3473;
            this.field1332 = var2.field3435;
            this.field1317 = var2.field3475;
        }
        if (this.field1327 != var1 && this.field1324 != null) {
            Statics.field680.method1766(this.field1324);
            this.field1324 = null;
        }
    }

    @ObfuscatedName("fc.p(IIILih;II)V")
    public static void method2783(int arg0, int arg1, int arg2, class257 arg3, int arg4) {
        class83 var5 = new class83();
        var5.field1322 = arg0;
        var5.field1318 = arg1 * 128;
        var5.field1328 = arg2 * 128;
        int var6 = arg3.field3442;
        int var7 = arg3.field3443;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field3443;
            var7 = arg3.field3442;
        }
        var5.field1320 = (arg1 + var6) * 128;
        var5.field1323 = (arg2 + var7) * 128;
        var5.field1327 = arg3.field3471;
        var5.field1326 = arg3.field3438 * 128;
        var5.field1325 = arg3.field3473;
        var5.field1332 = arg3.field3435;
        var5.field1317 = arg3.field3475;
        if (arg3.field3468 != null) {
            var5.field1330 = arg3;
            var5.method1461();
        }
        field1331.method3317(var5);
        if (var5.field1317 != null) {
            var5.field1316 = var5.field1325 + (int) (Math.random() * (double) (var5.field1332 - var5.field1325));
        }
    }
}

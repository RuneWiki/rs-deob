package deob;

@ObfuscatedName("co")
public final class class83 extends class193 {

    @ObfuscatedName("co.e")
    public static class194 field1333 = new class194();

    @ObfuscatedName("co.o")
    public int field1321;

    @ObfuscatedName("co.m")
    public int field1322;

    @ObfuscatedName("co.g")
    public int field1323;

    @ObfuscatedName("co.d")
    public int field1331;

    @ObfuscatedName("co.b")
    public int field1320;

    @ObfuscatedName("co.k")
    public int field1337;

    @ObfuscatedName("co.f")
    public int field1327;

    @ObfuscatedName("co.j")
    public class118 field1328;

    @ObfuscatedName("co.q")
    public int field1329;

    @ObfuscatedName("co.h")
    public int field1324;

    @ObfuscatedName("co.i")
    public int[] field1332;

    @ObfuscatedName("co.s")
    public int field1326;

    @ObfuscatedName("co.n")
    public class118 field1330;

    @ObfuscatedName("co.c")
    public class256 field1334;

    @ObfuscatedName("o.e(S)V")
    public static void method2() {
        for (class83 var0 = (class83) field1333.method3336(); var0 != null; var0 = (class83) field1333.method3324()) {
            if (var0.field1328 != null) {
                Statics.field2368.method1709(var0.field1328);
                var0.field1328 = null;
            }
            if (var0.field1330 != null) {
                Statics.field2368.method1709(var0.field1330);
                var0.field1330 = null;
            }
        }
        field1333.method3312();
    }

    @ObfuscatedName("h.o(I)V")
    public static void method35() {
        for (class83 var0 = (class83) field1333.method3336(); var0 != null; var0 = (class83) field1333.method3324()) {
            if (var0.field1334 != null) {
                var0.method1458();
            }
        }
    }

    @ObfuscatedName("co.m(B)V")
    public void method1458() {
        int var1 = this.field1327;
        class256 var2 = this.field1334.method4154();
        if (var2 == null) {
            this.field1327 = -1;
            this.field1337 = 0;
            this.field1329 = 0;
            this.field1324 = 0;
            this.field1332 = null;
        } else {
            this.field1327 = var2.field3442;
            this.field1337 = var2.field3460 * 128;
            this.field1329 = var2.field3461;
            this.field1324 = var2.field3462;
            this.field1332 = var2.field3463;
        }
        if (this.field1327 != var1 && this.field1328 != null) {
            Statics.field2368.method1709(this.field1328);
            this.field1328 = null;
        }
    }
}

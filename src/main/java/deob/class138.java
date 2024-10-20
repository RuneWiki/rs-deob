package deob;

@ObfuscatedName("et")
public class class138 {

    @ObfuscatedName("et.n")
    public static int field2324 = 0;

    public class138() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("t.m(Leo;IIIZS)V")
    public static void method98(class152 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2324 = 1;
        Statics.field2320 = arg0;
        Statics.field2301 = arg1;
        Statics.field2316 = arg2;
        Statics.field1293 = arg3;
        Statics.field1454 = arg4;
        Statics.field1417 = 10000;
    }

    @ObfuscatedName("be.v(IB)V")
    public static void method1286(int arg0) {
        field2324 = 1;
        Statics.field2320 = null;
        Statics.field2301 = -1;
        Statics.field2316 = -1;
        Statics.field1293 = 0;
        Statics.field1454 = false;
        Statics.field1417 = arg0;
    }

    @ObfuscatedName("i.r(I)V")
    public static void method43() {
        try {
            if (field2324 == 1) {
                int var0 = Statics.field1752.method2702();
                if (var0 > 0 && Statics.field1752.method2708()) {
                    int var1 = var0 - Statics.field1417;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field1752.method2715(var1);
                    return;
                }
                Statics.field1752.method2712();
                Statics.field1752.method2705();
                if (Statics.field2320 == null) {
                    field2324 = 0;
                } else {
                    field2324 = 2;
                }
                Statics.field6 = null;
                Statics.field16 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field1752.method2712();
            field2324 = 0;
            Statics.field6 = null;
            Statics.field16 = null;
            Statics.field2320 = null;
        }
    }

    @ObfuscatedName("b.n(I)Z")
    public static boolean method116() {
        try {
            if (field2324 == 2) {
                if (Statics.field6 == null) {
                    Statics.field6 = class139.method2680(Statics.field2320, Statics.field2301, Statics.field2316);
                    if (Statics.field6 == null) {
                        return false;
                    }
                }
                if (Statics.field16 == null) {
                    Statics.field16 = new class58(Statics.field2317, Statics.field2319);
                }
                if (Statics.field1752.method2703(Statics.field6, Statics.field2455, Statics.field16, 22050)) {
                    Statics.field1752.method2759();
                    Statics.field1752.method2715(Statics.field1293);
                    Statics.field1752.method2706(Statics.field6, Statics.field1454);
                    field2324 = 0;
                    Statics.field6 = null;
                    Statics.field16 = null;
                    Statics.field2320 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field1752.method2712();
            field2324 = 0;
            Statics.field6 = null;
            Statics.field16 = null;
            Statics.field2320 = null;
        }
        return false;
    }
}

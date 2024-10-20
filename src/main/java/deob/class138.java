package deob;

@ObfuscatedName("ee")
public class class138 {

    @ObfuscatedName("ee.q")
    public static int field2345 = 0;

    public class138() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("j.p(Lef;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method121(class152 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method3012(arg1);
        int var6 = arg0.method2951(var5, arg2);
        method2650(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("ej.a(Lef;IIIZI)V")
    public static void method2650(class152 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2345 = 1;
        Statics.field1518 = arg0;
        Statics.field2344 = arg1;
        Statics.field2347 = arg2;
        Statics.field155 = arg3;
        Statics.field2715 = arg4;
        Statics.field2327 = 10000;
    }

    @ObfuscatedName("g.l(ILef;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method158(int arg0, class152 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method3012(arg2);
        int var7 = arg1.method2951(var6, arg3);
        method1303(arg0, arg1, var6, var7, arg4, arg5);
    }

    @ObfuscatedName("bg.q(ILef;IIIZI)V")
    public static void method1303(int arg0, class152 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2345 = 1;
        Statics.field1518 = arg1;
        Statics.field2344 = arg2;
        Statics.field2347 = arg3;
        Statics.field155 = arg4;
        Statics.field2715 = arg5;
        Statics.field2327 = arg0;
    }

    @ObfuscatedName("ed.b(II)V")
    public static void method2662(int arg0) {
        field2345 = 1;
        Statics.field1518 = null;
        Statics.field2344 = -1;
        Statics.field2347 = -1;
        Statics.field155 = 0;
        Statics.field2715 = false;
        Statics.field2327 = arg0;
    }

    @ObfuscatedName("client.u(B)Z")
    public static boolean method542() {
        return field2345 == 0 ? Statics.field2346.method2711() : true;
    }

    @ObfuscatedName("r.d(I)V")
    public static void method230() {
        try {
            if (field2345 == 1) {
                int var0 = Statics.field2346.method2705();
                if (var0 > 0 && Statics.field2346.method2711()) {
                    int var1 = var0 - Statics.field2327;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field2346.method2704(var1);
                    return;
                }
                Statics.field2346.method2710();
                Statics.field2346.method2708();
                if (Statics.field1518 == null) {
                    field2345 = 0;
                } else {
                    field2345 = 2;
                }
                Statics.field2348 = null;
                Statics.field1670 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field2346.method2710();
            field2345 = 0;
            Statics.field2348 = null;
            Statics.field1670 = null;
            Statics.field1518 = null;
        }
    }

    @ObfuscatedName("h.m(I)Z")
    public static boolean method135() {
        try {
            if (field2345 == 2) {
                if (Statics.field2348 == null) {
                    Statics.field2348 = class139.method2693(Statics.field1518, Statics.field2344, Statics.field2347);
                    if (Statics.field2348 == null) {
                        return false;
                    }
                }
                if (Statics.field1670 == null) {
                    Statics.field1670 = new class58(Statics.field2343, Statics.field1984);
                }
                if (Statics.field2346.method2782(Statics.field2348, Statics.field2342, Statics.field1670, 22050)) {
                    Statics.field2346.method2707();
                    Statics.field2346.method2704(Statics.field155);
                    Statics.field2346.method2709(Statics.field2348, Statics.field2715);
                    field2345 = 0;
                    Statics.field2348 = null;
                    Statics.field1670 = null;
                    Statics.field1518 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field2346.method2710();
            field2345 = 0;
            Statics.field2348 = null;
            Statics.field1670 = null;
            Statics.field1518 = null;
        }
        return false;
    }
}

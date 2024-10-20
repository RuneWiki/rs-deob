package deob;

@ObfuscatedName("eh")
public class class138 {

    @ObfuscatedName("eh.t")
    public static int field2338 = 0;

    public class138() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("f.i(Leg;Ljava/lang/String;Ljava/lang/String;IZB)V")
    public static void method24(class152 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method2985(arg1);
        int var6 = arg0.method3004(var5, arg2);
        method3160(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("ff.w(Leg;IIIZB)V")
    public static void method3160(class152 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2338 = 1;
        Statics.field2343 = arg0;
        Statics.field2034 = arg1;
        Statics.field1801 = arg2;
        Statics.field2452 = arg3;
        Statics.field966 = arg4;
        Statics.field1267 = 10000;
    }

    @ObfuscatedName("ci.f(II)V")
    public static void method2037(int arg0) {
        if (field2338 == 0) {
            Statics.field2342.method2763(arg0);
        } else {
            Statics.field2452 = arg0;
        }
    }

    @ObfuscatedName("t.e(ILeg;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method35(int arg0, class152 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method2985(arg2);
        int var7 = arg1.method3004(var6, arg3);
        method44(arg0, arg1, var6, var7, arg4, arg5);
    }

    @ObfuscatedName("p.t(ILeg;IIIZB)V")
    public static void method44(int arg0, class152 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2338 = 1;
        Statics.field2343 = arg1;
        Statics.field2034 = arg2;
        Statics.field1801 = arg3;
        Statics.field2452 = arg4;
        Statics.field966 = arg5;
        Statics.field1267 = arg0;
    }

    @ObfuscatedName("x.d(II)V")
    public static void method249(int arg0) {
        field2338 = 1;
        Statics.field2343 = null;
        Statics.field2034 = -1;
        Statics.field1801 = -1;
        Statics.field2452 = 0;
        Statics.field966 = false;
        Statics.field1267 = arg0;
    }

    @ObfuscatedName("d.p(I)V")
    public static void method39() {
        try {
            if (field2338 == 1) {
                int var0 = Statics.field2342.method2716();
                if (var0 > 0 && Statics.field2342.method2722()) {
                    int var1 = var0 - Statics.field1267;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field2342.method2763(var1);
                    return;
                }
                Statics.field2342.method2747();
                Statics.field2342.method2719();
                if (Statics.field2343 == null) {
                    field2338 = 0;
                } else {
                    field2338 = 2;
                }
                Statics.field1802 = null;
                Statics.field395 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field2342.method2747();
            field2338 = 0;
            Statics.field1802 = null;
            Statics.field395 = null;
            Statics.field2343 = null;
        }
    }

    @ObfuscatedName("dx.k(B)Z")
    public static boolean method2315() {
        try {
            if (field2338 == 2) {
                if (Statics.field1802 == null) {
                    Statics.field1802 = class139.method2705(Statics.field2343, Statics.field2034, Statics.field1801);
                    if (Statics.field1802 == null) {
                        return false;
                    }
                }
                if (Statics.field395 == null) {
                    Statics.field395 = new class58(Statics.field2340, Statics.field2339);
                }
                if (Statics.field2342.method2717(Statics.field1802, Statics.field2341, Statics.field395, 22050)) {
                    Statics.field2342.method2718();
                    Statics.field2342.method2763(Statics.field2452);
                    Statics.field2342.method2720(Statics.field1802, Statics.field966);
                    field2338 = 0;
                    Statics.field1802 = null;
                    Statics.field395 = null;
                    Statics.field2343 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field2342.method2747();
            field2338 = 0;
            Statics.field1802 = null;
            Statics.field395 = null;
            Statics.field2343 = null;
        }
        return false;
    }
}

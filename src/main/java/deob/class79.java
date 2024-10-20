package deob;

@ObfuscatedName("eh")
public class class79 {

    @ObfuscatedName("eh.h")
    public static int field881 = 0;

    public class79() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dj.n(B)Z")
    public static boolean method728() {
        try {
            if (field881 == 2) {
                if (Statics.field350 == null) {
                    Statics.field350 = class55.method809(Statics.field885, Statics.field1390, Statics.field1384);
                    if (Statics.field350 == null) {
                        return false;
                    }
                }
                if (Statics.field888 == null) {
                    Statics.field888 = new class126(Statics.field883, Statics.field882);
                }
                if (Statics.field884.method1192(Statics.field350, Statics.field886, Statics.field888, 22050)) {
                    Statics.field884.method1193();
                    Statics.field884.method1190(Statics.field1856);
                    Statics.field884.method1195(Statics.field350, Statics.field2201);
                    field881 = 0;
                    Statics.field350 = null;
                    Statics.field888 = null;
                    Statics.field885 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field884.method1196();
            field881 = 0;
            Statics.field350 = null;
            Statics.field888 = null;
            Statics.field885 = null;
        }
        return false;
    }

    @ObfuscatedName("z.p(Leg;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method1489(class81 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method1098(arg1);
        int var6 = arg0.method1099(var5, arg2);
        method3142(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("br.j(Leg;Leg;Leg;Lel;B)Z")
    public static boolean method1946(class81 arg0, class81 arg1, class81 arg2, class87 arg3) {
        Statics.field886 = arg0;
        Statics.field882 = arg1;
        Statics.field883 = arg2;
        Statics.field884 = arg3;
        return true;
    }

    @ObfuscatedName("bt.h(ILeg;IIIZB)V")
    public static void method1982(int arg0, class81 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field881 = 1;
        Statics.field885 = arg1;
        Statics.field1390 = arg2;
        Statics.field1384 = arg3;
        Statics.field1856 = arg4;
        Statics.field2201 = arg5;
        Statics.field1098 = arg0;
    }

    @ObfuscatedName("ck.t(I)V")
    public static void method2782() {
        Statics.field884.method1196();
        field881 = 1;
        Statics.field885 = null;
    }

    @ObfuscatedName("ar.o(Leg;IIIZB)V")
    public static void method3142(class81 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field881 = 1;
        Statics.field885 = arg0;
        Statics.field1390 = arg1;
        Statics.field1384 = arg2;
        Statics.field1856 = arg3;
        Statics.field2201 = arg4;
        Statics.field1098 = 10000;
    }

    @ObfuscatedName("ar.r(B)V")
    public static void method3168() {
        try {
            if (field881 == 1) {
                int var0 = Statics.field884.method1191();
                if (var0 > 0 && Statics.field884.method1197()) {
                    int var1 = var0 - Statics.field1098;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field884.method1190(var1);
                    return;
                }
                Statics.field884.method1196();
                Statics.field884.method1194();
                if (Statics.field885 == null) {
                    field881 = 0;
                } else {
                    field881 = 2;
                }
                Statics.field350 = null;
                Statics.field888 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field884.method1196();
            field881 = 0;
            Statics.field350 = null;
            Statics.field888 = null;
            Statics.field885 = null;
        }
    }
}

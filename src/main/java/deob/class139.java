package deob;

@ObfuscatedName("en")
public class class139 {

    @ObfuscatedName("en.u")
    public static int field2347 = 0;

    public class139() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ef.j(Lew;Ljava/lang/String;Ljava/lang/String;IZS)V")
    public static void method2717(class153 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method3074(arg1);
        int var6 = arg0.method3038(var5, arg2);
        method8(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("f.f(Lew;IIIZB)V")
    public static void method8(class153 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2347 = 1;
        Statics.field2346 = arg0;
        Statics.field1997 = arg1;
        Statics.field365 = arg2;
        Statics.field1266 = arg3;
        Statics.field2729 = arg4;
        Statics.field2349 = 10000;
    }

    @ObfuscatedName("bl.o(II)V")
    public static void method1287(int arg0) {
        if (field2347 == 0) {
            Statics.field2345.method2782(arg0);
        } else {
            Statics.field1266 = arg0;
        }
    }

    @ObfuscatedName("bt.h(ILew;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method1355(int arg0, class153 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method3074(arg2);
        int var7 = arg1.method3038(var6, arg3);
        method2392(arg0, arg1, var6, var7, arg4, arg5);
    }

    @ObfuscatedName("de.u(ILew;IIIZI)V")
    public static void method2392(int arg0, class153 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2347 = 1;
        Statics.field2346 = arg1;
        Statics.field1997 = arg2;
        Statics.field365 = arg3;
        Statics.field1266 = arg4;
        Statics.field2729 = arg5;
        Statics.field2349 = arg0;
    }

    @ObfuscatedName("n.a(IS)V")
    public static void method102(int arg0) {
        field2347 = 1;
        Statics.field2346 = null;
        Statics.field1997 = -1;
        Statics.field365 = -1;
        Statics.field1266 = 0;
        Statics.field2729 = false;
        Statics.field2349 = arg0;
    }

    @ObfuscatedName("fl.q(I)V")
    public static void method3247() {
        try {
            if (field2347 == 1) {
                int var0 = Statics.field2345.method2800();
                if (var0 > 0 && Statics.field2345.method2870()) {
                    int var1 = var0 - Statics.field2349;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field2345.method2782(var1);
                    return;
                }
                Statics.field2345.method2850();
                Statics.field2345.method2819();
                if (Statics.field2346 == null) {
                    field2347 = 0;
                } else {
                    field2347 = 2;
                }
                Statics.field2350 = null;
                Statics.field1796 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field2345.method2850();
            field2347 = 0;
            Statics.field2350 = null;
            Statics.field1796 = null;
            Statics.field2346 = null;
        }
    }
}

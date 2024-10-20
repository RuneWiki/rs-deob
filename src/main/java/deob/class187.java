package deob;

@ObfuscatedName("gt")
public class class187 {

    @ObfuscatedName("gt.g")
    public static int field3005 = 0;

    public class187() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ct.e(II)V")
    public static void method1672(int arg0) {
        if (field3005 == 0) {
            Statics.field3008.method3430(arg0);
        } else {
            Statics.field904 = arg0;
        }
    }

    @ObfuscatedName("au.o(I)V")
    public static void method935() {
        Statics.field3008.method3509();
        field3005 = 1;
        Statics.field2090 = null;
    }

    @ObfuscatedName("ct.g(ILfa;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method1675(int arg0, class171 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method3101(arg2);
        int var7 = arg1.method3150(var6, arg3);
        field3005 = 1;
        Statics.field2090 = arg1;
        Statics.field1835 = var6;
        Statics.field3010 = var7;
        Statics.field904 = arg4;
        Statics.field2112 = arg5;
        Statics.field3011 = arg0;
    }

    @ObfuscatedName("ex.l(I)Z")
    public static boolean method2982() {
        return field3005 == 0 ? Statics.field3008.method3437() : true;
    }

    @ObfuscatedName("b.j(I)V")
    public static void method585() {
        try {
            if (field3005 == 1) {
                int var0 = Statics.field3008.method3431();
                if (var0 > 0 && Statics.field3008.method3437()) {
                    int var1 = var0 - Statics.field3011;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field3008.method3430(var1);
                    return;
                }
                Statics.field3008.method3509();
                Statics.field3008.method3527();
                if (Statics.field2090 == null) {
                    field3005 = 0;
                } else {
                    field3005 = 2;
                }
                Statics.field153 = null;
                Statics.field2138 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field3008.method3509();
            field3005 = 0;
            Statics.field153 = null;
            Statics.field2138 = null;
            Statics.field2090 = null;
        }
    }
}

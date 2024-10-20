package deob;

@ObfuscatedName("go")
public class class184 {

    @ObfuscatedName("go.x")
    public static int field2954 = 0;

    public class184() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fs.b(Lfl;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method3153(class168 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method3052(arg1);
        int var6 = arg0.method3053(var5, arg2);
        Statics.method1778(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("ee.j(II)V")
    public static void method2791(int arg0) {
        if (field2954 == 0) {
            Statics.field2953.method3372(arg0);
        } else {
            Statics.field2930 = arg0;
        }
    }

    @ObfuscatedName("w.d(ILfl;IIIZI)V")
    public static void method152(int arg0, class168 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2954 = 1;
        Statics.field1076 = arg1;
        Statics.field2904 = arg2;
        Statics.field2952 = arg3;
        Statics.field2930 = arg4;
        Statics.field2957 = arg5;
        Statics.field2956 = arg0;
    }

    @ObfuscatedName("ad.x(I)Z")
    public static boolean method970() {
        try {
            if (field2954 == 2) {
                if (Statics.field1 == null) {
                    Statics.field1 = class181.method3287(Statics.field1076, Statics.field2904, Statics.field2952);
                    if (Statics.field1 == null) {
                        return false;
                    }
                }
                if (Statics.field2907 == null) {
                    Statics.field2907 = new class60(Statics.field2958, Statics.field2951);
                }
                if (Statics.field2953.method3460(Statics.field1, Statics.field2959, Statics.field2907, 22050)) {
                    Statics.field2953.method3390();
                    Statics.field2953.method3372(Statics.field2930);
                    Statics.field2953.method3377(Statics.field1, Statics.field2957);
                    field2954 = 0;
                    Statics.field1 = null;
                    Statics.field2907 = null;
                    Statics.field1076 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field2953.method3378();
            field2954 = 0;
            Statics.field1 = null;
            Statics.field2907 = null;
            Statics.field1076 = null;
        }
        return false;
    }
}

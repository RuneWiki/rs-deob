package deob;

@ObfuscatedName("ge")
public class class183 {

    @ObfuscatedName("ge.f")
    public static int field2958 = 0;

    public class183() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("di.j(Lff;Lff;Lff;Lgh;I)Z")
    public static boolean method2252(class167 arg0, class167 arg1, class167 arg2, class184 arg3) {
        Statics.field2953 = arg0;
        Statics.field2952 = arg1;
        Statics.field2954 = arg2;
        Statics.field2955 = arg3;
        return true;
    }

    @ObfuscatedName("dr.l(Lff;IIIZI)V")
    public static void method2247(class167 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2958 = 1;
        Statics.field2956 = arg0;
        Statics.field2044 = arg1;
        Statics.field139 = arg2;
        Statics.field1389 = arg3;
        Statics.field183 = arg4;
        Statics.field63 = 10000;
    }

    @ObfuscatedName("dr.a(II)V")
    public static void method2243(int arg0) {
        if (field2958 == 0) {
            Statics.field2955.method3332(arg0);
        } else {
            Statics.field1389 = arg0;
        }
    }

    @ObfuscatedName("ap.i(B)V")
    public static void method936() {
        Statics.field2955.method3406();
        field2958 = 1;
        Statics.field2956 = null;
    }

    @ObfuscatedName("f.f(ILff;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method42(int arg0, class167 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method3039(arg2);
        int var7 = arg1.method3029(var6, arg3);
        field2958 = 1;
        Statics.field2956 = arg1;
        Statics.field2044 = var6;
        Statics.field139 = var7;
        Statics.field1389 = arg4;
        Statics.field183 = arg5;
        Statics.field63 = arg0;
    }

    @ObfuscatedName("cs.m(I)V")
    public static void method2125() {
        try {
            if (field2958 == 1) {
                int var0 = Statics.field2955.method3333();
                if (var0 > 0 && Statics.field2955.method3338()) {
                    int var1 = var0 - Statics.field63;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field2955.method3332(var1);
                    return;
                }
                Statics.field2955.method3406();
                Statics.field2955.method3335();
                if (Statics.field2956 == null) {
                    field2958 = 0;
                } else {
                    field2958 = 2;
                }
                Statics.field2720 = null;
                Statics.field2747 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field2955.method3406();
            field2958 = 0;
            Statics.field2720 = null;
            Statics.field2747 = null;
            Statics.field2956 = null;
        }
    }
}

package deob;

@ObfuscatedName("gx")
public class class183 {

    @ObfuscatedName("gx.g")
    public static int field2940 = 0;

    public class183() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("er.c(Lfj;Lfj;Lfj;Lgb;B)Z")
    public static boolean method2759(class167 arg0, class167 arg1, class167 arg2, class184 arg3) {
        Statics.field2942 = arg0;
        Statics.field2938 = arg1;
        Statics.field2944 = arg2;
        Statics.field2936 = arg3;
        return true;
    }

    @ObfuscatedName("l.h(Lfj;Ljava/lang/String;Ljava/lang/String;IZB)V")
    public static void method179(class167 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method3009(arg1);
        int var6 = arg0.method3043(var5, arg2);
        method2886(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("eh.k(Lfj;IIIZB)V")
    public static void method2886(class167 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2940 = 1;
        Statics.field2941 = arg0;
        Statics.field1995 = arg1;
        Statics.field2004 = arg2;
        Statics.field2698 = arg3;
        Statics.field2937 = arg4;
        Statics.field1162 = 10000;
    }

    @ObfuscatedName("do.t(I)V")
    public static void method2591() {
        Statics.field2936.method3366();
        field2940 = 1;
        Statics.field2941 = null;
    }

    @ObfuscatedName("do.g(ILfj;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method2592(int arg0, class167 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method3009(arg2);
        int var7 = arg1.method3043(var6, arg3);
        method2238(arg0, arg1, var6, var7, arg4, arg5);
    }

    @ObfuscatedName("dv.o(ILfj;IIIZB)V")
    public static void method2238(int arg0, class167 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2940 = 1;
        Statics.field2941 = arg1;
        Statics.field1995 = arg2;
        Statics.field2004 = arg3;
        Statics.field2698 = arg4;
        Statics.field2937 = arg5;
        Statics.field1162 = arg0;
    }

    @ObfuscatedName("hd.i(II)V")
    public static void method3690(int arg0) {
        field2940 = 1;
        Statics.field2941 = null;
        Statics.field1995 = -1;
        Statics.field2004 = -1;
        Statics.field2698 = 0;
        Statics.field2937 = false;
        Statics.field1162 = arg0;
    }

    @ObfuscatedName("fp.w(I)Z")
    public static boolean method3247() {
        try {
            if (field2940 == 2) {
                if (Statics.field2943 == null) {
                    Statics.field2943 = class180.method3276(Statics.field2941, Statics.field1995, Statics.field2004);
                    if (Statics.field2943 == null) {
                        return false;
                    }
                }
                if (Statics.field2888 == null) {
                    Statics.field2888 = new class60(Statics.field2944, Statics.field2938);
                }
                if (Statics.field2936.method3362(Statics.field2943, Statics.field2942, Statics.field2888, 22050)) {
                    Statics.field2936.method3391();
                    Statics.field2936.method3453(Statics.field2698);
                    Statics.field2936.method3365(Statics.field2943, Statics.field2937);
                    field2940 = 0;
                    Statics.field2943 = null;
                    Statics.field2888 = null;
                    Statics.field2941 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field2936.method3366();
            field2940 = 0;
            Statics.field2943 = null;
            Statics.field2888 = null;
            Statics.field2941 = null;
        }
        return false;
    }
}

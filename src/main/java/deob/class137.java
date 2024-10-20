package deob;

@ObfuscatedName("eu")
public class class137 {

    @ObfuscatedName("eu.i")
    public static int field2319 = 0;

    public class137() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dp.g(Lez;Lez;Lez;Len;B)Z")
    public static boolean method2429(class150 arg0, class150 arg1, class150 arg2, class140 arg3) {
        Statics.field2311 = arg0;
        Statics.field2316 = arg1;
        Statics.field2312 = arg2;
        Statics.field2314 = arg3;
        return true;
    }

    @ObfuscatedName("dd.e(Lez;IIIZI)V")
    public static void method2466(class150 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2319 = 1;
        Statics.field2428 = arg0;
        Statics.field199 = arg1;
        Statics.field857 = arg2;
        Statics.field1345 = arg3;
        Statics.field2310 = arg4;
        Statics.field2315 = 10000;
    }

    @ObfuscatedName("e.n(I)V")
    public static void method12() {
        Statics.field2314.method2776();
        field2319 = 1;
        Statics.field2428 = null;
    }

    @ObfuscatedName("k.j(ILez;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method222(int arg0, class150 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method3021(arg2);
        int var7 = arg1.method3038(var6, arg3);
        method2710(arg0, arg1, var6, var7, arg4, arg5);
    }

    @ObfuscatedName("et.i(ILez;IIIZB)V")
    public static void method2710(int arg0, class150 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2319 = 1;
        Statics.field2428 = arg1;
        Statics.field199 = arg2;
        Statics.field857 = arg3;
        Statics.field1345 = arg4;
        Statics.field2310 = arg5;
        Statics.field2315 = arg0;
    }

    @ObfuscatedName("ea.o(II)V")
    public static void method2717(int arg0) {
        field2319 = 1;
        Statics.field2428 = null;
        Statics.field199 = -1;
        Statics.field857 = -1;
        Statics.field1345 = 0;
        Statics.field2310 = false;
        Statics.field2315 = arg0;
    }

    @ObfuscatedName("cd.l(I)Z")
    public static boolean method2158() {
        try {
            if (field2319 == 2) {
                if (Statics.field1209 == null) {
                    Statics.field1209 = class138.method2751(Statics.field2428, Statics.field199, Statics.field857);
                    if (Statics.field1209 == null) {
                        return false;
                    }
                }
                if (Statics.field966 == null) {
                    Statics.field966 = new class57(Statics.field2312, Statics.field2316);
                }
                if (Statics.field2314.method2773(Statics.field1209, Statics.field2311, Statics.field966, 22050)) {
                    Statics.field2314.method2774();
                    Statics.field2314.method2771(Statics.field1345);
                    Statics.field2314.method2804(Statics.field1209, Statics.field2310);
                    field2319 = 0;
                    Statics.field1209 = null;
                    Statics.field966 = null;
                    Statics.field2428 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field2314.method2776();
            field2319 = 0;
            Statics.field1209 = null;
            Statics.field966 = null;
            Statics.field2428 = null;
        }
        return false;
    }
}

package deob;

@ObfuscatedName("et")
public class class137 {

    @ObfuscatedName("et.c")
    public static int field2314 = 0;

    public class137() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("d.j(Leh;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method152(class150 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method2918(arg1);
        int var6 = arg0.method2907(var5, arg2);
        method783(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("at.y(Leh;IIIZI)V")
    public static void method783(class150 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2314 = 1;
        Statics.field1738 = arg0;
        Statics.field2320 = arg1;
        Statics.field2295 = arg2;
        Statics.field368 = arg3;
        Statics.field210 = arg4;
        Statics.field2316 = 10000;
    }

    @ObfuscatedName("cv.x(II)V")
    public static void method1609(int arg0) {
        if (field2314 == 0) {
            Statics.field2313.method2666(arg0);
        } else {
            Statics.field368 = arg0;
        }
    }

    @ObfuscatedName("aq.c(ILeh;Ljava/lang/String;Ljava/lang/String;IZB)V")
    public static void method1161(int arg0, class150 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method2918(arg2);
        int var7 = arg1.method2907(var6, arg3);
        method864(arg0, arg1, var6, var7, arg4, arg5);
    }

    @ObfuscatedName("ai.e(ILeh;IIIZI)V")
    public static void method864(int arg0, class150 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2314 = 1;
        Statics.field1738 = arg1;
        Statics.field2320 = arg2;
        Statics.field2295 = arg3;
        Statics.field368 = arg4;
        Statics.field210 = arg5;
        Statics.field2316 = arg0;
    }

    @ObfuscatedName("co.s(IB)V")
    public static void method1825(int arg0) {
        field2314 = 1;
        Statics.field1738 = null;
        Statics.field2320 = -1;
        Statics.field2295 = -1;
        Statics.field368 = 0;
        Statics.field210 = false;
        Statics.field2316 = arg0;
    }
}

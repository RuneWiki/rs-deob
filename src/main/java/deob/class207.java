package deob;

@ObfuscatedName("gr")
public class class207 {

    @ObfuscatedName("gr.w")
    public static int field2407 = 0;

    public class207() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dd.x(Liy;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method2190(class244 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method3885(arg1);
        int var6 = arg0.method3878(var5, arg2);
        method1165(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("bj.m(Liy;IIIZI)V")
    public static void method1165(class244 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2407 = 1;
        Statics.field2408 = arg0;
        Statics.field2409 = arg1;
        Statics.field2414 = arg2;
        Statics.field2515 = arg3;
        Statics.field107 = arg4;
        Statics.field1188 = 10000;
    }

    @ObfuscatedName("hd.k(II)V")
    public static void method3690(int arg0) {
        if (field2407 == 0) {
            Statics.field2406.method3482(arg0);
        } else {
            Statics.field2515 = arg0;
        }
    }

    @ObfuscatedName("client.d(B)V")
    public static void method1323() {
        Statics.field2406.method3535();
        field2407 = 1;
        Statics.field2408 = null;
    }

    @ObfuscatedName("as.w(ILiy;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method389(int arg0, class244 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method3885(arg2);
        int var7 = arg1.method3878(var6, arg3);
        method3106(arg0, arg1, var6, var7, arg4, arg5);
    }

    @ObfuscatedName("er.v(ILiy;IIIZB)V")
    public static void method3106(int arg0, class244 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2407 = 1;
        Statics.field2408 = arg1;
        Statics.field2409 = arg2;
        Statics.field2414 = arg3;
        Statics.field2515 = arg4;
        Statics.field107 = arg5;
        Statics.field1188 = arg0;
    }
}

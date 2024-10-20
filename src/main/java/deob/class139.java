package deob;

@ObfuscatedName("el")
public class class139 {

    @ObfuscatedName("el.o")
    public static int field2355 = 0;

    public class139() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("w.p(Leh;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method41(class153 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method3093(arg1);
        int var6 = arg0.method3094(var5, arg2);
        method2165(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("cl.l(Leh;IIIZB)V")
    public static void method2165(class153 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2355 = 1;
        Statics.field2361 = arg0;
        Statics.field2353 = arg1;
        Statics.field1298 = arg2;
        Statics.field1990 = arg3;
        Statics.field2467 = arg4;
        Statics.field1299 = 10000;
    }

    @ObfuscatedName("au.d(II)V")
    public static void method790(int arg0) {
        if (field2355 == 0) {
            Statics.field2832.method2808(arg0);
        } else {
            Statics.field1990 = arg0;
        }
    }

    @ObfuscatedName("at.x(I)V")
    public static void method593() {
        Statics.field2832.method2925();
        field2355 = 1;
        Statics.field2361 = null;
    }
}

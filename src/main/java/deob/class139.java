package deob;

@ObfuscatedName("ev")
public class class139 {

    @ObfuscatedName("ev.j")
    public static int field1920 = 0;

    public class139() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("go.q(Lgj;Lgj;Lgj;Leb;I)Z")
    public static boolean method3310(class183 arg0, class183 arg1, class183 arg2, class140 arg3) {
        Statics.field1918 = arg0;
        Statics.field1915 = arg1;
        Statics.field1916 = arg2;
        Statics.field1917 = arg3;
        return true;
    }

    @ObfuscatedName("br.d(Lgj;IIIZI)V")
    public static void method1399(class183 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field1920 = 1;
        Statics.field2183 = arg0;
        Statics.field131 = arg1;
        Statics.field1919 = arg2;
        Statics.field17 = arg3;
        Statics.field2164 = arg4;
        Statics.field1210 = 10000;
    }

    @ObfuscatedName("u.h(ILgj;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method168(int arg0, class183 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method3148(arg2);
        int var7 = arg1.method3132(var6, arg3);
        method2648(arg0, arg1, var6, var7, arg4, arg5);
    }

    @ObfuscatedName("ec.p(ILgj;IIIZI)V")
    public static void method2648(int arg0, class183 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field1920 = 1;
        Statics.field2183 = arg1;
        Statics.field131 = arg2;
        Statics.field1919 = arg3;
        Statics.field17 = arg4;
        Statics.field2164 = arg5;
        Statics.field1210 = arg0;
    }

    @ObfuscatedName("dc.j(IB)V")
    public static void method2199(int arg0) {
        field1920 = 1;
        Statics.field2183 = null;
        Statics.field131 = -1;
        Statics.field1919 = -1;
        Statics.field17 = 0;
        Statics.field2164 = false;
        Statics.field1210 = arg0;
    }
}

package deob;

@ObfuscatedName("fw")
public class class160 {

    @ObfuscatedName("fw.l")
    public static int field2683 = 0;

    public class160() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("en.y(Lev;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method2810(class145 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method2771(arg1);
        int var6 = arg0.method2754(var5, arg2);
        method456(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("b.u(Lev;IIIZI)V")
    public static void method456(class145 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2683 = 1;
        Statics.field558 = arg0;
        Statics.field2686 = arg1;
        Statics.field1890 = arg2;
        Statics.field2684 = arg3;
        Statics.field1891 = arg4;
        Statics.field2677 = 10000;
    }

    @ObfuscatedName("cs.k(ILev;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method1854(int arg0, class145 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method2771(arg2);
        int var7 = arg1.method2754(var6, arg3);
        method694(arg0, arg1, var6, var7, arg4, arg5);
    }

    @ObfuscatedName("ao.v(ILev;IIIZI)V")
    public static void method694(int arg0, class145 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2683 = 1;
        Statics.field558 = arg1;
        Statics.field2686 = arg2;
        Statics.field1890 = arg3;
        Statics.field2684 = arg4;
        Statics.field1891 = arg5;
        Statics.field2677 = arg0;
    }

    @ObfuscatedName("a.l(B)Z")
    public static boolean method81() {
        return field2683 == 0 ? Statics.field2679.method3100() : true;
    }
}

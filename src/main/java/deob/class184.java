package deob;

@ObfuscatedName("gg")
public class class184 {

    @ObfuscatedName("gg.y")
    public static int field2968 = 0;

    public class184() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ay.a(Lft;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method731(class168 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method3162(arg1);
        int var6 = arg0.method3163(var5, arg2);
        method2976(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("et.w(Lft;IIIZB)V")
    public static void method2976(class168 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2968 = 1;
        Statics.field1966 = arg0;
        Statics.field2964 = arg1;
        Statics.field2969 = arg2;
        Statics.field2967 = arg3;
        Statics.field1569 = arg4;
        Statics.field1229 = 10000;
    }

    @ObfuscatedName("bw.d(II)V")
    public static void method1601(int arg0) {
        if (field2968 == 0) {
            Statics.field2974.method3456(arg0);
        } else {
            Statics.field2967 = arg0;
        }
    }

    @ObfuscatedName("m.c(S)V")
    public static void method161() {
        Statics.field2974.method3461();
        field2968 = 1;
        Statics.field1966 = null;
    }

    @ObfuscatedName("s.y(ILft;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method637(int arg0, class168 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method3162(arg2);
        int var7 = arg1.method3163(var6, arg3);
        method3315(arg0, arg1, var6, var7, arg4, arg5);
    }

    @ObfuscatedName("fh.k(ILft;IIIZI)V")
    public static void method3315(int arg0, class168 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2968 = 1;
        Statics.field1966 = arg1;
        Statics.field2964 = arg2;
        Statics.field2969 = arg3;
        Statics.field2967 = arg4;
        Statics.field1569 = arg5;
        Statics.field1229 = arg0;
    }

    @ObfuscatedName("fc.r(II)V")
    public static void method3241(int arg0) {
        field2968 = 1;
        Statics.field1966 = null;
        Statics.field2964 = -1;
        Statics.field2969 = -1;
        Statics.field2967 = 0;
        Statics.field1569 = false;
        Statics.field1229 = arg0;
    }

    @ObfuscatedName("ct.p(B)Z")
    public static boolean method1868() {
        return field2968 == 0 ? Statics.field2974.method3499() : true;
    }

    @ObfuscatedName("ao.q(I)V")
    public static void method815() {
        try {
            if (field2968 == 1) {
                int var0 = Statics.field2974.method3507();
                if (var0 > 0 && Statics.field2974.method3499()) {
                    int var1 = var0 - Statics.field1229;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field2974.method3456(var1);
                    return;
                }
                Statics.field2974.method3461();
                Statics.field2974.method3510();
                if (Statics.field1966 == null) {
                    field2968 = 0;
                } else {
                    field2968 = 2;
                }
                Statics.field2972 = null;
                Statics.field2224 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field2974.method3461();
            field2968 = 0;
            Statics.field2972 = null;
            Statics.field2224 = null;
            Statics.field1966 = null;
        }
    }
}

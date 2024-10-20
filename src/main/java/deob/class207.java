package deob;

@ObfuscatedName("gq")
public class class207 {

    @ObfuscatedName("gq.t")
    public static int field2422 = 0;

    public class207() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cc.h(Lib;IIIZI)V")
    public static void method1934(class245 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2422 = 1;
        Statics.field2539 = arg0;
        Statics.field1003 = arg1;
        Statics.field2426 = arg2;
        Statics.field72 = arg3;
        Statics.field2773 = arg4;
        Statics.field313 = 10000;
    }

    @ObfuscatedName("am.v(I)V")
    public static void method530() {
        Statics.field2427.method3505();
        field2422 = 1;
        Statics.field2539 = null;
    }

    @ObfuscatedName("ag.x(ILib;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method275(int arg0, class245 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method3880(arg2);
        int var7 = arg1.method3909(var6, arg3);
        method1100(arg0, arg1, var6, var7, arg4, arg5);
    }

    @ObfuscatedName("bw.w(ILib;IIIZI)V")
    public static void method1100(int arg0, class245 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2422 = 1;
        Statics.field2539 = arg1;
        Statics.field1003 = arg2;
        Statics.field2426 = arg3;
        Statics.field72 = arg4;
        Statics.field2773 = arg5;
        Statics.field313 = arg0;
    }

    @ObfuscatedName("bw.t(IB)V")
    public static void method1099(int arg0) {
        field2422 = 1;
        Statics.field2539 = null;
        Statics.field1003 = -1;
        Statics.field2426 = -1;
        Statics.field72 = 0;
        Statics.field2773 = false;
        Statics.field313 = arg0;
    }

    @ObfuscatedName("fu.j(B)Z")
    public static boolean method3282() {
        return field2422 == 0 ? Statics.field2427.method3451() : true;
    }

    @ObfuscatedName("ea.n(B)V")
    public static void method3124() {
        try {
            if (field2422 == 1) {
                int var0 = Statics.field2427.method3492();
                if (var0 > 0 && Statics.field2427.method3451()) {
                    int var1 = var0 - Statics.field313;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field2427.method3444(var1);
                    return;
                }
                Statics.field2427.method3505();
                Statics.field2427.method3448();
                if (Statics.field2539 == null) {
                    field2422 = 0;
                } else {
                    field2422 = 2;
                }
                Statics.field2072 = null;
                Statics.field2425 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field2427.method3505();
            field2422 = 0;
            Statics.field2072 = null;
            Statics.field2425 = null;
            Statics.field2539 = null;
        }
    }

    @ObfuscatedName("ae.p(I)Z")
    public static boolean method314() {
        try {
            if (field2422 == 2) {
                if (Statics.field2072 == null) {
                    Statics.field2072 = class213.method3617(Statics.field2539, Statics.field1003, Statics.field2426);
                    if (Statics.field2072 == null) {
                        return false;
                    }
                }
                if (Statics.field2425 == null) {
                    Statics.field2425 = new class118(Statics.field2423, Statics.field2421);
                }
                if (Statics.field2427.method3446(Statics.field2072, Statics.field2424, Statics.field2425, 22050)) {
                    Statics.field2427.method3447();
                    Statics.field2427.method3444(Statics.field72);
                    Statics.field2427.method3511(Statics.field2072, Statics.field2773);
                    field2422 = 0;
                    Statics.field2072 = null;
                    Statics.field2425 = null;
                    Statics.field2539 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field2427.method3505();
            field2422 = 0;
            Statics.field2072 = null;
            Statics.field2425 = null;
            Statics.field2539 = null;
        }
        return false;
    }
}

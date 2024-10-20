package deob;

@ObfuscatedName("ez")
public class class139 {

    @ObfuscatedName("ez.m")
    public static int field2363 = 0;

    public class139() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dr.q(Ley;IIIZB)V")
    public static void method2160(class153 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2363 = 1;
        Statics.field2364 = arg0;
        Statics.field2027 = arg1;
        Statics.field2365 = arg2;
        Statics.field2366 = arg3;
        Statics.field2746 = arg4;
        Statics.field1671 = 10000;
    }

    @ObfuscatedName("au.c(ILey;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method885(int arg0, class153 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method2967(arg2);
        int var7 = arg1.method2968(var6, arg3);
        method458(arg0, arg1, var6, var7, arg4, arg5);
    }

    @ObfuscatedName("client.p(ILey;IIIZI)V")
    public static void method458(int arg0, class153 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2363 = 1;
        Statics.field2364 = arg1;
        Statics.field2027 = arg2;
        Statics.field2365 = arg3;
        Statics.field2366 = arg4;
        Statics.field2746 = arg5;
        Statics.field1671 = arg0;
    }

    @ObfuscatedName("dz.z(II)V")
    public static void method2206(int arg0) {
        field2363 = 1;
        Statics.field2364 = null;
        Statics.field2027 = -1;
        Statics.field2365 = -1;
        Statics.field2366 = 0;
        Statics.field2746 = false;
        Statics.field1671 = arg0;
    }

    @ObfuscatedName("ap.m(I)Z")
    public static boolean method244() {
        try {
            if (field2363 == 2) {
                if (Statics.field258 == null) {
                    Statics.field258 = class140.method2692(Statics.field2364, Statics.field2027, Statics.field2365);
                    if (Statics.field258 == null) {
                        return false;
                    }
                }
                if (Statics.field2361 == null) {
                    Statics.field2361 = new class58(Statics.field2367, Statics.field2360);
                }
                if (Statics.field2362.method2703(Statics.field258, Statics.field932, Statics.field2361, 22050)) {
                    Statics.field2362.method2734();
                    Statics.field2362.method2701(Statics.field2366);
                    Statics.field2362.method2706(Statics.field258, Statics.field2746);
                    field2363 = 0;
                    Statics.field258 = null;
                    Statics.field2361 = null;
                    Statics.field2364 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field2362.method2707();
            field2363 = 0;
            Statics.field258 = null;
            Statics.field2361 = null;
            Statics.field2364 = null;
        }
        return false;
    }
}

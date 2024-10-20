package deob;

@ObfuscatedName("eq")
public class class138 {

    @ObfuscatedName("eq.l")
    public static int field2347 = 0;

    public class138() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("an.p(Lep;Lep;Lep;Lel;I)Z")
    public static boolean method840(class152 arg0, class152 arg1, class152 arg2, class141 arg3) {
        Statics.field2345 = arg0;
        Statics.field2344 = arg1;
        Statics.field2342 = arg2;
        Statics.field2341 = arg3;
        return true;
    }

    @ObfuscatedName("cz.i(Lep;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method2071(class152 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method3013(arg1);
        int var6 = arg0.method3014(var5, arg2);
        Statics.method1407(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("cd.n(ILep;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method1623(int arg0, class152 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method3013(arg2);
        int var7 = arg1.method3014(var6, arg3);
        field2347 = 1;
        Statics.field746 = arg1;
        Statics.field108 = var6;
        Statics.field264 = var7;
        Statics.field2346 = arg4;
        Statics.field1628 = arg5;
        Statics.field874 = arg0;
    }

    @ObfuscatedName("be.l(B)Z")
    public static boolean method1265() {
        try {
            if (field2347 == 2) {
                if (Statics.field1309 == null) {
                    Statics.field1309 = class139.method2746(Statics.field746, Statics.field108, Statics.field264);
                    if (Statics.field1309 == null) {
                        return false;
                    }
                }
                if (Statics.field1377 == null) {
                    Statics.field1377 = new class58(Statics.field2342, Statics.field2344);
                }
                if (Statics.field2341.method2769(Statics.field1309, Statics.field2345, Statics.field1377, 22050)) {
                    Statics.field2341.method2839();
                    Statics.field2341.method2766(Statics.field2346);
                    Statics.field2341.method2772(Statics.field1309, Statics.field1628);
                    field2347 = 0;
                    Statics.field1309 = null;
                    Statics.field1377 = null;
                    Statics.field746 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field2341.method2773();
            field2347 = 0;
            Statics.field1309 = null;
            Statics.field1377 = null;
            Statics.field746 = null;
        }
        return false;
    }
}

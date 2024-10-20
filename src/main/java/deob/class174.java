package deob;

@ObfuscatedName("fz")
public class class174 {

    @ObfuscatedName("fz.q")
    public static int field2843 = 0;

    public class174() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dt.o(Lfg;Lfg;Lfg;Lft;I)Z")
    public static boolean method2651(class158 arg0, class158 arg1, class158 arg2, class175 arg3) {
        Statics.field2840 = arg0;
        Statics.field2846 = arg1;
        Statics.field2839 = arg2;
        Statics.field2842 = arg3;
        return true;
    }

    @ObfuscatedName("q.l(Lfg;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method41(class158 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method3008(arg1);
        int var6 = arg0.method2956(var5, arg2);
        Statics.method3179(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("gi.u(ILfg;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method3582(int arg0, class158 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method3008(arg2);
        int var7 = arg1.method2956(var6, arg3);
        field2843 = 1;
        Statics.field2844 = arg1;
        Statics.field1279 = var6;
        Statics.field722 = var7;
        Statics.field2793 = arg4;
        Statics.field159 = arg5;
        Statics.field2845 = arg0;
    }

    @ObfuscatedName("z.q(II)V")
    public static void method553(int arg0) {
        field2843 = 1;
        Statics.field2844 = null;
        Statics.field1279 = -1;
        Statics.field722 = -1;
        Statics.field2793 = 0;
        Statics.field159 = false;
        Statics.field2845 = arg0;
    }

    @ObfuscatedName("bq.r(B)Z")
    public static boolean method1405() {
        try {
            if (field2843 == 2) {
                if (Statics.field733 == null) {
                    Statics.field733 = class171.method3181(Statics.field2844, Statics.field1279, Statics.field722);
                    if (Statics.field733 == null) {
                        return false;
                    }
                }
                if (Statics.field2800 == null) {
                    Statics.field2800 = new class55(Statics.field2839, Statics.field2846);
                }
                if (Statics.field2842.method3360(Statics.field733, Statics.field2840, Statics.field2800, 22050)) {
                    Statics.field2842.method3275();
                    Statics.field2842.method3306(Statics.field2793);
                    Statics.field2842.method3305(Statics.field733, Statics.field159);
                    field2843 = 0;
                    Statics.field733 = null;
                    Statics.field2800 = null;
                    Statics.field2844 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field2842.method3277();
            field2843 = 0;
            Statics.field733 = null;
            Statics.field2800 = null;
            Statics.field2844 = null;
        }
        return false;
    }
}

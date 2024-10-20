package deob;

@ObfuscatedName("gu")
public class class183 {

    @ObfuscatedName("gu.z")
    public static int field2940 = 0;

    public class183() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cu.g(Lfc;Lfc;Lfc;Lgn;B)Z")
    public static boolean method2076(class167 arg0, class167 arg1, class167 arg2, class184 arg3) {
        Statics.field2943 = arg0;
        Statics.field2939 = arg1;
        Statics.field2941 = arg2;
        Statics.field2942 = arg3;
        return true;
    }

    @ObfuscatedName("cm.b(Lfc;IIIZI)V")
    public static void method2057(class167 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2940 = 1;
        Statics.field76 = arg0;
        Statics.field2944 = arg1;
        Statics.field2945 = arg2;
        Statics.field2244 = arg3;
        Statics.field73 = arg4;
        Statics.field1747 = 10000;
    }

    @ObfuscatedName("ac.w(II)V")
    public static void method1019(int arg0) {
        if (field2940 == 0) {
            Statics.field2942.method3407(arg0);
        } else {
            Statics.field2244 = arg0;
        }
    }

    @ObfuscatedName("an.d(I)V")
    public static void method749() {
        Statics.field2942.method3459();
        field2940 = 1;
        Statics.field76 = null;
    }

    @ObfuscatedName("k.z(ILfc;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method157(int arg0, class167 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method3079(arg2);
        int var7 = arg1.method3094(var6, arg3);
        method153(arg0, arg1, var6, var7, arg4, arg5);
    }

    @ObfuscatedName("o.l(ILfc;IIIZI)V")
    public static void method153(int arg0, class167 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2940 = 1;
        Statics.field76 = arg1;
        Statics.field2944 = arg2;
        Statics.field2945 = arg3;
        Statics.field2244 = arg4;
        Statics.field73 = arg5;
        Statics.field1747 = arg0;
    }

    @ObfuscatedName("t.p(I)Z")
    public static boolean method217() {
        return field2940 == 0 ? Statics.field2942.method3412() : true;
    }

    @ObfuscatedName("ew.u(I)V")
    public static void method2949() {
        try {
            if (field2940 == 1) {
                int var0 = Statics.field2942.method3408();
                if (var0 > 0 && Statics.field2942.method3412()) {
                    int var1 = var0 - Statics.field1747;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field2942.method3407(var1);
                    return;
                }
                Statics.field2942.method3459();
                Statics.field2942.method3490();
                if (Statics.field76 == null) {
                    field2940 = 0;
                } else {
                    field2940 = 2;
                }
                Statics.field3197 = null;
                Statics.field2105 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field2942.method3459();
            field2940 = 0;
            Statics.field3197 = null;
            Statics.field2105 = null;
            Statics.field76 = null;
        }
    }
}

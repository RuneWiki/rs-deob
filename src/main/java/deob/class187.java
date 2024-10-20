package deob;

@ObfuscatedName("gx")
public class class187 {

    @ObfuscatedName("gx.z")
    public static int field3017 = 0;

    public class187() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ep.a(Lfu;Lfu;Lfu;Lgv;I)Z")
    public static boolean method3007(class171 arg0, class171 arg1, class171 arg2, class188 arg3) {
        Statics.field3019 = arg0;
        Statics.field3014 = arg1;
        Statics.field3013 = arg2;
        Statics.field3016 = arg3;
        return true;
    }

    @ObfuscatedName("fw.d(Lfu;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method3112(class171 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method3132(arg1);
        int var6 = arg0.method3121(var5, arg2);
        method1024(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("an.v(Lfu;IIIZB)V")
    public static void method1024(class171 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3017 = 1;
        Statics.field3018 = arg0;
        Statics.field3020 = arg1;
        Statics.field3023 = arg2;
        Statics.field2952 = arg3;
        Statics.field3021 = arg4;
        Statics.field586 = 10000;
    }

    @ObfuscatedName("v.r(B)Z")
    public static boolean method41() {
        return field3017 == 0 ? Statics.field3016.method3463() : true;
    }

    @ObfuscatedName("ft.z(I)V")
    public static void method3298() {
        try {
            if (field3017 == 1) {
                int var0 = Statics.field3016.method3434();
                if (var0 > 0 && Statics.field3016.method3463()) {
                    int var1 = var0 - Statics.field586;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field3016.method3444(var1);
                    return;
                }
                Statics.field3016.method3462();
                Statics.field3016.method3435();
                if (Statics.field3018 == null) {
                    field3017 = 0;
                } else {
                    field3017 = 2;
                }
                Statics.field2325 = null;
                Statics.field3022 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field3016.method3462();
            field3017 = 0;
            Statics.field2325 = null;
            Statics.field3022 = null;
            Statics.field3018 = null;
        }
    }

    @ObfuscatedName("dz.t(B)Z")
    public static boolean method2657() {
        try {
            if (field3017 == 2) {
                if (Statics.field2325 == null) {
                    Statics.field2325 = class184.method3354(Statics.field3018, Statics.field3020, Statics.field3023);
                    if (Statics.field2325 == null) {
                        return false;
                    }
                }
                if (Statics.field3022 == null) {
                    Statics.field3022 = new class63(Statics.field3013, Statics.field3014);
                }
                if (Statics.field3016.method3466(Statics.field2325, Statics.field3019, Statics.field3022, 22050)) {
                    Statics.field3016.method3465();
                    Statics.field3016.method3444(Statics.field2952);
                    Statics.field3016.method3438(Statics.field2325, Statics.field3021);
                    field3017 = 0;
                    Statics.field2325 = null;
                    Statics.field3022 = null;
                    Statics.field3018 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field3016.method3462();
            field3017 = 0;
            Statics.field2325 = null;
            Statics.field3022 = null;
            Statics.field3018 = null;
        }
        return false;
    }
}

package deob;

@ObfuscatedName("gn")
public class class187 {

    @ObfuscatedName("gn.v")
    public static int field3008 = 0;

    public class187() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("h.k(Lfo;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method112(class171 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method3119(arg1);
        int var6 = arg0.method3117(var5, arg2);
        method2809(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("ey.q(Lfo;IIIZI)V")
    public static void method2809(class171 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3008 = 1;
        Statics.field2115 = arg0;
        Statics.field795 = arg1;
        Statics.field2024 = arg2;
        Statics.field667 = arg3;
        Statics.field1627 = arg4;
        Statics.field2690 = 10000;
    }

    @ObfuscatedName("fa.f(ILfo;IIIZI)V")
    public static void method2993(int arg0, class171 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field3008 = 1;
        Statics.field2115 = arg1;
        Statics.field795 = arg2;
        Statics.field2024 = arg3;
        Statics.field667 = arg4;
        Statics.field1627 = arg5;
        Statics.field2690 = arg0;
    }

    @ObfuscatedName("s.c(II)V")
    public static void method158(int arg0) {
        field3008 = 1;
        Statics.field2115 = null;
        Statics.field795 = -1;
        Statics.field2024 = -1;
        Statics.field667 = 0;
        Statics.field1627 = false;
        Statics.field2690 = arg0;
    }

    @ObfuscatedName("dd.v(I)Z")
    public static boolean method2305() {
        return field3008 == 0 ? Statics.field3009.method3432() : true;
    }

    @ObfuscatedName("ae.j(I)Z")
    public static boolean method942() {
        try {
            if (field3008 == 2) {
                if (Statics.field3210 == null) {
                    Statics.field3210 = class184.method3340(Statics.field2115, Statics.field795, Statics.field2024);
                    if (Statics.field3210 == null) {
                        return false;
                    }
                }
                if (Statics.field2032 == null) {
                    Statics.field2032 = new class63(Statics.field3010, Statics.field3006);
                }
                if (Statics.field3009.method3427(Statics.field3210, Statics.field3013, Statics.field2032, 22050)) {
                    Statics.field3009.method3428();
                    Statics.field3009.method3425(Statics.field667);
                    Statics.field3009.method3474(Statics.field3210, Statics.field1627);
                    field3008 = 0;
                    Statics.field3210 = null;
                    Statics.field2032 = null;
                    Statics.field2115 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field3009.method3504();
            field3008 = 0;
            Statics.field3210 = null;
            Statics.field2032 = null;
            Statics.field2115 = null;
        }
        return false;
    }
}

package deob;

@ObfuscatedName("jv")
public class class274 {

    @ObfuscatedName("jv.c")
    public static int field3199 = 0;

    public class274() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cv.s(Lls;Lls;Lls;Lje;I)Z")
    public static boolean method2385(class316 arg0, class316 arg1, class316 arg2, class275 arg3) {
        Statics.field3202 = arg0;
        Statics.field3200 = arg1;
        Statics.field3204 = arg2;
        Statics.field1003 = arg3;
        return true;
    }

    @ObfuscatedName("gq.h(Lls;Ljava/lang/String;Ljava/lang/String;IZB)V")
    public static void method3883(class316 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method5269(arg1);
        int var6 = arg0.method5196(var5, arg2);
        method2575(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("dn.w(Lls;IIIZI)V")
    public static void method2575(class316 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3199 = 1;
        Statics.field3995 = arg0;
        Statics.field1348 = arg1;
        Statics.field2613 = arg2;
        Statics.field167 = arg3;
        Statics.field3203 = arg4;
        Statics.field1748 = 10000;
    }

    @ObfuscatedName("fr.v(I)V")
    public static void method2997() {
        Statics.field1003.method4761();
        field3199 = 1;
        Statics.field3995 = null;
    }

    @ObfuscatedName("jt.c(I)Z")
    public static boolean method4614() {
        return field3199 == 0 ? Statics.field1003.method4752() : true;
    }

    @ObfuscatedName("ib.q(B)V")
    public static void method4562() {
        try {
            if (field3199 == 1) {
                int var0 = Statics.field1003.method4712();
                if (var0 > 0 && Statics.field1003.method4752()) {
                    int var1 = var0 - Statics.field1748;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field1003.method4691(var1);
                    return;
                }
                Statics.field1003.method4761();
                Statics.field1003.method4680();
                if (Statics.field3995 == null) {
                    field3199 = 0;
                } else {
                    field3199 = 2;
                }
                Statics.field4839 = null;
                Statics.field956 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field1003.method4761();
            field3199 = 0;
            Statics.field4839 = null;
            Statics.field956 = null;
            Statics.field3995 = null;
        }
    }
}

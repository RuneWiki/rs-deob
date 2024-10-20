package deob;

@ObfuscatedName("jg")
public class class275 {

    @ObfuscatedName("jg.k")
    public static int field3228 = 0;

    public class275() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bj.c(Llv;IIIZI)V")
    public static void method1097(class317 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3228 = 1;
        Statics.field3225 = arg0;
        Statics.field3231 = arg1;
        Statics.field2042 = arg2;
        Statics.field3197 = arg3;
        Statics.field4372 = arg4;
        Statics.field1871 = 10000;
    }

    @ObfuscatedName("a.p(B)V")
    public static void method261() {
        Statics.field1623.method4876();
        field3228 = 1;
        Statics.field3225 = null;
    }

    @ObfuscatedName("fr.f(II)V")
    public static void method3111(int arg0) {
        field3228 = 1;
        Statics.field3225 = null;
        Statics.field3231 = -1;
        Statics.field2042 = -1;
        Statics.field3197 = 0;
        Statics.field4372 = false;
        Statics.field1871 = arg0;
    }

    @ObfuscatedName("bk.n(I)Z")
    public static boolean method1938() {
        try {
            if (field3228 == 2) {
                if (Statics.field3229 == null) {
                    Statics.field3229 = class280.method5065(Statics.field3225, Statics.field3231, Statics.field2042);
                    if (Statics.field3229 == null) {
                        return false;
                    }
                }
                if (Statics.field175 == null) {
                    Statics.field175 = new class43(Statics.field3227, Statics.field3226);
                }
                if (Statics.field1623.method4872(Statics.field3229, Statics.field3230, Statics.field175, 22050)) {
                    Statics.field1623.method4873();
                    Statics.field1623.method4870(Statics.field3197);
                    Statics.field1623.method4955(Statics.field3229, Statics.field4372);
                    field3228 = 0;
                    Statics.field3229 = null;
                    Statics.field175 = null;
                    Statics.field3225 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field1623.method4876();
            field3228 = 0;
            Statics.field3229 = null;
            Statics.field175 = null;
            Statics.field3225 = null;
        }
        return false;
    }
}

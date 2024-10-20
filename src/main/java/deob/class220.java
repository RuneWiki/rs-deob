package deob;

@ObfuscatedName("hl")
public class class220 {

    @ObfuscatedName("hl.c")
    public static int field2530 = 0;

    public class220() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ec.g(Liu;Liu;Liu;Lhg;B)Z")
    public static boolean method3056(class250 arg0, class250 arg1, class250 arg2, class221 arg3) {
        Statics.field2536 = arg0;
        Statics.field2531 = arg1;
        Statics.field2532 = arg2;
        Statics.field2462 = arg3;
        return true;
    }

    @ObfuscatedName("bd.r(Liu;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method1857(class250 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method4432(arg1);
        int var6 = arg0.method4454(var5, arg2);
        method3262(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("fi.e(Liu;IIIZB)V")
    public static void method3262(class250 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2530 = 1;
        Statics.field1912 = arg0;
        Statics.field2534 = arg1;
        Statics.field2074 = arg2;
        Statics.field3852 = arg3;
        Statics.field2535 = arg4;
        Statics.field1 = 10000;
    }

    @ObfuscatedName("eu.q(IB)V")
    public static void method3042(int arg0) {
        if (field2530 == 0) {
            Statics.field2462.method4094(arg0);
        } else {
            Statics.field3852 = arg0;
        }
    }

    @ObfuscatedName("y.c(B)V")
    public static void method323() {
        Statics.field2462.method4172();
        field2530 = 1;
        Statics.field1912 = null;
    }

    @ObfuscatedName("an.i(ILiu;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method477(int arg0, class250 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method4432(arg2);
        int var7 = arg1.method4454(var6, arg3);
        method459(arg0, arg1, var6, var7, arg4, arg5);
    }

    @ObfuscatedName("o.p(ILiu;IIIZI)V")
    public static void method459(int arg0, class250 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2530 = 1;
        Statics.field1912 = arg1;
        Statics.field2534 = arg2;
        Statics.field2074 = arg3;
        Statics.field3852 = arg4;
        Statics.field2535 = arg5;
        Statics.field1 = arg0;
    }

    @ObfuscatedName("fj.m(II)V")
    public static void method3428(int arg0) {
        field2530 = 1;
        Statics.field1912 = null;
        Statics.field2534 = -1;
        Statics.field2074 = -1;
        Statics.field3852 = 0;
        Statics.field2535 = false;
        Statics.field1 = arg0;
    }

    @ObfuscatedName("p.d(I)Z")
    public static boolean method118() {
        return field2530 == 0 ? Statics.field2462.method4146() : true;
    }

    @ObfuscatedName("fj.j(I)Z")
    public static boolean method3429() {
        try {
            if (field2530 == 2) {
                if (Statics.field40 == null) {
                    Statics.field40 = class226.method4257(Statics.field1912, Statics.field2534, Statics.field2074);
                    if (Statics.field40 == null) {
                        return false;
                    }
                }
                if (Statics.field1219 == null) {
                    Statics.field1219 = new class101(Statics.field2532, Statics.field2531);
                }
                if (Statics.field2462.method4069(Statics.field40, Statics.field2536, Statics.field1219, 22050)) {
                    Statics.field2462.method4070();
                    Statics.field2462.method4094(Statics.field3852);
                    Statics.field2462.method4072(Statics.field40, Statics.field2535);
                    field2530 = 0;
                    Statics.field40 = null;
                    Statics.field1219 = null;
                    Statics.field1912 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field2462.method4172();
            field2530 = 0;
            Statics.field40 = null;
            Statics.field1219 = null;
            Statics.field1912 = null;
        }
        return false;
    }
}

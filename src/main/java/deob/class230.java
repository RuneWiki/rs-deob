package deob;

@ObfuscatedName("hi")
public class class230 {

    @ObfuscatedName("hi.l")
    public static int field2675 = 0;

    public class230() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dx.t(Ljc;Ljc;Ljc;Lhk;I)Z")
    public static boolean method2370(class262 arg0, class262 arg1, class262 arg2, class231 arg3) {
        Statics.field259 = arg0;
        Statics.field2954 = arg1;
        Statics.field2676 = arg2;
        Statics.field2674 = arg3;
        return true;
    }

    @ObfuscatedName("ga.q(Ljc;Ljava/lang/String;Ljava/lang/String;IZB)V")
    public static void method3133(class262 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method4210(arg1);
        int var6 = arg0.method4211(var5, arg2);
        method1527(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("bp.i(Ljc;IIIZI)V")
    public static void method1527(class262 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2675 = 1;
        Statics.field2673 = arg0;
        Statics.field2200 = arg1;
        Statics.field2677 = arg2;
        Statics.field2678 = arg3;
        Statics.field1295 = arg4;
        Statics.field14 = 10000;
    }

    @ObfuscatedName("gv.a(II)V")
    public static void method3536(int arg0) {
        if (field2675 == 0) {
            Statics.field2674.method3882(arg0);
        } else {
            Statics.field2678 = arg0;
        }
    }

    @ObfuscatedName("by.l(I)V")
    public static void method1013() {
        Statics.field2674.method3847();
        field2675 = 1;
        Statics.field2673 = null;
    }

    @ObfuscatedName("bn.b(ILjc;Ljava/lang/String;Ljava/lang/String;IZB)V")
    public static void method1022(int arg0, class262 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method4210(arg2);
        int var7 = arg1.method4211(var6, arg3);
        Statics.method1755(arg0, arg1, var6, var7, arg4, arg5);
    }

    @ObfuscatedName("er.x(I)V")
    public static void method2894() {
        try {
            if (field2675 == 1) {
                int var0 = Statics.field2674.method3868();
                if (var0 > 0 && Statics.field2674.method3873()) {
                    int var1 = var0 - Statics.field14;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field2674.method3882(var1);
                    return;
                }
                Statics.field2674.method3847();
                Statics.field2674.method3899();
                if (Statics.field2673 == null) {
                    field2675 = 0;
                } else {
                    field2675 = 2;
                }
                Statics.field2259 = null;
                Statics.field3482 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field2674.method3847();
            field2675 = 0;
            Statics.field2259 = null;
            Statics.field3482 = null;
            Statics.field2673 = null;
        }
    }

    @ObfuscatedName("kq.p(I)Z")
    public static boolean method5048() {
        try {
            if (field2675 == 2) {
                if (Statics.field2259 == null) {
                    Statics.field2259 = class236.method4026(Statics.field2673, Statics.field2200, Statics.field2677);
                    if (Statics.field2259 == null) {
                        return false;
                    }
                }
                if (Statics.field3482 == null) {
                    Statics.field3482 = new class111(Statics.field2676, Statics.field2954);
                }
                if (Statics.field2674.method3945(Statics.field2259, Statics.field259, Statics.field3482, 22050)) {
                    Statics.field2674.method3844();
                    Statics.field2674.method3882(Statics.field2678);
                    Statics.field2674.method3846(Statics.field2259, Statics.field1295);
                    field2675 = 0;
                    Statics.field2259 = null;
                    Statics.field3482 = null;
                    Statics.field2673 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field2674.method3847();
            field2675 = 0;
            Statics.field2259 = null;
            Statics.field3482 = null;
            Statics.field2673 = null;
        }
        return false;
    }
}

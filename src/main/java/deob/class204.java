package deob;

@ObfuscatedName("ge")
public class class204 {

    @ObfuscatedName("ge.s")
    public static int field2509 = 0;

    public class204() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ay.i(Liq;Liq;Liq;Lgv;I)Z")
    public static boolean method311(class236 arg0, class236 arg1, class236 arg2, class205 arg3) {
        Statics.field2507 = arg0;
        Statics.field2515 = arg1;
        Statics.field2508 = arg2;
        Statics.field2510 = arg3;
        return true;
    }

    @ObfuscatedName("ai.a(Liq;IIIZI)V")
    public static void method219(class236 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2509 = 1;
        Statics.field786 = arg0;
        Statics.field2512 = arg1;
        Statics.field2513 = arg2;
        Statics.field2514 = arg3;
        Statics.field2516 = arg4;
        Statics.field2518 = 10000;
    }

    @ObfuscatedName("cu.t(IB)V")
    public static void method1644(int arg0) {
        if (field2509 == 0) {
            Statics.field2510.method3411(arg0);
        } else {
            Statics.field2514 = arg0;
        }
    }

    @ObfuscatedName("fb.s(ILiq;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method2707(int arg0, class236 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method3800(arg2);
        int var7 = arg1.method3785(var6, arg3);
        Statics.method1495(arg0, arg1, var6, var7, arg4, arg5);
    }

    @ObfuscatedName("fm.v(II)V")
    public static void method3077(int arg0) {
        field2509 = 1;
        Statics.field786 = null;
        Statics.field2512 = -1;
        Statics.field2513 = -1;
        Statics.field2514 = 0;
        Statics.field2516 = false;
        Statics.field2518 = arg0;
    }

    @ObfuscatedName("cf.y(B)Z")
    public static boolean method1575() {
        return field2509 == 0 ? Statics.field2510.method3393() : true;
    }
}

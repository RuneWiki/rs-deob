package deob;

@ObfuscatedName("gv")
public class class204 {

    @ObfuscatedName("gv.e")
    public static int field2476 = 0;

    public class204() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("am.d(Lim;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method197(class236 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method3766(arg1);
        int var6 = arg0.method3767(var5, arg2);
        method3124(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("fa.q(Lim;IIIZI)V")
    public static void method3124(class236 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2476 = 1;
        Statics.field3615 = arg0;
        Statics.field254 = arg1;
        Statics.field2483 = arg2;
        Statics.field2475 = arg3;
        Statics.field2414 = arg4;
        Statics.field634 = 10000;
    }

    @ObfuscatedName("aw.x(B)V")
    public static void method624() {
        Statics.field2474.method3499();
        field2476 = 1;
        Statics.field3615 = null;
    }

    @ObfuscatedName("hg.y(ILim;Ljava/lang/String;Ljava/lang/String;IZB)V")
    public static void method3727(int arg0, class236 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method3766(arg2);
        int var7 = arg1.method3767(var6, arg3);
        method493(arg0, arg1, var6, var7, arg4, arg5);
    }

    @ObfuscatedName("aq.e(ILim;IIIZB)V")
    public static void method493(int arg0, class236 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2476 = 1;
        Statics.field3615 = arg1;
        Statics.field254 = arg2;
        Statics.field2483 = arg3;
        Statics.field2475 = arg4;
        Statics.field2414 = arg5;
        Statics.field634 = arg0;
    }

    @ObfuscatedName("ac.f(II)V")
    public static void method199(int arg0) {
        field2476 = 1;
        Statics.field3615 = null;
        Statics.field254 = -1;
        Statics.field2483 = -1;
        Statics.field2475 = 0;
        Statics.field2414 = false;
        Statics.field634 = arg0;
    }

    @ObfuscatedName("as.v(B)Z")
    public static boolean method610() {
        return field2476 == 0 ? Statics.field2474.method3415() : true;
    }
}

package deob;

@ObfuscatedName("gh")
public class class198 {

    @ObfuscatedName("gh.v")
    public static int field2378 = 0;

    public class198() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fk.a(Lhq;Lhq;Lhq;Lgg;I)Z")
    public static boolean method3290(class234 arg0, class234 arg1, class234 arg2, class199 arg3) {
        Statics.field2377 = arg0;
        Statics.field2382 = arg1;
        Statics.field2376 = arg2;
        Statics.field2375 = arg3;
        return true;
    }

    @ObfuscatedName("g.t(Lhq;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method290(class234 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method3891(arg1);
        int var6 = arg0.method3870(var5, arg2);
        method3457(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("gp.n(Lhq;IIIZI)V")
    public static void method3457(class234 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2378 = 1;
        Statics.field3280 = arg0;
        Statics.field2316 = arg1;
        Statics.field2379 = arg2;
        Statics.field2380 = arg3;
        Statics.field509 = arg4;
        Statics.field2385 = 10000;
    }

    @ObfuscatedName("ck.q(B)V")
    public static void method2208() {
        Statics.field2375.method3478();
        field2378 = 1;
        Statics.field3280 = null;
    }

    @ObfuscatedName("ce.l(II)V")
    public static void method1977(int arg0) {
        field2378 = 1;
        Statics.field3280 = null;
        Statics.field2316 = -1;
        Statics.field2379 = -1;
        Statics.field2380 = 0;
        Statics.field509 = false;
        Statics.field2385 = arg0;
    }
}

package deob;

@ObfuscatedName("eh")
public class class141 {

    @ObfuscatedName("eh.s")
    public static int field2382 = 0;

    public class141() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bh.b(Leg;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method1412(class155 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method3057(arg1);
        int var6 = arg0.method3090(var5, arg2);
        method761(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("aw.r(Leg;IIIZI)V")
    public static void method761(class155 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2382 = 1;
        Statics.field2380 = arg0;
        Statics.field174 = arg1;
        Statics.field118 = arg2;
        Statics.field2375 = arg3;
        Statics.field86 = arg4;
        Statics.field2476 = 10000;
    }

    @ObfuscatedName("g.l(IS)V")
    public static void method239(int arg0) {
        if (field2382 == 0) {
            Statics.field2381.method2786(arg0);
        } else {
            Statics.field2375 = arg0;
        }
    }

    @ObfuscatedName("k.s(ILeg;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method193(int arg0, class155 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method3057(arg2);
        int var7 = arg1.method3090(var6, arg3);
        field2382 = 1;
        Statics.field2380 = arg1;
        Statics.field174 = var6;
        Statics.field118 = var7;
        Statics.field2375 = arg4;
        Statics.field86 = arg5;
        Statics.field2476 = arg0;
    }

    @ObfuscatedName("fj.d(IB)V")
    public static void method3226(int arg0) {
        field2382 = 1;
        Statics.field2380 = null;
        Statics.field174 = -1;
        Statics.field118 = -1;
        Statics.field2375 = 0;
        Statics.field86 = false;
        Statics.field2476 = arg0;
    }

    @ObfuscatedName("cg.e(I)Z")
    public static boolean method2135() {
        return field2382 == 0 ? Statics.field2381.method2792() : true;
    }

    @ObfuscatedName("dk.u(I)Z")
    public static boolean method2227() {
        try {
            if (field2382 == 2) {
                if (Statics.field2383 == null) {
                    Statics.field2383 = class142.method2774(Statics.field2380, Statics.field174, Statics.field118);
                    if (Statics.field2383 == null) {
                        return false;
                    }
                }
                if (Statics.field2378 == null) {
                    Statics.field2378 = new class59(Statics.field2377, Statics.field2376);
                }
                if (Statics.field2381.method2876(Statics.field2383, Statics.field2379, Statics.field2378, 22050)) {
                    Statics.field2381.method2853();
                    Statics.field2381.method2786(Statics.field2375);
                    Statics.field2381.method2790(Statics.field2383, Statics.field86);
                    field2382 = 0;
                    Statics.field2383 = null;
                    Statics.field2378 = null;
                    Statics.field2380 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field2381.method2791();
            field2382 = 0;
            Statics.field2383 = null;
            Statics.field2378 = null;
            Statics.field2380 = null;
        }
        return false;
    }
}

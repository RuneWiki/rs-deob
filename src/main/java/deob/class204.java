package deob;

@ObfuscatedName("gl")
public class class204 {

    @ObfuscatedName("gl.g")
    public static int field2501 = 0;

    public class204() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bl.w(Lip;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method1005(class236 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method3955(arg1);
        int var6 = arg0.method3893(var5, arg2);
        method1573(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("cg.s(Lip;IIIZI)V")
    public static void method1573(class236 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2501 = 1;
        Statics.field1393 = arg0;
        Statics.field2503 = arg1;
        Statics.field2506 = arg2;
        Statics.field269 = arg3;
        Statics.field1540 = arg4;
        Statics.field524 = 10000;
    }

    @ObfuscatedName("h.q(IS)V")
    public static void method104(int arg0) {
        if (field2501 == 0) {
            Statics.field2500.method3560(arg0);
        } else {
            Statics.field269 = arg0;
        }
    }

    @ObfuscatedName("ez.o(I)V")
    public static void method2740() {
        Statics.field2500.method3527();
        field2501 = 1;
        Statics.field1393 = null;
    }

    @ObfuscatedName("d.g(ILip;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method39(int arg0, class236 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method3955(arg2);
        int var7 = arg1.method3893(var6, arg3);
        method2824(arg0, arg1, var6, var7, arg4, arg5);
    }

    @ObfuscatedName("fr.v(ILip;IIIZI)V")
    public static void method2824(int arg0, class236 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2501 = 1;
        Statics.field1393 = arg1;
        Statics.field2503 = arg2;
        Statics.field2506 = arg3;
        Statics.field269 = arg4;
        Statics.field1540 = arg5;
        Statics.field524 = arg0;
    }

    @ObfuscatedName("fk.p(II)V")
    public static void method2891(int arg0) {
        field2501 = 1;
        Statics.field1393 = null;
        Statics.field2503 = -1;
        Statics.field2506 = -1;
        Statics.field269 = 0;
        Statics.field1540 = false;
        Statics.field524 = arg0;
    }

    @ObfuscatedName("p.e(I)V")
    public static void method26() {
        try {
            if (field2501 == 1) {
                int var0 = Statics.field2500.method3584();
                if (var0 > 0 && Statics.field2500.method3600()) {
                    int var1 = var0 - Statics.field524;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field2500.method3560(var1);
                    return;
                }
                Statics.field2500.method3527();
                Statics.field2500.method3525();
                if (Statics.field1393 == null) {
                    field2501 = 0;
                } else {
                    field2501 = 2;
                }
                Statics.field864 = null;
                Statics.field2505 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field2500.method3527();
            field2501 = 0;
            Statics.field864 = null;
            Statics.field2505 = null;
            Statics.field1393 = null;
        }
    }
}

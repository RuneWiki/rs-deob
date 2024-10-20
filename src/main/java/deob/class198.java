package deob;

@ObfuscatedName("gr")
public class class198 {

    @ObfuscatedName("gr.r")
    public static int field2387 = 0;

    public class198() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ey.z(Lhp;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method3048(class234 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method3765(arg1);
        int var6 = arg0.method3745(var5, arg2);
        method1875(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("cg.n(Lhp;IIIZI)V")
    public static void method1875(class234 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2387 = 1;
        Statics.field2388 = arg0;
        Statics.field2324 = arg1;
        Statics.field401 = arg2;
        Statics.field1224 = arg3;
        Statics.field152 = arg4;
        Statics.field2383 = 10000;
    }

    @ObfuscatedName("dp.v(I)V")
    public static void method2695() {
        Statics.field400.method3415();
        field2387 = 1;
        Statics.field2388 = null;
    }

    @ObfuscatedName("w.u(ILhp;Ljava/lang/String;Ljava/lang/String;IZS)V")
    public static void method180(int arg0, class234 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method3765(arg2);
        int var7 = arg1.method3745(var6, arg3);
        field2387 = 1;
        Statics.field2388 = arg1;
        Statics.field2324 = var6;
        Statics.field401 = var7;
        Statics.field1224 = arg4;
        Statics.field152 = arg5;
        Statics.field2383 = arg0;
    }
}

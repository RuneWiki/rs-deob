package deob;

@ObfuscatedName("fa")
public class class161 {

    @ObfuscatedName("fa.d")
    public static int field2708 = 0;

    public class161() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ct.t(Leg;IIIZI)V")
    public static void method1932(class146 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2708 = 1;
        Statics.field2716 = arg0;
        Statics.field2025 = arg1;
        Statics.field1087 = arg2;
        Statics.field2710 = arg3;
        Statics.field1851 = arg4;
        Statics.field2704 = 10000;
    }

    @ObfuscatedName("cn.s(II)V")
    public static void method1828(int arg0) {
        if (field2708 == 0) {
            Statics.field2714.method3069(arg0);
        } else {
            Statics.field2710 = arg0;
        }
    }

    @ObfuscatedName("dt.f(I)V")
    public static void method2434() {
        Statics.field2714.method3038();
        field2708 = 1;
        Statics.field2716 = null;
    }

    @ObfuscatedName("ee.e(ILeg;Ljava/lang/String;Ljava/lang/String;IZB)V")
    public static void method2687(int arg0, class146 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method2724(arg2);
        int var7 = arg1.method2725(var6, arg3);
        method562(arg0, arg1, var6, var7, arg4, arg5);
    }

    @ObfuscatedName("ah.d(ILeg;IIIZI)V")
    public static void method562(int arg0, class146 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2708 = 1;
        Statics.field2716 = arg1;
        Statics.field2025 = arg2;
        Statics.field1087 = arg3;
        Statics.field2710 = arg4;
        Statics.field1851 = arg5;
        Statics.field2704 = arg0;
    }

    @ObfuscatedName("cp.n(II)V")
    public static void method1742(int arg0) {
        field2708 = 1;
        Statics.field2716 = null;
        Statics.field2025 = -1;
        Statics.field1087 = -1;
        Statics.field2710 = 0;
        Statics.field1851 = false;
        Statics.field2704 = arg0;
    }

    @ObfuscatedName("di.v(I)Z")
    public static boolean method2428() {
        return field2708 == 0 ? Statics.field2714.method3039() : true;
    }
}

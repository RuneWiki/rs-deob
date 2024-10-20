package deob;

@ObfuscatedName("fn")
public class class161 {

    @ObfuscatedName("fn.x")
    public static int field2706 = 0;

    public class161() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("t.e(Les;Ljava/lang/String;Ljava/lang/String;IZB)V")
    public static void method494(class146 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method2710(arg1);
        int var6 = arg0.method2711(var5, arg2);
        method515(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("z.v(Les;IIIZI)V")
    public static void method515(class146 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2706 = 1;
        Statics.field785 = arg0;
        Statics.field153 = arg1;
        Statics.field2711 = arg2;
        Statics.field601 = arg3;
        Statics.field1273 = arg4;
        Statics.field2102 = 10000;
    }

    @ObfuscatedName("au.i(II)V")
    public static void method819(int arg0) {
        if (field2706 == 0) {
            Statics.field2709.method3003(arg0);
        } else {
            Statics.field601 = arg0;
        }
    }

    @ObfuscatedName("cm.g(ILes;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method2046(int arg0, class146 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method2710(arg2);
        int var7 = arg1.method2711(var6, arg3);
        field2706 = 1;
        Statics.field785 = arg1;
        Statics.field153 = var6;
        Statics.field2711 = var7;
        Statics.field601 = arg4;
        Statics.field1273 = arg5;
        Statics.field2102 = arg0;
    }

    @ObfuscatedName("cs.x(II)V")
    public static void method1875(int arg0) {
        field2706 = 1;
        Statics.field785 = null;
        Statics.field153 = -1;
        Statics.field2711 = -1;
        Statics.field601 = 0;
        Statics.field1273 = false;
        Statics.field2102 = arg0;
    }

    @ObfuscatedName("dy.b(B)Z")
    public static boolean method2454() {
        return field2706 == 0 ? Statics.field2709.method3057() : true;
    }
}

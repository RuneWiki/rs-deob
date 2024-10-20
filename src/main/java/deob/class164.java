package deob;

@ObfuscatedName("fi")
public class class164 {

    @ObfuscatedName("fi.k")
    public static int field2722 = 0;

    public class164() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bo.g(Lei;Ljava/lang/String;Ljava/lang/String;IZB)V")
    public static void method1290(class149 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method2723(arg1);
        int var6 = arg0.method2676(var5, arg2);
        Statics.method31(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("cw.z(ILei;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method1745(int arg0, class149 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method2723(arg2);
        int var7 = arg1.method2676(var6, arg3);
        method123(arg0, arg1, var6, var7, arg4, arg5);
    }

    @ObfuscatedName("h.b(ILei;IIIZI)V")
    public static void method123(int arg0, class149 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2722 = 1;
        Statics.field2723 = arg1;
        Statics.field2725 = arg2;
        Statics.field2720 = arg3;
        Statics.field1565 = arg4;
        Statics.field2726 = arg5;
        Statics.field582 = arg0;
    }

    @ObfuscatedName("t.k(I)Z")
    public static boolean method481() {
        return field2722 == 0 ? Statics.field2721.method3064() : true;
    }

    @ObfuscatedName("dz.c(I)V")
    public static void method2522() {
        try {
            if (field2722 == 1) {
                int var0 = Statics.field2721.method2966();
                if (var0 > 0 && Statics.field2721.method3064()) {
                    int var1 = var0 - Statics.field582;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field2721.method2965(var1);
                    return;
                }
                Statics.field2721.method3058();
                Statics.field2721.method3039();
                if (Statics.field2723 == null) {
                    field2722 = 0;
                } else {
                    field2722 = 2;
                }
                Statics.field3020 = null;
                Statics.field2727 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field2721.method3058();
            field2722 = 0;
            Statics.field3020 = null;
            Statics.field2727 = null;
            Statics.field2723 = null;
        }
    }
}

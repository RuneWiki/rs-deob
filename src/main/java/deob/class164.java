package deob;

@ObfuscatedName("fo")
public class class164 {

    @ObfuscatedName("fo.f")
    public static int field2727 = 0;

    public class164() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cc.c(Ler;IIIZI)V")
    public static void method1981(class149 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2727 = 1;
        Statics.field2734 = arg0;
        Statics.field2729 = arg1;
        Statics.field1881 = arg2;
        Statics.field2730 = arg3;
        Statics.field1446 = arg4;
        Statics.field1920 = 10000;
    }

    @ObfuscatedName("df.j(ILer;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method2548(int arg0, class149 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method2761(arg2);
        int var7 = arg1.method2762(var6, arg3);
        field2727 = 1;
        Statics.field2734 = arg1;
        Statics.field2729 = var6;
        Statics.field1881 = var7;
        Statics.field2730 = arg4;
        Statics.field1446 = arg5;
        Statics.field1920 = arg0;
    }

    @ObfuscatedName("au.r(I)Z")
    public static boolean method818() {
        try {
            if (field2727 == 2) {
                if (Statics.field635 == null) {
                    Statics.field635 = class161.method2981(Statics.field2734, Statics.field2729, Statics.field1881);
                    if (Statics.field635 == null) {
                        return false;
                    }
                }
                if (Statics.field2496 == null) {
                    Statics.field2496 = new class54(Statics.field2733, Statics.field2724);
                }
                if (Statics.field2675.method3058(Statics.field635, Statics.field2725, Statics.field2496, 22050)) {
                    Statics.field2675.method3059();
                    Statics.field2675.method3056(Statics.field2730);
                    Statics.field2675.method3126(Statics.field635, Statics.field1446);
                    field2727 = 0;
                    Statics.field635 = null;
                    Statics.field2496 = null;
                    Statics.field2734 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field2675.method3107();
            field2727 = 0;
            Statics.field635 = null;
            Statics.field2496 = null;
            Statics.field2734 = null;
        }
        return false;
    }
}

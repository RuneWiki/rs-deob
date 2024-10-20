package deob;

@ObfuscatedName("hh")
public class class220 {

    @ObfuscatedName("hh.g")
    public static int field2500 = 0;

    public class220() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("h.c(Lih;IIIZB)V")
    public static void method88(class250 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2500 = 1;
        Statics.field1392 = arg0;
        Statics.field2503 = arg1;
        Statics.field21 = arg2;
        Statics.field2506 = arg3;
        Statics.field595 = arg4;
        Statics.field393 = 10000;
    }

    @ObfuscatedName("ej.q(ILih;IIIZI)V")
    public static void method2873(int arg0, class250 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2500 = 1;
        Statics.field1392 = arg1;
        Statics.field2503 = arg2;
        Statics.field21 = arg3;
        Statics.field2506 = arg4;
        Statics.field595 = arg5;
        Statics.field393 = arg0;
    }

    @ObfuscatedName("e.m(II)V")
    public static void method286(int arg0) {
        field2500 = 1;
        Statics.field1392 = null;
        Statics.field2503 = -1;
        Statics.field21 = -1;
        Statics.field2506 = 0;
        Statics.field595 = false;
        Statics.field393 = arg0;
    }

    @ObfuscatedName("cq.j(S)V")
    public static void method1685() {
        try {
            if (field2500 == 1) {
                int var0 = Statics.field1971.method3847();
                if (var0 > 0 && Statics.field1971.method3853()) {
                    int var1 = var0 - Statics.field393;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field1971.method3846(var1);
                    return;
                }
                Statics.field1971.method3852();
                Statics.field1971.method3850();
                if (Statics.field1392 == null) {
                    field2500 = 0;
                } else {
                    field2500 = 2;
                }
                Statics.field2505 = null;
                Statics.field3836 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field1971.method3852();
            field2500 = 0;
            Statics.field2505 = null;
            Statics.field3836 = null;
            Statics.field1392 = null;
        }
    }
}

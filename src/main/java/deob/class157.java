package deob;

@ObfuscatedName("fn")
public class class157 {

    @ObfuscatedName("fn.e")
    public static int field2681 = 0;

    public class157() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("az.z(Lel;IIIZI)V")
    public static void method858(class142 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2681 = 1;
        Statics.field2679 = arg0;
        Statics.field579 = arg1;
        Statics.field2447 = arg2;
        Statics.field1914 = arg3;
        Statics.field1218 = arg4;
        Statics.field2678 = 10000;
    }

    @ObfuscatedName("ew.n(I)V")
    public static void method2917() {
        Statics.field2676.method3067();
        field2681 = 1;
        Statics.field2679 = null;
    }

    @ObfuscatedName("e.u(ILel;IIIZB)V")
    public static void method40(int arg0, class142 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2681 = 1;
        Statics.field2679 = arg1;
        Statics.field579 = arg2;
        Statics.field2447 = arg3;
        Statics.field1914 = arg4;
        Statics.field1218 = arg5;
        Statics.field2678 = arg0;
    }

    @ObfuscatedName("bl.t(I)Z")
    public static boolean method1343() {
        return field2681 == 0 ? Statics.field2676.method3125() : true;
    }

    @ObfuscatedName("w.e(I)V")
    public static void method552() {
        try {
            if (field2681 == 1) {
                int var0 = Statics.field2676.method3093();
                if (var0 > 0 && Statics.field2676.method3125()) {
                    int var1 = var0 - Statics.field2678;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field2676.method3062(var1);
                    return;
                }
                Statics.field2676.method3067();
                Statics.field2676.method3095();
                if (Statics.field2679 == null) {
                    field2681 = 0;
                } else {
                    field2681 = 2;
                }
                Statics.field769 = null;
                Statics.field1389 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field2676.method3067();
            field2681 = 0;
            Statics.field769 = null;
            Statics.field1389 = null;
            Statics.field2679 = null;
        }
    }

    @ObfuscatedName("cu.a(I)Z")
    public static boolean method2076() {
        try {
            if (field2681 == 2) {
                if (Statics.field769 == null) {
                    Statics.field769 = class154.method2975(Statics.field2679, Statics.field579, Statics.field2447);
                    if (Statics.field769 == null) {
                        return false;
                    }
                }
                if (Statics.field1389 == null) {
                    Statics.field1389 = new class50(Statics.field1972, Statics.field2680);
                }
                if (Statics.field2676.method3130(Statics.field769, Statics.field2677, Statics.field1389, 22050)) {
                    Statics.field2676.method3064();
                    Statics.field2676.method3062(Statics.field1914);
                    Statics.field2676.method3066(Statics.field769, Statics.field1218);
                    field2681 = 0;
                    Statics.field769 = null;
                    Statics.field1389 = null;
                    Statics.field2679 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field2676.method3067();
            field2681 = 0;
            Statics.field769 = null;
            Statics.field1389 = null;
            Statics.field2679 = null;
        }
        return false;
    }
}

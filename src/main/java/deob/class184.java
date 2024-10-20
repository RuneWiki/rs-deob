package deob;

@ObfuscatedName("gd")
public class class184 {

    @ObfuscatedName("gd.x")
    public static int field2960 = 0;

    public class184() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dv.j(Lfy;IIIZI)V")
    public static void method2638(class168 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2960 = 1;
        Statics.field1371 = arg0;
        Statics.field2961 = arg1;
        Statics.field2962 = arg2;
        Statics.field2958 = arg3;
        Statics.field2965 = arg4;
        Statics.field2964 = 10000;
    }

    @ObfuscatedName("ah.h(II)V")
    public static void method811(int arg0) {
        if (field2960 == 0) {
            Statics.field2959.method3345(arg0);
        } else {
            Statics.field2958 = arg0;
        }
    }

    @ObfuscatedName("fm.m(I)V")
    public static void method3118() {
        Statics.field2959.method3351();
        field2960 = 1;
        Statics.field1371 = null;
    }

    @ObfuscatedName("bp.z(ILfy;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method1585(int arg0, class168 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method3026(arg2);
        int var7 = arg1.method3027(var6, arg3);
        field2960 = 1;
        Statics.field1371 = arg1;
        Statics.field2961 = var6;
        Statics.field2962 = var7;
        Statics.field2958 = arg4;
        Statics.field2965 = arg5;
        Statics.field2964 = arg0;
    }

    @ObfuscatedName("a.x(B)Z")
    public static boolean method158() {
        return field2960 == 0 ? Statics.field2959.method3381() : true;
    }

    @ObfuscatedName("ao.e(I)Z")
    public static boolean method701() {
        try {
            if (field2960 == 2) {
                if (Statics.field2956 == null) {
                    Statics.field2956 = class181.method3256(Statics.field1371, Statics.field2961, Statics.field2962);
                    if (Statics.field2956 == null) {
                        return false;
                    }
                }
                if (Statics.field68 == null) {
                    Statics.field68 = new class60(Statics.field2963, Statics.field2957);
                }
                if (Statics.field2959.method3405(Statics.field2956, Statics.field2966, Statics.field68, 22050)) {
                    Statics.field2959.method3348();
                    Statics.field2959.method3345(Statics.field2958);
                    Statics.field2959.method3350(Statics.field2956, Statics.field2965);
                    field2960 = 0;
                    Statics.field2956 = null;
                    Statics.field68 = null;
                    Statics.field1371 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field2959.method3351();
            field2960 = 0;
            Statics.field2956 = null;
            Statics.field68 = null;
            Statics.field1371 = null;
        }
        return false;
    }
}

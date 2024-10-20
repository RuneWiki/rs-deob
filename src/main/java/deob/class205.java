package deob;

@ObfuscatedName("ga")
public class class205 {

    @ObfuscatedName("ga.o")
    public static int field2508 = 0;

    public class205() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("da.i(Lii;IIIZS)V")
    public static void method2134(class237 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2508 = 1;
        Statics.field2509 = arg0;
        Statics.field2510 = arg1;
        Statics.field788 = arg2;
        Statics.field2511 = arg3;
        Statics.field1529 = arg4;
        Statics.field1695 = 10000;
    }

    @ObfuscatedName("fk.j(II)V")
    public static void method2895(int arg0) {
        if (field2508 == 0) {
            Statics.field2857.method3529(arg0);
        } else {
            Statics.field2511 = arg0;
        }
    }

    @ObfuscatedName("fs.a(I)V")
    public static void method2905() {
        Statics.field2857.method3508();
        field2508 = 1;
        Statics.field2509 = null;
    }

    @ObfuscatedName("ak.r(ILii;IIIZI)V")
    public static void method647(int arg0, class237 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2508 = 1;
        Statics.field2509 = arg1;
        Statics.field2510 = arg2;
        Statics.field788 = arg3;
        Statics.field2511 = arg4;
        Statics.field1529 = arg5;
        Statics.field1695 = arg0;
    }

    @ObfuscatedName("fa.o(IB)V")
    public static void method2963(int arg0) {
        field2508 = 1;
        Statics.field2509 = null;
        Statics.field2510 = -1;
        Statics.field788 = -1;
        Statics.field2511 = 0;
        Statics.field1529 = false;
        Statics.field1695 = arg0;
    }

    @ObfuscatedName("y.n(I)Z")
    public static boolean method67() {
        try {
            if (field2508 == 2) {
                if (Statics.field2621 == null) {
                    Statics.field2621 = class211.method3668(Statics.field2509, Statics.field2510, Statics.field788);
                    if (Statics.field2621 == null) {
                        return false;
                    }
                }
                if (Statics.field2512 == null) {
                    Statics.field2512 = new class112(Statics.field2507, Statics.field2513);
                }
                if (Statics.field2857.method3514(Statics.field2621, Statics.field2505, Statics.field2512, 22050)) {
                    Statics.field2857.method3506();
                    Statics.field2857.method3529(Statics.field2511);
                    Statics.field2857.method3530(Statics.field2621, Statics.field1529);
                    field2508 = 0;
                    Statics.field2621 = null;
                    Statics.field2512 = null;
                    Statics.field2509 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field2857.method3508();
            field2508 = 0;
            Statics.field2621 = null;
            Statics.field2512 = null;
            Statics.field2509 = null;
        }
        return false;
    }
}

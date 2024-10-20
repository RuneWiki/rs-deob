package deob;

@ObfuscatedName("gf")
public class class183 {

    @ObfuscatedName("gf.r")
    public static int field2951 = 0;

    public class183() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fk.n(Lfm;Lfm;Lfm;Lgd;I)Z")
    public static boolean method3275(class167 arg0, class167 arg1, class167 arg2, class184 arg3) {
        Statics.field2945 = arg0;
        Statics.field2946 = arg1;
        Statics.field1891 = arg2;
        Statics.field2050 = arg3;
        return true;
    }

    @ObfuscatedName("ai.q(Lfm;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method759(class167 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method3035(arg1);
        int var6 = arg0.method3042(var5, arg2);
        method188(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("s.c(Lfm;IIIZB)V")
    public static void method188(class167 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2951 = 1;
        Statics.field1962 = arg0;
        Statics.field2291 = arg1;
        Statics.field1997 = arg2;
        Statics.field2948 = arg3;
        Statics.field195 = arg4;
        Statics.field2949 = 10000;
    }

    @ObfuscatedName("bn.l(IB)V")
    public static void method1084(int arg0) {
        if (field2951 == 0) {
            Statics.field2050.method3374(arg0);
        } else {
            Statics.field2948 = arg0;
        }
    }

    @ObfuscatedName("fu.r(B)V")
    public static void method2988() {
        Statics.field2050.method3349();
        field2951 = 1;
        Statics.field1962 = null;
    }

    @ObfuscatedName("dz.u(ILfm;IIIZI)V")
    public static void method2244(int arg0, class167 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2951 = 1;
        Statics.field1962 = arg1;
        Statics.field2291 = arg2;
        Statics.field1997 = arg3;
        Statics.field2948 = arg4;
        Statics.field195 = arg5;
        Statics.field2949 = arg0;
    }

    @ObfuscatedName("y.j(II)V")
    public static void method118(int arg0) {
        field2951 = 1;
        Statics.field1962 = null;
        Statics.field2291 = -1;
        Statics.field1997 = -1;
        Statics.field2948 = 0;
        Statics.field195 = false;
        Statics.field2949 = arg0;
    }

    @ObfuscatedName("by.w(B)Z")
    public static boolean method1579() {
        return field2951 == 0 ? Statics.field2050.method3350() : true;
    }

    @ObfuscatedName("v.y(I)Z")
    public static boolean method154() {
        try {
            if (field2951 == 2) {
                if (Statics.field1525 == null) {
                    Statics.field1525 = class180.method3265(Statics.field1962, Statics.field2291, Statics.field1997);
                    if (Statics.field1525 == null) {
                        return false;
                    }
                }
                if (Statics.field2950 == null) {
                    Statics.field2950 = new class60(Statics.field1891, Statics.field2946);
                }
                if (Statics.field2050.method3371(Statics.field1525, Statics.field2945, Statics.field2950, 22050)) {
                    Statics.field2050.method3346();
                    Statics.field2050.method3374(Statics.field2948);
                    Statics.field2050.method3348(Statics.field1525, Statics.field195);
                    field2951 = 0;
                    Statics.field1525 = null;
                    Statics.field2950 = null;
                    Statics.field1962 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field2050.method3349();
            field2951 = 0;
            Statics.field1525 = null;
            Statics.field2950 = null;
            Statics.field1962 = null;
        }
        return false;
    }
}

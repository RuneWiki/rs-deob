package deob;

@ObfuscatedName("gr")
public class class183 {

    @ObfuscatedName("gr.f")
    public static int field2927 = 0;

    public class183() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fd.h(Lfv;IIIZI)V")
    public static void method3296(class167 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2927 = 1;
        Statics.field174 = arg0;
        Statics.field1762 = arg1;
        Statics.field697 = arg2;
        Statics.field3107 = arg3;
        Statics.field2068 = arg4;
        Statics.field28 = 10000;
    }

    @ObfuscatedName("l.q(II)V")
    public static void method143(int arg0) {
        if (field2927 == 0) {
            Statics.field2926.method3420(arg0);
        } else {
            Statics.field3107 = arg0;
        }
    }

    @ObfuscatedName("eq.v(ILfv;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method2862(int arg0, class167 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method3084(arg2);
        int var7 = arg1.method3076(var6, arg3);
        field2927 = 1;
        Statics.field174 = arg1;
        Statics.field1762 = var6;
        Statics.field697 = var7;
        Statics.field3107 = arg4;
        Statics.field2068 = arg5;
        Statics.field28 = arg0;
    }

    @ObfuscatedName("el.n(I)Z")
    public static boolean method2885() {
        return field2927 == 0 ? Statics.field2926.method3425() : true;
    }

    @ObfuscatedName("bt.f(B)Z")
    public static boolean method1492() {
        try {
            if (field2927 == 2) {
                if (Statics.field1612 == null) {
                    Statics.field1612 = class180.method3338(Statics.field174, Statics.field1762, Statics.field697);
                    if (Statics.field1612 == null) {
                        return false;
                    }
                }
                if (Statics.field1993 == null) {
                    Statics.field1993 = new class60(Statics.field605, Statics.field2925);
                }
                if (Statics.field2926.method3422(Statics.field1612, Statics.field2928, Statics.field1993, 22050)) {
                    Statics.field2926.method3423();
                    Statics.field2926.method3420(Statics.field3107);
                    Statics.field2926.method3429(Statics.field1612, Statics.field2068);
                    field2927 = 0;
                    Statics.field1612 = null;
                    Statics.field1993 = null;
                    Statics.field174 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field2926.method3426();
            field2927 = 0;
            Statics.field1612 = null;
            Statics.field1993 = null;
            Statics.field174 = null;
        }
        return false;
    }
}

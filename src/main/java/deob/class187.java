package deob;

@ObfuscatedName("gn")
public class class187 {

    @ObfuscatedName("gn.v")
    public static int field3006 = 0;

    public class187() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("w.f(Lfj;Lfj;Lfj;Lgp;I)Z")
    public static boolean method114(class171 arg0, class171 arg1, class171 arg2, class188 arg3) {
        Statics.field3004 = arg0;
        Statics.field2994 = arg1;
        Statics.field2995 = arg2;
        Statics.field671 = arg3;
        return true;
    }

    @ObfuscatedName("e.e(Lfj;IIIZI)V")
    public static void method17(class171 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3006 = 1;
        Statics.field2997 = arg0;
        Statics.field2998 = arg1;
        Statics.field2778 = arg2;
        Statics.field3000 = arg3;
        Statics.field2993 = arg4;
        Statics.field3003 = 10000;
    }

    @ObfuscatedName("dd.n(II)V")
    public static void method2277(int arg0) {
        if (field3006 == 0) {
            Statics.field671.method3481(arg0);
        } else {
            Statics.field3000 = arg0;
        }
    }

    @ObfuscatedName("ej.t(B)V")
    public static void method2981() {
        Statics.field671.method3457();
        field3006 = 1;
        Statics.field2997 = null;
    }

    @ObfuscatedName("fq.v(ILfj;IIIZI)V")
    public static void method3021(int arg0, class171 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field3006 = 1;
        Statics.field2997 = arg1;
        Statics.field2998 = arg2;
        Statics.field2778 = arg3;
        Statics.field3000 = arg4;
        Statics.field2993 = arg5;
        Statics.field3003 = arg0;
    }

    @ObfuscatedName("i.b(II)V")
    public static void method141(int arg0) {
        field3006 = 1;
        Statics.field2997 = null;
        Statics.field2998 = -1;
        Statics.field2778 = -1;
        Statics.field3000 = 0;
        Statics.field2993 = false;
        Statics.field3003 = arg0;
    }

    @ObfuscatedName("fg.m(I)Z")
    public static boolean method3217() {
        try {
            if (field3006 == 2) {
                if (Statics.field3002 == null) {
                    Statics.field3002 = class184.method3368(Statics.field2997, Statics.field2998, Statics.field2778);
                    if (Statics.field3002 == null) {
                        return false;
                    }
                }
                if (Statics.field3001 == null) {
                    Statics.field3001 = new class63(Statics.field2995, Statics.field2994);
                }
                if (Statics.field671.method3525(Statics.field3002, Statics.field3004, Statics.field3001, 22050)) {
                    Statics.field671.method3454();
                    Statics.field671.method3481(Statics.field3000);
                    Statics.field671.method3456(Statics.field3002, Statics.field2993);
                    field3006 = 0;
                    Statics.field3002 = null;
                    Statics.field3001 = null;
                    Statics.field2997 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field671.method3457();
            field3006 = 0;
            Statics.field3002 = null;
            Statics.field3001 = null;
            Statics.field2997 = null;
        }
        return false;
    }
}

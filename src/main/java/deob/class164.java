package deob;

@ObfuscatedName("fe")
public class class164 {

    @ObfuscatedName("fe.h")
    public static int field2731 = 0;

    public class164() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("el.x(Ley;IIIZI)V")
    public static void method2618(class149 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2731 = 1;
        Statics.field126 = arg0;
        Statics.field2726 = arg1;
        Statics.field2729 = arg2;
        Statics.field2675 = arg3;
        Statics.field2728 = arg4;
        Statics.field1987 = 10000;
    }

    @ObfuscatedName("dt.v(II)V")
    public static void method2476(int arg0) {
        if (field2731 == 0) {
            Statics.field2725.method3140(arg0);
        } else {
            Statics.field2675 = arg0;
        }
    }

    @ObfuscatedName("fc.m(I)V")
    public static void method2904() {
        Statics.field2725.method3057();
        field2731 = 1;
        Statics.field126 = null;
    }

    @ObfuscatedName("g.e(ILey;IIIZI)V")
    public static void method141(int arg0, class149 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2731 = 1;
        Statics.field126 = arg1;
        Statics.field2726 = arg2;
        Statics.field2729 = arg3;
        Statics.field2675 = arg4;
        Statics.field2728 = arg5;
        Statics.field1987 = arg0;
    }

    @ObfuscatedName("cn.h(IB)V")
    public static void method1787(int arg0) {
        field2731 = 1;
        Statics.field126 = null;
        Statics.field2726 = -1;
        Statics.field2729 = -1;
        Statics.field2675 = 0;
        Statics.field2728 = false;
        Statics.field1987 = arg0;
    }

    @ObfuscatedName("ay.p(B)Z")
    public static boolean method548() {
        return field2731 == 0 ? Statics.field2725.method3122() : true;
    }

    @ObfuscatedName("dz.j(B)V")
    public static void method2407() {
        try {
            if (field2731 == 1) {
                int var0 = Statics.field2725.method3052();
                if (var0 > 0 && Statics.field2725.method3122()) {
                    int var1 = var0 - Statics.field1987;
                    if (var1 < 0) {
                        var1 = 0;
                    }
                    Statics.field2725.method3140(var1);
                    return;
                }
                Statics.field2725.method3057();
                Statics.field2725.method3055();
                if (Statics.field126 == null) {
                    field2731 = 0;
                } else {
                    field2731 = 2;
                }
                Statics.field2036 = null;
                Statics.field2103 = null;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            Statics.field2725.method3057();
            field2731 = 0;
            Statics.field2036 = null;
            Statics.field2103 = null;
            Statics.field126 = null;
        }
    }

    @ObfuscatedName("x.i(I)Z")
    public static boolean method1() {
        try {
            if (field2731 == 2) {
                if (Statics.field2036 == null) {
                    Statics.field2036 = class161.method2963(Statics.field126, Statics.field2726, Statics.field2729);
                    if (Statics.field2036 == null) {
                        return false;
                    }
                }
                if (Statics.field2103 == null) {
                    Statics.field2103 = new class54(Statics.field2723, Statics.field2722);
                }
                if (Statics.field2725.method3086(Statics.field2036, Statics.field2732, Statics.field2103, 22050)) {
                    Statics.field2725.method3054();
                    Statics.field2725.method3140(Statics.field2675);
                    Statics.field2725.method3056(Statics.field2036, Statics.field2728);
                    field2731 = 0;
                    Statics.field2036 = null;
                    Statics.field2103 = null;
                    Statics.field126 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field2725.method3057();
            field2731 = 0;
            Statics.field2036 = null;
            Statics.field2103 = null;
            Statics.field126 = null;
        }
        return false;
    }
}

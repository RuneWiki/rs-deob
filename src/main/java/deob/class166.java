package deob;

@ObfuscatedName("fl")
public class class166 {

    @ObfuscatedName("fl.l")
    public static int field2737 = 0;

    public class166() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ad.v(Lem;Lem;Lem;Lft;I)Z")
    public static boolean method540(class151 arg0, class151 arg1, class151 arg2, class167 arg3) {
        Statics.field2742 = arg0;
        Statics.field2740 = arg1;
        Statics.field2733 = arg2;
        Statics.field2736 = arg3;
        return true;
    }

    @ObfuscatedName("j.t(Lem;IIIZI)V")
    public static void method25(class151 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2737 = 1;
        Statics.field1666 = arg0;
        Statics.field64 = arg1;
        Statics.field1825 = arg2;
        Statics.field2508 = arg3;
        Statics.field31 = arg4;
        Statics.field2738 = 10000;
    }

    @ObfuscatedName("de.f(II)V")
    public static void method2571(int arg0) {
        if (field2737 == 0) {
            Statics.field2736.method3113(arg0);
        } else {
            Statics.field2508 = arg0;
        }
    }

    @ObfuscatedName("bf.j(ILem;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method1379(int arg0, class151 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method2799(arg2);
        int var7 = arg1.method2841(var6, arg3);
        field2737 = 1;
        Statics.field1666 = arg1;
        Statics.field64 = var6;
        Statics.field1825 = var7;
        Statics.field2508 = arg4;
        Statics.field31 = arg5;
        Statics.field2738 = arg0;
    }

    @ObfuscatedName("dl.l(II)V")
    public static void method2473(int arg0) {
        field2737 = 1;
        Statics.field1666 = null;
        Statics.field64 = -1;
        Statics.field1825 = -1;
        Statics.field2508 = 0;
        Statics.field31 = false;
        Statics.field2738 = arg0;
    }

    @ObfuscatedName("em.g(B)Z")
    public static boolean method2851() {
        return field2737 == 0 ? Statics.field2736.method3119() : true;
    }

    @ObfuscatedName("bs.k(S)Z")
    public static boolean method1422() {
        try {
            if (field2737 == 2) {
                if (Statics.field2688 == null) {
                    Statics.field2688 = class163.method3025(Statics.field1666, Statics.field64, Statics.field1825);
                    if (Statics.field2688 == null) {
                        return false;
                    }
                }
                if (Statics.field75 == null) {
                    Statics.field75 = new class54(Statics.field2733, Statics.field2740);
                }
                if (Statics.field2736.method3115(Statics.field2688, Statics.field2742, Statics.field75, 22050)) {
                    Statics.field2736.method3116();
                    Statics.field2736.method3113(Statics.field2508);
                    Statics.field2736.method3118(Statics.field2688, Statics.field31);
                    field2737 = 0;
                    Statics.field2688 = null;
                    Statics.field75 = null;
                    Statics.field1666 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field2736.method3157();
            field2737 = 0;
            Statics.field2688 = null;
            Statics.field75 = null;
            Statics.field1666 = null;
        }
        return false;
    }
}

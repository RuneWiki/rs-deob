package deob;

@ObfuscatedName("fr")
public class class174 {

    @ObfuscatedName("fr.s")
    public static int field2843 = 0;

    public class174() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("h.n(Lfi;Lfi;Lfi;Lfm;B)Z")
    public static boolean method494(class158 arg0, class158 arg1, class158 arg2, class175 arg3) {
        Statics.field2854 = arg0;
        Statics.field2845 = arg1;
        Statics.field2856 = arg2;
        Statics.field2540 = arg3;
        return true;
    }

    @ObfuscatedName("ct.g(Lfi;Ljava/lang/String;Ljava/lang/String;IZS)V")
    public static void method2133(class158 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method2924(arg1);
        int var6 = arg0.method2935(var5, arg2);
        method2851(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("eq.a(Lfi;IIIZI)V")
    public static void method2851(class158 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2843 = 1;
        Statics.field2847 = arg0;
        Statics.field1582 = arg1;
        Statics.field2848 = arg2;
        Statics.field2844 = arg3;
        Statics.field2850 = arg4;
        Statics.field2787 = 10000;
    }

    @ObfuscatedName("fb.m(II)V")
    public static void method3090(int arg0) {
        if (field2843 == 0) {
            Statics.field2540.method3246(arg0);
        } else {
            Statics.field2844 = arg0;
        }
    }

    @ObfuscatedName("cl.s(ILfi;IIIZI)V")
    public static void method2054(int arg0, class158 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2843 = 1;
        Statics.field2847 = arg1;
        Statics.field1582 = arg2;
        Statics.field2848 = arg3;
        Statics.field2844 = arg4;
        Statics.field2850 = arg5;
        Statics.field2787 = arg0;
    }

    @ObfuscatedName("ar.j(IB)V")
    public static void method722(int arg0) {
        field2843 = 1;
        Statics.field2847 = null;
        Statics.field1582 = -1;
        Statics.field2848 = -1;
        Statics.field2844 = 0;
        Statics.field2850 = false;
        Statics.field2787 = arg0;
    }

    @ObfuscatedName("dl.t(I)Z")
    public static boolean method2638() {
        try {
            if (field2843 == 2) {
                if (Statics.field2851 == null) {
                    Statics.field2851 = class171.method3153(Statics.field2847, Statics.field1582, Statics.field2848);
                    if (Statics.field2851 == null) {
                        return false;
                    }
                }
                if (Statics.field1406 == null) {
                    Statics.field1406 = new class55(Statics.field2856, Statics.field2845);
                }
                if (Statics.field2540.method3279(Statics.field2851, Statics.field2854, Statics.field1406, 22050)) {
                    Statics.field2540.method3268();
                    Statics.field2540.method3246(Statics.field2844);
                    Statics.field2540.method3251(Statics.field2851, Statics.field2850);
                    field2843 = 0;
                    Statics.field2851 = null;
                    Statics.field1406 = null;
                    Statics.field2847 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field2540.method3252();
            field2843 = 0;
            Statics.field2851 = null;
            Statics.field1406 = null;
            Statics.field2847 = null;
        }
        return false;
    }
}

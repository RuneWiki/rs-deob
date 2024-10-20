package deob;

@ObfuscatedName("bm")
public class class78 {

    @ObfuscatedName("bm.k")
    public static int field1109 = 0;

    public class78() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ae.t(Lcy;IIIZI)V")
    public static void method370(class86 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field1109 = 1;
        Statics.field1106 = arg0;
        Statics.field1143 = arg1;
        Statics.field1111 = arg2;
        Statics.field1114 = arg3;
        Statics.field202 = arg4;
        Statics.field1113 = 10000;
    }

    @ObfuscatedName("dj.n(II)V")
    public static void method1480(int arg0) {
        if (field1109 == 0) {
            Statics.field1110.method2194(arg0);
        } else {
            Statics.field1114 = arg0;
        }
    }

    @ObfuscatedName("fw.q(ILcy;IIIZI)V")
    public static void method2641(int arg0, class86 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field1109 = 1;
        Statics.field1106 = arg1;
        Statics.field1143 = arg2;
        Statics.field1111 = arg3;
        Statics.field1114 = arg4;
        Statics.field202 = arg5;
        Statics.field1113 = arg0;
    }

    @ObfuscatedName("cm.h(IB)V")
    public static void method1010(int arg0) {
        field1109 = 1;
        Statics.field1106 = null;
        Statics.field1143 = -1;
        Statics.field1111 = -1;
        Statics.field1114 = 0;
        Statics.field202 = false;
        Statics.field1113 = arg0;
    }

    @ObfuscatedName("ad.r(I)Z")
    public static boolean method396() {
        try {
            if (field1109 == 2) {
                if (Statics.field1578 == null) {
                    Statics.field1578 = class136.method1750(Statics.field1106, Statics.field1143, Statics.field1111);
                    if (Statics.field1578 == null) {
                        return false;
                    }
                }
                if (Statics.field1112 == null) {
                    Statics.field1112 = new class23(Statics.field1107, Statics.field733);
                }
                if (Statics.field1110.method2196(Statics.field1578, Statics.field1108, Statics.field1112, 22050)) {
                    Statics.field1110.method2197();
                    Statics.field1110.method2194(Statics.field1114);
                    Statics.field1110.method2199(Statics.field1578, Statics.field202);
                    field1109 = 0;
                    Statics.field1578 = null;
                    Statics.field1112 = null;
                    Statics.field1106 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field1110.method2263();
            field1109 = 0;
            Statics.field1578 = null;
            Statics.field1112 = null;
            Statics.field1106 = null;
        }
        return false;
    }
}

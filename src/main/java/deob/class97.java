package deob;

@ObfuscatedName("en")
public class class97 {

    @ObfuscatedName("en.t")
    public static int field1365 = 0;

    public class97() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("q.h(IB)V")
    public static void method1367(int arg0) {
        if (field1365 == 0) {
            Statics.field47.method979(arg0);
        } else {
            Statics.field1367 = arg0;
        }
    }

    @ObfuscatedName("bx.b(Lek;IIIZI)V")
    public static void method2017(class89 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field1365 = 1;
        Statics.field938 = arg0;
        Statics.field1366 = arg1;
        Statics.field701 = arg2;
        Statics.field1367 = arg3;
        Statics.field2144 = arg4;
        Statics.field1368 = 10000;
    }

    @ObfuscatedName("cz.w(I)Z")
    public static boolean method2349() {
        try {
            if (field1365 == 2) {
                if (Statics.field2599 == null) {
                    Statics.field2599 = class98.method1406(Statics.field938, Statics.field1366, Statics.field701);
                    if (Statics.field2599 == null) {
                        return false;
                    }
                }
                if (Statics.field2062 == null) {
                    Statics.field2062 = new class117(Statics.field1370, Statics.field436);
                }
                if (Statics.field47.method965(Statics.field2599, Statics.field1363, Statics.field2062, 22050)) {
                    Statics.field47.method966();
                    Statics.field47.method979(Statics.field1367);
                    Statics.field47.method1034(Statics.field2599, Statics.field2144);
                    field1365 = 0;
                    Statics.field2599 = null;
                    Statics.field2062 = null;
                    Statics.field938 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field47.method1004();
            field1365 = 0;
            Statics.field2599 = null;
            Statics.field2062 = null;
            Statics.field938 = null;
        }
        return false;
    }

    @ObfuscatedName("cx.k(ILek;IIIZI)V")
    public static void method2371(int arg0, class89 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field1365 = 1;
        Statics.field938 = arg1;
        Statics.field1366 = arg2;
        Statics.field701 = arg3;
        Statics.field1367 = arg4;
        Statics.field2144 = arg5;
        Statics.field1368 = arg0;
    }
}

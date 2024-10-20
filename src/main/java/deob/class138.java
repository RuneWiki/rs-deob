package deob;

@ObfuscatedName("ek")
public class class138 {

    @ObfuscatedName("ek.b")
    public static int field2360 = 0;

    public class138() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ea.l(Lev;IIIZI)V")
    public static void method2688(class152 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2360 = 1;
        Statics.field1469 = arg0;
        Statics.field2362 = arg1;
        Statics.field2361 = arg2;
        Statics.field286 = arg3;
        Statics.field427 = arg4;
        Statics.field2359 = 10000;
    }

    @ObfuscatedName("dl.c(IB)V")
    public static void method2306(int arg0) {
        if (field2360 == 0) {
            Statics.field2358.method2765(arg0);
        } else {
            Statics.field286 = arg0;
        }
    }

    @ObfuscatedName("el.d(I)V")
    public static void method2686() {
        Statics.field2358.method2734();
        field2360 = 1;
        Statics.field1469 = null;
    }
}

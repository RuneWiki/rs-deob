package deob;

@ObfuscatedName("gc")
public class class183 {

    @ObfuscatedName("gc.p")
    public static int field2951 = 0;

    public class183() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fc.o(Lfq;IIIZI)V")
    public static void method2959(class167 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2951 = 1;
        Statics.field2952 = arg0;
        Statics.field2953 = arg1;
        Statics.field2654 = arg2;
        Statics.field673 = arg3;
        Statics.field2957 = arg4;
        Statics.field2955 = 10000;
    }

    @ObfuscatedName("al.e(II)V")
    public static void method978(int arg0) {
        if (field2951 == 0) {
            Statics.field128.method3392(arg0);
        } else {
            Statics.field673 = arg0;
        }
    }

    @ObfuscatedName("dl.u(I)V")
    public static void method2250() {
        Statics.field128.method3427();
        field2951 = 1;
        Statics.field2952 = null;
    }

    @ObfuscatedName("o.b(IB)V")
    public static void method1(int arg0) {
        field2951 = 1;
        Statics.field2952 = null;
        Statics.field2953 = -1;
        Statics.field2654 = -1;
        Statics.field673 = 0;
        Statics.field2957 = false;
        Statics.field2955 = arg0;
    }
}

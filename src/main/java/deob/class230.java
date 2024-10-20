package deob;

@ObfuscatedName("hf")
public class class230 {

    @ObfuscatedName("hf.h")
    public static int field2688 = 0;

    public class230() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("t.o(Ljf;Ljf;Ljf;Lhw;B)Z")
    public static boolean method4(class262 arg0, class262 arg1, class262 arg2, class231 arg3) {
        Statics.field2689 = arg0;
        Statics.field2692 = arg1;
        Statics.field2690 = arg2;
        Statics.field2691 = arg3;
        return true;
    }

    @ObfuscatedName("gh.k(Ljf;IIIZB)V")
    public static void method3130(class262 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2688 = 1;
        Statics.field2512 = arg0;
        Statics.field1932 = arg1;
        Statics.field285 = arg2;
        Statics.field1331 = arg3;
        Statics.field2693 = arg4;
        Statics.field12 = 10000;
    }

    @ObfuscatedName("le.t(II)V")
    public static void method5223(int arg0) {
        if (field2688 == 0) {
            Statics.field2691.method3800(arg0);
        } else {
            Statics.field1331 = arg0;
        }
    }

    @ObfuscatedName("eg.d(I)V")
    public static void method2916() {
        Statics.field2691.method3806();
        field2688 = 1;
        Statics.field2512 = null;
    }

    @ObfuscatedName("fj.h(ILjf;IIIZI)V")
    public static void method2958(int arg0, class262 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2688 = 1;
        Statics.field2512 = arg1;
        Statics.field1932 = arg2;
        Statics.field285 = arg3;
        Statics.field1331 = arg4;
        Statics.field2693 = arg5;
        Statics.field12 = arg0;
    }
}

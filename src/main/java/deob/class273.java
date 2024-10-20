package deob;

@ObfuscatedName("jd")
public class class273 {

    @ObfuscatedName("jd.j")
    public static int field3196 = 0;

    public class273() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ce.c(Llh;IIIZI)V")
    public static void method2292(class315 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3196 = 1;
        Statics.field3195 = arg0;
        Statics.field3198 = arg1;
        Statics.field1715 = arg2;
        Statics.field3193 = arg3;
        Statics.field62 = arg4;
        Statics.field3200 = 10000;
    }

    @ObfuscatedName("be.v(II)V")
    public static void method935(int arg0) {
        if (field3196 == 0) {
            Statics.field3199.method4768(arg0);
        } else {
            Statics.field3193 = arg0;
        }
    }

    @ObfuscatedName("aj.q(I)V")
    public static void method574() {
        Statics.field3199.method4774();
        field3196 = 1;
        Statics.field3195 = null;
    }
}

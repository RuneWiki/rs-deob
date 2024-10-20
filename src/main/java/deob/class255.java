package deob;

@ObfuscatedName("jv")
public class class255 {

    public class255() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ia.ah(IIIIB)I")
    public static final int method3973(int arg0, int arg1, int arg2, int arg3) {
        return arg0 * arg2 - arg1 * arg3 >> 16;
    }

    @ObfuscatedName("as.af(IIIII)I")
    public static final int method95(int arg0, int arg1, int arg2, int arg3) {
        return arg1 * arg2 - arg0 * arg3 >> 16;
    }

    @ObfuscatedName("dc.at(II)F")
    public static final float method2554(int arg0) {
        float var1 = 10075.0F - (float) arg0;
        return (var1 * 1.0075567F - 75.56675F) / var1;
    }

    @ObfuscatedName("ev.an(FB)F")
    public static final float method2823(float arg0) {
        float var1 = 75.0F;
        float var2 = 10000.0F;
        float var3 = 750000.0F / (10000.0F - arg0 * 9925.0F);
        return (var3 - 75.0F) / 9925.0F;
    }
}

package deob;

@ObfuscatedName("eh")
public class class133 {

    @ObfuscatedName("eh.d")
    public static boolean field1907 = false;

    @ObfuscatedName("eh.z")
    public static int field1904 = 0;

    @ObfuscatedName("eh.n")
    public static int field1906 = 0;

    @ObfuscatedName("eh.r")
    public static boolean field1911 = false;

    @ObfuscatedName("eh.i")
    public static int field1910 = 0;

    @ObfuscatedName("eh.u")
    public static int[] field1909 = new int[1000];

    public class133() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bw.d(IIB)V")
    public static final void method979(int arg0, int arg1) {
        field1904 = arg0;
        field1906 = arg1;
        field1907 = true;
        field1910 = 0;
        field1911 = false;
    }

    @ObfuscatedName("iw.n(Lel;IIII)Z")
    public static final boolean method4211(class132 arg0, int arg1, int arg2, int arg3) {
        boolean var4 = field1907;
        if (!var4) {
            return false;
        }
        Statics.method1562();
        int var5 = arg0.field1866 + arg1;
        int var6 = arg0.field1867 + arg2;
        int var7 = arg0.field1868 + arg3;
        int var8 = arg0.field1869;
        int var9 = arg0.field1870;
        int var10 = arg0.field1861;
        int var11 = Statics.field1437 - var5;
        int var12 = Statics.field1908 - var6;
        int var13 = Statics.field1592 - var7;
        if (Math.abs(var11) > Statics.field1782 + var8) {
            return false;
        } else if (Math.abs(var12) > Statics.field3831 + var9) {
            return false;
        } else if (Math.abs(var13) > Statics.field2223 + var10) {
            return false;
        } else if (Math.abs(Statics.field3436 * var13 - Statics.field520 * var12) > Statics.field3831 * var10 + Statics.field2223 * var9) {
            return false;
        } else if (Math.abs(Statics.field520 * var11 - Statics.field1905 * var13) > Statics.field2223 * var8 + Statics.field1782 * var10) {
            return false;
        } else {
            return Math.abs(Statics.field1905 * var12 - Statics.field3436 * var11) <= Statics.field3831 * var8 + Statics.field1782 * var9;
        }
    }
}

package deob;

@ObfuscatedName("ej")
public class class134 {

    @ObfuscatedName("ej.a")
    public static boolean field1884 = false;

    @ObfuscatedName("ej.w")
    public static int field1886 = 0;

    @ObfuscatedName("ej.e")
    public static int field1883 = 0;

    @ObfuscatedName("ej.k")
    public static boolean field1881 = false;

    @ObfuscatedName("ej.n")
    public static int field1888 = 0;

    @ObfuscatedName("ej.y")
    public static int[] field1889 = new int[1000];

    public class134() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bm.a(I)Z")
    public static final boolean method941() {
        return field1884;
    }

    @ObfuscatedName("hw.w(B)I")
    public static final int method3863() {
        return field1886;
    }

    @ObfuscatedName("as.e(Lef;IIIB)Z")
    public static final boolean method230(class133 arg0, int arg1, int arg2, int arg3) {
        if (!method941()) {
            return false;
        }
        if (!field1881) {
            int var4 = Statics.field1972;
            int var5 = Statics.field1985;
            int var6 = Statics.field1971;
            int var7 = Statics.field1975;
            byte var8 = 50;
            short var9 = 3500;
            int var10 = (field1886 - Statics.field1914) * var8 / class136.field1913;
            int var11 = (field1883 - Statics.field1912) * var8 / class136.field1913;
            int var12 = (field1886 - Statics.field1914) * var9 / class136.field1913;
            int var13 = (field1883 - Statics.field1912) * var9 / class136.field1913;
            int var14 = class136.method2465(var11, var8, var5, var4);
            int var15 = class136.method2416(var11, var8, var5, var4);
            int var17 = class136.method2465(var13, var9, var5, var4);
            int var18 = class136.method2416(var13, var9, var5, var4);
            int var20 = class136.method2413(var10, var15, var7, var6);
            int var21 = class136.method2414(var10, var15, var7, var6);
            int var23 = class136.method2413(var12, var18, var7, var6);
            int var24 = class136.method2414(var12, var18, var7, var6);
            Statics.field2745 = (var20 + var23) / 2;
            Statics.field1885 = (var14 + var17) / 2;
            Statics.field3463 = (var21 + var24) / 2;
            Statics.field755 = (var23 - var20) / 2;
            Statics.field1882 = (var17 - var14) / 2;
            Statics.field16 = (var24 - var21) / 2;
            Statics.field1887 = Math.abs(Statics.field755);
            Statics.field3457 = Math.abs(Statics.field1882);
            Statics.field3844 = Math.abs(Statics.field16);
        }
        int var26 = arg0.field1843 + arg1;
        int var27 = arg0.field1844 + arg2;
        int var28 = arg0.field1845 + arg3;
        int var29 = arg0.field1846;
        int var30 = arg0.field1825;
        int var31 = arg0.field1848;
        int var32 = Statics.field2745 - var26;
        int var33 = Statics.field1885 - var27;
        int var34 = Statics.field3463 - var28;
        if (Math.abs(var32) > Statics.field1887 + var29) {
            return false;
        } else if (Math.abs(var33) > Statics.field3457 + var30) {
            return false;
        } else if (Math.abs(var34) > Statics.field3844 + var31) {
            return false;
        } else if (Math.abs(Statics.field1882 * var34 - Statics.field16 * var33) > Statics.field3844 * var30 + Statics.field3457 * var31) {
            return false;
        } else if (Math.abs(Statics.field16 * var32 - Statics.field755 * var34) > Statics.field3844 * var29 + Statics.field1887 * var31) {
            return false;
        } else {
            return Math.abs(Statics.field755 * var33 - Statics.field1882 * var32) <= Statics.field3457 * var29 + Statics.field1887 * var30;
        }
    }
}

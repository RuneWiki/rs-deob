package deob;

@ObfuscatedName("ew")
public class class133 {

    @ObfuscatedName("ew.d")
    public static boolean field1983 = false;

    @ObfuscatedName("ew.k")
    public static int field1986 = 0;

    @ObfuscatedName("ew.e")
    public static int field1985 = 0;

    @ObfuscatedName("ew.p")
    public static boolean field1984 = false;

    @ObfuscatedName("ew.u")
    public static int field1990 = 0;

    @ObfuscatedName("ew.b")
    public static int[] field1991 = new int[1000];

    public class133() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bq.d(I)Z")
    public static final boolean method712() {
        return field1983;
    }

    @ObfuscatedName("b.k(I)I")
    public static final int method78() {
        return field1986;
    }

    @ObfuscatedName("ac.e(I)I")
    public static final int method640() {
        return field1985;
    }

    @ObfuscatedName("dw.p(Leb;IIII)Z")
    public static final boolean method2227(class132 arg0, int arg1, int arg2, int arg3) {
        if (!method712()) {
            return false;
        }
        if (!field1984) {
            int var4 = Statics.field2073;
            int var5 = Statics.field2074;
            int var6 = Statics.field2109;
            int var7 = Statics.field2076;
            byte var8 = 50;
            short var9 = 3500;
            int var10 = (field1986 - Statics.field2009) * var8 / class135.field2010;
            int var11 = (field1985 - Statics.field2018) * var8 / class135.field2010;
            int var12 = (field1986 - Statics.field2009) * var9 / class135.field2010;
            int var13 = (field1985 - Statics.field2018) * var9 / class135.field2010;
            int var14 = class135.method2471(var11, var8, var5, var4);
            int var15 = class135.method2472(var11, var8, var5, var4);
            int var17 = class135.method2471(var13, var9, var5, var4);
            int var18 = class135.method2472(var13, var9, var5, var4);
            int var20 = class135.method2477(var10, var15, var7, var6);
            int var21 = class135.method2470(var10, var15, var7, var6);
            int var23 = class135.method2477(var12, var18, var7, var6);
            int var24 = class135.method2470(var12, var18, var7, var6);
            Statics.field1987 = (var20 + var23) / 2;
            Statics.field1518 = (var14 + var17) / 2;
            Statics.field3686 = (var21 + var24) / 2;
            Statics.field1988 = (var23 - var20) / 2;
            Statics.field3191 = (var17 - var14) / 2;
            Statics.field1989 = (var24 - var21) / 2;
            Statics.field460 = Math.abs(Statics.field1988);
            Statics.field874 = Math.abs(Statics.field3191);
            Statics.field639 = Math.abs(Statics.field1989);
        }
        int var26 = arg0.field1945 + arg1;
        int var27 = arg0.field1964 + arg2;
        int var28 = arg0.field1947 + arg3;
        int var29 = arg0.field1948;
        int var30 = arg0.field1949;
        int var31 = arg0.field1925;
        int var32 = Statics.field1987 - var26;
        int var33 = Statics.field1518 - var27;
        int var34 = Statics.field3686 - var28;
        if (Math.abs(var32) > Statics.field460 + var29) {
            return false;
        } else if (Math.abs(var33) > Statics.field874 + var30) {
            return false;
        } else if (Math.abs(var34) > Statics.field639 + var31) {
            return false;
        } else if (Math.abs(Statics.field3191 * var34 - Statics.field1989 * var33) > Statics.field874 * var31 + Statics.field639 * var30) {
            return false;
        } else if (Math.abs(Statics.field1989 * var32 - Statics.field1988 * var34) > Statics.field639 * var29 + Statics.field460 * var31) {
            return false;
        } else {
            return Math.abs(Statics.field1988 * var33 - Statics.field3191 * var32) <= Statics.field874 * var29 + Statics.field460 * var30;
        }
    }
}

package deob;

@ObfuscatedName("ea")
public class class133 {

    @ObfuscatedName("ea.w")
    public static boolean field1989 = false;

    @ObfuscatedName("ea.s")
    public static int field1994 = 0;

    @ObfuscatedName("ea.q")
    public static int field1987 = 0;

    @ObfuscatedName("ea.o")
    public static boolean field1984 = false;

    @ObfuscatedName("ea.t")
    public static int field1982 = 0;

    @ObfuscatedName("ea.a")
    public static int[] field1990 = new int[1000];

    public class133() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fd.w(S)V")
    public static final void method3210() {
        field1989 = false;
        field1982 = 0;
    }

    @ObfuscatedName("cg.s(I)Z")
    public static final boolean method1563() {
        return field1989;
    }

    @ObfuscatedName("iw.q(Leh;IIIB)Z")
    public static final boolean method4070(class132 arg0, int arg1, int arg2, int arg3) {
        if (!method1563()) {
            return false;
        }
        if (!field1984) {
            int var4 = Statics.field2057;
            int var5 = Statics.field2060;
            int var6 = Statics.field2065;
            int var7 = Statics.field2067;
            byte var8 = 50;
            short var9 = 3500;
            int var10 = (field1994 - Statics.field2017) * var8 / class135.field2010;
            int var11 = (field1987 - Statics.field2002) * var8 / class135.field2010;
            int var12 = (field1994 - Statics.field2017) * var9 / class135.field2010;
            int var13 = (field1987 - Statics.field2002) * var9 / class135.field2010;
            int var14 = class135.method2463(var11, var8, var5, var4);
            int var15 = class135.method2464(var11, var8, var5, var4);
            int var17 = class135.method2463(var13, var9, var5, var4);
            int var18 = class135.method2464(var13, var9, var5, var4);
            int var20 = class135.method2461(var10, var15, var7, var6);
            int var21 = class135.method2499(var10, var15, var7, var6);
            int var23 = class135.method2461(var12, var18, var7, var6);
            int var24 = class135.method2499(var12, var18, var7, var6);
            Statics.field2340 = (var20 + var23) / 2;
            Statics.field1985 = (var14 + var17) / 2;
            Statics.field1988 = (var21 + var24) / 2;
            Statics.field1986 = (var23 - var20) / 2;
            Statics.field800 = (var17 - var14) / 2;
            Statics.field1981 = (var24 - var21) / 2;
            Statics.field784 = Math.abs(Statics.field1986);
            Statics.field3749 = Math.abs(Statics.field800);
            Statics.field1372 = Math.abs(Statics.field1981);
        }
        int var26 = arg0.field1968 + arg1;
        int var27 = arg0.field1944 + arg2;
        int var28 = arg0.field1945 + arg3;
        int var29 = arg0.field1965;
        int var30 = arg0.field1947;
        int var31 = arg0.field1948;
        int var32 = Statics.field2340 - var26;
        int var33 = Statics.field1985 - var27;
        int var34 = Statics.field1988 - var28;
        if (Math.abs(var32) > Statics.field784 + var29) {
            return false;
        } else if (Math.abs(var33) > Statics.field3749 + var30) {
            return false;
        } else if (Math.abs(var34) > Statics.field1372 + var31) {
            return false;
        } else if (Math.abs(Statics.field800 * var34 - Statics.field1981 * var33) > Statics.field3749 * var31 + Statics.field1372 * var30) {
            return false;
        } else if (Math.abs(Statics.field1981 * var32 - Statics.field1986 * var34) > Statics.field784 * var31 + Statics.field1372 * var29) {
            return false;
        } else {
            return Math.abs(Statics.field1986 * var33 - Statics.field800 * var32) <= Statics.field784 * var30 + Statics.field3749 * var29;
        }
    }
}

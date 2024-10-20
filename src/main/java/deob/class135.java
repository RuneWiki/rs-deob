package deob;

@ObfuscatedName("ea")
public class class135 {

    @ObfuscatedName("ea.i")
    public static boolean field1981 = false;

    @ObfuscatedName("ea.h")
    public static int field1980 = 0;

    @ObfuscatedName("ea.u")
    public static int field1989 = 0;

    @ObfuscatedName("ea.q")
    public static boolean field1985 = false;

    @ObfuscatedName("ea.x")
    public static int field1987 = 0;

    @ObfuscatedName("ea.o")
    public static int[] field1988 = new int[1000];

    public class135() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("by.i(IIB)V")
    public static final void method1076(int arg0, int arg1) {
        field1980 = arg0;
        field1989 = arg1;
        field1981 = true;
        field1987 = 0;
        field1985 = false;
    }

    @ObfuscatedName("ae.h(I)V")
    public static final void method471() {
        field1981 = false;
        field1987 = 0;
    }

    @ObfuscatedName("cp.u(IB)V")
    public static final void method1498(int arg0) {
        field1988[++field1987 - 1] = arg0;
    }

    @ObfuscatedName("dp.q(I)I")
    public static final int method2191() {
        return field1980;
    }

    @ObfuscatedName("bo.g(I)I")
    public static final int method1012() {
        return field1989;
    }

    @ObfuscatedName("ae.v(Lew;IIII)Z")
    public static final boolean method465(class134 arg0, int arg1, int arg2, int arg3) {
        boolean var4 = field1981;
        if (!var4) {
            return false;
        }
        if (!field1985) {
            int var5 = Statics.field2064;
            int var6 = Statics.field2065;
            int var7 = Statics.field2066;
            int var8 = Statics.field2086;
            byte var9 = 50;
            short var10 = 3500;
            int var11 = (field1980 - Statics.field2008) * var9 / class137.field1999;
            int var12 = (field1989 - Statics.field2009) * var9 / class137.field1999;
            int var13 = (field1980 - Statics.field2008) * var10 / class137.field1999;
            int var14 = (field1989 - Statics.field2009) * var10 / class137.field1999;
            int var15 = class137.method2451(var12, var9, var6, var5);
            int var16 = class137.method2428(var12, var9, var6, var5);
            int var18 = class137.method2451(var14, var10, var6, var5);
            int var19 = class137.method2428(var14, var10, var6, var5);
            int var21 = class137.method2426(var11, var16, var8, var7);
            int var22 = class137.method2427(var11, var16, var8, var7);
            int var24 = class137.method2426(var13, var19, var8, var7);
            int var25 = class137.method2427(var13, var19, var8, var7);
            Statics.field1983 = (var21 + var24) / 2;
            Statics.field1984 = (var15 + var18) / 2;
            Statics.field292 = (var22 + var25) / 2;
            Statics.field353 = (var24 - var21) / 2;
            Statics.field1982 = (var18 - var15) / 2;
            Statics.field18 = (var25 - var22) / 2;
            Statics.field471 = Math.abs(Statics.field353);
            Statics.field1986 = Math.abs(Statics.field1982);
            Statics.field447 = Math.abs(Statics.field18);
        }
        int var27 = arg0.field1920 + arg1;
        int var28 = arg0.field1942 + arg2;
        int var29 = arg0.field1943 + arg3;
        int var30 = arg0.field1964;
        int var31 = arg0.field1957;
        int var32 = arg0.field1946;
        int var33 = Statics.field1983 - var27;
        int var34 = Statics.field1984 - var28;
        int var35 = Statics.field292 - var29;
        if (Math.abs(var33) > Statics.field471 + var30) {
            return false;
        } else if (Math.abs(var34) > Statics.field1986 + var31) {
            return false;
        } else if (Math.abs(var35) > Statics.field447 + var32) {
            return false;
        } else if (Math.abs(Statics.field1982 * var35 - Statics.field18 * var34) > Statics.field447 * var31 + Statics.field1986 * var32) {
            return false;
        } else if (Math.abs(Statics.field18 * var33 - Statics.field353 * var35) > Statics.field471 * var32 + Statics.field447 * var30) {
            return false;
        } else {
            return Math.abs(Statics.field353 * var34 - Statics.field1982 * var33) <= Statics.field471 * var31 + Statics.field1986 * var30;
        }
    }
}

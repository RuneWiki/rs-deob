package deob;

@ObfuscatedName("ek")
public class class135 {

    @ObfuscatedName("ek.c")
    public static boolean field1958 = false;

    @ObfuscatedName("ek.o")
    public static int field1954 = 0;

    @ObfuscatedName("ek.i")
    public static int field1949 = 0;

    @ObfuscatedName("ek.u")
    public static boolean field1952 = false;

    @ObfuscatedName("ek.h")
    public static int field1955 = 0;

    @ObfuscatedName("ek.t")
    public static int[] field1956 = new int[1000];

    public class135() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("jp.c(I)V")
    public static final void method4306() {
        field1958 = false;
        field1955 = 0;
    }

    @ObfuscatedName("br.o(IB)V")
    public static final void method1350(int arg0) {
        field1956[++field1955 - 1] = arg0;
    }

    @ObfuscatedName("jp.i(I)Z")
    public static final boolean method4301() {
        return field1958;
    }

    @ObfuscatedName("ag.u(I)I")
    public static final int method232() {
        return field1954;
    }

    @ObfuscatedName("ap.g(I)I")
    public static final int method192() {
        return field1949;
    }

    @ObfuscatedName("dt.m(Leo;IIII)Z")
    public static final boolean method1867(class134 arg0, int arg1, int arg2, int arg3) {
        if (!method4301()) {
            return false;
        }
        if (!field1952) {
            int var4 = Statics.field2044;
            int var5 = Statics.field2045;
            int var6 = Statics.field2048;
            int var7 = Statics.field2047;
            byte var8 = 50;
            short var9 = 3500;
            int var10 = (field1954 - Statics.field1977) * var8 / class137.field1984;
            int var11 = (field1949 - Statics.field1986) * var8 / class137.field1984;
            int var12 = (field1954 - Statics.field1977) * var9 / class137.field1984;
            int var13 = (field1949 - Statics.field1986) * var9 / class137.field1984;
            int var14 = class137.method2415(var11, var8, var5, var4);
            int var15 = class137.method2388(var11, var8, var5, var4);
            int var17 = class137.method2415(var13, var9, var5, var4);
            int var18 = class137.method2388(var13, var9, var5, var4);
            int var20 = class137.method2350(var10, var15, var7, var6);
            int var21 = class137.method2414(var10, var15, var7, var6);
            int var23 = class137.method2350(var12, var18, var7, var6);
            int var24 = class137.method2414(var12, var18, var7, var6);
            Statics.field488 = (var20 + var23) / 2;
            Statics.field1953 = (var14 + var17) / 2;
            Statics.field3154 = (var21 + var24) / 2;
            Statics.field506 = (var23 - var20) / 2;
            Statics.field661 = (var17 - var14) / 2;
            Statics.field13 = (var24 - var21) / 2;
            Statics.field1951 = Math.abs(Statics.field506);
            Statics.field1731 = Math.abs(Statics.field661);
            Statics.field2081 = Math.abs(Statics.field13);
        }
        int var26 = arg0.field1897 + arg1;
        int var27 = arg0.field1912 + arg2;
        int var28 = arg0.field1913 + arg3;
        int var29 = arg0.field1914;
        int var30 = arg0.field1918;
        int var31 = arg0.field1902;
        int var32 = Statics.field488 - var26;
        int var33 = Statics.field1953 - var27;
        int var34 = Statics.field3154 - var28;
        if (Math.abs(var32) > Statics.field1951 + var29) {
            return false;
        } else if (Math.abs(var33) > Statics.field1731 + var30) {
            return false;
        } else if (Math.abs(var34) > Statics.field2081 + var31) {
            return false;
        } else if (Math.abs(Statics.field661 * var34 - Statics.field13 * var33) > Statics.field2081 * var30 + Statics.field1731 * var31) {
            return false;
        } else if (Math.abs(Statics.field13 * var32 - Statics.field506 * var34) > Statics.field2081 * var29 + Statics.field1951 * var31) {
            return false;
        } else {
            return Math.abs(Statics.field506 * var33 - Statics.field661 * var32) <= Statics.field1951 * var30 + Statics.field1731 * var29;
        }
    }

    @ObfuscatedName("cb.s(IIIIIIII)Z")
    public static final boolean method1531(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = field1949 + arg6;
        if (var7 < arg0 && var7 < arg1 && var7 < arg2) {
            return false;
        }
        int var8 = field1949 - arg6;
        if (var8 > arg0 && var8 > arg1 && var8 > arg2) {
            return false;
        }
        int var9 = field1954 + arg6;
        if (var9 < arg3 && var9 < arg4 && var9 < arg5) {
            return false;
        } else {
            int var10 = field1954 - arg6;
            return var10 <= arg3 || var10 <= arg4 || var10 <= arg5;
        }
    }
}

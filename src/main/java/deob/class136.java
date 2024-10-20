package deob;

@ObfuscatedName("ej")
public class class136 {

    @ObfuscatedName("ej.j")
    public static boolean field2002 = false;

    @ObfuscatedName("ej.h")
    public static int field1997 = 0;

    @ObfuscatedName("ej.f")
    public static int field1999 = 0;

    @ObfuscatedName("ej.p")
    public static boolean field2000 = false;

    @ObfuscatedName("ej.s")
    public static int field1998 = 0;

    @ObfuscatedName("ej.r")
    public static int[] field2003 = new int[1000];

    public class136() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ao.j(II)V")
    public static final void method215(int arg0) {
        field2003[++field1998 - 1] = arg0;
    }

    @ObfuscatedName("dw.h(I)Z")
    public static final boolean method2203() {
        return field2002;
    }

    @ObfuscatedName("be.f(Leo;IIII)Z")
    public static final boolean method1036(class135 arg0, int arg1, int arg2, int arg3) {
        if (!method2203()) {
            return false;
        }
        if (!field2000) {
            int var4 = Statics.field2086;
            int var5 = Statics.field2079;
            int var6 = Statics.field2114;
            int var7 = Statics.field2073;
            byte var8 = 50;
            short var9 = 3500;
            int var10 = (field1997 - Statics.field2028) * var8 / class138.field2027;
            int var11 = (field1999 - Statics.field2029) * var8 / class138.field2027;
            int var12 = (field1997 - Statics.field2028) * var9 / class138.field2027;
            int var13 = (field1999 - Statics.field2029) * var9 / class138.field2027;
            int var14 = class138.method2413(var11, var8, var5, var4);
            int var15 = class138.method2414(var11, var8, var5, var4);
            int var17 = class138.method2413(var13, var9, var5, var4);
            int var18 = class138.method2414(var13, var9, var5, var4);
            int var20 = class138.method2411(var10, var15, var7, var6);
            int var21 = class138.method2412(var10, var15, var7, var6);
            int var23 = class138.method2411(var12, var18, var7, var6);
            int var24 = class138.method2412(var12, var18, var7, var6);
            Statics.field2001 = (var20 + var23) / 2;
            Statics.field3275 = (var14 + var17) / 2;
            Statics.field15 = (var21 + var24) / 2;
            Statics.field245 = (var23 - var20) / 2;
            Statics.field760 = (var17 - var14) / 2;
            Statics.field1428 = (var24 - var21) / 2;
            Statics.field2324 = Math.abs(Statics.field245);
            Statics.field1448 = Math.abs(Statics.field760);
            Statics.field548 = Math.abs(Statics.field1428);
        }
        int var26 = arg0.field1970 + arg1;
        int var27 = arg0.field1960 + arg2;
        int var28 = arg0.field1988 + arg3;
        int var29 = arg0.field1943;
        int var30 = arg0.field1963;
        int var31 = arg0.field1984;
        int var32 = Statics.field2001 - var26;
        int var33 = Statics.field3275 - var27;
        int var34 = Statics.field15 - var28;
        if (Math.abs(var32) > Statics.field2324 + var29) {
            return false;
        } else if (Math.abs(var33) > Statics.field1448 + var30) {
            return false;
        } else if (Math.abs(var34) > Statics.field548 + var31) {
            return false;
        } else if (Math.abs(Statics.field760 * var34 - Statics.field1428 * var33) > Statics.field548 * var30 + Statics.field1448 * var31) {
            return false;
        } else if (Math.abs(Statics.field1428 * var32 - Statics.field245 * var34) > Statics.field548 * var29 + Statics.field2324 * var31) {
            return false;
        } else {
            return Math.abs(Statics.field245 * var33 - Statics.field760 * var32) <= Statics.field2324 * var30 + Statics.field1448 * var29;
        }
    }

    @ObfuscatedName("do.p(IIIIIIIB)Z")
    public static final boolean method2205(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = field1999 + arg6;
        if (var7 < arg0 && var7 < arg1 && var7 < arg2) {
            return false;
        }
        int var8 = field1999 - arg6;
        if (var8 > arg0 && var8 > arg1 && var8 > arg2) {
            return false;
        }
        int var9 = field1997 + arg6;
        if (var9 < arg3 && var9 < arg4 && var9 < arg5) {
            return false;
        } else {
            int var10 = field1997 - arg6;
            return var10 <= arg3 || var10 <= arg4 || var10 <= arg5;
        }
    }
}

package deob;

@ObfuscatedName("js")
public class class255 {

    @ObfuscatedName("js.ac")
    public static boolean field2814 = false;

    @ObfuscatedName("js.al")
    public static int field2804 = 0;

    @ObfuscatedName("js.ak")
    public static int field2805 = 0;

    @ObfuscatedName("js.ax")
    public static boolean field2806 = false;

    @ObfuscatedName("js.ay")
    public static int field2811 = 0;

    @ObfuscatedName("js.as")
    public static long[] field2812 = new long[1000];

    public class255() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("if.ac(J)Z")
    public static boolean method3893(long arg0) {
        int var2 = (int) (arg0 >>> 14 & 0x3L);
        return var2 == 2;
    }

    @ObfuscatedName("ou.al(J)Z")
    public static boolean method6259(long arg0) {
        boolean var2 = arg0 != 0L;
        if (var2) {
            boolean var3 = (int) (arg0 >>> 16 & 0x1L) == 1;
            var2 = !var3;
        }
        return var2;
    }

    @ObfuscatedName("db.ak(II)I")
    public static int method2500(int arg0) {
        long var1 = field2812[arg0];
        return (int) (var1 >>> 0 & 0x7FL);
    }

    @ObfuscatedName("ic.ax(II)I")
    public static int method3978(int arg0) {
        long var1 = field2812[arg0];
        return (int) (var1 >>> 7 & 0x7FL);
    }

    @ObfuscatedName("cm.ao(II)I")
    public static int method1169(int arg0) {
        return method2100(field2812[arg0]);
    }

    @ObfuscatedName("dm.ah(J)I")
    public static int method2100(long arg0) {
        return (int) (arg0 >>> 17 & 0xFFFFFFFFL);
    }

    @ObfuscatedName("oy.ar(IIIZII)J")
    public static long method6416(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        long var5 = (long) ((arg0 & 0x7F) << 0 | (arg1 & 0x7F) << 7 | (arg2 & 0x3) << 14) | ((long) arg4 & 0xFFFFFFFFL) << 17;
        if (arg3) {
            var5 |= 0x10000L;
        }
        return var5;
    }

    @ObfuscatedName("an.ab(III)V")
    public static final void method188(int arg0, int arg1) {
        field2804 = arg0;
        field2805 = arg1;
        field2814 = true;
        field2811 = 0;
        field2806 = false;
    }

    @ObfuscatedName("ir.am(B)V")
    public static final void method3551() {
        field2814 = false;
        field2811 = 0;
    }

    @ObfuscatedName("gq.av(J)V")
    public static final void method3094(long arg0) {
        field2812[++field2811 - 1] = arg0;
    }

    @ObfuscatedName("oc.ag(B)Z")
    public static final boolean method6402() {
        return field2814;
    }

    @ObfuscatedName("ck.aa(I)I")
    public static final int method1126() {
        return field2804;
    }

    @ObfuscatedName("ka.ap(I)I")
    public static final int method4805() {
        return field2805;
    }

    @ObfuscatedName("jq.ay(B)V")
    public static final void method4519() {
        if (field2806) {
            return;
        }
        int var0 = Statics.field2642;
        int var1 = Statics.field2634;
        int var2 = Statics.field2613;
        int var3 = Statics.field2594;
        byte var4 = 50;
        short var5 = 3500;
        int var6 = (field2804 - class241.method4202()) * var4 / class241.method4163();
        int var7 = (field2805 - class241.method4201()) * var4 / class241.method4163();
        int var8 = (field2804 - class241.method4202()) * var5 / class241.method4163();
        int var9 = (field2805 - class241.method4201()) * var5 / class241.method4163();
        int var10 = class253.method74(var7, var4, var1, var0);
        int var11 = class253.method6467(var7, var4, var1, var0);
        int var13 = class253.method74(var9, var5, var1, var0);
        int var14 = class253.method6467(var9, var5, var1, var0);
        int var16 = class253.method5162(var6, var11, var3, var2);
        int var17 = var2 * var6 + var3 * var11 >> 16;
        int var20 = class253.method5162(var8, var14, var3, var2);
        int var21 = var2 * var8 + var3 * var14 >> 16;
        Statics.field2809 = (var16 + var20) / 2;
        Statics.field2808 = (var10 + var13) / 2;
        Statics.field3075 = (var17 + var21) / 2;
        Statics.field1866 = (var20 - var16) / 2;
        Statics.field2803 = (var13 - var10) / 2;
        Statics.field2810 = (var21 - var17) / 2;
        Statics.field1915 = Math.abs(Statics.field1866);
        Statics.field891 = Math.abs(Statics.field2803);
        Statics.field1313 = Math.abs(Statics.field2810);
    }

    @ObfuscatedName("aa.as(Ljn;IIIII)Z")
    public static final boolean method102(class254 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!method6402()) {
            return false;
        }
        method4519();
        class246 var5 = (class246) arg0.field2762.get(arg1);
        int var6 = var5.field2653 + arg2;
        int var7 = var5.field2660 + arg3;
        int var8 = var5.field2652 + arg4;
        int var9 = var5.field2655;
        int var10 = var5.field2656;
        int var11 = var5.field2657;
        int var12 = Statics.field2809 - var6;
        int var13 = Statics.field2808 - var7;
        int var14 = Statics.field3075 - var8;
        if (Math.abs(var12) > Statics.field1915 + var9) {
            return false;
        } else if (Math.abs(var13) > Statics.field891 + var10) {
            return false;
        } else if (Math.abs(var14) > Statics.field1313 + var11) {
            return false;
        } else if (Math.abs(Statics.field2803 * var14 - Statics.field2810 * var13) > Statics.field891 * var11 + Statics.field1313 * var10) {
            return false;
        } else if (Math.abs(Statics.field2810 * var12 - Statics.field1866 * var14) > Statics.field1915 * var11 + Statics.field1313 * var9) {
            return false;
        } else {
            return Math.abs(Statics.field1866 * var13 - Statics.field2803 * var12) <= Statics.field891 * var9 + Statics.field1915 * var10;
        }
    }

    @ObfuscatedName("fs.aj(IIIIIIII)Z")
    public static final boolean method2912(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = field2805 + arg6;
        if (var7 < arg0 && var7 < arg1 && var7 < arg2) {
            return false;
        }
        int var8 = field2805 - arg6;
        if (var8 > arg0 && var8 > arg1 && var8 > arg2) {
            return false;
        }
        int var9 = field2804 + arg6;
        if (var9 < arg3 && var9 < arg4 && var9 < arg5) {
            return false;
        } else {
            int var10 = field2804 - arg6;
            return var10 <= arg3 || var10 <= arg4 || var10 <= arg5;
        }
    }
}

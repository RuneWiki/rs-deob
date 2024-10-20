package deob;

@ObfuscatedName("jx")
public class class257 {

    @ObfuscatedName("jx.az")
    public static boolean field2864 = false;

    @ObfuscatedName("jx.ah")
    public static int field2857 = 0;

    @ObfuscatedName("jx.af")
    public static int field2858 = 0;

    @ObfuscatedName("jx.at")
    public static boolean field2859 = false;

    @ObfuscatedName("jx.ax")
    public static int field2861 = 0;

    @ObfuscatedName("jx.ar")
    public static long[] field2867 = new long[1000];

    public class257() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("in.az(IB)I")
    public static int method3605(int arg0) {
        return method59(field2867[arg0]);
    }

    @ObfuscatedName("aw.ah(J)I")
    public static int method59(long arg0) {
        return (int) (arg0 >>> 0 & 0x7FL);
    }

    @ObfuscatedName("dq.at(J)I")
    public static int method2274(long arg0) {
        return (int) (arg0 >>> 14 & 0x3L);
    }

    @ObfuscatedName("fs.an(J)Z")
    public static boolean method3013(long arg0) {
        return (int) (arg0 >>> 16 & 0x1L) == 1;
    }

    @ObfuscatedName("iv.ao(IB)I")
    public static int method3948(int arg0) {
        return method3531(field2867[arg0]);
    }

    @ObfuscatedName("hg.ab(J)I")
    public static int method3531(long arg0) {
        return (int) (arg0 >>> 17 & 0xFFFFFFFFL);
    }

    @ObfuscatedName("fo.aw(IIIZII)J")
    public static long method3017(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        long var5 = (long) ((arg0 & 0x7F) << 0 | (arg1 & 0x7F) << 7 | (arg2 & 0x3) << 14) | ((long) arg4 & 0xFFFFFFFFL) << 17;
        if (arg3) {
            var5 |= 0x10000L;
        }
        return var5;
    }

    @ObfuscatedName("di.ad(B)Z")
    public static final boolean method2254() {
        return field2864;
    }

    @ObfuscatedName("hj.al(Ljn;IIIII)Z")
    public static final boolean method3483(class256 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!method2254()) {
            return false;
        }
        if (!field2859) {
            int var5 = Statics.field2703;
            int var6 = Statics.field2668;
            int var7 = Statics.field2669;
            int var8 = Statics.field2670;
            byte var9 = 50;
            short var10 = 3500;
            int var11 = (field2857 - class243.method4205()) * var9 / class243.method4258();
            int var12 = (field2858 - class243.method4206()) * var9 / class243.method4258();
            int var13 = (field2857 - class243.method4205()) * var10 / class243.method4258();
            int var14 = (field2858 - class243.method4206()) * var10 / class243.method4258();
            int var15 = var5 * var9 + var6 * var12 >> 16;
            int var17 = class255.method95(var12, var9, var6, var5);
            int var19 = var5 * var10 + var6 * var14 >> 16;
            int var21 = class255.method95(var14, var10, var6, var5);
            int var23 = class255.method3973(var11, var17, var8, var7);
            int var24 = var7 * var11 + var8 * var17 >> 16;
            int var27 = class255.method3973(var13, var21, var8, var7);
            int var28 = var7 * var13 + var8 * var21 >> 16;
            Statics.field2856 = (var23 + var27) / 2;
            Statics.field2863 = (var15 + var19) / 2;
            Statics.field4890 = (var24 + var28) / 2;
            Statics.field2862 = (var27 - var23) / 2;
            Statics.field2095 = (var19 - var15) / 2;
            Statics.field1376 = (var28 - var24) / 2;
            Statics.field2860 = Math.abs(Statics.field2862);
            Statics.field1520 = Math.abs(Statics.field2095);
            Statics.field4869 = Math.abs(Statics.field1376);
        }
        class248 var31 = (class248) arg0.field2783.get(arg1);
        int var32 = var31.field2710 + arg2;
        int var33 = var31.field2709 + arg3;
        int var34 = var31.field2708 + arg4;
        int var35 = var31.field2711;
        int var36 = var31.field2712;
        int var37 = var31.field2713;
        int var38 = Statics.field2856 - var32;
        int var39 = Statics.field2863 - var33;
        int var40 = Statics.field4890 - var34;
        if (Math.abs(var38) > Statics.field2860 + var35) {
            return false;
        } else if (Math.abs(var39) > Statics.field1520 + var36) {
            return false;
        } else if (Math.abs(var40) > Statics.field4869 + var37) {
            return false;
        } else if (Math.abs(Statics.field2095 * var40 - Statics.field1376 * var39) > Statics.field4869 * var36 + Statics.field1520 * var37) {
            return false;
        } else if (Math.abs(Statics.field1376 * var38 - Statics.field2862 * var40) > Statics.field4869 * var35 + Statics.field2860 * var37) {
            return false;
        } else {
            return Math.abs(Statics.field2862 * var39 - Statics.field2095 * var38) <= Statics.field2860 * var36 + Statics.field1520 * var35;
        }
    }

    @ObfuscatedName("oq.as(IIIIIIIB)Z")
    public static final boolean method6280(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = field2858 + arg6;
        if (var7 < arg0 && var7 < arg1 && var7 < arg2) {
            return false;
        }
        int var8 = field2858 - arg6;
        if (var8 > arg0 && var8 > arg1 && var8 > arg2) {
            return false;
        }
        int var9 = field2857 + arg6;
        if (var9 < arg3 && var9 < arg4 && var9 < arg5) {
            return false;
        } else {
            int var10 = field2857 - arg6;
            return var10 <= arg3 || var10 <= arg4 || var10 <= arg5;
        }
    }
}

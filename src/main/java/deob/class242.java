package deob;

@ObfuscatedName("jr")
public class class242 {

    @ObfuscatedName("jr.aw")
    public static boolean field2758 = false;

    @ObfuscatedName("jr.ay")
    public static int field2752 = 0;

    @ObfuscatedName("jr.ar")
    public static int field2753 = 0;

    @ObfuscatedName("jr.am")
    public static boolean field2751 = false;

    @ObfuscatedName("jr.ax")
    public static int field2754 = 0;

    @ObfuscatedName("jr.aa")
    public static long[] field2759 = new long[1000];

    public class242() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("rz.aw(I)I")
    public static int method7645() {
        return field2754;
    }

    @ObfuscatedName("ow.ay(II)I")
    public static int method6267(int arg0) {
        return method5834(field2759[arg0]);
    }

    @ObfuscatedName("mo.ar(J)I")
    public static int method5834(long arg0) {
        return (int) (arg0 >>> 0 & 0x7FL);
    }

    @ObfuscatedName("hd.am(J)I")
    public static int method3437(long arg0) {
        return (int) (arg0 >>> 7 & 0x7FL);
    }

    @ObfuscatedName("ag.as(J)I")
    public static int method42(long arg0) {
        return (int) (arg0 >>> 14 & 0x3L);
    }

    @ObfuscatedName("rc.aj(J)I")
    public static int method7614(long arg0) {
        return (int) (arg0 >>> 17 & 0xFFFFFFFFL);
    }

    @ObfuscatedName("qq.ag(IIIZII)J")
    public static long method7370(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        long var5 = (long) ((arg0 & 0x7F) << 0 | (arg1 & 0x7F) << 7 | (arg2 & 0x3) << 14) | ((long) arg4 & 0xFFFFFFFFL) << 17;
        if (arg3) {
            var5 |= 0x10000L;
        }
        return var5;
    }

    @ObfuscatedName("dw.az(B)Z")
    public static final boolean method2547() {
        return field2758;
    }

    @ObfuscatedName("at.av(I)V")
    public static final void method98() {
        if (field2751) {
            return;
        }
        int var0 = Statics.field2565;
        int var1 = Statics.field2566;
        int var2 = Statics.field2567;
        int var3 = Statics.field2601;
        byte var4 = 50;
        short var5 = 3500;
        int var6 = (field2752 - class228.method4040()) * var4 / class228.method4046();
        int var7 = (field2753 - class228.method4041()) * var4 / class228.method4046();
        int var8 = (field2752 - class228.method4040()) * var5 / class228.method4046();
        int var9 = (field2753 - class228.method4041()) * var5 / class228.method4046();
        int var10 = var0 * var4 + var1 * var7 >> 16;
        int var12 = var1 * var4 - var0 * var7 >> 16;
        int var15 = var0 * var5 + var1 * var9 >> 16;
        int var17 = var1 * var5 - var0 * var9 >> 16;
        int var20 = var3 * var6 - var2 * var12 >> 16;
        int var22 = var2 * var6 + var3 * var12 >> 16;
        int var25 = var3 * var8 - var2 * var17 >> 16;
        int var27 = var2 * var8 + var3 * var17 >> 16;
        Statics.field2755 = (var20 + var25) / 2;
        Statics.field2756 = (var10 + var15) / 2;
        Statics.field1694 = (var22 + var27) / 2;
        Statics.field5229 = (var25 - var20) / 2;
        Statics.field2757 = (var15 - var10) / 2;
        Statics.field1594 = (var27 - var22) / 2;
        Statics.field1110 = Math.abs(Statics.field5229);
        Statics.field1607 = Math.abs(Statics.field2757);
        Statics.field4438 = Math.abs(Statics.field1594);
    }

    @ObfuscatedName("md.ap(Ljo;IIIII)Z")
    public static final boolean method6017(class241 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!method2547()) {
            return false;
        }
        method98();
        class233 var5 = (class233) arg0.field2710.get(arg1);
        int var6 = var5.field2609 + arg2;
        int var7 = var5.field2607 + arg3;
        int var8 = var5.field2606 + arg4;
        int var9 = var5.field2608;
        int var10 = var5.field2610;
        int var11 = var5.field2611;
        int var12 = Statics.field2755 - var6;
        int var13 = Statics.field2756 - var7;
        int var14 = Statics.field1694 - var8;
        if (Math.abs(var12) > Statics.field1110 + var9) {
            return false;
        } else if (Math.abs(var13) > Statics.field1607 + var10) {
            return false;
        } else if (Math.abs(var14) > Statics.field4438 + var11) {
            return false;
        } else if (Math.abs(Statics.field2757 * var14 - Statics.field1594 * var13) > Statics.field4438 * var10 + Statics.field1607 * var11) {
            return false;
        } else if (Math.abs(Statics.field1594 * var12 - Statics.field5229 * var14) > Statics.field4438 * var9 + Statics.field1110 * var11) {
            return false;
        } else {
            return Math.abs(Statics.field5229 * var13 - Statics.field2757 * var12) <= Statics.field1607 * var9 + Statics.field1110 * var10;
        }
    }
}

package deob;

@ObfuscatedName("ix")
public class class233 {

    @ObfuscatedName("ix.af")
    public static boolean field2767 = false;

    @ObfuscatedName("ix.an")
    public static int field2771 = 0;

    @ObfuscatedName("ix.aw")
    public static int field2766 = 0;

    @ObfuscatedName("ix.ac")
    public static boolean field2764 = false;

    @ObfuscatedName("ix.ai")
    public static int field2765 = 0;

    @ObfuscatedName("ix.ag")
    public static long[] field2773 = new long[1000];

    public class233() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ap.af(B)I")
    public static int method382() {
        return field2765;
    }

    @ObfuscatedName("eg.an(J)Z")
    public static boolean method2823(long arg0) {
        return method4379(arg0) == 2;
    }

    @ObfuscatedName("gq.aw(J)Z")
    public static boolean method3307(long arg0) {
        boolean var2 = arg0 != 0L;
        if (var2) {
            boolean var3 = (int) (arg0 >>> 16 & 0x1L) == 1;
            var2 = !var3;
        }
        return var2;
    }

    @ObfuscatedName("bk.ac(II)J")
    public static long method458(int arg0) {
        return field2773[arg0];
    }

    @ObfuscatedName("ir.au(II)I")
    public static int method4347(int arg0) {
        long var1 = field2773[arg0];
        return (int) (var1 >>> 0 & 0x7FL);
    }

    @ObfuscatedName("ck.ab(II)I")
    public static int method1096(int arg0) {
        return method3510(field2773[arg0]);
    }

    @ObfuscatedName("hs.aq(J)I")
    public static int method3510(long arg0) {
        return (int) (arg0 >>> 7 & 0x7FL);
    }

    @ObfuscatedName("im.al(J)I")
    public static int method4379(long arg0) {
        return (int) (arg0 >>> 14 & 0x3L);
    }

    @ObfuscatedName("di.at(J)I")
    public static int method2144(long arg0) {
        return (int) (arg0 >>> 17 & 0xFFFFFFFFL);
    }

    @ObfuscatedName("ir.aa(IIIZII)J")
    public static long method4346(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        long var5 = (long) ((arg0 & 0x7F) << 0 | (arg1 & 0x7F) << 7 | (arg2 & 0x3) << 14) | ((long) arg4 & 0xFFFFFFFFL) << 17;
        if (arg3) {
            var5 |= 0x10000L;
        }
        return var5;
    }

    @ObfuscatedName("fv.ay(I)V")
    public static final void method3067() {
        field2767 = false;
        field2765 = 0;
    }

    @ObfuscatedName("cx.ao(J)V")
    public static final void method1920(long arg0) {
        field2773[++field2765 - 1] = arg0;
    }

    @ObfuscatedName("cw.ax(I)I")
    public static final int method2016() {
        return field2771;
    }

    @ObfuscatedName("ew.ai(I)V")
    public static final void method2897() {
        if (field2764) {
            return;
        }
        int var0 = Statics.field2592;
        int var1 = Statics.field2588;
        int var2 = Statics.field2572;
        int var3 = Statics.field2573;
        byte var4 = 50;
        short var5 = 3500;
        int var6 = (field2771 - class219.method3285()) * var4 / class219.method2756();
        int var7 = (field2766 - class219.method157()) * var4 / class219.method2756();
        int var8 = (field2771 - class219.method3285()) * var5 / class219.method2756();
        int var9 = (field2766 - class219.method157()) * var5 / class219.method2756();
        int var10 = var0 * var4 + var1 * var7 >> 16;
        int var12 = var1 * var4 - var0 * var7 >> 16;
        int var15 = var0 * var5 + var1 * var9 >> 16;
        int var17 = var1 * var5 - var0 * var9 >> 16;
        int var20 = class231.method6949(var6, var12, var3, var2);
        int var21 = class231.method7617(var6, var12, var3, var2);
        int var23 = class231.method6949(var8, var17, var3, var2);
        int var24 = class231.method7617(var8, var17, var3, var2);
        Statics.field2768 = (var20 + var23) / 2;
        Statics.field3367 = (var10 + var15) / 2;
        Statics.field2769 = (var21 + var24) / 2;
        Statics.field2770 = (var23 - var20) / 2;
        Statics.field1419 = (var15 - var10) / 2;
        Statics.field269 = (var24 - var21) / 2;
        Statics.field1980 = Math.abs(Statics.field2770);
        Statics.field2772 = Math.abs(Statics.field1419);
        Statics.field45 = Math.abs(Statics.field269);
    }

    @ObfuscatedName("qf.ag(Lit;IIIIB)Z")
    public static final boolean method7558(class232 arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var5 = field2767;
        if (!var5) {
            return false;
        }
        method2897();
        class224 var6 = (class224) arg0.field2723.get(arg1);
        int var7 = var6.field2617 + arg2;
        int var8 = var6.field2611 + arg3;
        int var9 = var6.field2615 + arg4;
        int var10 = var6.field2614;
        int var11 = var6.field2618;
        int var12 = var6.field2616;
        int var13 = Statics.field2768 - var7;
        int var14 = Statics.field3367 - var8;
        int var15 = Statics.field2769 - var9;
        if (Math.abs(var13) > Statics.field1980 + var10) {
            return false;
        } else if (Math.abs(var14) > Statics.field2772 + var11) {
            return false;
        } else if (Math.abs(var15) > Statics.field45 + var12) {
            return false;
        } else if (Math.abs(Statics.field1419 * var15 - Statics.field269 * var14) > Statics.field45 * var11 + Statics.field2772 * var12) {
            return false;
        } else if (Math.abs(Statics.field269 * var13 - Statics.field2770 * var15) > Statics.field45 * var10 + Statics.field1980 * var12) {
            return false;
        } else {
            return Math.abs(Statics.field2770 * var14 - Statics.field1419 * var13) <= Statics.field2772 * var10 + Statics.field1980 * var11;
        }
    }
}

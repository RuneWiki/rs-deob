package deob;

@ObfuscatedName("kr")
public class class286 {

    @ObfuscatedName("kr.aq")
    public static boolean field3067 = false;

    @ObfuscatedName("kr.aw")
    public static int field3070 = 0;

    @ObfuscatedName("kr.al")
    public static int field3063 = 0;

    @ObfuscatedName("kr.ai")
    public static boolean field3064 = false;

    @ObfuscatedName("kr.af")
    public static int field3066 = 0;

    @ObfuscatedName("kr.ax")
    public static long[] field3061 = new long[1000];

    public class286() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dg.aq(I)I")
    public static int method2130() {
        return field3066;
    }

    @ObfuscatedName("hr.aw(IB)J")
    public static long method3482(int arg0) {
        return field3061[arg0];
    }

    @ObfuscatedName("dt.al(II)I")
    public static int method2247(int arg0) {
        return method6573(field3061[arg0]);
    }

    @ObfuscatedName("ou.ai(J)I")
    public static int method6573(long arg0) {
        return (int) (arg0 >>> 0 & 0x7FL);
    }

    @ObfuscatedName("ob.ar(II)I")
    public static int method6336(int arg0) {
        return method782(field3061[arg0]);
    }

    @ObfuscatedName("be.as(J)I")
    public static int method782(long arg0) {
        return (int) (arg0 >>> 7 & 0x7FL);
    }

    @ObfuscatedName("jk.aa(II)I")
    public static int method4554(int arg0) {
        long var1 = field3061[arg0];
        return (int) (var1 >>> 14 & 0x3L);
    }

    @ObfuscatedName("gm.az(J)Z")
    public static boolean method3166(long arg0) {
        return (int) (arg0 >>> 16 & 0x1L) == 1;
    }

    @ObfuscatedName("cy.ao(J)I")
    public static int method1110(long arg0) {
        return (int) (arg0 >>> 17 & 0xFFFFFFFFL);
    }

    @ObfuscatedName("ad.au(IIIZII)J")
    public static long method248(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        long var5 = (long) ((arg0 & 0x7F) << 0 | (arg1 & 0x7F) << 7 | (arg2 & 0x3) << 14) | ((long) arg4 & 0xFFFFFFFFL) << 17;
        if (arg3) {
            var5 |= 0x10000L;
        }
        return var5;
    }

    @ObfuscatedName("gm.ak(IIS)V")
    public static final void method3167(int arg0, int arg1) {
        field3070 = arg0;
        field3063 = arg1;
        field3067 = true;
        field3066 = 0;
        field3064 = false;
    }

    @ObfuscatedName("fo.ah(J)V")
    public static final void method3067(long arg0) {
        field3061[++field3066 - 1] = arg0;
    }

    @ObfuscatedName("ef.aj(I)Z")
    public static final boolean method2804() {
        return field3067;
    }

    @ObfuscatedName("gk.af(I)I")
    public static final int method3216() {
        return field3070;
    }

    @ObfuscatedName("di.ax(B)I")
    public static final int method2324() {
        return field3063;
    }

    @ObfuscatedName("ck.an(IIIIIIIB)Z")
    public static final boolean method1860(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = field3063 + arg6;
        if (var7 < arg0 && var7 < arg1 && var7 < arg2) {
            return false;
        }
        int var8 = field3063 - arg6;
        if (var8 > arg0 && var8 > arg1 && var8 > arg2) {
            return false;
        }
        int var9 = field3070 + arg6;
        if (var9 < arg3 && var9 < arg4 && var9 < arg5) {
            return false;
        } else {
            int var10 = field3070 - arg6;
            return var10 <= arg3 || var10 <= arg4 || var10 <= arg5;
        }
    }
}

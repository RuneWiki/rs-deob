package deob;

@ObfuscatedName("ks")
public class class284 {

    @ObfuscatedName("ks.am")
    public static boolean field3054 = false;

    @ObfuscatedName("ks.ap")
    public static int field3058 = 0;

    @ObfuscatedName("ks.af")
    public static int field3061 = 0;

    @ObfuscatedName("ks.aj")
    public static boolean field3053 = false;

    @ObfuscatedName("ks.ax")
    public static int field3057 = 0;

    @ObfuscatedName("ks.aw")
    public static long[] field3050 = new long[1000];

    public class284() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("pe.am(I)I")
    public static int method6905() {
        return field3057;
    }

    @ObfuscatedName("di.af(II)I")
    public static int method2341(int arg0) {
        return method3016(field3050[arg0]);
    }

    @ObfuscatedName("fr.aj(J)I")
    public static int method3016(long arg0) {
        return (int) (arg0 >>> 7 & 0x7FL);
    }

    @ObfuscatedName("hl.aq(J)I")
    public static int method3801(long arg0) {
        return (int) (arg0 >>> 14 & 0x3L);
    }

    @ObfuscatedName("gz.ar(II)I")
    public static int method3189(int arg0) {
        return method3222(field3050[arg0]);
    }

    @ObfuscatedName("gx.ag(J)I")
    public static int method3222(long arg0) {
        return (int) (arg0 >>> 17 & 0xFFFFFFFFL);
    }

    @ObfuscatedName("dc.ao(IIIZIB)J")
    public static long method2168(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        long var5 = (long) ((arg0 & 0x7F) << 0 | (arg1 & 0x7F) << 7 | (arg2 & 0x3) << 14) | ((long) arg4 & 0xFFFFFFFFL) << 17;
        if (arg3) {
            var5 |= 0x10000L;
        }
        return var5;
    }

    @ObfuscatedName("cw.ae(III)V")
    public static final void method2129(int arg0, int arg1) {
        field3058 = arg0;
        field3061 = arg1;
        field3054 = true;
        field3057 = 0;
        field3053 = false;
    }

    @ObfuscatedName("el.aa(J)V")
    public static final void method2643(long arg0) {
        field3050[++field3057 - 1] = arg0;
    }

    @ObfuscatedName("cl.au(I)Z")
    public static final boolean method1125() {
        return field3054;
    }

    @ObfuscatedName("ab.an(I)I")
    public static final int method307() {
        return field3058;
    }

    @ObfuscatedName("mx.ad(B)I")
    public static final int method5469() {
        return field3061;
    }

    @ObfuscatedName("gg.ax(I)V")
    public static final void method3371() {
        if (field3053) {
            return;
        }
        int var0 = Statics.field2858;
        int var1 = Statics.field2859;
        int var2 = Statics.field2860;
        int var3 = Statics.field2895;
        byte var4 = 50;
        short var5 = 3500;
        int var6 = (field3058 - class270.method4767()) * var4 / class270.method4818();
        int var7 = (field3061 - class270.method4751()) * var4 / class270.method4818();
        int var8 = (field3058 - class270.method4767()) * var5 / class270.method4818();
        int var9 = (field3061 - class270.method4751()) * var5 / class270.method4818();
        int var10 = var0 * var4 + var1 * var7 >> 16;
        int var12 = class282.method5082(var7, var4, var1, var0);
        int var14 = var0 * var5 + var1 * var9 >> 16;
        int var16 = class282.method5082(var9, var5, var1, var0);
        int var18 = class282.method4017(var6, var12, var3, var2);
        int var19 = var2 * var6 + var3 * var12 >> 16;
        int var22 = class282.method4017(var8, var16, var3, var2);
        int var23 = var2 * var8 + var3 * var16 >> 16;
        Statics.field4502 = (var18 + var22) / 2;
        Statics.field3064 = (var10 + var14) / 2;
        Statics.field3055 = (var19 + var23) / 2;
        Statics.field3056 = (var22 - var18) / 2;
        Statics.field1682 = (var14 - var10) / 2;
        Statics.field1626 = (var23 - var19) / 2;
        Statics.field1663 = Math.abs(Statics.field3056);
        Statics.field1451 = Math.abs(Statics.field1682);
        Statics.field999 = Math.abs(Statics.field1626);
    }
}

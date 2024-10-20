package deob;

@ObfuscatedName("ht")
public class class198 {

    @ObfuscatedName("ht.ab")
    public static boolean field2232 = false;

    @ObfuscatedName("ht.ay")
    public static int field2231 = 0;

    @ObfuscatedName("ht.an")
    public static int field2237 = 0;

    @ObfuscatedName("ht.au")
    public static boolean field2233 = false;

    @ObfuscatedName("ht.as")
    public static int field2241 = 0;

    @ObfuscatedName("ht.aw")
    public static long[] field2239 = new long[1000];

    public class198() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("pe.ab(J)Z")
    public static boolean method6867(long arg0) {
        boolean var2 = arg0 != 0L;
        if (var2) {
            boolean var3 = (int) (arg0 >>> 16 & 0x1L) == 1;
            var2 = !var3;
        }
        return var2;
    }

    @ObfuscatedName("gg.ay(IB)J")
    public static long method3278(int arg0) {
        return field2239[arg0];
    }

    @ObfuscatedName("hu.au(IB)I")
    public static int method4124(int arg0) {
        return method5096(field2239[arg0]);
    }

    @ObfuscatedName("kc.ax(J)I")
    public static int method5096(long arg0) {
        return (int) (arg0 >>> 14 & 0x3L);
    }

    @ObfuscatedName("ln.ao(IB)I")
    public static int method5411(int arg0) {
        return method8270(field2239[arg0]);
    }

    @ObfuscatedName("tf.am(J)I")
    public static int method8270(long arg0) {
        return (int) (arg0 >>> 17 & 0xFFFFFFFFL);
    }

    @ObfuscatedName("uy.ae(J)I")
    public static int method8667(long arg0) {
        return (int) (arg0 >>> 49 & 0x7FFL);
    }

    @ObfuscatedName("ix.ad(IIIZIII)J")
    public static long method4242(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        long var6 = (long) ((arg0 & 0x7F) << 0 | (arg1 & 0x7F) << 7 | (arg2 & 0x3) << 14) | ((long) arg4 & 0xFFFFFFFFL) << 17 | ((long) arg5 & 0x7FFL) << 49;
        if (arg3) {
            var6 |= 0x10000L;
        }
        return var6;
    }

    @ObfuscatedName("fx.aq(III)V")
    public static final void method3113(int arg0, int arg1) {
        field2231 = arg0;
        field2237 = arg1;
        field2232 = true;
        field2241 = 0;
        field2233 = false;
    }

    @ObfuscatedName("nn.aj(J)V")
    public static final void method5911(long arg0) {
        field2239[++field2241 - 1] = arg0;
    }
}

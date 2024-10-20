package deob;

@ObfuscatedName("kb")
public class class281 {

    @ObfuscatedName("kb.at")
    public static boolean field3020 = false;

    @ObfuscatedName("kb.ah")
    public static int field3013 = 0;

    @ObfuscatedName("kb.ar")
    public static int field3010 = 0;

    @ObfuscatedName("kb.ao")
    public static boolean field3011 = false;

    @ObfuscatedName("kb.as")
    public static int field3015 = 0;

    @ObfuscatedName("kb.ay")
    public static long[] field3008 = new long[1000];

    public class281() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dw.at(B)I")
    public static int method2325() {
        return field3015;
    }

    @ObfuscatedName("hn.ah(J)Z")
    public static boolean method3798(long arg0) {
        boolean var2 = arg0 != 0L;
        if (var2) {
            boolean var3 = (int) (arg0 >>> 16 & 0x1L) == 1;
            var2 = !var3;
        }
        return var2;
    }

    @ObfuscatedName("oa.ar(II)I")
    public static int method6435(int arg0) {
        long var1 = field3008[arg0];
        return (int) (var1 >>> 7 & 0x7FL);
    }

    @ObfuscatedName("ej.ao(IB)I")
    public static int method2928(int arg0) {
        return method3154(field3008[arg0]);
    }

    @ObfuscatedName("gl.ab(J)I")
    public static int method3154(long arg0) {
        return (int) (arg0 >>> 14 & 0x3L);
    }

    @ObfuscatedName("ds.aa(IIIZII)J")
    public static long method2317(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        long var5 = (long) ((arg0 & 0x7F) << 0 | (arg1 & 0x7F) << 7 | (arg2 & 0x3) << 14) | ((long) arg4 & 0xFFFFFFFFL) << 17;
        if (arg3) {
            var5 |= 0x10000L;
        }
        return var5;
    }

    @ObfuscatedName("lx.ac(III)V")
    public static final void method5305(int arg0, int arg1) {
        field3013 = arg0;
        field3010 = arg1;
        field3020 = true;
        field3015 = 0;
        field3011 = false;
    }

    @ObfuscatedName("pd.al(B)V")
    public static final void method7114() {
        field3020 = false;
        field3015 = 0;
    }

    @ObfuscatedName("ir.az(IIIIIIII)Z")
    public static final boolean method4016(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = field3010 + arg6;
        if (var7 < arg0 && var7 < arg1 && var7 < arg2) {
            return false;
        }
        int var8 = field3010 - arg6;
        if (var8 > arg0 && var8 > arg1 && var8 > arg2) {
            return false;
        }
        int var9 = field3013 + arg6;
        if (var9 < arg3 && var9 < arg4 && var9 < arg5) {
            return false;
        } else {
            int var10 = field3013 - arg6;
            return var10 <= arg3 || var10 <= arg4 || var10 <= arg5;
        }
    }
}

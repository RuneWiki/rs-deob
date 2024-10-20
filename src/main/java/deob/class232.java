package deob;

@ObfuscatedName("iv")
public class class232 {

    @ObfuscatedName("iv.aj")
    public static boolean field2739 = false;

    @ObfuscatedName("iv.al")
    public static int field2728 = 0;

    @ObfuscatedName("iv.ac")
    public static int field2729 = 0;

    @ObfuscatedName("iv.ab")
    public static boolean field2740 = false;

    @ObfuscatedName("iv.ay")
    public static int field2735 = 0;

    @ObfuscatedName("iv.am")
    public static long[] field2736 = new long[1000];

    public class232() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hw.aj(I)I")
    public static int method3432() {
        return field2735;
    }

    @ObfuscatedName("co.al(J)Z")
    public static boolean method1054(long arg0) {
        return arg0 != 0L && !method2980(arg0);
    }

    @ObfuscatedName("gr.ac(II)J")
    public static long method3105(int arg0) {
        return field2736[arg0];
    }

    @ObfuscatedName("fs.ab(IB)I")
    public static int method2893(int arg0) {
        long var1 = field2736[arg0];
        return (int) (var1 >>> 0 & 0x7FL);
    }

    @ObfuscatedName("is.an(J)I")
    public static int method3797(long arg0) {
        return (int) (arg0 >>> 7 & 0x7FL);
    }

    @ObfuscatedName("iq.ao(J)I")
    public static int method4198(long arg0) {
        return (int) (arg0 >>> 14 & 0x3L);
    }

    @ObfuscatedName("fi.av(J)Z")
    public static boolean method2980(long arg0) {
        return (int) (arg0 >>> 16 & 0x1L) == 1;
    }

    @ObfuscatedName("ax.aq(II)I")
    public static int method94(int arg0) {
        return method4938(field2736[arg0]);
    }

    @ObfuscatedName("kq.ap(J)I")
    public static int method4938(long arg0) {
        return (int) (arg0 >>> 17 & 0xFFFFFFFFL);
    }

    @ObfuscatedName("di.ar(IIIZIB)J")
    public static long method2538(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        long var5 = (long) ((arg0 & 0x7F) << 0 | (arg1 & 0x7F) << 7 | (arg2 & 0x3) << 14) | ((long) arg4 & 0xFFFFFFFFL) << 17;
        if (arg3) {
            var5 |= 0x10000L;
        }
        return var5;
    }

    @ObfuscatedName("client.ak(IIB)V")
    public static final void method1192(int arg0, int arg1) {
        field2728 = arg0;
        field2729 = arg1;
        field2739 = true;
        field2735 = 0;
        field2740 = false;
    }

    @ObfuscatedName("gl.ax(J)V")
    public static final void method3185(long arg0) {
        field2736[++field2735 - 1] = arg0;
    }

    @ObfuscatedName("hf.as(B)I")
    public static final int method3534() {
        return field2728;
    }

    @ObfuscatedName("gm.ay(IIIIIIIB)Z")
    public static final boolean method3053(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = field2729 + arg6;
        if (var7 < arg0 && var7 < arg1 && var7 < arg2) {
            return false;
        }
        int var8 = field2729 - arg6;
        if (var8 > arg0 && var8 > arg1 && var8 > arg2) {
            return false;
        }
        int var9 = field2728 + arg6;
        if (var9 < arg3 && var9 < arg4 && var9 < arg5) {
            return false;
        } else {
            int var10 = field2728 - arg6;
            return var10 <= arg3 || var10 <= arg4 || var10 <= arg5;
        }
    }
}

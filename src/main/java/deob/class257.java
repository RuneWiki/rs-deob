package deob;

@ObfuscatedName("jy")
public class class257 {

    @ObfuscatedName("jy.ac")
    public static boolean field2877 = false;

    @ObfuscatedName("jy.ae")
    public static int field2875 = 0;

    @ObfuscatedName("jy.ag")
    public static int field2876 = 0;

    @ObfuscatedName("jy.am")
    public static boolean field2884 = false;

    @ObfuscatedName("jy.ap")
    public static int field2880 = 0;

    @ObfuscatedName("jy.ab")
    public static long[] field2881 = new long[1000];

    public class257() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ab.ac(B)I")
    public static int method167() {
        return field2880;
    }

    @ObfuscatedName("ce.ae(J)Z")
    public static boolean method2198(long arg0) {
        return method6665(arg0) == 2;
    }

    @ObfuscatedName("ib.ag(J)Z")
    public static boolean method4146(long arg0) {
        boolean var2 = arg0 != 0L;
        if (var2) {
            boolean var3 = (int) (arg0 >>> 16 & 0x1L) == 1;
            var2 = !var3;
        }
        return var2;
    }

    @ObfuscatedName("fs.am(J)I")
    public static int method3198(long arg0) {
        return (int) (arg0 >>> 0 & 0x7FL);
    }

    @ObfuscatedName("er.ax(J)I")
    public static int method3024(long arg0) {
        return (int) (arg0 >>> 7 & 0x7FL);
    }

    @ObfuscatedName("ka.aq(IB)I")
    public static int method5148(int arg0) {
        return method6665(field2881[arg0]);
    }

    @ObfuscatedName("nz.af(J)I")
    public static int method6665(long arg0) {
        return (int) (arg0 >>> 14 & 0x3L);
    }

    @ObfuscatedName("ii.at(J)I")
    public static int method4010(long arg0) {
        return (int) (arg0 >>> 17 & 0xFFFFFFFFL);
    }

    @ObfuscatedName("ho.au(II)I")
    public static int method3756(int arg0) {
        long var1 = field2881[arg0];
        return (int) (var1 >>> 49 & 0x7FFL);
    }

    @ObfuscatedName("kx.al(I)Z")
    public static final boolean method5133() {
        return field2877;
    }

    @ObfuscatedName("gq.ad(I)I")
    public static final int method3417() {
        return field2875;
    }

    @ObfuscatedName("du.ah(IIIIB)V")
    public static final void method2716(int arg0, int arg1, int arg2, int arg3) {
        if (field2884) {
            return;
        }
        byte var8 = 50;
        int var9 = class243.method4455();
        int var10 = (field2875 - class240.method4391()) * var8 / class240.method4339();
        int var11 = (field2876 - class240.method4341()) * var8 / class240.method4339();
        int var12 = (field2875 - class240.method4391()) * var9 / class240.method4339();
        int var13 = (field2876 - class240.method4341()) * var9 / class240.method4339();
        int var14 = class255.method468(var11, var8, arg1, arg0);
        int var15 = class255.method2994(var11, var8, arg1, arg0);
        int var17 = class255.method468(var13, var9, arg1, arg0);
        int var18 = class255.method2994(var13, var9, arg1, arg0);
        int var20 = class255.method4085(var10, var15, arg3, arg2);
        int var21 = Statics.method3406(var10, var15, arg3, arg2);
        int var23 = class255.method4085(var12, var18, arg3, arg2);
        int var24 = Statics.method3406(var12, var18, arg3, arg2);
        Statics.field4761 = (var20 + var23) / 2;
        Statics.field3277 = (var14 + var17) / 2;
        Statics.field2878 = (var21 + var24) / 2;
        Statics.field1680 = (var23 - var20) / 2;
        Statics.field5025 = (var17 - var14) / 2;
        Statics.field1073 = (var24 - var21) / 2;
        Statics.field4820 = Math.abs(Statics.field1680);
        Statics.field5052 = Math.abs(Statics.field5025);
        Statics.field2879 = Math.abs(Statics.field1073);
        field2884 = true;
    }

    @ObfuscatedName("hg.ap(IIIIIIII)Z")
    public static final boolean method3594(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = field2876 + arg6;
        if (var7 < arg0 && var7 < arg1 && var7 < arg2) {
            return false;
        }
        int var8 = field2876 - arg6;
        if (var8 > arg0 && var8 > arg1 && var8 > arg2) {
            return false;
        }
        int var9 = field2875 + arg6;
        if (var9 < arg3 && var9 < arg4 && var9 < arg5) {
            return false;
        } else {
            int var10 = field2875 - arg6;
            return var10 <= arg3 || var10 <= arg4 || var10 <= arg5;
        }
    }
}

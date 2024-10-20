package deob;

@ObfuscatedName("lj")
public class class295 {

    @ObfuscatedName("lj.aq")
    public static boolean field3163 = false;

    @ObfuscatedName("lj.ad")
    public static int field3160 = 0;

    @ObfuscatedName("lj.ag")
    public static int field3159 = 0;

    @ObfuscatedName("lj.ak")
    public static boolean field3161 = false;

    @ObfuscatedName("lj.az")
    public static int field3165 = 0;

    @ObfuscatedName("lj.ax")
    public static long[] field3166 = new long[1000];

    public class295() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ev.aq(J)I")
    public static int method2771(long arg0) {
        return (int) (arg0 >>> 0 & 0x7FL);
    }

    @ObfuscatedName("od.ad(II)I")
    public static int method6430(int arg0) {
        return method7416(field3166[arg0]);
    }

    @ObfuscatedName("ql.ag(J)I")
    public static int method7416(long arg0) {
        return (int) (arg0 >>> 7 & 0x7FL);
    }

    @ObfuscatedName("fs.ak(II)I")
    public static int method3084(int arg0) {
        return method4017(field3166[arg0]);
    }

    @ObfuscatedName("it.ap(J)I")
    public static int method4017(long arg0) {
        return (int) (arg0 >>> 17 & 0xFFFFFFFFL);
    }

    @ObfuscatedName("fv.an(II)I")
    public static int method2918(int arg0) {
        long var1 = field3166[arg0];
        return (int) (var1 >>> 49 & 0x7FFL);
    }

    @ObfuscatedName("ih.aj(IIIZIII)J")
    public static long method3918(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        long var6 = (long) ((arg0 & 0x7F) << 0 | (arg1 & 0x7F) << 7 | (arg2 & 0x3) << 14) | ((long) arg4 & 0xFFFFFFFFL) << 17 | ((long) arg5 & 0x7FFL) << 49;
        if (arg3) {
            var6 |= 0x10000L;
        }
        return var6;
    }

    @ObfuscatedName("gy.av(B)V")
    public static final void method3282() {
        field3163 = false;
        field3165 = 0;
    }

    @ObfuscatedName("jc.ai(Llv;IIIIIIIII)Z")
    public static final boolean method4425(class294 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        boolean var9 = field3163;
        if (!var9) {
            return false;
        }
        if (!field3161) {
            byte var14 = 50;
            int var15 = class281.method4881();
            int var16 = (field3160 - class278.method4763()) * var14 / class278.method4769();
            int var17 = (field3159 - class278.method4758()) * var14 / class278.method4769();
            int var18 = (field3160 - class278.method4763()) * var15 / class278.method4769();
            int var19 = (field3159 - class278.method4758()) * var15 / class278.method4769();
            int var20 = arg5 * var14 + arg6 * var17 >> 16;
            int var22 = class293.method4607(var17, var14, arg6, arg5);
            int var24 = arg5 * var15 + arg6 * var19 >> 16;
            int var26 = class293.method4607(var19, var15, arg6, arg5);
            int var28 = arg8 * var16 - arg7 * var22 >> 16;
            int var30 = arg7 * var16 + arg8 * var22 >> 16;
            int var33 = arg8 * var18 - arg7 * var26 >> 16;
            int var35 = arg7 * var18 + arg8 * var26 >> 16;
            Statics.field3162 = (var28 + var33) / 2;
            Statics.field1644 = (var20 + var24) / 2;
            Statics.field3164 = (var30 + var35) / 2;
            Statics.field3754 = (var33 - var28) / 2;
            Statics.field4827 = (var24 - var20) / 2;
            Statics.field1518 = (var35 - var30) / 2;
            Statics.field3673 = Math.abs(Statics.field3754);
            Statics.field2688 = Math.abs(Statics.field4827);
            Statics.field5036 = Math.abs(Statics.field1518);
        }
        class285 var38 = (class285) arg0.field3118.get(arg1);
        int var39 = var38.field3013 + arg2;
        int var40 = var38.field3009 + arg3;
        int var41 = var38.field3008 + arg4;
        int var42 = var38.field3011;
        int var43 = var38.field3012;
        int var44 = var38.field3010;
        int var45 = Statics.field3162 - var39;
        int var46 = Statics.field1644 - var40;
        int var47 = Statics.field3164 - var41;
        if (Math.abs(var45) > Statics.field3673 + var42) {
            return false;
        } else if (Math.abs(var46) > Statics.field2688 + var43) {
            return false;
        } else if (Math.abs(var47) > Statics.field5036 + var44) {
            return false;
        } else if (Math.abs(Statics.field4827 * var47 - Statics.field1518 * var46) > Statics.field5036 * var43 + Statics.field2688 * var44) {
            return false;
        } else if (Math.abs(Statics.field1518 * var45 - Statics.field3754 * var47) > Statics.field5036 * var42 + Statics.field3673 * var44) {
            return false;
        } else {
            return Math.abs(Statics.field3754 * var46 - Statics.field4827 * var45) <= Statics.field3673 * var43 + Statics.field2688 * var42;
        }
    }

    @ObfuscatedName("bd.ae(IIIIIIII)Z")
    public static final boolean method872(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = field3159 + arg6;
        if (var7 < arg0 && var7 < arg1 && var7 < arg2) {
            return false;
        }
        int var8 = field3159 - arg6;
        if (var8 > arg0 && var8 > arg1 && var8 > arg2) {
            return false;
        }
        int var9 = field3160 + arg6;
        if (var9 < arg3 && var9 < arg4 && var9 < arg5) {
            return false;
        } else {
            int var10 = field3160 - arg6;
            return var10 <= arg3 || var10 <= arg4 || var10 <= arg5;
        }
    }
}

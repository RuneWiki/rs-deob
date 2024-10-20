package deob;

@ObfuscatedName("mg")
public final class class350 extends class351 {

    public class350(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public class350(byte[] arg0) {
        super(arg0);
    }

    @ObfuscatedName("mg.s([BIIIII)V")
    public final void method5698(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = Statics.field4772 * arg2 + arg1;
        int var8 = Statics.field4772 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < field4774) {
            int var11 = field4774 - arg2;
            arg4 -= var11;
            arg2 = field4774;
            var10 += arg3 * var11;
            var7 += Statics.field4772 * var11;
        }
        if (arg2 + arg4 > field4773) {
            arg4 -= arg2 + arg4 - field4773;
        }
        if (arg1 < field4776) {
            int var12 = field4776 - arg1;
            arg3 -= var12;
            arg1 = field4776;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > field4777) {
            int var13 = arg1 + arg3 - field4777;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method5789(Statics.field4775, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @ObfuscatedName("mg.h([BIIIIII)V")
    public final void method5700(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = Statics.field4772 * arg2 + arg1;
        int var9 = Statics.field4772 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < field4774) {
            int var12 = field4774 - arg2;
            arg4 -= var12;
            arg2 = field4774;
            var11 += arg3 * var12;
            var8 += Statics.field4772 * var12;
        }
        if (arg2 + arg4 > field4773) {
            arg4 -= arg2 + arg4 - field4773;
        }
        if (arg1 < field4776) {
            int var13 = field4776 - arg1;
            arg3 -= var13;
            arg1 = field4776;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > field4777) {
            int var14 = arg1 + arg3 - field4777;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            method5732(Statics.field4775, arg0, arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }
}

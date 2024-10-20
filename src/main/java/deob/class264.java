package deob;

@ObfuscatedName("jj")
public final class class264 extends class265 {

    public class264(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public class264(byte[] arg0) {
        super(arg0);
    }

    @ObfuscatedName("jj.i([BIIIII)V")
    public final void method4438(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = Statics.field3748 * arg2 + arg1;
        int var8 = Statics.field3748 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < field3747) {
            int var11 = field3747 - arg2;
            arg4 -= var11;
            arg2 = field3747;
            var10 += arg3 * var11;
            var7 += Statics.field3748 * var11;
        }
        if (arg2 + arg4 > field3751) {
            arg4 -= arg2 + arg4 - field3751;
        }
        if (arg1 < field3750) {
            int var12 = field3750 - arg1;
            arg3 -= var12;
            arg1 = field3750;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > field3753) {
            int var13 = arg1 + arg3 - field3753;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method4468(Statics.field3752, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @ObfuscatedName("jj.h([BIIIIII)V")
    public final void method4439(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = Statics.field3748 * arg2 + arg1;
        int var9 = Statics.field3748 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < field3747) {
            int var12 = field3747 - arg2;
            arg4 -= var12;
            arg2 = field3747;
            var11 += arg3 * var12;
            var8 += Statics.field3748 * var12;
        }
        if (arg2 + arg4 > field3751) {
            arg4 -= arg2 + arg4 - field3751;
        }
        if (arg1 < field3750) {
            int var13 = field3750 - arg1;
            arg3 -= var13;
            arg1 = field3750;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > field3753) {
            int var14 = arg1 + arg3 - field3753;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            method4464(Statics.field3752, arg0, arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }
}

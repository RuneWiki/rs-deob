package deob;

@ObfuscatedName("jc")
public final class class264 extends class265 {

    public class264(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public class264(byte[] arg0) {
        super(arg0);
    }

    @ObfuscatedName("jc.a([BIIIII)V")
    public final void method4330(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = Statics.field3756 * arg2 + arg1;
        int var8 = Statics.field3756 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < field3758) {
            int var11 = field3758 - arg2;
            arg4 -= var11;
            arg2 = field3758;
            var10 += arg3 * var11;
            var7 += Statics.field3756 * var11;
        }
        if (arg2 + arg4 > field3760) {
            arg4 -= arg2 + arg4 - field3760;
        }
        if (arg1 < field3761) {
            int var12 = field3761 - arg1;
            arg3 -= var12;
            arg1 = field3761;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > field3762) {
            int var13 = arg1 + arg3 - field3762;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method4361(Statics.field3759, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @ObfuscatedName("jc.j([BIIIIII)V")
    public final void method4329(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = Statics.field3756 * arg2 + arg1;
        int var9 = Statics.field3756 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < field3758) {
            int var12 = field3758 - arg2;
            arg4 -= var12;
            arg2 = field3758;
            var11 += arg3 * var12;
            var8 += Statics.field3756 * var12;
        }
        if (arg2 + arg4 > field3760) {
            arg4 -= arg2 + arg4 - field3760;
        }
        if (arg1 < field3761) {
            int var13 = field3761 - arg1;
            arg3 -= var13;
            arg1 = field3761;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > field3762) {
            int var14 = arg1 + arg3 - field3762;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            method4367(Statics.field3759, arg0, arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }
}

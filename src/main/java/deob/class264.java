package deob;

@ObfuscatedName("jb")
public final class class264 extends class265 {

    public class264(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public class264(byte[] arg0) {
        super(arg0);
    }

    @ObfuscatedName("jb.p([BIIIII)V")
    public final void method4308(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = Statics.field3754 * arg2 + arg1;
        int var8 = Statics.field3754 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < field3756) {
            int var11 = field3756 - arg2;
            arg4 -= var11;
            arg2 = field3756;
            var10 += arg3 * var11;
            var7 += Statics.field3754 * var11;
        }
        if (arg2 + arg4 > field3757) {
            arg4 -= arg2 + arg4 - field3757;
        }
        if (arg1 < field3753) {
            int var12 = field3753 - arg1;
            arg3 -= var12;
            arg1 = field3753;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > field3759) {
            int var13 = arg1 + arg3 - field3759;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method4340(Statics.field3758, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @ObfuscatedName("jb.m([BIIIIII)V")
    public final void method4313(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = Statics.field3754 * arg2 + arg1;
        int var9 = Statics.field3754 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < field3756) {
            int var12 = field3756 - arg2;
            arg4 -= var12;
            arg2 = field3756;
            var11 += arg3 * var12;
            var8 += Statics.field3754 * var12;
        }
        if (arg2 + arg4 > field3757) {
            arg4 -= arg2 + arg4 - field3757;
        }
        if (arg1 < field3753) {
            int var13 = field3753 - arg1;
            arg3 -= var13;
            arg1 = field3753;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > field3759) {
            int var14 = arg1 + arg3 - field3759;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            method4367(Statics.field3758, arg0, arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }
}

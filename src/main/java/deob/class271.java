package deob;

@ObfuscatedName("jn")
public final class class271 extends class272 {

    public class271(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public class271(byte[] arg0) {
        super(arg0);
    }

    @ObfuscatedName("jn.b([BIIIII)V")
    public final void method4451(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = Statics.field3807 * arg2 + arg1;
        int var8 = Statics.field3807 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < field3809) {
            int var11 = field3809 - arg2;
            arg4 -= var11;
            arg2 = field3809;
            var10 += arg3 * var11;
            var7 += Statics.field3807 * var11;
        }
        if (arg2 + arg4 > field3810) {
            arg4 -= arg2 + arg4 - field3810;
        }
        if (arg1 < field3808) {
            int var12 = field3808 - arg1;
            arg3 -= var12;
            arg1 = field3808;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > field3806) {
            int var13 = arg1 + arg3 - field3806;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method4527(Statics.field3812, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @ObfuscatedName("jn.s([BIIIIII)V")
    public final void method4450(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = Statics.field3807 * arg2 + arg1;
        int var9 = Statics.field3807 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < field3809) {
            int var12 = field3809 - arg2;
            arg4 -= var12;
            arg2 = field3809;
            var11 += arg3 * var12;
            var8 += Statics.field3807 * var12;
        }
        if (arg2 + arg4 > field3810) {
            arg4 -= arg2 + arg4 - field3810;
        }
        if (arg1 < field3808) {
            int var13 = field3808 - arg1;
            arg3 -= var13;
            arg1 = field3808;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > field3806) {
            int var14 = arg1 + arg3 - field3806;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            method4481(Statics.field3812, arg0, arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }
}

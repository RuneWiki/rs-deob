package deob;

@ObfuscatedName("kw")
public final class class312 extends class313 {

    public class312(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public class312(byte[] arg0) {
        super(arg0);
    }

    @ObfuscatedName("kw.c([BIIIII)V")
    public final void method5101(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = Statics.field3955 * arg2 + arg1;
        int var8 = Statics.field3955 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < field3956) {
            int var11 = field3956 - arg2;
            arg4 -= var11;
            arg2 = field3956;
            var10 += arg3 * var11;
            var7 += Statics.field3955 * var11;
        }
        if (arg2 + arg4 > field3957) {
            arg4 -= arg2 + arg4 - field3957;
        }
        if (arg1 < field3953) {
            int var12 = field3953 - arg1;
            arg3 -= var12;
            arg1 = field3953;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > field3954) {
            int var13 = arg1 + arg3 - field3954;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method5112(Statics.field3959, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @ObfuscatedName("kw.i([BIIIIII)V")
    public final void method5096(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = Statics.field3955 * arg2 + arg1;
        int var9 = Statics.field3955 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < field3956) {
            int var12 = field3956 - arg2;
            arg4 -= var12;
            arg2 = field3956;
            var11 += arg3 * var12;
            var8 += Statics.field3955 * var12;
        }
        if (arg2 + arg4 > field3957) {
            arg4 -= arg2 + arg4 - field3957;
        }
        if (arg1 < field3953) {
            int var13 = field3953 - arg1;
            arg3 -= var13;
            arg1 = field3953;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > field3954) {
            int var14 = arg1 + arg3 - field3954;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            method5187(Statics.field3959, arg0, arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }
}

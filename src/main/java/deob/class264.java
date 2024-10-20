package deob;

@ObfuscatedName("ju")
public final class class264 extends class265 {

    public class264(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public class264(byte[] arg0) {
        super(arg0);
    }

    @ObfuscatedName("ju.d([BIIIII)V")
    public final void method4466(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = Statics.field3769 * arg2 + arg1;
        int var8 = Statics.field3769 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < field3768) {
            int var11 = field3768 - arg2;
            arg4 -= var11;
            arg2 = field3768;
            var10 += arg3 * var11;
            var7 += Statics.field3769 * var11;
        }
        if (arg2 + arg4 > field3772) {
            arg4 -= arg2 + arg4 - field3772;
        }
        if (arg1 < field3773) {
            int var12 = field3773 - arg1;
            arg3 -= var12;
            arg1 = field3773;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > field3771) {
            int var13 = arg1 + arg3 - field3771;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method4495(Statics.field3774, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @ObfuscatedName("ju.k([BIIIIII)V")
    public final void method4464(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = Statics.field3769 * arg2 + arg1;
        int var9 = Statics.field3769 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < field3768) {
            int var12 = field3768 - arg2;
            arg4 -= var12;
            arg2 = field3768;
            var11 += arg3 * var12;
            var8 += Statics.field3769 * var12;
        }
        if (arg2 + arg4 > field3772) {
            arg4 -= arg2 + arg4 - field3772;
        }
        if (arg1 < field3773) {
            int var13 = field3773 - arg1;
            arg3 -= var13;
            arg1 = field3773;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > field3771) {
            int var14 = arg1 + arg3 - field3771;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            method4477(Statics.field3774, arg0, arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }
}

package deob;

@ObfuscatedName("qb")
public final class class431 extends class435 {

    public class431(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public class431(byte[] arg0) {
        super(arg0);
    }

    @ObfuscatedName("qb.ak([BIIIII)V")
    public final void method7314(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = Statics.field5418 * arg2 + arg1;
        int var8 = Statics.field5418 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < field5417) {
            int var11 = field5417 - arg2;
            arg4 -= var11;
            arg2 = field5417;
            var10 += arg3 * var11;
            var7 += Statics.field5418 * var11;
        }
        if (arg2 + arg4 > field5414) {
            arg4 -= arg2 + arg4 - field5414;
        }
        if (arg1 < field5419) {
            int var12 = field5419 - arg1;
            arg3 -= var12;
            arg1 = field5419;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > field5420) {
            int var13 = arg1 + arg3 - field5420;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method7500(Statics.field5413, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @ObfuscatedName("qb.al([BIIIIII)V")
    public final void method7317(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = Statics.field5418 * arg2 + arg1;
        int var9 = Statics.field5418 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < field5417) {
            int var12 = field5417 - arg2;
            arg4 -= var12;
            arg2 = field5417;
            var11 += arg3 * var12;
            var8 += Statics.field5418 * var12;
        }
        if (arg2 + arg4 > field5414) {
            arg4 -= arg2 + arg4 - field5414;
        }
        if (arg1 < field5419) {
            int var13 = field5419 - arg1;
            arg3 -= var13;
            arg1 = field5419;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > field5420) {
            int var14 = arg1 + arg3 - field5420;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            method7530(Statics.field5413, arg0, arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }
}

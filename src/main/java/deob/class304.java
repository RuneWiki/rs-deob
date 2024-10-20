package deob;

@ObfuscatedName("kf")
public final class class304 extends class305 {

    public class304(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public class304(byte[] arg0) {
        super(arg0);
    }

    @ObfuscatedName("kf.n([BIIIII)V")
    public final void method5324(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = Statics.field3858 * arg2 + arg1;
        int var8 = Statics.field3858 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < field3857) {
            int var11 = field3857 - arg2;
            arg4 -= var11;
            arg2 = field3857;
            var10 += arg3 * var11;
            var7 += Statics.field3858 * var11;
        }
        if (arg2 + arg4 > field3856) {
            arg4 -= arg2 + arg4 - field3856;
        }
        if (arg1 < field3859) {
            int var12 = field3859 - arg1;
            arg3 -= var12;
            arg1 = field3859;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > field3860) {
            int var13 = arg1 + arg3 - field3860;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method5353(Statics.field3855, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @ObfuscatedName("kf.h([BIIIIII)V")
    public final void method5323(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = Statics.field3858 * arg2 + arg1;
        int var9 = Statics.field3858 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < field3857) {
            int var12 = field3857 - arg2;
            arg4 -= var12;
            arg2 = field3857;
            var11 += arg3 * var12;
            var8 += Statics.field3858 * var12;
        }
        if (arg2 + arg4 > field3856) {
            arg4 -= arg2 + arg4 - field3856;
        }
        if (arg1 < field3859) {
            int var13 = field3859 - arg1;
            arg3 -= var13;
            arg1 = field3859;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > field3860) {
            int var14 = arg1 + arg3 - field3860;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            method5355(Statics.field3855, arg0, arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }
}

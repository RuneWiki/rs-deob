package deob;

@ObfuscatedName("kt")
public final class class298 extends class299 {

    public class298(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public class298(byte[] arg0) {
        super(arg0);
    }

    @ObfuscatedName("kt.b([BIIIII)V")
    public final void method4992(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = Statics.field3881 * arg2 + arg1;
        int var8 = Statics.field3881 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < field3878) {
            int var11 = field3878 - arg2;
            arg4 -= var11;
            arg2 = field3878;
            var10 += arg3 * var11;
            var7 += Statics.field3881 * var11;
        }
        if (arg2 + arg4 > field3879) {
            arg4 -= arg2 + arg4 - field3879;
        }
        if (arg1 < field3875) {
            int var12 = field3875 - arg1;
            arg3 -= var12;
            arg1 = field3875;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > field3880) {
            int var13 = arg1 + arg3 - field3880;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method5016(Statics.field3876, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @ObfuscatedName("kt.q([BIIIIII)V")
    public final void method4988(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = Statics.field3881 * arg2 + arg1;
        int var9 = Statics.field3881 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < field3878) {
            int var12 = field3878 - arg2;
            arg4 -= var12;
            arg2 = field3878;
            var11 += arg3 * var12;
            var8 += Statics.field3881 * var12;
        }
        if (arg2 + arg4 > field3879) {
            arg4 -= arg2 + arg4 - field3879;
        }
        if (arg1 < field3875) {
            int var13 = field3875 - arg1;
            arg3 -= var13;
            arg1 = field3875;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > field3880) {
            int var14 = arg1 + arg3 - field3880;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            method5062(Statics.field3876, arg0, arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }
}

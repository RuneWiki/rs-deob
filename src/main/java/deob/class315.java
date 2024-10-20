package deob;

@ObfuscatedName("lt")
public final class class315 extends class316 {

    public class315(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public class315(byte[] arg0) {
        super(arg0);
    }

    @ObfuscatedName("lt.l([BIIIII)V")
    public final void method5189(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = Statics.field4358 * arg2 + arg1;
        int var8 = Statics.field4358 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < field4360) {
            int var11 = field4360 - arg2;
            arg4 -= var11;
            arg2 = field4360;
            var10 += arg3 * var11;
            var7 += Statics.field4358 * var11;
        }
        if (arg2 + arg4 > field4361) {
            arg4 -= arg2 + arg4 - field4361;
        }
        if (arg1 < field4362) {
            int var12 = field4362 - arg1;
            arg3 -= var12;
            arg1 = field4362;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > field4363) {
            int var13 = arg1 + arg3 - field4363;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method5281(Statics.field4357, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @ObfuscatedName("lt.q([BIIIIII)V")
    public final void method5195(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = Statics.field4358 * arg2 + arg1;
        int var9 = Statics.field4358 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < field4360) {
            int var12 = field4360 - arg2;
            arg4 -= var12;
            arg2 = field4360;
            var11 += arg3 * var12;
            var8 += Statics.field4358 * var12;
        }
        if (arg2 + arg4 > field4361) {
            arg4 -= arg2 + arg4 - field4361;
        }
        if (arg1 < field4362) {
            int var13 = field4362 - arg1;
            arg3 -= var13;
            arg1 = field4362;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > field4363) {
            int var14 = arg1 + arg3 - field4363;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            method5198(Statics.field4357, arg0, arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }
}

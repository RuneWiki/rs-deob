package deob;

@ObfuscatedName("lx")
public final class class327 extends class328 {

    public class327(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public class327(byte[] arg0) {
        super(arg0);
    }

    @ObfuscatedName("lx.c([BIIIII)V")
    public final void method5447(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = Statics.field4542 * arg2 + arg1;
        int var8 = Statics.field4542 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < field4541) {
            int var11 = field4541 - arg2;
            arg4 -= var11;
            arg2 = field4541;
            var10 += arg3 * var11;
            var7 += Statics.field4542 * var11;
        }
        if (arg2 + arg4 > field4547) {
            arg4 -= arg2 + arg4 - field4547;
        }
        if (arg1 < field4545) {
            int var12 = field4545 - arg1;
            arg3 -= var12;
            arg1 = field4545;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > field4544) {
            int var13 = arg1 + arg3 - field4544;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method5477(Statics.field4546, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @ObfuscatedName("lx.b([BIIIIII)V")
    public final void method5446(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = Statics.field4542 * arg2 + arg1;
        int var9 = Statics.field4542 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < field4541) {
            int var12 = field4541 - arg2;
            arg4 -= var12;
            arg2 = field4541;
            var11 += arg3 * var12;
            var8 += Statics.field4542 * var12;
        }
        if (arg2 + arg4 > field4547) {
            arg4 -= arg2 + arg4 - field4547;
        }
        if (arg1 < field4545) {
            int var13 = field4545 - arg1;
            arg3 -= var13;
            arg1 = field4545;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > field4544) {
            int var14 = arg1 + arg3 - field4544;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            method5479(Statics.field4546, arg0, arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }
}

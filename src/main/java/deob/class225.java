package deob;

@ObfuscatedName("hv")
public final class class225 extends class224 {

    public class225(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public class225(byte[] arg0) {
        super(arg0);
    }

    @ObfuscatedName("hv.x([BIIIII)V")
    public final void method3696(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = Statics.field1422 * arg2 + arg1;
        int var8 = Statics.field1422 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < field1417) {
            int var11 = field1417 - arg2;
            arg4 -= var11;
            arg2 = field1417;
            var10 += arg3 * var11;
            var7 += Statics.field1422 * var11;
        }
        if (arg2 + arg4 > field1420) {
            arg4 -= arg2 + arg4 - field1420;
        }
        if (arg1 < field1421) {
            int var12 = field1421 - arg1;
            arg3 -= var12;
            arg1 = field1421;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > field1416) {
            int var13 = arg1 + arg3 - field1416;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method3721(Statics.field1419, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @ObfuscatedName("hv.v([BIIIIII)V")
    public final void method3719(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = Statics.field1422 * arg2 + arg1;
        int var9 = Statics.field1422 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < field1417) {
            int var12 = field1417 - arg2;
            arg4 -= var12;
            arg2 = field1417;
            var11 += arg3 * var12;
            var8 += Statics.field1422 * var12;
        }
        if (arg2 + arg4 > field1420) {
            arg4 -= arg2 + arg4 - field1420;
        }
        if (arg1 < field1421) {
            int var13 = field1421 - arg1;
            arg3 -= var13;
            arg1 = field1421;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > field1416) {
            int var14 = arg1 + arg3 - field1416;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            method3723(Statics.field1419, arg0, arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }
}

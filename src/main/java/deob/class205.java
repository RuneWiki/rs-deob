package deob;

@ObfuscatedName("gt")
public final class class205 extends class204 {

    public class205(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public class205(byte[] arg0) {
        super(arg0);
    }

    @ObfuscatedName("gt.m([BIIIII)V")
    public final void method3457(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = Statics.field1306 * arg2 + arg1;
        int var8 = Statics.field1306 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < field1309) {
            int var11 = field1309 - arg2;
            arg4 -= var11;
            arg2 = field1309;
            var10 += arg3 * var11;
            var7 += Statics.field1306 * var11;
        }
        if (arg2 + arg4 > field1310) {
            arg4 -= arg2 + arg4 - field1310;
        }
        if (arg1 < field1311) {
            int var12 = field1311 - arg1;
            arg3 -= var12;
            arg1 = field1311;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > field1308) {
            int var13 = arg1 + arg3 - field1308;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method3460(Statics.field1312, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @ObfuscatedName("gt.q([BIIIIII)V")
    public final void method3458(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = Statics.field1306 * arg2 + arg1;
        int var9 = Statics.field1306 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < field1309) {
            int var12 = field1309 - arg2;
            arg4 -= var12;
            arg2 = field1309;
            var11 += arg3 * var12;
            var8 += Statics.field1306 * var12;
        }
        if (arg2 + arg4 > field1310) {
            arg4 -= arg2 + arg4 - field1310;
        }
        if (arg1 < field1311) {
            int var13 = field1311 - arg1;
            arg3 -= var13;
            arg1 = field1311;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > field1308) {
            int var14 = arg1 + arg3 - field1308;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            method3462(Statics.field1312, arg0, arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }
}

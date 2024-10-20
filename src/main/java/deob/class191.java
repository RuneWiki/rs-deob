package deob;

@ObfuscatedName("gy")
public final class class191 extends class190 {

    public class191(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public class191(byte[] arg0) {
        super(arg0);
    }

    @ObfuscatedName("gy.z([BIIIII)V")
    public final void method3321(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = Statics.field1311 * arg2 + arg1;
        int var8 = Statics.field1311 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < field1309) {
            int var11 = field1309 - arg2;
            arg4 -= var11;
            arg2 = field1309;
            var10 += arg3 * var11;
            var7 += Statics.field1311 * var11;
        }
        if (arg2 + arg4 > field1305) {
            arg4 -= arg2 + arg4 - field1305;
        }
        if (arg1 < field1310) {
            int var12 = field1310 - arg1;
            arg3 -= var12;
            arg1 = field1310;
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
            method3334(Statics.field1306, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @ObfuscatedName("gy.v([BIIIIII)V")
    public final void method3319(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = Statics.field1311 * arg2 + arg1;
        int var9 = Statics.field1311 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < field1309) {
            int var12 = field1309 - arg2;
            arg4 -= var12;
            arg2 = field1309;
            var11 += arg3 * var12;
            var8 += Statics.field1311 * var12;
        }
        if (arg2 + arg4 > field1305) {
            arg4 -= arg2 + arg4 - field1305;
        }
        if (arg1 < field1310) {
            int var13 = field1310 - arg1;
            arg3 -= var13;
            arg1 = field1310;
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
            method3326(Statics.field1306, arg0, arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }
}

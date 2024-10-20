package deob;

@ObfuscatedName("he")
public final class class215 extends class214 {

    public class215(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public class215(byte[] arg0) {
        super(arg0);
    }

    @ObfuscatedName("he.p([BIIIII)V")
    public final void method3628(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = Statics.field1341 * arg2 + arg1;
        int var8 = Statics.field1341 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < field1343) {
            int var11 = field1343 - arg2;
            arg4 -= var11;
            arg2 = field1343;
            var10 += arg3 * var11;
            var7 += Statics.field1341 * var11;
        }
        if (arg2 + arg4 > field1339) {
            arg4 -= arg2 + arg4 - field1339;
        }
        if (arg1 < field1344) {
            int var12 = field1344 - arg1;
            arg3 -= var12;
            arg1 = field1344;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > field1345) {
            int var13 = arg1 + arg3 - field1345;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method3631(Statics.field1340, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @ObfuscatedName("he.c([BIIIIII)V")
    public final void method3629(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = Statics.field1341 * arg2 + arg1;
        int var9 = Statics.field1341 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < field1343) {
            int var12 = field1343 - arg2;
            arg4 -= var12;
            arg2 = field1343;
            var11 += arg3 * var12;
            var8 += Statics.field1341 * var12;
        }
        if (arg2 + arg4 > field1339) {
            arg4 -= arg2 + arg4 - field1339;
        }
        if (arg1 < field1344) {
            int var13 = field1344 - arg1;
            arg3 -= var13;
            arg1 = field1344;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > field1345) {
            int var14 = arg1 + arg3 - field1345;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            method3633(Statics.field1340, arg0, arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }
}

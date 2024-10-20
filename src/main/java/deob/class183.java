package deob;

@ObfuscatedName("gb")
public final class class183 extends class185 {

    public class183(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public class183(byte[] arg0) {
        super(arg0);
    }

    @ObfuscatedName("gb.g([BIIIII)V")
    public final void method3365(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = Statics.field1486 * arg2 + arg1;
        int var8 = Statics.field1486 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < field1488) {
            int var11 = field1488 - arg2;
            arg4 -= var11;
            arg2 = field1488;
            var10 += arg3 * var11;
            var7 += Statics.field1486 * var11;
        }
        if (arg2 + arg4 > field1490) {
            arg4 -= arg2 + arg4 - field1490;
        }
        if (arg1 < field1485) {
            int var12 = field1485 - arg1;
            arg3 -= var12;
            arg1 = field1485;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > field1491) {
            int var13 = arg1 + arg3 - field1491;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method3404(Statics.field1489, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @ObfuscatedName("gb.m([BIIIIII)V")
    public final void method3364(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = Statics.field1486 * arg2 + arg1;
        int var9 = Statics.field1486 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < field1488) {
            int var12 = field1488 - arg2;
            arg4 -= var12;
            arg2 = field1488;
            var11 += arg3 * var12;
            var8 += Statics.field1486 * var12;
        }
        if (arg2 + arg4 > field1490) {
            arg4 -= arg2 + arg4 - field1490;
        }
        if (arg1 < field1485) {
            int var13 = field1485 - arg1;
            arg3 -= var13;
            arg1 = field1485;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > field1491) {
            int var14 = arg1 + arg3 - field1491;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            method3395(Statics.field1489, arg0, arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }
}

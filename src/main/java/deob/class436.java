package deob;

@ObfuscatedName("qi")
public final class class436 extends class440 {

    public class436(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg6);
    }

    public class436(byte[] arg0) {
        super(arg0);
    }

    @ObfuscatedName("qi.ap([BIIIII)V")
    public final void method7770(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = Statics.field5532 * arg2 + arg1;
        int var8 = Statics.field5532 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < field5536) {
            int var11 = field5536 - arg2;
            arg4 -= var11;
            arg2 = field5536;
            var10 += arg3 * var11;
            var7 += Statics.field5532 * var11;
        }
        if (arg2 + arg4 > field5537) {
            arg4 -= arg2 + arg4 - field5537;
        }
        if (arg1 < field5538) {
            int var12 = field5538 - arg1;
            arg3 -= var12;
            arg1 = field5538;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > field5539) {
            int var13 = arg1 + arg3 - field5539;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method7953(Statics.field5533, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @ObfuscatedName("qi.aw([BIIIIII)V")
    public final void method7769(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = Statics.field5532 * arg2 + arg1;
        int var9 = Statics.field5532 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < field5536) {
            int var12 = field5536 - arg2;
            arg4 -= var12;
            arg2 = field5536;
            var11 += arg3 * var12;
            var8 += Statics.field5532 * var12;
        }
        if (arg2 + arg4 > field5537) {
            arg4 -= arg2 + arg4 - field5537;
        }
        if (arg1 < field5538) {
            int var13 = field5538 - arg1;
            arg3 -= var13;
            arg1 = field5538;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > field5539) {
            int var14 = arg1 + arg3 - field5539;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            method7955(Statics.field5533, arg0, arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }
}

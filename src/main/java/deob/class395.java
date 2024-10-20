package deob;

@ObfuscatedName("pc")
public final class class395 extends class399 {

    public class395(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public class395(byte[] arg0) {
        super(arg0);
    }

    @ObfuscatedName("pc.aw([BIIIII)V")
    public final void method6644(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = Statics.field5138 * arg2 + arg1;
        int var8 = Statics.field5138 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < field5142) {
            int var11 = field5142 - arg2;
            arg4 -= var11;
            arg2 = field5142;
            var10 += arg3 * var11;
            var7 += Statics.field5138 * var11;
        }
        if (arg2 + arg4 > field5143) {
            arg4 -= arg2 + arg4 - field5143;
        }
        if (arg1 < field5144) {
            int var12 = field5144 - arg1;
            arg3 -= var12;
            arg1 = field5144;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > field5145) {
            int var13 = arg1 + arg3 - field5145;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method6888(Statics.field5137, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @ObfuscatedName("pc.ay([BIIIIII)V")
    public final void method6650(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = Statics.field5138 * arg2 + arg1;
        int var9 = Statics.field5138 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < field5142) {
            int var12 = field5142 - arg2;
            arg4 -= var12;
            arg2 = field5142;
            var11 += arg3 * var12;
            var8 += Statics.field5138 * var12;
        }
        if (arg2 + arg4 > field5143) {
            arg4 -= arg2 + arg4 - field5143;
        }
        if (arg1 < field5144) {
            int var13 = field5144 - arg1;
            arg3 -= var13;
            arg1 = field5144;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > field5145) {
            int var14 = arg1 + arg3 - field5145;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            method6831(Statics.field5137, arg0, arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }
}

package deob;

@ObfuscatedName("pf")
public final class class406 extends class410 {

    public class406(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public class406(byte[] arg0) {
        super(arg0);
    }

    @ObfuscatedName("pf.at([BIIIII)V")
    public final void method6830(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = Statics.field5208 * arg2 + arg1;
        int var8 = Statics.field5208 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < field5212) {
            int var11 = field5212 - arg2;
            arg4 -= var11;
            arg2 = field5212;
            var10 += arg3 * var11;
            var7 += Statics.field5208 * var11;
        }
        if (arg2 + arg4 > field5213) {
            arg4 -= arg2 + arg4 - field5213;
        }
        if (arg1 < field5214) {
            int var12 = field5214 - arg1;
            arg3 -= var12;
            arg1 = field5214;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > field5211) {
            int var13 = arg1 + arg3 - field5211;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method7064(Statics.field5215, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @ObfuscatedName("pf.ah([BIIIIII)V")
    public final void method6831(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = Statics.field5208 * arg2 + arg1;
        int var9 = Statics.field5208 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < field5212) {
            int var12 = field5212 - arg2;
            arg4 -= var12;
            arg2 = field5212;
            var11 += arg3 * var12;
            var8 += Statics.field5208 * var12;
        }
        if (arg2 + arg4 > field5213) {
            arg4 -= arg2 + arg4 - field5213;
        }
        if (arg1 < field5214) {
            int var13 = field5214 - arg1;
            arg3 -= var13;
            arg1 = field5214;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > field5211) {
            int var14 = arg1 + arg3 - field5211;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            method7006(Statics.field5215, arg0, arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }
}

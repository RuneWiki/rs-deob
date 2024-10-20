package deob;

@ObfuscatedName("gk")
public final class class23 extends class25 {

    public class23(byte[] arg0) {
        super(arg0);
    }

    public class23(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @ObfuscatedName("gk.h([BIIIIII)V")
    public final void method267(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = Statics.field2209 * arg2 + arg1;
        int var9 = Statics.field2209 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < field2211) {
            int var12 = field2211 - arg2;
            arg4 -= var12;
            arg2 = field2211;
            var11 += arg3 * var12;
            var8 += Statics.field2209 * var12;
        }
        if (arg2 + arg4 > field2212) {
            arg4 -= arg2 + arg4 - field2212;
        }
        if (arg1 < field2214) {
            int var13 = field2214 - arg1;
            arg3 -= var13;
            arg1 = field2214;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > field2208) {
            int var14 = arg1 + arg3 - field2208;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            method283(Statics.field2213, arg0, arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }

    @ObfuscatedName("gk.b([BIIIII)V")
    public final void method274(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = Statics.field2209 * arg2 + arg1;
        int var8 = Statics.field2209 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < field2211) {
            int var11 = field2211 - arg2;
            arg4 -= var11;
            arg2 = field2211;
            var10 += arg3 * var11;
            var7 += Statics.field2209 * var11;
        }
        if (arg2 + arg4 > field2212) {
            arg4 -= arg2 + arg4 - field2212;
        }
        if (arg1 < field2214) {
            int var12 = field2214 - arg1;
            arg3 -= var12;
            arg1 = field2214;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > field2208) {
            int var13 = arg1 + arg3 - field2208;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method324(Statics.field2213, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }
}

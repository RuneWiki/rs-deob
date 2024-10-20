package deob;

@ObfuscatedName("gl")
public final class class207 extends class206 {

    public class207(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public class207(byte[] arg0) {
        super(arg0);
    }

    @ObfuscatedName("gl.j([BIIIII)V")
    public final void method3513(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = Statics.field1316 * arg2 + arg1;
        int var8 = Statics.field1316 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < field1315) {
            int var11 = field1315 - arg2;
            arg4 -= var11;
            arg2 = field1315;
            var10 += arg3 * var11;
            var7 += Statics.field1316 * var11;
        }
        if (arg2 + arg4 > field1318) {
            arg4 -= arg2 + arg4 - field1318;
        }
        if (arg1 < field1320) {
            int var12 = field1320 - arg1;
            arg3 -= var12;
            arg1 = field1320;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > field1321) {
            int var13 = arg1 + arg3 - field1321;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method3520(Statics.field1319, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @ObfuscatedName("gl.d([BIIIIII)V")
    public final void method3499(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = Statics.field1316 * arg2 + arg1;
        int var9 = Statics.field1316 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < field1315) {
            int var12 = field1315 - arg2;
            arg4 -= var12;
            arg2 = field1315;
            var11 += arg3 * var12;
            var8 += Statics.field1316 * var12;
        }
        if (arg2 + arg4 > field1318) {
            arg4 -= arg2 + arg4 - field1318;
        }
        if (arg1 < field1320) {
            int var13 = field1320 - arg1;
            arg3 -= var13;
            arg1 = field1320;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > field1321) {
            int var14 = arg1 + arg3 - field1321;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            method3518(Statics.field1319, arg0, arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }
}

package deob;

@ObfuscatedName("ph")
public final class class392 extends class396 {

    public class392(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public class392(byte[] arg0) {
        super(arg0);
    }

    @ObfuscatedName("ph.at([BIIIII)V")
    public final void method6606(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = Statics.field5086 * arg2 + arg1;
        int var8 = Statics.field5086 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < field5087) {
            int var11 = field5087 - arg2;
            arg4 -= var11;
            arg2 = field5087;
            var10 += arg3 * var11;
            var7 += Statics.field5086 * var11;
        }
        if (arg2 + arg4 > field5092) {
            arg4 -= arg2 + arg4 - field5092;
        }
        if (arg1 < field5093) {
            int var12 = field5093 - arg1;
            arg3 -= var12;
            arg1 = field5093;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > field5094) {
            int var13 = arg1 + arg3 - field5094;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method6801(Statics.field5091, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @ObfuscatedName("ph.an([BIIIIII)V")
    public final void method6614(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = Statics.field5086 * arg2 + arg1;
        int var9 = Statics.field5086 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < field5087) {
            int var12 = field5087 - arg2;
            arg4 -= var12;
            arg2 = field5087;
            var11 += arg3 * var12;
            var8 += Statics.field5086 * var12;
        }
        if (arg2 + arg4 > field5092) {
            arg4 -= arg2 + arg4 - field5092;
        }
        if (arg1 < field5093) {
            int var13 = field5093 - arg1;
            arg3 -= var13;
            arg1 = field5093;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > field5094) {
            int var14 = arg1 + arg3 - field5094;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            method6843(Statics.field5091, arg0, arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }
}

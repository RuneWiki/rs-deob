package deob;

@ObfuscatedName("px")
public final class class414 extends class418 {

    public class414(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public class414(byte[] arg0) {
        super(arg0);
    }

    @ObfuscatedName("px.az([BIIIII)V")
    public final void method6860(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = Statics.field5303 * arg2 + arg1;
        int var8 = Statics.field5303 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < field5307) {
            int var11 = field5307 - arg2;
            arg4 -= var11;
            arg2 = field5307;
            var10 += arg3 * var11;
            var7 += Statics.field5303 * var11;
        }
        if (arg2 + arg4 > field5308) {
            arg4 -= arg2 + arg4 - field5308;
        }
        if (arg1 < field5309) {
            int var12 = field5309 - arg1;
            arg3 -= var12;
            arg1 = field5309;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > field5306) {
            int var13 = arg1 + arg3 - field5306;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method7091(Statics.field5302, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @ObfuscatedName("px.ah([BIIIIII)V")
    public final void method6861(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = Statics.field5303 * arg2 + arg1;
        int var9 = Statics.field5303 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < field5307) {
            int var12 = field5307 - arg2;
            arg4 -= var12;
            arg2 = field5307;
            var11 += arg3 * var12;
            var8 += Statics.field5303 * var12;
        }
        if (arg2 + arg4 > field5308) {
            arg4 -= arg2 + arg4 - field5308;
        }
        if (arg1 < field5309) {
            int var13 = field5309 - arg1;
            arg3 -= var13;
            arg1 = field5309;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > field5306) {
            int var14 = arg1 + arg3 - field5306;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            method7046(Statics.field5302, arg0, arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }
}

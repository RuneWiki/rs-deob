package deob;

@ObfuscatedName("md")
public final class class344 extends class345 {

    public class344(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public class344(byte[] arg0) {
        super(arg0);
    }

    @ObfuscatedName("md.v([BIIIII)V")
    public final void method5730(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = Statics.field4689 * arg2 + arg1;
        int var8 = Statics.field4689 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < field4688) {
            int var11 = field4688 - arg2;
            arg4 -= var11;
            arg2 = field4688;
            var10 += arg3 * var11;
            var7 += Statics.field4689 * var11;
        }
        if (arg2 + arg4 > field4685) {
            arg4 -= arg2 + arg4 - field4685;
        }
        if (arg1 < field4690) {
            int var12 = field4690 - arg1;
            arg3 -= var12;
            arg1 = field4690;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > field4691) {
            int var13 = arg1 + arg3 - field4691;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method5796(Statics.field4686, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @ObfuscatedName("md.c([BIIIIII)V")
    public final void method5732(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = Statics.field4689 * arg2 + arg1;
        int var9 = Statics.field4689 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < field4688) {
            int var12 = field4688 - arg2;
            arg4 -= var12;
            arg2 = field4688;
            var11 += arg3 * var12;
            var8 += Statics.field4689 * var12;
        }
        if (arg2 + arg4 > field4685) {
            arg4 -= arg2 + arg4 - field4685;
        }
        if (arg1 < field4690) {
            int var13 = field4690 - arg1;
            arg3 -= var13;
            arg1 = field4690;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > field4691) {
            int var14 = arg1 + arg3 - field4691;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            method5763(Statics.field4686, arg0, arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }
}

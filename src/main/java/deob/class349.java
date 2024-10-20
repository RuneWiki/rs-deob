package deob;

@ObfuscatedName("mt")
public final class class349 extends class350 {

    public class349(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public class349(byte[] arg0) {
        super(arg0);
    }

    @ObfuscatedName("mt.c([BIIIII)V")
    public final void method5792(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = Statics.field4773 * arg2 + arg1;
        int var8 = Statics.field4773 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < field4771) {
            int var11 = field4771 - arg2;
            arg4 -= var11;
            arg2 = field4771;
            var10 += arg3 * var11;
            var7 += Statics.field4773 * var11;
        }
        if (arg2 + arg4 > field4772) {
            arg4 -= arg2 + arg4 - field4772;
        }
        if (arg1 < field4768) {
            int var12 = field4768 - arg1;
            arg3 -= var12;
            arg1 = field4768;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > field4774) {
            int var13 = arg1 + arg3 - field4774;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method5821(Statics.field4770, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
        }
    }

    @ObfuscatedName("mt.v([BIIIIII)V")
    public final void method5791(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = Statics.field4773 * arg2 + arg1;
        int var9 = Statics.field4773 - arg3;
        int var10 = 0;
        int var11 = 0;
        if (arg2 < field4771) {
            int var12 = field4771 - arg2;
            arg4 -= var12;
            arg2 = field4771;
            var11 += arg3 * var12;
            var8 += Statics.field4773 * var12;
        }
        if (arg2 + arg4 > field4772) {
            arg4 -= arg2 + arg4 - field4772;
        }
        if (arg1 < field4768) {
            int var13 = field4768 - arg1;
            arg3 -= var13;
            arg1 = field4768;
            var11 += var13;
            var8 += var13;
            var10 += var13;
            var9 += var13;
        }
        if (arg1 + arg3 > field4774) {
            int var14 = arg1 + arg3 - field4774;
            arg3 -= var14;
            var10 += var14;
            var9 += var14;
        }
        if (arg3 > 0 && arg4 > 0) {
            method5823(Statics.field4770, arg0, arg5, var11, var8, arg3, arg4, var9, var10, arg6);
        }
    }
}

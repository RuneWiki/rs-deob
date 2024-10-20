package deob;

@ObfuscatedName("kn")
public abstract class class269 extends class537 {

    @ObfuscatedName("kn.at")
    public boolean field2784 = false;

    @ObfuscatedName("kn.ah")
    public boolean field2783 = false;

    @ObfuscatedName("kn.aa")
    public int[] field2787 = class267.field2772;

    @ObfuscatedName("kn.ac")
    public class285 field2789;

    public class269(class285 arg0) {
        this.field2789 = arg0;
    }

    @ObfuscatedName("kn.at([III[F)V")
    public void method4757(int[] arg0, int arg1, int arg2, float[] arg3) {
        method8753(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("kn.ah(IBBBB)I")
    public static int method4758(int arg0, byte arg1, byte arg2, byte arg3, byte arg4) {
        int var5 = arg0 >> 10 & 0x3F;
        int var6 = arg0 >> 7 & 0x7;
        int var7 = arg0 & 0x7F;
        int var8 = arg4 & 0xFF;
        if (arg1 != -1) {
            var5 += (arg1 - var5) * var8 >> 7;
        }
        if (arg2 != -1) {
            var6 += (arg2 - var6) * var8 >> 7;
        }
        if (arg3 != -1) {
            var7 += (arg3 - var7) * var8 >> 7;
        }
        return (var5 << 10 | var6 << 7 | var7) & 0xFFFF;
    }

    @ObfuscatedName("kn.ar(II)I")
    public static final int method4784(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("kn.ao(IIIIIIFFFIIIBBBB)V")
    public void method4759(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, byte arg12, byte arg13, byte arg14, byte arg15) {
        int var17 = method4758(arg9, arg12, arg13, arg14, arg15);
        int var18 = method4758(arg10, arg12, arg13, arg14, arg15);
        int var19 = method4758(arg11, arg12, arg13, arg14, arg15);
        this.method4761(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, var17, var18, var19);
    }

    @ObfuscatedName("kn.ab(IIIIIIFFFIBBBB)V")
    public void method4762(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, byte arg10, byte arg11, byte arg12, byte arg13) {
        int var15 = method4758(arg9, arg10, arg11, arg12, arg13);
        int var16 = this.field2787[var15];
        this.method4763(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, var16);
    }

    @ObfuscatedName("kn.au(IIIIIIFFFIII)V")
    public abstract void method4761(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11);

    @ObfuscatedName("kn.aa(IIIIIIFFFI)V")
    public abstract void method4763(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9);

    @ObfuscatedName("kn.ac(IIIIIIFFFIIIIIIIIIIIII)V")
    public abstract void method4764(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19, int arg20, int arg21);

    @ObfuscatedName("kn.al(IIIIIIFFFIIIIIIIIIIIII)V")
    public abstract void method4765(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19, int arg20, int arg21);
}

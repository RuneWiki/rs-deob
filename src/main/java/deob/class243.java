package deob;

@ObfuscatedName("jj")
public abstract class class243 extends class540 {

    @ObfuscatedName("jj.ac")
    public boolean field2567 = false;

    @ObfuscatedName("jj.al")
    public boolean field2568 = false;

    @ObfuscatedName("jj.ar")
    public int[] field2573 = class241.field2555;

    @ObfuscatedName("jj.ab")
    public class259 field2574;

    public class243(class259 arg0) {
        this.field2574 = arg0;
    }

    @ObfuscatedName("jj.ac([III[F)V")
    public void method4264(int[] arg0, int arg1, int arg2, float[] arg3) {
        method8734(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("jj.al(IBBBB)I")
    public static int method4260(int arg0, byte arg1, byte arg2, byte arg3, byte arg4) {
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

    @ObfuscatedName("jj.ak(II)I")
    public static final int method4261(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("jj.ax(IIIIIIFFFIIIBBBB)V")
    public void method4283(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, byte arg12, byte arg13, byte arg14, byte arg15) {
        int var17 = method4260(arg9, arg12, arg13, arg14, arg15);
        int var18 = method4260(arg10, arg12, arg13, arg14, arg15);
        int var19 = method4260(arg11, arg12, arg13, arg14, arg15);
        this.method4262(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, var17, var18, var19);
    }

    @ObfuscatedName("jj.ao(IIIIIIFFFIBBBB)V")
    public void method4263(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, byte arg10, byte arg11, byte arg12, byte arg13) {
        int var15 = method4260(arg9, arg10, arg11, arg12, arg13);
        int var16 = this.field2573[var15];
        this.method4265(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, var16);
    }

    @ObfuscatedName("jj.ah(IIIIIIFFFIII)V")
    public abstract void method4262(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11);

    @ObfuscatedName("jj.ar(IIIIIIFFFI)V")
    public abstract void method4265(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9);

    @ObfuscatedName("jj.ab(IIIIIIFFFIIIIIIIIIIIII)V")
    public abstract void method4266(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19, int arg20, int arg21);

    @ObfuscatedName("jj.am(IIIIIIFFFIIIIIIIIIIIII)V")
    public abstract void method4267(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19, int arg20, int arg21);
}

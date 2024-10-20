package deob;

@ObfuscatedName("kg")
public abstract class class274 extends class544 {

    @ObfuscatedName("kg.aq")
    public boolean field2829 = false;

    @ObfuscatedName("kg.aw")
    public boolean field2836 = false;

    @ObfuscatedName("kg.aa")
    public int[] field2835 = class272.field2817;

    @ObfuscatedName("kg.az")
    public class290 field2830;

    public class274(class290 arg0) {
        this.field2830 = arg0;
    }

    @ObfuscatedName("kg.aq([III[F)V")
    public void method4852(int[] arg0, int arg1, int arg2, float[] arg3) {
        method8934(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("kg.aw(IBBBB)I")
    public static int method4848(int arg0, byte arg1, byte arg2, byte arg3, byte arg4) {
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

    @ObfuscatedName("kg.al(II)I")
    public static final int method4846(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("kg.ai(IIIIIIFFFIIIBBBB)V")
    public void method4847(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, byte arg12, byte arg13, byte arg14, byte arg15) {
        int var17 = method4848(arg9, arg12, arg13, arg14, arg15);
        int var18 = method4848(arg10, arg12, arg13, arg14, arg15);
        int var19 = method4848(arg11, arg12, arg13, arg14, arg15);
        this.method4849(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, var17, var18, var19);
    }

    @ObfuscatedName("kg.ar(IIIIIIFFFIBBBB)V")
    public void method4851(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, byte arg10, byte arg11, byte arg12, byte arg13) {
        int var15 = method4848(arg9, arg10, arg11, arg12, arg13);
        int var16 = this.field2835[var15];
        this.method4850(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, var16);
    }

    @ObfuscatedName("kg.ao(IIIIIIFFFIIIIIIIIIIIII)V")
    public abstract void method4845(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19, int arg20, int arg21);

    @ObfuscatedName("kg.as(IIIIIIFFFIII)V")
    public abstract void method4849(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11);

    @ObfuscatedName("kg.aa(IIIIIIFFFI)V")
    public abstract void method4850(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9);

    @ObfuscatedName("kg.az(IIIIIIFFFIIIIIIIIIIIII)V")
    public abstract void method4871(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19, int arg20, int arg21);
}

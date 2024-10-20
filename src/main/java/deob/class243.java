package deob;

@ObfuscatedName("jl")
public abstract class class243 extends class568 {

    @ObfuscatedName("jl.ap")
    public boolean field2620 = false;

    @ObfuscatedName("jl.aw")
    public boolean field2616 = false;

    @ObfuscatedName("jl.am")
    public int[] field2623 = class240.field2595;

    @ObfuscatedName("jl.at")
    public class261 field2624;

    @ObfuscatedName("jl.au")
    public static int field2625 = 0;

    public class243(class261 arg0) {
        this.field2624 = arg0;
    }

    @ObfuscatedName("jl.ap([III[F)V")
    public void method4620(int[] arg0, int arg1, int arg2, float[] arg3) {
        method9664(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("jl.aw(IBBBB)I")
    public static int method4642(int arg0, byte arg1, byte arg2, byte arg3, byte arg4) {
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

    @ObfuscatedName("jl.ak(II)I")
    public static final int method4622(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("jl.aj(IIIIIIFFFIIIBBBB)V")
    public void method4623(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, byte arg12, byte arg13, byte arg14, byte arg15) {
        int var17 = method4642(arg9, arg12, arg13, arg14, arg15);
        int var18 = method4642(arg10, arg12, arg13, arg14, arg15);
        int var19 = method4642(arg11, arg12, arg13, arg14, arg15);
        this.method4654(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, var17, var18, var19);
    }

    @ObfuscatedName("jl.ai(IIIIIIFFFIBBBB)V")
    public void method4624(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, byte arg10, byte arg11, byte arg12, byte arg13) {
        int var15 = method4642(arg9, arg10, arg11, arg12, arg13);
        int var16 = this.field2623[var15];
        this.method4626(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, var16);
    }

    @ObfuscatedName("jl.at()I")
    public static final int method4649() {
        return field2625;
    }

    @ObfuscatedName("jl.au(I)V")
    public static void method4630(int arg0) {
        field2625 = arg0;
    }

    @ObfuscatedName("jl.an(I)V")
    public static void method4631(int arg0) {
        int var1 = arg0 * 210;
        method4630(var1);
    }

    @ObfuscatedName("jl.as(IIIIIIFFFI)V")
    public abstract void method4626(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9);

    @ObfuscatedName("jl.am(IIIIIIFFFIIIIIIIIIIIII)V")
    public abstract void method4627(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19, int arg20, int arg21);

    @ObfuscatedName("jl.ae(IIIIIIFFFIIIIIIIIIIIII)V")
    public abstract void method4645(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19, int arg20, int arg21);

    @ObfuscatedName("jl.ay(IIIIIIFFFIII)V")
    public abstract void method4654(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11);
}

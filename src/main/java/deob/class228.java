package deob;

@ObfuscatedName("ip")
public abstract class class228 extends class511 {

    @ObfuscatedName("ip.at")
    public boolean field2529 = false;

    @ObfuscatedName("ip.an")
    public boolean field2528 = false;

    @ObfuscatedName("ip.ab")
    public int[] field2534 = class226.field2516;

    @ObfuscatedName("ip.ak")
    public class244 field2535;

    public class228(class244 arg0) {
        this.field2535 = arg0;
    }

    @ObfuscatedName("ip.at([III[F)V")
    public void method4110(int[] arg0, int arg1, int arg2, float[] arg3) {
        method8458(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("ip.an(IBBBB)I")
    public static int method4111(int arg0, byte arg1, byte arg2, byte arg3, byte arg4) {
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

    @ObfuscatedName("ip.av(II)I")
    public static final int method4137(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("ip.as(IIIIIIFFFIIIBBBB)V")
    public void method4134(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, byte arg12, byte arg13, byte arg14, byte arg15) {
        int var17 = method4111(arg9, arg12, arg13, arg14, arg15);
        int var18 = method4111(arg10, arg12, arg13, arg14, arg15);
        int var19 = method4111(arg11, arg12, arg13, arg14, arg15);
        this.method4115(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, var17, var18, var19);
    }

    @ObfuscatedName("ip.ax(IIIIIIFFFIBBBB)V")
    public void method4112(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, byte arg10, byte arg11, byte arg12, byte arg13) {
        int var15 = method4111(arg9, arg10, arg11, arg12, arg13);
        int var16 = this.field2534[var15];
        this.method4116(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, var16);
    }

    @ObfuscatedName("ip.ap(IIIIIIFFFIII)V")
    public abstract void method4115(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11);

    @ObfuscatedName("ip.ab(IIIIIIFFFI)V")
    public abstract void method4116(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9);

    @ObfuscatedName("ip.ak(IIIIIIFFFIIIIIIIIIIIII)V")
    public abstract void method4117(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19, int arg20, int arg21);

    @ObfuscatedName("ip.ae(IIIIIIFFFIIIIIIIIIIIII)V")
    public abstract void method4118(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19, int arg20, int arg21);
}

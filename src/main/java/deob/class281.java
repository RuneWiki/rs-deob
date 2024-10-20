package deob;

@ObfuscatedName("ky")
public abstract class class281 extends class557 {

    @ObfuscatedName("ky.aq")
    public boolean field2901 = false;

    @ObfuscatedName("ky.ad")
    public boolean field2898 = false;

    @ObfuscatedName("ky.av")
    public int[] field2902 = class278.field2880;

    @ObfuscatedName("ky.ab")
    public class299 field2906;

    @ObfuscatedName("ky.ai")
    public static int field2907 = 0;

    public class281(class299 arg0) {
        this.field2906 = arg0;
    }

    @ObfuscatedName("ky.aq([III[F)V")
    public void method4872(int[] arg0, int arg1, int arg2, float[] arg3) {
        method9068(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("ky.ad(IBBBB)I")
    public static int method4873(int arg0, byte arg1, byte arg2, byte arg3, byte arg4) {
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

    @ObfuscatedName("ky.ag(II)I")
    public static final int method4915(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("ky.ak(IIIIIIFFFIIIBBBB)V")
    public void method4875(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, byte arg12, byte arg13, byte arg14, byte arg15) {
        int var17 = method4873(arg9, arg12, arg13, arg14, arg15);
        int var18 = method4873(arg10, arg12, arg13, arg14, arg15);
        int var19 = method4873(arg11, arg12, arg13, arg14, arg15);
        this.method4877(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, var17, var18, var19);
    }

    @ObfuscatedName("ky.ap(IIIIIIFFFIBBBB)V")
    public void method4909(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, byte arg10, byte arg11, byte arg12, byte arg13) {
        int var15 = method4873(arg9, arg10, arg11, arg12, arg13);
        int var16 = this.field2902[var15];
        this.method4878(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, var16);
    }

    @ObfuscatedName("ky.ai()I")
    public static final int method4881() {
        return field2907;
    }

    @ObfuscatedName("ky.ae(I)V")
    public static void method4882(int arg0) {
        field2907 = arg0;
    }

    @ObfuscatedName("ky.au(I)V")
    public static void method4883(int arg0) {
        int var1 = arg0 * 140;
        method4882(var1);
    }

    @ObfuscatedName("ky.an(IIIIIIFFFIII)V")
    public abstract void method4877(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11);

    @ObfuscatedName("ky.aj(IIIIIIFFFI)V")
    public abstract void method4878(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9);

    @ObfuscatedName("ky.ab(IIIIIIFFFIIIIIIIIIIIII)V")
    public abstract void method4880(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19, int arg20, int arg21);

    @ObfuscatedName("ky.av(IIIIIIFFFIIIIIIIIIIIII)V")
    public abstract void method4887(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19, int arg20, int arg21);
}

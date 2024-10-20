package deob;

@ObfuscatedName("hy")
public abstract class class184 extends class559 {

    @ObfuscatedName("hy.ab")
    public boolean field1972 = false;

    @ObfuscatedName("hy.ay")
    public boolean field1963 = false;

    @ObfuscatedName("hy.ae")
    public int[] field1970 = class181.field1940;

    @ObfuscatedName("hy.ad")
    public class202 field1971;

    @ObfuscatedName("hy.aq")
    public static int field1965 = 0;

    public class184(class202 arg0) {
        this.field1971 = arg0;
    }

    @ObfuscatedName("hy.ab([III[F)V")
    public void method3553(int[] arg0, int arg1, int arg2, float[] arg3) {
        method9114(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("hy.ay(IBBBB)I")
    public static int method3554(int arg0, byte arg1, byte arg2, byte arg3, byte arg4) {
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

    @ObfuscatedName("hy.an(II)I")
    public static final int method3555(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("hy.au(IIIIIIFFFIIIBBBB)V")
    public void method3564(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, byte arg12, byte arg13, byte arg14, byte arg15) {
        int var17 = method3554(arg9, arg12, arg13, arg14, arg15);
        int var18 = method3554(arg10, arg12, arg13, arg14, arg15);
        int var19 = method3554(arg11, arg12, arg13, arg14, arg15);
        this.method3558(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, var17, var18, var19);
    }

    @ObfuscatedName("hy.ax(IIIIIIFFFIBBBB)V")
    public void method3557(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, byte arg10, byte arg11, byte arg12, byte arg13) {
        int var15 = method3554(arg9, arg10, arg11, arg12, arg13);
        int var16 = this.field1970[var15];
        this.method3569(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, var16);
    }

    @ObfuscatedName("hy.ad()I")
    public static final int method3556() {
        return field1965;
    }

    @ObfuscatedName("hy.aq(I)V")
    public static void method3562(int arg0) {
        field1965 = arg0;
    }

    @ObfuscatedName("hy.al(I)V")
    public static void method3584(int arg0) {
        int var1 = arg0 * 210;
        method3562(var1);
    }

    @ObfuscatedName("hy.ao(IIIIIIFFFIII)V")
    public abstract void method3558(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11);

    @ObfuscatedName("hy.am(IIIIIIFFFI)V")
    public abstract void method3569(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9);

    @ObfuscatedName("hy.ac(IIIIIIFFFIIIIIIIIIIIII)V")
    public abstract void method3573(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19, int arg20, int arg21);

    @ObfuscatedName("hy.ae(IIIIIIFFFIIIIIIIIIIIII)V")
    public abstract void method3582(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19, int arg20, int arg21);
}

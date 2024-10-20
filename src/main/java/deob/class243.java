package deob;

@ObfuscatedName("ji")
public abstract class class243 extends class561 {

    @ObfuscatedName("ji.ac")
    public boolean field2621 = false;

    @ObfuscatedName("ji.ae")
    public boolean field2612 = false;

    @ObfuscatedName("ji.au")
    public int[] field2619 = class240.field2587;

    @ObfuscatedName("ji.ar")
    public class261 field2617;

    @ObfuscatedName("ji.al")
    public static int field2620 = 0;

    public class243(class261 arg0) {
        this.field2617 = arg0;
    }

    @ObfuscatedName("ji.ac([III[F)V")
    public void method4487(int[] arg0, int arg1, int arg2, float[] arg3) {
        method9344(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("ji.ae(IBBBB)I")
    public static int method4447(int arg0, byte arg1, byte arg2, byte arg3, byte arg4) {
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

    @ObfuscatedName("ji.ag(II)I")
    public static final int method4448(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("ji.am(IIIIIIFFFIIIBBBB)V")
    public void method4449(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, byte arg12, byte arg13, byte arg14, byte arg15) {
        int var17 = method4447(arg9, arg12, arg13, arg14, arg15);
        int var18 = method4447(arg10, arg12, arg13, arg14, arg15);
        int var19 = method4447(arg11, arg12, arg13, arg14, arg15);
        this.method4458(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, var17, var18, var19);
    }

    @ObfuscatedName("ji.ax(IIIIIIFFFIBBBB)V")
    public void method4472(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, byte arg10, byte arg11, byte arg12, byte arg13) {
        int var15 = method4447(arg9, arg10, arg11, arg12, arg13);
        int var16 = this.field2619[var15];
        this.method4452(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, var16);
    }

    @ObfuscatedName("ji.ar()I")
    public static final int method4455() {
        return field2620;
    }

    @ObfuscatedName("ji.al(I)V")
    public static void method4478(int arg0) {
        field2620 = arg0;
    }

    @ObfuscatedName("ji.ad(I)V")
    public static void method4457(int arg0) {
        int var1 = arg0 * 210;
        method4478(var1);
    }

    @ObfuscatedName("ji.af(IIIIIIFFFI)V")
    public abstract void method4452(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9);

    @ObfuscatedName("ji.at(IIIIIIFFFIIIIIIIIIIIII)V")
    public abstract void method4453(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19, int arg20, int arg21);

    @ObfuscatedName("ji.au(IIIIIIFFFIIIIIIIIIIIII)V")
    public abstract void method4454(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19, int arg20, int arg21);

    @ObfuscatedName("ji.aq(IIIIIIFFFIII)V")
    public abstract void method4458(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11);
}

package deob;

@ObfuscatedName("ja")
public abstract class class251 extends class556 {

    @ObfuscatedName("ja.ak")
    public boolean field2687 = false;

    @ObfuscatedName("ja.al")
    public boolean field2688 = false;

    @ObfuscatedName("ja.ab")
    public int[] field2691 = class248.field2666;

    @ObfuscatedName("ja.ac")
    public class269 field2694;

    @ObfuscatedName("ja.ao")
    public static int field2696 = 0;

    public class251(class269 arg0) {
        this.field2694 = arg0;
    }

    @ObfuscatedName("ja.ak([III[F)V")
    public void method4449(int[] arg0, int arg1, int arg2, float[] arg3) {
        method9102(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("ja.al(IBBBB)I")
    public static int method4450(int arg0, byte arg1, byte arg2, byte arg3, byte arg4) {
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

    @ObfuscatedName("ja.aj(II)I")
    public static final int method4451(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @ObfuscatedName("ja.az(IIIIIIFFFIIIBBBB)V")
    public void method4452(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, byte arg12, byte arg13, byte arg14, byte arg15) {
        int var17 = method4450(arg9, arg12, arg13, arg14, arg15);
        int var18 = method4450(arg10, arg12, arg13, arg14, arg15);
        int var19 = method4450(arg11, arg12, arg13, arg14, arg15);
        this.method4461(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, var17, var18, var19);
    }

    @ObfuscatedName("ja.af(IIIIIIFFFIBBBB)V")
    public void method4453(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, byte arg10, byte arg11, byte arg12, byte arg13) {
        int var15 = method4450(arg9, arg10, arg11, arg12, arg13);
        int var16 = this.field2691[var15];
        this.method4455(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, var16);
    }

    @ObfuscatedName("ja.ao()I")
    public static final int method4492() {
        return field2696;
    }

    @ObfuscatedName("ja.ah(I)V")
    public static void method4458(int arg0) {
        field2696 = arg0;
    }

    @ObfuscatedName("ja.av(I)V")
    public static void method4478(int arg0) {
        int var1 = arg0 * 140;
        method4458(var1);
    }

    @ObfuscatedName("ja.at(IIIIIIFFFI)V")
    public abstract void method4455(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9);

    @ObfuscatedName("ja.ab(IIIIIIFFFIIIIIIIIIIIII)V")
    public abstract void method4456(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19, int arg20, int arg21);

    @ObfuscatedName("ja.ac(IIIIIIFFFIIIIIIIIIIIII)V")
    public abstract void method4457(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19, int arg20, int arg21);

    @ObfuscatedName("ja.aa(IIIIIIFFFIII)V")
    public abstract void method4461(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11);
}

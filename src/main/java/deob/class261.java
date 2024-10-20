package deob;

@ObfuscatedName("kl")
public abstract class class261 {

    @ObfuscatedName("kl.av(Ljy;Lkg;IIIIIIIIIIIIIII)V")
    public void method4780(class253 arg0, class267 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        int var17 = class248.method4352() + arg4 * class248.method4339() / arg12;
        int var18 = class248.method4335() + arg8 * class248.method4339() / arg12;
        int var19 = class248.method4352() + arg5 * class248.method4339() / arg13;
        int var20 = class248.method4335() + arg9 * class248.method4339() / arg13;
        int var21 = class248.method4352() + arg6 * class248.method4339() / arg14;
        int var22 = class248.method4335() + arg10 * class248.method4339() / arg14;
        int var23 = class248.method4352() + arg7 * class248.method4339() / arg15;
        int var24 = class248.method4335() + arg11 * class248.method4339() / arg15;
        float var25 = class263.method3305(arg12);
        float var26 = class263.method3305(arg13);
        float var27 = class263.method3305(arg14);
        float var28 = class263.method3305(arg15);
        class248.field2670.field2984 = 0;
        if ((var20 - var24) * (var21 - var23) - (var19 - var23) * (var22 - var24) > 0) {
            class248.field2670.field2974 = false;
            int var29 = class248.method4410();
            if (var21 < 0 || var23 < 0 || var19 < 0 || var21 > var29 || var23 > var29 || var19 > var29) {
                class248.field2670.field2974 = true;
            }
            if (arg0.field2735 && class253.method4564(arg0.field2739, arg0.field2740, var22, var24, var20, var21, var23, var19)) {
                arg0.field2741 = arg2;
                arg0.field2742 = arg3;
            }
            if (arg1.field2967 == -1) {
                if (arg1.field2965 != 12345678) {
                    class248.method4347(var22, var24, var20, var21, var23, var19, var27, var28, var26, arg1.field2965, arg1.field2964, arg1.field2966);
                }
            } else if (class253.field2760) {
                int var30 = class248.field2670.field2978.method4752(arg1.field2967);
                class248.method4347(var22, var24, var20, var21, var23, var19, var27, var28, var26, class253.method4563(var30, arg1.field2965), class253.method4563(var30, arg1.field2964), class253.method4563(var30, arg1.field2966));
            } else if (arg1.field2968) {
                class248.method4350(var22, var24, var20, var21, var23, var19, var27, var28, var26, arg1.field2965, arg1.field2964, arg1.field2966, arg4, arg5, arg7, arg8, arg9, arg11, arg12, arg13, arg15, arg1.field2967);
            } else {
                class248.method4350(var22, var24, var20, var21, var23, var19, var27, var28, var26, arg1.field2965, arg1.field2964, arg1.field2966, arg6, arg7, arg5, arg10, arg11, arg9, arg14, arg15, arg13, arg1.field2967);
            }
        }
        if ((var17 - var19) * (var24 - var20) - (var18 - var20) * (var23 - var19) <= 0) {
            return;
        }
        class248.field2670.field2974 = false;
        int var31 = class248.method4410();
        if (var17 < 0 || var19 < 0 || var23 < 0 || var17 > var31 || var19 > var31 || var23 > var31) {
            class248.field2670.field2974 = true;
        }
        if (arg0.field2735 && class253.method4564(arg0.field2739, arg0.field2740, var18, var20, var24, var17, var19, var23)) {
            arg0.field2741 = arg2;
            arg0.field2742 = arg3;
        }
        if (arg1.field2967 == -1) {
            if (arg1.field2963 != 12345678) {
                class248.method4347(var18, var20, var24, var17, var19, var23, var25, var26, var28, arg1.field2963, arg1.field2966, arg1.field2964);
            }
        } else if (class253.field2760) {
            int var32 = class248.field2670.field2978.method4752(arg1.field2967);
            class248.method4347(var18, var20, var24, var17, var19, var23, var25, var26, var28, class253.method4563(var32, arg1.field2963), class253.method4563(var32, arg1.field2966), class253.method4563(var32, arg1.field2964));
        } else {
            class248.method4350(var18, var20, var24, var17, var19, var23, var25, var26, var28, arg1.field2963, arg1.field2966, arg1.field2964, arg4, arg5, arg7, arg8, arg9, arg11, arg12, arg13, arg15, arg1.field2967);
        }
    }

    @ObfuscatedName("kl.aq(Ljy;Lke;IIB)V")
    public void method4783(class253 arg0, class262 arg1, int arg2, int arg3) {
        class248.field2670.field2984 = 0;
        int var5 = arg1.field2855.length;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = arg1.field2855[var6];
            int var8 = arg1.field2848[var6];
            int var9 = arg1.field2849[var6];
            int var10 = class262.field2856[var7];
            int var11 = class262.field2856[var8];
            int var12 = class262.field2856[var9];
            int var13 = class262.field2857[var7];
            int var14 = class262.field2857[var8];
            int var15 = class262.field2857[var9];
            float var16 = class262.field2858[var7];
            float var17 = class262.field2858[var8];
            float var18 = class262.field2858[var9];
            if ((var10 - var11) * (var15 - var14) - (var12 - var11) * (var13 - var14) > 0) {
                class248.field2670.field2974 = false;
                int var19 = class248.method4410();
                if (var10 < 0 || var11 < 0 || var12 < 0 || var10 > var19 || var11 > var19 || var12 > var19) {
                    class248.field2670.field2974 = true;
                }
                if (arg0.field2735 && class253.method4564(arg0.field2739, arg0.field2740, var13, var14, var15, var10, var11, var12)) {
                    arg0.field2741 = arg2;
                    arg0.field2742 = arg3;
                }
                if (arg1.field2850 == null || arg1.field2850[var6] == -1) {
                    if (arg1.field2844[var6] != 12345678) {
                        class248.method4347(var13, var14, var15, var10, var11, var12, var16, var17, var18, arg1.field2844[var6], arg1.field2845[var6], arg1.field2843[var6]);
                    }
                } else if (class253.field2760) {
                    int var20 = class248.field2670.field2978.method4752(arg1.field2850[var6]);
                    class248.method4347(var13, var14, var15, var10, var11, var12, var16, var17, var18, class253.method4563(var20, arg1.field2844[var6]), class253.method4563(var20, arg1.field2845[var6]), class253.method4563(var20, arg1.field2843[var6]));
                } else if (arg1.field2853) {
                    class248.method4350(var13, var14, var15, var10, var11, var12, var16, var17, var18, arg1.field2844[var6], arg1.field2845[var6], arg1.field2843[var6], class262.field2859[0], class262.field2859[1], class262.field2859[3], class262.field2860[0], class262.field2860[1], class262.field2860[3], class262.field2861[0], class262.field2861[1], class262.field2861[3], arg1.field2850[var6]);
                } else {
                    class248.method4350(var13, var14, var15, var10, var11, var12, var16, var17, var18, arg1.field2844[var6], arg1.field2845[var6], arg1.field2843[var6], class262.field2859[var7], class262.field2859[var8], class262.field2859[var9], class262.field2860[var7], class262.field2860[var8], class262.field2860[var9], class262.field2861[var7], class262.field2861[var8], class262.field2861[var9], arg1.field2850[var6]);
                }
            }
        }
    }

    @ObfuscatedName("kl.ak(Lju;IIIIJ)V")
    public abstract void method4415(class256 arg0, int arg1, int arg2, int arg3, int arg4, long arg5);

    @ObfuscatedName("kl.al(Ljy;Lkg;IIIB)V")
    public abstract void method4414(class253 arg0, class267 arg1, int arg2, int arg3, int arg4);

    @ObfuscatedName("kl.aj(Ljy;Lke;IIB)V")
    public abstract void method4424(class253 arg0, class262 arg1, int arg2, int arg3);
}

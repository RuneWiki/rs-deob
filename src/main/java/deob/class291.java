package deob;

@ObfuscatedName("ln")
public abstract class class291 {

    @ObfuscatedName("ln.ae(Lkq;Llt;IIIIIIIIIIIIIIB)V")
    public void method5219(class283 arg0, class297 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        int var17 = class278.method4763() + arg4 * class278.method4769() / arg12;
        int var18 = class278.method4758() + arg8 * class278.method4769() / arg12;
        int var19 = class278.method4763() + arg5 * class278.method4769() / arg13;
        int var20 = class278.method4758() + arg9 * class278.method4769() / arg13;
        int var21 = class278.method4763() + arg6 * class278.method4769() / arg14;
        int var22 = class278.method4758() + arg10 * class278.method4769() / arg14;
        int var23 = class278.method4763() + arg7 * class278.method4769() / arg15;
        int var24 = class278.method4758() + arg11 * class278.method4769() / arg15;
        float var25 = class293.method6536(arg12);
        float var26 = class293.method6536(arg13);
        float var27 = class293.method6536(arg14);
        float var28 = class293.method6536(arg15);
        class278.field2877.field3187 = 0;
        if ((var20 - var24) * (var21 - var23) - (var19 - var23) * (var22 - var24) > 0) {
            class278.field2877.field3193 = false;
            int var29 = class278.method4770();
            if (var21 < 0 || var23 < 0 || var19 < 0 || var21 > var29 || var23 > var29 || var19 > var29) {
                class278.field2877.field3193 = true;
            }
            if (arg0.field2949 && class283.method4989(arg0.field2951, arg0.field2987, var22, var24, var20, var21, var23, var19)) {
                arg0.field2935 = arg2;
                arg0.field2968 = arg3;
            }
            if (arg1.field3180 == -1) {
                if (arg1.field3178 != 12345678) {
                    class278.method4777(var22, var24, var20, var21, var23, var19, var27, var28, var26, arg1.field3178, arg1.field3179, arg1.field3183);
                }
            } else if (class283.field2919) {
                int var30 = class278.field2877.field3195.method5207(arg1.field3180);
                class278.method4777(var22, var24, var20, var21, var23, var19, var27, var28, var26, class283.method5155(var30, arg1.field3178), class283.method5155(var30, arg1.field3179), class283.method5155(var30, arg1.field3183));
            } else if (arg1.field3176) {
                class278.method4780(var22, var24, var20, var21, var23, var19, var27, var28, var26, arg1.field3178, arg1.field3179, arg1.field3183, arg4, arg5, arg7, arg8, arg9, arg11, arg12, arg13, arg15, arg1.field3180);
            } else {
                class278.method4780(var22, var24, var20, var21, var23, var19, var27, var28, var26, arg1.field3178, arg1.field3179, arg1.field3183, arg6, arg7, arg5, arg10, arg11, arg9, arg14, arg15, arg13, arg1.field3180);
            }
        }
        if ((var17 - var19) * (var24 - var20) - (var18 - var20) * (var23 - var19) <= 0) {
            return;
        }
        class278.field2877.field3193 = false;
        int var31 = class278.method4770();
        if (var17 < 0 || var19 < 0 || var23 < 0 || var17 > var31 || var19 > var31 || var23 > var31) {
            class278.field2877.field3193 = true;
        }
        if (arg0.field2949 && class283.method4989(arg0.field2951, arg0.field2987, var18, var20, var24, var17, var19, var23)) {
            arg0.field2935 = arg2;
            arg0.field2968 = arg3;
        }
        if (arg1.field3180 == -1) {
            if (arg1.field3181 != 12345678) {
                class278.method4777(var18, var20, var24, var17, var19, var23, var25, var26, var28, arg1.field3181, arg1.field3183, arg1.field3179);
            }
        } else if (class283.field2919) {
            int var32 = class278.field2877.field3195.method5207(arg1.field3180);
            class278.method4777(var18, var20, var24, var17, var19, var23, var25, var26, var28, class283.method5155(var32, arg1.field3181), class283.method5155(var32, arg1.field3183), class283.method5155(var32, arg1.field3179));
        } else {
            class278.method4780(var18, var20, var24, var17, var19, var23, var25, var26, var28, arg1.field3181, arg1.field3183, arg1.field3179, arg4, arg5, arg7, arg8, arg9, arg11, arg12, arg13, arg15, arg1.field3180);
        }
    }

    @ObfuscatedName("ln.au(Lkq;Llw;III)V")
    public void method5224(class283 arg0, class292 arg1, int arg2, int arg3) {
        class278.field2877.field3187 = 0;
        int var5 = arg1.field3063.length;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = arg1.field3063[var6];
            int var8 = arg1.field3061[var6];
            int var9 = arg1.field3065[var6];
            int var10 = class292.field3066[var7];
            int var11 = class292.field3066[var8];
            int var12 = class292.field3066[var9];
            int var13 = class292.field3074[var7];
            int var14 = class292.field3074[var8];
            int var15 = class292.field3074[var9];
            float var16 = class292.field3073[var7];
            float var17 = class292.field3073[var8];
            float var18 = class292.field3073[var9];
            if ((var10 - var11) * (var15 - var14) - (var12 - var11) * (var13 - var14) > 0) {
                class278.field2877.field3193 = false;
                int var19 = class278.method4770();
                if (var10 < 0 || var11 < 0 || var12 < 0 || var10 > var19 || var11 > var19 || var12 > var19) {
                    class278.field2877.field3193 = true;
                }
                if (arg0.field2949 && class283.method4989(arg0.field2951, arg0.field2987, var13, var14, var15, var10, var11, var12)) {
                    arg0.field2935 = arg2;
                    arg0.field2968 = arg3;
                }
                if (arg1.field3059 == null || arg1.field3059[var6] == -1) {
                    if (arg1.field3060[var6] != 12345678) {
                        class278.method4777(var13, var14, var15, var10, var11, var12, var16, var17, var18, arg1.field3060[var6], arg1.field3070[var6], arg1.field3075[var6]);
                    }
                } else if (class283.field2919) {
                    int var20 = class278.field2877.field3195.method5207(arg1.field3059[var6]);
                    class278.method4777(var13, var14, var15, var10, var11, var12, var16, var17, var18, class283.method5155(var20, arg1.field3060[var6]), class283.method5155(var20, arg1.field3070[var6]), class283.method5155(var20, arg1.field3075[var6]));
                } else if (arg1.field3067) {
                    class278.method4780(var13, var14, var15, var10, var11, var12, var16, var17, var18, arg1.field3060[var6], arg1.field3070[var6], arg1.field3075[var6], class292.field3064[0], class292.field3064[1], class292.field3064[3], class292.field3076[0], class292.field3076[1], class292.field3076[3], class292.field3077[0], class292.field3077[1], class292.field3077[3], arg1.field3059[var6]);
                } else {
                    class278.method4780(var13, var14, var15, var10, var11, var12, var16, var17, var18, arg1.field3060[var6], arg1.field3070[var6], arg1.field3075[var6], class292.field3064[var7], class292.field3064[var8], class292.field3064[var9], class292.field3076[var7], class292.field3076[var8], class292.field3076[var9], class292.field3077[var7], class292.field3077[var8], class292.field3077[var9], arg1.field3059[var6]);
                }
            }
        }
    }

    @ObfuscatedName("ln.ad(Lkq;Llt;IIII)V")
    public abstract void method4841(class283 arg0, class297 arg1, int arg2, int arg3, int arg4);

    @ObfuscatedName("ln.aq(Lkt;IIIIJ)V")
    public abstract void method4849(class286 arg0, int arg1, int arg2, int arg3, int arg4, long arg5);

    @ObfuscatedName("ln.ag(Lkq;Llw;IIB)V")
    public abstract void method4843(class283 arg0, class292 arg1, int arg2, int arg3);
}

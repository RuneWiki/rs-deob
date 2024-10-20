package deob;

@ObfuscatedName("jx")
public abstract class class253 {

    @ObfuscatedName("jx.au(Ljh;Ljl;IIIIIIIIIIIIIII)V")
    public void method4783(class245 arg0, class259 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        int var17 = class240.method4391() + arg4 * class240.method4339() / arg12;
        int var18 = class240.method4341() + arg8 * class240.method4339() / arg12;
        int var19 = class240.method4391() + arg5 * class240.method4339() / arg13;
        int var20 = class240.method4341() + arg9 * class240.method4339() / arg13;
        int var21 = class240.method4391() + arg6 * class240.method4339() / arg14;
        int var22 = class240.method4341() + arg10 * class240.method4339() / arg14;
        int var23 = class240.method4391() + arg7 * class240.method4339() / arg15;
        int var24 = class240.method4341() + arg11 * class240.method4339() / arg15;
        float var25 = class255.method3204(arg12);
        float var26 = class255.method3204(arg13);
        float var27 = class255.method3204(arg14);
        float var28 = class255.method3204(arg15);
        class240.field2589.field2908 = 0;
        if ((var20 - var24) * (var21 - var23) - (var19 - var23) * (var22 - var24) > 0) {
            class240.field2589.field2900 = false;
            int var29 = class240.method4411();
            if (var21 < 0 || var23 < 0 || var19 < 0 || var21 > var29 || var23 > var29 || var19 > var29) {
                class240.field2589.field2900 = true;
            }
            if (arg0.field2672 && class245.method4561(arg0.field2638, arg0.field2644, var22, var24, var20, var21, var23, var19)) {
                arg0.field2723 = arg2;
                arg0.field2677 = arg3;
            }
            if (arg1.field2897 == -1) {
                if (arg1.field2893 != 12345678) {
                    class240.method4337(var22, var24, var20, var21, var23, var19, var27, var28, var26, arg1.field2893, arg1.field2895, arg1.field2894);
                }
            } else if (class245.field2678) {
                int var30 = class240.field2589.field2905.method4753(arg1.field2897);
                class240.method4337(var22, var24, var20, var21, var23, var19, var27, var28, var26, class245.method4560(var30, arg1.field2893), class245.method4560(var30, arg1.field2895), class245.method4560(var30, arg1.field2894));
            } else if (arg1.field2896) {
                class240.method4399(var22, var24, var20, var21, var23, var19, var27, var28, var26, arg1.field2893, arg1.field2895, arg1.field2894, arg4, arg5, arg7, arg8, arg9, arg11, arg12, arg13, arg15, arg1.field2897);
            } else {
                class240.method4399(var22, var24, var20, var21, var23, var19, var27, var28, var26, arg1.field2893, arg1.field2895, arg1.field2894, arg6, arg7, arg5, arg10, arg11, arg9, arg14, arg15, arg13, arg1.field2897);
            }
        }
        if ((var17 - var19) * (var24 - var20) - (var18 - var20) * (var23 - var19) <= 0) {
            return;
        }
        class240.field2589.field2900 = false;
        int var31 = class240.method4411();
        if (var17 < 0 || var19 < 0 || var23 < 0 || var17 > var31 || var19 > var31 || var23 > var31) {
            class240.field2589.field2900 = true;
        }
        if (arg0.field2672 && class245.method4561(arg0.field2638, arg0.field2644, var18, var20, var24, var17, var19, var23)) {
            arg0.field2723 = arg2;
            arg0.field2677 = arg3;
        }
        if (arg1.field2897 == -1) {
            if (arg1.field2892 != 12345678) {
                class240.method4337(var18, var20, var24, var17, var19, var23, var25, var26, var28, arg1.field2892, arg1.field2894, arg1.field2895);
            }
        } else if (class245.field2678) {
            int var32 = class240.field2589.field2905.method4753(arg1.field2897);
            class240.method4337(var18, var20, var24, var17, var19, var23, var25, var26, var28, class245.method4560(var32, arg1.field2892), class245.method4560(var32, arg1.field2894), class245.method4560(var32, arg1.field2895));
        } else {
            class240.method4399(var18, var20, var24, var17, var19, var23, var25, var26, var28, arg1.field2892, arg1.field2894, arg1.field2895, arg4, arg5, arg7, arg8, arg9, arg11, arg12, arg13, arg15, arg1.field2897);
        }
    }

    @ObfuscatedName("jx.ar(Ljh;Ljb;IIB)V")
    public void method4784(class245 arg0, class254 arg1, int arg2, int arg3) {
        class240.field2589.field2908 = 0;
        int var5 = arg1.field2777.length;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = arg1.field2777[var6];
            int var8 = arg1.field2778[var6];
            int var9 = arg1.field2779[var6];
            int var10 = class254.field2771[var7];
            int var11 = class254.field2771[var8];
            int var12 = class254.field2771[var9];
            int var13 = class254.field2787[var7];
            int var14 = class254.field2787[var8];
            int var15 = class254.field2787[var9];
            float var16 = class254.field2785[var7];
            float var17 = class254.field2785[var8];
            float var18 = class254.field2785[var9];
            if ((var10 - var11) * (var15 - var14) - (var12 - var11) * (var13 - var14) > 0) {
                class240.field2589.field2900 = false;
                int var19 = class240.method4411();
                if (var10 < 0 || var11 < 0 || var12 < 0 || var10 > var19 || var11 > var19 || var12 > var19) {
                    class240.field2589.field2900 = true;
                }
                if (arg0.field2672 && class245.method4561(arg0.field2638, arg0.field2644, var13, var14, var15, var10, var11, var12)) {
                    arg0.field2723 = arg2;
                    arg0.field2677 = arg3;
                }
                if (arg1.field2780 == null || arg1.field2780[var6] == -1) {
                    if (arg1.field2772[var6] != 12345678) {
                        class240.method4337(var13, var14, var15, var10, var11, var12, var16, var17, var18, arg1.field2772[var6], arg1.field2791[var6], arg1.field2776[var6]);
                    }
                } else if (class245.field2678) {
                    int var20 = class240.field2589.field2905.method4753(arg1.field2780[var6]);
                    class240.method4337(var13, var14, var15, var10, var11, var12, var16, var17, var18, class245.method4560(var20, arg1.field2772[var6]), class245.method4560(var20, arg1.field2791[var6]), class245.method4560(var20, arg1.field2776[var6]));
                } else if (arg1.field2781) {
                    class240.method4399(var13, var14, var15, var10, var11, var12, var16, var17, var18, arg1.field2772[var6], arg1.field2791[var6], arg1.field2776[var6], class254.field2789[0], class254.field2789[1], class254.field2789[3], class254.field2790[0], class254.field2790[1], class254.field2790[3], class254.field2792[0], class254.field2792[1], class254.field2792[3], arg1.field2780[var6]);
                } else {
                    class240.method4399(var13, var14, var15, var10, var11, var12, var16, var17, var18, arg1.field2772[var6], arg1.field2791[var6], arg1.field2776[var6], class254.field2789[var7], class254.field2789[var8], class254.field2789[var9], class254.field2790[var7], class254.field2790[var8], class254.field2790[var9], class254.field2792[var7], class254.field2792[var8], class254.field2792[var9], arg1.field2780[var6]);
                }
            }
        }
    }

    @ObfuscatedName("jx.ac(Lju;IIIIJ)V")
    public abstract void method4418(class248 arg0, int arg1, int arg2, int arg3, int arg4, long arg5);

    @ObfuscatedName("jx.ag(Ljh;Ljb;III)V")
    public abstract void method4417(class245 arg0, class254 arg1, int arg2, int arg3);

    @ObfuscatedName("jx.ae(Ljh;Ljl;IIII)V")
    public abstract void method4419(class245 arg0, class259 arg1, int arg2, int arg3, int arg4);
}

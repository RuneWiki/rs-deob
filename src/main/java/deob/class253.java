package deob;

@ObfuscatedName("jz")
public abstract class class253 {

    @ObfuscatedName("jz.an(Lji;Ljp;IIIIIIIIIIIIIII)V")
    public void method4977(class245 arg0, class259 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        int var17 = class240.method4498() + arg4 * class240.method4504() / arg12;
        int var18 = class240.method4499() + arg8 * class240.method4504() / arg12;
        int var19 = class240.method4498() + arg5 * class240.method4504() / arg13;
        int var20 = class240.method4499() + arg9 * class240.method4504() / arg13;
        int var21 = class240.method4498() + arg6 * class240.method4504() / arg14;
        int var22 = class240.method4499() + arg10 * class240.method4504() / arg14;
        int var23 = class240.method4498() + arg7 * class240.method4504() / arg15;
        int var24 = class240.method4499() + arg11 * class240.method4504() / arg15;
        float var25 = class255.method3791(arg12);
        float var26 = class255.method3791(arg13);
        float var27 = class255.method3791(arg14);
        float var28 = class255.method3791(arg15);
        class240.field2589.field2917 = 0;
        if ((var20 - var24) * (var21 - var23) - (var19 - var23) * (var22 - var24) > 0) {
            class240.field2589.field2933 = false;
            int var29 = class240.method4533();
            if (var21 < 0 || var23 < 0 || var19 < 0 || var21 > var29 || var23 > var29 || var19 > var29) {
                class240.field2589.field2933 = true;
            }
            if (class245.method4742(arg0.field2678, arg0.field2679, var22, var24, var20, var21, var23, var19)) {
                arg0.field2704 = arg2;
                arg0.field2681 = arg3;
                arg0.field2687 = class332.method5802(arg0.field2678, arg0.field2679, var21, var23, var19, var22, var24, var20, var27, var28, var26);
            }
            if (arg1.field2910 == -1) {
                if (arg1.field2907 != 12345678) {
                    class240.method4511(var22, var24, var20, var21, var23, var19, var27, var28, var26, arg1.field2907, arg1.field2906, arg1.field2908);
                }
            } else if (class245.field2639) {
                int var30 = class240.field2589.field2913.method4967(arg1.field2910);
                class240.method4511(var22, var24, var20, var21, var23, var19, var27, var28, var26, class245.method4741(var30, arg1.field2907), class245.method4741(var30, arg1.field2906), class245.method4741(var30, arg1.field2908));
            } else if (arg1.field2911) {
                class240.method4514(var22, var24, var20, var21, var23, var19, var27, var28, var26, arg1.field2907, arg1.field2906, arg1.field2908, arg4, arg5, arg7, arg8, arg9, arg11, arg12, arg13, arg15, arg1.field2910);
            } else {
                class240.method4514(var22, var24, var20, var21, var23, var19, var27, var28, var26, arg1.field2907, arg1.field2906, arg1.field2908, arg6, arg7, arg5, arg10, arg11, arg9, arg14, arg15, arg13, arg1.field2910);
            }
        }
        if ((var17 - var19) * (var24 - var20) - (var18 - var20) * (var23 - var19) <= 0) {
            return;
        }
        class240.field2589.field2933 = false;
        int var31 = class240.method4533();
        if (var17 < 0 || var19 < 0 || var23 < 0 || var17 > var31 || var19 > var31 || var23 > var31) {
            class240.field2589.field2933 = true;
        }
        if (class245.method4742(arg0.field2678, arg0.field2679, var18, var20, var24, var17, var19, var23)) {
            arg0.field2704 = arg2;
            arg0.field2681 = arg3;
            arg0.field2687 = class332.method5802(arg0.field2678, arg0.field2679, var17, var19, var23, var18, var20, var24, var25, var26, var28);
        }
        if (arg1.field2910 == -1) {
            if (arg1.field2909 != 12345678) {
                class240.method4511(var18, var20, var24, var17, var19, var23, var25, var26, var28, arg1.field2909, arg1.field2908, arg1.field2906);
            }
        } else if (class245.field2639) {
            int var32 = class240.field2589.field2913.method4967(arg1.field2910);
            class240.method4511(var18, var20, var24, var17, var19, var23, var25, var26, var28, class245.method4741(var32, arg1.field2909), class245.method4741(var32, arg1.field2908), class245.method4741(var32, arg1.field2906));
        } else {
            class240.method4514(var18, var20, var24, var17, var19, var23, var25, var26, var28, arg1.field2909, arg1.field2908, arg1.field2906, arg4, arg5, arg7, arg8, arg9, arg11, arg12, arg13, arg15, arg1.field2910);
        }
    }

    @ObfuscatedName("jz.ao(Lji;Ljs;III)V")
    public void method4978(class245 arg0, class254 arg1, int arg2, int arg3) {
        class240.field2589.field2917 = 0;
        int var5 = arg1.field2790.length;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = arg1.field2790[var6];
            int var8 = arg1.field2791[var6];
            int var9 = arg1.field2792[var6];
            int var10 = class254.field2799[var7];
            int var11 = class254.field2799[var8];
            int var12 = class254.field2799[var9];
            int var13 = class254.field2785[var7];
            int var14 = class254.field2785[var8];
            int var15 = class254.field2785[var9];
            float var16 = class254.field2801[var7];
            float var17 = class254.field2801[var8];
            float var18 = class254.field2801[var9];
            if ((var10 - var11) * (var15 - var14) - (var12 - var11) * (var13 - var14) > 0) {
                class240.field2589.field2933 = false;
                int var19 = class240.method4533();
                if (var10 < 0 || var11 < 0 || var12 < 0 || var10 > var19 || var11 > var19 || var12 > var19) {
                    class240.field2589.field2933 = true;
                }
                if (class245.method4742(arg0.field2678, arg0.field2679, var13, var14, var15, var10, var11, var12)) {
                    arg0.field2704 = arg2;
                    arg0.field2681 = arg3;
                    arg0.field2687 = class332.method5802(arg0.field2678, arg0.field2679, var10, var11, var12, var13, var14, var15, var16, var17, var18);
                }
                if (arg1.field2793 == null || arg1.field2793[var6] == -1) {
                    if (arg1.field2787[var6] != 12345678) {
                        class240.method4511(var13, var14, var15, var10, var11, var12, var16, var17, var18, arg1.field2787[var6], arg1.field2794[var6], arg1.field2789[var6]);
                    }
                } else if (class245.field2639) {
                    int var20 = class240.field2589.field2913.method4967(arg1.field2793[var6]);
                    class240.method4511(var13, var14, var15, var10, var11, var12, var16, var17, var18, class245.method4741(var20, arg1.field2787[var6]), class245.method4741(var20, arg1.field2794[var6]), class245.method4741(var20, arg1.field2789[var6]));
                } else if (arg1.field2786) {
                    class240.method4514(var13, var14, var15, var10, var11, var12, var16, var17, var18, arg1.field2787[var6], arg1.field2794[var6], arg1.field2789[var6], class254.field2802[0], class254.field2802[1], class254.field2802[3], class254.field2800[0], class254.field2800[1], class254.field2800[3], class254.field2804[0], class254.field2804[1], class254.field2804[3], arg1.field2793[var6]);
                } else {
                    class240.method4514(var13, var14, var15, var10, var11, var12, var16, var17, var18, arg1.field2787[var6], arg1.field2794[var6], arg1.field2789[var6], class254.field2802[var7], class254.field2802[var8], class254.field2802[var9], class254.field2800[var7], class254.field2800[var8], class254.field2800[var9], class254.field2804[var7], class254.field2804[var8], class254.field2804[var9], arg1.field2793[var6]);
                }
            }
        }
    }

    @ObfuscatedName("jz.ap(Ljv;IIIIJ)V")
    public abstract void method4586(class248 arg0, int arg1, int arg2, int arg3, int arg4, long arg5);

    @ObfuscatedName("jz.aw(Lji;Ljp;IIII)V")
    public abstract void method4593(class245 arg0, class259 arg1, int arg2, int arg3, int arg4);

    @ObfuscatedName("jz.ak(Lji;Ljs;IIB)V")
    public abstract void method4587(class245 arg0, class254 arg1, int arg2, int arg3);
}

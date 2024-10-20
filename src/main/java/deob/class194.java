package deob;

@ObfuscatedName("hb")
public abstract class class194 {

    @ObfuscatedName("hb.ae(Lhf;Lhv;IIIIIIIIIIIIIII)V")
    public void method3870(class186 arg0, class200 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        int var17 = class181.method3438() + arg4 * class181.method3447() / arg12;
        int var18 = class181.method3512() + arg8 * class181.method3447() / arg12;
        int var19 = class181.method3438() + arg5 * class181.method3447() / arg13;
        int var20 = class181.method3512() + arg9 * class181.method3447() / arg13;
        int var21 = class181.method3438() + arg6 * class181.method3447() / arg14;
        int var22 = class181.method3512() + arg10 * class181.method3447() / arg14;
        int var23 = class181.method3438() + arg7 * class181.method3447() / arg15;
        int var24 = class181.method3512() + arg11 * class181.method3447() / arg15;
        float var25 = class196.method2694(arg12);
        float var26 = class196.method2694(arg13);
        float var27 = class196.method2694(arg14);
        float var28 = class196.method2694(arg15);
        class181.field1943.field2276 = 0;
        if ((var20 - var24) * (var21 - var23) - (var19 - var23) * (var22 - var24) > 0) {
            class181.field1943.field2262 = false;
            int var29 = class181.method3448();
            if (var21 < 0 || var23 < 0 || var19 < 0 || var21 > var29 || var23 > var29 || var19 > var29) {
                class181.field1943.field2262 = true;
            }
            if (arg0.field2062 && class186.method3661(arg0.field2026, arg0.field2027, var22, var24, var20, var21, var23, var19)) {
                arg0.field2028 = arg2;
                arg0.field2034 = arg3;
            }
            if (arg1.field2257 == -1) {
                if (arg1.field2253 != 12345678) {
                    class181.method3500(var22, var24, var20, var21, var23, var19, var27, var28, var26, arg1.field2253, arg1.field2254, arg1.field2251);
                }
            } else if (class186.field1987) {
                int var30 = class181.field1943.field2264.method3846(arg1.field2257);
                class181.method3500(var22, var24, var20, var21, var23, var19, var27, var28, var26, class186.method3766(var30, arg1.field2253), class186.method3766(var30, arg1.field2254), class186.method3766(var30, arg1.field2251));
            } else if (arg1.field2256) {
                class181.method3458(var22, var24, var20, var21, var23, var19, var27, var28, var26, arg1.field2253, arg1.field2254, arg1.field2251, arg4, arg5, arg7, arg8, arg9, arg11, arg12, arg13, arg15, arg1.field2257);
            } else {
                class181.method3458(var22, var24, var20, var21, var23, var19, var27, var28, var26, arg1.field2253, arg1.field2254, arg1.field2251, arg6, arg7, arg5, arg10, arg11, arg9, arg14, arg15, arg13, arg1.field2257);
            }
        }
        if ((var17 - var19) * (var24 - var20) - (var18 - var20) * (var23 - var19) <= 0) {
            return;
        }
        class181.field1943.field2262 = false;
        int var31 = class181.method3448();
        if (var17 < 0 || var19 < 0 || var23 < 0 || var17 > var31 || var19 > var31 || var23 > var31) {
            class181.field1943.field2262 = true;
        }
        if (arg0.field2062 && class186.method3661(arg0.field2026, arg0.field2027, var18, var20, var24, var17, var19, var23)) {
            arg0.field2028 = arg2;
            arg0.field2034 = arg3;
        }
        if (arg1.field2257 == -1) {
            if (arg1.field2252 != 12345678) {
                class181.method3500(var18, var20, var24, var17, var19, var23, var25, var26, var28, arg1.field2252, arg1.field2251, arg1.field2254);
            }
        } else if (class186.field1987) {
            int var32 = class181.field1943.field2264.method3846(arg1.field2257);
            class181.method3500(var18, var20, var24, var17, var19, var23, var25, var26, var28, class186.method3766(var32, arg1.field2252), class186.method3766(var32, arg1.field2251), class186.method3766(var32, arg1.field2254));
        } else {
            class181.method3458(var18, var20, var24, var17, var19, var23, var25, var26, var28, arg1.field2252, arg1.field2251, arg1.field2254, arg4, arg5, arg7, arg8, arg9, arg11, arg12, arg13, arg15, arg1.field2257);
        }
    }

    @ObfuscatedName("hb.ad(Lhf;Lhc;III)V")
    public void method3871(class186 arg0, class195 arg1, int arg2, int arg3) {
        class181.field1943.field2276 = 0;
        int var5 = arg1.field2132.length;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = arg1.field2132[var6];
            int var8 = arg1.field2146[var6];
            int var9 = arg1.field2139[var6];
            int var10 = class195.field2141[var7];
            int var11 = class195.field2141[var8];
            int var12 = class195.field2141[var9];
            int var13 = class195.field2127[var7];
            int var14 = class195.field2127[var8];
            int var15 = class195.field2127[var9];
            float var16 = class195.field2143[var7];
            float var17 = class195.field2143[var8];
            float var18 = class195.field2143[var9];
            if ((var10 - var11) * (var15 - var14) - (var12 - var11) * (var13 - var14) > 0) {
                class181.field1943.field2262 = false;
                int var19 = class181.method3448();
                if (var10 < 0 || var11 < 0 || var12 < 0 || var10 > var19 || var11 > var19 || var12 > var19) {
                    class181.field1943.field2262 = true;
                }
                if (arg0.field2062 && class186.method3661(arg0.field2026, arg0.field2027, var13, var14, var15, var10, var11, var12)) {
                    arg0.field2028 = arg2;
                    arg0.field2034 = arg3;
                }
                if (arg1.field2135 == null || arg1.field2135[var6] == -1) {
                    if (arg1.field2140[var6] != 12345678) {
                        class181.method3500(var13, var14, var15, var10, var11, var12, var16, var17, var18, arg1.field2140[var6], arg1.field2138[var6], arg1.field2131[var6]);
                    }
                } else if (class186.field1987) {
                    int var20 = class181.field1943.field2264.method3846(arg1.field2135[var6]);
                    class181.method3500(var13, var14, var15, var10, var11, var12, var16, var17, var18, class186.method3766(var20, arg1.field2140[var6]), class186.method3766(var20, arg1.field2138[var6]), class186.method3766(var20, arg1.field2131[var6]));
                } else if (arg1.field2136) {
                    class181.method3458(var13, var14, var15, var10, var11, var12, var16, var17, var18, arg1.field2140[var6], arg1.field2138[var6], arg1.field2131[var6], class195.field2144[0], class195.field2144[1], class195.field2144[3], class195.field2145[0], class195.field2145[1], class195.field2145[3], class195.field2129[0], class195.field2129[1], class195.field2129[3], arg1.field2135[var6]);
                } else {
                    class181.method3458(var13, var14, var15, var10, var11, var12, var16, var17, var18, arg1.field2140[var6], arg1.field2138[var6], arg1.field2131[var6], class195.field2144[var7], class195.field2144[var8], class195.field2144[var9], class195.field2145[var7], class195.field2145[var8], class195.field2145[var9], class195.field2129[var7], class195.field2129[var8], class195.field2129[var9], arg1.field2135[var6]);
                }
            }
        }
    }

    @ObfuscatedName("hb.ab(Lhs;IIIIJ)V")
    public abstract void method3526(class189 arg0, int arg1, int arg2, int arg3, int arg4, long arg5);

    @ObfuscatedName("hb.ay(Lhf;Lhv;IIII)V")
    public abstract void method3527(class186 arg0, class200 arg1, int arg2, int arg3, int arg4);

    @ObfuscatedName("hb.an(Lhf;Lhc;III)V")
    public abstract void method3525(class186 arg0, class195 arg1, int arg2, int arg3);
}

package deob;

@ObfuscatedName("ft")
public class class134 {

    @ObfuscatedName("ft.am")
    public static final float field1562 = Math.ulp(1.0F);

    @ObfuscatedName("ft.ax")
    public static final float field1566 = field1562 * 2.0F;

    public class134() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dk.ac(Lfr;FS)F")
    public static float method2292(class138 arg0, float arg1) {
        if (arg0 == null || arg0.method3154() == 0) {
            return 0.0F;
        } else if (arg1 < (float) arg0.field1608[0].field1555) {
            return class136.field1591 == arg0.field1606 ? arg0.field1608[0].field1556 : Statics.method3076(arg0, arg1, true);
        } else if (arg1 > (float) arg0.field1608[arg0.method3154() - 1].field1555) {
            return class136.field1591 == arg0.field1607 ? arg0.field1608[arg0.method3154() - 1].field1556 : Statics.method3076(arg0, arg1, false);
        } else if (arg0.field1605) {
            return arg0.field1608[0].field1556;
        } else {
            class133 var2 = arg0.method3153(arg1);
            boolean var3 = false;
            boolean var4 = false;
            if (var2 == null) {
                return 0.0F;
            }
            if (var2.field1559 == 0.0F && var2.field1560 == 0.0F) {
                var3 = true;
            } else if (var2.field1559 == Float.MAX_VALUE && var2.field1560 == Float.MAX_VALUE) {
                var4 = true;
            } else if (var2.field1561 == null) {
                var3 = true;
            } else if (arg0.field1620) {
                float var5 = (float) var2.field1555;
                float var6 = var2.field1556;
                float var7 = var2.field1559 * 0.33333334F + var5;
                float var8 = var2.field1560 * 0.33333334F + var6;
                float var9 = (float) var2.field1561.field1555;
                float var10 = var2.field1561.field1556;
                float var11 = var9 - var2.field1561.field1557 * 0.33333334F;
                float var12 = var10 - var2.field1561.field1558 * 0.33333334F;
                if (arg0.field1619) {
                    float var15 = var8;
                    float var16 = var12;
                    if (arg0 != null) {
                        float var17 = var9 - var5;
                        if (var17 != 0.0F) {
                            float var18 = var7 - var5;
                            float var19 = var11 - var5;
                            float[] var20 = new float[] { var18 / var17, var19 / var17 };
                            arg0.field1604 = var20[0] == 0.33333334F && var20[1] == 0.6666667F;
                            float var21 = var20[0];
                            float var22 = var20[1];
                            if (var20[0] < 0.0F) {
                                var20[0] = 0.0F;
                            }
                            if (var20[1] > 1.0F) {
                                var20[1] = 1.0F;
                            }
                            if (var20[0] > 1.0F || var20[1] < -1.0F) {
                                method5695(var20);
                            }
                            if (var20[0] != var21) {
                                float var23 = var20[0] * var17 + var5;
                                if (var21 != 0.0F) {
                                    var15 = (var8 - var6) * var20[0] / var21 + var6;
                                }
                            }
                            if (var20[1] != var22) {
                                float var24 = var20[1] * var17 + var5;
                                if (var22 != 1.0F) {
                                    var16 = var10 - (1.0F - var20[1]) * (var10 - var12) / (1.0F - var22);
                                }
                            }
                            arg0.field1610 = var5;
                            arg0.field1611 = var9;
                            method269(0.0F, var20[0], var20[1], 1.0F, arg0);
                            method3264(var6, var15, var16, var10, arg0);
                        }
                    }
                } else if (arg0 != null) {
                    arg0.field1610 = var5;
                    float var25 = var9 - var5;
                    float var26 = var10 - var6;
                    float var27 = var7 - var5;
                    float var28 = 0.0F;
                    float var29 = 0.0F;
                    if (var27 != 0.0F) {
                        var28 = (var8 - var6) / var27;
                    }
                    float var30 = var9 - var11;
                    if (var30 != 0.0F) {
                        var29 = (var10 - var12) / var30;
                    }
                    float var31 = 1.0F / (var25 * var25);
                    float var32 = var25 * var28;
                    float var33 = var25 * var29;
                    arg0.field1624 = (var32 + var33 - var26 - var26) * var31 / var25;
                    arg0.field1613 = (var26 + var26 + var26 - var32 - var32 - var33) * var31;
                    arg0.field1614 = var28;
                    arg0.field1615 = var6;
                }
                arg0.field1620 = false;
            }
            if (var3) {
                return var2.field1556;
            } else if (var4) {
                return (float) var2.field1555 == arg1 || var2.field1561 == null ? var2.field1556 : var2.field1561.field1556;
            } else if (arg0.field1619) {
                return method6165(arg0, arg1);
            } else {
                return method2310(arg0, arg1);
            }
        }
    }

    @ObfuscatedName("nd.ae(Lfr;FB)F")
    public static float method6165(class138 arg0, float arg1) {
        if (arg0 == null) {
            return 0.0F;
        }
        float var2;
        if (arg0.field1610 == arg1) {
            var2 = 0.0F;
        } else if (arg0.field1611 == arg1) {
            var2 = 1.0F;
        } else {
            var2 = (arg1 - arg0.field1610) / (arg0.field1611 - arg0.field1610);
        }
        float var3;
        if (arg0.field1604) {
            var3 = var2;
        } else {
            float[] var4 = new float[] { arg0.field1624 - var2, arg0.field1613, arg0.field1614, arg0.field1615 };
            float[] var5 = new float[5];
            int var6 = class430.method6776(var4, 3, 0.0F, true, 1.0F, true, var5);
            if (var6 == 1) {
                var3 = var5[0];
            } else {
                var3 = 0.0F;
            }
        }
        return ((arg0.field1625 * var3 + arg0.field1609) * var3 + arg0.field1617) * var3 + arg0.field1616;
    }

    @ObfuscatedName("dl.ag(Lfr;FI)F")
    public static float method2310(class138 arg0, float arg1) {
        if (arg0 == null) {
            return 0.0F;
        } else {
            float var2 = arg1 - arg0.field1610;
            return ((arg0.field1624 * var2 + arg0.field1613) * var2 + arg0.field1614) * var2 + arg0.field1615;
        }
    }

    @ObfuscatedName("gg.ax([FI)V")
    public static void method3446(float[] arg0) {
        if (arg0[0] + field1562 >= 1.3333334F) {
            arg0[0] = 1.3333334F - field1562;
            arg0[1] = 0.33333334F - field1562;
            return;
        }
        float var1 = arg0[0] - 2.0F;
        float var2 = arg0[0] - 1.0F;
        float var3 = (float) Math.sqrt((double) (var1 * var1 - var2 * 4.0F * var2));
        float var4 = (-var1 + var3) * 0.5F;
        if (arg0[1] + field1562 > var4) {
            arg0[1] = var4 - field1562;
        } else {
            float var5 = (-var1 - var3) * 0.5F;
            if (arg0[1] < field1562 + var5) {
                arg0[1] = field1562 + var5;
            }
        }
    }

    @ObfuscatedName("lj.aq([FB)V")
    public static void method5695(float[] arg0) {
        arg0[1] = 1.0F - arg0[1];
        if (arg0[0] < 0.0F) {
            arg0[0] = 0.0F;
        }
        if (arg0[1] < 0.0F) {
            arg0[1] = 0.0F;
        }
        if (arg0[0] > 1.0F || arg0[1] > 1.0F) {
            float var1 = (arg0[1] - 2.0F) * arg0[1] + (arg0[0] - 2.0F + arg0[1]) * arg0[0] + 1.0F;
            if (field1562 + var1 > 0.0F) {
                method3446(arg0);
            }
        }
        arg0[1] = 1.0F - arg0[1];
    }

    @ObfuscatedName("ao.af(FFFFLfr;I)V")
    public static void method269(float arg0, float arg1, float arg2, float arg3, class138 arg4) {
        float var5 = arg1 - arg0;
        float var6 = arg2 - arg1;
        float var7 = arg3 - arg2;
        float var8 = var6 - var5;
        arg4.field1615 = var7 - var6 - var8;
        arg4.field1614 = var8 + var8 + var8;
        arg4.field1613 = var5 + var5 + var5;
        arg4.field1624 = arg0;
    }

    @ObfuscatedName("fc.at(FFFFLfr;S)V")
    public static void method3264(float arg0, float arg1, float arg2, float arg3, class138 arg4) {
        float var5 = arg1 - arg0;
        float var6 = arg2 - arg1;
        float var7 = arg3 - arg2;
        float var8 = var6 - var5;
        arg4.field1625 = var7 - var6 - var8;
        arg4.field1609 = var8 + var8 + var8;
        arg4.field1617 = var5 + var5 + var5;
        arg4.field1616 = arg0;
    }
}

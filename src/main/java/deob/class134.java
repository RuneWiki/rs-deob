package deob;

@ObfuscatedName("fj")
public class class134 {

    @ObfuscatedName("fj.aj")
    public static final float field1548 = Math.ulp(1.0F);

    @ObfuscatedName("fj.ai")
    public static final float field1553 = field1548 * 2.0F;

    public class134() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("jo.ap(Lfv;FI)F")
    public static float method4947(class138 arg0, float arg1) {
        if (arg0 == null || arg0.method3311() == 0) {
            return 0.0F;
        } else if (arg1 < (float) arg0.field1597[0].field1539) {
            return class136.field1577 == arg0.field1606 ? arg0.field1597[0].field1542 : method5447(arg0, arg1, true);
        } else if (arg1 > (float) arg0.field1597[arg0.method3311() - 1].field1539) {
            return class136.field1577 == arg0.field1596 ? arg0.field1597[arg0.method3311() - 1].field1542 : method5447(arg0, arg1, false);
        } else if (arg0.field1594) {
            return arg0.field1597[0].field1542;
        } else {
            class133 var2 = arg0.method3322(arg1);
            boolean var3 = false;
            boolean var4 = false;
            if (var2 == null) {
                return 0.0F;
            }
            if (var2.field1544 == 0.0F && var2.field1538 == 0.0F) {
                var3 = true;
            } else if (var2.field1544 == Float.MAX_VALUE && var2.field1538 == Float.MAX_VALUE) {
                var4 = true;
            } else if (var2.field1540 == null) {
                var3 = true;
            } else if (arg0.field1609) {
                float var5 = (float) var2.field1539;
                float var6 = var2.field1542;
                float var7 = var2.field1544 * 0.33333334F + var5;
                float var8 = var2.field1538 * 0.33333334F + var6;
                float var9 = (float) var2.field1540.field1539;
                float var10 = var2.field1540.field1542;
                float var11 = var9 - var2.field1540.field1543 * 0.33333334F;
                float var12 = var10 - var2.field1540.field1541 * 0.33333334F;
                if (arg0.field1600) {
                    method5238(arg0, var5, var7, var11, var9, var6, var8, var12, var10);
                } else {
                    method2936(arg0, var5, var7, var11, var9, var6, var8, var12, var10);
                }
                arg0.field1609 = false;
            }
            if (var3) {
                return var2.field1542;
            } else if (var4) {
                return (float) var2.field1539 == arg1 || var2.field1540 == null ? var2.field1542 : var2.field1540.field1542;
            } else if (arg0.field1600) {
                return method328(arg0, arg1);
            } else {
                float var13;
                if (arg0 == null) {
                    var13 = 0.0F;
                } else {
                    float var14 = arg1 - arg0.field1599;
                    var13 = ((arg0.field1601 * var14 + arg0.field1602) * var14 + arg0.field1593) * var14 + arg0.field1604;
                }
                return var13;
            }
        }
    }

    @ObfuscatedName("al.aw(Lfv;FB)F")
    public static float method328(class138 arg0, float arg1) {
        if (arg0 == null) {
            return 0.0F;
        }
        float var2;
        if (arg0.field1599 == arg1) {
            var2 = 0.0F;
        } else if (arg0.field1612 == arg1) {
            var2 = 1.0F;
        } else {
            var2 = (arg1 - arg0.field1599) / (arg0.field1612 - arg0.field1599);
        }
        float var3;
        if (arg0.field1598) {
            var3 = var2;
        } else {
            float[] var4 = new float[] { arg0.field1601 - var2, arg0.field1602, arg0.field1593, arg0.field1604 };
            float[] var5 = new float[5];
            int var6 = class431.method4596(var4, 3, 0.0F, true, 1.0F, true, var5);
            if (var6 == 1) {
                var3 = var5[0];
            } else {
                var3 = 0.0F;
            }
        }
        return ((arg0.field1595 * var3 + arg0.field1607) * var3 + arg0.field1608) * var3 + arg0.field1605;
    }

    @ObfuscatedName("kw.ak(Lfv;FZI)F")
    public static float method5447(class138 arg0, float arg1, boolean arg2) {
        float var3 = 0.0F;
        if (arg0 == null || arg0.method3311() == 0) {
            return var3;
        }
        float var4 = (float) arg0.field1597[0].field1539;
        float var5 = (float) arg0.field1597[arg0.method3311() - 1].field1539;
        float var6 = var5 - var4;
        if (var6 == 0.0F) {
            return arg0.field1597[0].field1542;
        }
        float var7 = 0.0F;
        float var8;
        if (arg1 > var5) {
            var8 = (arg1 - var5) / var6;
        } else {
            var8 = (arg1 - var4) / var6;
        }
        float var9 = (float) ((int) var8);
        float var10 = Math.abs(var8 - var9);
        float var11 = var6 * var10;
        float var12 = Math.abs(var9 + 1.0F);
        float var13 = var12 / 2.0F;
        float var14 = (float) ((int) var13);
        float var15 = var13 - var14;
        if (arg2) {
            if (class136.field1581 == arg0.field1606) {
                if (var15 == 0.0F) {
                    var11 = var5 - var11;
                } else {
                    var11 += var4;
                }
            } else if (class136.field1584 == arg0.field1606 || class136.field1580 == arg0.field1606) {
                var11 = var5 - var11;
            } else if (class136.field1578 == arg0.field1606) {
                float var16 = var4 - arg1;
                float var17 = arg0.field1597[0].field1543;
                float var18 = arg0.field1597[0].field1541;
                float var19 = arg0.field1597[0].field1542;
                if (var17 != 0.0F) {
                    var19 -= var16 * var18 / var17;
                }
                return var19;
            }
        } else if (class136.field1581 == arg0.field1596) {
            if (var15 == 0.0F) {
                var11 += var4;
            } else {
                var11 = var5 - var11;
            }
        } else if (class136.field1584 == arg0.field1596 || class136.field1580 == arg0.field1596) {
            var11 += var4;
        } else if (class136.field1578 == arg0.field1596) {
            float var20 = arg1 - var5;
            float var21 = arg0.field1597[arg0.method3311() - 1].field1544;
            float var22 = arg0.field1597[arg0.method3311() - 1].field1538;
            float var23 = arg0.field1597[arg0.method3311() - 1].field1542;
            if (var21 != 0.0F) {
                var23 += var20 * var22 / var21;
            }
            return var23;
        }
        float var24 = method4947(arg0, var11);
        if (arg2 && class136.field1580 == arg0.field1606) {
            float var25 = arg0.field1597[arg0.method3311() - 1].field1542 - arg0.field1597[0].field1542;
            var24 -= var12 * var25;
        } else if (!arg2 && class136.field1580 == arg0.field1596) {
            float var26 = arg0.field1597[arg0.method3311() - 1].field1542 - arg0.field1597[0].field1542;
            var24 += var12 * var26;
        }
        return var24;
    }

    @ObfuscatedName("km.aj(Lfv;FFFFFFFFB)V")
    public static void method5238(class138 arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8) {
        if (arg0 == null) {
            return;
        }
        float var9 = arg4 - arg1;
        if (var9 == 0.0F) {
            return;
        }
        float var10 = arg2 - arg1;
        float var11 = arg3 - arg1;
        float[] var12 = new float[] { var10 / var9, var11 / var9 };
        arg0.field1598 = var12[0] == 0.33333334F && var12[1] == 0.6666667F;
        float var13 = var12[0];
        float var14 = var12[1];
        if (var12[0] < 0.0F) {
            var12[0] = 0.0F;
        }
        if (var12[1] > 1.0F) {
            var12[1] = 1.0F;
        }
        if (var12[0] > 1.0F || var12[1] < -1.0F) {
            method4597(var12);
        }
        if (var12[0] != var13) {
            float var15 = var12[0] * var9 + arg1;
            if (var13 != 0.0F) {
                arg6 = (arg6 - arg5) * var12[0] / var13 + arg5;
            }
        }
        if (var12[1] != var14) {
            float var16 = var12[1] * var9 + arg1;
            if (var14 != 1.0F) {
                arg7 = arg8 - (1.0F - var12[1]) * (arg8 - arg7) / (1.0F - var14);
            }
        }
        arg0.field1599 = arg1;
        arg0.field1612 = arg4;
        float var17 = var12[0];
        float var18 = var12[1];
        float var19 = var17 - 0.0F;
        float var20 = var18 - var17;
        float var21 = 1.0F - var18;
        float var22 = var20 - var19;
        arg0.field1604 = var21 - var20 - var22;
        arg0.field1593 = var22 + var22 + var22;
        arg0.field1602 = var19 + var19 + var19;
        arg0.field1601 = 0.0F;
        method3191(arg5, arg6, arg7, arg8, arg0);
    }

    @ObfuscatedName("ec.ai(Lfv;FFFFFFFFI)V")
    public static void method2936(class138 arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8) {
        if (arg0 == null) {
            return;
        }
        arg0.field1599 = arg1;
        float var9 = arg4 - arg1;
        float var10 = arg8 - arg5;
        float var11 = arg2 - arg1;
        float var12 = 0.0F;
        float var13 = 0.0F;
        if (var11 != 0.0F) {
            var12 = (arg6 - arg5) / var11;
        }
        float var14 = arg4 - arg3;
        if (var14 != 0.0F) {
            var13 = (arg8 - arg7) / var14;
        }
        float var15 = 1.0F / (var9 * var9);
        float var16 = var9 * var12;
        float var17 = var9 * var13;
        arg0.field1601 = (var16 + var17 - var10 - var10) * var15 / var9;
        arg0.field1602 = (var10 + var10 + var10 - var16 - var16 - var17) * var15;
        arg0.field1593 = var12;
        arg0.field1604 = arg5;
    }

    @ObfuscatedName("ac.ay([FI)V")
    public static void method279(float[] arg0) {
        if (arg0[0] + field1548 >= 1.3333334F) {
            arg0[0] = 1.3333334F - field1548;
            arg0[1] = 0.33333334F - field1548;
            return;
        }
        float var1 = arg0[0] - 2.0F;
        float var2 = arg0[0] - 1.0F;
        float var3 = (float) Math.sqrt((double) (var1 * var1 - var2 * 4.0F * var2));
        float var4 = (-var1 + var3) * 0.5F;
        if (arg0[1] + field1548 > var4) {
            arg0[1] = var4 - field1548;
        } else {
            float var5 = (-var1 - var3) * 0.5F;
            if (arg0[1] < field1548 + var5) {
                arg0[1] = field1548 + var5;
            }
        }
    }

    @ObfuscatedName("jq.as([FI)V")
    public static void method4597(float[] arg0) {
        arg0[1] = 1.0F - arg0[1];
        if (arg0[0] < 0.0F) {
            arg0[0] = 0.0F;
        }
        if (arg0[1] < 0.0F) {
            arg0[1] = 0.0F;
        }
        if (arg0[0] > 1.0F || arg0[1] > 1.0F) {
            float var1 = (arg0[1] - 2.0F) * arg0[1] + (arg0[0] - 2.0F + arg0[1]) * arg0[0] + 1.0F;
            if (field1548 + var1 > 0.0F) {
                method279(arg0);
            }
        }
        arg0[1] = 1.0F - arg0[1];
    }

    @ObfuscatedName("ee.ae(FFFFLfv;I)V")
    public static void method3191(float arg0, float arg1, float arg2, float arg3, class138 arg4) {
        float var5 = arg1 - arg0;
        float var6 = arg2 - arg1;
        float var7 = arg3 - arg2;
        float var8 = var6 - var5;
        arg4.field1595 = var7 - var6 - var8;
        arg4.field1607 = var8 + var8 + var8;
        arg4.field1608 = var5 + var5 + var5;
        arg4.field1605 = arg0;
    }
}

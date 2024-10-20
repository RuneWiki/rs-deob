package deob;

@ObfuscatedName("si")
public class class469 {

    @ObfuscatedName("si.am")
    public float[] field4827;

    @ObfuscatedName("si.ap")
    public int field4826;

    public class469(float[] arg0, int arg1) {
        this.field4827 = arg0;
        this.field4826 = arg1;
    }

    @ObfuscatedName("qo.am([FIFZFZ[FB)I")
    public static int method7372(float[] arg0, int arg1, float arg2, boolean arg3, float arg4, boolean arg5, float[] arg6) {
        float var7 = 0.0F;
        for (int var8 = 0; var8 < arg1 + 1; var8++) {
            var7 += Math.abs(arg0[var8]);
        }
        float var9 = (Math.abs(arg2) + Math.abs(arg4)) * (float) (arg1 + 1) * class128.field1488;
        if (var7 <= var9) {
            return -1;
        }
        float[] var10 = new float[arg1 + 1];
        for (int var11 = 0; var11 < arg1 + 1; var11++) {
            var10[var11] = 1.0F / var7 * arg0[var11];
        }
        while (Math.abs(var10[arg1]) < var9) {
            arg1--;
        }
        int var12 = 0;
        if (arg1 == 0) {
            return var12;
        } else if (arg1 == 1) {
            arg6[0] = -var10[0] / var10[1];
            boolean var13 = arg3 ? arg2 < arg6[0] + var9 : arg2 < arg6[0] - var9;
            boolean var14 = arg5 ? arg4 > arg6[0] - var9 : arg4 > arg6[0] + var9;
            int var15 = var13 && var14 ? 1 : 0;
            if (var15 > 0) {
                if (arg3 && arg6[0] < arg2) {
                    arg6[0] = arg2;
                } else if (arg5 && arg6[0] > arg4) {
                    arg6[0] = arg4;
                }
            }
            return var15;
        } else {
            class469 var16 = new class469(var10, arg1);
            float[] var17 = new float[arg1 + 1];
            for (int var18 = 1; var18 <= arg1; var18++) {
                var17[var18 - 1] = var10[var18] * (float) var18;
            }
            float[] var19 = new float[arg1 + 1];
            int var20 = method7372(var17, arg1 - 1, arg2, false, arg4, false, var19);
            if (var20 == -1) {
                return 0;
            }
            boolean var21 = false;
            float var22 = 0.0F;
            float var23 = 0.0F;
            float var24 = 0.0F;
            for (int var25 = 0; var25 <= var20; var25++) {
                if (var12 > arg1) {
                    return var12;
                }
                float var26;
                float var27;
                if (var25 == 0) {
                    var26 = arg2;
                    var27 = method2429(var10, arg1, arg2);
                    if (Math.abs(var27) <= var9 && arg3) {
                        arg6[var12++] = arg2;
                    }
                } else {
                    var26 = var24;
                    var27 = var22;
                }
                if (var20 == var25) {
                    var24 = arg4;
                    var21 = false;
                } else {
                    var24 = var19[var25];
                }
                var22 = method2429(var10, arg1, var24);
                if (var21) {
                    var21 = false;
                } else if (Math.abs(var22) < var9) {
                    if (var20 != var25 || arg5) {
                        arg6[var12++] = var24;
                        var21 = true;
                    }
                } else if (var27 < 0.0F && var22 > 0.0F || var27 > 0.0F && var22 < 0.0F) {
                    int var29 = var12++;
                    float var30 = var26;
                    float var31 = var24;
                    float var32 = method2429(var16.field4827, var16.field4826, var26);
                    float var33;
                    if (Math.abs(var32) < class128.field1488) {
                        var33 = var26;
                    } else {
                        float var34 = method2429(var16.field4827, var16.field4826, var24);
                        if (Math.abs(var34) < class128.field1488) {
                            var33 = var24;
                        } else {
                            float var35 = 0.0F;
                            float var36 = 0.0F;
                            float var37 = 0.0F;
                            float var38 = 0.0F;
                            boolean var39 = true;
                            boolean var40 = false;
                            boolean var41;
                            do {
                                var41 = false;
                                if (var39) {
                                    var35 = var30;
                                    var38 = var32;
                                    var36 = var31 - var30;
                                    var37 = var36;
                                    var39 = false;
                                }
                                if (Math.abs(var38) < Math.abs(var34)) {
                                    var30 = var31;
                                    var31 = var35;
                                    var35 = var30;
                                    var32 = var34;
                                    var34 = var38;
                                    var38 = var32;
                                }
                                float var42 = class128.field1491 * Math.abs(var31) + 0.0F;
                                float var43 = (var35 - var31) * 0.5F;
                                boolean var44 = Math.abs(var43) > var42 && var34 != 0.0F;
                                if (var44) {
                                    if ((Math.abs(var37) < var42) || (Math.abs(var32) <= Math.abs(var34))) {
                                        var36 = var43;
                                        var37 = var43;
                                    } else {
                                        float var45 = var34 / var32;
                                        float var46;
                                        float var47;
                                        if (var30 == var35) {
                                            var46 = var43 * 2.0F * var45;
                                            var47 = 1.0F - var45;
                                        } else {
                                            float var48 = var32 / var38;
                                            float var49 = var34 / var38;
                                            var46 = (var43 * 2.0F * var48 * (var48 - var49) - (var31 - var30) * (var49 - 1.0F)) * var45;
                                            var47 = (var48 - 1.0F) * (var49 - 1.0F) * (var45 - 1.0F);
                                        }
                                        if ((double) var46 > 0.0D) {
                                            var47 = -var47;
                                        } else {
                                            var46 = -var46;
                                        }
                                        float var50 = var37;
                                        var37 = var36;
                                        if (var46 * 2.0F < var43 * 3.0F * var47 - Math.abs(var42 * var47) && var46 < Math.abs(var50 * 0.5F * var47)) {
                                            var36 = var46 / var47;
                                        } else {
                                            var36 = var43;
                                            var37 = var43;
                                        }
                                    }
                                    var30 = var31;
                                    var32 = var34;
                                    if (Math.abs(var36) > var42) {
                                        var31 += var36;
                                    } else if ((double) var43 > 0.0D) {
                                        var31 += var42;
                                    } else {
                                        var31 -= var42;
                                    }
                                    var34 = method2429(var16.field4827, var16.field4826, var31);
                                    if ((double) (var34 * (var38 / Math.abs(var38))) > 0.0D) {
                                        var39 = true;
                                        var41 = true;
                                    } else {
                                        var41 = true;
                                    }
                                }
                            } while (var41);
                            var33 = var31;
                        }
                    }
                    arg6[var29] = var33;
                    if (var12 > 1 && arg6[var12 - 2] >= arg6[var12 - 1] - var9) {
                        arg6[var12 - 2] = (arg6[var12 - 1] + arg6[var12 - 2]) * 0.5F;
                        var12--;
                    }
                }
            }
            return var12;
        }
    }

    @ObfuscatedName("dx.ap([FIFI)F")
    public static float method2429(float[] arg0, int arg1, float arg2) {
        float var3 = arg0[arg1];
        for (int var4 = arg1 - 1; var4 >= 0; var4--) {
            var3 = arg2 * var3 + arg0[var4];
        }
        return var3;
    }
}

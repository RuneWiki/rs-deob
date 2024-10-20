package deob;

@ObfuscatedName("kx")
public class class284 extends class269 {

    public class284(class285 arg0) {
        super(arg0);
    }

    @ObfuscatedName("kx.au(IIIIIIFFFIII)V")
    public void method4761(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11) {
        int var13 = arg4 - arg3;
        int var14 = arg1 - arg0;
        int var15 = arg5 - arg3;
        int var16 = arg2 - arg0;
        int var17 = arg10 - arg9;
        int var18 = arg11 - arg9;
        int var19;
        if (arg1 == arg2) {
            var19 = 0;
        } else {
            var19 = (arg5 - arg4 << 14) / (arg2 - arg1);
        }
        int var20;
        if (arg0 == arg1) {
            var20 = 0;
        } else {
            var20 = (var13 << 14) / var14;
        }
        int var21;
        if (arg0 == arg2) {
            var21 = 0;
        } else {
            var21 = (var15 << 14) / var16;
        }
        int var22 = var13 * var16 - var14 * var15;
        if (var22 == 0) {
            return;
        }
        int var23 = (var16 * var17 - var14 * var18 << 8) / var22;
        int var24 = (var13 * var18 - var15 * var17 << 8) / var22;
        int[] var25 = this.field2789.field3048;
        int var26 = this.field2789.field3040;
        if (arg0 <= arg1 && arg0 <= arg2) {
            if (arg0 < var26) {
                if (arg1 > var26) {
                    arg1 = var26;
                }
                if (arg2 > var26) {
                    arg2 = var26;
                }
                int var27 = (arg9 << 8) - arg3 * var23 + var23;
                if (arg1 < arg2) {
                    int var28;
                    int var29 = var28 = arg3 << 14;
                    if (arg0 < 0) {
                        var29 -= arg0 * var21;
                        var28 -= arg0 * var20;
                        var27 -= arg0 * var24;
                        arg0 = 0;
                    }
                    int var30 = arg4 << 14;
                    if (arg1 < 0) {
                        var30 -= arg1 * var19;
                        arg1 = 0;
                    }
                    if ((arg0 == arg1 || var21 >= var20) && (arg0 != arg1 || var21 <= var19)) {
                        int var34 = arg2 - arg1;
                        int var35 = arg1 - arg0;
                        int var36 = var25[arg0];
                        while (true) {
                            var35--;
                            if (var35 < 0) {
                                while (true) {
                                    var34--;
                                    if (var34 < 0) {
                                        return;
                                    }
                                    this.method5168(Statics.field5215, var36, 0, 0, var30 >> 14, var29 >> 14, var27, var23);
                                    var29 += var21;
                                    var30 += var19;
                                    var27 += var24;
                                    var36 += Statics.field5208;
                                }
                            }
                            this.method5168(Statics.field5215, var36, 0, 0, var28 >> 14, var29 >> 14, var27, var23);
                            var29 += var21;
                            var28 += var20;
                            var27 += var24;
                            var36 += Statics.field5208;
                        }
                    } else {
                        int var31 = arg2 - arg1;
                        int var32 = arg1 - arg0;
                        int var33 = var25[arg0];
                        while (true) {
                            var32--;
                            if (var32 < 0) {
                                while (true) {
                                    var31--;
                                    if (var31 < 0) {
                                        return;
                                    }
                                    this.method5168(Statics.field5215, var33, 0, 0, var29 >> 14, var30 >> 14, var27, var23);
                                    var29 += var21;
                                    var30 += var19;
                                    var27 += var24;
                                    var33 += Statics.field5208;
                                }
                            }
                            this.method5168(Statics.field5215, var33, 0, 0, var29 >> 14, var28 >> 14, var27, var23);
                            var29 += var21;
                            var28 += var20;
                            var27 += var24;
                            var33 += Statics.field5208;
                        }
                    }
                } else {
                    int var37;
                    int var38 = var37 = arg3 << 14;
                    if (arg0 < 0) {
                        var38 -= arg0 * var21;
                        var37 -= arg0 * var20;
                        var27 -= arg0 * var24;
                        arg0 = 0;
                    }
                    int var39 = arg5 << 14;
                    if (arg2 < 0) {
                        var39 -= arg2 * var19;
                        arg2 = 0;
                    }
                    if (arg0 != arg2 && var21 < var20 || arg0 == arg2 && var19 > var20) {
                        int var40 = arg1 - arg2;
                        int var41 = arg2 - arg0;
                        int var42 = var25[arg0];
                        while (true) {
                            var41--;
                            if (var41 < 0) {
                                while (true) {
                                    var40--;
                                    if (var40 < 0) {
                                        return;
                                    }
                                    this.method5168(Statics.field5215, var42, 0, 0, var39 >> 14, var37 >> 14, var27, var23);
                                    var39 += var19;
                                    var37 += var20;
                                    var27 += var24;
                                    var42 += Statics.field5208;
                                }
                            }
                            this.method5168(Statics.field5215, var42, 0, 0, var38 >> 14, var37 >> 14, var27, var23);
                            var38 += var21;
                            var37 += var20;
                            var27 += var24;
                            var42 += Statics.field5208;
                        }
                    } else {
                        int var43 = arg1 - arg2;
                        int var44 = arg2 - arg0;
                        int var45 = var25[arg0];
                        while (true) {
                            var44--;
                            if (var44 < 0) {
                                while (true) {
                                    var43--;
                                    if (var43 < 0) {
                                        return;
                                    }
                                    this.method5168(Statics.field5215, var45, 0, 0, var37 >> 14, var39 >> 14, var27, var23);
                                    var39 += var19;
                                    var37 += var20;
                                    var27 += var24;
                                    var45 += Statics.field5208;
                                }
                            }
                            this.method5168(Statics.field5215, var45, 0, 0, var37 >> 14, var38 >> 14, var27, var23);
                            var38 += var21;
                            var37 += var20;
                            var27 += var24;
                            var45 += Statics.field5208;
                        }
                    }
                }
            }
        } else if (arg1 <= arg2) {
            if (arg1 < var26) {
                if (arg2 > var26) {
                    arg2 = var26;
                }
                if (arg0 > var26) {
                    arg0 = var26;
                }
                int var46 = (arg10 << 8) - arg4 * var23 + var23;
                if (arg2 < arg0) {
                    int var47;
                    int var48 = var47 = arg4 << 14;
                    if (arg1 < 0) {
                        var48 -= arg1 * var20;
                        var47 -= arg1 * var19;
                        var46 -= arg1 * var24;
                        arg1 = 0;
                    }
                    int var49 = arg5 << 14;
                    if (arg2 < 0) {
                        var49 -= arg2 * var21;
                        arg2 = 0;
                    }
                    if ((arg1 == arg2 || var20 >= var19) && (arg1 != arg2 || var20 <= var21)) {
                        int var53 = arg0 - arg2;
                        int var54 = arg2 - arg1;
                        int var55 = var25[arg1];
                        while (true) {
                            var54--;
                            if (var54 < 0) {
                                while (true) {
                                    var53--;
                                    if (var53 < 0) {
                                        return;
                                    }
                                    this.method5168(Statics.field5215, var55, 0, 0, var49 >> 14, var48 >> 14, var46, var23);
                                    var48 += var20;
                                    var49 += var21;
                                    var46 += var24;
                                    var55 += Statics.field5208;
                                }
                            }
                            this.method5168(Statics.field5215, var55, 0, 0, var47 >> 14, var48 >> 14, var46, var23);
                            var48 += var20;
                            var47 += var19;
                            var46 += var24;
                            var55 += Statics.field5208;
                        }
                    } else {
                        int var50 = arg0 - arg2;
                        int var51 = arg2 - arg1;
                        int var52 = var25[arg1];
                        while (true) {
                            var51--;
                            if (var51 < 0) {
                                while (true) {
                                    var50--;
                                    if (var50 < 0) {
                                        return;
                                    }
                                    this.method5168(Statics.field5215, var52, 0, 0, var48 >> 14, var49 >> 14, var46, var23);
                                    var48 += var20;
                                    var49 += var21;
                                    var46 += var24;
                                    var52 += Statics.field5208;
                                }
                            }
                            this.method5168(Statics.field5215, var52, 0, 0, var48 >> 14, var47 >> 14, var46, var23);
                            var48 += var20;
                            var47 += var19;
                            var46 += var24;
                            var52 += Statics.field5208;
                        }
                    }
                } else {
                    int var56;
                    int var57 = var56 = arg4 << 14;
                    if (arg1 < 0) {
                        var57 -= arg1 * var20;
                        var56 -= arg1 * var19;
                        var46 -= arg1 * var24;
                        arg1 = 0;
                    }
                    int var58 = arg3 << 14;
                    if (arg0 < 0) {
                        var58 -= arg0 * var21;
                        arg0 = 0;
                    }
                    if (var20 < var19) {
                        int var59 = arg2 - arg0;
                        int var60 = arg0 - arg1;
                        int var61 = var25[arg1];
                        while (true) {
                            var60--;
                            if (var60 < 0) {
                                while (true) {
                                    var59--;
                                    if (var59 < 0) {
                                        return;
                                    }
                                    this.method5168(Statics.field5215, var61, 0, 0, var58 >> 14, var56 >> 14, var46, var23);
                                    var58 += var21;
                                    var56 += var19;
                                    var46 += var24;
                                    var61 += Statics.field5208;
                                }
                            }
                            this.method5168(Statics.field5215, var61, 0, 0, var57 >> 14, var56 >> 14, var46, var23);
                            var57 += var20;
                            var56 += var19;
                            var46 += var24;
                            var61 += Statics.field5208;
                        }
                    } else {
                        int var62 = arg2 - arg0;
                        int var63 = arg0 - arg1;
                        int var64 = var25[arg1];
                        while (true) {
                            var63--;
                            if (var63 < 0) {
                                while (true) {
                                    var62--;
                                    if (var62 < 0) {
                                        return;
                                    }
                                    this.method5168(Statics.field5215, var64, 0, 0, var56 >> 14, var58 >> 14, var46, var23);
                                    var58 += var21;
                                    var56 += var19;
                                    var46 += var24;
                                    var64 += Statics.field5208;
                                }
                            }
                            this.method5168(Statics.field5215, var64, 0, 0, var56 >> 14, var57 >> 14, var46, var23);
                            var57 += var20;
                            var56 += var19;
                            var46 += var24;
                            var64 += Statics.field5208;
                        }
                    }
                }
            }
        } else if (arg2 < var26) {
            if (arg0 > var26) {
                arg0 = var26;
            }
            if (arg1 > var26) {
                arg1 = var26;
            }
            int var65 = (arg11 << 8) - arg5 * var23 + var23;
            if (arg0 < arg1) {
                int var66;
                int var67 = var66 = arg5 << 14;
                if (arg2 < 0) {
                    var67 -= arg2 * var19;
                    var66 -= arg2 * var21;
                    var65 -= arg2 * var24;
                    arg2 = 0;
                }
                int var68 = arg3 << 14;
                if (arg0 < 0) {
                    var68 -= arg0 * var20;
                    arg0 = 0;
                }
                if (var19 < var21) {
                    int var69 = arg1 - arg0;
                    int var70 = arg0 - arg2;
                    int var71 = var25[arg2];
                    while (true) {
                        var70--;
                        if (var70 < 0) {
                            while (true) {
                                var69--;
                                if (var69 < 0) {
                                    return;
                                }
                                this.method5168(Statics.field5215, var71, 0, 0, var67 >> 14, var68 >> 14, var65, var23);
                                var67 += var19;
                                var68 += var20;
                                var65 += var24;
                                var71 += Statics.field5208;
                            }
                        }
                        this.method5168(Statics.field5215, var71, 0, 0, var67 >> 14, var66 >> 14, var65, var23);
                        var67 += var19;
                        var66 += var21;
                        var65 += var24;
                        var71 += Statics.field5208;
                    }
                } else {
                    int var72 = arg1 - arg0;
                    int var73 = arg0 - arg2;
                    int var74 = var25[arg2];
                    while (true) {
                        var73--;
                        if (var73 < 0) {
                            while (true) {
                                var72--;
                                if (var72 < 0) {
                                    return;
                                }
                                this.method5168(Statics.field5215, var74, 0, 0, var68 >> 14, var67 >> 14, var65, var23);
                                var67 += var19;
                                var68 += var20;
                                var65 += var24;
                                var74 += Statics.field5208;
                            }
                        }
                        this.method5168(Statics.field5215, var74, 0, 0, var66 >> 14, var67 >> 14, var65, var23);
                        var67 += var19;
                        var66 += var21;
                        var65 += var24;
                        var74 += Statics.field5208;
                    }
                }
            } else {
                int var75;
                int var76 = var75 = arg5 << 14;
                if (arg2 < 0) {
                    var76 -= arg2 * var19;
                    var75 -= arg2 * var21;
                    var65 -= arg2 * var24;
                    arg2 = 0;
                }
                int var77 = arg4 << 14;
                if (arg1 < 0) {
                    var77 -= arg1 * var20;
                    arg1 = 0;
                }
                if (var19 < var21) {
                    int var78 = arg0 - arg1;
                    int var79 = arg1 - arg2;
                    int var80 = var25[arg2];
                    while (true) {
                        var79--;
                        if (var79 < 0) {
                            while (true) {
                                var78--;
                                if (var78 < 0) {
                                    return;
                                }
                                this.method5168(Statics.field5215, var80, 0, 0, var77 >> 14, var75 >> 14, var65, var23);
                                var77 += var20;
                                var75 += var21;
                                var65 += var24;
                                var80 += Statics.field5208;
                            }
                        }
                        this.method5168(Statics.field5215, var80, 0, 0, var76 >> 14, var75 >> 14, var65, var23);
                        var76 += var19;
                        var75 += var21;
                        var65 += var24;
                        var80 += Statics.field5208;
                    }
                } else {
                    int var81 = arg0 - arg1;
                    int var82 = arg1 - arg2;
                    int var83 = var25[arg2];
                    while (true) {
                        var82--;
                        if (var82 < 0) {
                            while (true) {
                                var81--;
                                if (var81 < 0) {
                                    return;
                                }
                                this.method5168(Statics.field5215, var83, 0, 0, var75 >> 14, var77 >> 14, var65, var23);
                                var77 += var20;
                                var75 += var21;
                                var65 += var24;
                                var83 += Statics.field5208;
                            }
                        }
                        this.method5168(Statics.field5215, var83, 0, 0, var75 >> 14, var76 >> 14, var65, var23);
                        var76 += var19;
                        var75 += var21;
                        var65 += var24;
                        var83 += Statics.field5208;
                    }
                }
            }
        }
    }

    @ObfuscatedName("kx.bv([IIIIIIII)V")
    public final void method5168(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (this.field2789.field3037) {
            if (arg5 > this.field2789.field3051) {
                arg5 = this.field2789.field3051;
            }
            if (arg4 < 0) {
                arg4 = 0;
            }
        }
        if (arg4 >= arg5) {
            return;
        }
        int var9 = arg1 + arg4;
        int var10 = arg4 * arg7 + arg6;
        if (!this.field2789.field3039) {
            int var32 = arg5 - arg4;
            if (this.field2789.field3052 == 0) {
                do {
                    int var33 = (var10 & (var10 >> 31 & 0x1) - 1) >> 8;
                    arg0[var9++] = this.field2787[var33];
                    var10 += arg7;
                    var32--;
                } while (var32 > 0);
            } else {
                int var34 = this.field2789.field3052;
                int var35 = 256 - this.field2789.field3052;
                do {
                    int var36 = (var10 & (var10 >> 31 & 0x1) - 1) >> 8;
                    int var37 = this.field2787[var36];
                    var10 += arg7;
                    int var38 = ((var37 & 0xFF00FF) * var35 >> 8 & 0xFF00FF) + ((var37 & 0xFF00) * var35 >> 8 & 0xFF00);
                    int var39 = arg0[var9];
                    arg0[var9++] = ((var39 & 0xFF00) * var34 >> 8 & 0xFF00) + ((var39 & 0xFF00FF) * var34 >> 8 & 0xFF00FF) + var38;
                    var32--;
                } while (var32 > 0);
            }
            return;
        }
        int var11 = arg5 - arg4 >> 2;
        int var12 = arg7 << 2;
        if (this.field2789.field3052 == 0) {
            if (var11 > 0) {
                do {
                    int var13 = (var10 & (var10 >> 31 & 0x1) - 1) >> 8;
                    int var14 = this.field2787[var13];
                    var10 += var12;
                    arg0[var9++] = var14;
                    arg0[var9++] = var14;
                    arg0[var9++] = var14;
                    arg0[var9++] = var14;
                    var11--;
                } while (var11 > 0);
            }
            int var15 = arg5 - arg4 & 0x3;
            if (var15 > 0) {
                int var16 = (var10 & (var10 >> 31 & 0x1) - 1) >> 8;
                int var17 = this.field2787[var16];
                do {
                    arg0[var9++] = var17;
                    var15--;
                } while (var15 > 0);
            }
            return;
        }
        int var18 = this.field2789.field3052;
        int var19 = 256 - this.field2789.field3052;
        if (var11 > 0) {
            do {
                int var20 = (var10 & (var10 >> 31 & 0x1) - 1) >> 8;
                int var21 = this.field2787[var20];
                var10 += var12;
                int var22 = ((var21 & 0xFF00FF) * var19 >> 8 & 0xFF00FF) + ((var21 & 0xFF00) * var19 >> 8 & 0xFF00);
                int var23 = arg0[var9];
                arg0[var9++] = ((var23 & 0xFF00) * var18 >> 8 & 0xFF00) + ((var23 & 0xFF00FF) * var18 >> 8 & 0xFF00FF) + var22;
                int var24 = arg0[var9];
                arg0[var9++] = ((var24 & 0xFF00) * var18 >> 8 & 0xFF00) + ((var24 & 0xFF00FF) * var18 >> 8 & 0xFF00FF) + var22;
                int var25 = arg0[var9];
                arg0[var9++] = ((var25 & 0xFF00) * var18 >> 8 & 0xFF00) + ((var25 & 0xFF00FF) * var18 >> 8 & 0xFF00FF) + var22;
                int var26 = arg0[var9];
                arg0[var9++] = ((var26 & 0xFF00) * var18 >> 8 & 0xFF00) + ((var26 & 0xFF00FF) * var18 >> 8 & 0xFF00FF) + var22;
                var11--;
            } while (var11 > 0);
        }
        int var27 = arg5 - arg4 & 0x3;
        if (var27 <= 0) {
            return;
        }
        int var28 = (var10 & (var10 >> 31 & 0x1) - 1) >> 8;
        int var29 = this.field2787[var28];
        int var30 = ((var29 & 0xFF00FF) * var19 >> 8 & 0xFF00FF) + ((var29 & 0xFF00) * var19 >> 8 & 0xFF00);
        do {
            int var31 = arg0[var9];
            arg0[var9++] = ((var31 & 0xFF00) * var18 >> 8 & 0xFF00) + ((var31 & 0xFF00FF) * var18 >> 8 & 0xFF00FF) + var30;
            var27--;
        } while (var27 > 0);
    }

    @ObfuscatedName("kx.aa(IIIIIIFFFI)V")
    public void method4763(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9) {
        int var11 = 0;
        if (arg0 != arg1) {
            var11 = (arg4 - arg3 << 14) / (arg1 - arg0);
        }
        int var12 = 0;
        if (arg1 != arg2) {
            var12 = (arg5 - arg4 << 14) / (arg2 - arg1);
        }
        int var13 = 0;
        if (arg0 != arg2) {
            var13 = (arg3 - arg5 << 14) / (arg0 - arg2);
        }
        int[] var14 = this.field2789.field3048;
        int var15 = this.field2789.field3040;
        if (arg0 <= arg1 && arg0 <= arg2) {
            if (arg0 < var15) {
                if (arg1 > var15) {
                    arg1 = var15;
                }
                if (arg2 > var15) {
                    arg2 = var15;
                }
                if (arg1 < arg2) {
                    int var16;
                    int var17 = var16 = arg3 << 14;
                    if (arg0 < 0) {
                        var17 -= arg0 * var13;
                        var16 -= arg0 * var11;
                        arg0 = 0;
                    }
                    int var18 = arg4 << 14;
                    if (arg1 < 0) {
                        var18 -= arg1 * var12;
                        arg1 = 0;
                    }
                    if (arg0 != arg1 && var13 < var11 || arg0 == arg1 && var13 > var12) {
                        int var19 = arg2 - arg1;
                        int var20 = arg1 - arg0;
                        int var21 = var14[arg0];
                        while (true) {
                            var20--;
                            if (var20 < 0) {
                                while (true) {
                                    var19--;
                                    if (var19 < 0) {
                                        return;
                                    }
                                    this.method5167(Statics.field5215, var21, arg9, 0, var17 >> 14, var18 >> 14);
                                    var17 += var13;
                                    var18 += var12;
                                    var21 += Statics.field5208;
                                }
                            }
                            this.method5167(Statics.field5215, var21, arg9, 0, var17 >> 14, var16 >> 14);
                            var17 += var13;
                            var16 += var11;
                            var21 += Statics.field5208;
                        }
                    } else {
                        int var22 = arg2 - arg1;
                        int var23 = arg1 - arg0;
                        int var24 = var14[arg0];
                        while (true) {
                            var23--;
                            if (var23 < 0) {
                                while (true) {
                                    var22--;
                                    if (var22 < 0) {
                                        return;
                                    }
                                    this.method5167(Statics.field5215, var24, arg9, 0, var18 >> 14, var17 >> 14);
                                    var17 += var13;
                                    var18 += var12;
                                    var24 += Statics.field5208;
                                }
                            }
                            this.method5167(Statics.field5215, var24, arg9, 0, var16 >> 14, var17 >> 14);
                            var17 += var13;
                            var16 += var11;
                            var24 += Statics.field5208;
                        }
                    }
                } else {
                    int var25;
                    int var26 = var25 = arg3 << 14;
                    if (arg0 < 0) {
                        var26 -= arg0 * var13;
                        var25 -= arg0 * var11;
                        arg0 = 0;
                    }
                    int var27 = arg5 << 14;
                    if (arg2 < 0) {
                        var27 -= arg2 * var12;
                        arg2 = 0;
                    }
                    if (arg0 != arg2 && var13 < var11 || arg0 == arg2 && var12 > var11) {
                        int var28 = arg1 - arg2;
                        int var29 = arg2 - arg0;
                        int var30 = var14[arg0];
                        while (true) {
                            var29--;
                            if (var29 < 0) {
                                while (true) {
                                    var28--;
                                    if (var28 < 0) {
                                        return;
                                    }
                                    this.method5167(Statics.field5215, var30, arg9, 0, var27 >> 14, var25 >> 14);
                                    var27 += var12;
                                    var25 += var11;
                                    var30 += Statics.field5208;
                                }
                            }
                            this.method5167(Statics.field5215, var30, arg9, 0, var26 >> 14, var25 >> 14);
                            var26 += var13;
                            var25 += var11;
                            var30 += Statics.field5208;
                        }
                    } else {
                        int var31 = arg1 - arg2;
                        int var32 = arg2 - arg0;
                        int var33 = var14[arg0];
                        while (true) {
                            var32--;
                            if (var32 < 0) {
                                while (true) {
                                    var31--;
                                    if (var31 < 0) {
                                        return;
                                    }
                                    this.method5167(Statics.field5215, var33, arg9, 0, var25 >> 14, var27 >> 14);
                                    var27 += var12;
                                    var25 += var11;
                                    var33 += Statics.field5208;
                                }
                            }
                            this.method5167(Statics.field5215, var33, arg9, 0, var25 >> 14, var26 >> 14);
                            var26 += var13;
                            var25 += var11;
                            var33 += Statics.field5208;
                        }
                    }
                }
            }
        } else if (arg1 <= arg2) {
            if (arg1 < var15) {
                if (arg2 > var15) {
                    arg2 = var15;
                }
                if (arg0 > var15) {
                    arg0 = var15;
                }
                if (arg2 < arg0) {
                    int var34;
                    int var35 = var34 = arg4 << 14;
                    if (arg1 < 0) {
                        var35 -= arg1 * var11;
                        var34 -= arg1 * var12;
                        arg1 = 0;
                    }
                    int var36 = arg5 << 14;
                    if (arg2 < 0) {
                        var36 -= arg2 * var13;
                        arg2 = 0;
                    }
                    if (arg1 != arg2 && var11 < var12 || arg1 == arg2 && var11 > var13) {
                        int var37 = arg0 - arg2;
                        int var38 = arg2 - arg1;
                        int var39 = var14[arg1];
                        while (true) {
                            var38--;
                            if (var38 < 0) {
                                while (true) {
                                    var37--;
                                    if (var37 < 0) {
                                        return;
                                    }
                                    this.method5167(Statics.field5215, var39, arg9, 0, var35 >> 14, var36 >> 14);
                                    var35 += var11;
                                    var36 += var13;
                                    var39 += Statics.field5208;
                                }
                            }
                            this.method5167(Statics.field5215, var39, arg9, 0, var35 >> 14, var34 >> 14);
                            var35 += var11;
                            var34 += var12;
                            var39 += Statics.field5208;
                        }
                    } else {
                        int var40 = arg0 - arg2;
                        int var41 = arg2 - arg1;
                        int var42 = var14[arg1];
                        while (true) {
                            var41--;
                            if (var41 < 0) {
                                while (true) {
                                    var40--;
                                    if (var40 < 0) {
                                        return;
                                    }
                                    this.method5167(Statics.field5215, var42, arg9, 0, var36 >> 14, var35 >> 14);
                                    var35 += var11;
                                    var36 += var13;
                                    var42 += Statics.field5208;
                                }
                            }
                            this.method5167(Statics.field5215, var42, arg9, 0, var34 >> 14, var35 >> 14);
                            var35 += var11;
                            var34 += var12;
                            var42 += Statics.field5208;
                        }
                    }
                } else {
                    int var43;
                    int var44 = var43 = arg4 << 14;
                    if (arg1 < 0) {
                        var44 -= arg1 * var11;
                        var43 -= arg1 * var12;
                        arg1 = 0;
                    }
                    int var45 = arg3 << 14;
                    if (arg0 < 0) {
                        var45 -= arg0 * var13;
                        arg0 = 0;
                    }
                    if (var11 < var12) {
                        int var46 = arg2 - arg0;
                        int var47 = arg0 - arg1;
                        int var48 = var14[arg1];
                        while (true) {
                            var47--;
                            if (var47 < 0) {
                                while (true) {
                                    var46--;
                                    if (var46 < 0) {
                                        return;
                                    }
                                    this.method5167(Statics.field5215, var48, arg9, 0, var45 >> 14, var43 >> 14);
                                    var45 += var13;
                                    var43 += var12;
                                    var48 += Statics.field5208;
                                }
                            }
                            this.method5167(Statics.field5215, var48, arg9, 0, var44 >> 14, var43 >> 14);
                            var44 += var11;
                            var43 += var12;
                            var48 += Statics.field5208;
                        }
                    } else {
                        int var49 = arg2 - arg0;
                        int var50 = arg0 - arg1;
                        int var51 = var14[arg1];
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                while (true) {
                                    var49--;
                                    if (var49 < 0) {
                                        return;
                                    }
                                    this.method5167(Statics.field5215, var51, arg9, 0, var43 >> 14, var45 >> 14);
                                    var45 += var13;
                                    var43 += var12;
                                    var51 += Statics.field5208;
                                }
                            }
                            this.method5167(Statics.field5215, var51, arg9, 0, var43 >> 14, var44 >> 14);
                            var44 += var11;
                            var43 += var12;
                            var51 += Statics.field5208;
                        }
                    }
                }
            }
        } else if (arg2 < var15) {
            if (arg0 > var15) {
                arg0 = var15;
            }
            if (arg1 > var15) {
                arg1 = var15;
            }
            if (arg0 < arg1) {
                int var52;
                int var53 = var52 = arg5 << 14;
                if (arg2 < 0) {
                    var53 -= arg2 * var12;
                    var52 -= arg2 * var13;
                    arg2 = 0;
                }
                int var54 = arg3 << 14;
                if (arg0 < 0) {
                    var54 -= arg0 * var11;
                    arg0 = 0;
                }
                if (var12 < var13) {
                    int var55 = arg1 - arg0;
                    int var56 = arg0 - arg2;
                    int var57 = var14[arg2];
                    while (true) {
                        var56--;
                        if (var56 < 0) {
                            while (true) {
                                var55--;
                                if (var55 < 0) {
                                    return;
                                }
                                this.method5167(Statics.field5215, var57, arg9, 0, var53 >> 14, var54 >> 14);
                                var53 += var12;
                                var54 += var11;
                                var57 += Statics.field5208;
                            }
                        }
                        this.method5167(Statics.field5215, var57, arg9, 0, var53 >> 14, var52 >> 14);
                        var53 += var12;
                        var52 += var13;
                        var57 += Statics.field5208;
                    }
                } else {
                    int var58 = arg1 - arg0;
                    int var59 = arg0 - arg2;
                    int var60 = var14[arg2];
                    while (true) {
                        var59--;
                        if (var59 < 0) {
                            while (true) {
                                var58--;
                                if (var58 < 0) {
                                    return;
                                }
                                this.method5167(Statics.field5215, var60, arg9, 0, var54 >> 14, var53 >> 14);
                                var53 += var12;
                                var54 += var11;
                                var60 += Statics.field5208;
                            }
                        }
                        this.method5167(Statics.field5215, var60, arg9, 0, var52 >> 14, var53 >> 14);
                        var53 += var12;
                        var52 += var13;
                        var60 += Statics.field5208;
                    }
                }
            } else {
                int var61;
                int var62 = var61 = arg5 << 14;
                if (arg2 < 0) {
                    var62 -= arg2 * var12;
                    var61 -= arg2 * var13;
                    arg2 = 0;
                }
                int var63 = arg4 << 14;
                if (arg1 < 0) {
                    var63 -= arg1 * var11;
                    arg1 = 0;
                }
                if (var12 < var13) {
                    int var64 = arg0 - arg1;
                    int var65 = arg1 - arg2;
                    int var66 = var14[arg2];
                    while (true) {
                        var65--;
                        if (var65 < 0) {
                            while (true) {
                                var64--;
                                if (var64 < 0) {
                                    return;
                                }
                                this.method5167(Statics.field5215, var66, arg9, 0, var63 >> 14, var61 >> 14);
                                var63 += var11;
                                var61 += var13;
                                var66 += Statics.field5208;
                            }
                        }
                        this.method5167(Statics.field5215, var66, arg9, 0, var62 >> 14, var61 >> 14);
                        var62 += var12;
                        var61 += var13;
                        var66 += Statics.field5208;
                    }
                } else {
                    int var67 = arg0 - arg1;
                    int var68 = arg1 - arg2;
                    int var69 = var14[arg2];
                    while (true) {
                        var68--;
                        if (var68 < 0) {
                            while (true) {
                                var67--;
                                if (var67 < 0) {
                                    return;
                                }
                                this.method5167(Statics.field5215, var69, arg9, 0, var61 >> 14, var63 >> 14);
                                var63 += var11;
                                var61 += var13;
                                var69 += Statics.field5208;
                            }
                        }
                        this.method5167(Statics.field5215, var69, arg9, 0, var61 >> 14, var62 >> 14);
                        var62 += var12;
                        var61 += var13;
                        var69 += Statics.field5208;
                    }
                }
            }
        }
    }

    @ObfuscatedName("kx.bf([IIIIII)V")
    public void method5167(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (this.field2789.field3037) {
            if (arg5 > this.field2789.field3051) {
                arg5 = this.field2789.field3051;
            }
            if (arg4 < 0) {
                arg4 = 0;
            }
        }
        if (arg4 >= arg5) {
            return;
        }
        int var7 = arg1 + arg4;
        int var8 = arg5 - arg4 >> 2;
        if (this.field2789.field3052 == 0) {
            while (true) {
                var8--;
                if (var8 < 0) {
                    int var9 = arg5 - arg4 & 0x3;
                    while (true) {
                        var9--;
                        if (var9 < 0) {
                            return;
                        }
                        arg0[var7++] = arg2;
                    }
                }
                arg0[var7++] = arg2;
                arg0[var7++] = arg2;
                arg0[var7++] = arg2;
                arg0[var7++] = arg2;
            }
        } else if (this.field2789.field3052 == 254) {
            while (true) {
                var8--;
                if (var8 < 0) {
                    int var10 = arg5 - arg4 & 0x3;
                    while (true) {
                        var10--;
                        if (var10 < 0) {
                            return;
                        }
                        arg0[var7++] = arg0[var7];
                    }
                }
                arg0[var7++] = arg0[var7];
                arg0[var7++] = arg0[var7];
                arg0[var7++] = arg0[var7];
                arg0[var7++] = arg0[var7];
            }
        } else {
            int var11 = this.field2789.field3052;
            int var12 = 256 - this.field2789.field3052;
            int var13 = ((arg2 & 0xFF00FF) * var12 >> 8 & 0xFF00FF) + ((arg2 & 0xFF00) * var12 >> 8 & 0xFF00);
            while (true) {
                var8--;
                if (var8 < 0) {
                    int var18 = arg5 - arg4 & 0x3;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            return;
                        }
                        int var19 = arg0[var7];
                        arg0[var7++] = ((var19 & 0xFF00) * var11 >> 8 & 0xFF00) + ((var19 & 0xFF00FF) * var11 >> 8 & 0xFF00FF) + var13;
                    }
                }
                int var14 = arg0[var7];
                arg0[var7++] = ((var14 & 0xFF00) * var11 >> 8 & 0xFF00) + ((var14 & 0xFF00FF) * var11 >> 8 & 0xFF00FF) + var13;
                int var15 = arg0[var7];
                arg0[var7++] = ((var15 & 0xFF00) * var11 >> 8 & 0xFF00) + ((var15 & 0xFF00FF) * var11 >> 8 & 0xFF00FF) + var13;
                int var16 = arg0[var7];
                arg0[var7++] = ((var16 & 0xFF00) * var11 >> 8 & 0xFF00) + ((var16 & 0xFF00FF) * var11 >> 8 & 0xFF00FF) + var13;
                int var17 = arg0[var7];
                arg0[var7++] = ((var17 & 0xFF00) * var11 >> 8 & 0xFF00) + ((var17 & 0xFF00FF) * var11 >> 8 & 0xFF00FF) + var13;
            }
        }
    }

    @ObfuscatedName("kx.ac(IIIIIIFFFIIIIIIIIIIIII)V")
    public void method4764(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19, int arg20, int arg21) {
        int[] var23 = this.field2789.field3043.method4988(arg21);
        if (var23 == null) {
            int var24 = this.field2789.field3043.method5009(arg21);
            this.method4761(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, method4784(var24, arg9), method4784(var24, arg10), method4784(var24, arg11));
            return;
        }
        this.field2783 = this.field2789.field3043.method4990(arg21);
        this.field2784 = this.field2789.field3043.method4985(arg21);
        int var25 = arg4 - arg3;
        int var26 = arg1 - arg0;
        int var27 = arg5 - arg3;
        int var28 = arg2 - arg0;
        int var29 = arg10 - arg9;
        int var30 = arg11 - arg9;
        int var31 = 0;
        if (arg0 != arg1) {
            var31 = (arg4 - arg3 << 14) / (arg1 - arg0);
        }
        int var32 = 0;
        if (arg1 != arg2) {
            var32 = (arg5 - arg4 << 14) / (arg2 - arg1);
        }
        int var33 = 0;
        if (arg0 != arg2) {
            var33 = (arg3 - arg5 << 14) / (arg0 - arg2);
        }
        int var34 = var25 * var28 - var26 * var27;
        if (var34 == 0) {
            return;
        }
        int var35 = (var28 * var29 - var26 * var30 << 9) / var34;
        int var36 = (var25 * var30 - var27 * var29 << 9) / var34;
        int var37 = this.field2789.field3042;
        int var38 = arg12 - arg13;
        int var39 = arg15 - arg16;
        int var40 = arg18 - arg19;
        int var41 = arg14 - arg12;
        int var42 = arg17 - arg15;
        int var43 = arg20 - arg18;
        int var44 = arg15 * var41 - arg12 * var42 << 14;
        int var45 = (int) (((long) (arg18 * var42 - arg15 * var43) << 3 << 14) / (long) var37);
        int var46 = (int) (((long) (arg12 * var43 - arg18 * var41) << 14) / (long) var37);
        int var47 = arg15 * var38 - arg12 * var39 << 14;
        int var48 = (int) (((long) (arg18 * var39 - arg15 * var40) << 3 << 14) / (long) var37);
        int var49 = (int) (((long) (arg12 * var40 - arg18 * var38) << 14) / (long) var37);
        int var50 = var39 * var41 - var38 * var42 << 14;
        int var51 = (int) (((long) (var40 * var42 - var39 * var43) << 3 << 14) / (long) var37);
        int var52 = (int) (((long) (var38 * var43 - var40 * var41) << 14) / (long) var37);
        int[] var53 = this.field2789.field3048;
        int var54 = this.field2789.field3040;
        if (arg0 <= arg1 && arg0 <= arg2) {
            if (arg0 < var54) {
                if (arg1 > var54) {
                    arg1 = var54;
                }
                if (arg2 > var54) {
                    arg2 = var54;
                }
                int var55 = (arg9 << 9) - arg3 * var35 + var35;
                if (arg1 < arg2) {
                    int var56;
                    int var57 = var56 = arg3 << 14;
                    if (arg0 < 0) {
                        var57 -= arg0 * var33;
                        var56 -= arg0 * var31;
                        var55 -= arg0 * var36;
                        arg0 = 0;
                    }
                    int var58 = arg4 << 14;
                    if (arg1 < 0) {
                        var58 -= arg1 * var32;
                        arg1 = 0;
                    }
                    int var59 = arg0 - this.field2789.field3050;
                    int var60 = var46 * var59 + var44;
                    int var61 = var49 * var59 + var47;
                    int var62 = var52 * var59 + var50;
                    if (arg0 != arg1 && var33 < var31 || arg0 == arg1 && var33 > var32) {
                        int var63 = arg2 - arg1;
                        int var64 = arg1 - arg0;
                        int var65 = var53[arg0];
                        while (true) {
                            var64--;
                            if (var64 < 0) {
                                while (true) {
                                    var63--;
                                    if (var63 < 0) {
                                        return;
                                    }
                                    this.method5170(Statics.field5215, var23, 0, 0, var65, var57 >> 14, var58 >> 14, var55, var35, var60, var61, var62, var45, var48, var51);
                                    var57 += var33;
                                    var58 += var32;
                                    var55 += var36;
                                    var65 += Statics.field5208;
                                    var60 += var46;
                                    var61 += var49;
                                    var62 += var52;
                                }
                            }
                            this.method5170(Statics.field5215, var23, 0, 0, var65, var57 >> 14, var56 >> 14, var55, var35, var60, var61, var62, var45, var48, var51);
                            var57 += var33;
                            var56 += var31;
                            var55 += var36;
                            var65 += Statics.field5208;
                            var60 += var46;
                            var61 += var49;
                            var62 += var52;
                        }
                    } else {
                        int var66 = arg2 - arg1;
                        int var67 = arg1 - arg0;
                        int var68 = var53[arg0];
                        while (true) {
                            var67--;
                            if (var67 < 0) {
                                while (true) {
                                    var66--;
                                    if (var66 < 0) {
                                        return;
                                    }
                                    this.method5170(Statics.field5215, var23, 0, 0, var68, var58 >> 14, var57 >> 14, var55, var35, var60, var61, var62, var45, var48, var51);
                                    var57 += var33;
                                    var58 += var32;
                                    var55 += var36;
                                    var68 += Statics.field5208;
                                    var60 += var46;
                                    var61 += var49;
                                    var62 += var52;
                                }
                            }
                            this.method5170(Statics.field5215, var23, 0, 0, var68, var56 >> 14, var57 >> 14, var55, var35, var60, var61, var62, var45, var48, var51);
                            var57 += var33;
                            var56 += var31;
                            var55 += var36;
                            var68 += Statics.field5208;
                            var60 += var46;
                            var61 += var49;
                            var62 += var52;
                        }
                    }
                } else {
                    int var69;
                    int var70 = var69 = arg3 << 14;
                    if (arg0 < 0) {
                        var70 -= arg0 * var33;
                        var69 -= arg0 * var31;
                        var55 -= arg0 * var36;
                        arg0 = 0;
                    }
                    int var71 = arg5 << 14;
                    if (arg2 < 0) {
                        var71 -= arg2 * var32;
                        arg2 = 0;
                    }
                    int var72 = arg0 - this.field2789.field3050;
                    int var73 = var46 * var72 + var44;
                    int var74 = var49 * var72 + var47;
                    int var75 = var52 * var72 + var50;
                    if ((arg0 == arg2 || var33 >= var31) && (arg0 != arg2 || var32 <= var31)) {
                        int var79 = arg1 - arg2;
                        int var80 = arg2 - arg0;
                        int var81 = var53[arg0];
                        while (true) {
                            var80--;
                            if (var80 < 0) {
                                while (true) {
                                    var79--;
                                    if (var79 < 0) {
                                        return;
                                    }
                                    this.method5170(Statics.field5215, var23, 0, 0, var81, var69 >> 14, var71 >> 14, var55, var35, var73, var74, var75, var45, var48, var51);
                                    var71 += var32;
                                    var69 += var31;
                                    var55 += var36;
                                    var81 += Statics.field5208;
                                    var73 += var46;
                                    var74 += var49;
                                    var75 += var52;
                                }
                            }
                            this.method5170(Statics.field5215, var23, 0, 0, var81, var69 >> 14, var70 >> 14, var55, var35, var73, var74, var75, var45, var48, var51);
                            var70 += var33;
                            var69 += var31;
                            var55 += var36;
                            var81 += Statics.field5208;
                            var73 += var46;
                            var74 += var49;
                            var75 += var52;
                        }
                    } else {
                        int var76 = arg1 - arg2;
                        int var77 = arg2 - arg0;
                        int var78 = var53[arg0];
                        while (true) {
                            var77--;
                            if (var77 < 0) {
                                while (true) {
                                    var76--;
                                    if (var76 < 0) {
                                        return;
                                    }
                                    this.method5170(Statics.field5215, var23, 0, 0, var78, var71 >> 14, var69 >> 14, var55, var35, var73, var74, var75, var45, var48, var51);
                                    var71 += var32;
                                    var69 += var31;
                                    var55 += var36;
                                    var78 += Statics.field5208;
                                    var73 += var46;
                                    var74 += var49;
                                    var75 += var52;
                                }
                            }
                            this.method5170(Statics.field5215, var23, 0, 0, var78, var70 >> 14, var69 >> 14, var55, var35, var73, var74, var75, var45, var48, var51);
                            var70 += var33;
                            var69 += var31;
                            var55 += var36;
                            var78 += Statics.field5208;
                            var73 += var46;
                            var74 += var49;
                            var75 += var52;
                        }
                    }
                }
            }
        } else if (arg1 <= arg2) {
            if (arg1 < var54) {
                if (arg2 > var54) {
                    arg2 = var54;
                }
                if (arg0 > var54) {
                    arg0 = var54;
                }
                int var82 = (arg10 << 9) - arg4 * var35 + var35;
                if (arg2 < arg0) {
                    int var83;
                    int var84 = var83 = arg4 << 14;
                    if (arg1 < 0) {
                        var84 -= arg1 * var31;
                        var83 -= arg1 * var32;
                        var82 -= arg1 * var36;
                        arg1 = 0;
                    }
                    int var85 = arg5 << 14;
                    if (arg2 < 0) {
                        var85 -= arg2 * var33;
                        arg2 = 0;
                    }
                    int var86 = arg1 - this.field2789.field3050;
                    int var87 = var46 * var86 + var44;
                    int var88 = var49 * var86 + var47;
                    int var89 = var52 * var86 + var50;
                    if (arg1 != arg2 && var31 < var32 || arg1 == arg2 && var31 > var33) {
                        int var90 = arg0 - arg2;
                        int var91 = arg2 - arg1;
                        int var92 = var53[arg1];
                        while (true) {
                            var91--;
                            if (var91 < 0) {
                                while (true) {
                                    var90--;
                                    if (var90 < 0) {
                                        return;
                                    }
                                    this.method5170(Statics.field5215, var23, 0, 0, var92, var84 >> 14, var85 >> 14, var82, var35, var87, var88, var89, var45, var48, var51);
                                    var84 += var31;
                                    var85 += var33;
                                    var82 += var36;
                                    var92 += Statics.field5208;
                                    var87 += var46;
                                    var88 += var49;
                                    var89 += var52;
                                }
                            }
                            this.method5170(Statics.field5215, var23, 0, 0, var92, var84 >> 14, var83 >> 14, var82, var35, var87, var88, var89, var45, var48, var51);
                            var84 += var31;
                            var83 += var32;
                            var82 += var36;
                            var92 += Statics.field5208;
                            var87 += var46;
                            var88 += var49;
                            var89 += var52;
                        }
                    } else {
                        int var93 = arg0 - arg2;
                        int var94 = arg2 - arg1;
                        int var95 = var53[arg1];
                        while (true) {
                            var94--;
                            if (var94 < 0) {
                                while (true) {
                                    var93--;
                                    if (var93 < 0) {
                                        return;
                                    }
                                    this.method5170(Statics.field5215, var23, 0, 0, var95, var85 >> 14, var84 >> 14, var82, var35, var87, var88, var89, var45, var48, var51);
                                    var84 += var31;
                                    var85 += var33;
                                    var82 += var36;
                                    var95 += Statics.field5208;
                                    var87 += var46;
                                    var88 += var49;
                                    var89 += var52;
                                }
                            }
                            this.method5170(Statics.field5215, var23, 0, 0, var95, var83 >> 14, var84 >> 14, var82, var35, var87, var88, var89, var45, var48, var51);
                            var84 += var31;
                            var83 += var32;
                            var82 += var36;
                            var95 += Statics.field5208;
                            var87 += var46;
                            var88 += var49;
                            var89 += var52;
                        }
                    }
                } else {
                    int var96;
                    int var97 = var96 = arg4 << 14;
                    if (arg1 < 0) {
                        var97 -= arg1 * var31;
                        var96 -= arg1 * var32;
                        var82 -= arg1 * var36;
                        arg1 = 0;
                    }
                    int var98 = arg3 << 14;
                    if (arg0 < 0) {
                        var98 -= arg0 * var33;
                        arg0 = 0;
                    }
                    int var99 = arg1 - this.field2789.field3050;
                    int var100 = var46 * var99 + var44;
                    int var101 = var49 * var99 + var47;
                    int var102 = var52 * var99 + var50;
                    if (var31 < var32) {
                        int var103 = arg2 - arg0;
                        int var104 = arg0 - arg1;
                        int var105 = var53[arg1];
                        while (true) {
                            var104--;
                            if (var104 < 0) {
                                while (true) {
                                    var103--;
                                    if (var103 < 0) {
                                        return;
                                    }
                                    this.method5170(Statics.field5215, var23, 0, 0, var105, var98 >> 14, var96 >> 14, var82, var35, var100, var101, var102, var45, var48, var51);
                                    var98 += var33;
                                    var96 += var32;
                                    var82 += var36;
                                    var105 += Statics.field5208;
                                    var100 += var46;
                                    var101 += var49;
                                    var102 += var52;
                                }
                            }
                            this.method5170(Statics.field5215, var23, 0, 0, var105, var97 >> 14, var96 >> 14, var82, var35, var100, var101, var102, var45, var48, var51);
                            var97 += var31;
                            var96 += var32;
                            var82 += var36;
                            var105 += Statics.field5208;
                            var100 += var46;
                            var101 += var49;
                            var102 += var52;
                        }
                    } else {
                        int var106 = arg2 - arg0;
                        int var107 = arg0 - arg1;
                        int var108 = var53[arg1];
                        while (true) {
                            var107--;
                            if (var107 < 0) {
                                while (true) {
                                    var106--;
                                    if (var106 < 0) {
                                        return;
                                    }
                                    this.method5170(Statics.field5215, var23, 0, 0, var108, var96 >> 14, var98 >> 14, var82, var35, var100, var101, var102, var45, var48, var51);
                                    var98 += var33;
                                    var96 += var32;
                                    var82 += var36;
                                    var108 += Statics.field5208;
                                    var100 += var46;
                                    var101 += var49;
                                    var102 += var52;
                                }
                            }
                            this.method5170(Statics.field5215, var23, 0, 0, var108, var96 >> 14, var97 >> 14, var82, var35, var100, var101, var102, var45, var48, var51);
                            var97 += var31;
                            var96 += var32;
                            var82 += var36;
                            var108 += Statics.field5208;
                            var100 += var46;
                            var101 += var49;
                            var102 += var52;
                        }
                    }
                }
            }
        } else if (arg2 < var54) {
            if (arg0 > var54) {
                arg0 = var54;
            }
            if (arg1 > var54) {
                arg1 = var54;
            }
            int var109 = (arg11 << 9) - arg5 * var35 + var35;
            if (arg0 < arg1) {
                int var110;
                int var111 = var110 = arg5 << 14;
                if (arg2 < 0) {
                    var111 -= arg2 * var32;
                    var110 -= arg2 * var33;
                    var109 -= arg2 * var36;
                    arg2 = 0;
                }
                int var112 = arg3 << 14;
                if (arg0 < 0) {
                    var112 -= arg0 * var31;
                    arg0 = 0;
                }
                int var113 = arg2 - this.field2789.field3050;
                int var114 = var46 * var113 + var44;
                int var115 = var49 * var113 + var47;
                int var116 = var52 * var113 + var50;
                if (var32 < var33) {
                    int var117 = arg1 - arg0;
                    int var118 = arg0 - arg2;
                    int var119 = var53[arg2];
                    while (true) {
                        var118--;
                        if (var118 < 0) {
                            while (true) {
                                var117--;
                                if (var117 < 0) {
                                    return;
                                }
                                this.method5170(Statics.field5215, var23, 0, 0, var119, var111 >> 14, var112 >> 14, var109, var35, var114, var115, var116, var45, var48, var51);
                                var111 += var32;
                                var112 += var31;
                                var109 += var36;
                                var119 += Statics.field5208;
                                var114 += var46;
                                var115 += var49;
                                var116 += var52;
                            }
                        }
                        this.method5170(Statics.field5215, var23, 0, 0, var119, var111 >> 14, var110 >> 14, var109, var35, var114, var115, var116, var45, var48, var51);
                        var111 += var32;
                        var110 += var33;
                        var109 += var36;
                        var119 += Statics.field5208;
                        var114 += var46;
                        var115 += var49;
                        var116 += var52;
                    }
                } else {
                    int var120 = arg1 - arg0;
                    int var121 = arg0 - arg2;
                    int var122 = var53[arg2];
                    while (true) {
                        var121--;
                        if (var121 < 0) {
                            while (true) {
                                var120--;
                                if (var120 < 0) {
                                    return;
                                }
                                this.method5170(Statics.field5215, var23, 0, 0, var122, var112 >> 14, var111 >> 14, var109, var35, var114, var115, var116, var45, var48, var51);
                                var111 += var32;
                                var112 += var31;
                                var109 += var36;
                                var122 += Statics.field5208;
                                var114 += var46;
                                var115 += var49;
                                var116 += var52;
                            }
                        }
                        this.method5170(Statics.field5215, var23, 0, 0, var122, var110 >> 14, var111 >> 14, var109, var35, var114, var115, var116, var45, var48, var51);
                        var111 += var32;
                        var110 += var33;
                        var109 += var36;
                        var122 += Statics.field5208;
                        var114 += var46;
                        var115 += var49;
                        var116 += var52;
                    }
                }
            } else {
                int var123;
                int var124 = var123 = arg5 << 14;
                if (arg2 < 0) {
                    var124 -= arg2 * var32;
                    var123 -= arg2 * var33;
                    var109 -= arg2 * var36;
                    arg2 = 0;
                }
                int var125 = arg4 << 14;
                if (arg1 < 0) {
                    var125 -= arg1 * var31;
                    arg1 = 0;
                }
                int var126 = arg2 - this.field2789.field3050;
                int var127 = var46 * var126 + var44;
                int var128 = var49 * var126 + var47;
                int var129 = var52 * var126 + var50;
                if (var32 < var33) {
                    int var130 = arg0 - arg1;
                    int var131 = arg1 - arg2;
                    int var132 = var53[arg2];
                    while (true) {
                        var131--;
                        if (var131 < 0) {
                            while (true) {
                                var130--;
                                if (var130 < 0) {
                                    return;
                                }
                                this.method5170(Statics.field5215, var23, 0, 0, var132, var125 >> 14, var123 >> 14, var109, var35, var127, var128, var129, var45, var48, var51);
                                var125 += var31;
                                var123 += var33;
                                var109 += var36;
                                var132 += Statics.field5208;
                                var127 += var46;
                                var128 += var49;
                                var129 += var52;
                            }
                        }
                        this.method5170(Statics.field5215, var23, 0, 0, var132, var124 >> 14, var123 >> 14, var109, var35, var127, var128, var129, var45, var48, var51);
                        var124 += var32;
                        var123 += var33;
                        var109 += var36;
                        var132 += Statics.field5208;
                        var127 += var46;
                        var128 += var49;
                        var129 += var52;
                    }
                } else {
                    int var133 = arg0 - arg1;
                    int var134 = arg1 - arg2;
                    int var135 = var53[arg2];
                    while (true) {
                        var134--;
                        if (var134 < 0) {
                            while (true) {
                                var133--;
                                if (var133 < 0) {
                                    return;
                                }
                                this.method5170(Statics.field5215, var23, 0, 0, var135, var123 >> 14, var125 >> 14, var109, var35, var127, var128, var129, var45, var48, var51);
                                var125 += var31;
                                var123 += var33;
                                var109 += var36;
                                var135 += Statics.field5208;
                                var127 += var46;
                                var128 += var49;
                                var129 += var52;
                            }
                        }
                        this.method5170(Statics.field5215, var23, 0, 0, var135, var123 >> 14, var124 >> 14, var109, var35, var127, var128, var129, var45, var48, var51);
                        var124 += var32;
                        var123 += var33;
                        var109 += var36;
                        var135 += Statics.field5208;
                        var127 += var46;
                        var128 += var49;
                        var129 += var52;
                    }
                }
            }
        }
    }

    @ObfuscatedName("kx.bg([I[IIIIIIIIIIIIII)V")
    public void method5170(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        if (this.field2789.field3037) {
            if (arg6 > this.field2789.field3051) {
                arg6 = this.field2789.field3051;
            }
            if (arg5 < 0) {
                arg5 = 0;
            }
        }
        if (arg5 >= arg6) {
            return;
        }
        int var16 = arg4 + arg5;
        int var17 = arg5 * arg8 + arg7;
        int var18 = arg6 - arg5;
        int var10000;
        if (!this.field2783) {
            int var79 = arg5 - this.field2789.field3038;
            int var80 = (arg12 >> 3) * var79 + arg9;
            int var81 = (arg13 >> 3) * var79 + arg10;
            int var82 = (arg14 >> 3) * var79 + arg11;
            int var83 = var82 >> 14;
            int var84;
            int var85;
            if (var83 == 0) {
                var84 = 0;
                var85 = 0;
            } else {
                var84 = var80 / var83;
                var85 = var81 / var83;
                if (var84 < 0) {
                    var84 = 0;
                } else if (var84 > 16256) {
                    var84 = 16256;
                }
            }
            int var86 = arg12 + var80;
            int var87 = arg13 + var81;
            int var88 = arg14 + var82;
            int var89 = var88 >> 14;
            int var90;
            int var91;
            if (var89 == 0) {
                var90 = 0;
                var91 = 0;
            } else {
                var90 = var86 / var89;
                var91 = var87 / var89;
                if (var90 < 0) {
                    var90 = 0;
                } else if (var90 > 16256) {
                    var90 = 16256;
                }
            }
            int var92 = (var84 << 18) + var85;
            int var93 = (var90 - var84 >> 3 << 18) + (var91 - var85 >> 3);
            int var94 = var18 >> 3;
            int var95 = arg8 << 3;
            int var96 = var17 >> 8;
            if (this.field2784) {
                if (var94 > 0) {
                    do {
                        int var97 = arg1[(var92 >>> 25) + (var92 & 0x3F80)];
                        arg0[var16++] = ((var97 & 0xFF00FF) * var96 & 0xFF00FF00) + ((var97 & 0xFF00) * var96 & 0xFF0000) >> 8;
                        int var98 = var92 + var93;
                        int var99 = arg1[(var98 >>> 25) + (var98 & 0x3F80)];
                        arg0[var16++] = ((var99 & 0xFF00FF) * var96 & 0xFF00FF00) + ((var99 & 0xFF00) * var96 & 0xFF0000) >> 8;
                        int var100 = var93 + var98;
                        int var101 = arg1[(var100 >>> 25) + (var100 & 0x3F80)];
                        arg0[var16++] = ((var101 & 0xFF00FF) * var96 & 0xFF00FF00) + ((var101 & 0xFF00) * var96 & 0xFF0000) >> 8;
                        int var102 = var93 + var100;
                        int var103 = arg1[(var102 >>> 25) + (var102 & 0x3F80)];
                        arg0[var16++] = ((var103 & 0xFF00FF) * var96 & 0xFF00FF00) + ((var103 & 0xFF00) * var96 & 0xFF0000) >> 8;
                        int var104 = var93 + var102;
                        int var105 = arg1[(var104 >>> 25) + (var104 & 0x3F80)];
                        arg0[var16++] = ((var105 & 0xFF00FF) * var96 & 0xFF00FF00) + ((var105 & 0xFF00) * var96 & 0xFF0000) >> 8;
                        int var106 = var93 + var104;
                        int var107 = arg1[(var106 >>> 25) + (var106 & 0x3F80)];
                        arg0[var16++] = ((var107 & 0xFF00FF) * var96 & 0xFF00FF00) + ((var107 & 0xFF00) * var96 & 0xFF0000) >> 8;
                        int var108 = var93 + var106;
                        int var109 = arg1[(var108 >>> 25) + (var108 & 0x3F80)];
                        arg0[var16++] = ((var109 & 0xFF00FF) * var96 & 0xFF00FF00) + ((var109 & 0xFF00) * var96 & 0xFF0000) >> 8;
                        int var110 = var93 + var108;
                        int var111 = arg1[(var110 >>> 25) + (var110 & 0x3F80)];
                        arg0[var16++] = ((var111 & 0xFF00FF) * var96 & 0xFF00FF00) + ((var111 & 0xFF00) * var96 & 0xFF0000) >> 8;
                        var10000 = var93 + var110;
                        int var113 = var90;
                        int var114 = var91;
                        var86 += arg12;
                        var87 += arg13;
                        var88 += arg14;
                        int var115 = var88 >> 14;
                        if (var115 == 0) {
                            var90 = 0;
                            var91 = 0;
                        } else {
                            var90 = var86 / var115;
                            var91 = var87 / var115;
                            if (var90 < 0) {
                                var90 = 0;
                            } else if (var90 > 16256) {
                                var90 = 16256;
                            }
                        }
                        var92 = (var113 << 18) + var114;
                        var93 = (var90 - var113 >> 3 << 18) + (var91 - var114 >> 3);
                        var17 += var95;
                        var96 = var17 >> 8;
                        var94--;
                    } while (var94 > 0);
                }
                int var116 = arg6 - arg5 & 0x7;
                if (var116 > 0) {
                    do {
                        int var117 = arg1[(var92 >>> 25) + (var92 & 0x3F80)];
                        arg0[var16++] = ((var117 & 0xFF00FF) * var96 & 0xFF00FF00) + ((var117 & 0xFF00) * var96 & 0xFF0000) >> 8;
                        var92 += var93;
                        var116--;
                    } while (var116 > 0);
                }
            } else {
                if (var94 > 0) {
                    do {
                        int var118;
                        if ((var118 = arg1[(var92 >>> 25) + (var92 & 0x3F80)]) != 0) {
                            arg0[var16] = ((var118 & 0xFF00FF) * var96 & 0xFF00FF00) + ((var118 & 0xFF00) * var96 & 0xFF0000) >> 8;
                        }
                        var16++;
                        int var119 = var92 + var93;
                        int var120;
                        if ((var120 = arg1[(var119 >>> 25) + (var119 & 0x3F80)]) != 0) {
                            arg0[var16] = ((var120 & 0xFF00FF) * var96 & 0xFF00FF00) + ((var120 & 0xFF00) * var96 & 0xFF0000) >> 8;
                        }
                        var16++;
                        int var121 = var93 + var119;
                        int var122;
                        if ((var122 = arg1[(var121 >>> 25) + (var121 & 0x3F80)]) != 0) {
                            arg0[var16] = ((var122 & 0xFF00FF) * var96 & 0xFF00FF00) + ((var122 & 0xFF00) * var96 & 0xFF0000) >> 8;
                        }
                        var16++;
                        int var123 = var93 + var121;
                        int var124;
                        if ((var124 = arg1[(var123 >>> 25) + (var123 & 0x3F80)]) != 0) {
                            arg0[var16] = ((var124 & 0xFF00FF) * var96 & 0xFF00FF00) + ((var124 & 0xFF00) * var96 & 0xFF0000) >> 8;
                        }
                        var16++;
                        int var125 = var93 + var123;
                        int var126;
                        if ((var126 = arg1[(var125 >>> 25) + (var125 & 0x3F80)]) != 0) {
                            arg0[var16] = ((var126 & 0xFF00FF) * var96 & 0xFF00FF00) + ((var126 & 0xFF00) * var96 & 0xFF0000) >> 8;
                        }
                        var16++;
                        int var127 = var93 + var125;
                        int var128;
                        if ((var128 = arg1[(var127 >>> 25) + (var127 & 0x3F80)]) != 0) {
                            arg0[var16] = ((var128 & 0xFF00FF) * var96 & 0xFF00FF00) + ((var128 & 0xFF00) * var96 & 0xFF0000) >> 8;
                        }
                        var16++;
                        int var129 = var93 + var127;
                        int var130;
                        if ((var130 = arg1[(var129 >>> 25) + (var129 & 0x3F80)]) != 0) {
                            arg0[var16] = ((var130 & 0xFF00FF) * var96 & 0xFF00FF00) + ((var130 & 0xFF00) * var96 & 0xFF0000) >> 8;
                        }
                        var16++;
                        int var131 = var93 + var129;
                        int var132;
                        if ((var132 = arg1[(var131 >>> 25) + (var131 & 0x3F80)]) != 0) {
                            arg0[var16] = ((var132 & 0xFF00FF) * var96 & 0xFF00FF00) + ((var132 & 0xFF00) * var96 & 0xFF0000) >> 8;
                        }
                        var16++;
                        var10000 = var93 + var131;
                        int var134 = var90;
                        int var135 = var91;
                        var86 += arg12;
                        var87 += arg13;
                        var88 += arg14;
                        int var136 = var88 >> 14;
                        if (var136 == 0) {
                            var90 = 0;
                            var91 = 0;
                        } else {
                            var90 = var86 / var136;
                            var91 = var87 / var136;
                            if (var90 < 0) {
                                var90 = 0;
                            } else if (var90 > 16256) {
                                var90 = 16256;
                            }
                        }
                        var92 = (var134 << 18) + var135;
                        var93 = (var90 - var134 >> 3 << 18) + (var91 - var135 >> 3);
                        var17 += var95;
                        var96 = var17 >> 8;
                        var94--;
                    } while (var94 > 0);
                }
                int var137 = arg6 - arg5 & 0x7;
                if (var137 > 0) {
                    do {
                        int var138;
                        if ((var138 = arg1[(var92 >>> 25) + (var92 & 0x3F80)]) != 0) {
                            arg0[var16] = ((var138 & 0xFF00FF) * var96 & 0xFF00FF00) + ((var138 & 0xFF00) * var96 & 0xFF0000) >> 8;
                        }
                        var16++;
                        var92 += var93;
                        var137--;
                    } while (var137 > 0);
                }
            }
            return;
        }
        int var19 = arg5 - this.field2789.field3038;
        int var20 = (arg12 >> 3) * var19 + arg9;
        int var21 = (arg13 >> 3) * var19 + arg10;
        int var22 = (arg14 >> 3) * var19 + arg11;
        int var23 = var22 >> 12;
        int var24;
        int var25;
        if (var23 == 0) {
            var24 = 0;
            var25 = 0;
        } else {
            var24 = var20 / var23;
            var25 = var21 / var23;
            if (var24 < 0) {
                var24 = 0;
            } else if (var24 > 4032) {
                var24 = 4032;
            }
        }
        int var26 = arg12 + var20;
        int var27 = arg13 + var21;
        int var28 = arg14 + var22;
        int var29 = var28 >> 12;
        int var30;
        int var31;
        if (var29 == 0) {
            var30 = 0;
            var31 = 0;
        } else {
            var30 = var26 / var29;
            var31 = var27 / var29;
            if (var30 < 0) {
                var30 = 0;
            } else if (var30 > 4032) {
                var30 = 4032;
            }
        }
        int var32 = (var24 << 20) + var25;
        int var33 = (var30 - var24 >> 3 << 20) + (var31 - var25 >> 3);
        int var34 = var18 >> 3;
        int var35 = arg8 << 3;
        int var36 = var17 >> 8;
        if (this.field2784) {
            if (var34 > 0) {
                do {
                    int var37 = arg1[(var32 >>> 26) + (var32 & 0xFC0)];
                    arg0[var16++] = ((var37 & 0xFF00FF) * var36 & 0xFF00FF00) + ((var37 & 0xFF00) * var36 & 0xFF0000) >> 8;
                    int var38 = var32 + var33;
                    int var39 = arg1[(var38 >>> 26) + (var38 & 0xFC0)];
                    arg0[var16++] = ((var39 & 0xFF00FF) * var36 & 0xFF00FF00) + ((var39 & 0xFF00) * var36 & 0xFF0000) >> 8;
                    int var40 = var33 + var38;
                    int var41 = arg1[(var40 >>> 26) + (var40 & 0xFC0)];
                    arg0[var16++] = ((var41 & 0xFF00FF) * var36 & 0xFF00FF00) + ((var41 & 0xFF00) * var36 & 0xFF0000) >> 8;
                    int var42 = var33 + var40;
                    int var43 = arg1[(var42 >>> 26) + (var42 & 0xFC0)];
                    arg0[var16++] = ((var43 & 0xFF00FF) * var36 & 0xFF00FF00) + ((var43 & 0xFF00) * var36 & 0xFF0000) >> 8;
                    int var44 = var33 + var42;
                    int var45 = arg1[(var44 >>> 26) + (var44 & 0xFC0)];
                    arg0[var16++] = ((var45 & 0xFF00FF) * var36 & 0xFF00FF00) + ((var45 & 0xFF00) * var36 & 0xFF0000) >> 8;
                    int var46 = var33 + var44;
                    int var47 = arg1[(var46 >>> 26) + (var46 & 0xFC0)];
                    arg0[var16++] = ((var47 & 0xFF00FF) * var36 & 0xFF00FF00) + ((var47 & 0xFF00) * var36 & 0xFF0000) >> 8;
                    int var48 = var33 + var46;
                    int var49 = arg1[(var48 >>> 26) + (var48 & 0xFC0)];
                    arg0[var16++] = ((var49 & 0xFF00FF) * var36 & 0xFF00FF00) + ((var49 & 0xFF00) * var36 & 0xFF0000) >> 8;
                    int var50 = var33 + var48;
                    int var51 = arg1[(var50 >>> 26) + (var50 & 0xFC0)];
                    arg0[var16++] = ((var51 & 0xFF00FF) * var36 & 0xFF00FF00) + ((var51 & 0xFF00) * var36 & 0xFF0000) >> 8;
                    var10000 = var33 + var50;
                    int var53 = var30;
                    int var54 = var31;
                    var26 += arg12;
                    var27 += arg13;
                    var28 += arg14;
                    int var55 = var28 >> 12;
                    if (var55 == 0) {
                        var30 = 0;
                        var31 = 0;
                    } else {
                        var30 = var26 / var55;
                        var31 = var27 / var55;
                        if (var30 < 0) {
                            var30 = 0;
                        } else if (var30 > 4032) {
                            var30 = 4032;
                        }
                    }
                    var32 = (var53 << 20) + var54;
                    var33 = (var30 - var53 >> 3 << 20) + (var31 - var54 >> 3);
                    var17 += var35;
                    var36 = var17 >> 8;
                    var34--;
                } while (var34 > 0);
            }
            int var56 = arg6 - arg5 & 0x7;
            if (var56 > 0) {
                do {
                    int var57 = arg1[(var32 >>> 26) + (var32 & 0xFC0)];
                    arg0[var16++] = ((var57 & 0xFF00FF) * var36 & 0xFF00FF00) + ((var57 & 0xFF00) * var36 & 0xFF0000) >> 8;
                    var32 += var33;
                    var56--;
                } while (var56 > 0);
            }
            return;
        }
        if (var34 > 0) {
            do {
                int var58;
                if ((var58 = arg1[(var32 >>> 26) + (var32 & 0xFC0)]) != 0) {
                    arg0[var16] = ((var58 & 0xFF00FF) * var36 & 0xFF00FF00) + ((var58 & 0xFF00) * var36 & 0xFF0000) >> 8;
                }
                var16++;
                int var59 = var32 + var33;
                int var60;
                if ((var60 = arg1[(var59 >>> 26) + (var59 & 0xFC0)]) != 0) {
                    arg0[var16] = ((var60 & 0xFF00FF) * var36 & 0xFF00FF00) + ((var60 & 0xFF00) * var36 & 0xFF0000) >> 8;
                }
                var16++;
                int var61 = var33 + var59;
                int var62;
                if ((var62 = arg1[(var61 >>> 26) + (var61 & 0xFC0)]) != 0) {
                    arg0[var16] = ((var62 & 0xFF00FF) * var36 & 0xFF00FF00) + ((var62 & 0xFF00) * var36 & 0xFF0000) >> 8;
                }
                var16++;
                int var63 = var33 + var61;
                int var64;
                if ((var64 = arg1[(var63 >>> 26) + (var63 & 0xFC0)]) != 0) {
                    arg0[var16] = ((var64 & 0xFF00FF) * var36 & 0xFF00FF00) + ((var64 & 0xFF00) * var36 & 0xFF0000) >> 8;
                }
                var16++;
                int var65 = var33 + var63;
                int var66;
                if ((var66 = arg1[(var65 >>> 26) + (var65 & 0xFC0)]) != 0) {
                    arg0[var16] = ((var66 & 0xFF00FF) * var36 & 0xFF00FF00) + ((var66 & 0xFF00) * var36 & 0xFF0000) >> 8;
                }
                var16++;
                int var67 = var33 + var65;
                int var68;
                if ((var68 = arg1[(var67 >>> 26) + (var67 & 0xFC0)]) != 0) {
                    arg0[var16] = ((var68 & 0xFF00FF) * var36 & 0xFF00FF00) + ((var68 & 0xFF00) * var36 & 0xFF0000) >> 8;
                }
                var16++;
                int var69 = var33 + var67;
                int var70;
                if ((var70 = arg1[(var69 >>> 26) + (var69 & 0xFC0)]) != 0) {
                    arg0[var16] = ((var70 & 0xFF00FF) * var36 & 0xFF00FF00) + ((var70 & 0xFF00) * var36 & 0xFF0000) >> 8;
                }
                var16++;
                int var71 = var33 + var69;
                int var72;
                if ((var72 = arg1[(var71 >>> 26) + (var71 & 0xFC0)]) != 0) {
                    arg0[var16] = ((var72 & 0xFF00FF) * var36 & 0xFF00FF00) + ((var72 & 0xFF00) * var36 & 0xFF0000) >> 8;
                }
                var16++;
                var10000 = var33 + var71;
                int var74 = var30;
                int var75 = var31;
                var26 += arg12;
                var27 += arg13;
                var28 += arg14;
                int var76 = var28 >> 12;
                if (var76 == 0) {
                    var30 = 0;
                    var31 = 0;
                } else {
                    var30 = var26 / var76;
                    var31 = var27 / var76;
                    if (var30 < 0) {
                        var30 = 0;
                    } else if (var30 > 4032) {
                        var30 = 4032;
                    }
                }
                var32 = (var74 << 20) + var75;
                var33 = (var30 - var74 >> 3 << 20) + (var31 - var75 >> 3);
                var17 += var35;
                var36 = var17 >> 8;
                var34--;
            } while (var34 > 0);
        }
        int var77 = arg6 - arg5 & 0x7;
        if (var77 <= 0) {
            return;
        }
        do {
            int var78;
            if ((var78 = arg1[(var32 >>> 26) + (var32 & 0xFC0)]) != 0) {
                arg0[var16] = ((var78 & 0xFF00FF) * var36 & 0xFF00FF00) + ((var78 & 0xFF00) * var36 & 0xFF0000) >> 8;
            }
            var16++;
            var32 += var33;
            var77--;
        } while (var77 > 0);
    }

    @ObfuscatedName("kx.al(IIIIIIFFFIIIIIIIIIIIII)V")
    public void method4765(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19, int arg20, int arg21) {
        int[] var23 = this.field2789.field3043.method4988(arg21);
        if (var23 == null) {
            int var24 = this.field2789.field3043.method5009(arg21);
            this.method4761(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, method4784(var24, arg9), method4784(var24, arg10), method4784(var24, arg11));
            return;
        }
        this.field2783 = this.field2789.field3043.method4990(arg21);
        this.field2784 = this.field2789.field3043.method4985(arg21);
        int var25 = arg4 - arg3;
        int var26 = arg1 - arg0;
        int var27 = arg5 - arg3;
        int var28 = arg2 - arg0;
        int var29 = arg10 - arg9;
        int var30 = arg11 - arg9;
        int var31 = 0;
        if (arg0 != arg1) {
            var31 = (arg4 - arg3 << 14) / (arg1 - arg0);
        }
        int var32 = 0;
        if (arg1 != arg2) {
            var32 = (arg5 - arg4 << 14) / (arg2 - arg1);
        }
        int var33 = 0;
        if (arg0 != arg2) {
            var33 = (arg3 - arg5 << 14) / (arg0 - arg2);
        }
        int var34 = var25 * var28 - var26 * var27;
        if (var34 == 0) {
            return;
        }
        int var35 = (var28 * var29 - var26 * var30 << 9) / var34;
        int var36 = (var25 * var30 - var27 * var29 << 9) / var34;
        int var37 = this.field2789.field3042;
        int var38 = arg12 - arg13;
        int var39 = arg15 - arg16;
        int var40 = arg18 - arg19;
        int var41 = arg14 - arg12;
        int var42 = arg17 - arg15;
        int var43 = arg20 - arg18;
        int var44 = arg15 * var41 - arg12 * var42 << 14;
        int var45 = (int) (((long) (arg18 * var42 - arg15 * var43) << 14) / (long) var37);
        int var46 = (int) (((long) (arg12 * var43 - arg18 * var41) << 14) / (long) var37);
        int var47 = arg15 * var38 - arg12 * var39 << 14;
        int var48 = (int) (((long) (arg18 * var39 - arg15 * var40) << 14) / (long) var37);
        int var49 = (int) (((long) (arg12 * var40 - arg18 * var38) << 14) / (long) var37);
        int var50 = var39 * var41 - var38 * var42 << 14;
        int var51 = (int) (((long) (var40 * var42 - var39 * var43) << 14) / (long) var37);
        int var52 = (int) (((long) (var38 * var43 - var40 * var41) << 14) / (long) var37);
        int[] var53 = this.field2789.field3048;
        int var54 = this.field2789.field3040;
        int var55 = this.field2789.field3050;
        if (arg0 <= arg1 && arg0 <= arg2) {
            if (arg0 < var54) {
                if (arg1 > var54) {
                    arg1 = var54;
                }
                if (arg2 > var54) {
                    arg2 = var54;
                }
                int var56 = (arg9 << 9) - arg3 * var35 + var35;
                if (arg1 < arg2) {
                    int var57;
                    int var58 = var57 = arg3 << 14;
                    if (arg0 < 0) {
                        var58 -= arg0 * var33;
                        var57 -= arg0 * var31;
                        var56 -= arg0 * var36;
                        arg0 = 0;
                    }
                    int var59 = arg4 << 14;
                    if (arg1 < 0) {
                        var59 -= arg1 * var32;
                        arg1 = 0;
                    }
                    int var60 = arg0 - var55;
                    int var61 = var46 * var60 + var44;
                    int var62 = var49 * var60 + var47;
                    int var63 = var52 * var60 + var50;
                    if (arg0 != arg1 && var33 < var31 || arg0 == arg1 && var33 > var32) {
                        int var64 = arg2 - arg1;
                        int var65 = arg1 - arg0;
                        int var66 = var53[arg0];
                        while (true) {
                            var65--;
                            if (var65 < 0) {
                                while (true) {
                                    var64--;
                                    if (var64 < 0) {
                                        return;
                                    }
                                    this.method5169(Statics.field5215, var23, 0, 0, var66, var58 >> 14, var59 >> 14, var56, var35, var61, var62, var63, var45, var48, var51);
                                    var58 += var33;
                                    var59 += var32;
                                    var56 += var36;
                                    var66 += Statics.field5208;
                                    var61 += var46;
                                    var62 += var49;
                                    var63 += var52;
                                }
                            }
                            this.method5169(Statics.field5215, var23, 0, 0, var66, var58 >> 14, var57 >> 14, var56, var35, var61, var62, var63, var45, var48, var51);
                            var58 += var33;
                            var57 += var31;
                            var56 += var36;
                            var66 += Statics.field5208;
                            var61 += var46;
                            var62 += var49;
                            var63 += var52;
                        }
                    } else {
                        int var67 = arg2 - arg1;
                        int var68 = arg1 - arg0;
                        int var69 = var53[arg0];
                        while (true) {
                            var68--;
                            if (var68 < 0) {
                                while (true) {
                                    var67--;
                                    if (var67 < 0) {
                                        return;
                                    }
                                    this.method5169(Statics.field5215, var23, 0, 0, var69, var59 >> 14, var58 >> 14, var56, var35, var61, var62, var63, var45, var48, var51);
                                    var58 += var33;
                                    var59 += var32;
                                    var56 += var36;
                                    var69 += Statics.field5208;
                                    var61 += var46;
                                    var62 += var49;
                                    var63 += var52;
                                }
                            }
                            this.method5169(Statics.field5215, var23, 0, 0, var69, var57 >> 14, var58 >> 14, var56, var35, var61, var62, var63, var45, var48, var51);
                            var58 += var33;
                            var57 += var31;
                            var56 += var36;
                            var69 += Statics.field5208;
                            var61 += var46;
                            var62 += var49;
                            var63 += var52;
                        }
                    }
                } else {
                    int var70;
                    int var71 = var70 = arg3 << 14;
                    if (arg0 < 0) {
                        var71 -= arg0 * var33;
                        var70 -= arg0 * var31;
                        var56 -= arg0 * var36;
                        arg0 = 0;
                    }
                    int var72 = arg5 << 14;
                    if (arg2 < 0) {
                        var72 -= arg2 * var32;
                        arg2 = 0;
                    }
                    int var73 = arg0 - var55;
                    int var74 = var46 * var73 + var44;
                    int var75 = var49 * var73 + var47;
                    int var76 = var52 * var73 + var50;
                    if ((arg0 == arg2 || var33 >= var31) && (arg0 != arg2 || var32 <= var31)) {
                        int var80 = arg1 - arg2;
                        int var81 = arg2 - arg0;
                        int var82 = var53[arg0];
                        while (true) {
                            var81--;
                            if (var81 < 0) {
                                while (true) {
                                    var80--;
                                    if (var80 < 0) {
                                        return;
                                    }
                                    this.method5169(Statics.field5215, var23, 0, 0, var82, var70 >> 14, var72 >> 14, var56, var35, var74, var75, var76, var45, var48, var51);
                                    var72 += var32;
                                    var70 += var31;
                                    var56 += var36;
                                    var82 += Statics.field5208;
                                    var74 += var46;
                                    var75 += var49;
                                    var76 += var52;
                                }
                            }
                            this.method5169(Statics.field5215, var23, 0, 0, var82, var70 >> 14, var71 >> 14, var56, var35, var74, var75, var76, var45, var48, var51);
                            var71 += var33;
                            var70 += var31;
                            var56 += var36;
                            var82 += Statics.field5208;
                            var74 += var46;
                            var75 += var49;
                            var76 += var52;
                        }
                    } else {
                        int var77 = arg1 - arg2;
                        int var78 = arg2 - arg0;
                        int var79 = var53[arg0];
                        while (true) {
                            var78--;
                            if (var78 < 0) {
                                while (true) {
                                    var77--;
                                    if (var77 < 0) {
                                        return;
                                    }
                                    this.method5169(Statics.field5215, var23, 0, 0, var79, var72 >> 14, var70 >> 14, var56, var35, var74, var75, var76, var45, var48, var51);
                                    var72 += var32;
                                    var70 += var31;
                                    var56 += var36;
                                    var79 += Statics.field5208;
                                    var74 += var46;
                                    var75 += var49;
                                    var76 += var52;
                                }
                            }
                            this.method5169(Statics.field5215, var23, 0, 0, var79, var71 >> 14, var70 >> 14, var56, var35, var74, var75, var76, var45, var48, var51);
                            var71 += var33;
                            var70 += var31;
                            var56 += var36;
                            var79 += Statics.field5208;
                            var74 += var46;
                            var75 += var49;
                            var76 += var52;
                        }
                    }
                }
            }
        } else if (arg1 <= arg2) {
            if (arg1 < var54) {
                if (arg2 > var54) {
                    arg2 = var54;
                }
                if (arg0 > var54) {
                    arg0 = var54;
                }
                int var83 = (arg10 << 9) - arg4 * var35 + var35;
                if (arg2 < arg0) {
                    int var84;
                    int var85 = var84 = arg4 << 14;
                    if (arg1 < 0) {
                        var85 -= arg1 * var31;
                        var84 -= arg1 * var32;
                        var83 -= arg1 * var36;
                        arg1 = 0;
                    }
                    int var86 = arg5 << 14;
                    if (arg2 < 0) {
                        var86 -= arg2 * var33;
                        arg2 = 0;
                    }
                    int var87 = arg1 - var55;
                    int var88 = var46 * var87 + var44;
                    int var89 = var49 * var87 + var47;
                    int var90 = var52 * var87 + var50;
                    if (arg1 != arg2 && var31 < var32 || arg1 == arg2 && var31 > var33) {
                        int var91 = arg0 - arg2;
                        int var92 = arg2 - arg1;
                        int var93 = var53[arg1];
                        while (true) {
                            var92--;
                            if (var92 < 0) {
                                while (true) {
                                    var91--;
                                    if (var91 < 0) {
                                        return;
                                    }
                                    this.method5169(Statics.field5215, var23, 0, 0, var93, var85 >> 14, var86 >> 14, var83, var35, var88, var89, var90, var45, var48, var51);
                                    var85 += var31;
                                    var86 += var33;
                                    var83 += var36;
                                    var93 += Statics.field5208;
                                    var88 += var46;
                                    var89 += var49;
                                    var90 += var52;
                                }
                            }
                            this.method5169(Statics.field5215, var23, 0, 0, var93, var85 >> 14, var84 >> 14, var83, var35, var88, var89, var90, var45, var48, var51);
                            var85 += var31;
                            var84 += var32;
                            var83 += var36;
                            var93 += Statics.field5208;
                            var88 += var46;
                            var89 += var49;
                            var90 += var52;
                        }
                    } else {
                        int var94 = arg0 - arg2;
                        int var95 = arg2 - arg1;
                        int var96 = var53[arg1];
                        while (true) {
                            var95--;
                            if (var95 < 0) {
                                while (true) {
                                    var94--;
                                    if (var94 < 0) {
                                        return;
                                    }
                                    this.method5169(Statics.field5215, var23, 0, 0, var96, var86 >> 14, var85 >> 14, var83, var35, var88, var89, var90, var45, var48, var51);
                                    var85 += var31;
                                    var86 += var33;
                                    var83 += var36;
                                    var96 += Statics.field5208;
                                    var88 += var46;
                                    var89 += var49;
                                    var90 += var52;
                                }
                            }
                            this.method5169(Statics.field5215, var23, 0, 0, var96, var84 >> 14, var85 >> 14, var83, var35, var88, var89, var90, var45, var48, var51);
                            var85 += var31;
                            var84 += var32;
                            var83 += var36;
                            var96 += Statics.field5208;
                            var88 += var46;
                            var89 += var49;
                            var90 += var52;
                        }
                    }
                } else {
                    int var97;
                    int var98 = var97 = arg4 << 14;
                    if (arg1 < 0) {
                        var98 -= arg1 * var31;
                        var97 -= arg1 * var32;
                        var83 -= arg1 * var36;
                        arg1 = 0;
                    }
                    int var99 = arg3 << 14;
                    if (arg0 < 0) {
                        var99 -= arg0 * var33;
                        arg0 = 0;
                    }
                    int var100 = arg1 - var55;
                    int var101 = var46 * var100 + var44;
                    int var102 = var49 * var100 + var47;
                    int var103 = var52 * var100 + var50;
                    if (var31 < var32) {
                        int var104 = arg2 - arg0;
                        int var105 = arg0 - arg1;
                        int var106 = var53[arg1];
                        while (true) {
                            var105--;
                            if (var105 < 0) {
                                while (true) {
                                    var104--;
                                    if (var104 < 0) {
                                        return;
                                    }
                                    this.method5169(Statics.field5215, var23, 0, 0, var106, var99 >> 14, var97 >> 14, var83, var35, var101, var102, var103, var45, var48, var51);
                                    var99 += var33;
                                    var97 += var32;
                                    var83 += var36;
                                    var106 += Statics.field5208;
                                    var101 += var46;
                                    var102 += var49;
                                    var103 += var52;
                                }
                            }
                            this.method5169(Statics.field5215, var23, 0, 0, var106, var98 >> 14, var97 >> 14, var83, var35, var101, var102, var103, var45, var48, var51);
                            var98 += var31;
                            var97 += var32;
                            var83 += var36;
                            var106 += Statics.field5208;
                            var101 += var46;
                            var102 += var49;
                            var103 += var52;
                        }
                    } else {
                        int var107 = arg2 - arg0;
                        int var108 = arg0 - arg1;
                        int var109 = var53[arg1];
                        while (true) {
                            var108--;
                            if (var108 < 0) {
                                while (true) {
                                    var107--;
                                    if (var107 < 0) {
                                        return;
                                    }
                                    this.method5169(Statics.field5215, var23, 0, 0, var109, var97 >> 14, var99 >> 14, var83, var35, var101, var102, var103, var45, var48, var51);
                                    var99 += var33;
                                    var97 += var32;
                                    var83 += var36;
                                    var109 += Statics.field5208;
                                    var101 += var46;
                                    var102 += var49;
                                    var103 += var52;
                                }
                            }
                            this.method5169(Statics.field5215, var23, 0, 0, var109, var97 >> 14, var98 >> 14, var83, var35, var101, var102, var103, var45, var48, var51);
                            var98 += var31;
                            var97 += var32;
                            var83 += var36;
                            var109 += Statics.field5208;
                            var101 += var46;
                            var102 += var49;
                            var103 += var52;
                        }
                    }
                }
            }
        } else if (arg2 < var54) {
            if (arg0 > var54) {
                arg0 = var54;
            }
            if (arg1 > var54) {
                arg1 = var54;
            }
            int var110 = (arg11 << 9) - arg5 * var35 + var35;
            if (arg0 < arg1) {
                int var111;
                int var112 = var111 = arg5 << 14;
                if (arg2 < 0) {
                    var112 -= arg2 * var32;
                    var111 -= arg2 * var33;
                    var110 -= arg2 * var36;
                    arg2 = 0;
                }
                int var113 = arg3 << 14;
                if (arg0 < 0) {
                    var113 -= arg0 * var31;
                    arg0 = 0;
                }
                int var114 = arg2 - var55;
                int var115 = var46 * var114 + var44;
                int var116 = var49 * var114 + var47;
                int var117 = var52 * var114 + var50;
                if (var32 < var33) {
                    int var118 = arg1 - arg0;
                    int var119 = arg0 - arg2;
                    int var120 = var53[arg2];
                    while (true) {
                        var119--;
                        if (var119 < 0) {
                            while (true) {
                                var118--;
                                if (var118 < 0) {
                                    return;
                                }
                                this.method5169(Statics.field5215, var23, 0, 0, var120, var112 >> 14, var113 >> 14, var110, var35, var115, var116, var117, var45, var48, var51);
                                var112 += var32;
                                var113 += var31;
                                var110 += var36;
                                var120 += Statics.field5208;
                                var115 += var46;
                                var116 += var49;
                                var117 += var52;
                            }
                        }
                        this.method5169(Statics.field5215, var23, 0, 0, var120, var112 >> 14, var111 >> 14, var110, var35, var115, var116, var117, var45, var48, var51);
                        var112 += var32;
                        var111 += var33;
                        var110 += var36;
                        var120 += Statics.field5208;
                        var115 += var46;
                        var116 += var49;
                        var117 += var52;
                    }
                } else {
                    int var121 = arg1 - arg0;
                    int var122 = arg0 - arg2;
                    int var123 = var53[arg2];
                    while (true) {
                        var122--;
                        if (var122 < 0) {
                            while (true) {
                                var121--;
                                if (var121 < 0) {
                                    return;
                                }
                                this.method5169(Statics.field5215, var23, 0, 0, var123, var113 >> 14, var112 >> 14, var110, var35, var115, var116, var117, var45, var48, var51);
                                var112 += var32;
                                var113 += var31;
                                var110 += var36;
                                var123 += Statics.field5208;
                                var115 += var46;
                                var116 += var49;
                                var117 += var52;
                            }
                        }
                        this.method5169(Statics.field5215, var23, 0, 0, var123, var111 >> 14, var112 >> 14, var110, var35, var115, var116, var117, var45, var48, var51);
                        var112 += var32;
                        var111 += var33;
                        var110 += var36;
                        var123 += Statics.field5208;
                        var115 += var46;
                        var116 += var49;
                        var117 += var52;
                    }
                }
            } else {
                int var124;
                int var125 = var124 = arg5 << 14;
                if (arg2 < 0) {
                    var125 -= arg2 * var32;
                    var124 -= arg2 * var33;
                    var110 -= arg2 * var36;
                    arg2 = 0;
                }
                int var126 = arg4 << 14;
                if (arg1 < 0) {
                    var126 -= arg1 * var31;
                    arg1 = 0;
                }
                int var127 = arg2 - var55;
                int var128 = var46 * var127 + var44;
                int var129 = var49 * var127 + var47;
                int var130 = var52 * var127 + var50;
                if (var32 < var33) {
                    int var131 = arg0 - arg1;
                    int var132 = arg1 - arg2;
                    int var133 = var53[arg2];
                    while (true) {
                        var132--;
                        if (var132 < 0) {
                            while (true) {
                                var131--;
                                if (var131 < 0) {
                                    return;
                                }
                                this.method5169(Statics.field5215, var23, 0, 0, var133, var126 >> 14, var124 >> 14, var110, var35, var128, var129, var130, var45, var48, var51);
                                var126 += var31;
                                var124 += var33;
                                var110 += var36;
                                var133 += Statics.field5208;
                                var128 += var46;
                                var129 += var49;
                                var130 += var52;
                            }
                        }
                        this.method5169(Statics.field5215, var23, 0, 0, var133, var125 >> 14, var124 >> 14, var110, var35, var128, var129, var130, var45, var48, var51);
                        var125 += var32;
                        var124 += var33;
                        var110 += var36;
                        var133 += Statics.field5208;
                        var128 += var46;
                        var129 += var49;
                        var130 += var52;
                    }
                } else {
                    int var134 = arg0 - arg1;
                    int var135 = arg1 - arg2;
                    int var136 = var53[arg2];
                    while (true) {
                        var135--;
                        if (var135 < 0) {
                            while (true) {
                                var134--;
                                if (var134 < 0) {
                                    return;
                                }
                                this.method5169(Statics.field5215, var23, 0, 0, var136, var124 >> 14, var126 >> 14, var110, var35, var128, var129, var130, var45, var48, var51);
                                var126 += var31;
                                var124 += var33;
                                var110 += var36;
                                var136 += Statics.field5208;
                                var128 += var46;
                                var129 += var49;
                                var130 += var52;
                            }
                        }
                        this.method5169(Statics.field5215, var23, 0, 0, var136, var124 >> 14, var125 >> 14, var110, var35, var128, var129, var130, var45, var48, var51);
                        var125 += var32;
                        var124 += var33;
                        var110 += var36;
                        var136 += Statics.field5208;
                        var128 += var46;
                        var129 += var49;
                        var130 += var52;
                    }
                }
            }
        }
    }

    @ObfuscatedName("kx.ba([I[IIIIIIIIIIIIII)V")
    public void method5169(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        if (this.field2789.field3037) {
            if (arg6 > this.field2789.field3051) {
                arg6 = this.field2789.field3051;
            }
            if (arg5 < 0) {
                arg5 = 0;
            }
        }
        if (arg5 >= arg6) {
            return;
        }
        int var16 = arg4 + arg5;
        int var17 = arg5 * arg8 + arg7;
        int var18 = arg6 - arg5;
        if (!this.field2783) {
            int var71 = arg5 - this.field2789.field3038;
            int var72 = arg12 * var71 + arg9;
            int var73 = arg13 * var71 + arg10;
            int var74 = arg14 * var71 + arg11;
            int var75 = var74 >> 14;
            int var76;
            int var77;
            if (var75 == 0) {
                var76 = 0;
                var77 = 0;
            } else {
                var76 = var72 / var75;
                var77 = var73 / var75;
            }
            int var78 = arg12 * var18 + var72;
            int var79 = arg13 * var18 + var73;
            int var80 = arg14 * var18 + var74;
            int var81 = var80 >> 14;
            int var82;
            int var83;
            if (var81 == 0) {
                var82 = 0;
                var83 = 0;
            } else {
                var82 = var78 / var81;
                var83 = var79 / var81;
            }
            int var84 = (var76 << 18) + var77;
            int var85 = ((var82 - var76) / var18 << 18) + (var83 - var77) / var18;
            int var86 = var18 >> 3;
            int var87 = arg8 << 3;
            int var88 = var17 >> 8;
            if (this.field2784) {
                if (var86 > 0) {
                    do {
                        int var89 = arg1[(var84 >>> 25) + (var84 & 0x3F80)];
                        arg0[var16++] = ((var89 & 0xFF00FF) * var88 & 0xFF00FF00) + ((var89 & 0xFF00) * var88 & 0xFF0000) >> 8;
                        int var90 = var84 + var85;
                        int var91 = arg1[(var90 >>> 25) + (var90 & 0x3F80)];
                        arg0[var16++] = ((var91 & 0xFF00FF) * var88 & 0xFF00FF00) + ((var91 & 0xFF00) * var88 & 0xFF0000) >> 8;
                        int var92 = var85 + var90;
                        int var93 = arg1[(var92 >>> 25) + (var92 & 0x3F80)];
                        arg0[var16++] = ((var93 & 0xFF00FF) * var88 & 0xFF00FF00) + ((var93 & 0xFF00) * var88 & 0xFF0000) >> 8;
                        int var94 = var85 + var92;
                        int var95 = arg1[(var94 >>> 25) + (var94 & 0x3F80)];
                        arg0[var16++] = ((var95 & 0xFF00FF) * var88 & 0xFF00FF00) + ((var95 & 0xFF00) * var88 & 0xFF0000) >> 8;
                        int var96 = var85 + var94;
                        int var97 = arg1[(var96 >>> 25) + (var96 & 0x3F80)];
                        arg0[var16++] = ((var97 & 0xFF00FF) * var88 & 0xFF00FF00) + ((var97 & 0xFF00) * var88 & 0xFF0000) >> 8;
                        int var98 = var85 + var96;
                        int var99 = arg1[(var98 >>> 25) + (var98 & 0x3F80)];
                        arg0[var16++] = ((var99 & 0xFF00FF) * var88 & 0xFF00FF00) + ((var99 & 0xFF00) * var88 & 0xFF0000) >> 8;
                        int var100 = var85 + var98;
                        int var101 = arg1[(var100 >>> 25) + (var100 & 0x3F80)];
                        arg0[var16++] = ((var101 & 0xFF00FF) * var88 & 0xFF00FF00) + ((var101 & 0xFF00) * var88 & 0xFF0000) >> 8;
                        int var102 = var85 + var100;
                        int var103 = arg1[(var102 >>> 25) + (var102 & 0x3F80)];
                        arg0[var16++] = ((var103 & 0xFF00FF) * var88 & 0xFF00FF00) + ((var103 & 0xFF00) * var88 & 0xFF0000) >> 8;
                        var84 = var85 + var102;
                        var17 += var87;
                        var88 = var17 >> 8;
                        var86--;
                    } while (var86 > 0);
                }
                int var104 = arg6 - arg5 & 0x7;
                if (var104 > 0) {
                    do {
                        int var105 = arg1[(var84 >>> 25) + (var84 & 0x3F80)];
                        arg0[var16++] = ((var105 & 0xFF00FF) * var88 & 0xFF00FF00) + ((var105 & 0xFF00) * var88 & 0xFF0000) >> 8;
                        var84 += var85;
                        var104--;
                    } while (var104 > 0);
                }
            } else {
                if (var86 > 0) {
                    do {
                        int var106;
                        if ((var106 = arg1[(var84 >>> 25) + (var84 & 0x3F80)]) != 0) {
                            arg0[var16] = ((var106 & 0xFF00FF) * var88 & 0xFF00FF00) + ((var106 & 0xFF00) * var88 & 0xFF0000) >> 8;
                        }
                        var16++;
                        int var107 = var84 + var85;
                        int var108;
                        if ((var108 = arg1[(var107 >>> 25) + (var107 & 0x3F80)]) != 0) {
                            arg0[var16] = ((var108 & 0xFF00FF) * var88 & 0xFF00FF00) + ((var108 & 0xFF00) * var88 & 0xFF0000) >> 8;
                        }
                        var16++;
                        int var109 = var85 + var107;
                        int var110;
                        if ((var110 = arg1[(var109 >>> 25) + (var109 & 0x3F80)]) != 0) {
                            arg0[var16] = ((var110 & 0xFF00FF) * var88 & 0xFF00FF00) + ((var110 & 0xFF00) * var88 & 0xFF0000) >> 8;
                        }
                        var16++;
                        int var111 = var85 + var109;
                        int var112;
                        if ((var112 = arg1[(var111 >>> 25) + (var111 & 0x3F80)]) != 0) {
                            arg0[var16] = ((var112 & 0xFF00FF) * var88 & 0xFF00FF00) + ((var112 & 0xFF00) * var88 & 0xFF0000) >> 8;
                        }
                        var16++;
                        int var113 = var85 + var111;
                        int var114;
                        if ((var114 = arg1[(var113 >>> 25) + (var113 & 0x3F80)]) != 0) {
                            arg0[var16] = ((var114 & 0xFF00FF) * var88 & 0xFF00FF00) + ((var114 & 0xFF00) * var88 & 0xFF0000) >> 8;
                        }
                        var16++;
                        int var115 = var85 + var113;
                        int var116;
                        if ((var116 = arg1[(var115 >>> 25) + (var115 & 0x3F80)]) != 0) {
                            arg0[var16] = ((var116 & 0xFF00FF) * var88 & 0xFF00FF00) + ((var116 & 0xFF00) * var88 & 0xFF0000) >> 8;
                        }
                        var16++;
                        int var117 = var85 + var115;
                        int var118;
                        if ((var118 = arg1[(var117 >>> 25) + (var117 & 0x3F80)]) != 0) {
                            arg0[var16] = ((var118 & 0xFF00FF) * var88 & 0xFF00FF00) + ((var118 & 0xFF00) * var88 & 0xFF0000) >> 8;
                        }
                        var16++;
                        int var119 = var85 + var117;
                        int var120;
                        if ((var120 = arg1[(var119 >>> 25) + (var119 & 0x3F80)]) != 0) {
                            arg0[var16] = ((var120 & 0xFF00FF) * var88 & 0xFF00FF00) + ((var120 & 0xFF00) * var88 & 0xFF0000) >> 8;
                        }
                        var16++;
                        var84 = var85 + var119;
                        var17 += var87;
                        var88 = var17 >> 8;
                        var86--;
                    } while (var86 > 0);
                }
                int var121 = arg6 - arg5 & 0x7;
                if (var121 > 0) {
                    do {
                        int var122;
                        if ((var122 = arg1[(var84 >>> 25) + (var84 & 0x3F80)]) != 0) {
                            arg0[var16] = ((var122 & 0xFF00FF) * var88 & 0xFF00FF00) + ((var122 & 0xFF00) * var88 & 0xFF0000) >> 8;
                        }
                        var16++;
                        var84 += var85;
                        var121--;
                    } while (var121 > 0);
                }
            }
            return;
        }
        int var19 = arg5 - this.field2789.field3038;
        int var20 = arg12 * var19 + arg9;
        int var21 = arg13 * var19 + arg10;
        int var22 = arg14 * var19 + arg11;
        int var23 = var22 >> 12;
        int var24;
        int var25;
        if (var23 == 0) {
            var24 = 0;
            var25 = 0;
        } else {
            var24 = var20 / var23;
            var25 = var21 / var23;
        }
        int var26 = arg12 * var18 + var20;
        int var27 = arg13 * var18 + var21;
        int var28 = arg14 * var18 + var22;
        int var29 = var28 >> 12;
        int var30;
        int var31;
        if (var29 == 0) {
            var30 = 0;
            var31 = 0;
        } else {
            var30 = var26 / var29;
            var31 = var27 / var29;
        }
        int var32 = (var24 << 20) + var25;
        int var33 = ((var30 - var24) / var18 << 20) + (var31 - var25) / var18;
        int var34 = var18 >> 3;
        int var35 = arg8 << 3;
        int var36 = var17 >> 8;
        if (this.field2784) {
            if (var34 > 0) {
                do {
                    int var37 = arg1[(var32 >>> 26) + (var32 & 0xFC0)];
                    arg0[var16++] = ((var37 & 0xFF00FF) * var36 & 0xFF00FF00) + ((var37 & 0xFF00) * var36 & 0xFF0000) >> 8;
                    int var38 = var32 + var33;
                    int var39 = arg1[(var38 >>> 26) + (var38 & 0xFC0)];
                    arg0[var16++] = ((var39 & 0xFF00FF) * var36 & 0xFF00FF00) + ((var39 & 0xFF00) * var36 & 0xFF0000) >> 8;
                    int var40 = var33 + var38;
                    int var41 = arg1[(var40 >>> 26) + (var40 & 0xFC0)];
                    arg0[var16++] = ((var41 & 0xFF00FF) * var36 & 0xFF00FF00) + ((var41 & 0xFF00) * var36 & 0xFF0000) >> 8;
                    int var42 = var33 + var40;
                    int var43 = arg1[(var42 >>> 26) + (var42 & 0xFC0)];
                    arg0[var16++] = ((var43 & 0xFF00FF) * var36 & 0xFF00FF00) + ((var43 & 0xFF00) * var36 & 0xFF0000) >> 8;
                    int var44 = var33 + var42;
                    int var45 = arg1[(var44 >>> 26) + (var44 & 0xFC0)];
                    arg0[var16++] = ((var45 & 0xFF00FF) * var36 & 0xFF00FF00) + ((var45 & 0xFF00) * var36 & 0xFF0000) >> 8;
                    int var46 = var33 + var44;
                    int var47 = arg1[(var46 >>> 26) + (var46 & 0xFC0)];
                    arg0[var16++] = ((var47 & 0xFF00FF) * var36 & 0xFF00FF00) + ((var47 & 0xFF00) * var36 & 0xFF0000) >> 8;
                    int var48 = var33 + var46;
                    int var49 = arg1[(var48 >>> 26) + (var48 & 0xFC0)];
                    arg0[var16++] = ((var49 & 0xFF00FF) * var36 & 0xFF00FF00) + ((var49 & 0xFF00) * var36 & 0xFF0000) >> 8;
                    int var50 = var33 + var48;
                    int var51 = arg1[(var50 >>> 26) + (var50 & 0xFC0)];
                    arg0[var16++] = ((var51 & 0xFF00FF) * var36 & 0xFF00FF00) + ((var51 & 0xFF00) * var36 & 0xFF0000) >> 8;
                    var32 = var33 + var50;
                    var17 += var35;
                    var36 = var17 >> 8;
                    var34--;
                } while (var34 > 0);
            }
            int var52 = arg6 - arg5 & 0x7;
            if (var52 > 0) {
                do {
                    int var53 = arg1[(var32 >>> 26) + (var32 & 0xFC0)];
                    arg0[var16++] = ((var53 & 0xFF00FF) * var36 & 0xFF00FF00) + ((var53 & 0xFF00) * var36 & 0xFF0000) >> 8;
                    var32 += var33;
                    var52--;
                } while (var52 > 0);
            }
            return;
        }
        if (var34 > 0) {
            do {
                int var54;
                if ((var54 = arg1[(var32 >>> 26) + (var32 & 0xFC0)]) != 0) {
                    arg0[var16] = ((var54 & 0xFF00FF) * var36 & 0xFF00FF00) + ((var54 & 0xFF00) * var36 & 0xFF0000) >> 8;
                }
                var16++;
                int var55 = var32 + var33;
                int var56;
                if ((var56 = arg1[(var55 >>> 26) + (var55 & 0xFC0)]) != 0) {
                    arg0[var16] = ((var56 & 0xFF00FF) * var36 & 0xFF00FF00) + ((var56 & 0xFF00) * var36 & 0xFF0000) >> 8;
                }
                var16++;
                int var57 = var33 + var55;
                int var58;
                if ((var58 = arg1[(var57 >>> 26) + (var57 & 0xFC0)]) != 0) {
                    arg0[var16] = ((var58 & 0xFF00FF) * var36 & 0xFF00FF00) + ((var58 & 0xFF00) * var36 & 0xFF0000) >> 8;
                }
                var16++;
                int var59 = var33 + var57;
                int var60;
                if ((var60 = arg1[(var59 >>> 26) + (var59 & 0xFC0)]) != 0) {
                    arg0[var16] = ((var60 & 0xFF00FF) * var36 & 0xFF00FF00) + ((var60 & 0xFF00) * var36 & 0xFF0000) >> 8;
                }
                var16++;
                int var61 = var33 + var59;
                int var62;
                if ((var62 = arg1[(var61 >>> 26) + (var61 & 0xFC0)]) != 0) {
                    arg0[var16] = ((var62 & 0xFF00FF) * var36 & 0xFF00FF00) + ((var62 & 0xFF00) * var36 & 0xFF0000) >> 8;
                }
                var16++;
                int var63 = var33 + var61;
                int var64;
                if ((var64 = arg1[(var63 >>> 26) + (var63 & 0xFC0)]) != 0) {
                    arg0[var16] = ((var64 & 0xFF00FF) * var36 & 0xFF00FF00) + ((var64 & 0xFF00) * var36 & 0xFF0000) >> 8;
                }
                var16++;
                int var65 = var33 + var63;
                int var66;
                if ((var66 = arg1[(var65 >>> 26) + (var65 & 0xFC0)]) != 0) {
                    arg0[var16] = ((var66 & 0xFF00FF) * var36 & 0xFF00FF00) + ((var66 & 0xFF00) * var36 & 0xFF0000) >> 8;
                }
                var16++;
                int var67 = var33 + var65;
                int var68;
                if ((var68 = arg1[(var67 >>> 26) + (var67 & 0xFC0)]) != 0) {
                    arg0[var16] = ((var68 & 0xFF00FF) * var36 & 0xFF00FF00) + ((var68 & 0xFF00) * var36 & 0xFF0000) >> 8;
                }
                var16++;
                var32 = var33 + var67;
                var17 += var35;
                var36 = var17 >> 8;
                var34--;
            } while (var34 > 0);
        }
        int var69 = arg6 - arg5 & 0x7;
        if (var69 <= 0) {
            return;
        }
        do {
            int var70;
            if ((var70 = arg1[(var32 >>> 26) + (var32 & 0xFC0)]) != 0) {
                arg0[var16] = ((var70 & 0xFF00FF) * var36 & 0xFF00FF00) + ((var70 & 0xFF00) * var36 & 0xFF0000) >> 8;
            }
            var16++;
            var32 += var33;
            var69--;
        } while (var69 > 0);
    }
}

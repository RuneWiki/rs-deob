package deob;

@ObfuscatedName("kh")
public class class262 extends class243 {

    public class262(class261 arg0) {
        super(arg0);
    }

    @ObfuscatedName("kh.ay(IIIIIIFFFIII)V")
    public void method4654(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11) {
        int var13 = arg4 - arg3;
        int var14 = arg1 - arg0;
        int var15 = arg5 - arg3;
        int var16 = arg2 - arg0;
        int var17 = arg10 - arg9;
        int var18 = arg11 - arg9;
        float var19 = arg7 - arg6;
        float var20 = arg8 - arg6;
        int var21;
        if (arg1 == arg2) {
            var21 = 0;
        } else {
            var21 = (arg5 - arg4 << 14) / (arg2 - arg1);
        }
        int var22;
        if (arg0 == arg1) {
            var22 = 0;
        } else {
            var22 = (var13 << 14) / var14;
        }
        int var23;
        if (arg0 == arg2) {
            var23 = 0;
        } else {
            var23 = (var15 << 14) / var16;
        }
        int var24 = var13 * var16 - var14 * var15;
        if (var24 == 0) {
            return;
        }
        int var25 = (var16 * var17 - var14 * var18 << 8) / var24;
        int var26 = (var13 * var18 - var15 * var17 << 8) / var24;
        float var27 = ((float) var16 * var19 - (float) var14 * var20) / (float) var24;
        float var28 = ((float) var13 * var20 - (float) var15 * var19) / (float) var24;
        int[] var29 = this.field2624.field2926;
        int var30 = this.field2624.field2923;
        if (arg0 <= arg1 && arg0 <= arg2) {
            if (arg0 < var30) {
                if (arg1 > var30) {
                    arg1 = var30;
                }
                if (arg2 > var30) {
                    arg2 = var30;
                }
                int var31 = (arg9 << 8) - arg3 * var25 + var25;
                float var32 = arg6 - (float) arg3 * var27 + var27;
                if (arg1 < arg2) {
                    int var33;
                    int var34 = var33 = arg3 << 14;
                    if (arg0 < 0) {
                        var34 -= arg0 * var23;
                        var33 -= arg0 * var22;
                        var31 -= arg0 * var26;
                        var32 -= (float) arg0 * var28;
                        arg0 = 0;
                    }
                    int var35 = arg4 << 14;
                    if (arg1 < 0) {
                        var35 -= arg1 * var21;
                        arg1 = 0;
                    }
                    if ((arg0 == arg1 || var23 >= var22) && (arg0 != arg1 || var23 <= var21)) {
                        int var39 = arg2 - arg1;
                        int var40 = arg1 - arg0;
                        int var41 = var29[arg0];
                        while (true) {
                            var40--;
                            if (var40 < 0) {
                                while (true) {
                                    var39--;
                                    if (var39 < 0) {
                                        return;
                                    }
                                    this.method5185(Statics.field5533, var41, 0, 0, var35 >> 14, var34 >> 14, var31, var25, var32, var27);
                                    var34 += var23;
                                    var35 += var21;
                                    var31 += var26;
                                    var41 += Statics.field5532;
                                    var32 += var28;
                                }
                            }
                            this.method5185(Statics.field5533, var41, 0, 0, var33 >> 14, var34 >> 14, var31, var25, var32, var27);
                            var34 += var23;
                            var33 += var22;
                            var31 += var26;
                            var41 += Statics.field5532;
                            var32 += var28;
                        }
                    } else {
                        int var36 = arg2 - arg1;
                        int var37 = arg1 - arg0;
                        int var38 = var29[arg0];
                        while (true) {
                            var37--;
                            if (var37 < 0) {
                                while (true) {
                                    var36--;
                                    if (var36 < 0) {
                                        return;
                                    }
                                    this.method5185(Statics.field5533, var38, 0, 0, var34 >> 14, var35 >> 14, var31, var25, var32, var27);
                                    var34 += var23;
                                    var35 += var21;
                                    var31 += var26;
                                    var38 += Statics.field5532;
                                    var32 += var28;
                                }
                            }
                            this.method5185(Statics.field5533, var38, 0, 0, var34 >> 14, var33 >> 14, var31, var25, var32, var27);
                            var34 += var23;
                            var33 += var22;
                            var31 += var26;
                            var38 += Statics.field5532;
                            var32 += var28;
                        }
                    }
                } else {
                    int var42;
                    int var43 = var42 = arg3 << 14;
                    if (arg0 < 0) {
                        var43 -= arg0 * var23;
                        var42 -= arg0 * var22;
                        var31 -= arg0 * var26;
                        var32 -= (float) arg0 * var28;
                        arg0 = 0;
                    }
                    int var44 = arg5 << 14;
                    if (arg2 < 0) {
                        var44 -= arg2 * var21;
                        arg2 = 0;
                    }
                    if (arg0 != arg2 && var23 < var22 || arg0 == arg2 && var21 > var22) {
                        int var45 = arg1 - arg2;
                        int var46 = arg2 - arg0;
                        int var47 = var29[arg0];
                        while (true) {
                            var46--;
                            if (var46 < 0) {
                                while (true) {
                                    var45--;
                                    if (var45 < 0) {
                                        return;
                                    }
                                    this.method5185(Statics.field5533, var47, 0, 0, var44 >> 14, var42 >> 14, var31, var25, var32, var27);
                                    var44 += var21;
                                    var42 += var22;
                                    var31 += var26;
                                    var47 += Statics.field5532;
                                    var32 += var28;
                                }
                            }
                            this.method5185(Statics.field5533, var47, 0, 0, var43 >> 14, var42 >> 14, var31, var25, var32, var27);
                            var43 += var23;
                            var42 += var22;
                            var31 += var26;
                            var47 += Statics.field5532;
                            var32 += var28;
                        }
                    } else {
                        int var48 = arg1 - arg2;
                        int var49 = arg2 - arg0;
                        int var50 = var29[arg0];
                        while (true) {
                            var49--;
                            if (var49 < 0) {
                                while (true) {
                                    var48--;
                                    if (var48 < 0) {
                                        return;
                                    }
                                    this.method5185(Statics.field5533, var50, 0, 0, var42 >> 14, var44 >> 14, var31, var25, var32, var27);
                                    var44 += var21;
                                    var42 += var22;
                                    var31 += var26;
                                    var50 += Statics.field5532;
                                    var32 += var28;
                                }
                            }
                            this.method5185(Statics.field5533, var50, 0, 0, var42 >> 14, var43 >> 14, var31, var25, var32, var27);
                            var43 += var23;
                            var42 += var22;
                            var31 += var26;
                            var50 += Statics.field5532;
                            var32 += var28;
                        }
                    }
                }
            }
        } else if (arg1 <= arg2) {
            if (arg1 < var30) {
                if (arg2 > var30) {
                    arg2 = var30;
                }
                if (arg0 > var30) {
                    arg0 = var30;
                }
                int var51 = (arg10 << 8) - arg4 * var25 + var25;
                float var52 = arg7 - (float) arg4 * var27 + var27;
                if (arg2 < arg0) {
                    int var53;
                    int var54 = var53 = arg4 << 14;
                    if (arg1 < 0) {
                        var54 -= arg1 * var22;
                        var53 -= arg1 * var21;
                        var51 -= arg1 * var26;
                        var52 -= (float) arg1 * var28;
                        arg1 = 0;
                    }
                    int var55 = arg5 << 14;
                    if (arg2 < 0) {
                        var55 -= arg2 * var23;
                        arg2 = 0;
                    }
                    if ((arg1 == arg2 || var22 >= var21) && (arg1 != arg2 || var22 <= var23)) {
                        int var59 = arg0 - arg2;
                        int var60 = arg2 - arg1;
                        int var61 = var29[arg1];
                        while (true) {
                            var60--;
                            if (var60 < 0) {
                                while (true) {
                                    var59--;
                                    if (var59 < 0) {
                                        return;
                                    }
                                    this.method5185(Statics.field5533, var61, 0, 0, var55 >> 14, var54 >> 14, var51, var25, var52, var27);
                                    var54 += var22;
                                    var55 += var23;
                                    var51 += var26;
                                    var61 += Statics.field5532;
                                    var52 += var28;
                                }
                            }
                            this.method5185(Statics.field5533, var61, 0, 0, var53 >> 14, var54 >> 14, var51, var25, var52, var27);
                            var54 += var22;
                            var53 += var21;
                            var51 += var26;
                            var61 += Statics.field5532;
                            var52 += var28;
                        }
                    } else {
                        int var56 = arg0 - arg2;
                        int var57 = arg2 - arg1;
                        int var58 = var29[arg1];
                        while (true) {
                            var57--;
                            if (var57 < 0) {
                                while (true) {
                                    var56--;
                                    if (var56 < 0) {
                                        return;
                                    }
                                    this.method5185(Statics.field5533, var58, 0, 0, var54 >> 14, var55 >> 14, var51, var25, var52, var27);
                                    var54 += var22;
                                    var55 += var23;
                                    var51 += var26;
                                    var58 += Statics.field5532;
                                    var52 += var28;
                                }
                            }
                            this.method5185(Statics.field5533, var58, 0, 0, var54 >> 14, var53 >> 14, var51, var25, var52, var27);
                            var54 += var22;
                            var53 += var21;
                            var51 += var26;
                            var58 += Statics.field5532;
                            var52 += var28;
                        }
                    }
                } else {
                    int var62;
                    int var63 = var62 = arg4 << 14;
                    if (arg1 < 0) {
                        var63 -= arg1 * var22;
                        var62 -= arg1 * var21;
                        var51 -= arg1 * var26;
                        var52 -= (float) arg1 * var28;
                        arg1 = 0;
                    }
                    int var64 = arg3 << 14;
                    if (arg0 < 0) {
                        var64 -= arg0 * var23;
                        arg0 = 0;
                    }
                    if (var22 < var21) {
                        int var65 = arg2 - arg0;
                        int var66 = arg0 - arg1;
                        int var67 = var29[arg1];
                        while (true) {
                            var66--;
                            if (var66 < 0) {
                                while (true) {
                                    var65--;
                                    if (var65 < 0) {
                                        return;
                                    }
                                    this.method5185(Statics.field5533, var67, 0, 0, var64 >> 14, var62 >> 14, var51, var25, var52, var27);
                                    var64 += var23;
                                    var62 += var21;
                                    var51 += var26;
                                    var67 += Statics.field5532;
                                    var52 += var28;
                                }
                            }
                            this.method5185(Statics.field5533, var67, 0, 0, var63 >> 14, var62 >> 14, var51, var25, var52, var27);
                            var63 += var22;
                            var62 += var21;
                            var51 += var26;
                            var67 += Statics.field5532;
                            var52 += var28;
                        }
                    } else {
                        int var68 = arg2 - arg0;
                        int var69 = arg0 - arg1;
                        int var70 = var29[arg1];
                        while (true) {
                            var69--;
                            if (var69 < 0) {
                                while (true) {
                                    var68--;
                                    if (var68 < 0) {
                                        return;
                                    }
                                    this.method5185(Statics.field5533, var70, 0, 0, var62 >> 14, var64 >> 14, var51, var25, var52, var27);
                                    var64 += var23;
                                    var62 += var21;
                                    var51 += var26;
                                    var70 += Statics.field5532;
                                    var52 += var28;
                                }
                            }
                            this.method5185(Statics.field5533, var70, 0, 0, var62 >> 14, var63 >> 14, var51, var25, var52, var27);
                            var63 += var22;
                            var62 += var21;
                            var51 += var26;
                            var70 += Statics.field5532;
                            var52 += var28;
                        }
                    }
                }
            }
        } else if (arg2 < var30) {
            if (arg0 > var30) {
                arg0 = var30;
            }
            if (arg1 > var30) {
                arg1 = var30;
            }
            int var71 = (arg11 << 8) - arg5 * var25 + var25;
            float var72 = arg8 - (float) arg5 * var27 + var27;
            if (arg0 < arg1) {
                int var73;
                int var74 = var73 = arg5 << 14;
                if (arg2 < 0) {
                    var74 -= arg2 * var21;
                    var73 -= arg2 * var23;
                    var71 -= arg2 * var26;
                    var72 -= (float) arg2 * var28;
                    arg2 = 0;
                }
                int var75 = arg3 << 14;
                if (arg0 < 0) {
                    var75 -= arg0 * var22;
                    arg0 = 0;
                }
                if (var21 < var23) {
                    int var76 = arg1 - arg0;
                    int var77 = arg0 - arg2;
                    int var78 = var29[arg2];
                    while (true) {
                        var77--;
                        if (var77 < 0) {
                            while (true) {
                                var76--;
                                if (var76 < 0) {
                                    return;
                                }
                                this.method5185(Statics.field5533, var78, 0, 0, var74 >> 14, var75 >> 14, var71, var25, var72, var27);
                                var74 += var21;
                                var75 += var22;
                                var71 += var26;
                                var78 += Statics.field5532;
                                var72 += var28;
                            }
                        }
                        this.method5185(Statics.field5533, var78, 0, 0, var74 >> 14, var73 >> 14, var71, var25, var72, var27);
                        var74 += var21;
                        var73 += var23;
                        var71 += var26;
                        var78 += Statics.field5532;
                        var72 += var28;
                    }
                } else {
                    int var79 = arg1 - arg0;
                    int var80 = arg0 - arg2;
                    int var81 = var29[arg2];
                    while (true) {
                        var80--;
                        if (var80 < 0) {
                            while (true) {
                                var79--;
                                if (var79 < 0) {
                                    return;
                                }
                                this.method5185(Statics.field5533, var81, 0, 0, var75 >> 14, var74 >> 14, var71, var25, var72, var27);
                                var74 += var21;
                                var75 += var22;
                                var71 += var26;
                                var81 += Statics.field5532;
                                var72 += var28;
                            }
                        }
                        this.method5185(Statics.field5533, var81, 0, 0, var73 >> 14, var74 >> 14, var71, var25, var72, var27);
                        var74 += var21;
                        var73 += var23;
                        var71 += var26;
                        var81 += Statics.field5532;
                        var72 += var28;
                    }
                }
            } else {
                int var82;
                int var83 = var82 = arg5 << 14;
                if (arg2 < 0) {
                    var83 -= arg2 * var21;
                    var82 -= arg2 * var23;
                    var71 -= arg2 * var26;
                    var72 -= (float) arg2 * var28;
                    arg2 = 0;
                }
                int var84 = arg4 << 14;
                if (arg1 < 0) {
                    var84 -= arg1 * var22;
                    arg1 = 0;
                }
                if (var21 < var23) {
                    int var85 = arg0 - arg1;
                    int var86 = arg1 - arg2;
                    int var87 = var29[arg2];
                    while (true) {
                        var86--;
                        if (var86 < 0) {
                            while (true) {
                                var85--;
                                if (var85 < 0) {
                                    return;
                                }
                                this.method5185(Statics.field5533, var87, 0, 0, var84 >> 14, var82 >> 14, var71, var25, var72, var27);
                                var84 += var22;
                                var82 += var23;
                                var71 += var26;
                                var87 += Statics.field5532;
                                var72 += var28;
                            }
                        }
                        this.method5185(Statics.field5533, var87, 0, 0, var83 >> 14, var82 >> 14, var71, var25, var72, var27);
                        var83 += var21;
                        var82 += var23;
                        var71 += var26;
                        var87 += Statics.field5532;
                        var72 += var28;
                    }
                } else {
                    int var88 = arg0 - arg1;
                    int var89 = arg1 - arg2;
                    int var90 = var29[arg2];
                    while (true) {
                        var89--;
                        if (var89 < 0) {
                            while (true) {
                                var88--;
                                if (var88 < 0) {
                                    return;
                                }
                                this.method5185(Statics.field5533, var90, 0, 0, var82 >> 14, var84 >> 14, var71, var25, var72, var27);
                                var84 += var22;
                                var82 += var23;
                                var71 += var26;
                                var90 += Statics.field5532;
                                var72 += var28;
                            }
                        }
                        this.method5185(Statics.field5533, var90, 0, 0, var82 >> 14, var83 >> 14, var71, var25, var72, var27);
                        var83 += var21;
                        var82 += var23;
                        var71 += var26;
                        var90 += Statics.field5532;
                        var72 += var28;
                    }
                }
            }
        }
    }

    @ObfuscatedName("kh.bf([I[FIIF)V")
    public final void method5186(int[] arg0, float[] arg1, int arg2, int arg3, float arg4) {
        int var6 = method5210(arg1[arg2], arg4) ? 1 : 0;
        int var7 = 1 - var6;
        arg0[arg2] = arg0[arg2] * var7 + arg3 * var6;
        arg1[arg2] = arg1[arg2] * (float) var7 + (float) var6 * arg4;
    }

    @ObfuscatedName("kh.bg([I[FIIF)V")
    public final void method5176(int[] arg0, float[] arg1, int arg2, int arg3, float arg4) {
        if (method5210(arg1[arg2], arg4)) {
            int var6 = (arg3 & (arg3 >> 31 & 0x1) - 1) >> 8;
            arg0[arg2] = this.field2623[var6];
            arg1[arg2] = arg4;
        }
    }

    @ObfuscatedName("kh.bl([I[FIIIF)V")
    public final void method5181(int[] arg0, float[] arg1, int arg2, int arg3, int arg4, float arg5) {
        if (method5210(arg1[arg2], arg5)) {
            int var7 = arg0[arg2];
            arg0[arg2] = ((var7 & 0xFF00) * arg4 >> 8 & 0xFF00) + ((var7 & 0xFF00FF) * arg4 >> 8 & 0xFF00FF) + arg3;
        }
    }

    @ObfuscatedName("kh.be([I[FIIIIF)V")
    public final void method5178(int[] arg0, float[] arg1, int arg2, int arg3, int arg4, int arg5, float arg6) {
        if (!method5210(arg1[arg2], arg6)) {
            return;
        }
        int var8 = (arg3 & (arg3 >> 31 & 0x1) - 1) >> 8;
        int var9 = this.field2623[var8];
        int var10 = ((var9 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((var9 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var11 = arg0[arg2];
        arg0[arg2] = ((var11 & 0xFF00) * arg4 >> 8 & 0xFF00) + ((var11 & 0xFF00FF) * arg4 >> 8 & 0xFF00FF) + var10;
    }

    @ObfuscatedName("kh.cq([IIIIIIIIFF)V")
    public final void method5185(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, float arg8, float arg9) {
        if (this.field2624.field2933) {
            if (arg5 > this.field2624.field2927) {
                arg5 = this.field2624.field2927;
            }
            if (arg4 < 0) {
                arg4 = 0;
            }
        }
        if (arg4 >= arg5) {
            return;
        }
        int var11 = arg1 + arg4;
        int var12 = arg4 * arg7 + arg6;
        float var13 = (float) arg4 * arg9 + arg8;
        if (!this.field2624.field2914) {
            int var36 = arg5 - arg4;
            if (this.field2624.field2917 == 0) {
                do {
                    this.method5176(arg0, Statics.field5534, var11, var12, var13);
                    var13 += arg9;
                    var11++;
                    var12 += arg7;
                    var36--;
                } while (var36 > 0);
            } else {
                int var37 = this.field2624.field2917;
                int var38 = 256 - this.field2624.field2917;
                do {
                    this.method5178(arg0, Statics.field5534, var11, arg2, var37, var38, var13);
                    var13 += arg9;
                    var11++;
                    var12 += arg7;
                    var36--;
                } while (var36 > 0);
            }
            return;
        }
        int var14 = arg5 - arg4 >> 2;
        int var15 = arg7 << 2;
        if (this.field2624.field2917 == 0) {
            if (var14 > 0) {
                do {
                    int var16 = (var12 & (var12 >> 31 & 0x1) - 1) >> 8;
                    int var17 = this.field2623[var16];
                    var12 += var15;
                    this.method5186(arg0, Statics.field5534, var11, var17, var13);
                    float var18 = arg9 + var13;
                    var11++;
                    this.method5186(arg0, Statics.field5534, var11, var17, var18);
                    float var19 = arg9 + var18;
                    var11++;
                    this.method5186(arg0, Statics.field5534, var11, var17, var19);
                    float var20 = arg9 + var19;
                    var11++;
                    this.method5186(arg0, Statics.field5534, var11, var17, var20);
                    var13 = arg9 + var20;
                    var11++;
                    var14--;
                } while (var14 > 0);
            }
            int var21 = arg5 - arg4 & 0x3;
            if (var21 > 0) {
                int var22 = (var12 & (var12 >> 31 & 0x1) - 1) >> 8;
                int var23 = this.field2623[var22];
                do {
                    this.method5186(arg0, Statics.field5534, var11, var23, var13);
                    var13 += arg9;
                    var11++;
                    var21--;
                } while (var21 > 0);
            }
            return;
        }
        int var24 = this.field2624.field2917;
        int var25 = 256 - this.field2624.field2917;
        if (var14 > 0) {
            do {
                int var26 = (var12 & (var12 >> 31 & 0x1) - 1) >> 8;
                int var27 = this.field2623[var26];
                var12 += var15;
                int var28 = ((var27 & 0xFF00FF) * var25 >> 8 & 0xFF00FF) + ((var27 & 0xFF00) * var25 >> 8 & 0xFF00);
                this.method5181(arg0, Statics.field5534, var11, var28, var24, var13);
                var11++;
                float var29 = arg9 + var13;
                this.method5181(arg0, Statics.field5534, var11, var28, var24, var29);
                var11++;
                float var30 = arg9 + var29;
                this.method5181(arg0, Statics.field5534, var11, var28, var24, var30);
                var11++;
                float var31 = arg9 + var30;
                this.method5181(arg0, Statics.field5534, var11, var28, var24, var31);
                var11++;
                var13 = arg9 + var31;
                var14--;
            } while (var14 > 0);
        }
        int var32 = arg5 - arg4 & 0x3;
        if (var32 <= 0) {
            return;
        }
        int var33 = (var12 & (var12 >> 31 & 0x1) - 1) >> 8;
        int var34 = this.field2623[var33];
        int var35 = ((var34 & 0xFF00FF) * var25 >> 8 & 0xFF00FF) + ((var34 & 0xFF00) * var25 >> 8 & 0xFF00);
        do {
            this.method5181(arg0, Statics.field5534, var11, var35, var24, var13);
            var11++;
            var13 += arg9;
            var32--;
        } while (var32 > 0);
    }

    @ObfuscatedName("kh.as(IIIIIIFFFI)V")
    public void method4626(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9) {
        int var11 = arg4 - arg3;
        int var12 = arg1 - arg0;
        int var13 = arg5 - arg3;
        int var14 = arg2 - arg0;
        float var15 = arg7 - arg6;
        float var16 = arg8 - arg6;
        int var17;
        if (arg1 == arg2) {
            var17 = 0;
        } else {
            var17 = (arg5 - arg4 << 14) / (arg2 - arg1);
        }
        int var18;
        if (arg0 == arg1) {
            var18 = 0;
        } else {
            var18 = (var11 << 14) / var12;
        }
        int var19;
        if (arg0 == arg2) {
            var19 = 0;
        } else {
            var19 = (var13 << 14) / var14;
        }
        int var20 = var11 * var14 - var12 * var13;
        if (var20 == 0) {
            return;
        }
        float var21 = ((float) var14 * var15 - (float) var12 * var16) / (float) var20;
        float var22 = ((float) var11 * var16 - (float) var13 * var15) / (float) var20;
        int[] var23 = this.field2624.field2926;
        int var24 = this.field2624.field2923;
        if (arg0 <= arg1 && arg0 <= arg2) {
            if (arg0 < var24) {
                if (arg1 > var24) {
                    arg1 = var24;
                }
                if (arg2 > var24) {
                    arg2 = var24;
                }
                float var25 = arg6 - (float) arg3 * var21 + var21;
                if (arg1 < arg2) {
                    int var26;
                    int var27 = var26 = arg3 << 14;
                    if (arg0 < 0) {
                        var27 -= arg0 * var19;
                        var26 -= arg0 * var18;
                        var25 -= (float) arg0 * var22;
                        arg0 = 0;
                    }
                    int var28 = arg4 << 14;
                    if (arg1 < 0) {
                        var28 -= arg1 * var17;
                        arg1 = 0;
                    }
                    if ((arg0 == arg1 || var19 >= var18) && (arg0 != arg1 || var19 <= var17)) {
                        int var32 = arg2 - arg1;
                        int var33 = arg1 - arg0;
                        int var34 = var23[arg0];
                        while (true) {
                            var33--;
                            if (var33 < 0) {
                                while (true) {
                                    var32--;
                                    if (var32 < 0) {
                                        return;
                                    }
                                    this.method5179(Statics.field5533, var34, arg9, 0, var28 >> 14, var27 >> 14, var25, var21);
                                    var27 += var19;
                                    var28 += var17;
                                    var34 += Statics.field5532;
                                    var25 += var22;
                                }
                            }
                            this.method5179(Statics.field5533, var34, arg9, 0, var26 >> 14, var27 >> 14, var25, var21);
                            var27 += var19;
                            var26 += var18;
                            var34 += Statics.field5532;
                            var25 += var22;
                        }
                    } else {
                        int var29 = arg2 - arg1;
                        int var30 = arg1 - arg0;
                        int var31 = var23[arg0];
                        while (true) {
                            var30--;
                            if (var30 < 0) {
                                while (true) {
                                    var29--;
                                    if (var29 < 0) {
                                        return;
                                    }
                                    this.method5179(Statics.field5533, var31, arg9, 0, var27 >> 14, var28 >> 14, var25, var21);
                                    var27 += var19;
                                    var28 += var17;
                                    var31 += Statics.field5532;
                                    var25 += var22;
                                }
                            }
                            this.method5179(Statics.field5533, var31, arg9, 0, var27 >> 14, var26 >> 14, var25, var21);
                            var27 += var19;
                            var26 += var18;
                            var31 += Statics.field5532;
                            var25 += var22;
                        }
                    }
                } else {
                    int var35;
                    int var36 = var35 = arg3 << 14;
                    if (arg0 < 0) {
                        var36 -= arg0 * var19;
                        var35 -= arg0 * var18;
                        var25 -= (float) arg0 * var22;
                        arg0 = 0;
                    }
                    int var37 = arg5 << 14;
                    if (arg2 < 0) {
                        var37 -= arg2 * var17;
                        arg2 = 0;
                    }
                    if (arg0 != arg2 && var19 < var18 || arg0 == arg2 && var17 > var18) {
                        int var38 = arg1 - arg2;
                        int var39 = arg2 - arg0;
                        int var40 = var23[arg0];
                        while (true) {
                            var39--;
                            if (var39 < 0) {
                                while (true) {
                                    var38--;
                                    if (var38 < 0) {
                                        return;
                                    }
                                    this.method5179(Statics.field5533, var40, arg9, 0, var37 >> 14, var35 >> 14, var25, var21);
                                    var37 += var17;
                                    var35 += var18;
                                    var40 += Statics.field5532;
                                    var25 += var22;
                                }
                            }
                            this.method5179(Statics.field5533, var40, arg9, 0, var36 >> 14, var35 >> 14, var25, var21);
                            var36 += var19;
                            var35 += var18;
                            var40 += Statics.field5532;
                            var25 += var22;
                        }
                    } else {
                        int var41 = arg1 - arg2;
                        int var42 = arg2 - arg0;
                        int var43 = var23[arg0];
                        while (true) {
                            var42--;
                            if (var42 < 0) {
                                while (true) {
                                    var41--;
                                    if (var41 < 0) {
                                        return;
                                    }
                                    this.method5179(Statics.field5533, var43, arg9, 0, var35 >> 14, var37 >> 14, var25, var21);
                                    var37 += var17;
                                    var35 += var18;
                                    var43 += Statics.field5532;
                                    var25 += var22;
                                }
                            }
                            this.method5179(Statics.field5533, var43, arg9, 0, var35 >> 14, var36 >> 14, var25, var21);
                            var36 += var19;
                            var35 += var18;
                            var43 += Statics.field5532;
                            var25 += var22;
                        }
                    }
                }
            }
        } else if (arg1 <= arg2) {
            if (arg1 < var24) {
                if (arg2 > var24) {
                    arg2 = var24;
                }
                if (arg0 > var24) {
                    arg0 = var24;
                }
                float var44 = arg7 - (float) arg4 * var21 + var21;
                if (arg2 < arg0) {
                    int var45;
                    int var46 = var45 = arg4 << 14;
                    if (arg1 < 0) {
                        var46 -= arg1 * var18;
                        var45 -= arg1 * var17;
                        var44 -= (float) arg1 * var22;
                        arg1 = 0;
                    }
                    int var47 = arg5 << 14;
                    if (arg2 < 0) {
                        var47 -= arg2 * var19;
                        arg2 = 0;
                    }
                    if ((arg1 == arg2 || var18 >= var17) && (arg1 != arg2 || var18 <= var19)) {
                        int var51 = arg0 - arg2;
                        int var52 = arg2 - arg1;
                        int var53 = var23[arg1];
                        while (true) {
                            var52--;
                            if (var52 < 0) {
                                while (true) {
                                    var51--;
                                    if (var51 < 0) {
                                        return;
                                    }
                                    this.method5179(Statics.field5533, var53, arg9, 0, var47 >> 14, var46 >> 14, var44, var21);
                                    var46 += var18;
                                    var47 += var19;
                                    var53 += Statics.field5532;
                                    var44 += var22;
                                }
                            }
                            this.method5179(Statics.field5533, var53, arg9, 0, var45 >> 14, var46 >> 14, var44, var21);
                            var46 += var18;
                            var45 += var17;
                            var53 += Statics.field5532;
                            var44 += var22;
                        }
                    } else {
                        int var48 = arg0 - arg2;
                        int var49 = arg2 - arg1;
                        int var50 = var23[arg1];
                        while (true) {
                            var49--;
                            if (var49 < 0) {
                                while (true) {
                                    var48--;
                                    if (var48 < 0) {
                                        return;
                                    }
                                    this.method5179(Statics.field5533, var50, arg9, 0, var46 >> 14, var47 >> 14, var44, var21);
                                    var46 += var18;
                                    var47 += var19;
                                    var50 += Statics.field5532;
                                    var44 += var22;
                                }
                            }
                            this.method5179(Statics.field5533, var50, arg9, 0, var46 >> 14, var45 >> 14, var44, var21);
                            var46 += var18;
                            var45 += var17;
                            var50 += Statics.field5532;
                            var44 += var22;
                        }
                    }
                } else {
                    int var54;
                    int var55 = var54 = arg4 << 14;
                    if (arg1 < 0) {
                        var55 -= arg1 * var18;
                        var54 -= arg1 * var17;
                        var44 -= (float) arg1 * var22;
                        arg1 = 0;
                    }
                    int var56 = arg3 << 14;
                    if (arg0 < 0) {
                        var56 -= arg0 * var19;
                        arg0 = 0;
                    }
                    if (var18 < var17) {
                        int var57 = arg2 - arg0;
                        int var58 = arg0 - arg1;
                        int var59 = var23[arg1];
                        while (true) {
                            var58--;
                            if (var58 < 0) {
                                while (true) {
                                    var57--;
                                    if (var57 < 0) {
                                        return;
                                    }
                                    this.method5179(Statics.field5533, var59, arg9, 0, var56 >> 14, var54 >> 14, var44, var21);
                                    var56 += var19;
                                    var54 += var17;
                                    var59 += Statics.field5532;
                                    var44 += var22;
                                }
                            }
                            this.method5179(Statics.field5533, var59, arg9, 0, var55 >> 14, var54 >> 14, var44, var21);
                            var55 += var18;
                            var54 += var17;
                            var59 += Statics.field5532;
                            var44 += var22;
                        }
                    } else {
                        int var60 = arg2 - arg0;
                        int var61 = arg0 - arg1;
                        int var62 = var23[arg1];
                        while (true) {
                            var61--;
                            if (var61 < 0) {
                                while (true) {
                                    var60--;
                                    if (var60 < 0) {
                                        return;
                                    }
                                    this.method5179(Statics.field5533, var62, arg9, 0, var54 >> 14, var56 >> 14, var44, var21);
                                    var56 += var19;
                                    var54 += var17;
                                    var62 += Statics.field5532;
                                    var44 += var22;
                                }
                            }
                            this.method5179(Statics.field5533, var62, arg9, 0, var54 >> 14, var55 >> 14, var44, var21);
                            var55 += var18;
                            var54 += var17;
                            var62 += Statics.field5532;
                            var44 += var22;
                        }
                    }
                }
            }
        } else if (arg2 < var24) {
            if (arg0 > var24) {
                arg0 = var24;
            }
            if (arg1 > var24) {
                arg1 = var24;
            }
            float var63 = arg8 - (float) arg5 * var21 + var21;
            if (arg0 < arg1) {
                int var64;
                int var65 = var64 = arg5 << 14;
                if (arg2 < 0) {
                    var65 -= arg2 * var17;
                    var64 -= arg2 * var19;
                    var63 -= (float) arg2 * var22;
                    arg2 = 0;
                }
                int var66 = arg3 << 14;
                if (arg0 < 0) {
                    var66 -= arg0 * var18;
                    arg0 = 0;
                }
                if (var17 < var19) {
                    int var67 = arg1 - arg0;
                    int var68 = arg0 - arg2;
                    int var69 = var23[arg2];
                    while (true) {
                        var68--;
                        if (var68 < 0) {
                            while (true) {
                                var67--;
                                if (var67 < 0) {
                                    return;
                                }
                                this.method5179(Statics.field5533, var69, arg9, 0, var65 >> 14, var66 >> 14, var63, var21);
                                var65 += var17;
                                var66 += var18;
                                var69 += Statics.field5532;
                                var63 += var22;
                            }
                        }
                        this.method5179(Statics.field5533, var69, arg9, 0, var65 >> 14, var64 >> 14, var63, var21);
                        var65 += var17;
                        var64 += var19;
                        var69 += Statics.field5532;
                        var63 += var22;
                    }
                } else {
                    int var70 = arg1 - arg0;
                    int var71 = arg0 - arg2;
                    int var72 = var23[arg2];
                    while (true) {
                        var71--;
                        if (var71 < 0) {
                            while (true) {
                                var70--;
                                if (var70 < 0) {
                                    return;
                                }
                                this.method5179(Statics.field5533, var72, arg9, 0, var66 >> 14, var65 >> 14, var63, var21);
                                var65 += var17;
                                var66 += var18;
                                var72 += Statics.field5532;
                                var63 += var22;
                            }
                        }
                        this.method5179(Statics.field5533, var72, arg9, 0, var64 >> 14, var65 >> 14, var63, var21);
                        var65 += var17;
                        var64 += var19;
                        var72 += Statics.field5532;
                        var63 += var22;
                    }
                }
            } else {
                int var73;
                int var74 = var73 = arg5 << 14;
                if (arg2 < 0) {
                    var74 -= arg2 * var17;
                    var73 -= arg2 * var19;
                    var63 -= (float) arg2 * var22;
                    arg2 = 0;
                }
                int var75 = arg4 << 14;
                if (arg1 < 0) {
                    var75 -= arg1 * var18;
                    arg1 = 0;
                }
                if (var17 < var19) {
                    int var76 = arg0 - arg1;
                    int var77 = arg1 - arg2;
                    int var78 = var23[arg2];
                    while (true) {
                        var77--;
                        if (var77 < 0) {
                            while (true) {
                                var76--;
                                if (var76 < 0) {
                                    return;
                                }
                                this.method5179(Statics.field5533, var78, arg9, 0, var75 >> 14, var73 >> 14, var63, var21);
                                var75 += var18;
                                var73 += var19;
                                var78 += Statics.field5532;
                                var63 += var22;
                            }
                        }
                        this.method5179(Statics.field5533, var78, arg9, 0, var74 >> 14, var73 >> 14, var63, var21);
                        var74 += var17;
                        var73 += var19;
                        var78 += Statics.field5532;
                        var63 += var22;
                    }
                } else {
                    int var79 = arg0 - arg1;
                    int var80 = arg1 - arg2;
                    int var81 = var23[arg2];
                    while (true) {
                        var80--;
                        if (var80 < 0) {
                            while (true) {
                                var79--;
                                if (var79 < 0) {
                                    return;
                                }
                                this.method5179(Statics.field5533, var81, arg9, 0, var73 >> 14, var75 >> 14, var63, var21);
                                var75 += var18;
                                var73 += var19;
                                var81 += Statics.field5532;
                                var63 += var22;
                            }
                        }
                        this.method5179(Statics.field5533, var81, arg9, 0, var73 >> 14, var74 >> 14, var63, var21);
                        var74 += var17;
                        var73 += var19;
                        var81 += Statics.field5532;
                        var63 += var22;
                    }
                }
            }
        }
    }

    @ObfuscatedName("kh.cb([IIIIIIFF)V")
    public final void method5179(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7) {
        if (this.field2624.field2933) {
            if (arg5 > this.field2624.field2927) {
                arg5 = this.field2624.field2927;
            }
            if (arg4 < 0) {
                arg4 = 0;
            }
        }
        if (arg4 >= arg5) {
            return;
        }
        int var9 = arg1 + arg4;
        int var10 = arg5 - arg4 >> 2;
        float var11 = (float) arg4 * arg7 + arg6;
        if (this.field2624.field2917 == 0) {
            while (true) {
                var10--;
                if (var10 < 0) {
                    int var15 = arg5 - arg4 & 0x3;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            return;
                        }
                        this.method5186(arg0, Statics.field5534, var9, arg2, var11);
                        var11 += arg7;
                        var9++;
                    }
                }
                this.method5186(arg0, Statics.field5534, var9, arg2, var11);
                float var12 = arg7 + var11;
                var9++;
                this.method5186(arg0, Statics.field5534, var9, arg2, var12);
                float var13 = arg7 + var12;
                var9++;
                this.method5186(arg0, Statics.field5534, var9, arg2, var13);
                float var14 = arg7 + var13;
                var9++;
                this.method5186(arg0, Statics.field5534, var9, arg2, var14);
                var11 = arg7 + var14;
                var9++;
            }
        } else if (this.field2624.field2917 == 254) {
            while (true) {
                var10--;
                if (var10 < 0) {
                    int var16 = arg5 - arg4 & 0x3;
                    while (true) {
                        var16--;
                        if (var16 < 0) {
                            return;
                        }
                        arg0[var9++] = arg0[var9];
                    }
                }
                arg0[var9++] = arg0[var9];
                arg0[var9++] = arg0[var9];
                arg0[var9++] = arg0[var9];
                arg0[var9++] = arg0[var9];
            }
        } else {
            int var17 = this.field2624.field2917;
            int var18 = 256 - this.field2624.field2917;
            int var19 = ((arg2 & 0xFF00FF) * var18 >> 8 & 0xFF00FF) + ((arg2 & 0xFF00) * var18 >> 8 & 0xFF00);
            while (true) {
                var10--;
                if (var10 < 0) {
                    int var23 = arg5 - arg4 & 0x3;
                    while (true) {
                        var23--;
                        if (var23 < 0) {
                            return;
                        }
                        this.method5181(arg0, Statics.field5534, var9, var19, var17, var11);
                        var9++;
                        var11 += arg7;
                    }
                }
                this.method5181(arg0, Statics.field5534, var9, var19, var17, var11);
                var9++;
                float var20 = arg7 + var11;
                this.method5181(arg0, Statics.field5534, var9, var19, var17, var20);
                var9++;
                float var21 = arg7 + var20;
                this.method5181(arg0, Statics.field5534, var9, var19, var17, var21);
                var9++;
                float var22 = arg7 + var21;
                this.method5181(arg0, Statics.field5534, var9, var19, var17, var22);
                var9++;
                var11 = arg7 + var22;
            }
        }
    }

    @ObfuscatedName("kh.ae(IIIIIIFFFIIIIIIIIIIIII)V")
    public void method4645(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19, int arg20, int arg21) {
        int[] var23 = this.field2624.field2913.method4951(arg21);
        if (var23 == null) {
            int var24 = this.field2624.field2913.method4967(arg21);
            this.method4654(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, method4622(var24, arg9), method4622(var24, arg10), method4622(var24, arg11));
            return;
        }
        this.field2616 = this.field2624.field2913.method4954(arg21);
        this.field2620 = this.field2624.field2913.method4972(arg21);
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
        float var37 = arg7 - arg6;
        float var38 = arg8 - arg6;
        float var39 = ((float) var28 * var37 - (float) var26 * var38) / (float) var34;
        float var40 = ((float) var25 * var38 - (float) var27 * var37) / (float) var34;
        int var41 = this.field2624.field2918;
        int var42 = arg12 - arg13;
        int var43 = arg15 - arg16;
        int var44 = arg18 - arg19;
        int var45 = arg14 - arg12;
        int var46 = arg17 - arg15;
        int var47 = arg20 - arg18;
        int var48 = arg15 * var45 - arg12 * var46 << 14;
        int var49 = (int) (((long) (arg18 * var46 - arg15 * var47) << 3 << 14) / (long) var41);
        int var50 = (int) (((long) (arg12 * var47 - arg18 * var45) << 14) / (long) var41);
        int var51 = arg15 * var42 - arg12 * var43 << 14;
        int var52 = (int) (((long) (arg18 * var43 - arg15 * var44) << 3 << 14) / (long) var41);
        int var53 = (int) (((long) (arg12 * var44 - arg18 * var42) << 14) / (long) var41);
        int var54 = var43 * var45 - var42 * var46 << 14;
        int var55 = (int) (((long) (var44 * var46 - var43 * var47) << 3 << 14) / (long) var41);
        int var56 = (int) (((long) (var42 * var47 - var44 * var45) << 14) / (long) var41);
        int[] var57 = this.field2624.field2926;
        int var58 = this.field2624.field2923;
        if (arg0 <= arg1 && arg0 <= arg2) {
            if (arg0 < var58) {
                if (arg1 > var58) {
                    arg1 = var58;
                }
                if (arg2 > var58) {
                    arg2 = var58;
                }
                int var59 = (arg9 << 9) - arg3 * var35 + var35;
                float var60 = arg6 - (float) arg3 * var39 + var39;
                if (arg1 < arg2) {
                    int var61;
                    int var62 = var61 = arg3 << 14;
                    if (arg0 < 0) {
                        var62 -= arg0 * var33;
                        var61 -= arg0 * var31;
                        var59 -= arg0 * var36;
                        var60 -= (float) arg0 * var40;
                        arg0 = 0;
                    }
                    int var63 = arg4 << 14;
                    if (arg1 < 0) {
                        var63 -= arg1 * var32;
                        arg1 = 0;
                    }
                    int var64 = arg0 - this.field2624.field2928;
                    int var65 = var50 * var64 + var48;
                    int var66 = var53 * var64 + var51;
                    int var67 = var56 * var64 + var54;
                    if (arg0 != arg1 && var33 < var31 || arg0 == arg1 && var33 > var32) {
                        int var68 = arg2 - arg1;
                        int var69 = arg1 - arg0;
                        int var70 = var57[arg0];
                        while (true) {
                            var69--;
                            if (var69 < 0) {
                                while (true) {
                                    var68--;
                                    if (var68 < 0) {
                                        return;
                                    }
                                    this.method5180(Statics.field5533, var23, 0, 0, var70, var62 >> 14, var63 >> 14, var59, var35, var60, var39, var65, var66, var67, var49, var52, var55);
                                    var62 += var33;
                                    var63 += var32;
                                    var59 += var36;
                                    var70 += Statics.field5532;
                                    var65 += var50;
                                    var66 += var53;
                                    var67 += var56;
                                    var60 += var40;
                                }
                            }
                            this.method5180(Statics.field5533, var23, 0, 0, var70, var62 >> 14, var61 >> 14, var59, var35, var60, var39, var65, var66, var67, var49, var52, var55);
                            var62 += var33;
                            var61 += var31;
                            var59 += var36;
                            var70 += Statics.field5532;
                            var65 += var50;
                            var66 += var53;
                            var67 += var56;
                            var60 += var40;
                        }
                    } else {
                        int var71 = arg2 - arg1;
                        int var72 = arg1 - arg0;
                        int var73 = var57[arg0];
                        while (true) {
                            var72--;
                            if (var72 < 0) {
                                while (true) {
                                    var71--;
                                    if (var71 < 0) {
                                        return;
                                    }
                                    this.method5180(Statics.field5533, var23, 0, 0, var73, var63 >> 14, var62 >> 14, var59, var35, var60, var39, var65, var66, var67, var49, var52, var55);
                                    var62 += var33;
                                    var63 += var32;
                                    var59 += var36;
                                    var73 += Statics.field5532;
                                    var65 += var50;
                                    var66 += var53;
                                    var67 += var56;
                                    var60 += var40;
                                }
                            }
                            this.method5180(Statics.field5533, var23, 0, 0, var73, var61 >> 14, var62 >> 14, var59, var35, var60, var39, var65, var66, var67, var49, var52, var55);
                            var62 += var33;
                            var61 += var31;
                            var59 += var36;
                            var73 += Statics.field5532;
                            var65 += var50;
                            var66 += var53;
                            var67 += var56;
                            var60 += var40;
                        }
                    }
                } else {
                    int var74;
                    int var75 = var74 = arg3 << 14;
                    if (arg0 < 0) {
                        var75 -= arg0 * var33;
                        var74 -= arg0 * var31;
                        var59 -= arg0 * var36;
                        var60 -= (float) arg0 * var40;
                        arg0 = 0;
                    }
                    int var76 = arg5 << 14;
                    if (arg2 < 0) {
                        var76 -= arg2 * var32;
                        arg2 = 0;
                    }
                    int var77 = arg0 - this.field2624.field2928;
                    int var78 = var50 * var77 + var48;
                    int var79 = var53 * var77 + var51;
                    int var80 = var56 * var77 + var54;
                    if ((arg0 == arg2 || var33 >= var31) && (arg0 != arg2 || var32 <= var31)) {
                        int var84 = arg1 - arg2;
                        int var85 = arg2 - arg0;
                        int var86 = var57[arg0];
                        while (true) {
                            var85--;
                            if (var85 < 0) {
                                while (true) {
                                    var84--;
                                    if (var84 < 0) {
                                        return;
                                    }
                                    this.method5180(Statics.field5533, var23, 0, 0, var86, var74 >> 14, var76 >> 14, var59, var35, var60, var39, var78, var79, var80, var49, var52, var55);
                                    var76 += var32;
                                    var74 += var31;
                                    var59 += var36;
                                    var86 += Statics.field5532;
                                    var78 += var50;
                                    var79 += var53;
                                    var80 += var56;
                                    var60 += var40;
                                }
                            }
                            this.method5180(Statics.field5533, var23, 0, 0, var86, var74 >> 14, var75 >> 14, var59, var35, var60, var39, var78, var79, var80, var49, var52, var55);
                            var75 += var33;
                            var74 += var31;
                            var59 += var36;
                            var86 += Statics.field5532;
                            var78 += var50;
                            var79 += var53;
                            var80 += var56;
                            var60 += var40;
                        }
                    } else {
                        int var81 = arg1 - arg2;
                        int var82 = arg2 - arg0;
                        int var83 = var57[arg0];
                        while (true) {
                            var82--;
                            if (var82 < 0) {
                                while (true) {
                                    var81--;
                                    if (var81 < 0) {
                                        return;
                                    }
                                    this.method5180(Statics.field5533, var23, 0, 0, var83, var76 >> 14, var74 >> 14, var59, var35, var60, var39, var78, var79, var80, var49, var52, var55);
                                    var76 += var32;
                                    var74 += var31;
                                    var59 += var36;
                                    var83 += Statics.field5532;
                                    var78 += var50;
                                    var79 += var53;
                                    var80 += var56;
                                    var60 += var40;
                                }
                            }
                            this.method5180(Statics.field5533, var23, 0, 0, var83, var75 >> 14, var74 >> 14, var59, var35, var60, var39, var78, var79, var80, var49, var52, var55);
                            var75 += var33;
                            var74 += var31;
                            var59 += var36;
                            var83 += Statics.field5532;
                            var78 += var50;
                            var79 += var53;
                            var80 += var56;
                            var60 += var40;
                        }
                    }
                }
            }
        } else if (arg1 <= arg2) {
            if (arg1 < var58) {
                if (arg2 > var58) {
                    arg2 = var58;
                }
                if (arg0 > var58) {
                    arg0 = var58;
                }
                int var87 = (arg10 << 9) - arg4 * var35 + var35;
                float var88 = arg7 - (float) arg4 * var39 + var39;
                if (arg2 < arg0) {
                    int var89;
                    int var90 = var89 = arg4 << 14;
                    if (arg1 < 0) {
                        var90 -= arg1 * var31;
                        var89 -= arg1 * var32;
                        var87 -= arg1 * var36;
                        var88 -= (float) arg1 * var40;
                        arg1 = 0;
                    }
                    int var91 = arg5 << 14;
                    if (arg2 < 0) {
                        var91 -= arg2 * var33;
                        arg2 = 0;
                    }
                    int var92 = arg1 - this.field2624.field2928;
                    int var93 = var50 * var92 + var48;
                    int var94 = var53 * var92 + var51;
                    int var95 = var56 * var92 + var54;
                    if (arg1 != arg2 && var31 < var32 || arg1 == arg2 && var31 > var33) {
                        int var96 = arg0 - arg2;
                        int var97 = arg2 - arg1;
                        int var98 = var57[arg1];
                        while (true) {
                            var97--;
                            if (var97 < 0) {
                                while (true) {
                                    var96--;
                                    if (var96 < 0) {
                                        return;
                                    }
                                    this.method5180(Statics.field5533, var23, 0, 0, var98, var90 >> 14, var91 >> 14, var87, var35, var88, var39, var93, var94, var95, var49, var52, var55);
                                    var90 += var31;
                                    var91 += var33;
                                    var87 += var36;
                                    var98 += Statics.field5532;
                                    var93 += var50;
                                    var94 += var53;
                                    var95 += var56;
                                    var88 += var40;
                                }
                            }
                            this.method5180(Statics.field5533, var23, 0, 0, var98, var90 >> 14, var89 >> 14, var87, var35, var88, var39, var93, var94, var95, var49, var52, var55);
                            var90 += var31;
                            var89 += var32;
                            var87 += var36;
                            var98 += Statics.field5532;
                            var93 += var50;
                            var94 += var53;
                            var95 += var56;
                            var88 += var40;
                        }
                    } else {
                        int var99 = arg0 - arg2;
                        int var100 = arg2 - arg1;
                        int var101 = var57[arg1];
                        while (true) {
                            var100--;
                            if (var100 < 0) {
                                while (true) {
                                    var99--;
                                    if (var99 < 0) {
                                        return;
                                    }
                                    this.method5180(Statics.field5533, var23, 0, 0, var101, var91 >> 14, var90 >> 14, var87, var35, var88, var39, var93, var94, var95, var49, var52, var55);
                                    var90 += var31;
                                    var91 += var33;
                                    var87 += var36;
                                    var101 += Statics.field5532;
                                    var93 += var50;
                                    var94 += var53;
                                    var95 += var56;
                                    var88 += var40;
                                }
                            }
                            this.method5180(Statics.field5533, var23, 0, 0, var101, var89 >> 14, var90 >> 14, var87, var35, var88, var39, var93, var94, var95, var49, var52, var55);
                            var90 += var31;
                            var89 += var32;
                            var87 += var36;
                            var101 += Statics.field5532;
                            var93 += var50;
                            var94 += var53;
                            var95 += var56;
                            var88 += var40;
                        }
                    }
                } else {
                    int var102;
                    int var103 = var102 = arg4 << 14;
                    if (arg1 < 0) {
                        var103 -= arg1 * var31;
                        var102 -= arg1 * var32;
                        var87 -= arg1 * var36;
                        var88 -= (float) arg1 * var40;
                        arg1 = 0;
                    }
                    int var104 = arg3 << 14;
                    if (arg0 < 0) {
                        var104 -= arg0 * var33;
                        arg0 = 0;
                    }
                    int var105 = arg1 - this.field2624.field2928;
                    int var106 = var50 * var105 + var48;
                    int var107 = var53 * var105 + var51;
                    int var108 = var56 * var105 + var54;
                    if (var31 < var32) {
                        int var109 = arg2 - arg0;
                        int var110 = arg0 - arg1;
                        int var111 = var57[arg1];
                        while (true) {
                            var110--;
                            if (var110 < 0) {
                                while (true) {
                                    var109--;
                                    if (var109 < 0) {
                                        return;
                                    }
                                    this.method5180(Statics.field5533, var23, 0, 0, var111, var104 >> 14, var102 >> 14, var87, var35, var88, var39, var106, var107, var108, var49, var52, var55);
                                    var104 += var33;
                                    var102 += var32;
                                    var87 += var36;
                                    var111 += Statics.field5532;
                                    var106 += var50;
                                    var107 += var53;
                                    var108 += var56;
                                    var88 += var40;
                                }
                            }
                            this.method5180(Statics.field5533, var23, 0, 0, var111, var103 >> 14, var102 >> 14, var87, var35, var88, var39, var106, var107, var108, var49, var52, var55);
                            var103 += var31;
                            var102 += var32;
                            var87 += var36;
                            var111 += Statics.field5532;
                            var106 += var50;
                            var107 += var53;
                            var108 += var56;
                            var88 += var40;
                        }
                    } else {
                        int var112 = arg2 - arg0;
                        int var113 = arg0 - arg1;
                        int var114 = var57[arg1];
                        while (true) {
                            var113--;
                            if (var113 < 0) {
                                while (true) {
                                    var112--;
                                    if (var112 < 0) {
                                        return;
                                    }
                                    this.method5180(Statics.field5533, var23, 0, 0, var114, var102 >> 14, var104 >> 14, var87, var35, var88, var39, var106, var107, var108, var49, var52, var55);
                                    var104 += var33;
                                    var102 += var32;
                                    var87 += var36;
                                    var114 += Statics.field5532;
                                    var106 += var50;
                                    var107 += var53;
                                    var108 += var56;
                                    var88 += var40;
                                }
                            }
                            this.method5180(Statics.field5533, var23, 0, 0, var114, var102 >> 14, var103 >> 14, var87, var35, var88, var39, var106, var107, var108, var49, var52, var55);
                            var103 += var31;
                            var102 += var32;
                            var87 += var36;
                            var114 += Statics.field5532;
                            var106 += var50;
                            var107 += var53;
                            var108 += var56;
                            var88 += var40;
                        }
                    }
                }
            }
        } else if (arg2 < var58) {
            if (arg0 > var58) {
                arg0 = var58;
            }
            if (arg1 > var58) {
                arg1 = var58;
            }
            int var115 = (arg11 << 9) - arg5 * var35 + var35;
            float var116 = arg8 - (float) arg5 * var39 + var39;
            if (arg0 < arg1) {
                int var117;
                int var118 = var117 = arg5 << 14;
                if (arg2 < 0) {
                    var118 -= arg2 * var32;
                    var117 -= arg2 * var33;
                    var115 -= arg2 * var36;
                    var116 -= (float) arg2 * var40;
                    arg2 = 0;
                }
                int var119 = arg3 << 14;
                if (arg0 < 0) {
                    var119 -= arg0 * var31;
                    arg0 = 0;
                }
                int var120 = arg2 - this.field2624.field2928;
                int var121 = var50 * var120 + var48;
                int var122 = var53 * var120 + var51;
                int var123 = var56 * var120 + var54;
                if (var32 < var33) {
                    int var124 = arg1 - arg0;
                    int var125 = arg0 - arg2;
                    int var126 = var57[arg2];
                    while (true) {
                        var125--;
                        if (var125 < 0) {
                            while (true) {
                                var124--;
                                if (var124 < 0) {
                                    return;
                                }
                                this.method5180(Statics.field5533, var23, 0, 0, var126, var118 >> 14, var119 >> 14, var115, var35, var116, var39, var121, var122, var123, var49, var52, var55);
                                var118 += var32;
                                var119 += var31;
                                var115 += var36;
                                var126 += Statics.field5532;
                                var121 += var50;
                                var122 += var53;
                                var123 += var56;
                                var116 += var40;
                            }
                        }
                        this.method5180(Statics.field5533, var23, 0, 0, var126, var118 >> 14, var117 >> 14, var115, var35, var116, var39, var121, var122, var123, var49, var52, var55);
                        var118 += var32;
                        var117 += var33;
                        var115 += var36;
                        var126 += Statics.field5532;
                        var121 += var50;
                        var122 += var53;
                        var123 += var56;
                        var116 += var40;
                    }
                } else {
                    int var127 = arg1 - arg0;
                    int var128 = arg0 - arg2;
                    int var129 = var57[arg2];
                    while (true) {
                        var128--;
                        if (var128 < 0) {
                            while (true) {
                                var127--;
                                if (var127 < 0) {
                                    return;
                                }
                                this.method5180(Statics.field5533, var23, 0, 0, var129, var119 >> 14, var118 >> 14, var115, var35, var116, var39, var121, var122, var123, var49, var52, var55);
                                var118 += var32;
                                var119 += var31;
                                var115 += var36;
                                var129 += Statics.field5532;
                                var121 += var50;
                                var122 += var53;
                                var123 += var56;
                                var116 += var40;
                            }
                        }
                        this.method5180(Statics.field5533, var23, 0, 0, var129, var117 >> 14, var118 >> 14, var115, var35, var116, var39, var121, var122, var123, var49, var52, var55);
                        var118 += var32;
                        var117 += var33;
                        var115 += var36;
                        var129 += Statics.field5532;
                        var121 += var50;
                        var122 += var53;
                        var123 += var56;
                        var116 += var40;
                    }
                }
            } else {
                int var130;
                int var131 = var130 = arg5 << 14;
                if (arg2 < 0) {
                    var131 -= arg2 * var32;
                    var130 -= arg2 * var33;
                    var115 -= arg2 * var36;
                    var116 -= (float) arg2 * var40;
                    arg2 = 0;
                }
                int var132 = arg4 << 14;
                if (arg1 < 0) {
                    var132 -= arg1 * var31;
                    arg1 = 0;
                }
                int var133 = arg2 - this.field2624.field2928;
                int var134 = var50 * var133 + var48;
                int var135 = var53 * var133 + var51;
                int var136 = var56 * var133 + var54;
                if (var32 < var33) {
                    int var137 = arg0 - arg1;
                    int var138 = arg1 - arg2;
                    int var139 = var57[arg2];
                    while (true) {
                        var138--;
                        if (var138 < 0) {
                            while (true) {
                                var137--;
                                if (var137 < 0) {
                                    return;
                                }
                                this.method5180(Statics.field5533, var23, 0, 0, var139, var132 >> 14, var130 >> 14, var115, var35, var116, var39, var134, var135, var136, var49, var52, var55);
                                var132 += var31;
                                var130 += var33;
                                var115 += var36;
                                var139 += Statics.field5532;
                                var134 += var50;
                                var135 += var53;
                                var136 += var56;
                                var116 += var40;
                            }
                        }
                        this.method5180(Statics.field5533, var23, 0, 0, var139, var131 >> 14, var130 >> 14, var115, var35, var116, var39, var134, var135, var136, var49, var52, var55);
                        var131 += var32;
                        var130 += var33;
                        var115 += var36;
                        var139 += Statics.field5532;
                        var134 += var50;
                        var135 += var53;
                        var136 += var56;
                        var116 += var40;
                    }
                } else {
                    int var140 = arg0 - arg1;
                    int var141 = arg1 - arg2;
                    int var142 = var57[arg2];
                    while (true) {
                        var141--;
                        if (var141 < 0) {
                            while (true) {
                                var140--;
                                if (var140 < 0) {
                                    return;
                                }
                                this.method5180(Statics.field5533, var23, 0, 0, var142, var130 >> 14, var132 >> 14, var115, var35, var116, var39, var134, var135, var136, var49, var52, var55);
                                var132 += var31;
                                var130 += var33;
                                var115 += var36;
                                var142 += Statics.field5532;
                                var134 += var50;
                                var135 += var53;
                                var136 += var56;
                                var116 += var40;
                            }
                        }
                        this.method5180(Statics.field5533, var23, 0, 0, var142, var130 >> 14, var131 >> 14, var115, var35, var116, var39, var134, var135, var136, var49, var52, var55);
                        var131 += var32;
                        var130 += var33;
                        var115 += var36;
                        var142 += Statics.field5532;
                        var134 += var50;
                        var135 += var53;
                        var136 += var56;
                        var116 += var40;
                    }
                }
            }
        }
    }

    @ObfuscatedName("kh.cd(FF)Z")
    public static final boolean method5210(float arg0, float arg1) {
        return arg1 > arg0;
    }

    @ObfuscatedName("kh.ci([I[F[IIIIF)V")
    public static final void method5188(int[] arg0, float[] arg1, int[] arg2, int arg3, int arg4, int arg5, float arg6) {
        if (method5210(arg1[arg3], arg6)) {
            int var7 = arg2[(arg5 >>> 26) + (arg5 & 0xFC0)];
            arg0[arg3] = ((var7 & 0xFF00FF) * arg4 & 0xFF00FF00) + ((var7 & 0xFF00) * arg4 & 0xFF0000) >> 8;
            arg1[arg3] = arg6;
        }
    }

    @ObfuscatedName("kh.cn([I[F[IIIIF)V")
    public static final void method5182(int[] arg0, float[] arg1, int[] arg2, int arg3, int arg4, int arg5, float arg6) {
        int var7 = arg2[(arg5 >>> 26) + (arg5 & 0xFC0)];
        if (var7 != 0 && method5210(arg1[arg3], arg6)) {
            arg0[arg3] = ((var7 & 0xFF00FF) * arg4 & 0xFF00FF00) + ((var7 & 0xFF00) * arg4 & 0xFF0000) >> 8;
            arg1[arg3] = arg6;
        }
    }

    @ObfuscatedName("kh.co([I[F[IIIIF)V")
    public static final void method5184(int[] arg0, float[] arg1, int[] arg2, int arg3, int arg4, int arg5, float arg6) {
        if (method5210(arg1[arg3], arg6)) {
            int var7 = arg2[(arg5 >>> 25) + (arg5 & 0x3F80)];
            arg0[arg3] = ((var7 & 0xFF00FF) * arg4 & 0xFF00FF00) + ((var7 & 0xFF00) * arg4 & 0xFF0000) >> 8;
            arg1[arg3] = arg6;
        }
    }

    @ObfuscatedName("kh.cf([I[F[IIIIF)V")
    public static final void method5189(int[] arg0, float[] arg1, int[] arg2, int arg3, int arg4, int arg5, float arg6) {
        int var7 = arg2[(arg5 >>> 25) + (arg5 & 0x3F80)];
        if (var7 != 0 && method5210(arg1[arg3], arg6)) {
            arg0[arg3] = ((var7 & 0xFF00FF) * arg4 & 0xFF00FF00) + ((var7 & 0xFF00) * arg4 & 0xFF0000) >> 8;
            arg1[arg3] = arg6;
        }
    }

    @ObfuscatedName("kh.cl([I[IIIIIIIIFFIIIIII)V")
    public final void method5180(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, float arg9, float arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16) {
        if (this.field2624.field2933) {
            if (arg6 > this.field2624.field2927) {
                arg6 = this.field2624.field2927;
            }
            if (arg5 < 0) {
                arg5 = 0;
            }
        }
        if (arg5 >= arg6) {
            return;
        }
        int var18 = arg4 + arg5;
        int var19 = arg5 * arg8 + arg7;
        float var20 = (float) arg5 * arg10 + arg9;
        int var21 = arg6 - arg5;
        int var10000;
        if (!this.field2616) {
            int var78 = arg5 - this.field2624.field2919;
            int var79 = (arg14 >> 3) * var78 + arg11;
            int var80 = (arg15 >> 3) * var78 + arg12;
            int var81 = (arg16 >> 3) * var78 + arg13;
            int var82 = var81 >> 14;
            int var83;
            int var84;
            if (var82 == 0) {
                var83 = 0;
                var84 = 0;
            } else {
                var83 = var79 / var82;
                var84 = var80 / var82;
                if (var83 < 0) {
                    var83 = 0;
                } else if (var83 > 16256) {
                    var83 = 16256;
                }
            }
            int var85 = arg14 + var79;
            int var86 = arg15 + var80;
            int var87 = arg16 + var81;
            int var88 = var87 >> 14;
            int var89;
            int var90;
            if (var88 == 0) {
                var89 = 0;
                var90 = 0;
            } else {
                var89 = var85 / var88;
                var90 = var86 / var88;
                if (var89 < 0) {
                    var89 = 0;
                } else if (var89 > 16256) {
                    var89 = 16256;
                }
            }
            int var91 = (var83 << 18) + var84;
            int var92 = (var89 - var83 >> 3 << 18) + (var90 - var84 >> 3);
            int var93 = var21 >> 3;
            int var94 = arg8 << 3;
            int var95 = var19 >> 8;
            if (this.field2620) {
                if (var93 > 0) {
                    do {
                        method5184(arg0, Statics.field5534, arg1, var18, var95, var91, var20);
                        var18++;
                        int var96 = var91 + var92;
                        float var97 = arg10 + var20;
                        method5184(arg0, Statics.field5534, arg1, var18, var95, var96, var97);
                        var18++;
                        int var98 = var92 + var96;
                        float var99 = arg10 + var97;
                        method5184(arg0, Statics.field5534, arg1, var18, var95, var98, var99);
                        var18++;
                        int var100 = var92 + var98;
                        float var101 = arg10 + var99;
                        method5184(arg0, Statics.field5534, arg1, var18, var95, var100, var101);
                        var18++;
                        int var102 = var92 + var100;
                        float var103 = arg10 + var101;
                        method5184(arg0, Statics.field5534, arg1, var18, var95, var102, var103);
                        var18++;
                        int var104 = var92 + var102;
                        float var105 = arg10 + var103;
                        method5184(arg0, Statics.field5534, arg1, var18, var95, var104, var105);
                        var18++;
                        int var106 = var92 + var104;
                        float var107 = arg10 + var105;
                        method5184(arg0, Statics.field5534, arg1, var18, var95, var106, var107);
                        var18++;
                        int var108 = var92 + var106;
                        float var109 = arg10 + var107;
                        method5184(arg0, Statics.field5534, arg1, var18, var95, var108, var109);
                        var18++;
                        var10000 = var92 + var108;
                        var20 = arg10 + var109;
                        int var111 = var89;
                        int var112 = var90;
                        var85 += arg14;
                        var86 += arg15;
                        var87 += arg16;
                        int var113 = var87 >> 14;
                        if (var113 == 0) {
                            var89 = 0;
                            var90 = 0;
                        } else {
                            var89 = var85 / var113;
                            var90 = var86 / var113;
                            if (var89 < 0) {
                                var89 = 0;
                            } else if (var89 > 16256) {
                                var89 = 16256;
                            }
                        }
                        var91 = (var111 << 18) + var112;
                        var92 = (var89 - var111 >> 3 << 18) + (var90 - var112 >> 3);
                        var19 += var94;
                        var95 = var19 >> 8;
                        var93--;
                    } while (var93 > 0);
                }
                int var114 = arg6 - arg5 & 0x7;
                if (var114 > 0) {
                    do {
                        method5184(arg0, Statics.field5534, arg1, var18, var95, var91, var20);
                        var18++;
                        var91 += var92;
                        var20 += arg10;
                        var114--;
                    } while (var114 > 0);
                }
            } else {
                if (var93 > 0) {
                    do {
                        method5189(arg0, Statics.field5534, arg1, var18, var95, var91, var20);
                        var18++;
                        int var115 = var91 + var92;
                        float var116 = arg10 + var20;
                        method5189(arg0, Statics.field5534, arg1, var18, var95, var115, var116);
                        var18++;
                        int var117 = var92 + var115;
                        float var118 = arg10 + var116;
                        method5189(arg0, Statics.field5534, arg1, var18, var95, var117, var118);
                        var18++;
                        int var119 = var92 + var117;
                        float var120 = arg10 + var118;
                        method5189(arg0, Statics.field5534, arg1, var18, var95, var119, var120);
                        var18++;
                        int var121 = var92 + var119;
                        float var122 = arg10 + var120;
                        method5189(arg0, Statics.field5534, arg1, var18, var95, var121, var122);
                        var18++;
                        int var123 = var92 + var121;
                        float var124 = arg10 + var122;
                        method5189(arg0, Statics.field5534, arg1, var18, var95, var123, var124);
                        var18++;
                        int var125 = var92 + var123;
                        float var126 = arg10 + var124;
                        method5189(arg0, Statics.field5534, arg1, var18, var95, var125, var126);
                        var18++;
                        int var127 = var92 + var125;
                        float var128 = arg10 + var126;
                        method5189(arg0, Statics.field5534, arg1, var18, var95, var127, var128);
                        var18++;
                        var10000 = var92 + var127;
                        var20 = arg10 + var128;
                        int var130 = var89;
                        int var131 = var90;
                        var85 += arg14;
                        var86 += arg15;
                        var87 += arg16;
                        int var132 = var87 >> 14;
                        if (var132 == 0) {
                            var89 = 0;
                            var90 = 0;
                        } else {
                            var89 = var85 / var132;
                            var90 = var86 / var132;
                            if (var89 < 0) {
                                var89 = 0;
                            } else if (var89 > 16256) {
                                var89 = 16256;
                            }
                        }
                        var91 = (var130 << 18) + var131;
                        var92 = (var89 - var130 >> 3 << 18) + (var90 - var131 >> 3);
                        var19 += var94;
                        var95 = var19 >> 8;
                        var93--;
                    } while (var93 > 0);
                }
                int var133 = arg6 - arg5 & 0x7;
                if (var133 > 0) {
                    do {
                        method5189(arg0, Statics.field5534, arg1, var18, var95, var91, var20);
                        var18++;
                        var91 += var92;
                        var20 += arg10;
                        var133--;
                    } while (var133 > 0);
                }
            }
            return;
        }
        int var22 = arg5 - this.field2624.field2919;
        int var23 = (arg14 >> 3) * var22 + arg11;
        int var24 = (arg15 >> 3) * var22 + arg12;
        int var25 = (arg16 >> 3) * var22 + arg13;
        int var26 = var25 >> 12;
        int var27;
        int var28;
        if (var26 == 0) {
            var27 = 0;
            var28 = 0;
        } else {
            var27 = var23 / var26;
            var28 = var24 / var26;
            if (var27 < 0) {
                var27 = 0;
            } else if (var27 > 4032) {
                var27 = 4032;
            }
        }
        int var29 = arg14 + var23;
        int var30 = arg15 + var24;
        int var31 = arg16 + var25;
        int var32 = var31 >> 12;
        int var33;
        int var34;
        if (var32 == 0) {
            var33 = 0;
            var34 = 0;
        } else {
            var33 = var29 / var32;
            var34 = var30 / var32;
            if (var33 < 0) {
                var33 = 0;
            } else if (var33 > 4032) {
                var33 = 4032;
            }
        }
        int var35 = (var27 << 20) + var28;
        int var36 = (var33 - var27 >> 3 << 20) + (var34 - var28 >> 3);
        int var37 = var21 >> 3;
        int var38 = arg8 << 3;
        int var39 = var19 >> 8;
        if (!this.field2620) {
            if (var37 > 0) {
                do {
                    method5182(arg0, Statics.field5534, arg1, var18, var39, var35, var20);
                    var18++;
                    int var59 = var35 + var36;
                    float var60 = arg10 + var20;
                    method5182(arg0, Statics.field5534, arg1, var18, var39, var59, var60);
                    var18++;
                    int var61 = var36 + var59;
                    float var62 = arg10 + var60;
                    method5182(arg0, Statics.field5534, arg1, var18, var39, var61, var62);
                    var18++;
                    int var63 = var36 + var61;
                    float var64 = arg10 + var62;
                    method5182(arg0, Statics.field5534, arg1, var18, var39, var63, var64);
                    var18++;
                    int var65 = var36 + var63;
                    float var66 = arg10 + var64;
                    method5182(arg0, Statics.field5534, arg1, var18, var39, var65, var66);
                    var18++;
                    int var67 = var36 + var65;
                    float var68 = arg10 + var66;
                    method5182(arg0, Statics.field5534, arg1, var18, var39, var67, var68);
                    var18++;
                    int var69 = var36 + var67;
                    float var70 = arg10 + var68;
                    method5182(arg0, Statics.field5534, arg1, var18, var39, var69, var70);
                    var18++;
                    int var71 = var36 + var69;
                    float var72 = arg10 + var70;
                    method5182(arg0, Statics.field5534, arg1, var18, var39, var71, var72);
                    var18++;
                    var10000 = var36 + var71;
                    var20 = arg10 + var72;
                    int var74 = var33;
                    int var75 = var34;
                    var29 += arg14;
                    var30 += arg15;
                    var31 += arg16;
                    int var76 = var31 >> 12;
                    if (var76 == 0) {
                        var33 = 0;
                        var34 = 0;
                    } else {
                        var33 = var29 / var76;
                        var34 = var30 / var76;
                        if (var33 < 0) {
                            var33 = 0;
                        } else if (var33 > 4032) {
                            var33 = 4032;
                        }
                    }
                    var35 = (var74 << 20) + var75;
                    var36 = (var33 - var74 >> 3 << 20) + (var34 - var75 >> 3);
                    var19 += var38;
                    var39 = var19 >> 8;
                    var37--;
                } while (var37 > 0);
            }
            int var77 = arg6 - arg5 & 0x7;
            if (var77 > 0) {
                do {
                    method5182(arg0, Statics.field5534, arg1, var18, var39, var35, var20);
                    var18++;
                    var35 += var36;
                    var20 += arg10;
                    var77--;
                } while (var77 > 0);
            }
            return;
        }
        if (var37 > 0) {
            do {
                method5188(arg0, Statics.field5534, arg1, var18, var39, var35, var20);
                var18++;
                int var40 = var35 + var36;
                float var41 = arg10 + var20;
                method5188(arg0, Statics.field5534, arg1, var18, var39, var40, var41);
                var18++;
                int var42 = var36 + var40;
                float var43 = arg10 + var41;
                method5188(arg0, Statics.field5534, arg1, var18, var39, var42, var43);
                var18++;
                int var44 = var36 + var42;
                float var45 = arg10 + var43;
                method5188(arg0, Statics.field5534, arg1, var18, var39, var44, var45);
                var18++;
                int var46 = var36 + var44;
                float var47 = arg10 + var45;
                method5188(arg0, Statics.field5534, arg1, var18, var39, var46, var47);
                var18++;
                int var48 = var36 + var46;
                float var49 = arg10 + var47;
                method5188(arg0, Statics.field5534, arg1, var18, var39, var48, var49);
                var18++;
                int var50 = var36 + var48;
                float var51 = arg10 + var49;
                method5188(arg0, Statics.field5534, arg1, var18, var39, var50, var51);
                var18++;
                int var52 = var36 + var50;
                float var53 = arg10 + var51;
                method5188(arg0, Statics.field5534, arg1, var18, var39, var52, var53);
                var18++;
                var10000 = var36 + var52;
                var20 = arg10 + var53;
                int var55 = var33;
                int var56 = var34;
                var29 += arg14;
                var30 += arg15;
                var31 += arg16;
                int var57 = var31 >> 12;
                if (var57 == 0) {
                    var33 = 0;
                    var34 = 0;
                } else {
                    var33 = var29 / var57;
                    var34 = var30 / var57;
                    if (var33 < 0) {
                        var33 = 0;
                    } else if (var33 > 4032) {
                        var33 = 4032;
                    }
                }
                var35 = (var55 << 20) + var56;
                var36 = (var33 - var55 >> 3 << 20) + (var34 - var56 >> 3);
                var19 += var38;
                var39 = var19 >> 8;
                var37--;
            } while (var37 > 0);
        }
        int var58 = arg6 - arg5 & 0x7;
        if (var58 <= 0) {
            return;
        }
        do {
            method5188(arg0, Statics.field5534, arg1, var18, var39, var35, var20);
            var18++;
            var35 += var36;
            var20 += arg10;
            var58--;
        } while (var58 > 0);
    }

    @ObfuscatedName("kh.am(IIIIIIFFFIIIIIIIIIIIII)V")
    public void method4627(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19, int arg20, int arg21) {
        int[] var23 = this.field2624.field2913.method4951(arg21);
        if (var23 == null) {
            int var24 = this.field2624.field2913.method4967(arg21);
            this.method4654(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, method4622(var24, arg9), method4622(var24, arg10), method4622(var24, arg11));
            return;
        }
        this.field2616 = this.field2624.field2913.method4954(arg21);
        this.field2620 = this.field2624.field2913.method4972(arg21);
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
        float var37 = arg7 - arg6;
        float var38 = arg8 - arg6;
        float var39 = ((float) var28 * var37 - (float) var26 * var38) / (float) var34;
        float var40 = ((float) var25 * var38 - (float) var27 * var37) / (float) var34;
        int var41 = this.field2624.field2918;
        int var42 = arg12 - arg13;
        int var43 = arg15 - arg16;
        int var44 = arg18 - arg19;
        int var45 = arg14 - arg12;
        int var46 = arg17 - arg15;
        int var47 = arg20 - arg18;
        int var48 = arg15 * var45 - arg12 * var46 << 14;
        int var49 = (int) (((long) (arg18 * var46 - arg15 * var47) << 14) / (long) var41);
        int var50 = (int) (((long) (arg12 * var47 - arg18 * var45) << 14) / (long) var41);
        int var51 = arg15 * var42 - arg12 * var43 << 14;
        int var52 = (int) (((long) (arg18 * var43 - arg15 * var44) << 14) / (long) var41);
        int var53 = (int) (((long) (arg12 * var44 - arg18 * var42) << 14) / (long) var41);
        int var54 = var43 * var45 - var42 * var46 << 14;
        int var55 = (int) (((long) (var44 * var46 - var43 * var47) << 14) / (long) var41);
        int var56 = (int) (((long) (var42 * var47 - var44 * var45) << 14) / (long) var41);
        int[] var57 = this.field2624.field2926;
        int var58 = this.field2624.field2923;
        if (arg0 <= arg1 && arg0 <= arg2) {
            if (arg0 < var58) {
                if (arg1 > var58) {
                    arg1 = var58;
                }
                if (arg2 > var58) {
                    arg2 = var58;
                }
                int var59 = (arg9 << 9) - arg3 * var35 + var35;
                float var60 = arg6 - (float) arg3 * var39 + var39;
                if (arg1 < arg2) {
                    int var61;
                    int var62 = var61 = arg3 << 14;
                    if (arg0 < 0) {
                        var62 -= arg0 * var33;
                        var61 -= arg0 * var31;
                        var60 -= (float) arg0 * var40;
                        var59 -= arg0 * var36;
                        arg0 = 0;
                    }
                    int var63 = arg4 << 14;
                    if (arg1 < 0) {
                        var63 -= arg1 * var32;
                        arg1 = 0;
                    }
                    int var64 = arg0 - this.field2624.field2928;
                    int var65 = var50 * var64 + var48;
                    int var66 = var53 * var64 + var51;
                    int var67 = var56 * var64 + var54;
                    if (arg0 != arg1 && var33 < var31 || arg0 == arg1 && var33 > var32) {
                        int var68 = arg2 - arg1;
                        int var69 = arg1 - arg0;
                        int var70 = var57[arg0];
                        while (true) {
                            var69--;
                            if (var69 < 0) {
                                while (true) {
                                    var68--;
                                    if (var68 < 0) {
                                        return;
                                    }
                                    this.method5200(Statics.field5533, var23, 0, 0, var70, var62 >> 14, var63 >> 14, var59, var35, var60, var39, var65, var66, var67, var49, var52, var55);
                                    var62 += var33;
                                    var63 += var32;
                                    var59 += var36;
                                    var70 += Statics.field5532;
                                    var65 += var50;
                                    var66 += var53;
                                    var67 += var56;
                                    var60 += var40;
                                }
                            }
                            this.method5200(Statics.field5533, var23, 0, 0, var70, var62 >> 14, var61 >> 14, var59, var35, var60, var39, var65, var66, var67, var49, var52, var55);
                            var62 += var33;
                            var61 += var31;
                            var59 += var36;
                            var70 += Statics.field5532;
                            var65 += var50;
                            var66 += var53;
                            var67 += var56;
                            var60 += var40;
                        }
                    } else {
                        int var71 = arg2 - arg1;
                        int var72 = arg1 - arg0;
                        int var73 = var57[arg0];
                        while (true) {
                            var72--;
                            if (var72 < 0) {
                                while (true) {
                                    var71--;
                                    if (var71 < 0) {
                                        return;
                                    }
                                    this.method5200(Statics.field5533, var23, 0, 0, var73, var63 >> 14, var62 >> 14, var59, var35, var60, var39, var65, var66, var67, var49, var52, var55);
                                    var62 += var33;
                                    var63 += var32;
                                    var59 += var36;
                                    var73 += Statics.field5532;
                                    var65 += var50;
                                    var66 += var53;
                                    var67 += var56;
                                    var60 += var40;
                                }
                            }
                            this.method5200(Statics.field5533, var23, 0, 0, var73, var61 >> 14, var62 >> 14, var59, var35, var60, var39, var65, var66, var67, var49, var52, var55);
                            var62 += var33;
                            var61 += var31;
                            var59 += var36;
                            var73 += Statics.field5532;
                            var65 += var50;
                            var66 += var53;
                            var67 += var56;
                            var60 += var40;
                        }
                    }
                } else {
                    int var74;
                    int var75 = var74 = arg3 << 14;
                    if (arg0 < 0) {
                        var75 -= arg0 * var33;
                        var74 -= arg0 * var31;
                        var60 -= (float) arg0 * var40;
                        var59 -= arg0 * var36;
                        arg0 = 0;
                    }
                    int var76 = arg5 << 14;
                    if (arg2 < 0) {
                        var76 -= arg2 * var32;
                        arg2 = 0;
                    }
                    int var77 = arg0 - this.field2624.field2928;
                    int var78 = var50 * var77 + var48;
                    int var79 = var53 * var77 + var51;
                    int var80 = var56 * var77 + var54;
                    if ((arg0 == arg2 || var33 >= var31) && (arg0 != arg2 || var32 <= var31)) {
                        int var84 = arg1 - arg2;
                        int var85 = arg2 - arg0;
                        int var86 = var57[arg0];
                        while (true) {
                            var85--;
                            if (var85 < 0) {
                                while (true) {
                                    var84--;
                                    if (var84 < 0) {
                                        return;
                                    }
                                    this.method5200(Statics.field5533, var23, 0, 0, var86, var74 >> 14, var76 >> 14, var59, var35, var60, var39, var78, var79, var80, var49, var52, var55);
                                    var76 += var32;
                                    var74 += var31;
                                    var59 += var36;
                                    var86 += Statics.field5532;
                                    var78 += var50;
                                    var79 += var53;
                                    var80 += var56;
                                    var60 += var40;
                                }
                            }
                            this.method5200(Statics.field5533, var23, 0, 0, var86, var74 >> 14, var75 >> 14, var59, var35, var60, var39, var78, var79, var80, var49, var52, var55);
                            var75 += var33;
                            var74 += var31;
                            var59 += var36;
                            var86 += Statics.field5532;
                            var78 += var50;
                            var79 += var53;
                            var80 += var56;
                            var60 += var40;
                        }
                    } else {
                        int var81 = arg1 - arg2;
                        int var82 = arg2 - arg0;
                        int var83 = var57[arg0];
                        while (true) {
                            var82--;
                            if (var82 < 0) {
                                while (true) {
                                    var81--;
                                    if (var81 < 0) {
                                        return;
                                    }
                                    this.method5200(Statics.field5533, var23, 0, 0, var83, var76 >> 14, var74 >> 14, var59, var35, var60, var39, var78, var79, var80, var49, var52, var55);
                                    var76 += var32;
                                    var74 += var31;
                                    var59 += var36;
                                    var83 += Statics.field5532;
                                    var78 += var50;
                                    var79 += var53;
                                    var80 += var56;
                                    var60 += var40;
                                }
                            }
                            this.method5200(Statics.field5533, var23, 0, 0, var83, var75 >> 14, var74 >> 14, var59, var35, var60, var39, var78, var79, var80, var49, var52, var55);
                            var75 += var33;
                            var74 += var31;
                            var59 += var36;
                            var83 += Statics.field5532;
                            var78 += var50;
                            var79 += var53;
                            var80 += var56;
                            var60 += var40;
                        }
                    }
                }
            }
        } else if (arg1 <= arg2) {
            if (arg1 < var58) {
                if (arg2 > var58) {
                    arg2 = var58;
                }
                if (arg0 > var58) {
                    arg0 = var58;
                }
                int var87 = (arg10 << 9) - arg4 * var35 + var35;
                float var88 = arg7 - (float) arg4 * var39 + var39;
                if (arg2 < arg0) {
                    int var89;
                    int var90 = var89 = arg4 << 14;
                    if (arg1 < 0) {
                        var90 -= arg1 * var31;
                        var89 -= arg1 * var32;
                        var88 -= (float) arg1 * var40;
                        var87 -= arg1 * var36;
                        arg1 = 0;
                    }
                    int var91 = arg5 << 14;
                    if (arg2 < 0) {
                        var91 -= arg2 * var33;
                        arg2 = 0;
                    }
                    int var92 = arg1 - this.field2624.field2928;
                    int var93 = var50 * var92 + var48;
                    int var94 = var53 * var92 + var51;
                    int var95 = var56 * var92 + var54;
                    if (arg1 != arg2 && var31 < var32 || arg1 == arg2 && var31 > var33) {
                        int var96 = arg0 - arg2;
                        int var97 = arg2 - arg1;
                        int var98 = var57[arg1];
                        while (true) {
                            var97--;
                            if (var97 < 0) {
                                while (true) {
                                    var96--;
                                    if (var96 < 0) {
                                        return;
                                    }
                                    this.method5200(Statics.field5533, var23, 0, 0, var98, var90 >> 14, var91 >> 14, var87, var35, var88, var39, var93, var94, var95, var49, var52, var55);
                                    var90 += var31;
                                    var91 += var33;
                                    var87 += var36;
                                    var98 += Statics.field5532;
                                    var93 += var50;
                                    var94 += var53;
                                    var95 += var56;
                                    var88 += var40;
                                }
                            }
                            this.method5200(Statics.field5533, var23, 0, 0, var98, var90 >> 14, var89 >> 14, var87, var35, var88, var39, var93, var94, var95, var49, var52, var55);
                            var90 += var31;
                            var89 += var32;
                            var87 += var36;
                            var98 += Statics.field5532;
                            var93 += var50;
                            var94 += var53;
                            var95 += var56;
                            var88 += var40;
                        }
                    } else {
                        int var99 = arg0 - arg2;
                        int var100 = arg2 - arg1;
                        int var101 = var57[arg1];
                        while (true) {
                            var100--;
                            if (var100 < 0) {
                                while (true) {
                                    var99--;
                                    if (var99 < 0) {
                                        return;
                                    }
                                    this.method5200(Statics.field5533, var23, 0, 0, var101, var91 >> 14, var90 >> 14, var87, var35, var88, var39, var93, var94, var95, var49, var52, var55);
                                    var90 += var31;
                                    var91 += var33;
                                    var87 += var36;
                                    var101 += Statics.field5532;
                                    var93 += var50;
                                    var94 += var53;
                                    var95 += var56;
                                    var88 += var40;
                                }
                            }
                            this.method5200(Statics.field5533, var23, 0, 0, var101, var89 >> 14, var90 >> 14, var87, var35, var88, var39, var93, var94, var95, var49, var52, var55);
                            var90 += var31;
                            var89 += var32;
                            var87 += var36;
                            var101 += Statics.field5532;
                            var93 += var50;
                            var94 += var53;
                            var95 += var56;
                            var88 += var40;
                        }
                    }
                } else {
                    int var102;
                    int var103 = var102 = arg4 << 14;
                    if (arg1 < 0) {
                        var103 -= arg1 * var31;
                        var102 -= arg1 * var32;
                        var88 -= (float) arg1 * var40;
                        var87 -= arg1 * var36;
                        arg1 = 0;
                    }
                    int var104 = arg3 << 14;
                    if (arg0 < 0) {
                        var104 -= arg0 * var33;
                        arg0 = 0;
                    }
                    int var105 = arg1 - this.field2624.field2928;
                    int var106 = var50 * var105 + var48;
                    int var107 = var53 * var105 + var51;
                    int var108 = var56 * var105 + var54;
                    if (var31 < var32) {
                        int var109 = arg2 - arg0;
                        int var110 = arg0 - arg1;
                        int var111 = var57[arg1];
                        while (true) {
                            var110--;
                            if (var110 < 0) {
                                while (true) {
                                    var109--;
                                    if (var109 < 0) {
                                        return;
                                    }
                                    this.method5200(Statics.field5533, var23, 0, 0, var111, var104 >> 14, var102 >> 14, var87, var35, var88, var39, var106, var107, var108, var49, var52, var55);
                                    var104 += var33;
                                    var102 += var32;
                                    var87 += var36;
                                    var111 += Statics.field5532;
                                    var106 += var50;
                                    var107 += var53;
                                    var108 += var56;
                                    var88 += var40;
                                }
                            }
                            this.method5200(Statics.field5533, var23, 0, 0, var111, var103 >> 14, var102 >> 14, var87, var35, var88, var39, var106, var107, var108, var49, var52, var55);
                            var103 += var31;
                            var102 += var32;
                            var87 += var36;
                            var111 += Statics.field5532;
                            var106 += var50;
                            var107 += var53;
                            var108 += var56;
                            var88 += var40;
                        }
                    } else {
                        int var112 = arg2 - arg0;
                        int var113 = arg0 - arg1;
                        int var114 = var57[arg1];
                        while (true) {
                            var113--;
                            if (var113 < 0) {
                                while (true) {
                                    var112--;
                                    if (var112 < 0) {
                                        return;
                                    }
                                    this.method5200(Statics.field5533, var23, 0, 0, var114, var102 >> 14, var104 >> 14, var87, var35, var88, var39, var106, var107, var108, var49, var52, var55);
                                    var104 += var33;
                                    var102 += var32;
                                    var87 += var36;
                                    var114 += Statics.field5532;
                                    var106 += var50;
                                    var107 += var53;
                                    var108 += var56;
                                    var88 += var40;
                                }
                            }
                            this.method5200(Statics.field5533, var23, 0, 0, var114, var102 >> 14, var103 >> 14, var87, var35, var88, var39, var106, var107, var108, var49, var52, var55);
                            var103 += var31;
                            var102 += var32;
                            var87 += var36;
                            var114 += Statics.field5532;
                            var106 += var50;
                            var107 += var53;
                            var108 += var56;
                            var88 += var40;
                        }
                    }
                }
            }
        } else if (arg2 < var58) {
            if (arg0 > var58) {
                arg0 = var58;
            }
            if (arg1 > var58) {
                arg1 = var58;
            }
            int var115 = (arg11 << 9) - arg5 * var35 + var35;
            float var116 = arg8 - (float) arg5 * var39 + var39;
            if (arg0 < arg1) {
                int var117;
                int var118 = var117 = arg5 << 14;
                if (arg2 < 0) {
                    var118 -= arg2 * var32;
                    var117 -= arg2 * var33;
                    var116 -= (float) arg2 * var40;
                    var115 -= arg2 * var36;
                    arg2 = 0;
                }
                int var119 = arg3 << 14;
                if (arg0 < 0) {
                    var119 -= arg0 * var31;
                    arg0 = 0;
                }
                int var120 = arg2 - this.field2624.field2928;
                int var121 = var50 * var120 + var48;
                int var122 = var53 * var120 + var51;
                int var123 = var56 * var120 + var54;
                if (var32 < var33) {
                    int var124 = arg1 - arg0;
                    int var125 = arg0 - arg2;
                    int var126 = var57[arg2];
                    while (true) {
                        var125--;
                        if (var125 < 0) {
                            while (true) {
                                var124--;
                                if (var124 < 0) {
                                    return;
                                }
                                this.method5200(Statics.field5533, var23, 0, 0, var126, var118 >> 14, var119 >> 14, var115, var35, var116, var39, var121, var122, var123, var49, var52, var55);
                                var118 += var32;
                                var119 += var31;
                                var115 += var36;
                                var126 += Statics.field5532;
                                var121 += var50;
                                var122 += var53;
                                var123 += var56;
                                var116 += var40;
                            }
                        }
                        this.method5200(Statics.field5533, var23, 0, 0, var126, var118 >> 14, var117 >> 14, var115, var35, var116, var39, var121, var122, var123, var49, var52, var55);
                        var118 += var32;
                        var117 += var33;
                        var115 += var36;
                        var126 += Statics.field5532;
                        var121 += var50;
                        var122 += var53;
                        var123 += var56;
                        var116 += var40;
                    }
                } else {
                    int var127 = arg1 - arg0;
                    int var128 = arg0 - arg2;
                    int var129 = var57[arg2];
                    while (true) {
                        var128--;
                        if (var128 < 0) {
                            while (true) {
                                var127--;
                                if (var127 < 0) {
                                    return;
                                }
                                this.method5200(Statics.field5533, var23, 0, 0, var129, var119 >> 14, var118 >> 14, var115, var35, var116, var39, var121, var122, var123, var49, var52, var55);
                                var118 += var32;
                                var119 += var31;
                                var115 += var36;
                                var129 += Statics.field5532;
                                var121 += var50;
                                var122 += var53;
                                var123 += var56;
                                var116 += var40;
                            }
                        }
                        this.method5200(Statics.field5533, var23, 0, 0, var129, var117 >> 14, var118 >> 14, var115, var35, var116, var39, var121, var122, var123, var49, var52, var55);
                        var118 += var32;
                        var117 += var33;
                        var115 += var36;
                        var129 += Statics.field5532;
                        var121 += var50;
                        var122 += var53;
                        var123 += var56;
                        var116 += var40;
                    }
                }
            } else {
                int var130;
                int var131 = var130 = arg5 << 14;
                if (arg2 < 0) {
                    var131 -= arg2 * var32;
                    var130 -= arg2 * var33;
                    var116 -= (float) arg2 * var40;
                    var115 -= arg2 * var36;
                    arg2 = 0;
                }
                int var132 = arg4 << 14;
                if (arg1 < 0) {
                    var132 -= arg1 * var31;
                    arg1 = 0;
                }
                int var133 = arg2 - this.field2624.field2928;
                int var134 = var50 * var133 + var48;
                int var135 = var53 * var133 + var51;
                int var136 = var56 * var133 + var54;
                if (var32 < var33) {
                    int var137 = arg0 - arg1;
                    int var138 = arg1 - arg2;
                    int var139 = var57[arg2];
                    while (true) {
                        var138--;
                        if (var138 < 0) {
                            while (true) {
                                var137--;
                                if (var137 < 0) {
                                    return;
                                }
                                this.method5200(Statics.field5533, var23, 0, 0, var139, var132 >> 14, var130 >> 14, var115, var35, var116, var39, var134, var135, var136, var49, var52, var55);
                                var132 += var31;
                                var130 += var33;
                                var115 += var36;
                                var139 += Statics.field5532;
                                var134 += var50;
                                var135 += var53;
                                var136 += var56;
                                var116 += var40;
                            }
                        }
                        this.method5200(Statics.field5533, var23, 0, 0, var139, var131 >> 14, var130 >> 14, var115, var35, var116, var39, var134, var135, var136, var49, var52, var55);
                        var131 += var32;
                        var130 += var33;
                        var115 += var36;
                        var139 += Statics.field5532;
                        var134 += var50;
                        var135 += var53;
                        var136 += var56;
                        var116 += var40;
                    }
                } else {
                    int var140 = arg0 - arg1;
                    int var141 = arg1 - arg2;
                    int var142 = var57[arg2];
                    while (true) {
                        var141--;
                        if (var141 < 0) {
                            while (true) {
                                var140--;
                                if (var140 < 0) {
                                    return;
                                }
                                this.method5200(Statics.field5533, var23, 0, 0, var142, var130 >> 14, var132 >> 14, var115, var35, var116, var39, var134, var135, var136, var49, var52, var55);
                                var132 += var31;
                                var130 += var33;
                                var115 += var36;
                                var142 += Statics.field5532;
                                var134 += var50;
                                var135 += var53;
                                var136 += var56;
                                var116 += var40;
                            }
                        }
                        this.method5200(Statics.field5533, var23, 0, 0, var142, var130 >> 14, var131 >> 14, var115, var35, var116, var39, var134, var135, var136, var49, var52, var55);
                        var131 += var32;
                        var130 += var33;
                        var115 += var36;
                        var142 += Statics.field5532;
                        var134 += var50;
                        var135 += var53;
                        var136 += var56;
                        var116 += var40;
                    }
                }
            }
        }
    }

    @ObfuscatedName("kh.cp([I[IIIIIIIIFFIIIIII)V")
    public final void method5200(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, float arg9, float arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16) {
        if (this.field2624.field2933) {
            if (arg6 > this.field2624.field2927) {
                arg6 = this.field2624.field2927;
            }
            if (arg5 < 0) {
                arg5 = 0;
            }
        }
        if (arg5 >= arg6) {
            return;
        }
        int var18 = arg4 + arg5;
        int var19 = arg5 * arg8 + arg7;
        float var20 = (float) arg5 * arg10 + arg9;
        int var21 = arg6 - arg5;
        if (!this.field2616) {
            int var70 = arg5 - this.field2624.field2919;
            int var71 = arg14 * var70 + arg11;
            int var72 = arg15 * var70 + arg12;
            int var73 = arg16 * var70 + arg13;
            int var74 = var73 >> 14;
            int var75;
            int var76;
            if (var74 == 0) {
                var75 = 0;
                var76 = 0;
            } else {
                var75 = var71 / var74;
                var76 = var72 / var74;
            }
            int var77 = arg14 * var21 + var71;
            int var78 = arg15 * var21 + var72;
            int var79 = arg16 * var21 + var73;
            int var80 = var79 >> 14;
            int var81;
            int var82;
            if (var80 == 0) {
                var81 = 0;
                var82 = 0;
            } else {
                var81 = var77 / var80;
                var82 = var78 / var80;
            }
            int var83 = (var75 << 18) + var76;
            int var84 = ((var81 - var75) / var21 << 18) + (var82 - var76) / var21;
            int var85 = var21 >> 3;
            int var86 = arg8 << 3;
            int var87 = var19 >> 8;
            if (this.field2620) {
                if (var85 > 0) {
                    do {
                        method5184(arg0, Statics.field5534, arg1, var18, var87, var83, var20);
                        var18++;
                        int var88 = var83 + var84;
                        float var89 = arg10 + var20;
                        method5184(arg0, Statics.field5534, arg1, var18, var87, var88, var89);
                        var18++;
                        int var90 = var84 + var88;
                        float var91 = arg10 + var89;
                        method5184(arg0, Statics.field5534, arg1, var18, var87, var90, var91);
                        var18++;
                        int var92 = var84 + var90;
                        float var93 = arg10 + var91;
                        method5184(arg0, Statics.field5534, arg1, var18, var87, var92, var93);
                        var18++;
                        int var94 = var84 + var92;
                        float var95 = arg10 + var93;
                        method5184(arg0, Statics.field5534, arg1, var18, var87, var94, var95);
                        var18++;
                        int var96 = var84 + var94;
                        float var97 = arg10 + var95;
                        method5184(arg0, Statics.field5534, arg1, var18, var87, var96, var97);
                        var18++;
                        int var98 = var84 + var96;
                        float var99 = arg10 + var97;
                        method5184(arg0, Statics.field5534, arg1, var18, var87, var98, var99);
                        var18++;
                        int var100 = var84 + var98;
                        float var101 = arg10 + var99;
                        method5184(arg0, Statics.field5534, arg1, var18, var87, var100, var101);
                        var18++;
                        var83 = var84 + var100;
                        var20 = arg10 + var101;
                        var19 += var86;
                        var87 = var19 >> 8;
                        var85--;
                    } while (var85 > 0);
                }
                int var102 = arg6 - arg5 & 0x7;
                if (var102 > 0) {
                    do {
                        method5184(arg0, Statics.field5534, arg1, var18, var87, var83, var20);
                        var18++;
                        var83 += var84;
                        var20 += arg10;
                        var102--;
                    } while (var102 > 0);
                }
            } else {
                if (var85 > 0) {
                    do {
                        method5189(arg0, Statics.field5534, arg1, var18, var87, var83, var20);
                        var18++;
                        int var103 = var83 + var84;
                        float var104 = arg10 + var20;
                        method5189(arg0, Statics.field5534, arg1, var18, var87, var103, var104);
                        var18++;
                        int var105 = var84 + var103;
                        float var106 = arg10 + var104;
                        method5189(arg0, Statics.field5534, arg1, var18, var87, var105, var106);
                        var18++;
                        int var107 = var84 + var105;
                        float var108 = arg10 + var106;
                        method5189(arg0, Statics.field5534, arg1, var18, var87, var107, var108);
                        var18++;
                        int var109 = var84 + var107;
                        float var110 = arg10 + var108;
                        method5189(arg0, Statics.field5534, arg1, var18, var87, var109, var110);
                        var18++;
                        int var111 = var84 + var109;
                        float var112 = arg10 + var110;
                        method5189(arg0, Statics.field5534, arg1, var18, var87, var111, var112);
                        var18++;
                        int var113 = var84 + var111;
                        float var114 = arg10 + var112;
                        method5189(arg0, Statics.field5534, arg1, var18, var87, var113, var114);
                        var18++;
                        int var115 = var84 + var113;
                        float var116 = arg10 + var114;
                        method5189(arg0, Statics.field5534, arg1, var18, var87, var115, var116);
                        var18++;
                        var83 = var84 + var115;
                        var20 = arg10 + var116;
                        var19 += var86;
                        var87 = var19 >> 8;
                        var85--;
                    } while (var85 > 0);
                }
                int var117 = arg6 - arg5 & 0x7;
                if (var117 > 0) {
                    do {
                        method5189(arg0, Statics.field5534, arg1, var18, var87, var83, var20);
                        var18++;
                        var83 += var84;
                        var20 += arg10;
                        var117--;
                    } while (var117 > 0);
                }
            }
            return;
        }
        int var22 = arg5 - this.field2624.field2919;
        int var23 = arg14 * var22 + arg11;
        int var24 = arg15 * var22 + arg12;
        int var25 = arg16 * var22 + arg13;
        int var26 = var25 >> 12;
        int var27;
        int var28;
        if (var26 == 0) {
            var27 = 0;
            var28 = 0;
        } else {
            var27 = var23 / var26;
            var28 = var24 / var26;
        }
        int var29 = arg14 * var21 + var23;
        int var30 = arg15 * var21 + var24;
        int var31 = arg16 * var21 + var25;
        int var32 = var31 >> 12;
        int var33;
        int var34;
        if (var32 == 0) {
            var33 = 0;
            var34 = 0;
        } else {
            var33 = var29 / var32;
            var34 = var30 / var32;
        }
        int var35 = (var27 << 20) + var28;
        int var36 = ((var33 - var27) / var21 << 20) + (var34 - var28) / var21;
        int var37 = var21 >> 3;
        int var38 = arg8 << 3;
        int var39 = var19 >> 8;
        if (!this.field2620) {
            if (var37 > 0) {
                do {
                    method5182(arg0, Statics.field5534, arg1, var18, var39, var35, var20);
                    var18++;
                    int var55 = var35 + var36;
                    float var56 = arg10 + var20;
                    method5182(arg0, Statics.field5534, arg1, var18, var39, var55, var56);
                    var18++;
                    int var57 = var36 + var55;
                    float var58 = arg10 + var56;
                    method5182(arg0, Statics.field5534, arg1, var18, var39, var57, var58);
                    var18++;
                    int var59 = var36 + var57;
                    float var60 = arg10 + var58;
                    method5182(arg0, Statics.field5534, arg1, var18, var39, var59, var60);
                    var18++;
                    int var61 = var36 + var59;
                    float var62 = arg10 + var60;
                    method5182(arg0, Statics.field5534, arg1, var18, var39, var61, var62);
                    var18++;
                    int var63 = var36 + var61;
                    float var64 = arg10 + var62;
                    method5182(arg0, Statics.field5534, arg1, var18, var39, var63, var64);
                    var18++;
                    int var65 = var36 + var63;
                    float var66 = arg10 + var64;
                    method5182(arg0, Statics.field5534, arg1, var18, var39, var65, var66);
                    var18++;
                    int var67 = var36 + var65;
                    float var68 = arg10 + var66;
                    method5182(arg0, Statics.field5534, arg1, var18, var39, var67, var68);
                    var18++;
                    var35 = var36 + var67;
                    var20 = arg10 + var68;
                    var19 += var38;
                    var39 = var19 >> 8;
                    var37--;
                } while (var37 > 0);
            }
            int var69 = arg6 - arg5 & 0x7;
            if (var69 > 0) {
                do {
                    method5182(arg0, Statics.field5534, arg1, var18, var39, var35, var20);
                    var18++;
                    var35 += var36;
                    var20 += arg10;
                    var69--;
                } while (var69 > 0);
            }
            return;
        }
        if (var37 > 0) {
            do {
                method5188(arg0, Statics.field5534, arg1, var18, var39, var35, var20);
                var18++;
                int var40 = var35 + var36;
                float var41 = arg10 + var20;
                method5188(arg0, Statics.field5534, arg1, var18, var39, var40, var41);
                var18++;
                int var42 = var36 + var40;
                float var43 = arg10 + var41;
                method5188(arg0, Statics.field5534, arg1, var18, var39, var42, var43);
                var18++;
                int var44 = var36 + var42;
                float var45 = arg10 + var43;
                method5188(arg0, Statics.field5534, arg1, var18, var39, var44, var45);
                var18++;
                int var46 = var36 + var44;
                float var47 = arg10 + var45;
                method5188(arg0, Statics.field5534, arg1, var18, var39, var46, var47);
                var18++;
                int var48 = var36 + var46;
                float var49 = arg10 + var47;
                method5188(arg0, Statics.field5534, arg1, var18, var39, var48, var49);
                var18++;
                int var50 = var36 + var48;
                float var51 = arg10 + var49;
                method5188(arg0, Statics.field5534, arg1, var18, var39, var50, var51);
                var18++;
                int var52 = var36 + var50;
                float var53 = arg10 + var51;
                method5188(arg0, Statics.field5534, arg1, var18, var39, var52, var53);
                var18++;
                var35 = var36 + var52;
                var20 = arg10 + var53;
                var19 += var38;
                var39 = var19 >> 8;
                var37--;
            } while (var37 > 0);
        }
        int var54 = arg6 - arg5 & 0x7;
        if (var54 <= 0) {
            return;
        }
        do {
            method5188(arg0, Statics.field5534, arg1, var18, var39, var35, var20);
            var18++;
            var35 += var36;
            var20 += arg10;
            var54--;
        } while (var54 > 0);
    }
}

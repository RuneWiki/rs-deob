package deob;

@ObfuscatedName("az")
public class class160 extends class177 {

    @ObfuscatedName("az.f")
    public int field2393;

    @ObfuscatedName("az.g")
    public int field2391;

    @ObfuscatedName("az.e")
    public int field2392;

    @ObfuscatedName("az.n")
    public int field2390;

    @ObfuscatedName("az.o")
    public int field2384;

    @ObfuscatedName("az.l")
    public int field2396;

    @ObfuscatedName("az.j")
    public int field2387;

    @ObfuscatedName("az.h")
    public int field2398;

    @ObfuscatedName("az.i")
    public int field2397;

    @ObfuscatedName("az.t")
    public int field2388;

    @ObfuscatedName("az.s")
    public int field2389;

    @ObfuscatedName("az.r")
    public int field2386;

    @ObfuscatedName("az.p")
    public int field2385;

    @ObfuscatedName("az.z")
    public int field2395;

    @ObfuscatedName("az.x")
    public boolean field2394;

    @ObfuscatedName("az.l(I)V")
    public synchronized void method2894(int arg0) {
        int var2 = ((class112) this.field2649).field1779.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field2387 = arg0;
    }

    @ObfuscatedName("az.o()I")
    public int method2896() {
        int var1 = this.field2398 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field2391 == 0) {
            var2 -= this.field2387 * var2 / (((class112) this.field2649).field1779.length << 8);
        } else if (this.field2391 >= 0) {
            var2 -= this.field2392 * var2 / ((class112) this.field2649).field1779.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class160(class112 arg0, int arg1, int arg2, int arg3) {
        this.field2649 = arg0;
        this.field2392 = arg0.field1778;
        this.field2393 = arg0.field1781;
        this.field2394 = arg0.field1780;
        this.field2385 = arg1;
        this.field2384 = arg2;
        this.field2388 = arg3;
        this.field2387 = 0;
        this.method2900();
    }

    @ObfuscatedName("az.h(Lbx;III)Laz;")
    public static class160 method2899(class112 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1779 == null || arg0.field1779.length == 0 ? null : new class160(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("az.r()V")
    public void method2900() {
        this.field2398 = this.field2384;
        this.field2386 = method2957(this.field2384, this.field2388);
        this.field2390 = method2916(this.field2384, this.field2388);
    }

    @ObfuscatedName("az.n(I)V")
    public synchronized void method2901(int arg0) {
        this.field2391 = arg0;
    }

    public class160(class112 arg0, int arg1, int arg2) {
        this.field2649 = arg0;
        this.field2392 = arg0.field1778;
        this.field2393 = arg0.field1781;
        this.field2394 = arg0.field1780;
        this.field2385 = arg1;
        this.field2384 = arg2;
        this.field2388 = 8192;
        this.field2387 = 0;
        this.method2900();
    }

    @ObfuscatedName("az.z()I")
    public synchronized int method2905() {
        return this.field2388 < 0 ? -1 : this.field2388;
    }

    @ObfuscatedName("az.i()V")
    public void method2908() {
        if (this.field2395 == 0) {
            return;
        }
        if (this.field2384 == Integer.MIN_VALUE) {
            this.field2384 = 0;
        }
        this.field2395 = 0;
        this.method2900();
    }

    @ObfuscatedName("az.m(III)V")
    public synchronized void method2910(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method3034(arg1, arg2);
            return;
        }
        int var4 = method2957(arg1, arg2);
        int var5 = method2916(arg1, arg2);
        if (this.field2386 == var4 && this.field2390 == var5) {
            this.field2395 = 0;
            return;
        }
        int var6 = arg1 - this.field2398;
        if (this.field2398 - arg1 > var6) {
            var6 = this.field2398 - arg1;
        }
        if (var4 - this.field2386 > var6) {
            var6 = var4 - this.field2386;
        }
        if (this.field2386 - var4 > var6) {
            var6 = this.field2386 - var4;
        }
        if (var5 - this.field2390 > var6) {
            var6 = var5 - this.field2390;
        }
        if (this.field2390 - var5 > var6) {
            var6 = this.field2390 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field2395 = arg0;
        this.field2384 = arg1;
        this.field2388 = arg2;
        this.field2396 = (arg1 - this.field2398) / arg0;
        this.field2397 = (var4 - this.field2386) / arg0;
        this.field2389 = (var5 - this.field2390) / arg0;
    }

    @ObfuscatedName("az.v(I)V")
    public synchronized void method2911(int arg0) {
        if (arg0 == 0) {
            this.method3026(0);
            this.method44();
        } else if (this.field2386 == 0 && this.field2390 == 0) {
            this.field2395 = 0;
            this.field2384 = 0;
            this.field2398 = 0;
            this.method44();
        } else {
            int var2 = -this.field2398;
            if (this.field2398 > var2) {
                var2 = this.field2398;
            }
            if (-this.field2386 > var2) {
                var2 = -this.field2386;
            }
            if (this.field2386 > var2) {
                var2 = this.field2386;
            }
            if (-this.field2390 > var2) {
                var2 = -this.field2390;
            }
            if (this.field2390 > var2) {
                var2 = this.field2390;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field2395 = arg0;
            this.field2384 = Integer.MIN_VALUE;
            this.field2396 = -this.field2398 / arg0;
            this.field2397 = -this.field2386 / arg0;
            this.field2389 = -this.field2390 / arg0;
        }
    }

    @ObfuscatedName("az.au([IIIII)I")
    public int method2912(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field2395 > 0) {
                int var6 = this.field2395 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field2395 += arg1;
                if (this.field2385 == -256 && (this.field2387 & 0xFF) == 0) {
                    if (Statics.field2866) {
                        arg1 = method2932(0, ((class112) this.field2649).field1779, arg0, this.field2387, arg1, this.field2386, this.field2390, this.field2397, this.field2389, 0, var6, arg2, this);
                    } else {
                        arg1 = method2931(((class112) this.field2649).field1779, arg0, this.field2387, arg1, this.field2398, this.field2396, 0, var6, arg2, this);
                    }
                } else if (Statics.field2866) {
                    arg1 = method2936(0, 0, ((class112) this.field2649).field1779, arg0, this.field2387, arg1, this.field2386, this.field2390, this.field2397, this.field2389, 0, var6, arg2, this, this.field2385, arg4);
                } else {
                    arg1 = method2913(0, 0, ((class112) this.field2649).field1779, arg0, this.field2387, arg1, this.field2398, this.field2396, 0, var6, arg2, this, this.field2385, arg4);
                }
                this.field2395 -= arg1;
                if (this.field2395 != 0) {
                    return arg1;
                }
                if (!this.method2982()) {
                    continue;
                }
                return arg3;
            }
            if (this.field2385 == -256 && (this.field2387 & 0xFF) == 0) {
                if (Statics.field2866) {
                    return method2925(0, ((class112) this.field2649).field1779, arg0, this.field2387, arg1, this.field2386, this.field2390, 0, arg3, arg2, this);
                }
                return method3010(((class112) this.field2649).field1779, arg0, this.field2387, arg1, this.field2398, 0, arg3, arg2, this);
            }
            if (Statics.field2866) {
                return method2928(0, 0, ((class112) this.field2649).field1779, arg0, this.field2387, arg1, this.field2386, this.field2390, 0, arg3, arg2, this, this.field2385, arg4);
            }
            return method3038(0, 0, ((class112) this.field2649).field1779, arg0, this.field2387, arg1, this.field2398, 0, arg3, arg2, this, this.field2385, arg4);
        }
    }

    @ObfuscatedName("az.az(II[B[IIIIIIIILaz;II)I")
    public static int method2913(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class160 arg11, int arg12, int arg13) {
        arg11.field2386 -= arg11.field2397 * arg5;
        arg11.field2390 -= arg11.field2389 * arg5;
        int var14;
        if (arg12 == 0 || (var14 = (arg10 + 256 - arg4 + arg12) / arg12 + arg5) > arg9) {
            var14 = arg9;
        }
        int var10001;
        while (arg5 < var14) {
            int var15 = arg4 >> 8;
            byte var16 = arg2[var15 - 1];
            var10001 = arg5++;
            arg3[var10001] += ((var16 << 8) + (arg4 & 0xFF) * (arg2[var15] - var16)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += arg12;
        }
        int var17;
        if (arg12 == 0 || (var17 = (arg10 - arg4 + arg12) / arg12 + arg5) > arg9) {
            var17 = arg9;
        }
        int var18 = arg13;
        int var19 = arg12;
        while (arg5 < var17) {
            var10001 = arg5++;
            arg3[var10001] += ((var18 << 8) + (arg4 & 0xFF) * (arg2[arg4 >> 8] - var18)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += var19;
        }
        arg11.field2386 += arg11.field2397 * arg5;
        arg11.field2390 += arg11.field2389 * arg5;
        arg11.field2398 = arg6;
        arg11.field2387 = arg4;
        return arg5;
    }

    @ObfuscatedName("az.y()Z")
    public boolean method2914() {
        return this.field2387 < 0 || this.field2387 >= ((class112) this.field2649).field1779.length << 8;
    }

    @ObfuscatedName("az.b()Z")
    public boolean method2915() {
        return this.field2395 != 0;
    }

    @ObfuscatedName("az.p(II)I")
    public static int method2916(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("az.q()Lam;")
    public class177 method1289() {
        return null;
    }

    @ObfuscatedName("az.x()I")
    public synchronized int method2917() {
        return this.field2384 == Integer.MIN_VALUE ? 0 : this.field2384;
    }

    @ObfuscatedName("az.a([III)V")
    public synchronized void method1274(int[] arg0, int arg1, int arg2) {
        if (this.field2384 == 0 && this.field2395 == 0) {
            this.method1221(arg2);
            return;
        }
        class112 var4 = (class112) this.field2649;
        int var5 = this.field2392 << 8;
        int var6 = this.field2393 << 8;
        int var7 = var4.field1779.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field2391 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field2387 < 0) {
            if (this.field2385 <= 0) {
                this.method2908();
                this.method44();
                return;
            }
            this.field2387 = 0;
        }
        if (this.field2387 >= var7) {
            if (this.field2385 >= 0) {
                this.method2908();
                this.method44();
                return;
            }
            this.field2387 = var7 - 1;
        }
        if (this.field2391 >= 0) {
            if (this.field2391 > 0) {
                if (this.field2394) {
                    label131: {
                        if (this.field2385 < 0) {
                            var9 = this.method2912(arg0, arg1, var5, var10, var4.field1779[this.field2392]);
                            if (this.field2387 >= var5) {
                                return;
                            }
                            this.field2387 = var5 + var5 - 1 - this.field2387;
                            this.field2385 = -this.field2385;
                            if (--this.field2391 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method2919(arg0, var9, var6, var10, var4.field1779[this.field2393 - 1]);
                            if (this.field2387 < var6) {
                                return;
                            }
                            this.field2387 = var6 + var6 - 1 - this.field2387;
                            this.field2385 = -this.field2385;
                            if (--this.field2391 == 0) {
                                break;
                            }
                            var9 = this.method2912(arg0, var9, var5, var10, var4.field1779[this.field2392]);
                            if (this.field2387 >= var5) {
                                return;
                            }
                            this.field2387 = var5 + var5 - 1 - this.field2387;
                            this.field2385 = -this.field2385;
                        } while (--this.field2391 != 0);
                    }
                } else if (this.field2385 < 0) {
                    while (true) {
                        var9 = this.method2912(arg0, var9, var5, var10, var4.field1779[this.field2393 - 1]);
                        if (this.field2387 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field2387) / var8;
                        if (var12 >= this.field2391) {
                            this.field2387 += this.field2391 * var8;
                            this.field2391 = 0;
                            break;
                        }
                        this.field2387 += var8 * var12;
                        this.field2391 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method2919(arg0, var9, var6, var10, var4.field1779[this.field2392]);
                        if (this.field2387 < var6) {
                            return;
                        }
                        int var13 = (this.field2387 - var5) / var8;
                        if (var13 >= this.field2391) {
                            this.field2387 -= this.field2391 * var8;
                            this.field2391 = 0;
                            break;
                        }
                        this.field2387 -= var8 * var13;
                        this.field2391 -= var13;
                    }
                }
            }
            if (this.field2385 < 0) {
                this.method2912(arg0, var9, 0, var10, 0);
                if (this.field2387 < 0) {
                    this.field2387 = -1;
                    this.method2908();
                    this.method44();
                }
            } else {
                this.method2919(arg0, var9, var7, var10, 0);
                if (this.field2387 >= var7) {
                    this.field2387 = var7;
                    this.method2908();
                    this.method44();
                }
            }
        } else if (this.field2394) {
            if (this.field2385 < 0) {
                var9 = this.method2912(arg0, arg1, var5, var10, var4.field1779[this.field2392]);
                if (this.field2387 >= var5) {
                    return;
                }
                this.field2387 = var5 + var5 - 1 - this.field2387;
                this.field2385 = -this.field2385;
            }
            while (true) {
                int var11 = this.method2919(arg0, var9, var6, var10, var4.field1779[this.field2393 - 1]);
                if (this.field2387 < var6) {
                    return;
                }
                this.field2387 = var6 + var6 - 1 - this.field2387;
                this.field2385 = -this.field2385;
                var9 = this.method2912(arg0, var11, var5, var10, var4.field1779[this.field2392]);
                if (this.field2387 >= var5) {
                    return;
                }
                this.field2387 = var5 + var5 - 1 - this.field2387;
                this.field2385 = -this.field2385;
            }
        } else if (this.field2385 < 0) {
            while (true) {
                var9 = this.method2912(arg0, var9, var5, var10, var4.field1779[this.field2393 - 1]);
                if (this.field2387 >= var5) {
                    return;
                }
                this.field2387 = var6 - 1 - (var6 - 1 - this.field2387) % var8;
            }
        } else {
            while (true) {
                var9 = this.method2919(arg0, var9, var6, var10, var4.field1779[this.field2392]);
                if (this.field2387 < var6) {
                    return;
                }
                this.field2387 = (this.field2387 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("az.g(I)V")
    public synchronized void method2918(int arg0) {
        this.method3034(arg0 << 6, this.method2905());
    }

    @ObfuscatedName("az.at([IIIII)I")
    public int method2919(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field2395 > 0) {
                int var6 = this.field2395 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field2395 += arg1;
                if (this.field2385 == 256 && (this.field2387 & 0xFF) == 0) {
                    if (Statics.field2866) {
                        arg1 = method2967(0, ((class112) this.field2649).field1779, arg0, this.field2387, arg1, this.field2386, this.field2390, this.field2397, this.field2389, 0, var6, arg2, this);
                    } else {
                        arg1 = method2929(((class112) this.field2649).field1779, arg0, this.field2387, arg1, this.field2398, this.field2396, 0, var6, arg2, this);
                    }
                } else if (Statics.field2866) {
                    arg1 = method2934(0, 0, ((class112) this.field2649).field1779, arg0, this.field2387, arg1, this.field2386, this.field2390, this.field2397, this.field2389, 0, var6, arg2, this, this.field2385, arg4);
                } else {
                    arg1 = method2933(0, 0, ((class112) this.field2649).field1779, arg0, this.field2387, arg1, this.field2398, this.field2396, 0, var6, arg2, this, this.field2385, arg4);
                }
                this.field2395 -= arg1;
                if (this.field2395 != 0) {
                    return arg1;
                }
                if (!this.method2982()) {
                    continue;
                }
                return arg3;
            }
            if (this.field2385 == 256 && (this.field2387 & 0xFF) == 0) {
                if (Statics.field2866) {
                    return method2921(0, ((class112) this.field2649).field1779, arg0, this.field2387, arg1, this.field2386, this.field2390, 0, arg3, arg2, this);
                }
                return method3019(((class112) this.field2649).field1779, arg0, this.field2387, arg1, this.field2398, 0, arg3, arg2, this);
            }
            if (Statics.field2866) {
                return method2927(0, 0, ((class112) this.field2649).field1779, arg0, this.field2387, arg1, this.field2386, this.field2390, 0, arg3, arg2, this, this.field2385, arg4);
            }
            return method2926(0, 0, ((class112) this.field2649).field1779, arg0, this.field2387, arg1, this.field2398, 0, arg3, arg2, this, this.field2385, arg4);
        }
    }

    @ObfuscatedName("az.ah(I[B[IIIIIIIILaz;)I")
    public static int method2921(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class160 arg10) {
        int var11 = arg3 >> 8;
        int var12 = arg9 >> 8;
        int var13 = arg5 << 2;
        int var14 = arg6 << 2;
        int var15;
        if ((var15 = arg4 + var12 - var11) > arg8) {
            var15 = arg8;
        }
        int var16 = arg4 << 1;
        int var17 = var15 << 1;
        int var23 = var17 - 6;
        while (var16 < var23) {
            byte var18 = arg1[var11++];
            int var24 = var16++;
            arg2[var24] += var13 * var18;
            int var25 = var16++;
            arg2[var25] += var14 * var18;
            byte var19 = arg1[var11++];
            int var27 = var16++;
            arg2[var27] += var13 * var19;
            int var28 = var16++;
            arg2[var28] += var14 * var19;
            byte var20 = arg1[var11++];
            int var30 = var16++;
            arg2[var30] += var13 * var20;
            int var31 = var16++;
            arg2[var31] += var14 * var20;
            byte var21 = arg1[var11++];
            int var33 = var16++;
            arg2[var33] += var13 * var21;
            int var34 = var16++;
            arg2[var34] += var14 * var21;
        }
        var17 = var23 + 6;
        while (var16 < var17) {
            byte var22 = arg1[var11++];
            int var10001 = var16++;
            arg2[var10001] += var13 * var22;
            int var35 = var16++;
            arg2[var35] += var14 * var22;
        }
        arg10.field2387 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("az.aq(I[B[IIIIIIIILaz;)I")
    public static int method2925(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class160 arg10) {
        int var11 = arg3 >> 8;
        int var12 = arg9 >> 8;
        int var13 = arg5 << 2;
        int var14 = arg6 << 2;
        int var15;
        if ((var15 = arg4 + var11 - (var12 - 1)) > arg8) {
            var15 = arg8;
        }
        int var16 = arg4 << 1;
        int var17 = var15 << 1;
        int var23 = var17 - 6;
        while (var16 < var23) {
            byte var18 = arg1[var11--];
            int var24 = var16++;
            arg2[var24] += var13 * var18;
            int var25 = var16++;
            arg2[var25] += var14 * var18;
            byte var19 = arg1[var11--];
            int var27 = var16++;
            arg2[var27] += var13 * var19;
            int var28 = var16++;
            arg2[var28] += var14 * var19;
            byte var20 = arg1[var11--];
            int var30 = var16++;
            arg2[var30] += var13 * var20;
            int var31 = var16++;
            arg2[var31] += var14 * var20;
            byte var21 = arg1[var11--];
            int var33 = var16++;
            arg2[var33] += var13 * var21;
            int var34 = var16++;
            arg2[var34] += var14 * var21;
        }
        var17 = var23 + 6;
        while (var16 < var17) {
            byte var22 = arg1[var11--];
            int var10001 = var16++;
            arg2[var10001] += var13 * var22;
            int var35 = var16++;
            arg2[var35] += var14 * var22;
        }
        arg10.field2387 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("az.ai(II[B[IIIIIIILaz;II)I")
    public static int method2926(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class160 arg10, int arg11, int arg12) {
        int var13;
        if (arg11 == 0 || (var13 = (arg9 - arg4 + arg11 - 257) / arg11 + arg5) > arg8) {
            var13 = arg8;
        }
        int var10001;
        while (arg5 < var13) {
            int var14 = arg4 >> 8;
            byte var15 = arg2[var14];
            var10001 = arg5++;
            arg3[var10001] += ((var15 << 8) + (arg4 & 0xFF) * (arg2[var14 + 1] - var15)) * arg6 >> 6;
            arg4 += arg11;
        }
        int var16;
        if (arg11 == 0 || (var16 = (arg9 - arg4 + arg11 - 1) / arg11 + arg5) > arg8) {
            var16 = arg8;
        }
        int var17 = arg12;
        while (arg5 < var16) {
            byte var18 = arg2[arg4 >> 8];
            var10001 = arg5++;
            arg3[var10001] += ((var18 << 8) + (arg4 & 0xFF) * (var17 - var18)) * arg6 >> 6;
            arg4 += arg11;
        }
        arg10.field2387 = arg4;
        return arg5;
    }

    @ObfuscatedName("az.ay(II[B[IIIIIIIILaz;II)I")
    public static int method2927(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class160 arg11, int arg12, int arg13) {
        int var14;
        if (arg12 == 0 || (var14 = (arg10 - arg4 + arg12 - 257) / arg12 + arg5) > arg9) {
            var14 = arg9;
        }
        int var15 = arg5 << 1;
        int var16 = var14 << 1;
        int var10001;
        while (var15 < var16) {
            int var17 = arg4 >> 8;
            byte var18 = arg2[var17];
            int var19 = (var18 << 8) + (arg4 & 0xFF) * (arg2[var17 + 1] - var18);
            var10001 = var15++;
            arg3[var10001] += arg6 * var19 >> 6;
            int var25 = var15++;
            arg3[var25] += arg7 * var19 >> 6;
            arg4 += arg12;
        }
        int var20;
        if (arg12 == 0 || (var20 = (var15 >> 1) + (arg10 - arg4 + arg12 - 1) / arg12) > arg9) {
            var20 = arg9;
        }
        int var21 = var20 << 1;
        int var22 = arg13;
        while (var15 < var21) {
            byte var23 = arg2[arg4 >> 8];
            int var24 = (var23 << 8) + (arg4 & 0xFF) * (var22 - var23);
            var10001 = var15++;
            arg3[var10001] += arg6 * var24 >> 6;
            var10001 = var15++;
            arg3[var10001] += arg7 * var24 >> 6;
            arg4 += arg12;
        }
        arg11.field2387 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("az.ab(II[B[IIIIIIIILaz;II)I")
    public static int method2928(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class160 arg11, int arg12, int arg13) {
        int var14;
        if (arg12 == 0 || (var14 = (arg10 + 256 - arg4 + arg12) / arg12 + arg5) > arg9) {
            var14 = arg9;
        }
        int var15 = arg5 << 1;
        int var16 = var14 << 1;
        int var10001;
        while (var15 < var16) {
            int var17 = arg4 >> 8;
            byte var18 = arg2[var17 - 1];
            int var19 = (var18 << 8) + (arg4 & 0xFF) * (arg2[var17] - var18);
            var10001 = var15++;
            arg3[var10001] += arg6 * var19 >> 6;
            int var24 = var15++;
            arg3[var24] += arg7 * var19 >> 6;
            arg4 += arg12;
        }
        int var20;
        if (arg12 == 0 || (var20 = (var15 >> 1) + (arg10 - arg4 + arg12) / arg12) > arg9) {
            var20 = arg9;
        }
        int var21 = var20 << 1;
        int var22 = arg13;
        while (var15 < var21) {
            int var23 = (var22 << 8) + (arg4 & 0xFF) * (arg2[arg4 >> 8] - var22);
            var10001 = var15++;
            arg3[var10001] += arg6 * var23 >> 6;
            var10001 = var15++;
            arg3[var10001] += arg7 * var23 >> 6;
            arg4 += arg12;
        }
        arg11.field2387 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("az.aj([B[IIIIIIIILaz;)I")
    public static int method2929(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class160 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field2386 += (var14 - arg3) * arg9.field2397;
        arg9.field2390 += (var14 - arg3) * arg9.field2389;
        var14 -= 3;
        int var10001;
        while (arg3 < var14) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var10++] * var12;
            int var15 = var12 + var13;
            int var18 = arg3++;
            arg1[var18] += arg0[var10++] * var15;
            int var16 = var13 + var15;
            int var19 = arg3++;
            arg1[var19] += arg0[var10++] * var16;
            int var17 = var13 + var16;
            int var20 = arg3++;
            arg1[var20] += arg0[var10++] * var17;
            var12 = var13 + var17;
        }
        var14 += 3;
        while (arg3 < var14) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var10++] * var12;
            var12 += var13;
        }
        arg9.field2398 = var12 >> 2;
        arg9.field2387 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("az.ap([B[IIIIIIIILaz;)I")
    public static int method2931(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class160 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field2386 += (var14 - arg3) * arg9.field2397;
        arg9.field2390 += (var14 - arg3) * arg9.field2389;
        var14 -= 3;
        int var10001;
        while (arg3 < var14) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var10--] * var12;
            int var15 = var12 + var13;
            int var18 = arg3++;
            arg1[var18] += arg0[var10--] * var15;
            int var16 = var13 + var15;
            int var19 = arg3++;
            arg1[var19] += arg0[var10--] * var16;
            int var17 = var13 + var16;
            int var20 = arg3++;
            arg1[var20] += arg0[var10--] * var17;
            var12 = var13 + var17;
        }
        var14 += 3;
        while (arg3 < var14) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var10--] * var12;
            var12 += var13;
        }
        arg9.field2398 = var12 >> 2;
        arg9.field2387 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("az.ac(I[B[IIIIIIIIIILaz;)I")
    public static int method2932(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class160 arg12) {
        int var13 = arg3 >> 8;
        int var14 = arg11 >> 8;
        int var15 = arg5 << 2;
        int var16 = arg6 << 2;
        int var17 = arg7 << 2;
        int var18 = arg8 << 2;
        int var19;
        if ((var19 = arg4 + var13 - (var14 - 1)) > arg10) {
            var19 = arg10;
        }
        arg12.field2398 += (var19 - arg4) * arg12.field2396;
        int var20 = arg4 << 1;
        int var21 = var19 << 1;
        int var44 = var21 - 6;
        while (var20 < var44) {
            byte var22 = arg1[var13--];
            int var33 = var20++;
            arg2[var33] += var15 * var22;
            int var23 = var15 + var17;
            int var34 = var20++;
            arg2[var34] += var16 * var22;
            int var24 = var16 + var18;
            byte var25 = arg1[var13--];
            int var36 = var20++;
            arg2[var36] += var23 * var25;
            int var26 = var17 + var23;
            int var37 = var20++;
            arg2[var37] += var24 * var25;
            int var27 = var18 + var24;
            byte var28 = arg1[var13--];
            int var39 = var20++;
            arg2[var39] += var26 * var28;
            int var29 = var17 + var26;
            int var40 = var20++;
            arg2[var40] += var27 * var28;
            int var30 = var18 + var27;
            byte var31 = arg1[var13--];
            int var42 = var20++;
            arg2[var42] += var29 * var31;
            var15 = var17 + var29;
            int var43 = var20++;
            arg2[var43] += var30 * var31;
            var16 = var18 + var30;
        }
        var21 = var44 + 6;
        while (var20 < var21) {
            byte var32 = arg1[var13--];
            int var10001 = var20++;
            arg2[var10001] += var15 * var32;
            var15 += var17;
            int var45 = var20++;
            arg2[var45] += var16 * var32;
            var16 += var18;
        }
        arg12.field2386 = var15 >> 2;
        arg12.field2390 = var16 >> 2;
        arg12.field2387 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("az.an(II[B[IIIIIIIILaz;II)I")
    public static int method2933(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class160 arg11, int arg12, int arg13) {
        arg11.field2386 -= arg11.field2397 * arg5;
        arg11.field2390 -= arg11.field2389 * arg5;
        int var14;
        if (arg12 == 0 || (var14 = (arg10 - arg4 + arg12 - 257) / arg12 + arg5) > arg9) {
            var14 = arg9;
        }
        int var10001;
        while (arg5 < var14) {
            int var15 = arg4 >> 8;
            byte var16 = arg2[var15];
            var10001 = arg5++;
            arg3[var10001] += ((var16 << 8) + (arg4 & 0xFF) * (arg2[var15 + 1] - var16)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += arg12;
        }
        int var17;
        if (arg12 == 0 || (var17 = (arg10 - arg4 + arg12 - 1) / arg12 + arg5) > arg9) {
            var17 = arg9;
        }
        int var18 = arg13;
        while (arg5 < var17) {
            byte var19 = arg2[arg4 >> 8];
            var10001 = arg5++;
            arg3[var10001] += ((var19 << 8) + (arg4 & 0xFF) * (var18 - var19)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += arg12;
        }
        arg11.field2386 += arg11.field2397 * arg5;
        arg11.field2390 += arg11.field2389 * arg5;
        arg11.field2398 = arg6;
        arg11.field2387 = arg4;
        return arg5;
    }

    @ObfuscatedName("az.al(II[B[IIIIIIIIIILaz;II)I")
    public static int method2934(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class160 arg13, int arg14, int arg15) {
        arg13.field2398 -= arg13.field2396 * arg5;
        int var16;
        if (arg14 == 0 || (var16 = (arg12 - arg4 + arg14 - 257) / arg14 + arg5) > arg11) {
            var16 = arg11;
        }
        int var17 = arg5 << 1;
        int var18 = var16 << 1;
        int var10001;
        while (var17 < var18) {
            int var19 = arg4 >> 8;
            byte var20 = arg2[var19];
            int var21 = (var20 << 8) + (arg4 & 0xFF) * (arg2[var19 + 1] - var20);
            var10001 = var17++;
            arg3[var10001] += arg6 * var21 >> 6;
            arg6 += arg8;
            int var28 = var17++;
            arg3[var28] += arg7 * var21 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        int var22;
        if (arg14 == 0 || (var22 = (var17 >> 1) + (arg12 - arg4 + arg14 - 1) / arg14) > arg11) {
            var22 = arg11;
        }
        int var23 = var22 << 1;
        int var24 = arg15;
        while (var17 < var23) {
            byte var25 = arg2[arg4 >> 8];
            int var26 = (var25 << 8) + (arg4 & 0xFF) * (var24 - var25);
            var10001 = var17++;
            arg3[var10001] += arg6 * var26 >> 6;
            arg6 += arg8;
            var10001 = var17++;
            arg3[var10001] += arg7 * var26 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        int var27 = var17 >> 1;
        arg13.field2398 += arg13.field2396 * var27;
        arg13.field2386 = arg6;
        arg13.field2390 = arg7;
        arg13.field2387 = arg4;
        return var27;
    }

    @ObfuscatedName("az.av(II[B[IIIIIIIIIILaz;II)I")
    public static int method2936(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class160 arg13, int arg14, int arg15) {
        arg13.field2398 -= arg13.field2396 * arg5;
        int var16;
        if (arg14 == 0 || (var16 = (arg12 + 256 - arg4 + arg14) / arg14 + arg5) > arg11) {
            var16 = arg11;
        }
        int var17 = arg5 << 1;
        int var18 = var16 << 1;
        int var10001;
        while (var17 < var18) {
            int var19 = arg4 >> 8;
            byte var20 = arg2[var19 - 1];
            int var21 = (var20 << 8) + (arg4 & 0xFF) * (arg2[var19] - var20);
            var10001 = var17++;
            arg3[var10001] += arg6 * var21 >> 6;
            arg6 += arg8;
            int var27 = var17++;
            arg3[var27] += arg7 * var21 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        int var22;
        if (arg14 == 0 || (var22 = (var17 >> 1) + (arg12 - arg4 + arg14) / arg14) > arg11) {
            var22 = arg11;
        }
        int var23 = var22 << 1;
        int var24 = arg15;
        while (var17 < var23) {
            int var25 = (var24 << 8) + (arg4 & 0xFF) * (arg2[arg4 >> 8] - var24);
            var10001 = var17++;
            arg3[var10001] += arg6 * var25 >> 6;
            arg6 += arg8;
            var10001 = var17++;
            arg3[var10001] += arg7 * var25 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        int var26 = var17 >> 1;
        arg13.field2398 += arg13.field2396 * var26;
        arg13.field2386 = arg6;
        arg13.field2390 = arg7;
        arg13.field2387 = arg4;
        return var26;
    }

    @ObfuscatedName("az.s(II)V")
    public synchronized void method2943(int arg0, int arg1) {
        this.method2910(arg0, arg1, this.method2905());
    }

    @ObfuscatedName("az.j(II)I")
    public static int method2957(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("az.aa(I)V")
    public synchronized void method1221(int arg0) {
        if (this.field2395 > 0) {
            if (arg0 >= this.field2395) {
                if (this.field2384 == Integer.MIN_VALUE) {
                    this.field2384 = 0;
                    this.field2390 = 0;
                    this.field2386 = 0;
                    this.field2398 = 0;
                    this.method44();
                    arg0 = this.field2395;
                }
                this.field2395 = 0;
                this.method2900();
            } else {
                this.field2398 += this.field2396 * arg0;
                this.field2386 += this.field2397 * arg0;
                this.field2390 += this.field2389 * arg0;
                this.field2395 -= arg0;
            }
        }
        class112 var2 = (class112) this.field2649;
        int var3 = this.field2392 << 8;
        int var4 = this.field2393 << 8;
        int var5 = var2.field1779.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field2391 = 0;
        }
        if (this.field2387 < 0) {
            if (this.field2385 <= 0) {
                this.method2908();
                this.method44();
                return;
            }
            this.field2387 = 0;
        }
        if (this.field2387 >= var5) {
            if (this.field2385 >= 0) {
                this.method2908();
                this.method44();
                return;
            }
            this.field2387 = var5 - 1;
        }
        this.field2387 += this.field2385 * arg0;
        if (this.field2391 >= 0) {
            if (this.field2391 > 0) {
                if (this.field2394) {
                    label121: {
                        if (this.field2385 < 0) {
                            if (this.field2387 >= var3) {
                                return;
                            }
                            this.field2387 = var3 + var3 - 1 - this.field2387;
                            this.field2385 = -this.field2385;
                            if (--this.field2391 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field2387 < var4) {
                                return;
                            }
                            this.field2387 = var4 + var4 - 1 - this.field2387;
                            this.field2385 = -this.field2385;
                            if (--this.field2391 == 0) {
                                break;
                            }
                            if (this.field2387 >= var3) {
                                return;
                            }
                            this.field2387 = var3 + var3 - 1 - this.field2387;
                            this.field2385 = -this.field2385;
                        } while (--this.field2391 != 0);
                    }
                } else {
                    label153: {
                        if (this.field2385 < 0) {
                            if (this.field2387 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field2387) / var6;
                            if (var7 >= this.field2391) {
                                this.field2387 += this.field2391 * var6;
                                this.field2391 = 0;
                                break label153;
                            }
                            this.field2387 += var6 * var7;
                            this.field2391 -= var7;
                        } else if (this.field2387 >= var4) {
                            int var8 = (this.field2387 - var3) / var6;
                            if (var8 >= this.field2391) {
                                this.field2387 -= this.field2391 * var6;
                                this.field2391 = 0;
                                break label153;
                            }
                            this.field2387 -= var6 * var8;
                            this.field2391 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field2385 < 0) {
                if (this.field2387 < 0) {
                    this.field2387 = -1;
                    this.method2908();
                    this.method44();
                }
            } else if (this.field2387 >= var5) {
                this.field2387 = var5;
                this.method2908();
                this.method44();
            }
        } else if (this.field2394) {
            if (this.field2385 < 0) {
                if (this.field2387 >= var3) {
                    return;
                }
                this.field2387 = var3 + var3 - 1 - this.field2387;
                this.field2385 = -this.field2385;
            }
            while (this.field2387 >= var4) {
                this.field2387 = var4 + var4 - 1 - this.field2387;
                this.field2385 = -this.field2385;
                if (this.field2387 >= var3) {
                    return;
                }
                this.field2387 = var3 + var3 - 1 - this.field2387;
                this.field2385 = -this.field2385;
            }
        } else if (this.field2385 < 0) {
            if (this.field2387 >= var3) {
                return;
            }
            this.field2387 = var4 - 1 - (var4 - 1 - this.field2387) % var6;
        } else if (this.field2387 >= var4) {
            this.field2387 = (this.field2387 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("az.d()I")
    public int method1220() {
        return this.field2384 == 0 && this.field2395 == 0 ? 0 : 1;
    }

    @ObfuscatedName("az.ar(I[B[IIIIIIIIIILaz;)I")
    public static int method2967(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class160 arg12) {
        int var13 = arg3 >> 8;
        int var14 = arg11 >> 8;
        int var15 = arg5 << 2;
        int var16 = arg6 << 2;
        int var17 = arg7 << 2;
        int var18 = arg8 << 2;
        int var19;
        if ((var19 = arg4 + var14 - var13) > arg10) {
            var19 = arg10;
        }
        arg12.field2398 += (var19 - arg4) * arg12.field2396;
        int var20 = arg4 << 1;
        int var21 = var19 << 1;
        int var44 = var21 - 6;
        while (var20 < var44) {
            byte var22 = arg1[var13++];
            int var33 = var20++;
            arg2[var33] += var15 * var22;
            int var23 = var15 + var17;
            int var34 = var20++;
            arg2[var34] += var16 * var22;
            int var24 = var16 + var18;
            byte var25 = arg1[var13++];
            int var36 = var20++;
            arg2[var36] += var23 * var25;
            int var26 = var17 + var23;
            int var37 = var20++;
            arg2[var37] += var24 * var25;
            int var27 = var18 + var24;
            byte var28 = arg1[var13++];
            int var39 = var20++;
            arg2[var39] += var26 * var28;
            int var29 = var17 + var26;
            int var40 = var20++;
            arg2[var40] += var27 * var28;
            int var30 = var18 + var27;
            byte var31 = arg1[var13++];
            int var42 = var20++;
            arg2[var42] += var29 * var31;
            var15 = var17 + var29;
            int var43 = var20++;
            arg2[var43] += var30 * var31;
            var16 = var18 + var30;
        }
        var21 = var44 + 6;
        while (var20 < var21) {
            byte var32 = arg1[var13++];
            int var10001 = var20++;
            arg2[var10001] += var15 * var32;
            var15 += var17;
            int var45 = var20++;
            arg2[var45] += var16 * var32;
            var16 += var18;
        }
        arg12.field2386 = var15 >> 2;
        arg12.field2390 = var16 >> 2;
        arg12.field2387 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("az.ax()Z")
    public boolean method2982() {
        int var1 = this.field2384;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method2957(var1, this.field2388);
            var2 = method2916(var1, this.field2388);
        }
        if (this.field2398 != var1 || this.field2386 != var3 || this.field2390 != var2) {
            if (this.field2398 < var1) {
                this.field2396 = 1;
                this.field2395 = var1 - this.field2398;
            } else if (this.field2398 > var1) {
                this.field2396 = -1;
                this.field2395 = this.field2398 - var1;
            } else {
                this.field2396 = 0;
            }
            if (this.field2386 < var3) {
                this.field2397 = 1;
                if (this.field2395 == 0 || this.field2395 > var3 - this.field2386) {
                    this.field2395 = var3 - this.field2386;
                }
            } else if (this.field2386 > var3) {
                this.field2397 = -1;
                if (this.field2395 == 0 || this.field2395 > this.field2386 - var3) {
                    this.field2395 = this.field2386 - var3;
                }
            } else {
                this.field2397 = 0;
            }
            if (this.field2390 < var2) {
                this.field2389 = 1;
                if (this.field2395 == 0 || this.field2395 > var2 - this.field2390) {
                    this.field2395 = var2 - this.field2390;
                }
            } else if (this.field2390 > var2) {
                this.field2389 = -1;
                if (this.field2395 == 0 || this.field2395 > this.field2390 - var2) {
                    this.field2395 = this.field2390 - var2;
                }
            } else {
                this.field2389 = 0;
            }
            return false;
        } else if (this.field2384 == Integer.MIN_VALUE) {
            this.field2384 = 0;
            this.field2390 = 0;
            this.field2386 = 0;
            this.field2398 = 0;
            this.method44();
            return true;
        } else {
            this.method2900();
            return false;
        }
    }

    @ObfuscatedName("az.t(Lbx;II)Laz;")
    public static class160 method2987(class112 arg0, int arg1, int arg2) {
        return arg0.field1779 == null || arg0.field1779.length == 0 ? null : new class160(arg0, (int) ((long) arg0.field1782 * 256L * (long) arg1 / (long) (Statics.field2851 * 100)), arg2 << 6);
    }

    @ObfuscatedName("az.w(Z)V")
    public synchronized void method3004(boolean arg0) {
        this.field2385 = (this.field2385 >>> 31) + (this.field2385 ^ this.field2385 >> 31);
        if (arg0) {
            this.field2385 = -this.field2385;
        }
    }

    @ObfuscatedName("az.ad([B[IIIIIIILaz;)I")
    public static int method3010(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class160 arg8) {
        int var9 = arg2 >> 8;
        int var10 = arg7 >> 8;
        int var11 = arg4 << 2;
        int var12;
        if ((var12 = arg3 + var9 - (var10 - 1)) > arg6) {
            var12 = arg6;
        }
        var12 -= 3;
        int var10001;
        while (arg3 < var12) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var9--] * var11;
            int var13 = arg3++;
            arg1[var13] += arg0[var9--] * var11;
            int var14 = arg3++;
            arg1[var14] += arg0[var9--] * var11;
            int var15 = arg3++;
            arg1[var15] += arg0[var9--] * var11;
        }
        var12 += 3;
        while (arg3 < var12) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var9--] * var11;
        }
        arg8.field2387 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("az.c(I)V")
    public synchronized void method3013(int arg0) {
        if (this.field2385 < 0) {
            this.field2385 = -arg0;
        } else {
            this.field2385 = arg0;
        }
    }

    @ObfuscatedName("az.k()Lam;")
    public class177 method1218() {
        return null;
    }

    @ObfuscatedName("az.ag([B[IIIIIIILaz;)I")
    public static int method3019(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class160 arg8) {
        int var9 = arg2 >> 8;
        int var10 = arg7 >> 8;
        int var11 = arg4 << 2;
        int var12;
        if ((var12 = arg3 + var10 - var9) > arg6) {
            var12 = arg6;
        }
        var12 -= 3;
        int var10001;
        while (arg3 < var12) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var9++] * var11;
            int var13 = arg3++;
            arg1[var13] += arg0[var9++] * var11;
            int var14 = arg3++;
            arg1[var14] += arg0[var9++] * var11;
            int var15 = arg3++;
            arg1[var15] += arg0[var9++] * var11;
        }
        var12 += 3;
        while (arg3 < var12) {
            var10001 = arg3++;
            arg1[var10001] += arg0[var9++] * var11;
        }
        arg8.field2387 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("az.e(I)V")
    public synchronized void method3026(int arg0) {
        this.method3034(arg0, this.method2905());
    }

    @ObfuscatedName("az.u()I")
    public synchronized int method3032() {
        return this.field2385 < 0 ? -this.field2385 : this.field2385;
    }

    @ObfuscatedName("az.f(II)V")
    public synchronized void method3034(int arg0, int arg1) {
        this.field2384 = arg0;
        this.field2388 = arg1;
        this.field2395 = 0;
        this.method2900();
    }

    @ObfuscatedName("az.as(II[B[IIIIIIILaz;II)I")
    public static int method3038(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class160 arg10, int arg11, int arg12) {
        int var13;
        if (arg11 == 0 || (var13 = (arg9 + 256 - arg4 + arg11) / arg11 + arg5) > arg8) {
            var13 = arg8;
        }
        int var10001;
        while (arg5 < var13) {
            int var14 = arg4 >> 8;
            byte var15 = arg2[var14 - 1];
            var10001 = arg5++;
            arg3[var10001] += ((var15 << 8) + (arg4 & 0xFF) * (arg2[var14] - var15)) * arg6 >> 6;
            arg4 += arg11;
        }
        int var16;
        if (arg11 == 0 || (var16 = (arg9 - arg4 + arg11) / arg11 + arg5) > arg8) {
            var16 = arg8;
        }
        int var17 = arg12;
        int var18 = arg11;
        while (arg5 < var16) {
            var10001 = arg5++;
            arg3[var10001] += ((var17 << 8) + (arg4 & 0xFF) * (arg2[arg4 >> 8] - var17)) * arg6 >> 6;
            arg4 += var18;
        }
        arg10.field2387 = arg4;
        return arg5;
    }
}

package deob;

@ObfuscatedName("aa")
public class class181 extends class183 {

    @ObfuscatedName("aa.f")
    public int field2745;

    @ObfuscatedName("aa.g")
    public boolean field2747;

    @ObfuscatedName("aa.d")
    public int field2751;

    @ObfuscatedName("aa.e")
    public int field2743;

    @ObfuscatedName("aa.b")
    public int field2753;

    @ObfuscatedName("aa.o")
    public int field2750;

    @ObfuscatedName("aa.l")
    public int field2744;

    @ObfuscatedName("aa.j")
    public int field2739;

    @ObfuscatedName("aa.k")
    public int field2741;

    @ObfuscatedName("aa.h")
    public int field2740;

    @ObfuscatedName("aa.t")
    public int field2749;

    @ObfuscatedName("aa.s")
    public int field2746;

    @ObfuscatedName("aa.q")
    public int field2752;

    @ObfuscatedName("aa.z")
    public int field2742;

    @ObfuscatedName("aa.x")
    public int field2748;

    @ObfuscatedName("aa.h(II)I")
    public static int method3152(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("aa.w(Lbq;II)Laa;")
    public static class181 method3153(class120 arg0, int arg1, int arg2) {
        return arg0.field1942 == null || arg0.field1942.length == 0 ? null : new class181(arg0, (int) ((long) arg0.field1939 * 256L * (long) arg1 / (long) (Statics.field2840 * 100)), arg2 << 6);
    }

    @ObfuscatedName("aa.t(Lbq;III)Laa;")
    public static class181 method3157(class120 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1942 == null || arg0.field1942.length == 0 ? null : new class181(arg0, arg1, arg2, arg3);
    }

    public class181(class120 arg0, int arg1, int arg2, int arg3) {
        this.field2806 = arg0;
        this.field2739 = arg0.field1941;
        this.field2748 = arg0.field1940;
        this.field2747 = arg0.field1943;
        this.field2740 = arg1;
        this.field2741 = arg2;
        this.field2749 = arg3;
        this.field2753 = 0;
        this.method3179();
    }

    @ObfuscatedName("aa.f(I)V")
    public synchronized void method3159(int arg0) {
        this.method3161(arg0 << 6, this.method3163());
    }

    @ObfuscatedName("aa.s(I)V")
    public synchronized void method3160(int arg0) {
        this.method3161(arg0, this.method3163());
    }

    @ObfuscatedName("aa.j(II)V")
    public synchronized void method3161(int arg0, int arg1) {
        this.field2741 = arg0;
        this.field2749 = arg1;
        this.field2750 = 0;
        this.method3179();
    }

    @ObfuscatedName("aa.x()I")
    public synchronized int method3162() {
        return this.field2741 == Integer.MIN_VALUE ? 0 : this.field2741;
    }

    @ObfuscatedName("aa.g()I")
    public synchronized int method3163() {
        return this.field2749 < 0 ? -1 : this.field2749;
    }

    public class181(class120 arg0, int arg1, int arg2) {
        this.field2806 = arg0;
        this.field2739 = arg0.field1941;
        this.field2748 = arg0.field1940;
        this.field2747 = arg0.field1943;
        this.field2740 = arg1;
        this.field2741 = arg2;
        this.field2749 = 8192;
        this.field2753 = 0;
        this.method3179();
    }

    @ObfuscatedName("aa.e(Z)V")
    public synchronized void method3164(boolean arg0) {
        this.field2740 = (this.field2740 >>> 31) + (this.field2740 ^ this.field2740 >> 31);
        if (arg0) {
            this.field2740 = -this.field2740;
        }
    }

    @ObfuscatedName("aa.q()V")
    public void method3165() {
        if (this.field2750 == 0) {
            return;
        }
        if (this.field2741 == Integer.MIN_VALUE) {
            this.field2741 = 0;
        }
        this.field2750 = 0;
        this.method3179();
    }

    @ObfuscatedName("aa.z(II)V")
    public synchronized void method3166(int arg0, int arg1) {
        this.method3167(arg0, arg1, this.method3163());
    }

    @ObfuscatedName("aa.i(III)V")
    public synchronized void method3167(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method3161(arg1, arg2);
            return;
        }
        int var4 = method3262(arg1, arg2);
        int var5 = method3152(arg1, arg2);
        if (this.field2744 == var4 && this.field2745 == var5) {
            this.field2750 = 0;
            return;
        }
        int var6 = arg1 - this.field2751;
        if (this.field2751 - arg1 > var6) {
            var6 = this.field2751 - arg1;
        }
        if (var4 - this.field2744 > var6) {
            var6 = var4 - this.field2744;
        }
        if (this.field2744 - var4 > var6) {
            var6 = this.field2744 - var4;
        }
        if (var5 - this.field2745 > var6) {
            var6 = var5 - this.field2745;
        }
        if (this.field2745 - var5 > var6) {
            var6 = this.field2745 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field2750 = arg0;
        this.field2741 = arg1;
        this.field2749 = arg2;
        this.field2743 = (arg1 - this.field2751) / arg0;
        this.field2752 = (var4 - this.field2744) / arg0;
        this.field2742 = (var5 - this.field2745) / arg0;
    }

    @ObfuscatedName("aa.r(I)V")
    public synchronized void method3168(int arg0) {
        if (arg0 == 0) {
            this.method3160(0);
            this.method234();
        } else if (this.field2744 == 0 && this.field2745 == 0) {
            this.field2750 = 0;
            this.field2741 = 0;
            this.field2751 = 0;
            this.method234();
        } else {
            int var2 = -this.field2751;
            if (this.field2751 > var2) {
                var2 = this.field2751;
            }
            if (-this.field2744 > var2) {
                var2 = -this.field2744;
            }
            if (this.field2744 > var2) {
                var2 = this.field2744;
            }
            if (-this.field2745 > var2) {
                var2 = -this.field2745;
            }
            if (this.field2745 > var2) {
                var2 = this.field2745;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field2750 = arg0;
            this.field2741 = Integer.MIN_VALUE;
            this.field2743 = -this.field2751 / arg0;
            this.field2752 = -this.field2744 / arg0;
            this.field2742 = -this.field2745 / arg0;
        }
    }

    @ObfuscatedName("aa.n(I)V")
    public synchronized void method3169(int arg0) {
        if (this.field2740 < 0) {
            this.field2740 = -arg0;
        } else {
            this.field2740 = arg0;
        }
    }

    @ObfuscatedName("aa.a()Z")
    public boolean method3172() {
        return this.field2750 != 0;
    }

    @ObfuscatedName("aa.o(I)V")
    public synchronized void method3173(int arg0) {
        int var2 = ((class120) this.field2806).field1942.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field2753 = arg0;
    }

    @ObfuscatedName("aa.m()Lag;")
    public class183 method992() {
        return null;
    }

    @ObfuscatedName("aa.c()I")
    public int method976() {
        return this.field2741 == 0 && this.field2750 == 0 ? 0 : 1;
    }

    @ObfuscatedName("aa.ac(I)V")
    public synchronized void method995(int arg0) {
        if (this.field2750 > 0) {
            if (arg0 >= this.field2750) {
                if (this.field2741 == Integer.MIN_VALUE) {
                    this.field2741 = 0;
                    this.field2745 = 0;
                    this.field2744 = 0;
                    this.field2751 = 0;
                    this.method234();
                    arg0 = this.field2750;
                }
                this.field2750 = 0;
                this.method3179();
            } else {
                this.field2751 += this.field2743 * arg0;
                this.field2744 += this.field2752 * arg0;
                this.field2745 += this.field2742 * arg0;
                this.field2750 -= arg0;
            }
        }
        class120 var2 = (class120) this.field2806;
        int var3 = this.field2739 << 8;
        int var4 = this.field2748 << 8;
        int var5 = var2.field1942.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field2746 = 0;
        }
        if (this.field2753 < 0) {
            if (this.field2740 <= 0) {
                this.method3165();
                this.method234();
                return;
            }
            this.field2753 = 0;
        }
        if (this.field2753 >= var5) {
            if (this.field2740 >= 0) {
                this.method3165();
                this.method234();
                return;
            }
            this.field2753 = var5 - 1;
        }
        this.field2753 += this.field2740 * arg0;
        if (this.field2746 >= 0) {
            if (this.field2746 > 0) {
                if (this.field2747) {
                    label121: {
                        if (this.field2740 < 0) {
                            if (this.field2753 >= var3) {
                                return;
                            }
                            this.field2753 = var3 + var3 - 1 - this.field2753;
                            this.field2740 = -this.field2740;
                            if (--this.field2746 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field2753 < var4) {
                                return;
                            }
                            this.field2753 = var4 + var4 - 1 - this.field2753;
                            this.field2740 = -this.field2740;
                            if (--this.field2746 == 0) {
                                break;
                            }
                            if (this.field2753 >= var3) {
                                return;
                            }
                            this.field2753 = var3 + var3 - 1 - this.field2753;
                            this.field2740 = -this.field2740;
                        } while (--this.field2746 != 0);
                    }
                } else {
                    label153: {
                        if (this.field2740 < 0) {
                            if (this.field2753 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field2753) / var6;
                            if (var7 >= this.field2746) {
                                this.field2753 += this.field2746 * var6;
                                this.field2746 = 0;
                                break label153;
                            }
                            this.field2753 += var6 * var7;
                            this.field2746 -= var7;
                        } else if (this.field2753 >= var4) {
                            int var8 = (this.field2753 - var3) / var6;
                            if (var8 >= this.field2746) {
                                this.field2753 -= this.field2746 * var6;
                                this.field2746 = 0;
                                break label153;
                            }
                            this.field2753 -= var6 * var8;
                            this.field2746 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field2740 < 0) {
                if (this.field2753 < 0) {
                    this.field2753 = -1;
                    this.method3165();
                    this.method234();
                }
            } else if (this.field2753 >= var5) {
                this.field2753 = var5;
                this.method3165();
                this.method234();
            }
        } else if (this.field2747) {
            if (this.field2740 < 0) {
                if (this.field2753 >= var3) {
                    return;
                }
                this.field2753 = var3 + var3 - 1 - this.field2753;
                this.field2740 = -this.field2740;
            }
            while (this.field2753 >= var4) {
                this.field2753 = var4 + var4 - 1 - this.field2753;
                this.field2740 = -this.field2740;
                if (this.field2753 >= var3) {
                    return;
                }
                this.field2753 = var3 + var3 - 1 - this.field2753;
                this.field2740 = -this.field2740;
            }
        } else if (this.field2740 < 0) {
            if (this.field2753 >= var3) {
                return;
            }
            this.field2753 = var4 - 1 - (var4 - 1 - this.field2753) % var6;
        } else if (this.field2753 >= var4) {
            this.field2753 = (this.field2753 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("aa.ax([IIIII)I")
    public int method3175(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field2750 > 0) {
                int var6 = this.field2750 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field2750 += arg1;
                if (this.field2740 == 256 && (this.field2753 & 0xFF) == 0) {
                    if (Statics.field2825) {
                        arg1 = method3187(0, ((class120) this.field2806).field1942, arg0, this.field2753, arg1, this.field2744, this.field2745, this.field2752, this.field2742, 0, var6, arg2, this);
                    } else {
                        arg1 = method3181(((class120) this.field2806).field1942, arg0, this.field2753, arg1, this.field2751, this.field2743, 0, var6, arg2, this);
                    }
                } else if (Statics.field2825) {
                    arg1 = method3191(0, 0, ((class120) this.field2806).field1942, arg0, this.field2753, arg1, this.field2744, this.field2745, this.field2752, this.field2742, 0, var6, arg2, this, this.field2740, arg4);
                } else {
                    arg1 = method3190(0, 0, ((class120) this.field2806).field1942, arg0, this.field2753, arg1, this.field2751, this.field2743, 0, var6, arg2, this, this.field2740, arg4);
                }
                this.field2750 -= arg1;
                if (this.field2750 != 0) {
                    return arg1;
                }
                if (!this.method3177()) {
                    continue;
                }
                return arg3;
            }
            if (this.field2740 == 256 && (this.field2753 & 0xFF) == 0) {
                if (Statics.field2825) {
                    return method3214(0, ((class120) this.field2806).field1942, arg0, this.field2753, arg1, this.field2744, this.field2745, 0, arg3, arg2, this);
                }
                return method3256(((class120) this.field2806).field1942, arg0, this.field2753, arg1, this.field2751, 0, arg3, arg2, this);
            }
            if (Statics.field2825) {
                return method3183(0, 0, ((class120) this.field2806).field1942, arg0, this.field2753, arg1, this.field2744, this.field2745, 0, arg3, arg2, this, this.field2740, arg4);
            }
            return method3243(0, 0, ((class120) this.field2806).field1942, arg0, this.field2753, arg1, this.field2751, 0, arg3, arg2, this, this.field2740, arg4);
        }
    }

    @ObfuscatedName("aa.aw([IIIII)I")
    public int method3176(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field2750 > 0) {
                int var6 = this.field2750 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field2750 += arg1;
                if (this.field2740 == -256 && (this.field2753 & 0xFF) == 0) {
                    if (Statics.field2825) {
                        arg1 = method3189(0, ((class120) this.field2806).field1942, arg0, this.field2753, arg1, this.field2744, this.field2745, this.field2752, this.field2742, 0, var6, arg2, this);
                    } else {
                        arg1 = method3178(((class120) this.field2806).field1942, arg0, this.field2753, arg1, this.field2751, this.field2743, 0, var6, arg2, this);
                    }
                } else if (Statics.field2825) {
                    arg1 = method3193(0, 0, ((class120) this.field2806).field1942, arg0, this.field2753, arg1, this.field2744, this.field2745, this.field2752, this.field2742, 0, var6, arg2, this, this.field2740, arg4);
                } else {
                    arg1 = method3192(0, 0, ((class120) this.field2806).field1942, arg0, this.field2753, arg1, this.field2751, this.field2743, 0, var6, arg2, this, this.field2740, arg4);
                }
                this.field2750 -= arg1;
                if (this.field2750 != 0) {
                    return arg1;
                }
                if (!this.method3177()) {
                    continue;
                }
                return arg3;
            }
            if (this.field2740 == -256 && (this.field2753 & 0xFF) == 0) {
                if (Statics.field2825) {
                    return method3242(0, ((class120) this.field2806).field1942, arg0, this.field2753, arg1, this.field2744, this.field2745, 0, arg3, arg2, this);
                }
                return method3180(((class120) this.field2806).field1942, arg0, this.field2753, arg1, this.field2751, 0, arg3, arg2, this);
            }
            if (Statics.field2825) {
                return method3185(0, 0, ((class120) this.field2806).field1942, arg0, this.field2753, arg1, this.field2744, this.field2745, 0, arg3, arg2, this, this.field2740, arg4);
            }
            return method3284(0, 0, ((class120) this.field2806).field1942, arg0, this.field2753, arg1, this.field2751, 0, arg3, arg2, this, this.field2740, arg4);
        }
    }

    @ObfuscatedName("aa.aq()Z")
    public boolean method3177() {
        int var1 = this.field2741;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method3262(var1, this.field2749);
            var2 = method3152(var1, this.field2749);
        }
        if (this.field2751 != var1 || this.field2744 != var3 || this.field2745 != var2) {
            if (this.field2751 < var1) {
                this.field2743 = 1;
                this.field2750 = var1 - this.field2751;
            } else if (this.field2751 > var1) {
                this.field2743 = -1;
                this.field2750 = this.field2751 - var1;
            } else {
                this.field2743 = 0;
            }
            if (this.field2744 < var3) {
                this.field2752 = 1;
                if (this.field2750 == 0 || this.field2750 > var3 - this.field2744) {
                    this.field2750 = var3 - this.field2744;
                }
            } else if (this.field2744 > var3) {
                this.field2752 = -1;
                if (this.field2750 == 0 || this.field2750 > this.field2744 - var3) {
                    this.field2750 = this.field2744 - var3;
                }
            } else {
                this.field2752 = 0;
            }
            if (this.field2745 < var2) {
                this.field2742 = 1;
                if (this.field2750 == 0 || this.field2750 > var2 - this.field2745) {
                    this.field2750 = var2 - this.field2745;
                }
            } else if (this.field2745 > var2) {
                this.field2742 = -1;
                if (this.field2750 == 0 || this.field2750 > this.field2745 - var2) {
                    this.field2750 = this.field2745 - var2;
                }
            } else {
                this.field2742 = 0;
            }
            return false;
        } else if (this.field2741 == Integer.MIN_VALUE) {
            this.field2741 = 0;
            this.field2745 = 0;
            this.field2744 = 0;
            this.field2751 = 0;
            this.method234();
            return true;
        } else {
            this.method3179();
            return false;
        }
    }

    @ObfuscatedName("aa.am([B[IIIIIIIILaa;)I")
    public static int method3178(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class181 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field2744 += (var14 - arg3) * arg9.field2752;
        arg9.field2745 += (var14 - arg3) * arg9.field2742;
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
        arg9.field2751 = var12 >> 2;
        arg9.field2753 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("aa.d()V")
    public void method3179() {
        this.field2751 = this.field2741;
        this.field2744 = method3262(this.field2741, this.field2749);
        this.field2745 = method3152(this.field2741, this.field2749);
    }

    @ObfuscatedName("aa.ar([B[IIIIIIILaa;)I")
    public static int method3180(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class181 arg8) {
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
        arg8.field2753 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("aa.au([B[IIIIIIIILaa;)I")
    public static int method3181(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class181 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field2744 += (var14 - arg3) * arg9.field2752;
        arg9.field2745 += (var14 - arg3) * arg9.field2742;
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
        arg9.field2751 = var12 >> 2;
        arg9.field2753 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("aa.ad(II[B[IIIIIIIILaa;II)I")
    public static int method3183(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class181 arg11, int arg12, int arg13) {
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
        arg11.field2753 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("aa.av(II[B[IIIIIIIILaa;II)I")
    public static int method3185(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class181 arg11, int arg12, int arg13) {
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
        arg11.field2753 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("aa.ap(I[B[IIIIIIIIIILaa;)I")
    public static int method3187(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class181 arg12) {
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
        arg12.field2751 += (var19 - arg4) * arg12.field2743;
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
        arg12.field2744 = var15 >> 2;
        arg12.field2745 = var16 >> 2;
        arg12.field2753 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("aa.ao(I[B[IIIIIIIIIILaa;)I")
    public static int method3189(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class181 arg12) {
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
        arg12.field2751 += (var19 - arg4) * arg12.field2743;
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
        arg12.field2744 = var15 >> 2;
        arg12.field2745 = var16 >> 2;
        arg12.field2753 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("aa.al(II[B[IIIIIIIILaa;II)I")
    public static int method3190(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class181 arg11, int arg12, int arg13) {
        arg11.field2744 -= arg11.field2752 * arg5;
        arg11.field2745 -= arg11.field2742 * arg5;
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
        arg11.field2744 += arg11.field2752 * arg5;
        arg11.field2745 += arg11.field2742 * arg5;
        arg11.field2751 = arg6;
        arg11.field2753 = arg4;
        return arg5;
    }

    @ObfuscatedName("aa.an(II[B[IIIIIIIIIILaa;II)I")
    public static int method3191(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class181 arg13, int arg14, int arg15) {
        arg13.field2751 -= arg13.field2743 * arg5;
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
        arg13.field2751 += arg13.field2743 * var27;
        arg13.field2744 = arg6;
        arg13.field2745 = arg7;
        arg13.field2753 = arg4;
        return var27;
    }

    @ObfuscatedName("aa.aa(II[B[IIIIIIIILaa;II)I")
    public static int method3192(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class181 arg11, int arg12, int arg13) {
        arg11.field2744 -= arg11.field2752 * arg5;
        arg11.field2745 -= arg11.field2742 * arg5;
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
        arg11.field2744 += arg11.field2752 * arg5;
        arg11.field2745 += arg11.field2742 * arg5;
        arg11.field2751 = arg6;
        arg11.field2753 = arg4;
        return arg5;
    }

    @ObfuscatedName("aa.at(II[B[IIIIIIIIIILaa;II)I")
    public static int method3193(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class181 arg13, int arg14, int arg15) {
        arg13.field2751 -= arg13.field2743 * arg5;
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
        arg13.field2751 += arg13.field2743 * var26;
        arg13.field2744 = arg6;
        arg13.field2745 = arg7;
        arg13.field2753 = arg4;
        return var26;
    }

    @ObfuscatedName("aa.v([III)V")
    public synchronized void method1018(int[] arg0, int arg1, int arg2) {
        if (this.field2741 == 0 && this.field2750 == 0) {
            this.method995(arg2);
            return;
        }
        class120 var4 = (class120) this.field2806;
        int var5 = this.field2739 << 8;
        int var6 = this.field2748 << 8;
        int var7 = var4.field1942.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field2746 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field2753 < 0) {
            if (this.field2740 <= 0) {
                this.method3165();
                this.method234();
                return;
            }
            this.field2753 = 0;
        }
        if (this.field2753 >= var7) {
            if (this.field2740 >= 0) {
                this.method3165();
                this.method234();
                return;
            }
            this.field2753 = var7 - 1;
        }
        if (this.field2746 >= 0) {
            if (this.field2746 > 0) {
                if (this.field2747) {
                    label131: {
                        if (this.field2740 < 0) {
                            var9 = this.method3176(arg0, arg1, var5, var10, var4.field1942[this.field2739]);
                            if (this.field2753 >= var5) {
                                return;
                            }
                            this.field2753 = var5 + var5 - 1 - this.field2753;
                            this.field2740 = -this.field2740;
                            if (--this.field2746 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method3175(arg0, var9, var6, var10, var4.field1942[this.field2748 - 1]);
                            if (this.field2753 < var6) {
                                return;
                            }
                            this.field2753 = var6 + var6 - 1 - this.field2753;
                            this.field2740 = -this.field2740;
                            if (--this.field2746 == 0) {
                                break;
                            }
                            var9 = this.method3176(arg0, var9, var5, var10, var4.field1942[this.field2739]);
                            if (this.field2753 >= var5) {
                                return;
                            }
                            this.field2753 = var5 + var5 - 1 - this.field2753;
                            this.field2740 = -this.field2740;
                        } while (--this.field2746 != 0);
                    }
                } else if (this.field2740 < 0) {
                    while (true) {
                        var9 = this.method3176(arg0, var9, var5, var10, var4.field1942[this.field2748 - 1]);
                        if (this.field2753 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field2753) / var8;
                        if (var12 >= this.field2746) {
                            this.field2753 += this.field2746 * var8;
                            this.field2746 = 0;
                            break;
                        }
                        this.field2753 += var8 * var12;
                        this.field2746 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method3175(arg0, var9, var6, var10, var4.field1942[this.field2739]);
                        if (this.field2753 < var6) {
                            return;
                        }
                        int var13 = (this.field2753 - var5) / var8;
                        if (var13 >= this.field2746) {
                            this.field2753 -= this.field2746 * var8;
                            this.field2746 = 0;
                            break;
                        }
                        this.field2753 -= var8 * var13;
                        this.field2746 -= var13;
                    }
                }
            }
            if (this.field2740 < 0) {
                this.method3176(arg0, var9, 0, var10, 0);
                if (this.field2753 < 0) {
                    this.field2753 = -1;
                    this.method3165();
                    this.method234();
                }
            } else {
                this.method3175(arg0, var9, var7, var10, 0);
                if (this.field2753 >= var7) {
                    this.field2753 = var7;
                    this.method3165();
                    this.method234();
                }
            }
        } else if (this.field2747) {
            if (this.field2740 < 0) {
                var9 = this.method3176(arg0, arg1, var5, var10, var4.field1942[this.field2739]);
                if (this.field2753 >= var5) {
                    return;
                }
                this.field2753 = var5 + var5 - 1 - this.field2753;
                this.field2740 = -this.field2740;
            }
            while (true) {
                int var11 = this.method3175(arg0, var9, var6, var10, var4.field1942[this.field2748 - 1]);
                if (this.field2753 < var6) {
                    return;
                }
                this.field2753 = var6 + var6 - 1 - this.field2753;
                this.field2740 = -this.field2740;
                var9 = this.method3176(arg0, var11, var5, var10, var4.field1942[this.field2739]);
                if (this.field2753 >= var5) {
                    return;
                }
                this.field2753 = var5 + var5 - 1 - this.field2753;
                this.field2740 = -this.field2740;
            }
        } else if (this.field2740 < 0) {
            while (true) {
                var9 = this.method3176(arg0, var9, var5, var10, var4.field1942[this.field2748 - 1]);
                if (this.field2753 >= var5) {
                    return;
                }
                this.field2753 = var6 - 1 - (var6 - 1 - this.field2753) % var8;
            }
        } else {
            while (true) {
                var9 = this.method3175(arg0, var9, var6, var10, var4.field1942[this.field2739]);
                if (this.field2753 < var6) {
                    return;
                }
                this.field2753 = (this.field2753 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("aa.y()Z")
    public boolean method3208() {
        return this.field2753 < 0 || this.field2753 >= ((class120) this.field2806).field1942.length << 8;
    }

    @ObfuscatedName("aa.ab(I[B[IIIIIIIILaa;)I")
    public static int method3214(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class181 arg10) {
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
        arg10.field2753 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("aa.u()I")
    public synchronized int method3221() {
        return this.field2740 < 0 ? -this.field2740 : this.field2740;
    }

    @ObfuscatedName("aa.l(I)V")
    public synchronized void method3238(int arg0) {
        this.field2746 = arg0;
    }

    @ObfuscatedName("aa.ai(I[B[IIIIIIIILaa;)I")
    public static int method3242(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class181 arg10) {
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
        arg10.field2753 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("aa.ah(II[B[IIIIIIILaa;II)I")
    public static int method3243(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class181 arg10, int arg11, int arg12) {
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
        arg10.field2753 = arg4;
        return arg5;
    }

    @ObfuscatedName("aa.ak([B[IIIIIIILaa;)I")
    public static int method3256(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class181 arg8) {
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
        arg8.field2753 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("aa.b(II)I")
    public static int method3262(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("aa.k()I")
    public int method3263() {
        int var1 = this.field2751 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field2746 == 0) {
            var2 -= this.field2753 * var2 / (((class120) this.field2806).field1942.length << 8);
        } else if (this.field2746 >= 0) {
            var2 -= this.field2739 * var2 / ((class120) this.field2806).field1942.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @ObfuscatedName("aa.p()Lag;")
    public class183 method1027() {
        return null;
    }

    @ObfuscatedName("aa.as(II[B[IIIIIIILaa;II)I")
    public static int method3284(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class181 arg10, int arg11, int arg12) {
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
        arg10.field2753 = arg4;
        return arg5;
    }
}

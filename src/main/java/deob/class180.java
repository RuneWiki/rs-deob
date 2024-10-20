package deob;

@ObfuscatedName("ad")
public class class180 extends class182 {

    @ObfuscatedName("ad.g")
    public int field2743;

    @ObfuscatedName("ad.d")
    public int field2749;

    @ObfuscatedName("ad.e")
    public int field2756;

    @ObfuscatedName("ad.b")
    public int field2744;

    @ObfuscatedName("ad.c")
    public int field2751;

    @ObfuscatedName("ad.a")
    public int field2748;

    @ObfuscatedName("ad.m")
    public int field2746;

    @ObfuscatedName("ad.j")
    public int field2750;

    @ObfuscatedName("ad.k")
    public int field2755;

    @ObfuscatedName("ad.i")
    public int field2742;

    @ObfuscatedName("ad.v")
    public int field2753;

    @ObfuscatedName("ad.u")
    public int field2754;

    @ObfuscatedName("ad.z")
    public int field2747;

    @ObfuscatedName("ad.y")
    public boolean field2752;

    @ObfuscatedName("ad.x")
    public int field2745;

    @ObfuscatedName("ad.b()I")
    public int method3265() {
        int var1 = this.field2746 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field2749 == 0) {
            var2 -= this.field2753 * var2 / (((class117) this.field2810).field1828.length << 8);
        } else if (this.field2749 >= 0) {
            var2 -= this.field2750 * var2 / ((class117) this.field2810).field1828.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @ObfuscatedName("ad.i(Lbn;II)Lad;")
    public static class180 method3268(class117 arg0, int arg1, int arg2) {
        return arg0.field1828 == null || arg0.field1828.length == 0 ? null : new class180(arg0, (int) ((long) arg0.field1829 * 256L * (long) arg1 / (long) (Statics.field1914 * 100)), arg2 << 6);
    }

    @ObfuscatedName("ad.m(Lbn;III)Lad;")
    public static class180 method3269(class117 arg0, int arg1, int arg2, int arg3) {
        return arg0.field1828 == null || arg0.field1828.length == 0 ? null : new class180(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("ad.z()V")
    public void method3270() {
        this.field2746 = this.field2744;
        this.field2747 = method3375(this.field2744, this.field2742);
        this.field2745 = method3343(this.field2744, this.field2742);
    }

    @ObfuscatedName("ad.x(I)V")
    public synchronized void method3271(int arg0) {
        this.field2749 = arg0;
    }

    @ObfuscatedName("ad.d(I)V")
    public synchronized void method3272(int arg0) {
        this.method3274(arg0 << 6, this.method3276());
    }

    @ObfuscatedName("ad.j(I)V")
    public synchronized void method3273(int arg0) {
        this.method3274(arg0, this.method3276());
    }

    @ObfuscatedName("ad.g(II)V")
    public synchronized void method3274(int arg0, int arg1) {
        this.field2744 = arg0;
        this.field2742 = arg1;
        this.field2748 = 0;
        this.method3270();
    }

    @ObfuscatedName("ad.y()I")
    public synchronized int method3275() {
        return this.field2744 == Integer.MIN_VALUE ? 0 : this.field2744;
    }

    @ObfuscatedName("ad.a()I")
    public synchronized int method3276() {
        return this.field2742 < 0 ? -1 : this.field2742;
    }

    @ObfuscatedName("ad.u(I)V")
    public synchronized void method3277(int arg0) {
        int var2 = ((class117) this.field2810).field1828.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field2753 = arg0;
    }

    @ObfuscatedName("ad.k(Z)V")
    public synchronized void method3278(boolean arg0) {
        this.field2751 = (this.field2751 >>> 31) + (this.field2751 ^ this.field2751 >> 31);
        if (arg0) {
            this.field2751 = -this.field2751;
        }
    }

    @ObfuscatedName("ad.e()V")
    public void method3279() {
        if (this.field2748 == 0) {
            return;
        }
        if (this.field2744 == Integer.MIN_VALUE) {
            this.field2744 = 0;
        }
        this.field2748 = 0;
        this.method3270();
    }

    @ObfuscatedName("ad.p(II)V")
    public synchronized void method3280(int arg0, int arg1) {
        this.method3281(arg0, arg1, this.method3276());
    }

    @ObfuscatedName("ad.o(III)V")
    public synchronized void method3281(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method3274(arg1, arg2);
            return;
        }
        int var4 = method3375(arg1, arg2);
        int var5 = method3343(arg1, arg2);
        if (this.field2747 == var4 && this.field2745 == var5) {
            this.field2748 = 0;
            return;
        }
        int var6 = arg1 - this.field2746;
        if (this.field2746 - arg1 > var6) {
            var6 = this.field2746 - arg1;
        }
        if (var4 - this.field2747 > var6) {
            var6 = var4 - this.field2747;
        }
        if (this.field2747 - var4 > var6) {
            var6 = this.field2747 - var4;
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
        this.field2748 = arg0;
        this.field2744 = arg1;
        this.field2742 = arg2;
        this.field2754 = (arg1 - this.field2746) / arg0;
        this.field2755 = (var4 - this.field2747) / arg0;
        this.field2756 = (var5 - this.field2745) / arg0;
    }

    @ObfuscatedName("ad.s(I)V")
    public synchronized void method3282(int arg0) {
        if (arg0 == 0) {
            this.method3273(0);
            this.method76();
        } else if (this.field2747 == 0 && this.field2745 == 0) {
            this.field2748 = 0;
            this.field2744 = 0;
            this.field2746 = 0;
            this.method76();
        } else {
            int var2 = -this.field2746;
            if (this.field2746 > var2) {
                var2 = this.field2746;
            }
            if (-this.field2747 > var2) {
                var2 = -this.field2747;
            }
            if (this.field2747 > var2) {
                var2 = this.field2747;
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
            this.field2748 = arg0;
            this.field2744 = Integer.MIN_VALUE;
            this.field2754 = -this.field2746 / arg0;
            this.field2755 = -this.field2747 / arg0;
            this.field2756 = -this.field2745 / arg0;
        }
    }

    @ObfuscatedName("ad.f(I)V")
    public synchronized void method3283(int arg0) {
        if (this.field2751 < 0) {
            this.field2751 = -arg0;
        } else {
            this.field2751 = arg0;
        }
    }

    @ObfuscatedName("ad.t()Z")
    public boolean method3285() {
        return this.field2753 < 0 || this.field2753 >= ((class117) this.field2810).field1828.length << 8;
    }

    @ObfuscatedName("ad.w()Z")
    public boolean method3286() {
        return this.field2748 != 0;
    }

    public class180(class117 arg0, int arg1, int arg2, int arg3) {
        this.field2810 = arg0;
        this.field2750 = arg0.field1827;
        this.field2743 = arg0.field1825;
        this.field2752 = arg0.field1826;
        this.field2751 = arg1;
        this.field2744 = arg2;
        this.field2742 = arg3;
        this.field2753 = 0;
        this.method3270();
    }

    @ObfuscatedName("ad.q([III)V")
    public synchronized void method548(int[] arg0, int arg1, int arg2) {
        if (this.field2744 == 0 && this.field2748 == 0) {
            this.method549(arg2);
            return;
        }
        class117 var4 = (class117) this.field2810;
        int var5 = this.field2750 << 8;
        int var6 = this.field2743 << 8;
        int var7 = var4.field1828.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field2749 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field2753 < 0) {
            if (this.field2751 <= 0) {
                this.method3279();
                this.method76();
                return;
            }
            this.field2753 = 0;
        }
        if (this.field2753 >= var7) {
            if (this.field2751 >= 0) {
                this.method3279();
                this.method76();
                return;
            }
            this.field2753 = var7 - 1;
        }
        if (this.field2749 >= 0) {
            if (this.field2749 > 0) {
                if (this.field2752) {
                    label131: {
                        if (this.field2751 < 0) {
                            var9 = this.method3304(arg0, arg1, var5, var10, var4.field1828[this.field2750]);
                            if (this.field2753 >= var5) {
                                return;
                            }
                            this.field2753 = var5 + var5 - 1 - this.field2753;
                            this.field2751 = -this.field2751;
                            if (--this.field2749 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method3289(arg0, var9, var6, var10, var4.field1828[this.field2743 - 1]);
                            if (this.field2753 < var6) {
                                return;
                            }
                            this.field2753 = var6 + var6 - 1 - this.field2753;
                            this.field2751 = -this.field2751;
                            if (--this.field2749 == 0) {
                                break;
                            }
                            var9 = this.method3304(arg0, var9, var5, var10, var4.field1828[this.field2750]);
                            if (this.field2753 >= var5) {
                                return;
                            }
                            this.field2753 = var5 + var5 - 1 - this.field2753;
                            this.field2751 = -this.field2751;
                        } while (--this.field2749 != 0);
                    }
                } else if (this.field2751 < 0) {
                    while (true) {
                        var9 = this.method3304(arg0, var9, var5, var10, var4.field1828[this.field2743 - 1]);
                        if (this.field2753 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field2753) / var8;
                        if (var12 >= this.field2749) {
                            this.field2753 += this.field2749 * var8;
                            this.field2749 = 0;
                            break;
                        }
                        this.field2753 += var8 * var12;
                        this.field2749 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method3289(arg0, var9, var6, var10, var4.field1828[this.field2750]);
                        if (this.field2753 < var6) {
                            return;
                        }
                        int var13 = (this.field2753 - var5) / var8;
                        if (var13 >= this.field2749) {
                            this.field2753 -= this.field2749 * var8;
                            this.field2749 = 0;
                            break;
                        }
                        this.field2753 -= var8 * var13;
                        this.field2749 -= var13;
                    }
                }
            }
            if (this.field2751 < 0) {
                this.method3304(arg0, var9, 0, var10, 0);
                if (this.field2753 < 0) {
                    this.field2753 = -1;
                    this.method3279();
                    this.method76();
                }
            } else {
                this.method3289(arg0, var9, var7, var10, 0);
                if (this.field2753 >= var7) {
                    this.field2753 = var7;
                    this.method3279();
                    this.method76();
                }
            }
        } else if (this.field2752) {
            if (this.field2751 < 0) {
                var9 = this.method3304(arg0, arg1, var5, var10, var4.field1828[this.field2750]);
                if (this.field2753 >= var5) {
                    return;
                }
                this.field2753 = var5 + var5 - 1 - this.field2753;
                this.field2751 = -this.field2751;
            }
            while (true) {
                int var11 = this.method3289(arg0, var9, var6, var10, var4.field1828[this.field2743 - 1]);
                if (this.field2753 < var6) {
                    return;
                }
                this.field2753 = var6 + var6 - 1 - this.field2753;
                this.field2751 = -this.field2751;
                var9 = this.method3304(arg0, var11, var5, var10, var4.field1828[this.field2750]);
                if (this.field2753 >= var5) {
                    return;
                }
                this.field2753 = var5 + var5 - 1 - this.field2753;
                this.field2751 = -this.field2751;
            }
        } else if (this.field2751 < 0) {
            while (true) {
                var9 = this.method3304(arg0, var9, var5, var10, var4.field1828[this.field2743 - 1]);
                if (this.field2753 >= var5) {
                    return;
                }
                this.field2753 = var6 - 1 - (var6 - 1 - this.field2753) % var8;
            }
        } else {
            while (true) {
                var9 = this.method3289(arg0, var9, var6, var10, var4.field1828[this.field2750]);
                if (this.field2753 < var6) {
                    return;
                }
                this.field2753 = (this.field2753 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("ad.ac([IIIII)I")
    public int method3289(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field2748 > 0) {
                int var6 = this.field2748 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field2748 += arg1;
                if (this.field2751 == 256 && (this.field2753 & 0xFF) == 0) {
                    if (Statics.field1773) {
                        arg1 = method3299(0, ((class117) this.field2810).field1828, arg0, this.field2753, arg1, this.field2747, this.field2745, this.field2755, this.field2756, 0, var6, arg2, this);
                    } else {
                        arg1 = method3298(((class117) this.field2810).field1828, arg0, this.field2753, arg1, this.field2746, this.field2754, 0, var6, arg2, this);
                    }
                } else if (Statics.field1773) {
                    arg1 = method3360(0, 0, ((class117) this.field2810).field1828, arg0, this.field2753, arg1, this.field2747, this.field2745, this.field2755, this.field2756, 0, var6, arg2, this, this.field2751, arg4);
                } else {
                    arg1 = method3346(0, 0, ((class117) this.field2810).field1828, arg0, this.field2753, arg1, this.field2746, this.field2754, 0, var6, arg2, this, this.field2751, arg4);
                }
                this.field2748 -= arg1;
                if (this.field2748 != 0) {
                    return arg1;
                }
                if (!this.method3291()) {
                    continue;
                }
                return arg3;
            }
            if (this.field2751 == 256 && (this.field2753 & 0xFF) == 0) {
                if (Statics.field1773) {
                    return method3292(0, ((class117) this.field2810).field1828, arg0, this.field2753, arg1, this.field2747, this.field2745, 0, arg3, arg2, this);
                }
                return method3341(((class117) this.field2810).field1828, arg0, this.field2753, arg1, this.field2746, 0, arg3, arg2, this);
            }
            if (Statics.field1773) {
                return method3295(0, 0, ((class117) this.field2810).field1828, arg0, this.field2753, arg1, this.field2747, this.field2745, 0, arg3, arg2, this, this.field2751, arg4);
            }
            return method3305(0, 0, ((class117) this.field2810).field1828, arg0, this.field2753, arg1, this.field2746, 0, arg3, arg2, this, this.field2751, arg4);
        }
    }

    @ObfuscatedName("ad.ao()Z")
    public boolean method3291() {
        int var1 = this.field2744;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method3375(var1, this.field2742);
            var2 = method3343(var1, this.field2742);
        }
        if (this.field2746 != var1 || this.field2747 != var3 || this.field2745 != var2) {
            if (this.field2746 < var1) {
                this.field2754 = 1;
                this.field2748 = var1 - this.field2746;
            } else if (this.field2746 > var1) {
                this.field2754 = -1;
                this.field2748 = this.field2746 - var1;
            } else {
                this.field2754 = 0;
            }
            if (this.field2747 < var3) {
                this.field2755 = 1;
                if (this.field2748 == 0 || this.field2748 > var3 - this.field2747) {
                    this.field2748 = var3 - this.field2747;
                }
            } else if (this.field2747 > var3) {
                this.field2755 = -1;
                if (this.field2748 == 0 || this.field2748 > this.field2747 - var3) {
                    this.field2748 = this.field2747 - var3;
                }
            } else {
                this.field2755 = 0;
            }
            if (this.field2745 < var2) {
                this.field2756 = 1;
                if (this.field2748 == 0 || this.field2748 > var2 - this.field2745) {
                    this.field2748 = var2 - this.field2745;
                }
            } else if (this.field2745 > var2) {
                this.field2756 = -1;
                if (this.field2748 == 0 || this.field2748 > this.field2745 - var2) {
                    this.field2748 = this.field2745 - var2;
                }
            } else {
                this.field2756 = 0;
            }
            return false;
        } else if (this.field2744 == Integer.MIN_VALUE) {
            this.field2744 = 0;
            this.field2745 = 0;
            this.field2747 = 0;
            this.field2746 = 0;
            this.method76();
            return true;
        } else {
            this.method3270();
            return false;
        }
    }

    @ObfuscatedName("ad.n()I")
    public int method560() {
        return this.field2744 == 0 && this.field2748 == 0 ? 0 : 1;
    }

    @ObfuscatedName("ad.aa(I[B[IIIIIIIILad;)I")
    public static int method3292(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class180 arg10) {
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

    @ObfuscatedName("ad.an([B[IIIIIIILad;)I")
    public static int method3293(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class180 arg8) {
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

    @ObfuscatedName("ad.ar(I[B[IIIIIIIILad;)I")
    public static int method3294(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class180 arg10) {
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

    @ObfuscatedName("ad.ae(II[B[IIIIIIIILad;II)I")
    public static int method3295(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class180 arg11, int arg12, int arg13) {
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

    @ObfuscatedName("ad.aj(II[B[IIIIIIIILad;II)I")
    public static int method3297(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class180 arg11, int arg12, int arg13) {
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

    @ObfuscatedName("ad.au([B[IIIIIIIILad;)I")
    public static int method3298(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class180 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field2747 += (var14 - arg3) * arg9.field2755;
        arg9.field2745 += (var14 - arg3) * arg9.field2756;
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
        arg9.field2746 = var12 >> 2;
        arg9.field2753 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("ad.al(I[B[IIIIIIIIIILad;)I")
    public static int method3299(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class180 arg12) {
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
        arg12.field2746 += (var19 - arg4) * arg12.field2754;
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
        arg12.field2747 = var15 >> 2;
        arg12.field2745 = var16 >> 2;
        arg12.field2753 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("ad.aw([B[IIIIIIIILad;)I")
    public static int method3300(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class180 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field2747 += (var14 - arg3) * arg9.field2755;
        arg9.field2745 += (var14 - arg3) * arg9.field2756;
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
        arg9.field2746 = var12 >> 2;
        arg9.field2753 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("ad.av(I[B[IIIIIIIIIILad;)I")
    public static int method3301(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class180 arg12) {
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
        arg12.field2746 += (var19 - arg4) * arg12.field2754;
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
        arg12.field2747 = var15 >> 2;
        arg12.field2745 = var16 >> 2;
        arg12.field2753 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("ad.ad(II[B[IIIIIIIILad;II)I")
    public static int method3303(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class180 arg11, int arg12, int arg13) {
        arg11.field2747 -= arg11.field2755 * arg5;
        arg11.field2745 -= arg11.field2756 * arg5;
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
        arg11.field2747 += arg11.field2755 * arg5;
        arg11.field2745 += arg11.field2756 * arg5;
        arg11.field2746 = arg6;
        arg11.field2753 = arg4;
        return arg5;
    }

    @ObfuscatedName("ad.ax([IIIII)I")
    public int method3304(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field2748 > 0) {
                int var6 = this.field2748 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field2748 += arg1;
                if (this.field2751 == -256 && (this.field2753 & 0xFF) == 0) {
                    if (Statics.field1773) {
                        arg1 = method3301(0, ((class117) this.field2810).field1828, arg0, this.field2753, arg1, this.field2747, this.field2745, this.field2755, this.field2756, 0, var6, arg2, this);
                    } else {
                        arg1 = method3300(((class117) this.field2810).field1828, arg0, this.field2753, arg1, this.field2746, this.field2754, 0, var6, arg2, this);
                    }
                } else if (Statics.field1773) {
                    arg1 = method3326(0, 0, ((class117) this.field2810).field1828, arg0, this.field2753, arg1, this.field2747, this.field2745, this.field2755, this.field2756, 0, var6, arg2, this, this.field2751, arg4);
                } else {
                    arg1 = method3303(0, 0, ((class117) this.field2810).field1828, arg0, this.field2753, arg1, this.field2746, this.field2754, 0, var6, arg2, this, this.field2751, arg4);
                }
                this.field2748 -= arg1;
                if (this.field2748 != 0) {
                    return arg1;
                }
                if (!this.method3291()) {
                    continue;
                }
                return arg3;
            }
            if (this.field2751 == -256 && (this.field2753 & 0xFF) == 0) {
                if (Statics.field1773) {
                    return method3294(0, ((class117) this.field2810).field1828, arg0, this.field2753, arg1, this.field2747, this.field2745, 0, arg3, arg2, this);
                }
                return method3293(((class117) this.field2810).field1828, arg0, this.field2753, arg1, this.field2746, 0, arg3, arg2, this);
            }
            if (Statics.field1773) {
                return method3297(0, 0, ((class117) this.field2810).field1828, arg0, this.field2753, arg1, this.field2747, this.field2745, 0, arg3, arg2, this, this.field2751, arg4);
            }
            return method3367(0, 0, ((class117) this.field2810).field1828, arg0, this.field2753, arg1, this.field2746, 0, arg3, arg2, this, this.field2751, arg4);
        }
    }

    @ObfuscatedName("ad.ai(II[B[IIIIIIILad;II)I")
    public static int method3305(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class180 arg10, int arg11, int arg12) {
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

    @ObfuscatedName("ad.r()Lab;")
    public class182 method545() {
        return null;
    }

    @ObfuscatedName("ad.az(II[B[IIIIIIIIIILad;II)I")
    public static int method3326(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class180 arg13, int arg14, int arg15) {
        arg13.field2746 -= arg13.field2754 * arg5;
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
        arg13.field2746 += arg13.field2754 * var26;
        arg13.field2747 = arg6;
        arg13.field2745 = arg7;
        arg13.field2753 = arg4;
        return var26;
    }

    @ObfuscatedName("ad.ah([B[IIIIIIILad;)I")
    public static int method3341(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class180 arg8) {
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

    @ObfuscatedName("ad.c(II)I")
    public static int method3343(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("ad.af(II[B[IIIIIIIILad;II)I")
    public static int method3346(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class180 arg11, int arg12, int arg13) {
        arg11.field2747 -= arg11.field2755 * arg5;
        arg11.field2745 -= arg11.field2756 * arg5;
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
        arg11.field2747 += arg11.field2755 * arg5;
        arg11.field2745 += arg11.field2756 * arg5;
        arg11.field2746 = arg6;
        arg11.field2753 = arg4;
        return arg5;
    }

    @ObfuscatedName("ad.ap(II[B[IIIIIIIIIILad;II)I")
    public static int method3360(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class180 arg13, int arg14, int arg15) {
        arg13.field2746 -= arg13.field2754 * arg5;
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
        arg13.field2746 += arg13.field2754 * var27;
        arg13.field2747 = arg6;
        arg13.field2745 = arg7;
        arg13.field2753 = arg4;
        return var27;
    }

    @ObfuscatedName("ad.am(II[B[IIIIIIILad;II)I")
    public static int method3367(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class180 arg10, int arg11, int arg12) {
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

    @ObfuscatedName("ad.h()I")
    public synchronized int method3370() {
        return this.field2751 < 0 ? -this.field2751 : this.field2751;
    }

    @ObfuscatedName("ad.v(II)I")
    public static int method3375(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("ad.as(I)V")
    public synchronized void method549(int arg0) {
        if (this.field2748 > 0) {
            if (arg0 >= this.field2748) {
                if (this.field2744 == Integer.MIN_VALUE) {
                    this.field2744 = 0;
                    this.field2745 = 0;
                    this.field2747 = 0;
                    this.field2746 = 0;
                    this.method76();
                    arg0 = this.field2748;
                }
                this.field2748 = 0;
                this.method3270();
            } else {
                this.field2746 += this.field2754 * arg0;
                this.field2747 += this.field2755 * arg0;
                this.field2745 += this.field2756 * arg0;
                this.field2748 -= arg0;
            }
        }
        class117 var2 = (class117) this.field2810;
        int var3 = this.field2750 << 8;
        int var4 = this.field2743 << 8;
        int var5 = var2.field1828.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field2749 = 0;
        }
        if (this.field2753 < 0) {
            if (this.field2751 <= 0) {
                this.method3279();
                this.method76();
                return;
            }
            this.field2753 = 0;
        }
        if (this.field2753 >= var5) {
            if (this.field2751 >= 0) {
                this.method3279();
                this.method76();
                return;
            }
            this.field2753 = var5 - 1;
        }
        this.field2753 += this.field2751 * arg0;
        if (this.field2749 >= 0) {
            if (this.field2749 > 0) {
                if (this.field2752) {
                    label121: {
                        if (this.field2751 < 0) {
                            if (this.field2753 >= var3) {
                                return;
                            }
                            this.field2753 = var3 + var3 - 1 - this.field2753;
                            this.field2751 = -this.field2751;
                            if (--this.field2749 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field2753 < var4) {
                                return;
                            }
                            this.field2753 = var4 + var4 - 1 - this.field2753;
                            this.field2751 = -this.field2751;
                            if (--this.field2749 == 0) {
                                break;
                            }
                            if (this.field2753 >= var3) {
                                return;
                            }
                            this.field2753 = var3 + var3 - 1 - this.field2753;
                            this.field2751 = -this.field2751;
                        } while (--this.field2749 != 0);
                    }
                } else {
                    label153: {
                        if (this.field2751 < 0) {
                            if (this.field2753 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field2753) / var6;
                            if (var7 >= this.field2749) {
                                this.field2753 += this.field2749 * var6;
                                this.field2749 = 0;
                                break label153;
                            }
                            this.field2753 += var6 * var7;
                            this.field2749 -= var7;
                        } else if (this.field2753 >= var4) {
                            int var8 = (this.field2753 - var3) / var6;
                            if (var8 >= this.field2749) {
                                this.field2753 -= this.field2749 * var6;
                                this.field2749 = 0;
                                break label153;
                            }
                            this.field2753 -= var6 * var8;
                            this.field2749 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field2751 < 0) {
                if (this.field2753 < 0) {
                    this.field2753 = -1;
                    this.method3279();
                    this.method76();
                }
            } else if (this.field2753 >= var5) {
                this.field2753 = var5;
                this.method3279();
                this.method76();
            }
        } else if (this.field2752) {
            if (this.field2751 < 0) {
                if (this.field2753 >= var3) {
                    return;
                }
                this.field2753 = var3 + var3 - 1 - this.field2753;
                this.field2751 = -this.field2751;
            }
            while (this.field2753 >= var4) {
                this.field2753 = var4 + var4 - 1 - this.field2753;
                this.field2751 = -this.field2751;
                if (this.field2753 >= var3) {
                    return;
                }
                this.field2753 = var3 + var3 - 1 - this.field2753;
                this.field2751 = -this.field2751;
            }
        } else if (this.field2751 < 0) {
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

    public class180(class117 arg0, int arg1, int arg2) {
        this.field2810 = arg0;
        this.field2750 = arg0.field1827;
        this.field2743 = arg0.field1825;
        this.field2752 = arg0.field1826;
        this.field2751 = arg1;
        this.field2744 = arg2;
        this.field2742 = 8192;
        this.field2753 = 0;
        this.method3270();
    }

    @ObfuscatedName("ad.l()Lab;")
    public class182 method555() {
        return null;
    }
}

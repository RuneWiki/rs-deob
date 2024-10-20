package deob;

@ObfuscatedName("an")
public class class43 extends class44 {

    @ObfuscatedName("an.l")
    public int field333;

    @ObfuscatedName("an.q")
    public int field327;

    @ObfuscatedName("an.f")
    public int field322;

    @ObfuscatedName("an.j")
    public int field323;

    @ObfuscatedName("an.m")
    public int field324;

    @ObfuscatedName("an.k")
    public int field325;

    @ObfuscatedName("an.t")
    public int field326;

    @ObfuscatedName("an.a")
    public int field329;

    @ObfuscatedName("an.e")
    public int field328;

    @ObfuscatedName("an.i")
    public int field334;

    @ObfuscatedName("an.y")
    public boolean field330;

    @ObfuscatedName("an.g")
    public int field321;

    @ObfuscatedName("an.v")
    public int field332;

    @ObfuscatedName("an.s")
    public int field331;

    @ObfuscatedName("an.c")
    public int field320;

    @ObfuscatedName("an.l(II)I")
    public static int method833(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("an.q(II)I")
    public static int method763(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("an.aq()I")
    public int method842() {
        int var1 = this.field324 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field329 == 0) {
            var2 -= this.field333 * var2 / (((class36) this.field337).field246.length << 8);
        } else if (this.field329 >= 0) {
            var2 -= this.field328 * var2 / ((class36) this.field337).field246.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class43(class36 arg0, int arg1, int arg2) {
        this.field337 = arg0;
        this.field328 = arg0.field247;
        this.field334 = arg0.field249;
        this.field330 = arg0.field250;
        this.field327 = arg1;
        this.field322 = arg2;
        this.field323 = 8192;
        this.field333 = 0;
        this.method768();
    }

    public class43(class36 arg0, int arg1, int arg2, int arg3) {
        this.field337 = arg0;
        this.field328 = arg0.field247;
        this.field334 = arg0.field249;
        this.field330 = arg0.field250;
        this.field327 = arg1;
        this.field322 = arg2;
        this.field323 = arg3;
        this.field333 = 0;
        this.method768();
    }

    @ObfuscatedName("an.f(Laa;II)Lan;")
    public static class43 method766(class36 arg0, int arg1, int arg2) {
        return arg0.field246 == null || arg0.field246.length == 0 ? null : new class43(arg0, (int) ((long) arg0.field248 * 256L * (long) arg1 / (long) (Statics.field280 * 100)), arg2 << 6);
    }

    @ObfuscatedName("an.j(Laa;III)Lan;")
    public static class43 method767(class36 arg0, int arg1, int arg2, int arg3) {
        return arg0.field246 == null || arg0.field246.length == 0 ? null : new class43(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("an.m()V")
    public void method768() {
        this.field324 = this.field322;
        this.field325 = method833(this.field322, this.field323);
        this.field326 = method763(this.field322, this.field323);
    }

    @ObfuscatedName("an.i(I)V")
    public synchronized void method769(int arg0) {
        this.field329 = arg0;
    }

    @ObfuscatedName("an.w(I)V")
    public synchronized void method856(int arg0) {
        this.method772(arg0 << 6, this.method774());
    }

    @ObfuscatedName("an.g(I)V")
    public synchronized void method849(int arg0) {
        this.method772(arg0, this.method774());
    }

    @ObfuscatedName("an.v(II)V")
    public synchronized void method772(int arg0, int arg1) {
        this.field322 = arg0;
        this.field323 = arg1;
        this.field321 = 0;
        this.method768();
    }

    @ObfuscatedName("an.s()I")
    public synchronized int method821() {
        return this.field322 == Integer.MIN_VALUE ? 0 : this.field322;
    }

    @ObfuscatedName("an.c()I")
    public synchronized int method774() {
        return this.field323 < 0 ? -1 : this.field323;
    }

    @ObfuscatedName("an.b(I)V")
    public synchronized void method809(int arg0) {
        int var2 = ((class36) this.field337).field246.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field333 = arg0;
    }

    @ObfuscatedName("an.x(Z)V")
    public synchronized void method776(boolean arg0) {
        this.field327 = (this.field327 >>> 31) + (this.field327 ^ this.field327 >> 31);
        if (arg0) {
            this.field327 = -this.field327;
        }
    }

    @ObfuscatedName("an.p()V")
    public void method777() {
        if (this.field321 == 0) {
            return;
        }
        if (this.field322 == Integer.MIN_VALUE) {
            this.field322 = 0;
        }
        this.field321 = 0;
        this.method768();
    }

    @ObfuscatedName("an.z(II)V")
    public synchronized void method778(int arg0, int arg1) {
        this.method779(arg0, arg1, this.method774());
    }

    @ObfuscatedName("an.h(III)V")
    public synchronized void method779(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method772(arg1, arg2);
            return;
        }
        int var4 = method833(arg1, arg2);
        int var5 = method763(arg1, arg2);
        if (this.field325 == var4 && this.field326 == var5) {
            this.field321 = 0;
            return;
        }
        int var6 = arg1 - this.field324;
        if (this.field324 - arg1 > var6) {
            var6 = this.field324 - arg1;
        }
        if (var4 - this.field325 > var6) {
            var6 = var4 - this.field325;
        }
        if (this.field325 - var4 > var6) {
            var6 = this.field325 - var4;
        }
        if (var5 - this.field326 > var6) {
            var6 = var5 - this.field326;
        }
        if (this.field326 - var5 > var6) {
            var6 = this.field326 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field321 = arg0;
        this.field322 = arg1;
        this.field323 = arg2;
        this.field332 = (arg1 - this.field324) / arg0;
        this.field331 = (var4 - this.field325) / arg0;
        this.field320 = (var5 - this.field326) / arg0;
    }

    @ObfuscatedName("an.o(I)V")
    public synchronized void method780(int arg0) {
        if (arg0 == 0) {
            this.method849(0);
            this.method5775();
        } else if (this.field325 == 0 && this.field326 == 0) {
            this.field321 = 0;
            this.field322 = 0;
            this.field324 = 0;
            this.method5775();
        } else {
            int var2 = -this.field324;
            if (this.field324 > var2) {
                var2 = this.field324;
            }
            if (-this.field325 > var2) {
                var2 = -this.field325;
            }
            if (this.field325 > var2) {
                var2 = this.field325;
            }
            if (-this.field326 > var2) {
                var2 = -this.field326;
            }
            if (this.field326 > var2) {
                var2 = this.field326;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field321 = arg0;
            this.field322 = Integer.MIN_VALUE;
            this.field332 = -this.field324 / arg0;
            this.field331 = -this.field325 / arg0;
            this.field320 = -this.field326 / arg0;
        }
    }

    @ObfuscatedName("an.r(I)V")
    public synchronized void method781(int arg0) {
        if (this.field327 < 0) {
            this.field327 = -arg0;
        } else {
            this.field327 = arg0;
        }
    }

    @ObfuscatedName("an.n()I")
    public synchronized int method770() {
        return this.field327 < 0 ? -this.field327 : this.field327;
    }

    @ObfuscatedName("an.u()Z")
    public boolean method783() {
        return this.field333 < 0 || this.field333 >= ((class36) this.field337).field246.length << 8;
    }

    @ObfuscatedName("an.ah()Z")
    public boolean method881() {
        return this.field321 != 0;
    }

    @ObfuscatedName("an.k()Lav;")
    public class44 method615() {
        return null;
    }

    @ObfuscatedName("an.t()Lav;")
    public class44 method616() {
        return null;
    }

    @ObfuscatedName("an.a()I")
    public int method624() {
        return this.field322 == 0 && this.field321 == 0 ? 0 : 1;
    }

    @ObfuscatedName("an.e([III)V")
    public synchronized void method618(int[] arg0, int arg1, int arg2) {
        if (this.field322 == 0 && this.field321 == 0) {
            this.method613(arg2);
            return;
        }
        class36 var4 = (class36) this.field337;
        int var5 = this.field328 << 8;
        int var6 = this.field334 << 8;
        int var7 = var4.field246.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field329 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field333 < 0) {
            if (this.field327 <= 0) {
                this.method777();
                this.method5775();
                return;
            }
            this.field333 = 0;
        }
        if (this.field333 >= var7) {
            if (this.field327 >= 0) {
                this.method777();
                this.method5775();
                return;
            }
            this.field333 = var7 - 1;
        }
        if (this.field329 >= 0) {
            if (this.field329 > 0) {
                if (this.field330) {
                    label131: {
                        if (this.field327 < 0) {
                            var9 = this.method790(arg0, arg1, var5, var10, var4.field246[this.field328]);
                            if (this.field333 >= var5) {
                                return;
                            }
                            this.field333 = var5 + var5 - 1 - this.field333;
                            this.field327 = -this.field327;
                            if (--this.field329 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method850(arg0, var9, var6, var10, var4.field246[this.field334 - 1]);
                            if (this.field333 < var6) {
                                return;
                            }
                            this.field333 = var6 + var6 - 1 - this.field333;
                            this.field327 = -this.field327;
                            if (--this.field329 == 0) {
                                break;
                            }
                            var9 = this.method790(arg0, var9, var5, var10, var4.field246[this.field328]);
                            if (this.field333 >= var5) {
                                return;
                            }
                            this.field333 = var5 + var5 - 1 - this.field333;
                            this.field327 = -this.field327;
                        } while (--this.field329 != 0);
                    }
                } else if (this.field327 < 0) {
                    while (true) {
                        var9 = this.method790(arg0, var9, var5, var10, var4.field246[this.field334 - 1]);
                        if (this.field333 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field333) / var8;
                        if (var12 >= this.field329) {
                            this.field333 += this.field329 * var8;
                            this.field329 = 0;
                            break;
                        }
                        this.field333 += var8 * var12;
                        this.field329 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method850(arg0, var9, var6, var10, var4.field246[this.field328]);
                        if (this.field333 < var6) {
                            return;
                        }
                        int var13 = (this.field333 - var5) / var8;
                        if (var13 >= this.field329) {
                            this.field333 -= this.field329 * var8;
                            this.field329 = 0;
                            break;
                        }
                        this.field333 -= var8 * var13;
                        this.field329 -= var13;
                    }
                }
            }
            if (this.field327 < 0) {
                this.method790(arg0, var9, 0, var10, 0);
                if (this.field333 < 0) {
                    this.field333 = -1;
                    this.method777();
                    this.method5775();
                }
            } else {
                this.method850(arg0, var9, var7, var10, 0);
                if (this.field333 >= var7) {
                    this.field333 = var7;
                    this.method777();
                    this.method5775();
                }
            }
        } else if (this.field330) {
            if (this.field327 < 0) {
                var9 = this.method790(arg0, arg1, var5, var10, var4.field246[this.field328]);
                if (this.field333 >= var5) {
                    return;
                }
                this.field333 = var5 + var5 - 1 - this.field333;
                this.field327 = -this.field327;
            }
            while (true) {
                int var11 = this.method850(arg0, var9, var6, var10, var4.field246[this.field334 - 1]);
                if (this.field333 < var6) {
                    return;
                }
                this.field333 = var6 + var6 - 1 - this.field333;
                this.field327 = -this.field327;
                var9 = this.method790(arg0, var11, var5, var10, var4.field246[this.field328]);
                if (this.field333 >= var5) {
                    return;
                }
                this.field333 = var5 + var5 - 1 - this.field333;
                this.field327 = -this.field327;
            }
        } else if (this.field327 < 0) {
            while (true) {
                var9 = this.method790(arg0, var9, var5, var10, var4.field246[this.field334 - 1]);
                if (this.field333 >= var5) {
                    return;
                }
                this.field333 = var6 - 1 - (var6 - 1 - this.field333) % var8;
            }
        } else {
            while (true) {
                var9 = this.method850(arg0, var9, var6, var10, var4.field246[this.field328]);
                if (this.field333 < var6) {
                    return;
                }
                this.field333 = (this.field333 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("an.y(I)V")
    public synchronized void method613(int arg0) {
        if (this.field321 > 0) {
            if (arg0 >= this.field321) {
                if (this.field322 == Integer.MIN_VALUE) {
                    this.field322 = 0;
                    this.field326 = 0;
                    this.field325 = 0;
                    this.field324 = 0;
                    this.method5775();
                    arg0 = this.field321;
                }
                this.field321 = 0;
                this.method768();
            } else {
                this.field324 += this.field332 * arg0;
                this.field325 += this.field331 * arg0;
                this.field326 += this.field320 * arg0;
                this.field321 -= arg0;
            }
        }
        class36 var2 = (class36) this.field337;
        int var3 = this.field328 << 8;
        int var4 = this.field334 << 8;
        int var5 = var2.field246.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field329 = 0;
        }
        if (this.field333 < 0) {
            if (this.field327 <= 0) {
                this.method777();
                this.method5775();
                return;
            }
            this.field333 = 0;
        }
        if (this.field333 >= var5) {
            if (this.field327 >= 0) {
                this.method777();
                this.method5775();
                return;
            }
            this.field333 = var5 - 1;
        }
        this.field333 += this.field327 * arg0;
        if (this.field329 >= 0) {
            if (this.field329 > 0) {
                if (this.field330) {
                    label121: {
                        if (this.field327 < 0) {
                            if (this.field333 >= var3) {
                                return;
                            }
                            this.field333 = var3 + var3 - 1 - this.field333;
                            this.field327 = -this.field327;
                            if (--this.field329 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field333 < var4) {
                                return;
                            }
                            this.field333 = var4 + var4 - 1 - this.field333;
                            this.field327 = -this.field327;
                            if (--this.field329 == 0) {
                                break;
                            }
                            if (this.field333 >= var3) {
                                return;
                            }
                            this.field333 = var3 + var3 - 1 - this.field333;
                            this.field327 = -this.field327;
                        } while (--this.field329 != 0);
                    }
                } else {
                    label153: {
                        if (this.field327 < 0) {
                            if (this.field333 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field333) / var6;
                            if (var7 >= this.field329) {
                                this.field333 += this.field329 * var6;
                                this.field329 = 0;
                                break label153;
                            }
                            this.field333 += var6 * var7;
                            this.field329 -= var7;
                        } else if (this.field333 >= var4) {
                            int var8 = (this.field333 - var3) / var6;
                            if (var8 >= this.field329) {
                                this.field333 -= this.field329 * var6;
                                this.field329 = 0;
                                break label153;
                            }
                            this.field333 -= var6 * var8;
                            this.field329 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field327 < 0) {
                if (this.field333 < 0) {
                    this.field333 = -1;
                    this.method777();
                    this.method5775();
                }
            } else if (this.field333 >= var5) {
                this.field333 = var5;
                this.method777();
                this.method5775();
            }
        } else if (this.field330) {
            if (this.field327 < 0) {
                if (this.field333 >= var3) {
                    return;
                }
                this.field333 = var3 + var3 - 1 - this.field333;
                this.field327 = -this.field327;
            }
            while (this.field333 >= var4) {
                this.field333 = var4 + var4 - 1 - this.field333;
                this.field327 = -this.field327;
                if (this.field333 >= var3) {
                    return;
                }
                this.field333 = var3 + var3 - 1 - this.field333;
                this.field327 = -this.field327;
            }
        } else if (this.field327 < 0) {
            if (this.field333 >= var3) {
                return;
            }
            this.field333 = var4 - 1 - (var4 - 1 - this.field333) % var6;
        } else if (this.field333 >= var4) {
            this.field333 = (this.field333 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("an.ay([IIIII)I")
    public int method850(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field321 > 0) {
                int var6 = this.field321 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field321 += arg1;
                if (this.field327 == 256 && (this.field333 & 0xFF) == 0) {
                    if (Statics.field274) {
                        arg1 = method800(0, ((class36) this.field337).field246, arg0, this.field333, arg1, this.field325, this.field326, this.field331, this.field320, 0, var6, arg2, this);
                    } else {
                        arg1 = method835(((class36) this.field337).field246, arg0, this.field333, arg1, this.field324, this.field332, 0, var6, arg2, this);
                    }
                } else if (Statics.field274) {
                    arg1 = method804(0, 0, ((class36) this.field337).field246, arg0, this.field333, arg1, this.field325, this.field326, this.field331, this.field320, 0, var6, arg2, this, this.field327, arg4);
                } else {
                    arg1 = method803(0, 0, ((class36) this.field337).field246, arg0, this.field333, arg1, this.field324, this.field332, 0, var6, arg2, this, this.field327, arg4);
                }
                this.field321 -= arg1;
                if (this.field321 != 0) {
                    return arg1;
                }
                if (!this.method874()) {
                    continue;
                }
                return arg3;
            }
            if (this.field327 == 256 && (this.field333 & 0xFF) == 0) {
                if (Statics.field274) {
                    return method793(0, ((class36) this.field337).field246, arg0, this.field333, arg1, this.field325, this.field326, 0, arg3, arg2, this);
                }
                return method798(((class36) this.field337).field246, arg0, this.field333, arg1, this.field324, 0, arg3, arg2, this);
            }
            if (Statics.field274) {
                return method797(0, 0, ((class36) this.field337).field246, arg0, this.field333, arg1, this.field325, this.field326, 0, arg3, arg2, this, this.field327, arg4);
            }
            return method796(0, 0, ((class36) this.field337).field246, arg0, this.field333, arg1, this.field324, 0, arg3, arg2, this, this.field327, arg4);
        }
    }

    @ObfuscatedName("an.al([IIIII)I")
    public int method790(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field321 > 0) {
                int var6 = this.field321 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field321 += arg1;
                if (this.field327 == -256 && (this.field333 & 0xFF) == 0) {
                    if (Statics.field274) {
                        arg1 = method802(0, ((class36) this.field337).field246, arg0, this.field333, arg1, this.field325, this.field326, this.field331, this.field320, 0, var6, arg2, this);
                    } else {
                        arg1 = method801(((class36) this.field337).field246, arg0, this.field333, arg1, this.field324, this.field332, 0, var6, arg2, this);
                    }
                } else if (Statics.field274) {
                    arg1 = method806(0, 0, ((class36) this.field337).field246, arg0, this.field333, arg1, this.field325, this.field326, this.field331, this.field320, 0, var6, arg2, this, this.field327, arg4);
                } else {
                    arg1 = method805(0, 0, ((class36) this.field337).field246, arg0, this.field333, arg1, this.field324, this.field332, 0, var6, arg2, this, this.field327, arg4);
                }
                this.field321 -= arg1;
                if (this.field321 != 0) {
                    return arg1;
                }
                if (!this.method874()) {
                    continue;
                }
                return arg3;
            }
            if (this.field327 == -256 && (this.field333 & 0xFF) == 0) {
                if (Statics.field274) {
                    return method795(0, ((class36) this.field337).field246, arg0, this.field333, arg1, this.field325, this.field326, 0, arg3, arg2, this);
                }
                return method871(((class36) this.field337).field246, arg0, this.field333, arg1, this.field324, 0, arg3, arg2, this);
            }
            if (Statics.field274) {
                return method785(0, 0, ((class36) this.field337).field246, arg0, this.field333, arg1, this.field325, this.field326, 0, arg3, arg2, this, this.field327, arg4);
            }
            return method869(0, 0, ((class36) this.field337).field246, arg0, this.field333, arg1, this.field324, 0, arg3, arg2, this, this.field327, arg4);
        }
    }

    @ObfuscatedName("an.au()Z")
    public boolean method874() {
        int var1 = this.field322;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method833(var1, this.field323);
            var2 = method763(var1, this.field323);
        }
        if (this.field324 != var1 || this.field325 != var3 || this.field326 != var2) {
            if (this.field324 < var1) {
                this.field332 = 1;
                this.field321 = var1 - this.field324;
            } else if (this.field324 > var1) {
                this.field332 = -1;
                this.field321 = this.field324 - var1;
            } else {
                this.field332 = 0;
            }
            if (this.field325 < var3) {
                this.field331 = 1;
                if (this.field321 == 0 || this.field321 > var3 - this.field325) {
                    this.field321 = var3 - this.field325;
                }
            } else if (this.field325 > var3) {
                this.field331 = -1;
                if (this.field321 == 0 || this.field321 > this.field325 - var3) {
                    this.field321 = this.field325 - var3;
                }
            } else {
                this.field331 = 0;
            }
            if (this.field326 < var2) {
                this.field320 = 1;
                if (this.field321 == 0 || this.field321 > var2 - this.field326) {
                    this.field321 = var2 - this.field326;
                }
            } else if (this.field326 > var2) {
                this.field320 = -1;
                if (this.field321 == 0 || this.field321 > this.field326 - var2) {
                    this.field321 = this.field326 - var2;
                }
            } else {
                this.field320 = 0;
            }
            return false;
        } else if (this.field322 == Integer.MIN_VALUE) {
            this.field322 = 0;
            this.field326 = 0;
            this.field325 = 0;
            this.field324 = 0;
            this.method5775();
            return true;
        } else {
            this.method768();
            return false;
        }
    }

    @ObfuscatedName("an.ar([B[IIIIIIILan;)I")
    public static int method798(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class43 arg8) {
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
        arg8.field333 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("an.ac(I[B[IIIIIIIILan;)I")
    public static int method793(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class43 arg10) {
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
        arg10.field333 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("an.at([B[IIIIIIILan;)I")
    public static int method871(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class43 arg8) {
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
        arg8.field333 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("an.ax(I[B[IIIIIIIILan;)I")
    public static int method795(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class43 arg10) {
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
        arg10.field333 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("an.an(II[B[IIIIIIILan;II)I")
    public static int method796(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class43 arg10, int arg11, int arg12) {
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
        arg10.field333 = arg4;
        return arg5;
    }

    @ObfuscatedName("an.av(II[B[IIIIIIIILan;II)I")
    public static int method797(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class43 arg11, int arg12, int arg13) {
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
        arg11.field333 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("an.ap(II[B[IIIIIIILan;II)I")
    public static int method869(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class43 arg10, int arg11, int arg12) {
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
        arg10.field333 = arg4;
        return arg5;
    }

    @ObfuscatedName("an.aj(II[B[IIIIIIIILan;II)I")
    public static int method785(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class43 arg11, int arg12, int arg13) {
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
        arg11.field333 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("an.am([B[IIIIIIIILan;)I")
    public static int method835(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class43 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field325 += (var14 - arg3) * arg9.field331;
        arg9.field326 += (var14 - arg3) * arg9.field320;
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
        arg9.field324 = var12 >> 2;
        arg9.field333 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("an.aw(I[B[IIIIIIIIIILan;)I")
    public static int method800(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class43 arg12) {
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
        arg12.field324 += (var19 - arg4) * arg12.field332;
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
        arg12.field325 = var15 >> 2;
        arg12.field326 = var16 >> 2;
        arg12.field333 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("an.az([B[IIIIIIIILan;)I")
    public static int method801(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class43 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field325 += (var14 - arg3) * arg9.field331;
        arg9.field326 += (var14 - arg3) * arg9.field320;
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
        arg9.field324 = var12 >> 2;
        arg9.field333 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("an.ae(I[B[IIIIIIIIIILan;)I")
    public static int method802(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class43 arg12) {
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
        arg12.field324 += (var19 - arg4) * arg12.field332;
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
        arg12.field325 = var15 >> 2;
        arg12.field326 = var16 >> 2;
        arg12.field333 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("an.ai(II[B[IIIIIIIILan;II)I")
    public static int method803(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class43 arg11, int arg12, int arg13) {
        arg11.field325 -= arg11.field331 * arg5;
        arg11.field326 -= arg11.field320 * arg5;
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
        arg11.field325 += arg11.field331 * arg5;
        arg11.field326 += arg11.field320 * arg5;
        arg11.field324 = arg6;
        arg11.field333 = arg4;
        return arg5;
    }

    @ObfuscatedName("an.bg(II[B[IIIIIIIIIILan;II)I")
    public static int method804(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class43 arg13, int arg14, int arg15) {
        arg13.field324 -= arg13.field332 * arg5;
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
        arg13.field324 += arg13.field332 * var27;
        arg13.field325 = arg6;
        arg13.field326 = arg7;
        arg13.field333 = arg4;
        return var27;
    }

    @ObfuscatedName("an.bf(II[B[IIIIIIIILan;II)I")
    public static int method805(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class43 arg11, int arg12, int arg13) {
        arg11.field325 -= arg11.field331 * arg5;
        arg11.field326 -= arg11.field320 * arg5;
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
        arg11.field325 += arg11.field331 * arg5;
        arg11.field326 += arg11.field320 * arg5;
        arg11.field324 = arg6;
        arg11.field333 = arg4;
        return arg5;
    }

    @ObfuscatedName("an.bj(II[B[IIIIIIIIIILan;II)I")
    public static int method806(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class43 arg13, int arg14, int arg15) {
        arg13.field324 -= arg13.field332 * arg5;
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
        arg13.field324 += arg13.field332 * var26;
        arg13.field325 = arg6;
        arg13.field326 = arg7;
        arg13.field333 = arg4;
        return var26;
    }
}

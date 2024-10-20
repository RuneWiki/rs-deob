package deob;

@ObfuscatedName("ae")
public class class45 extends class46 {

    @ObfuscatedName("ae.c")
    public int field346;

    @ObfuscatedName("ae.p")
    public int field350;

    @ObfuscatedName("ae.f")
    public int field347;

    @ObfuscatedName("ae.n")
    public int field348;

    @ObfuscatedName("ae.k")
    public int field349;

    @ObfuscatedName("ae.s")
    public int field357;

    @ObfuscatedName("ae.q")
    public int field351;

    @ObfuscatedName("ae.m")
    public int field352;

    @ObfuscatedName("ae.x")
    public int field345;

    @ObfuscatedName("ae.j")
    public int field354;

    @ObfuscatedName("ae.v")
    public boolean field355;

    @ObfuscatedName("ae.h")
    public int field358;

    @ObfuscatedName("ae.t")
    public int field353;

    @ObfuscatedName("ae.u")
    public int field356;

    @ObfuscatedName("ae.d")
    public int field359;

    @ObfuscatedName("ae.c(II)I")
    public static int method838(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("ae.p(II)I")
    public static int method821(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("ae.af()I")
    public int method901() {
        int var1 = this.field349 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field352 == 0) {
            var2 -= this.field346 * var2 / (((class38) this.field362).field273.length << 8);
        } else if (this.field352 >= 0) {
            var2 -= this.field345 * var2 / ((class38) this.field362).field273.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class45(class38 arg0, int arg1, int arg2) {
        this.field362 = arg0;
        this.field345 = arg0.field272;
        this.field354 = arg0.field271;
        this.field355 = arg0.field274;
        this.field350 = arg1;
        this.field347 = arg2;
        this.field348 = 8192;
        this.field346 = 0;
        this.method888();
    }

    public class45(class38 arg0, int arg1, int arg2, int arg3) {
        this.field362 = arg0;
        this.field345 = arg0.field272;
        this.field354 = arg0.field271;
        this.field355 = arg0.field274;
        this.field350 = arg1;
        this.field347 = arg2;
        this.field348 = arg3;
        this.field346 = 0;
        this.method888();
    }

    @ObfuscatedName("ae.f(Lab;II)Lae;")
    public static class45 method887(class38 arg0, int arg1, int arg2) {
        return arg0.field273 == null || arg0.field273.length == 0 ? null : new class45(arg0, (int) ((long) arg0.field270 * 256L * (long) arg1 / (long) (Statics.field308 * 100)), arg2 << 6);
    }

    @ObfuscatedName("ae.n(Lab;III)Lae;")
    public static class45 method824(class38 arg0, int arg1, int arg2, int arg3) {
        return arg0.field273 == null || arg0.field273.length == 0 ? null : new class45(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("ae.k()V")
    public void method888() {
        this.field349 = this.field347;
        this.field357 = method838(this.field347, this.field348);
        this.field351 = method821(this.field347, this.field348);
    }

    @ObfuscatedName("ae.x(I)V")
    public synchronized void method826(int arg0) {
        this.field352 = arg0;
    }

    @ObfuscatedName("ae.v(I)V")
    public synchronized void method827(int arg0) {
        this.method829(arg0 << 6, this.method870());
    }

    @ObfuscatedName("ae.h(I)V")
    public synchronized void method828(int arg0) {
        this.method829(arg0, this.method870());
    }

    @ObfuscatedName("ae.t(II)V")
    public synchronized void method829(int arg0, int arg1) {
        this.field347 = arg0;
        this.field348 = arg1;
        this.field358 = 0;
        this.method888();
    }

    @ObfuscatedName("ae.u()I")
    public synchronized int method857() {
        return this.field347 == Integer.MIN_VALUE ? 0 : this.field347;
    }

    @ObfuscatedName("ae.d()I")
    public synchronized int method870() {
        return this.field348 < 0 ? -1 : this.field348;
    }

    @ObfuscatedName("ae.b(I)V")
    public synchronized void method832(int arg0) {
        int var2 = ((class38) this.field362).field273.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field346 = arg0;
    }

    @ObfuscatedName("ae.a(Z)V")
    public synchronized void method830(boolean arg0) {
        this.field350 = (this.field350 >>> 31) + (this.field350 ^ this.field350 >> 31);
        if (arg0) {
            this.field350 = -this.field350;
        }
    }

    @ObfuscatedName("ae.l()V")
    public void method882() {
        if (this.field358 == 0) {
            return;
        }
        if (this.field347 == Integer.MIN_VALUE) {
            this.field347 = 0;
        }
        this.field358 = 0;
        this.method888();
    }

    @ObfuscatedName("ae.e(II)V")
    public synchronized void method884(int arg0, int arg1) {
        this.method836(arg0, arg1, this.method870());
    }

    @ObfuscatedName("ae.g(III)V")
    public synchronized void method836(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method829(arg1, arg2);
            return;
        }
        int var4 = method838(arg1, arg2);
        int var5 = method821(arg1, arg2);
        if (this.field357 == var4 && this.field351 == var5) {
            this.field358 = 0;
            return;
        }
        int var6 = arg1 - this.field349;
        if (this.field349 - arg1 > var6) {
            var6 = this.field349 - arg1;
        }
        if (var4 - this.field357 > var6) {
            var6 = var4 - this.field357;
        }
        if (this.field357 - var4 > var6) {
            var6 = this.field357 - var4;
        }
        if (var5 - this.field351 > var6) {
            var6 = var5 - this.field351;
        }
        if (this.field351 - var5 > var6) {
            var6 = this.field351 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field358 = arg0;
        this.field347 = arg1;
        this.field348 = arg2;
        this.field353 = (arg1 - this.field349) / arg0;
        this.field356 = (var4 - this.field357) / arg0;
        this.field359 = (var5 - this.field351) / arg0;
    }

    @ObfuscatedName("ae.y(I)V")
    public synchronized void method837(int arg0) {
        if (arg0 == 0) {
            this.method828(0);
            this.method6657();
        } else if (this.field357 == 0 && this.field351 == 0) {
            this.field358 = 0;
            this.field347 = 0;
            this.field349 = 0;
            this.method6657();
        } else {
            int var2 = -this.field349;
            if (this.field349 > var2) {
                var2 = this.field349;
            }
            if (-this.field357 > var2) {
                var2 = -this.field357;
            }
            if (this.field357 > var2) {
                var2 = this.field357;
            }
            if (-this.field351 > var2) {
                var2 = -this.field351;
            }
            if (this.field351 > var2) {
                var2 = this.field351;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field358 = arg0;
            this.field347 = Integer.MIN_VALUE;
            this.field353 = -this.field349 / arg0;
            this.field356 = -this.field357 / arg0;
            this.field359 = -this.field351 / arg0;
        }
    }

    @ObfuscatedName("ae.i(I)V")
    public synchronized void method866(int arg0) {
        if (this.field350 < 0) {
            this.field350 = -arg0;
        } else {
            this.field350 = arg0;
        }
    }

    @ObfuscatedName("ae.r()I")
    public synchronized int method839() {
        return this.field350 < 0 ? -this.field350 : this.field350;
    }

    @ObfuscatedName("ae.aa()Z")
    public boolean method840() {
        return this.field346 < 0 || this.field346 >= ((class38) this.field362).field273.length << 8;
    }

    @ObfuscatedName("ae.ak()Z")
    public boolean method862() {
        return this.field358 != 0;
    }

    @ObfuscatedName("ae.w()Lay;")
    public class46 method650() {
        return null;
    }

    @ObfuscatedName("ae.s()Lay;")
    public class46 method661() {
        return null;
    }

    @ObfuscatedName("ae.q()I")
    public int method652() {
        return this.field347 == 0 && this.field358 == 0 ? 0 : 1;
    }

    @ObfuscatedName("ae.m([III)V")
    public synchronized void method665(int[] arg0, int arg1, int arg2) {
        if (this.field347 == 0 && this.field358 == 0) {
            this.method655(arg2);
            return;
        }
        class38 var4 = (class38) this.field362;
        int var5 = this.field345 << 8;
        int var6 = this.field354 << 8;
        int var7 = var4.field273.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field352 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field346 < 0) {
            if (this.field350 <= 0) {
                this.method882();
                this.method6657();
                return;
            }
            this.field346 = 0;
        }
        if (this.field346 >= var7) {
            if (this.field350 >= 0) {
                this.method882();
                this.method6657();
                return;
            }
            this.field346 = var7 - 1;
        }
        if (this.field352 >= 0) {
            if (this.field352 > 0) {
                if (this.field355) {
                    label131: {
                        if (this.field350 < 0) {
                            var9 = this.method845(arg0, arg1, var5, var10, var4.field273[this.field345]);
                            if (this.field346 >= var5) {
                                return;
                            }
                            this.field346 = var5 + var5 - 1 - this.field346;
                            this.field350 = -this.field350;
                            if (--this.field352 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method931(arg0, var9, var6, var10, var4.field273[this.field354 - 1]);
                            if (this.field346 < var6) {
                                return;
                            }
                            this.field346 = var6 + var6 - 1 - this.field346;
                            this.field350 = -this.field350;
                            if (--this.field352 == 0) {
                                break;
                            }
                            var9 = this.method845(arg0, var9, var5, var10, var4.field273[this.field345]);
                            if (this.field346 >= var5) {
                                return;
                            }
                            this.field346 = var5 + var5 - 1 - this.field346;
                            this.field350 = -this.field350;
                        } while (--this.field352 != 0);
                    }
                } else if (this.field350 < 0) {
                    while (true) {
                        var9 = this.method845(arg0, var9, var5, var10, var4.field273[this.field354 - 1]);
                        if (this.field346 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field346) / var8;
                        if (var12 >= this.field352) {
                            this.field346 += this.field352 * var8;
                            this.field352 = 0;
                            break;
                        }
                        this.field346 += var8 * var12;
                        this.field352 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method931(arg0, var9, var6, var10, var4.field273[this.field345]);
                        if (this.field346 < var6) {
                            return;
                        }
                        int var13 = (this.field346 - var5) / var8;
                        if (var13 >= this.field352) {
                            this.field346 -= this.field352 * var8;
                            this.field352 = 0;
                            break;
                        }
                        this.field346 -= var8 * var13;
                        this.field352 -= var13;
                    }
                }
            }
            if (this.field350 < 0) {
                this.method845(arg0, var9, 0, var10, 0);
                if (this.field346 < 0) {
                    this.field346 = -1;
                    this.method882();
                    this.method6657();
                }
            } else {
                this.method931(arg0, var9, var7, var10, 0);
                if (this.field346 >= var7) {
                    this.field346 = var7;
                    this.method882();
                    this.method6657();
                }
            }
        } else if (this.field355) {
            if (this.field350 < 0) {
                var9 = this.method845(arg0, arg1, var5, var10, var4.field273[this.field345]);
                if (this.field346 >= var5) {
                    return;
                }
                this.field346 = var5 + var5 - 1 - this.field346;
                this.field350 = -this.field350;
            }
            while (true) {
                int var11 = this.method931(arg0, var9, var6, var10, var4.field273[this.field354 - 1]);
                if (this.field346 < var6) {
                    return;
                }
                this.field346 = var6 + var6 - 1 - this.field346;
                this.field350 = -this.field350;
                var9 = this.method845(arg0, var11, var5, var10, var4.field273[this.field345]);
                if (this.field346 >= var5) {
                    return;
                }
                this.field346 = var5 + var5 - 1 - this.field346;
                this.field350 = -this.field350;
            }
        } else if (this.field350 < 0) {
            while (true) {
                var9 = this.method845(arg0, var9, var5, var10, var4.field273[this.field354 - 1]);
                if (this.field346 >= var5) {
                    return;
                }
                this.field346 = var6 - 1 - (var6 - 1 - this.field346) % var8;
            }
        } else {
            while (true) {
                var9 = this.method931(arg0, var9, var6, var10, var4.field273[this.field345]);
                if (this.field346 < var6) {
                    return;
                }
                this.field346 = (this.field346 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("ae.j(I)V")
    public synchronized void method655(int arg0) {
        if (this.field358 > 0) {
            if (arg0 >= this.field358) {
                if (this.field347 == Integer.MIN_VALUE) {
                    this.field347 = 0;
                    this.field351 = 0;
                    this.field357 = 0;
                    this.field349 = 0;
                    this.method6657();
                    arg0 = this.field358;
                }
                this.field358 = 0;
                this.method888();
            } else {
                this.field349 += this.field353 * arg0;
                this.field357 += this.field356 * arg0;
                this.field351 += this.field359 * arg0;
                this.field358 -= arg0;
            }
        }
        class38 var2 = (class38) this.field362;
        int var3 = this.field345 << 8;
        int var4 = this.field354 << 8;
        int var5 = var2.field273.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field352 = 0;
        }
        if (this.field346 < 0) {
            if (this.field350 <= 0) {
                this.method882();
                this.method6657();
                return;
            }
            this.field346 = 0;
        }
        if (this.field346 >= var5) {
            if (this.field350 >= 0) {
                this.method882();
                this.method6657();
                return;
            }
            this.field346 = var5 - 1;
        }
        this.field346 += this.field350 * arg0;
        if (this.field352 >= 0) {
            if (this.field352 > 0) {
                if (this.field355) {
                    label121: {
                        if (this.field350 < 0) {
                            if (this.field346 >= var3) {
                                return;
                            }
                            this.field346 = var3 + var3 - 1 - this.field346;
                            this.field350 = -this.field350;
                            if (--this.field352 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field346 < var4) {
                                return;
                            }
                            this.field346 = var4 + var4 - 1 - this.field346;
                            this.field350 = -this.field350;
                            if (--this.field352 == 0) {
                                break;
                            }
                            if (this.field346 >= var3) {
                                return;
                            }
                            this.field346 = var3 + var3 - 1 - this.field346;
                            this.field350 = -this.field350;
                        } while (--this.field352 != 0);
                    }
                } else {
                    label153: {
                        if (this.field350 < 0) {
                            if (this.field346 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field346) / var6;
                            if (var7 >= this.field352) {
                                this.field346 += this.field352 * var6;
                                this.field352 = 0;
                                break label153;
                            }
                            this.field346 += var6 * var7;
                            this.field352 -= var7;
                        } else if (this.field346 >= var4) {
                            int var8 = (this.field346 - var3) / var6;
                            if (var8 >= this.field352) {
                                this.field346 -= this.field352 * var6;
                                this.field352 = 0;
                                break label153;
                            }
                            this.field346 -= var6 * var8;
                            this.field352 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field350 < 0) {
                if (this.field346 < 0) {
                    this.field346 = -1;
                    this.method882();
                    this.method6657();
                }
            } else if (this.field346 >= var5) {
                this.field346 = var5;
                this.method882();
                this.method6657();
            }
        } else if (this.field355) {
            if (this.field350 < 0) {
                if (this.field346 >= var3) {
                    return;
                }
                this.field346 = var3 + var3 - 1 - this.field346;
                this.field350 = -this.field350;
            }
            while (this.field346 >= var4) {
                this.field346 = var4 + var4 - 1 - this.field346;
                this.field350 = -this.field350;
                if (this.field346 >= var3) {
                    return;
                }
                this.field346 = var3 + var3 - 1 - this.field346;
                this.field350 = -this.field350;
            }
        } else if (this.field350 < 0) {
            if (this.field346 >= var3) {
                return;
            }
            this.field346 = var4 - 1 - (var4 - 1 - this.field346) % var6;
        } else if (this.field346 >= var4) {
            this.field346 = (this.field346 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("ae.am([IIIII)I")
    public int method931(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field358 > 0) {
                int var6 = this.field358 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field358 += arg1;
                if (this.field350 == 256 && (this.field346 & 0xFF) == 0) {
                    if (Statics.field298) {
                        arg1 = method856(0, ((class38) this.field362).field273, arg0, this.field346, arg1, this.field357, this.field351, this.field356, this.field359, 0, var6, arg2, this);
                    } else {
                        arg1 = method855(((class38) this.field362).field273, arg0, this.field346, arg1, this.field349, this.field353, 0, var6, arg2, this);
                    }
                } else if (Statics.field298) {
                    arg1 = method860(0, 0, ((class38) this.field362).field273, arg0, this.field346, arg1, this.field357, this.field351, this.field356, this.field359, 0, var6, arg2, this, this.field350, arg4);
                } else {
                    arg1 = method844(0, 0, ((class38) this.field362).field273, arg0, this.field346, arg1, this.field349, this.field353, 0, var6, arg2, this, this.field350, arg4);
                }
                this.field358 -= arg1;
                if (this.field358 != 0) {
                    return arg1;
                }
                if (!this.method846()) {
                    continue;
                }
                return arg3;
            }
            if (this.field350 == 256 && (this.field346 & 0xFF) == 0) {
                if (Statics.field298) {
                    return method847(0, ((class38) this.field362).field273, arg0, this.field346, arg1, this.field357, this.field351, 0, arg3, arg2, this);
                }
                return method843(((class38) this.field362).field273, arg0, this.field346, arg1, this.field349, 0, arg3, arg2, this);
            }
            if (Statics.field298) {
                return method917(0, 0, ((class38) this.field362).field273, arg0, this.field346, arg1, this.field357, this.field351, 0, arg3, arg2, this, this.field350, arg4);
            }
            return method835(0, 0, ((class38) this.field362).field273, arg0, this.field346, arg1, this.field349, 0, arg3, arg2, this, this.field350, arg4);
        }
    }

    @ObfuscatedName("ae.ap([IIIII)I")
    public int method845(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field358 > 0) {
                int var6 = this.field358 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field358 += arg1;
                if (this.field350 == -256 && (this.field346 & 0xFF) == 0) {
                    if (Statics.field298) {
                        arg1 = method858(0, ((class38) this.field362).field273, arg0, this.field346, arg1, this.field357, this.field351, this.field356, this.field359, 0, var6, arg2, this);
                    } else {
                        arg1 = method833(((class38) this.field362).field273, arg0, this.field346, arg1, this.field349, this.field353, 0, var6, arg2, this);
                    }
                } else if (Statics.field298) {
                    arg1 = method842(0, 0, ((class38) this.field362).field273, arg0, this.field346, arg1, this.field357, this.field351, this.field356, this.field359, 0, var6, arg2, this, this.field350, arg4);
                } else {
                    arg1 = method861(0, 0, ((class38) this.field362).field273, arg0, this.field346, arg1, this.field349, this.field353, 0, var6, arg2, this, this.field350, arg4);
                }
                this.field358 -= arg1;
                if (this.field358 != 0) {
                    return arg1;
                }
                if (!this.method846()) {
                    continue;
                }
                return arg3;
            }
            if (this.field350 == -256 && (this.field346 & 0xFF) == 0) {
                if (Statics.field298) {
                    return method850(0, ((class38) this.field362).field273, arg0, this.field346, arg1, this.field357, this.field351, 0, arg3, arg2, this);
                }
                return method849(((class38) this.field362).field273, arg0, this.field346, arg1, this.field349, 0, arg3, arg2, this);
            }
            if (Statics.field298) {
                return method854(0, 0, ((class38) this.field362).field273, arg0, this.field346, arg1, this.field357, this.field351, 0, arg3, arg2, this, this.field350, arg4);
            }
            return method853(0, 0, ((class38) this.field362).field273, arg0, this.field346, arg1, this.field349, 0, arg3, arg2, this, this.field350, arg4);
        }
    }

    @ObfuscatedName("ae.az()Z")
    public boolean method846() {
        int var1 = this.field347;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method838(var1, this.field348);
            var2 = method821(var1, this.field348);
        }
        if (this.field349 != var1 || this.field357 != var3 || this.field351 != var2) {
            if (this.field349 < var1) {
                this.field353 = 1;
                this.field358 = var1 - this.field349;
            } else if (this.field349 > var1) {
                this.field353 = -1;
                this.field358 = this.field349 - var1;
            } else {
                this.field353 = 0;
            }
            if (this.field357 < var3) {
                this.field356 = 1;
                if (this.field358 == 0 || this.field358 > var3 - this.field357) {
                    this.field358 = var3 - this.field357;
                }
            } else if (this.field357 > var3) {
                this.field356 = -1;
                if (this.field358 == 0 || this.field358 > this.field357 - var3) {
                    this.field358 = this.field357 - var3;
                }
            } else {
                this.field356 = 0;
            }
            if (this.field351 < var2) {
                this.field359 = 1;
                if (this.field358 == 0 || this.field358 > var2 - this.field351) {
                    this.field358 = var2 - this.field351;
                }
            } else if (this.field351 > var2) {
                this.field359 = -1;
                if (this.field358 == 0 || this.field358 > this.field351 - var2) {
                    this.field358 = this.field351 - var2;
                }
            } else {
                this.field359 = 0;
            }
            return false;
        } else if (this.field347 == Integer.MIN_VALUE) {
            this.field347 = 0;
            this.field351 = 0;
            this.field357 = 0;
            this.field349 = 0;
            this.method6657();
            return true;
        } else {
            this.method888();
            return false;
        }
    }

    @ObfuscatedName("ae.ad([B[IIIIIIILae;)I")
    public static int method843(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class45 arg8) {
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
        arg8.field346 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("ae.aj(I[B[IIIIIIIILae;)I")
    public static int method847(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class45 arg10) {
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
        arg10.field346 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("ae.ax([B[IIIIIIILae;)I")
    public static int method849(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class45 arg8) {
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
        arg8.field346 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("ae.av(I[B[IIIIIIIILae;)I")
    public static int method850(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class45 arg10) {
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
        arg10.field346 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("ae.ae(II[B[IIIIIIILae;II)I")
    public static int method835(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class45 arg10, int arg11, int arg12) {
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
        arg10.field346 = arg4;
        return arg5;
    }

    @ObfuscatedName("ae.ay(II[B[IIIIIIIILae;II)I")
    public static int method917(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class45 arg11, int arg12, int arg13) {
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
        arg11.field346 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("ae.ag(II[B[IIIIIIILae;II)I")
    public static int method853(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class45 arg10, int arg11, int arg12) {
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
        arg10.field346 = arg4;
        return arg5;
    }

    @ObfuscatedName("ae.aw(II[B[IIIIIIIILae;II)I")
    public static int method854(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class45 arg11, int arg12, int arg13) {
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
        arg11.field346 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("ae.ah([B[IIIIIIIILae;)I")
    public static int method855(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class45 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field357 += (var14 - arg3) * arg9.field356;
        arg9.field351 += (var14 - arg3) * arg9.field359;
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
        arg9.field349 = var12 >> 2;
        arg9.field346 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("ae.at(I[B[IIIIIIIIIILae;)I")
    public static int method856(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class45 arg12) {
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
        arg12.field349 += (var19 - arg4) * arg12.field353;
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
        arg12.field357 = var15 >> 2;
        arg12.field351 = var16 >> 2;
        arg12.field346 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("ae.al([B[IIIIIIIILae;)I")
    public static int method833(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class45 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field357 += (var14 - arg3) * arg9.field356;
        arg9.field351 += (var14 - arg3) * arg9.field359;
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
        arg9.field349 = var12 >> 2;
        arg9.field346 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("ae.au(I[B[IIIIIIIIIILae;)I")
    public static int method858(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class45 arg12) {
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
        arg12.field349 += (var19 - arg4) * arg12.field353;
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
        arg12.field357 = var15 >> 2;
        arg12.field351 = var16 >> 2;
        arg12.field346 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("ae.bg(II[B[IIIIIIIILae;II)I")
    public static int method844(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class45 arg11, int arg12, int arg13) {
        arg11.field357 -= arg11.field356 * arg5;
        arg11.field351 -= arg11.field359 * arg5;
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
        arg11.field357 += arg11.field356 * arg5;
        arg11.field351 += arg11.field359 * arg5;
        arg11.field349 = arg6;
        arg11.field346 = arg4;
        return arg5;
    }

    @ObfuscatedName("ae.bi(II[B[IIIIIIIIIILae;II)I")
    public static int method860(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class45 arg13, int arg14, int arg15) {
        arg13.field349 -= arg13.field353 * arg5;
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
        arg13.field349 += arg13.field353 * var27;
        arg13.field357 = arg6;
        arg13.field351 = arg7;
        arg13.field346 = arg4;
        return var27;
    }

    @ObfuscatedName("ae.bj(II[B[IIIIIIIILae;II)I")
    public static int method861(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class45 arg11, int arg12, int arg13) {
        arg11.field357 -= arg11.field356 * arg5;
        arg11.field351 -= arg11.field359 * arg5;
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
        arg11.field357 += arg11.field356 * arg5;
        arg11.field351 += arg11.field359 * arg5;
        arg11.field349 = arg6;
        arg11.field346 = arg4;
        return arg5;
    }

    @ObfuscatedName("ae.by(II[B[IIIIIIIIIILae;II)I")
    public static int method842(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class45 arg13, int arg14, int arg15) {
        arg13.field349 -= arg13.field353 * arg5;
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
        arg13.field349 += arg13.field353 * var26;
        arg13.field357 = arg6;
        arg13.field351 = arg7;
        arg13.field346 = arg4;
        return var26;
    }
}

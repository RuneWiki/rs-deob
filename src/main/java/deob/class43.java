package deob;

@ObfuscatedName("ax")
public class class43 extends class44 {

    @ObfuscatedName("ax.i")
    public int field319;

    @ObfuscatedName("ax.s")
    public int field310;

    @ObfuscatedName("ax.a")
    public int field308;

    @ObfuscatedName("ax.o")
    public int field309;

    @ObfuscatedName("ax.g")
    public int field312;

    @ObfuscatedName("ax.e")
    public int field311;

    @ObfuscatedName("ax.p")
    public int field306;

    @ObfuscatedName("ax.j")
    public int field313;

    @ObfuscatedName("ax.b")
    public int field314;

    @ObfuscatedName("ax.x")
    public int field315;

    @ObfuscatedName("ax.y")
    public boolean field316;

    @ObfuscatedName("ax.k")
    public int field317;

    @ObfuscatedName("ax.t")
    public int field318;

    @ObfuscatedName("ax.l")
    public int field307;

    @ObfuscatedName("ax.u")
    public int field320;

    @ObfuscatedName("ax.i(II)I")
    public static int method798(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("ax.w(II)I")
    public static int method921(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("ax.au()I")
    public int method828() {
        int var1 = this.field312 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field313 == 0) {
            var2 -= this.field319 * var2 / (((class36) this.field323).field235.length << 8);
        } else if (this.field313 >= 0) {
            var2 -= this.field314 * var2 / ((class36) this.field323).field235.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class43(class36 arg0, int arg1, int arg2) {
        this.field323 = arg0;
        this.field314 = arg0.field237;
        this.field315 = arg0.field236;
        this.field316 = arg0.field239;
        this.field310 = arg1;
        this.field308 = arg2;
        this.field309 = 8192;
        this.field319 = 0;
        this.method791();
    }

    public class43(class36 arg0, int arg1, int arg2, int arg3) {
        this.field323 = arg0;
        this.field314 = arg0.field237;
        this.field315 = arg0.field236;
        this.field316 = arg0.field239;
        this.field310 = arg1;
        this.field308 = arg2;
        this.field309 = arg3;
        this.field319 = 0;
        this.method791();
    }

    @ObfuscatedName("ax.s(Laz;II)Lax;")
    public static class43 method789(class36 arg0, int arg1, int arg2) {
        return arg0.field235 == null || arg0.field235.length == 0 ? null : new class43(arg0, (int) ((long) arg0.field238 * 256L * (long) arg1 / (long) (Statics.field4360 * 100)), arg2 << 6);
    }

    @ObfuscatedName("ax.a(Laz;III)Lax;")
    public static class43 method790(class36 arg0, int arg1, int arg2, int arg3) {
        return arg0.field235 == null || arg0.field235.length == 0 ? null : new class43(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("ax.o()V")
    public void method791() {
        this.field312 = this.field308;
        this.field311 = method798(this.field308, this.field309);
        this.field306 = method921(this.field308, this.field309);
    }

    @ObfuscatedName("ax.b(I)V")
    public synchronized void method800(int arg0) {
        this.field313 = arg0;
    }

    @ObfuscatedName("ax.y(I)V")
    public synchronized void method793(int arg0) {
        this.method794(arg0 << 6, this.method796());
    }

    @ObfuscatedName("ax.k(I)V")
    public synchronized void method882(int arg0) {
        this.method794(arg0, this.method796());
    }

    @ObfuscatedName("ax.t(II)V")
    public synchronized void method794(int arg0, int arg1) {
        this.field308 = arg0;
        this.field309 = arg1;
        this.field317 = 0;
        this.method791();
    }

    @ObfuscatedName("ax.l()I")
    public synchronized int method890() {
        return this.field308 == Integer.MIN_VALUE ? 0 : this.field308;
    }

    @ObfuscatedName("ax.u()I")
    public synchronized int method796() {
        return this.field309 < 0 ? -1 : this.field309;
    }

    @ObfuscatedName("ax.n(I)V")
    public synchronized void method797(int arg0) {
        int var2 = ((class36) this.field323).field235.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field319 = arg0;
    }

    @ObfuscatedName("ax.z(Z)V")
    public synchronized void method877(boolean arg0) {
        this.field310 = (this.field310 >>> 31) + (this.field310 ^ this.field310 >> 31);
        if (arg0) {
            this.field310 = -this.field310;
        }
    }

    @ObfuscatedName("ax.q()V")
    public void method871() {
        if (this.field317 == 0) {
            return;
        }
        if (this.field308 == Integer.MIN_VALUE) {
            this.field308 = 0;
        }
        this.field317 = 0;
        this.method791();
    }

    @ObfuscatedName("ax.d(II)V")
    public synchronized void method895(int arg0, int arg1) {
        this.method801(arg0, arg1, this.method796());
    }

    @ObfuscatedName("ax.r(III)V")
    public synchronized void method801(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method794(arg1, arg2);
            return;
        }
        int var4 = method798(arg1, arg2);
        int var5 = method921(arg1, arg2);
        if (this.field311 == var4 && this.field306 == var5) {
            this.field317 = 0;
            return;
        }
        int var6 = arg1 - this.field312;
        if (this.field312 - arg1 > var6) {
            var6 = this.field312 - arg1;
        }
        if (var4 - this.field311 > var6) {
            var6 = var4 - this.field311;
        }
        if (this.field311 - var4 > var6) {
            var6 = this.field311 - var4;
        }
        if (var5 - this.field306 > var6) {
            var6 = var5 - this.field306;
        }
        if (this.field306 - var5 > var6) {
            var6 = this.field306 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field317 = arg0;
        this.field308 = arg1;
        this.field309 = arg2;
        this.field318 = (arg1 - this.field312) / arg0;
        this.field307 = (var4 - this.field311) / arg0;
        this.field320 = (var5 - this.field306) / arg0;
    }

    @ObfuscatedName("ax.m(I)V")
    public synchronized void method802(int arg0) {
        if (arg0 == 0) {
            this.method882(0);
            this.method5752();
        } else if (this.field311 == 0 && this.field306 == 0) {
            this.field317 = 0;
            this.field308 = 0;
            this.field312 = 0;
            this.method5752();
        } else {
            int var2 = -this.field312;
            if (this.field312 > var2) {
                var2 = this.field312;
            }
            if (-this.field311 > var2) {
                var2 = -this.field311;
            }
            if (this.field311 > var2) {
                var2 = this.field311;
            }
            if (-this.field306 > var2) {
                var2 = -this.field306;
            }
            if (this.field306 > var2) {
                var2 = this.field306;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field317 = arg0;
            this.field308 = Integer.MIN_VALUE;
            this.field318 = -this.field312 / arg0;
            this.field307 = -this.field311 / arg0;
            this.field320 = -this.field306 / arg0;
        }
    }

    @ObfuscatedName("ax.c(I)V")
    public synchronized void method868(int arg0) {
        if (this.field310 < 0) {
            this.field310 = -arg0;
        } else {
            this.field310 = arg0;
        }
    }

    @ObfuscatedName("ax.f()I")
    public synchronized int method804() {
        return this.field310 < 0 ? -this.field310 : this.field310;
    }

    @ObfuscatedName("ax.h()Z")
    public boolean method805() {
        return this.field319 < 0 || this.field319 >= ((class36) this.field323).field235.length << 8;
    }

    @ObfuscatedName("ax.v()Z")
    public boolean method806() {
        return this.field317 != 0;
    }

    @ObfuscatedName("ax.g()Lav;")
    public class44 method626() {
        return null;
    }

    @ObfuscatedName("ax.e()Lav;")
    public class44 method627() {
        return null;
    }

    @ObfuscatedName("ax.p()I")
    public int method628() {
        return this.field308 == 0 && this.field317 == 0 ? 0 : 1;
    }

    @ObfuscatedName("ax.j([III)V")
    public synchronized void method640(int[] arg0, int arg1, int arg2) {
        if (this.field308 == 0 && this.field317 == 0) {
            this.method631(arg2);
            return;
        }
        class36 var4 = (class36) this.field323;
        int var5 = this.field314 << 8;
        int var6 = this.field315 << 8;
        int var7 = var4.field235.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field313 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field319 < 0) {
            if (this.field310 <= 0) {
                this.method871();
                this.method5752();
                return;
            }
            this.field319 = 0;
        }
        if (this.field319 >= var7) {
            if (this.field310 >= 0) {
                this.method871();
                this.method5752();
                return;
            }
            this.field319 = var7 - 1;
        }
        if (this.field313 >= 0) {
            if (this.field313 > 0) {
                if (this.field316) {
                    label131: {
                        if (this.field310 < 0) {
                            var9 = this.method810(arg0, arg1, var5, var10, var4.field235[this.field314]);
                            if (this.field319 >= var5) {
                                return;
                            }
                            this.field319 = var5 + var5 - 1 - this.field319;
                            this.field310 = -this.field310;
                            if (--this.field313 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method799(arg0, var9, var6, var10, var4.field235[this.field315 - 1]);
                            if (this.field319 < var6) {
                                return;
                            }
                            this.field319 = var6 + var6 - 1 - this.field319;
                            this.field310 = -this.field310;
                            if (--this.field313 == 0) {
                                break;
                            }
                            var9 = this.method810(arg0, var9, var5, var10, var4.field235[this.field314]);
                            if (this.field319 >= var5) {
                                return;
                            }
                            this.field319 = var5 + var5 - 1 - this.field319;
                            this.field310 = -this.field310;
                        } while (--this.field313 != 0);
                    }
                } else if (this.field310 < 0) {
                    while (true) {
                        var9 = this.method810(arg0, var9, var5, var10, var4.field235[this.field315 - 1]);
                        if (this.field319 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field319) / var8;
                        if (var12 >= this.field313) {
                            this.field319 += this.field313 * var8;
                            this.field313 = 0;
                            break;
                        }
                        this.field319 += var8 * var12;
                        this.field313 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method799(arg0, var9, var6, var10, var4.field235[this.field314]);
                        if (this.field319 < var6) {
                            return;
                        }
                        int var13 = (this.field319 - var5) / var8;
                        if (var13 >= this.field313) {
                            this.field319 -= this.field313 * var8;
                            this.field313 = 0;
                            break;
                        }
                        this.field319 -= var8 * var13;
                        this.field313 -= var13;
                    }
                }
            }
            if (this.field310 < 0) {
                this.method810(arg0, var9, 0, var10, 0);
                if (this.field319 < 0) {
                    this.field319 = -1;
                    this.method871();
                    this.method5752();
                }
            } else {
                this.method799(arg0, var9, var7, var10, 0);
                if (this.field319 >= var7) {
                    this.field319 = var7;
                    this.method871();
                    this.method5752();
                }
            }
        } else if (this.field316) {
            if (this.field310 < 0) {
                var9 = this.method810(arg0, arg1, var5, var10, var4.field235[this.field314]);
                if (this.field319 >= var5) {
                    return;
                }
                this.field319 = var5 + var5 - 1 - this.field319;
                this.field310 = -this.field310;
            }
            while (true) {
                int var11 = this.method799(arg0, var9, var6, var10, var4.field235[this.field315 - 1]);
                if (this.field319 < var6) {
                    return;
                }
                this.field319 = var6 + var6 - 1 - this.field319;
                this.field310 = -this.field310;
                var9 = this.method810(arg0, var11, var5, var10, var4.field235[this.field314]);
                if (this.field319 >= var5) {
                    return;
                }
                this.field319 = var5 + var5 - 1 - this.field319;
                this.field310 = -this.field310;
            }
        } else if (this.field310 < 0) {
            while (true) {
                var9 = this.method810(arg0, var9, var5, var10, var4.field235[this.field315 - 1]);
                if (this.field319 >= var5) {
                    return;
                }
                this.field319 = var6 - 1 - (var6 - 1 - this.field319) % var8;
            }
        } else {
            while (true) {
                var9 = this.method799(arg0, var9, var6, var10, var4.field235[this.field314]);
                if (this.field319 < var6) {
                    return;
                }
                this.field319 = (this.field319 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("ax.x(I)V")
    public synchronized void method631(int arg0) {
        if (this.field317 > 0) {
            if (arg0 >= this.field317) {
                if (this.field308 == Integer.MIN_VALUE) {
                    this.field308 = 0;
                    this.field306 = 0;
                    this.field311 = 0;
                    this.field312 = 0;
                    this.method5752();
                    arg0 = this.field317;
                }
                this.field317 = 0;
                this.method791();
            } else {
                this.field312 += this.field318 * arg0;
                this.field311 += this.field307 * arg0;
                this.field306 += this.field320 * arg0;
                this.field317 -= arg0;
            }
        }
        class36 var2 = (class36) this.field323;
        int var3 = this.field314 << 8;
        int var4 = this.field315 << 8;
        int var5 = var2.field235.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field313 = 0;
        }
        if (this.field319 < 0) {
            if (this.field310 <= 0) {
                this.method871();
                this.method5752();
                return;
            }
            this.field319 = 0;
        }
        if (this.field319 >= var5) {
            if (this.field310 >= 0) {
                this.method871();
                this.method5752();
                return;
            }
            this.field319 = var5 - 1;
        }
        this.field319 += this.field310 * arg0;
        if (this.field313 >= 0) {
            if (this.field313 > 0) {
                if (this.field316) {
                    label121: {
                        if (this.field310 < 0) {
                            if (this.field319 >= var3) {
                                return;
                            }
                            this.field319 = var3 + var3 - 1 - this.field319;
                            this.field310 = -this.field310;
                            if (--this.field313 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field319 < var4) {
                                return;
                            }
                            this.field319 = var4 + var4 - 1 - this.field319;
                            this.field310 = -this.field310;
                            if (--this.field313 == 0) {
                                break;
                            }
                            if (this.field319 >= var3) {
                                return;
                            }
                            this.field319 = var3 + var3 - 1 - this.field319;
                            this.field310 = -this.field310;
                        } while (--this.field313 != 0);
                    }
                } else {
                    label153: {
                        if (this.field310 < 0) {
                            if (this.field319 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field319) / var6;
                            if (var7 >= this.field313) {
                                this.field319 += this.field313 * var6;
                                this.field313 = 0;
                                break label153;
                            }
                            this.field319 += var6 * var7;
                            this.field313 -= var7;
                        } else if (this.field319 >= var4) {
                            int var8 = (this.field319 - var3) / var6;
                            if (var8 >= this.field313) {
                                this.field319 -= this.field313 * var6;
                                this.field313 = 0;
                                break label153;
                            }
                            this.field319 -= var6 * var8;
                            this.field313 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field310 < 0) {
                if (this.field319 < 0) {
                    this.field319 = -1;
                    this.method871();
                    this.method5752();
                }
            } else if (this.field319 >= var5) {
                this.field319 = var5;
                this.method871();
                this.method5752();
            }
        } else if (this.field316) {
            if (this.field310 < 0) {
                if (this.field319 >= var3) {
                    return;
                }
                this.field319 = var3 + var3 - 1 - this.field319;
                this.field310 = -this.field310;
            }
            while (this.field319 >= var4) {
                this.field319 = var4 + var4 - 1 - this.field319;
                this.field310 = -this.field310;
                if (this.field319 >= var3) {
                    return;
                }
                this.field319 = var3 + var3 - 1 - this.field319;
                this.field310 = -this.field310;
            }
        } else if (this.field310 < 0) {
            if (this.field319 >= var3) {
                return;
            }
            this.field319 = var4 - 1 - (var4 - 1 - this.field319) % var6;
        } else if (this.field319 >= var4) {
            this.field319 = (this.field319 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("ax.ab([IIIII)I")
    public int method799(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field317 > 0) {
                int var6 = this.field317 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field317 += arg1;
                if (this.field310 == 256 && (this.field319 & 0xFF) == 0) {
                    if (Statics.field263) {
                        arg1 = method819(0, ((class36) this.field323).field235, arg0, this.field319, arg1, this.field311, this.field306, this.field307, this.field320, 0, var6, arg2, this);
                    } else {
                        arg1 = method913(((class36) this.field323).field235, arg0, this.field319, arg1, this.field312, this.field318, 0, var6, arg2, this);
                    }
                } else if (Statics.field263) {
                    arg1 = method823(0, 0, ((class36) this.field323).field235, arg0, this.field319, arg1, this.field311, this.field306, this.field307, this.field320, 0, var6, arg2, this, this.field310, arg4);
                } else {
                    arg1 = method822(0, 0, ((class36) this.field323).field235, arg0, this.field319, arg1, this.field312, this.field318, 0, var6, arg2, this, this.field310, arg4);
                }
                this.field317 -= arg1;
                if (this.field317 != 0) {
                    return arg1;
                }
                if (!this.method907()) {
                    continue;
                }
                return arg3;
            }
            if (this.field310 == 256 && (this.field319 & 0xFF) == 0) {
                if (Statics.field263) {
                    return method915(0, ((class36) this.field323).field235, arg0, this.field319, arg1, this.field311, this.field306, 0, arg3, arg2, this);
                }
                return method812(((class36) this.field323).field235, arg0, this.field319, arg1, this.field312, 0, arg3, arg2, this);
            }
            if (Statics.field263) {
                return method816(0, 0, ((class36) this.field323).field235, arg0, this.field319, arg1, this.field311, this.field306, 0, arg3, arg2, this, this.field310, arg4);
            }
            return method815(0, 0, ((class36) this.field323).field235, arg0, this.field319, arg1, this.field312, 0, arg3, arg2, this, this.field310, arg4);
        }
    }

    @ObfuscatedName("ax.ar([IIIII)I")
    public int method810(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field317 > 0) {
                int var6 = this.field317 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field317 += arg1;
                if (this.field310 == -256 && (this.field319 & 0xFF) == 0) {
                    if (Statics.field263) {
                        arg1 = method821(0, ((class36) this.field323).field235, arg0, this.field319, arg1, this.field311, this.field306, this.field307, this.field320, 0, var6, arg2, this);
                    } else {
                        arg1 = method803(((class36) this.field323).field235, arg0, this.field319, arg1, this.field312, this.field318, 0, var6, arg2, this);
                    }
                } else if (Statics.field263) {
                    arg1 = method825(0, 0, ((class36) this.field323).field235, arg0, this.field319, arg1, this.field311, this.field306, this.field307, this.field320, 0, var6, arg2, this, this.field310, arg4);
                } else {
                    arg1 = method855(0, 0, ((class36) this.field323).field235, arg0, this.field319, arg1, this.field312, this.field318, 0, var6, arg2, this, this.field310, arg4);
                }
                this.field317 -= arg1;
                if (this.field317 != 0) {
                    return arg1;
                }
                if (!this.method907()) {
                    continue;
                }
                return arg3;
            }
            if (this.field310 == -256 && (this.field319 & 0xFF) == 0) {
                if (Statics.field263) {
                    return method814(0, ((class36) this.field323).field235, arg0, this.field319, arg1, this.field311, this.field306, 0, arg3, arg2, this);
                }
                return method813(((class36) this.field323).field235, arg0, this.field319, arg1, this.field312, 0, arg3, arg2, this);
            }
            if (Statics.field263) {
                return method818(0, 0, ((class36) this.field323).field235, arg0, this.field319, arg1, this.field311, this.field306, 0, arg3, arg2, this, this.field310, arg4);
            }
            return method817(0, 0, ((class36) this.field323).field235, arg0, this.field319, arg1, this.field312, 0, arg3, arg2, this, this.field310, arg4);
        }
    }

    @ObfuscatedName("ax.ad()Z")
    public boolean method907() {
        int var1 = this.field308;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method798(var1, this.field309);
            var2 = method921(var1, this.field309);
        }
        if (this.field312 != var1 || this.field311 != var3 || this.field306 != var2) {
            if (this.field312 < var1) {
                this.field318 = 1;
                this.field317 = var1 - this.field312;
            } else if (this.field312 > var1) {
                this.field318 = -1;
                this.field317 = this.field312 - var1;
            } else {
                this.field318 = 0;
            }
            if (this.field311 < var3) {
                this.field307 = 1;
                if (this.field317 == 0 || this.field317 > var3 - this.field311) {
                    this.field317 = var3 - this.field311;
                }
            } else if (this.field311 > var3) {
                this.field307 = -1;
                if (this.field317 == 0 || this.field317 > this.field311 - var3) {
                    this.field317 = this.field311 - var3;
                }
            } else {
                this.field307 = 0;
            }
            if (this.field306 < var2) {
                this.field320 = 1;
                if (this.field317 == 0 || this.field317 > var2 - this.field306) {
                    this.field317 = var2 - this.field306;
                }
            } else if (this.field306 > var2) {
                this.field320 = -1;
                if (this.field317 == 0 || this.field317 > this.field306 - var2) {
                    this.field317 = this.field306 - var2;
                }
            } else {
                this.field320 = 0;
            }
            return false;
        } else if (this.field308 == Integer.MIN_VALUE) {
            this.field308 = 0;
            this.field306 = 0;
            this.field311 = 0;
            this.field312 = 0;
            this.method5752();
            return true;
        } else {
            this.method791();
            return false;
        }
    }

    @ObfuscatedName("ax.an([B[IIIIIIILax;)I")
    public static int method812(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class43 arg8) {
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
        arg8.field319 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("ax.aj(I[B[IIIIIIIILax;)I")
    public static int method915(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class43 arg10) {
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
        arg10.field319 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("ax.af([B[IIIIIIILax;)I")
    public static int method813(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class43 arg8) {
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
        arg8.field319 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("ax.aw(I[B[IIIIIIIILax;)I")
    public static int method814(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class43 arg10) {
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
        arg10.field319 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("ax.ao(II[B[IIIIIIILax;II)I")
    public static int method815(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class43 arg10, int arg11, int arg12) {
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
        arg10.field319 = arg4;
        return arg5;
    }

    @ObfuscatedName("ax.aa(II[B[IIIIIIIILax;II)I")
    public static int method816(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class43 arg11, int arg12, int arg13) {
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
        arg11.field319 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("ax.ay(II[B[IIIIIIILax;II)I")
    public static int method817(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class43 arg10, int arg11, int arg12) {
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
        arg10.field319 = arg4;
        return arg5;
    }

    @ObfuscatedName("ax.bg(II[B[IIIIIIIILax;II)I")
    public static int method818(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class43 arg11, int arg12, int arg13) {
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
        arg11.field319 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("ax.bl([B[IIIIIIIILax;)I")
    public static int method913(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class43 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field311 += (var14 - arg3) * arg9.field307;
        arg9.field306 += (var14 - arg3) * arg9.field320;
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
        arg9.field312 = var12 >> 2;
        arg9.field319 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("ax.bx(I[B[IIIIIIIIIILax;)I")
    public static int method819(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class43 arg12) {
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
        arg12.field312 += (var19 - arg4) * arg12.field318;
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
        arg12.field311 = var15 >> 2;
        arg12.field306 = var16 >> 2;
        arg12.field319 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("ax.bd([B[IIIIIIIILax;)I")
    public static int method803(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class43 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field311 += (var14 - arg3) * arg9.field307;
        arg9.field306 += (var14 - arg3) * arg9.field320;
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
        arg9.field312 = var12 >> 2;
        arg9.field319 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("ax.bt(I[B[IIIIIIIIIILax;)I")
    public static int method821(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class43 arg12) {
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
        arg12.field312 += (var19 - arg4) * arg12.field318;
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
        arg12.field311 = var15 >> 2;
        arg12.field306 = var16 >> 2;
        arg12.field319 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("ax.bf(II[B[IIIIIIIILax;II)I")
    public static int method822(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class43 arg11, int arg12, int arg13) {
        arg11.field311 -= arg11.field307 * arg5;
        arg11.field306 -= arg11.field320 * arg5;
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
        arg11.field311 += arg11.field307 * arg5;
        arg11.field306 += arg11.field320 * arg5;
        arg11.field312 = arg6;
        arg11.field319 = arg4;
        return arg5;
    }

    @ObfuscatedName("ax.bw(II[B[IIIIIIIIIILax;II)I")
    public static int method823(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class43 arg13, int arg14, int arg15) {
        arg13.field312 -= arg13.field318 * arg5;
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
        arg13.field312 += arg13.field318 * var27;
        arg13.field311 = arg6;
        arg13.field306 = arg7;
        arg13.field319 = arg4;
        return var27;
    }

    @ObfuscatedName("ax.bm(II[B[IIIIIIIILax;II)I")
    public static int method855(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class43 arg11, int arg12, int arg13) {
        arg11.field311 -= arg11.field307 * arg5;
        arg11.field306 -= arg11.field320 * arg5;
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
        arg11.field311 += arg11.field307 * arg5;
        arg11.field306 += arg11.field320 * arg5;
        arg11.field312 = arg6;
        arg11.field319 = arg4;
        return arg5;
    }

    @ObfuscatedName("ax.br(II[B[IIIIIIIIIILax;II)I")
    public static int method825(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class43 arg13, int arg14, int arg15) {
        arg13.field312 -= arg13.field318 * arg5;
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
        arg13.field312 += arg13.field318 * var26;
        arg13.field311 = arg6;
        arg13.field306 = arg7;
        arg13.field319 = arg4;
        return var26;
    }
}

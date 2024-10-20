package deob;

@ObfuscatedName("ab")
public class class48 extends class49 {

    @ObfuscatedName("ab.f")
    public int field358;

    @ObfuscatedName("ab.v")
    public int field355;

    @ObfuscatedName("ab.s")
    public int field368;

    @ObfuscatedName("ab.z")
    public int field357;

    @ObfuscatedName("ab.j")
    public int field363;

    @ObfuscatedName("ab.i")
    public int field359;

    @ObfuscatedName("ab.n")
    public int field356;

    @ObfuscatedName("ab.l")
    public int field361;

    @ObfuscatedName("ab.k")
    public int field362;

    @ObfuscatedName("ab.c")
    public int field367;

    @ObfuscatedName("ab.r")
    public boolean field364;

    @ObfuscatedName("ab.b")
    public int field365;

    @ObfuscatedName("ab.m")
    public int field366;

    @ObfuscatedName("ab.t")
    public int field360;

    @ObfuscatedName("ab.h")
    public int field354;

    @ObfuscatedName("ab.f(II)I")
    public static int method938(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("ab.w(II)I")
    public static int method851(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("ab.av()I")
    public int method979() {
        int var1 = this.field363 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field361 == 0) {
            var2 -= this.field358 * var2 / (((class41) this.field369).field290.length << 8);
        } else if (this.field361 >= 0) {
            var2 -= this.field362 * var2 / ((class41) this.field369).field290.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class48(class41 arg0, int arg1, int arg2) {
        this.field369 = arg0;
        this.field362 = arg0.field289;
        this.field367 = arg0.field291;
        this.field364 = arg0.field293;
        this.field355 = arg1;
        this.field368 = arg2;
        this.field357 = 8192;
        this.field358 = 0;
        this.method871();
    }

    public class48(class41 arg0, int arg1, int arg2, int arg3) {
        this.field369 = arg0;
        this.field362 = arg0.field289;
        this.field367 = arg0.field291;
        this.field364 = arg0.field293;
        this.field355 = arg1;
        this.field368 = arg2;
        this.field357 = arg3;
        this.field358 = 0;
        this.method871();
    }

    @ObfuscatedName("ab.v(Lav;II)Lab;")
    public static class48 method854(class41 arg0, int arg1, int arg2) {
        return arg0.field290 == null || arg0.field290.length == 0 ? null : new class48(arg0, (int) ((long) arg0.field292 * 256L * (long) arg1 / (long) (Statics.field3322 * 100)), arg2 << 6);
    }

    @ObfuscatedName("ab.s(Lav;III)Lab;")
    public static class48 method880(class41 arg0, int arg1, int arg2, int arg3) {
        return arg0.field290 == null || arg0.field290.length == 0 ? null : new class48(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("ab.z()V")
    public void method871() {
        this.field363 = this.field368;
        this.field359 = method938(this.field368, this.field357);
        this.field356 = method851(this.field368, this.field357);
    }

    @ObfuscatedName("ab.k(I)V")
    public synchronized void method856(int arg0) {
        this.field361 = arg0;
    }

    @ObfuscatedName("ab.r(I)V")
    public synchronized void method857(int arg0) {
        this.method866(arg0 << 6, this.method892());
    }

    @ObfuscatedName("ab.b(I)V")
    public synchronized void method858(int arg0) {
        this.method866(arg0, this.method892());
    }

    @ObfuscatedName("ab.m(II)V")
    public synchronized void method866(int arg0, int arg1) {
        this.field368 = arg0;
        this.field357 = arg1;
        this.field365 = 0;
        this.method871();
    }

    @ObfuscatedName("ab.t()I")
    public synchronized int method859() {
        return this.field368 == Integer.MIN_VALUE ? 0 : this.field368;
    }

    @ObfuscatedName("ab.h()I")
    public synchronized int method892() {
        return this.field357 < 0 ? -1 : this.field357;
    }

    @ObfuscatedName("ab.p(I)V")
    public synchronized void method861(int arg0) {
        int var2 = ((class41) this.field369).field290.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field358 = arg0;
    }

    @ObfuscatedName("ab.o(Z)V")
    public synchronized void method878(boolean arg0) {
        this.field355 = (this.field355 >>> 31) + (this.field355 ^ this.field355 >> 31);
        if (arg0) {
            this.field355 = -this.field355;
        }
    }

    @ObfuscatedName("ab.u()V")
    public void method875() {
        if (this.field365 == 0) {
            return;
        }
        if (this.field368 == Integer.MIN_VALUE) {
            this.field368 = 0;
        }
        this.field365 = 0;
        this.method871();
    }

    @ObfuscatedName("ab.x(II)V")
    public synchronized void method863(int arg0, int arg1) {
        this.method864(arg0, arg1, this.method892());
    }

    @ObfuscatedName("ab.a(III)V")
    public synchronized void method864(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method866(arg1, arg2);
            return;
        }
        int var4 = method938(arg1, arg2);
        int var5 = method851(arg1, arg2);
        if (this.field359 == var4 && this.field356 == var5) {
            this.field365 = 0;
            return;
        }
        int var6 = arg1 - this.field363;
        if (this.field363 - arg1 > var6) {
            var6 = this.field363 - arg1;
        }
        if (var4 - this.field359 > var6) {
            var6 = var4 - this.field359;
        }
        if (this.field359 - var4 > var6) {
            var6 = this.field359 - var4;
        }
        if (var5 - this.field356 > var6) {
            var6 = var5 - this.field356;
        }
        if (this.field356 - var5 > var6) {
            var6 = this.field356 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field365 = arg0;
        this.field368 = arg1;
        this.field357 = arg2;
        this.field366 = (arg1 - this.field363) / arg0;
        this.field360 = (var4 - this.field359) / arg0;
        this.field354 = (var5 - this.field356) / arg0;
    }

    @ObfuscatedName("ab.q(I)V")
    public synchronized void method865(int arg0) {
        if (arg0 == 0) {
            this.method858(0);
            this.method7431();
        } else if (this.field359 == 0 && this.field356 == 0) {
            this.field365 = 0;
            this.field368 = 0;
            this.field363 = 0;
            this.method7431();
        } else {
            int var2 = -this.field363;
            if (this.field363 > var2) {
                var2 = this.field363;
            }
            if (-this.field359 > var2) {
                var2 = -this.field359;
            }
            if (this.field359 > var2) {
                var2 = this.field359;
            }
            if (-this.field356 > var2) {
                var2 = -this.field356;
            }
            if (this.field356 > var2) {
                var2 = this.field356;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field365 = arg0;
            this.field368 = Integer.MIN_VALUE;
            this.field366 = -this.field363 / arg0;
            this.field360 = -this.field359 / arg0;
            this.field354 = -this.field356 / arg0;
        }
    }

    @ObfuscatedName("ab.d(I)V")
    public synchronized void method971(int arg0) {
        if (this.field355 < 0) {
            this.field355 = -arg0;
        } else {
            this.field355 = arg0;
        }
    }

    @ObfuscatedName("ab.e()I")
    public synchronized int method937() {
        return this.field355 < 0 ? -this.field355 : this.field355;
    }

    @ObfuscatedName("ab.g()Z")
    public boolean method867() {
        return this.field358 < 0 || this.field358 >= ((class41) this.field369).field290.length << 8;
    }

    @ObfuscatedName("ab.y()Z")
    public boolean method868() {
        return this.field365 != 0;
    }

    @ObfuscatedName("ab.j()Lan;")
    public class49 method714() {
        return null;
    }

    @ObfuscatedName("ab.i()Lan;")
    public class49 method699() {
        return null;
    }

    @ObfuscatedName("ab.n()I")
    public int method702() {
        return this.field368 == 0 && this.field365 == 0 ? 0 : 1;
    }

    @ObfuscatedName("ab.l([III)V")
    public synchronized void method710(int[] arg0, int arg1, int arg2) {
        if (this.field368 == 0 && this.field365 == 0) {
            this.method703(arg2);
            return;
        }
        class41 var4 = (class41) this.field369;
        int var5 = this.field362 << 8;
        int var6 = this.field367 << 8;
        int var7 = var4.field290.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field361 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field358 < 0) {
            if (this.field355 <= 0) {
                this.method875();
                this.method7431();
                return;
            }
            this.field358 = 0;
        }
        if (this.field358 >= var7) {
            if (this.field355 >= 0) {
                this.method875();
                this.method7431();
                return;
            }
            this.field358 = var7 - 1;
        }
        if (this.field361 >= 0) {
            if (this.field361 > 0) {
                if (this.field364) {
                    label131: {
                        if (this.field355 < 0) {
                            var9 = this.method922(arg0, arg1, var5, var10, var4.field290[this.field362]);
                            if (this.field358 >= var5) {
                                return;
                            }
                            this.field358 = var5 + var5 - 1 - this.field358;
                            this.field355 = -this.field355;
                            if (--this.field361 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method872(arg0, var9, var6, var10, var4.field290[this.field367 - 1]);
                            if (this.field358 < var6) {
                                return;
                            }
                            this.field358 = var6 + var6 - 1 - this.field358;
                            this.field355 = -this.field355;
                            if (--this.field361 == 0) {
                                break;
                            }
                            var9 = this.method922(arg0, var9, var5, var10, var4.field290[this.field362]);
                            if (this.field358 >= var5) {
                                return;
                            }
                            this.field358 = var5 + var5 - 1 - this.field358;
                            this.field355 = -this.field355;
                        } while (--this.field361 != 0);
                    }
                } else if (this.field355 < 0) {
                    while (true) {
                        var9 = this.method922(arg0, var9, var5, var10, var4.field290[this.field367 - 1]);
                        if (this.field358 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field358) / var8;
                        if (var12 >= this.field361) {
                            this.field358 += this.field361 * var8;
                            this.field361 = 0;
                            break;
                        }
                        this.field358 += var8 * var12;
                        this.field361 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method872(arg0, var9, var6, var10, var4.field290[this.field362]);
                        if (this.field358 < var6) {
                            return;
                        }
                        int var13 = (this.field358 - var5) / var8;
                        if (var13 >= this.field361) {
                            this.field358 -= this.field361 * var8;
                            this.field361 = 0;
                            break;
                        }
                        this.field358 -= var8 * var13;
                        this.field361 -= var13;
                    }
                }
            }
            if (this.field355 < 0) {
                this.method922(arg0, var9, 0, var10, 0);
                if (this.field358 < 0) {
                    this.field358 = -1;
                    this.method875();
                    this.method7431();
                }
            } else {
                this.method872(arg0, var9, var7, var10, 0);
                if (this.field358 >= var7) {
                    this.field358 = var7;
                    this.method875();
                    this.method7431();
                }
            }
        } else if (this.field364) {
            if (this.field355 < 0) {
                var9 = this.method922(arg0, arg1, var5, var10, var4.field290[this.field362]);
                if (this.field358 >= var5) {
                    return;
                }
                this.field358 = var5 + var5 - 1 - this.field358;
                this.field355 = -this.field355;
            }
            while (true) {
                int var11 = this.method872(arg0, var9, var6, var10, var4.field290[this.field367 - 1]);
                if (this.field358 < var6) {
                    return;
                }
                this.field358 = var6 + var6 - 1 - this.field358;
                this.field355 = -this.field355;
                var9 = this.method922(arg0, var11, var5, var10, var4.field290[this.field362]);
                if (this.field358 >= var5) {
                    return;
                }
                this.field358 = var5 + var5 - 1 - this.field358;
                this.field355 = -this.field355;
            }
        } else if (this.field355 < 0) {
            while (true) {
                var9 = this.method922(arg0, var9, var5, var10, var4.field290[this.field367 - 1]);
                if (this.field358 >= var5) {
                    return;
                }
                this.field358 = var6 - 1 - (var6 - 1 - this.field358) % var8;
            }
        } else {
            while (true) {
                var9 = this.method872(arg0, var9, var6, var10, var4.field290[this.field362]);
                if (this.field358 < var6) {
                    return;
                }
                this.field358 = (this.field358 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("ab.c(I)V")
    public synchronized void method703(int arg0) {
        if (this.field365 > 0) {
            if (arg0 >= this.field365) {
                if (this.field368 == Integer.MIN_VALUE) {
                    this.field368 = 0;
                    this.field356 = 0;
                    this.field359 = 0;
                    this.field363 = 0;
                    this.method7431();
                    arg0 = this.field365;
                }
                this.field365 = 0;
                this.method871();
            } else {
                this.field363 += this.field366 * arg0;
                this.field359 += this.field360 * arg0;
                this.field356 += this.field354 * arg0;
                this.field365 -= arg0;
            }
        }
        class41 var2 = (class41) this.field369;
        int var3 = this.field362 << 8;
        int var4 = this.field367 << 8;
        int var5 = var2.field290.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field361 = 0;
        }
        if (this.field358 < 0) {
            if (this.field355 <= 0) {
                this.method875();
                this.method7431();
                return;
            }
            this.field358 = 0;
        }
        if (this.field358 >= var5) {
            if (this.field355 >= 0) {
                this.method875();
                this.method7431();
                return;
            }
            this.field358 = var5 - 1;
        }
        this.field358 += this.field355 * arg0;
        if (this.field361 >= 0) {
            if (this.field361 > 0) {
                if (this.field364) {
                    label121: {
                        if (this.field355 < 0) {
                            if (this.field358 >= var3) {
                                return;
                            }
                            this.field358 = var3 + var3 - 1 - this.field358;
                            this.field355 = -this.field355;
                            if (--this.field361 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field358 < var4) {
                                return;
                            }
                            this.field358 = var4 + var4 - 1 - this.field358;
                            this.field355 = -this.field355;
                            if (--this.field361 == 0) {
                                break;
                            }
                            if (this.field358 >= var3) {
                                return;
                            }
                            this.field358 = var3 + var3 - 1 - this.field358;
                            this.field355 = -this.field355;
                        } while (--this.field361 != 0);
                    }
                } else {
                    label153: {
                        if (this.field355 < 0) {
                            if (this.field358 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field358) / var6;
                            if (var7 >= this.field361) {
                                this.field358 += this.field361 * var6;
                                this.field361 = 0;
                                break label153;
                            }
                            this.field358 += var6 * var7;
                            this.field361 -= var7;
                        } else if (this.field358 >= var4) {
                            int var8 = (this.field358 - var3) / var6;
                            if (var8 >= this.field361) {
                                this.field358 -= this.field361 * var6;
                                this.field361 = 0;
                                break label153;
                            }
                            this.field358 -= var6 * var8;
                            this.field361 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field355 < 0) {
                if (this.field358 < 0) {
                    this.field358 = -1;
                    this.method875();
                    this.method7431();
                }
            } else if (this.field358 >= var5) {
                this.field358 = var5;
                this.method875();
                this.method7431();
            }
        } else if (this.field364) {
            if (this.field355 < 0) {
                if (this.field358 >= var3) {
                    return;
                }
                this.field358 = var3 + var3 - 1 - this.field358;
                this.field355 = -this.field355;
            }
            while (this.field358 >= var4) {
                this.field358 = var4 + var4 - 1 - this.field358;
                this.field355 = -this.field355;
                if (this.field358 >= var3) {
                    return;
                }
                this.field358 = var3 + var3 - 1 - this.field358;
                this.field355 = -this.field355;
            }
        } else if (this.field355 < 0) {
            if (this.field358 >= var3) {
                return;
            }
            this.field358 = var4 - 1 - (var4 - 1 - this.field358) % var6;
        } else if (this.field358 >= var4) {
            this.field358 = (this.field358 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("ab.ax([IIIII)I")
    public int method872(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field365 > 0) {
                int var6 = this.field365 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field365 += arg1;
                if (this.field355 == 256 && (this.field358 & 0xFF) == 0) {
                    if (Statics.field321) {
                        arg1 = method883(0, ((class41) this.field369).field290, arg0, this.field358, arg1, this.field359, this.field356, this.field360, this.field354, 0, var6, arg2, this);
                    } else {
                        arg1 = method882(((class41) this.field369).field290, arg0, this.field358, arg1, this.field363, this.field366, 0, var6, arg2, this);
                    }
                } else if (Statics.field321) {
                    arg1 = method945(0, 0, ((class41) this.field369).field290, arg0, this.field358, arg1, this.field359, this.field356, this.field360, this.field354, 0, var6, arg2, this, this.field355, arg4);
                } else {
                    arg1 = method886(0, 0, ((class41) this.field369).field290, arg0, this.field358, arg1, this.field363, this.field366, 0, var6, arg2, this, this.field355, arg4);
                }
                this.field365 -= arg1;
                if (this.field365 != 0) {
                    return arg1;
                }
                if (!this.method916()) {
                    continue;
                }
                return arg3;
            }
            if (this.field355 == 256 && (this.field358 & 0xFF) == 0) {
                if (Statics.field321) {
                    return method853(0, ((class41) this.field369).field290, arg0, this.field358, arg1, this.field359, this.field356, 0, arg3, arg2, this);
                }
                return method884(((class41) this.field369).field290, arg0, this.field358, arg1, this.field363, 0, arg3, arg2, this);
            }
            if (Statics.field321) {
                return method879(0, 0, ((class41) this.field369).field290, arg0, this.field358, arg1, this.field359, this.field356, 0, arg3, arg2, this, this.field355, arg4);
            }
            return method924(0, 0, ((class41) this.field369).field290, arg0, this.field358, arg1, this.field363, 0, arg3, arg2, this, this.field355, arg4);
        }
    }

    @ObfuscatedName("ab.az([IIIII)I")
    public int method922(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field365 > 0) {
                int var6 = this.field365 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field365 += arg1;
                if (this.field355 == -256 && (this.field358 & 0xFF) == 0) {
                    if (Statics.field321) {
                        arg1 = method885(0, ((class41) this.field369).field290, arg0, this.field358, arg1, this.field359, this.field356, this.field360, this.field354, 0, var6, arg2, this);
                    } else {
                        arg1 = method959(((class41) this.field369).field290, arg0, this.field358, arg1, this.field363, this.field366, 0, var6, arg2, this);
                    }
                } else if (Statics.field321) {
                    arg1 = method889(0, 0, ((class41) this.field369).field290, arg0, this.field358, arg1, this.field359, this.field356, this.field360, this.field354, 0, var6, arg2, this, this.field355, arg4);
                } else {
                    arg1 = method888(0, 0, ((class41) this.field369).field290, arg0, this.field358, arg1, this.field363, this.field366, 0, var6, arg2, this, this.field355, arg4);
                }
                this.field365 -= arg1;
                if (this.field365 != 0) {
                    return arg1;
                }
                if (!this.method916()) {
                    continue;
                }
                return arg3;
            }
            if (this.field355 == -256 && (this.field358 & 0xFF) == 0) {
                if (Statics.field321) {
                    return method877(0, ((class41) this.field369).field290, arg0, this.field358, arg1, this.field359, this.field356, 0, arg3, arg2, this);
                }
                return method876(((class41) this.field369).field290, arg0, this.field358, arg1, this.field363, 0, arg3, arg2, this);
            }
            if (Statics.field321) {
                return method881(0, 0, ((class41) this.field369).field290, arg0, this.field358, arg1, this.field359, this.field356, 0, arg3, arg2, this, this.field355, arg4);
            }
            return method918(0, 0, ((class41) this.field369).field290, arg0, this.field358, arg1, this.field363, 0, arg3, arg2, this, this.field355, arg4);
        }
    }

    @ObfuscatedName("ab.ap()Z")
    public boolean method916() {
        int var1 = this.field368;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method938(var1, this.field357);
            var2 = method851(var1, this.field357);
        }
        if (this.field363 != var1 || this.field359 != var3 || this.field356 != var2) {
            if (this.field363 < var1) {
                this.field366 = 1;
                this.field365 = var1 - this.field363;
            } else if (this.field363 > var1) {
                this.field366 = -1;
                this.field365 = this.field363 - var1;
            } else {
                this.field366 = 0;
            }
            if (this.field359 < var3) {
                this.field360 = 1;
                if (this.field365 == 0 || this.field365 > var3 - this.field359) {
                    this.field365 = var3 - this.field359;
                }
            } else if (this.field359 > var3) {
                this.field360 = -1;
                if (this.field365 == 0 || this.field365 > this.field359 - var3) {
                    this.field365 = this.field359 - var3;
                }
            } else {
                this.field360 = 0;
            }
            if (this.field356 < var2) {
                this.field354 = 1;
                if (this.field365 == 0 || this.field365 > var2 - this.field356) {
                    this.field365 = var2 - this.field356;
                }
            } else if (this.field356 > var2) {
                this.field354 = -1;
                if (this.field365 == 0 || this.field365 > this.field356 - var2) {
                    this.field365 = this.field356 - var2;
                }
            } else {
                this.field354 = 0;
            }
            return false;
        } else if (this.field368 == Integer.MIN_VALUE) {
            this.field368 = 0;
            this.field356 = 0;
            this.field359 = 0;
            this.field363 = 0;
            this.method7431();
            return true;
        } else {
            this.method871();
            return false;
        }
    }

    @ObfuscatedName("ab.aq([B[IIIIIIILab;)I")
    public static int method884(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class48 arg8) {
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
        arg8.field358 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("ab.ak(I[B[IIIIIIIILab;)I")
    public static int method853(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class48 arg10) {
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
        arg10.field358 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("ab.au([B[IIIIIIILab;)I")
    public static int method876(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class48 arg8) {
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
        arg8.field358 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("ab.ae(I[B[IIIIIIIILab;)I")
    public static int method877(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class48 arg10) {
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
        arg10.field358 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("ab.ah(II[B[IIIIIIILab;II)I")
    public static int method924(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class48 arg10, int arg11, int arg12) {
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
        arg10.field358 = arg4;
        return arg5;
    }

    @ObfuscatedName("ab.ad(II[B[IIIIIIIILab;II)I")
    public static int method879(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class48 arg11, int arg12, int arg13) {
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
        arg11.field358 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("ab.ab(II[B[IIIIIIILab;II)I")
    public static int method918(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class48 arg10, int arg11, int arg12) {
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
        arg10.field358 = arg4;
        return arg5;
    }

    @ObfuscatedName("ab.an(II[B[IIIIIIIILab;II)I")
    public static int method881(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class48 arg11, int arg12, int arg13) {
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
        arg11.field358 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("ab.am([B[IIIIIIIILab;)I")
    public static int method882(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class48 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field359 += (var14 - arg3) * arg9.field360;
        arg9.field356 += (var14 - arg3) * arg9.field354;
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
        arg9.field363 = var12 >> 2;
        arg9.field358 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("ab.as(I[B[IIIIIIIIIILab;)I")
    public static int method883(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class48 arg12) {
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
        arg12.field363 += (var19 - arg4) * arg12.field366;
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
        arg12.field359 = var15 >> 2;
        arg12.field356 = var16 >> 2;
        arg12.field358 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("ab.ao([B[IIIIIIIILab;)I")
    public static int method959(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class48 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field359 += (var14 - arg3) * arg9.field360;
        arg9.field356 += (var14 - arg3) * arg9.field354;
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
        arg9.field363 = var12 >> 2;
        arg9.field358 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("ab.bj(I[B[IIIIIIIIIILab;)I")
    public static int method885(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class48 arg12) {
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
        arg12.field363 += (var19 - arg4) * arg12.field366;
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
        arg12.field359 = var15 >> 2;
        arg12.field356 = var16 >> 2;
        arg12.field358 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("ab.bf(II[B[IIIIIIIILab;II)I")
    public static int method886(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class48 arg11, int arg12, int arg13) {
        arg11.field359 -= arg11.field360 * arg5;
        arg11.field356 -= arg11.field354 * arg5;
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
        arg11.field359 += arg11.field360 * arg5;
        arg11.field356 += arg11.field354 * arg5;
        arg11.field363 = arg6;
        arg11.field358 = arg4;
        return arg5;
    }

    @ObfuscatedName("ab.bz(II[B[IIIIIIIIIILab;II)I")
    public static int method945(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class48 arg13, int arg14, int arg15) {
        arg13.field363 -= arg13.field366 * arg5;
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
        arg13.field363 += arg13.field366 * var27;
        arg13.field359 = arg6;
        arg13.field356 = arg7;
        arg13.field358 = arg4;
        return var27;
    }

    @ObfuscatedName("ab.br(II[B[IIIIIIIILab;II)I")
    public static int method888(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class48 arg11, int arg12, int arg13) {
        arg11.field359 -= arg11.field360 * arg5;
        arg11.field356 -= arg11.field354 * arg5;
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
        arg11.field359 += arg11.field360 * arg5;
        arg11.field356 += arg11.field354 * arg5;
        arg11.field363 = arg6;
        arg11.field358 = arg4;
        return arg5;
    }

    @ObfuscatedName("ab.bm(II[B[IIIIIIIIIILab;II)I")
    public static int method889(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class48 arg13, int arg14, int arg15) {
        arg13.field363 -= arg13.field366 * arg5;
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
        arg13.field363 += arg13.field366 * var26;
        arg13.field359 = arg6;
        arg13.field356 = arg7;
        arg13.field358 = arg4;
        return var26;
    }
}

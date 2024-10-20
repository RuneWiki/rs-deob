package deob;

@ObfuscatedName("ar")
public class class49 extends class50 {

    @ObfuscatedName("ar.a")
    public int field361;

    @ObfuscatedName("ar.f")
    public int field350;

    @ObfuscatedName("ar.c")
    public int field351;

    @ObfuscatedName("ar.x")
    public int field352;

    @ObfuscatedName("ar.h")
    public int field353;

    @ObfuscatedName("ar.j")
    public int field354;

    @ObfuscatedName("ar.y")
    public int field355;

    @ObfuscatedName("ar.d")
    public int field349;

    @ObfuscatedName("ar.n")
    public int field357;

    @ObfuscatedName("ar.r")
    public int field358;

    @ObfuscatedName("ar.l")
    public boolean field362;

    @ObfuscatedName("ar.s")
    public int field360;

    @ObfuscatedName("ar.p")
    public int field359;

    @ObfuscatedName("ar.b")
    public int field356;

    @ObfuscatedName("ar.o")
    public int field363;

    @ObfuscatedName("ar.a(II)I")
    public static int method972(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("ar.f(II)I")
    public static int method978(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("ar.ae()I")
    public int method859() {
        int var1 = this.field353 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field349 == 0) {
            var2 -= this.field361 * var2 / (((class42) this.field366).field282.length << 8);
        } else if (this.field349 >= 0) {
            var2 -= this.field357 * var2 / ((class42) this.field366).field282.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class49(class42 arg0, int arg1, int arg2) {
        this.field366 = arg0;
        this.field357 = arg0.field283;
        this.field358 = arg0.field284;
        this.field362 = arg0.field285;
        this.field350 = arg1;
        this.field351 = arg2;
        this.field352 = 8192;
        this.field361 = 0;
        this.method864();
    }

    public class49(class42 arg0, int arg1, int arg2, int arg3) {
        this.field366 = arg0;
        this.field357 = arg0.field283;
        this.field358 = arg0.field284;
        this.field362 = arg0.field285;
        this.field350 = arg1;
        this.field351 = arg2;
        this.field352 = arg3;
        this.field361 = 0;
        this.method864();
    }

    @ObfuscatedName("ar.c(Lam;II)Lar;")
    public static class49 method881(class42 arg0, int arg1, int arg2) {
        return arg0.field282 == null || arg0.field282.length == 0 ? null : new class49(arg0, (int) ((long) arg0.field281 * 256L * (long) arg1 / (long) (Statics.field338 * 100)), arg2 << 6);
    }

    @ObfuscatedName("ar.x(Lam;III)Lar;")
    public static class49 method863(class42 arg0, int arg1, int arg2, int arg3) {
        return arg0.field282 == null || arg0.field282.length == 0 ? null : new class49(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("ar.h()V")
    public void method864() {
        this.field353 = this.field351;
        this.field354 = method972(this.field351, this.field352);
        this.field355 = method978(this.field351, this.field352);
    }

    @ObfuscatedName("ar.r(I)V")
    public synchronized void method865(int arg0) {
        this.field349 = arg0;
    }

    @ObfuscatedName("ar.s(I)V")
    public synchronized void method866(int arg0) {
        this.method889(arg0 << 6, this.method870());
    }

    @ObfuscatedName("ar.p(I)V")
    public synchronized void method935(int arg0) {
        this.method889(arg0, this.method870());
    }

    @ObfuscatedName("ar.b(II)V")
    public synchronized void method889(int arg0, int arg1) {
        this.field351 = arg0;
        this.field352 = arg1;
        this.field360 = 0;
        this.method864();
    }

    @ObfuscatedName("ar.o()I")
    public synchronized int method902() {
        return this.field351 == Integer.MIN_VALUE ? 0 : this.field351;
    }

    @ObfuscatedName("ar.u()I")
    public synchronized int method870() {
        return this.field352 < 0 ? -1 : this.field352;
    }

    @ObfuscatedName("ar.z(I)V")
    public synchronized void method969(int arg0) {
        int var2 = ((class42) this.field366).field282.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field361 = arg0;
    }

    @ObfuscatedName("ar.t(Z)V")
    public synchronized void method872(boolean arg0) {
        this.field350 = (this.field350 >>> 31) + (this.field350 ^ this.field350 >> 31);
        if (arg0) {
            this.field350 = -this.field350;
        }
    }

    @ObfuscatedName("ar.w()V")
    public void method873() {
        if (this.field360 == 0) {
            return;
        }
        if (this.field351 == Integer.MIN_VALUE) {
            this.field351 = 0;
        }
        this.field360 = 0;
        this.method864();
    }

    @ObfuscatedName("ar.m(II)V")
    public synchronized void method874(int arg0, int arg1) {
        this.method858(arg0, arg1, this.method870());
    }

    @ObfuscatedName("ar.q(III)V")
    public synchronized void method858(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method889(arg1, arg2);
            return;
        }
        int var4 = method972(arg1, arg2);
        int var5 = method978(arg1, arg2);
        if (this.field354 == var4 && this.field355 == var5) {
            this.field360 = 0;
            return;
        }
        int var6 = arg1 - this.field353;
        if (this.field353 - arg1 > var6) {
            var6 = this.field353 - arg1;
        }
        if (var4 - this.field354 > var6) {
            var6 = var4 - this.field354;
        }
        if (this.field354 - var4 > var6) {
            var6 = this.field354 - var4;
        }
        if (var5 - this.field355 > var6) {
            var6 = var5 - this.field355;
        }
        if (this.field355 - var5 > var6) {
            var6 = this.field355 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field360 = arg0;
        this.field351 = arg1;
        this.field352 = arg2;
        this.field359 = (arg1 - this.field353) / arg0;
        this.field356 = (var4 - this.field354) / arg0;
        this.field363 = (var5 - this.field355) / arg0;
    }

    @ObfuscatedName("ar.i(I)V")
    public synchronized void method867(int arg0) {
        if (arg0 == 0) {
            this.method935(0);
            this.method7170();
        } else if (this.field354 == 0 && this.field355 == 0) {
            this.field360 = 0;
            this.field351 = 0;
            this.field353 = 0;
            this.method7170();
        } else {
            int var2 = -this.field353;
            if (this.field353 > var2) {
                var2 = this.field353;
            }
            if (-this.field354 > var2) {
                var2 = -this.field354;
            }
            if (this.field354 > var2) {
                var2 = this.field354;
            }
            if (-this.field355 > var2) {
                var2 = -this.field355;
            }
            if (this.field355 > var2) {
                var2 = this.field355;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field360 = arg0;
            this.field351 = Integer.MIN_VALUE;
            this.field359 = -this.field353 / arg0;
            this.field356 = -this.field354 / arg0;
            this.field363 = -this.field355 / arg0;
        }
    }

    @ObfuscatedName("ar.e(I)V")
    public synchronized void method909(int arg0) {
        if (this.field350 < 0) {
            this.field350 = -arg0;
        } else {
            this.field350 = arg0;
        }
    }

    @ObfuscatedName("ar.ao()I")
    public synchronized int method878() {
        return this.field350 < 0 ? -this.field350 : this.field350;
    }

    @ObfuscatedName("ar.ac()Z")
    public boolean method879() {
        return this.field361 < 0 || this.field361 >= ((class42) this.field366).field282.length << 8;
    }

    @ObfuscatedName("ar.af()Z")
    public boolean method869() {
        return this.field360 != 0;
    }

    @ObfuscatedName("ar.j()Lay;")
    public class50 method718() {
        return null;
    }

    @ObfuscatedName("ar.y()Lay;")
    public class50 method719() {
        return null;
    }

    @ObfuscatedName("ar.d()I")
    public int method720() {
        return this.field351 == 0 && this.field360 == 0 ? 0 : 1;
    }

    @ObfuscatedName("ar.n([III)V")
    public synchronized void method721(int[] arg0, int arg1, int arg2) {
        if (this.field351 == 0 && this.field360 == 0) {
            this.method725(arg2);
            return;
        }
        class42 var4 = (class42) this.field366;
        int var5 = this.field357 << 8;
        int var6 = this.field358 << 8;
        int var7 = var4.field282.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field349 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field361 < 0) {
            if (this.field350 <= 0) {
                this.method873();
                this.method7170();
                return;
            }
            this.field361 = 0;
        }
        if (this.field361 >= var7) {
            if (this.field350 >= 0) {
                this.method873();
                this.method7170();
                return;
            }
            this.field361 = var7 - 1;
        }
        if (this.field349 >= 0) {
            if (this.field349 > 0) {
                if (this.field362) {
                    label131: {
                        if (this.field350 < 0) {
                            var9 = this.method883(arg0, arg1, var5, var10, var4.field282[this.field357]);
                            if (this.field361 >= var5) {
                                return;
                            }
                            this.field361 = var5 + var5 - 1 - this.field361;
                            this.field350 = -this.field350;
                            if (--this.field349 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method882(arg0, var9, var6, var10, var4.field282[this.field358 - 1]);
                            if (this.field361 < var6) {
                                return;
                            }
                            this.field361 = var6 + var6 - 1 - this.field361;
                            this.field350 = -this.field350;
                            if (--this.field349 == 0) {
                                break;
                            }
                            var9 = this.method883(arg0, var9, var5, var10, var4.field282[this.field357]);
                            if (this.field361 >= var5) {
                                return;
                            }
                            this.field361 = var5 + var5 - 1 - this.field361;
                            this.field350 = -this.field350;
                        } while (--this.field349 != 0);
                    }
                } else if (this.field350 < 0) {
                    while (true) {
                        var9 = this.method883(arg0, var9, var5, var10, var4.field282[this.field358 - 1]);
                        if (this.field361 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field361) / var8;
                        if (var12 >= this.field349) {
                            this.field361 += this.field349 * var8;
                            this.field349 = 0;
                            break;
                        }
                        this.field361 += var8 * var12;
                        this.field349 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method882(arg0, var9, var6, var10, var4.field282[this.field357]);
                        if (this.field361 < var6) {
                            return;
                        }
                        int var13 = (this.field361 - var5) / var8;
                        if (var13 >= this.field349) {
                            this.field361 -= this.field349 * var8;
                            this.field349 = 0;
                            break;
                        }
                        this.field361 -= var8 * var13;
                        this.field349 -= var13;
                    }
                }
            }
            if (this.field350 < 0) {
                this.method883(arg0, var9, 0, var10, 0);
                if (this.field361 < 0) {
                    this.field361 = -1;
                    this.method873();
                    this.method7170();
                }
            } else {
                this.method882(arg0, var9, var7, var10, 0);
                if (this.field361 >= var7) {
                    this.field361 = var7;
                    this.method873();
                    this.method7170();
                }
            }
        } else if (this.field362) {
            if (this.field350 < 0) {
                var9 = this.method883(arg0, arg1, var5, var10, var4.field282[this.field357]);
                if (this.field361 >= var5) {
                    return;
                }
                this.field361 = var5 + var5 - 1 - this.field361;
                this.field350 = -this.field350;
            }
            while (true) {
                int var11 = this.method882(arg0, var9, var6, var10, var4.field282[this.field358 - 1]);
                if (this.field361 < var6) {
                    return;
                }
                this.field361 = var6 + var6 - 1 - this.field361;
                this.field350 = -this.field350;
                var9 = this.method883(arg0, var11, var5, var10, var4.field282[this.field357]);
                if (this.field361 >= var5) {
                    return;
                }
                this.field361 = var5 + var5 - 1 - this.field361;
                this.field350 = -this.field350;
            }
        } else if (this.field350 < 0) {
            while (true) {
                var9 = this.method883(arg0, var9, var5, var10, var4.field282[this.field358 - 1]);
                if (this.field361 >= var5) {
                    return;
                }
                this.field361 = var6 - 1 - (var6 - 1 - this.field361) % var8;
            }
        } else {
            while (true) {
                var9 = this.method882(arg0, var9, var6, var10, var4.field282[this.field357]);
                if (this.field361 < var6) {
                    return;
                }
                this.field361 = (this.field361 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("ar.l(I)V")
    public synchronized void method725(int arg0) {
        if (this.field360 > 0) {
            if (arg0 >= this.field360) {
                if (this.field351 == Integer.MIN_VALUE) {
                    this.field351 = 0;
                    this.field355 = 0;
                    this.field354 = 0;
                    this.field353 = 0;
                    this.method7170();
                    arg0 = this.field360;
                }
                this.field360 = 0;
                this.method864();
            } else {
                this.field353 += this.field359 * arg0;
                this.field354 += this.field356 * arg0;
                this.field355 += this.field363 * arg0;
                this.field360 -= arg0;
            }
        }
        class42 var2 = (class42) this.field366;
        int var3 = this.field357 << 8;
        int var4 = this.field358 << 8;
        int var5 = var2.field282.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field349 = 0;
        }
        if (this.field361 < 0) {
            if (this.field350 <= 0) {
                this.method873();
                this.method7170();
                return;
            }
            this.field361 = 0;
        }
        if (this.field361 >= var5) {
            if (this.field350 >= 0) {
                this.method873();
                this.method7170();
                return;
            }
            this.field361 = var5 - 1;
        }
        this.field361 += this.field350 * arg0;
        if (this.field349 >= 0) {
            if (this.field349 > 0) {
                if (this.field362) {
                    label121: {
                        if (this.field350 < 0) {
                            if (this.field361 >= var3) {
                                return;
                            }
                            this.field361 = var3 + var3 - 1 - this.field361;
                            this.field350 = -this.field350;
                            if (--this.field349 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field361 < var4) {
                                return;
                            }
                            this.field361 = var4 + var4 - 1 - this.field361;
                            this.field350 = -this.field350;
                            if (--this.field349 == 0) {
                                break;
                            }
                            if (this.field361 >= var3) {
                                return;
                            }
                            this.field361 = var3 + var3 - 1 - this.field361;
                            this.field350 = -this.field350;
                        } while (--this.field349 != 0);
                    }
                } else {
                    label153: {
                        if (this.field350 < 0) {
                            if (this.field361 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field361) / var6;
                            if (var7 >= this.field349) {
                                this.field361 += this.field349 * var6;
                                this.field349 = 0;
                                break label153;
                            }
                            this.field361 += var6 * var7;
                            this.field349 -= var7;
                        } else if (this.field361 >= var4) {
                            int var8 = (this.field361 - var3) / var6;
                            if (var8 >= this.field349) {
                                this.field361 -= this.field349 * var6;
                                this.field349 = 0;
                                break label153;
                            }
                            this.field361 -= var6 * var8;
                            this.field349 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field350 < 0) {
                if (this.field361 < 0) {
                    this.field361 = -1;
                    this.method873();
                    this.method7170();
                }
            } else if (this.field361 >= var5) {
                this.field361 = var5;
                this.method873();
                this.method7170();
            }
        } else if (this.field362) {
            if (this.field350 < 0) {
                if (this.field361 >= var3) {
                    return;
                }
                this.field361 = var3 + var3 - 1 - this.field361;
                this.field350 = -this.field350;
            }
            while (this.field361 >= var4) {
                this.field361 = var4 + var4 - 1 - this.field361;
                this.field350 = -this.field350;
                if (this.field361 >= var3) {
                    return;
                }
                this.field361 = var3 + var3 - 1 - this.field361;
                this.field350 = -this.field350;
            }
        } else if (this.field350 < 0) {
            if (this.field361 >= var3) {
                return;
            }
            this.field361 = var4 - 1 - (var4 - 1 - this.field361) % var6;
        } else if (this.field361 >= var4) {
            this.field361 = (this.field361 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("ar.av([IIIII)I")
    public int method882(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field360 > 0) {
                int var6 = this.field360 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field360 += arg1;
                if (this.field350 == 256 && (this.field361 & 0xFF) == 0) {
                    if (Statics.field1745) {
                        arg1 = method894(0, ((class42) this.field366).field282, arg0, this.field361, arg1, this.field354, this.field355, this.field356, this.field363, 0, var6, arg2, this);
                    } else {
                        arg1 = method893(((class42) this.field366).field282, arg0, this.field361, arg1, this.field353, this.field359, 0, var6, arg2, this);
                    }
                } else if (Statics.field1745) {
                    arg1 = method898(0, 0, ((class42) this.field366).field282, arg0, this.field361, arg1, this.field354, this.field355, this.field356, this.field363, 0, var6, arg2, this, this.field350, arg4);
                } else {
                    arg1 = method897(0, 0, ((class42) this.field366).field282, arg0, this.field361, arg1, this.field353, this.field359, 0, var6, arg2, this, this.field350, arg4);
                }
                this.field360 -= arg1;
                if (this.field360 != 0) {
                    return arg1;
                }
                if (!this.method884()) {
                    continue;
                }
                return arg3;
            }
            if (this.field350 == 256 && (this.field361 & 0xFF) == 0) {
                if (Statics.field1745) {
                    return method928(0, ((class42) this.field366).field282, arg0, this.field361, arg1, this.field354, this.field355, 0, arg3, arg2, this);
                }
                return method885(((class42) this.field366).field282, arg0, this.field361, arg1, this.field353, 0, arg3, arg2, this);
            }
            if (Statics.field1745) {
                return method871(0, 0, ((class42) this.field366).field282, arg0, this.field361, arg1, this.field354, this.field355, 0, arg3, arg2, this, this.field350, arg4);
            }
            return method948(0, 0, ((class42) this.field366).field282, arg0, this.field361, arg1, this.field353, 0, arg3, arg2, this, this.field350, arg4);
        }
    }

    @ObfuscatedName("ar.ap([IIIII)I")
    public int method883(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field360 > 0) {
                int var6 = this.field360 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field360 += arg1;
                if (this.field350 == -256 && (this.field361 & 0xFF) == 0) {
                    if (Statics.field1745) {
                        arg1 = method896(0, ((class42) this.field366).field282, arg0, this.field361, arg1, this.field354, this.field355, this.field356, this.field363, 0, var6, arg2, this);
                    } else {
                        arg1 = method945(((class42) this.field366).field282, arg0, this.field361, arg1, this.field353, this.field359, 0, var6, arg2, this);
                    }
                } else if (Statics.field1745) {
                    arg1 = method900(0, 0, ((class42) this.field366).field282, arg0, this.field361, arg1, this.field354, this.field355, this.field356, this.field363, 0, var6, arg2, this, this.field350, arg4);
                } else {
                    arg1 = method973(0, 0, ((class42) this.field366).field282, arg0, this.field361, arg1, this.field353, this.field359, 0, var6, arg2, this, this.field350, arg4);
                }
                this.field360 -= arg1;
                if (this.field360 != 0) {
                    return arg1;
                }
                if (!this.method884()) {
                    continue;
                }
                return arg3;
            }
            if (this.field350 == -256 && (this.field361 & 0xFF) == 0) {
                if (Statics.field1745) {
                    return method888(0, ((class42) this.field366).field282, arg0, this.field361, arg1, this.field354, this.field355, 0, arg3, arg2, this);
                }
                return method887(((class42) this.field366).field282, arg0, this.field361, arg1, this.field353, 0, arg3, arg2, this);
            }
            if (Statics.field1745) {
                return method892(0, 0, ((class42) this.field366).field282, arg0, this.field361, arg1, this.field354, this.field355, 0, arg3, arg2, this, this.field350, arg4);
            }
            return method891(0, 0, ((class42) this.field366).field282, arg0, this.field361, arg1, this.field353, 0, arg3, arg2, this, this.field350, arg4);
        }
    }

    @ObfuscatedName("ar.as()Z")
    public boolean method884() {
        int var1 = this.field351;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method972(var1, this.field352);
            var2 = method978(var1, this.field352);
        }
        if (this.field353 != var1 || this.field354 != var3 || this.field355 != var2) {
            if (this.field353 < var1) {
                this.field359 = 1;
                this.field360 = var1 - this.field353;
            } else if (this.field353 > var1) {
                this.field359 = -1;
                this.field360 = this.field353 - var1;
            } else {
                this.field359 = 0;
            }
            if (this.field354 < var3) {
                this.field356 = 1;
                if (this.field360 == 0 || this.field360 > var3 - this.field354) {
                    this.field360 = var3 - this.field354;
                }
            } else if (this.field354 > var3) {
                this.field356 = -1;
                if (this.field360 == 0 || this.field360 > this.field354 - var3) {
                    this.field360 = this.field354 - var3;
                }
            } else {
                this.field356 = 0;
            }
            if (this.field355 < var2) {
                this.field363 = 1;
                if (this.field360 == 0 || this.field360 > var2 - this.field355) {
                    this.field360 = var2 - this.field355;
                }
            } else if (this.field355 > var2) {
                this.field363 = -1;
                if (this.field360 == 0 || this.field360 > this.field355 - var2) {
                    this.field360 = this.field355 - var2;
                }
            } else {
                this.field363 = 0;
            }
            return false;
        } else if (this.field351 == Integer.MIN_VALUE) {
            this.field351 = 0;
            this.field355 = 0;
            this.field354 = 0;
            this.field353 = 0;
            this.method7170();
            return true;
        } else {
            this.method864();
            return false;
        }
    }

    @ObfuscatedName("ar.aq([B[IIIIIIILar;)I")
    public static int method885(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class49 arg8) {
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
        arg8.field361 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("ar.al(I[B[IIIIIIIILar;)I")
    public static int method928(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class49 arg10) {
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
        arg10.field361 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("ar.ag([B[IIIIIIILar;)I")
    public static int method887(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class49 arg8) {
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
        arg8.field361 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("ar.am(I[B[IIIIIIIILar;)I")
    public static int method888(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class49 arg10) {
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
        arg10.field361 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("ar.az(II[B[IIIIIIILar;II)I")
    public static int method948(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class49 arg10, int arg11, int arg12) {
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
        arg10.field361 = arg4;
        return arg5;
    }

    @ObfuscatedName("ar.ab(II[B[IIIIIIIILar;II)I")
    public static int method871(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class49 arg11, int arg12, int arg13) {
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
        arg11.field361 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("ar.ai(II[B[IIIIIIILar;II)I")
    public static int method891(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class49 arg10, int arg11, int arg12) {
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
        arg10.field361 = arg4;
        return arg5;
    }

    @ObfuscatedName("ar.au(II[B[IIIIIIIILar;II)I")
    public static int method892(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class49 arg11, int arg12, int arg13) {
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
        arg11.field361 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("ar.aw([B[IIIIIIIILar;)I")
    public static int method893(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class49 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field354 += (var14 - arg3) * arg9.field356;
        arg9.field355 += (var14 - arg3) * arg9.field363;
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
        arg9.field353 = var12 >> 2;
        arg9.field361 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("ar.at(I[B[IIIIIIIIIILar;)I")
    public static int method894(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class49 arg12) {
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
        arg12.field353 += (var19 - arg4) * arg12.field359;
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
        arg12.field354 = var15 >> 2;
        arg12.field355 = var16 >> 2;
        arg12.field361 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("ar.ar([B[IIIIIIIILar;)I")
    public static int method945(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class49 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field354 += (var14 - arg3) * arg9.field356;
        arg9.field355 += (var14 - arg3) * arg9.field363;
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
        arg9.field353 = var12 >> 2;
        arg9.field361 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("ar.ay(I[B[IIIIIIIIIILar;)I")
    public static int method896(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class49 arg12) {
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
        arg12.field353 += (var19 - arg4) * arg12.field359;
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
        arg12.field354 = var15 >> 2;
        arg12.field355 = var16 >> 2;
        arg12.field361 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("ar.ax(II[B[IIIIIIIILar;II)I")
    public static int method897(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class49 arg11, int arg12, int arg13) {
        arg11.field354 -= arg11.field356 * arg5;
        arg11.field355 -= arg11.field363 * arg5;
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
        arg11.field354 += arg11.field356 * arg5;
        arg11.field355 += arg11.field363 * arg5;
        arg11.field353 = arg6;
        arg11.field361 = arg4;
        return arg5;
    }

    @ObfuscatedName("ar.aa(II[B[IIIIIIIIIILar;II)I")
    public static int method898(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class49 arg13, int arg14, int arg15) {
        arg13.field353 -= arg13.field359 * arg5;
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
        arg13.field353 += arg13.field359 * var27;
        arg13.field354 = arg6;
        arg13.field355 = arg7;
        arg13.field361 = arg4;
        return var27;
    }

    @ObfuscatedName("ar.bx(II[B[IIIIIIIILar;II)I")
    public static int method973(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class49 arg11, int arg12, int arg13) {
        arg11.field354 -= arg11.field356 * arg5;
        arg11.field355 -= arg11.field363 * arg5;
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
        arg11.field354 += arg11.field356 * arg5;
        arg11.field355 += arg11.field363 * arg5;
        arg11.field353 = arg6;
        arg11.field361 = arg4;
        return arg5;
    }

    @ObfuscatedName("ar.bh(II[B[IIIIIIIIIILar;II)I")
    public static int method900(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class49 arg13, int arg14, int arg15) {
        arg13.field353 -= arg13.field359 * arg5;
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
        arg13.field353 += arg13.field359 * var26;
        arg13.field354 = arg6;
        arg13.field355 = arg7;
        arg13.field361 = arg4;
        return var26;
    }
}

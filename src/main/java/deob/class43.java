package deob;

@ObfuscatedName("aj")
public class class43 extends class44 {

    @ObfuscatedName("aj.n")
    public int field324;

    @ObfuscatedName("aj.c")
    public int field332;

    @ObfuscatedName("aj.m")
    public int field321;

    @ObfuscatedName("aj.k")
    public int field320;

    @ObfuscatedName("aj.o")
    public int field319;

    @ObfuscatedName("aj.g")
    public int field331;

    @ObfuscatedName("aj.z")
    public int field325;

    @ObfuscatedName("aj.a")
    public int field326;

    @ObfuscatedName("aj.u")
    public int field327;

    @ObfuscatedName("aj.e")
    public int field322;

    @ObfuscatedName("aj.l")
    public boolean field329;

    @ObfuscatedName("aj.y")
    public int field330;

    @ObfuscatedName("aj.v")
    public int field323;

    @ObfuscatedName("aj.f")
    public int field328;

    @ObfuscatedName("aj.s")
    public int field333;

    @ObfuscatedName("aj.n(II)I")
    public static int method908(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("aj.c(II)I")
    public static int method770(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @ObfuscatedName("aj.ar()I")
    public int method771() {
        int var1 = this.field319 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field326 == 0) {
            var2 -= this.field324 * var2 / (((class36) this.field334).field250.length << 8);
        } else if (this.field326 >= 0) {
            var2 -= this.field327 * var2 / ((class36) this.field334).field250.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    public class43(class36 arg0, int arg1, int arg2) {
        this.field334 = arg0;
        this.field327 = arg0.field254;
        this.field322 = arg0.field253;
        this.field329 = arg0.field251;
        this.field332 = arg1;
        this.field321 = arg2;
        this.field320 = 8192;
        this.field324 = 0;
        this.method784();
    }

    public class43(class36 arg0, int arg1, int arg2, int arg3) {
        this.field334 = arg0;
        this.field327 = arg0.field254;
        this.field322 = arg0.field253;
        this.field329 = arg0.field251;
        this.field332 = arg1;
        this.field321 = arg2;
        this.field320 = arg3;
        this.field324 = 0;
        this.method784();
    }

    @ObfuscatedName("aj.m(Lak;II)Laj;")
    public static class43 method772(class36 arg0, int arg1, int arg2) {
        return arg0.field250 == null || arg0.field250.length == 0 ? null : new class43(arg0, (int) ((long) arg0.field252 * 256L * (long) arg1 / (long) (Statics.field3288 * 100)), arg2 << 6);
    }

    @ObfuscatedName("aj.k(Lak;III)Laj;")
    public static class43 method773(class36 arg0, int arg1, int arg2, int arg3) {
        return arg0.field250 == null || arg0.field250.length == 0 ? null : new class43(arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("aj.o()V")
    public void method784() {
        this.field319 = this.field321;
        this.field331 = method908(this.field321, this.field320);
        this.field325 = method770(this.field321, this.field320);
    }

    @ObfuscatedName("aj.e(I)V")
    public synchronized void method775(int arg0) {
        this.field326 = arg0;
    }

    @ObfuscatedName("aj.y(I)V")
    public synchronized void method776(int arg0) {
        this.method778(arg0 << 6, this.method780());
    }

    @ObfuscatedName("aj.v(I)V")
    public synchronized void method777(int arg0) {
        this.method778(arg0, this.method780());
    }

    @ObfuscatedName("aj.f(II)V")
    public synchronized void method778(int arg0, int arg1) {
        this.field321 = arg0;
        this.field320 = arg1;
        this.field330 = 0;
        this.method784();
    }

    @ObfuscatedName("aj.s()I")
    public synchronized int method779() {
        return this.field321 == Integer.MIN_VALUE ? 0 : this.field321;
    }

    @ObfuscatedName("aj.h()I")
    public synchronized int method780() {
        return this.field320 < 0 ? -1 : this.field320;
    }

    @ObfuscatedName("aj.d(I)V")
    public synchronized void method781(int arg0) {
        int var2 = ((class36) this.field334).field250.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field324 = arg0;
    }

    @ObfuscatedName("aj.q(Z)V")
    public synchronized void method885(boolean arg0) {
        this.field332 = (this.field332 >>> 31) + (this.field332 ^ this.field332 >> 31);
        if (arg0) {
            this.field332 = -this.field332;
        }
    }

    @ObfuscatedName("aj.j()V")
    public void method783() {
        if (this.field330 == 0) {
            return;
        }
        if (this.field321 == Integer.MIN_VALUE) {
            this.field321 = 0;
        }
        this.field330 = 0;
        this.method784();
    }

    @ObfuscatedName("aj.x(II)V")
    public synchronized void method774(int arg0, int arg1) {
        this.method785(arg0, arg1, this.method780());
    }

    @ObfuscatedName("aj.b(III)V")
    public synchronized void method785(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method778(arg1, arg2);
            return;
        }
        int var4 = method908(arg1, arg2);
        int var5 = method770(arg1, arg2);
        if (this.field331 == var4 && this.field325 == var5) {
            this.field330 = 0;
            return;
        }
        int var6 = arg1 - this.field319;
        if (this.field319 - arg1 > var6) {
            var6 = this.field319 - arg1;
        }
        if (var4 - this.field331 > var6) {
            var6 = var4 - this.field331;
        }
        if (this.field331 - var4 > var6) {
            var6 = this.field331 - var4;
        }
        if (var5 - this.field325 > var6) {
            var6 = var5 - this.field325;
        }
        if (this.field325 - var5 > var6) {
            var6 = this.field325 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field330 = arg0;
        this.field321 = arg1;
        this.field320 = arg2;
        this.field323 = (arg1 - this.field319) / arg0;
        this.field328 = (var4 - this.field331) / arg0;
        this.field333 = (var5 - this.field325) / arg0;
    }

    @ObfuscatedName("aj.t(I)V")
    public synchronized void method786(int arg0) {
        if (arg0 == 0) {
            this.method777(0);
            this.method5732();
        } else if (this.field331 == 0 && this.field325 == 0) {
            this.field330 = 0;
            this.field321 = 0;
            this.field319 = 0;
            this.method5732();
        } else {
            int var2 = -this.field319;
            if (this.field319 > var2) {
                var2 = this.field319;
            }
            if (-this.field331 > var2) {
                var2 = -this.field331;
            }
            if (this.field331 > var2) {
                var2 = this.field331;
            }
            if (-this.field325 > var2) {
                var2 = -this.field325;
            }
            if (this.field325 > var2) {
                var2 = this.field325;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field330 = arg0;
            this.field321 = Integer.MIN_VALUE;
            this.field323 = -this.field319 / arg0;
            this.field328 = -this.field331 / arg0;
            this.field333 = -this.field325 / arg0;
        }
    }

    @ObfuscatedName("aj.r(I)V")
    public synchronized void method803(int arg0) {
        if (this.field332 < 0) {
            this.field332 = -arg0;
        } else {
            this.field332 = arg0;
        }
    }

    @ObfuscatedName("aj.p()I")
    public synchronized int method822() {
        return this.field332 < 0 ? -this.field332 : this.field332;
    }

    @ObfuscatedName("aj.w()Z")
    public boolean method823() {
        return this.field324 < 0 || this.field324 >= ((class36) this.field334).field250.length << 8;
    }

    @ObfuscatedName("aj.av()Z")
    public boolean method789() {
        return this.field330 != 0;
    }

    @ObfuscatedName("aj.g()Lap;")
    public class44 method612() {
        return null;
    }

    @ObfuscatedName("aj.z()Lap;")
    public class44 method613() {
        return null;
    }

    @ObfuscatedName("aj.a()I")
    public int method614() {
        return this.field321 == 0 && this.field330 == 0 ? 0 : 1;
    }

    @ObfuscatedName("aj.u([III)V")
    public synchronized void method615(int[] arg0, int arg1, int arg2) {
        if (this.field321 == 0 && this.field330 == 0) {
            this.method641(arg2);
            return;
        }
        class36 var4 = (class36) this.field334;
        int var5 = this.field327 << 8;
        int var6 = this.field322 << 8;
        int var7 = var4.field250.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field326 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field324 < 0) {
            if (this.field332 <= 0) {
                this.method783();
                this.method5732();
                return;
            }
            this.field324 = 0;
        }
        if (this.field324 >= var7) {
            if (this.field332 >= 0) {
                this.method783();
                this.method5732();
                return;
            }
            this.field324 = var7 - 1;
        }
        if (this.field326 >= 0) {
            if (this.field326 > 0) {
                if (this.field329) {
                    label131: {
                        if (this.field332 < 0) {
                            var9 = this.method894(arg0, arg1, var5, var10, var4.field250[this.field327]);
                            if (this.field324 >= var5) {
                                return;
                            }
                            this.field324 = var5 + var5 - 1 - this.field324;
                            this.field332 = -this.field332;
                            if (--this.field326 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method902(arg0, var9, var6, var10, var4.field250[this.field322 - 1]);
                            if (this.field324 < var6) {
                                return;
                            }
                            this.field324 = var6 + var6 - 1 - this.field324;
                            this.field332 = -this.field332;
                            if (--this.field326 == 0) {
                                break;
                            }
                            var9 = this.method894(arg0, var9, var5, var10, var4.field250[this.field327]);
                            if (this.field324 >= var5) {
                                return;
                            }
                            this.field324 = var5 + var5 - 1 - this.field324;
                            this.field332 = -this.field332;
                        } while (--this.field326 != 0);
                    }
                } else if (this.field332 < 0) {
                    while (true) {
                        var9 = this.method894(arg0, var9, var5, var10, var4.field250[this.field322 - 1]);
                        if (this.field324 >= var5) {
                            return;
                        }
                        int var12 = (var6 - 1 - this.field324) / var8;
                        if (var12 >= this.field326) {
                            this.field324 += this.field326 * var8;
                            this.field326 = 0;
                            break;
                        }
                        this.field324 += var8 * var12;
                        this.field326 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method902(arg0, var9, var6, var10, var4.field250[this.field327]);
                        if (this.field324 < var6) {
                            return;
                        }
                        int var13 = (this.field324 - var5) / var8;
                        if (var13 >= this.field326) {
                            this.field324 -= this.field326 * var8;
                            this.field326 = 0;
                            break;
                        }
                        this.field324 -= var8 * var13;
                        this.field326 -= var13;
                    }
                }
            }
            if (this.field332 < 0) {
                this.method894(arg0, var9, 0, var10, 0);
                if (this.field324 < 0) {
                    this.field324 = -1;
                    this.method783();
                    this.method5732();
                }
            } else {
                this.method902(arg0, var9, var7, var10, 0);
                if (this.field324 >= var7) {
                    this.field324 = var7;
                    this.method783();
                    this.method5732();
                }
            }
        } else if (this.field329) {
            if (this.field332 < 0) {
                var9 = this.method894(arg0, arg1, var5, var10, var4.field250[this.field327]);
                if (this.field324 >= var5) {
                    return;
                }
                this.field324 = var5 + var5 - 1 - this.field324;
                this.field332 = -this.field332;
            }
            while (true) {
                int var11 = this.method902(arg0, var9, var6, var10, var4.field250[this.field322 - 1]);
                if (this.field324 < var6) {
                    return;
                }
                this.field324 = var6 + var6 - 1 - this.field324;
                this.field332 = -this.field332;
                var9 = this.method894(arg0, var11, var5, var10, var4.field250[this.field327]);
                if (this.field324 >= var5) {
                    return;
                }
                this.field324 = var5 + var5 - 1 - this.field324;
                this.field332 = -this.field332;
            }
        } else if (this.field332 < 0) {
            while (true) {
                var9 = this.method894(arg0, var9, var5, var10, var4.field250[this.field322 - 1]);
                if (this.field324 >= var5) {
                    return;
                }
                this.field324 = var6 - 1 - (var6 - 1 - this.field324) % var8;
            }
        } else {
            while (true) {
                var9 = this.method902(arg0, var9, var6, var10, var4.field250[this.field327]);
                if (this.field324 < var6) {
                    return;
                }
                this.field324 = (this.field324 - var5) % var8 + var5;
            }
        }
    }

    @ObfuscatedName("aj.l(I)V")
    public synchronized void method641(int arg0) {
        if (this.field330 > 0) {
            if (arg0 >= this.field330) {
                if (this.field321 == Integer.MIN_VALUE) {
                    this.field321 = 0;
                    this.field325 = 0;
                    this.field331 = 0;
                    this.field319 = 0;
                    this.method5732();
                    arg0 = this.field330;
                }
                this.field330 = 0;
                this.method784();
            } else {
                this.field319 += this.field323 * arg0;
                this.field331 += this.field328 * arg0;
                this.field325 += this.field333 * arg0;
                this.field330 -= arg0;
            }
        }
        class36 var2 = (class36) this.field334;
        int var3 = this.field327 << 8;
        int var4 = this.field322 << 8;
        int var5 = var2.field250.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field326 = 0;
        }
        if (this.field324 < 0) {
            if (this.field332 <= 0) {
                this.method783();
                this.method5732();
                return;
            }
            this.field324 = 0;
        }
        if (this.field324 >= var5) {
            if (this.field332 >= 0) {
                this.method783();
                this.method5732();
                return;
            }
            this.field324 = var5 - 1;
        }
        this.field324 += this.field332 * arg0;
        if (this.field326 >= 0) {
            if (this.field326 > 0) {
                if (this.field329) {
                    label121: {
                        if (this.field332 < 0) {
                            if (this.field324 >= var3) {
                                return;
                            }
                            this.field324 = var3 + var3 - 1 - this.field324;
                            this.field332 = -this.field332;
                            if (--this.field326 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field324 < var4) {
                                return;
                            }
                            this.field324 = var4 + var4 - 1 - this.field324;
                            this.field332 = -this.field332;
                            if (--this.field326 == 0) {
                                break;
                            }
                            if (this.field324 >= var3) {
                                return;
                            }
                            this.field324 = var3 + var3 - 1 - this.field324;
                            this.field332 = -this.field332;
                        } while (--this.field326 != 0);
                    }
                } else {
                    label153: {
                        if (this.field332 < 0) {
                            if (this.field324 >= var3) {
                                return;
                            }
                            int var7 = (var4 - 1 - this.field324) / var6;
                            if (var7 >= this.field326) {
                                this.field324 += this.field326 * var6;
                                this.field326 = 0;
                                break label153;
                            }
                            this.field324 += var6 * var7;
                            this.field326 -= var7;
                        } else if (this.field324 >= var4) {
                            int var8 = (this.field324 - var3) / var6;
                            if (var8 >= this.field326) {
                                this.field324 -= this.field326 * var6;
                                this.field326 = 0;
                                break label153;
                            }
                            this.field324 -= var6 * var8;
                            this.field326 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field332 < 0) {
                if (this.field324 < 0) {
                    this.field324 = -1;
                    this.method783();
                    this.method5732();
                }
            } else if (this.field324 >= var5) {
                this.field324 = var5;
                this.method783();
                this.method5732();
            }
        } else if (this.field329) {
            if (this.field332 < 0) {
                if (this.field324 >= var3) {
                    return;
                }
                this.field324 = var3 + var3 - 1 - this.field324;
                this.field332 = -this.field332;
            }
            while (this.field324 >= var4) {
                this.field324 = var4 + var4 - 1 - this.field324;
                this.field332 = -this.field332;
                if (this.field324 >= var3) {
                    return;
                }
                this.field324 = var3 + var3 - 1 - this.field324;
                this.field332 = -this.field332;
            }
        } else if (this.field332 < 0) {
            if (this.field324 >= var3) {
                return;
            }
            this.field324 = var4 - 1 - (var4 - 1 - this.field324) % var6;
        } else if (this.field324 >= var4) {
            this.field324 = (this.field324 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @ObfuscatedName("aj.ak([IIIII)I")
    public int method902(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field330 > 0) {
                int var6 = this.field330 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field330 += arg1;
                if (this.field332 == 256 && (this.field324 & 0xFF) == 0) {
                    if (Statics.field274) {
                        arg1 = method769(0, ((class36) this.field334).field250, arg0, this.field324, arg1, this.field331, this.field325, this.field328, this.field333, 0, var6, arg2, this);
                    } else {
                        arg1 = method802(((class36) this.field334).field250, arg0, this.field324, arg1, this.field319, this.field323, 0, var6, arg2, this);
                    }
                } else if (Statics.field274) {
                    arg1 = method807(0, 0, ((class36) this.field334).field250, arg0, this.field324, arg1, this.field331, this.field325, this.field328, this.field333, 0, var6, arg2, this, this.field332, arg4);
                } else {
                    arg1 = method906(0, 0, ((class36) this.field334).field250, arg0, this.field324, arg1, this.field319, this.field323, 0, var6, arg2, this, this.field332, arg4);
                }
                this.field330 -= arg1;
                if (this.field330 != 0) {
                    return arg1;
                }
                if (!this.method839()) {
                    continue;
                }
                return arg3;
            }
            if (this.field332 == 256 && (this.field324 & 0xFF) == 0) {
                if (Statics.field274) {
                    return method859(0, ((class36) this.field334).field250, arg0, this.field324, arg1, this.field331, this.field325, 0, arg3, arg2, this);
                }
                return method856(((class36) this.field334).field250, arg0, this.field324, arg1, this.field319, 0, arg3, arg2, this);
            }
            if (Statics.field274) {
                return method799(0, 0, ((class36) this.field334).field250, arg0, this.field324, arg1, this.field331, this.field325, 0, arg3, arg2, this, this.field332, arg4);
            }
            return method798(0, 0, ((class36) this.field334).field250, arg0, this.field324, arg1, this.field319, 0, arg3, arg2, this, this.field332, arg4);
        }
    }

    @ObfuscatedName("aj.an([IIIII)I")
    public int method894(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field330 > 0) {
                int var6 = this.field330 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field330 += arg1;
                if (this.field332 == -256 && (this.field324 & 0xFF) == 0) {
                    if (Statics.field274) {
                        arg1 = method805(0, ((class36) this.field334).field250, arg0, this.field324, arg1, this.field331, this.field325, this.field328, this.field333, 0, var6, arg2, this);
                    } else {
                        arg1 = method804(((class36) this.field334).field250, arg0, this.field324, arg1, this.field319, this.field323, 0, var6, arg2, this);
                    }
                } else if (Statics.field274) {
                    arg1 = method791(0, 0, ((class36) this.field334).field250, arg0, this.field324, arg1, this.field331, this.field325, this.field328, this.field333, 0, var6, arg2, this, this.field332, arg4);
                } else {
                    arg1 = method808(0, 0, ((class36) this.field334).field250, arg0, this.field324, arg1, this.field319, this.field323, 0, var6, arg2, this, this.field332, arg4);
                }
                this.field330 -= arg1;
                if (this.field330 != 0) {
                    return arg1;
                }
                if (!this.method839()) {
                    continue;
                }
                return arg3;
            }
            if (this.field332 == -256 && (this.field324 & 0xFF) == 0) {
                if (Statics.field274) {
                    return method797(0, ((class36) this.field334).field250, arg0, this.field324, arg1, this.field331, this.field325, 0, arg3, arg2, this);
                }
                return method796(((class36) this.field334).field250, arg0, this.field324, arg1, this.field319, 0, arg3, arg2, this);
            }
            if (Statics.field274) {
                return method892(0, 0, ((class36) this.field334).field250, arg0, this.field324, arg1, this.field331, this.field325, 0, arg3, arg2, this, this.field332, arg4);
            }
            return method800(0, 0, ((class36) this.field334).field250, arg0, this.field324, arg1, this.field319, 0, arg3, arg2, this, this.field332, arg4);
        }
    }

    @ObfuscatedName("aj.ab()Z")
    public boolean method839() {
        int var1 = this.field321;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method908(var1, this.field320);
            var2 = method770(var1, this.field320);
        }
        if (this.field319 != var1 || this.field331 != var3 || this.field325 != var2) {
            if (this.field319 < var1) {
                this.field323 = 1;
                this.field330 = var1 - this.field319;
            } else if (this.field319 > var1) {
                this.field323 = -1;
                this.field330 = this.field319 - var1;
            } else {
                this.field323 = 0;
            }
            if (this.field331 < var3) {
                this.field328 = 1;
                if (this.field330 == 0 || this.field330 > var3 - this.field331) {
                    this.field330 = var3 - this.field331;
                }
            } else if (this.field331 > var3) {
                this.field328 = -1;
                if (this.field330 == 0 || this.field330 > this.field331 - var3) {
                    this.field330 = this.field331 - var3;
                }
            } else {
                this.field328 = 0;
            }
            if (this.field325 < var2) {
                this.field333 = 1;
                if (this.field330 == 0 || this.field330 > var2 - this.field325) {
                    this.field330 = var2 - this.field325;
                }
            } else if (this.field325 > var2) {
                this.field333 = -1;
                if (this.field330 == 0 || this.field330 > this.field325 - var2) {
                    this.field330 = this.field325 - var2;
                }
            } else {
                this.field333 = 0;
            }
            return false;
        } else if (this.field321 == Integer.MIN_VALUE) {
            this.field321 = 0;
            this.field325 = 0;
            this.field331 = 0;
            this.field319 = 0;
            this.method5732();
            return true;
        } else {
            this.method784();
            return false;
        }
    }

    @ObfuscatedName("aj.au([B[IIIIIIILaj;)I")
    public static int method856(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class43 arg8) {
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
        arg8.field324 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("aj.am(I[B[IIIIIIIILaj;)I")
    public static int method859(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class43 arg10) {
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
        arg10.field324 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("aj.ao([B[IIIIIIILaj;)I")
    public static int method796(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class43 arg8) {
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
        arg8.field324 = var9 << 8;
        return arg3;
    }

    @ObfuscatedName("aj.az(I[B[IIIIIIIILaj;)I")
    public static int method797(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class43 arg10) {
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
        arg10.field324 = var11 << 8;
        return var16 >> 1;
    }

    @ObfuscatedName("aj.bd(II[B[IIIIIIILaj;II)I")
    public static int method798(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class43 arg10, int arg11, int arg12) {
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
        arg10.field324 = arg4;
        return arg5;
    }

    @ObfuscatedName("aj.bt(II[B[IIIIIIIILaj;II)I")
    public static int method799(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class43 arg11, int arg12, int arg13) {
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
        arg11.field324 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("aj.bf(II[B[IIIIIIILaj;II)I")
    public static int method800(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class43 arg10, int arg11, int arg12) {
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
        arg10.field324 = arg4;
        return arg5;
    }

    @ObfuscatedName("aj.bp(II[B[IIIIIIIILaj;II)I")
    public static int method892(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class43 arg11, int arg12, int arg13) {
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
        arg11.field324 = arg4;
        return var15 >> 1;
    }

    @ObfuscatedName("aj.bl([B[IIIIIIIILaj;)I")
    public static int method802(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class43 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field331 += (var14 - arg3) * arg9.field328;
        arg9.field325 += (var14 - arg3) * arg9.field333;
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
        arg9.field319 = var12 >> 2;
        arg9.field324 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("aj.bc(I[B[IIIIIIIIIILaj;)I")
    public static int method769(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class43 arg12) {
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
        arg12.field319 += (var19 - arg4) * arg12.field323;
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
        arg12.field331 = var15 >> 2;
        arg12.field325 = var16 >> 2;
        arg12.field324 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("aj.br([B[IIIIIIIILaj;)I")
    public static int method804(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class43 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field331 += (var14 - arg3) * arg9.field328;
        arg9.field325 += (var14 - arg3) * arg9.field333;
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
        arg9.field319 = var12 >> 2;
        arg9.field324 = var10 << 8;
        return arg3;
    }

    @ObfuscatedName("aj.bw(I[B[IIIIIIIIIILaj;)I")
    public static int method805(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class43 arg12) {
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
        arg12.field319 += (var19 - arg4) * arg12.field323;
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
        arg12.field331 = var15 >> 2;
        arg12.field325 = var16 >> 2;
        arg12.field324 = var13 << 8;
        return var20 >> 1;
    }

    @ObfuscatedName("aj.bh(II[B[IIIIIIIILaj;II)I")
    public static int method906(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class43 arg11, int arg12, int arg13) {
        arg11.field331 -= arg11.field328 * arg5;
        arg11.field325 -= arg11.field333 * arg5;
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
        arg11.field331 += arg11.field328 * arg5;
        arg11.field325 += arg11.field333 * arg5;
        arg11.field319 = arg6;
        arg11.field324 = arg4;
        return arg5;
    }

    @ObfuscatedName("aj.bj(II[B[IIIIIIIIIILaj;II)I")
    public static int method807(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class43 arg13, int arg14, int arg15) {
        arg13.field319 -= arg13.field323 * arg5;
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
        arg13.field319 += arg13.field323 * var27;
        arg13.field331 = arg6;
        arg13.field325 = arg7;
        arg13.field324 = arg4;
        return var27;
    }

    @ObfuscatedName("aj.be(II[B[IIIIIIIILaj;II)I")
    public static int method808(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class43 arg11, int arg12, int arg13) {
        arg11.field331 -= arg11.field328 * arg5;
        arg11.field325 -= arg11.field333 * arg5;
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
        arg11.field331 += arg11.field328 * arg5;
        arg11.field325 += arg11.field333 * arg5;
        arg11.field319 = arg6;
        arg11.field324 = arg4;
        return arg5;
    }

    @ObfuscatedName("aj.bq(II[B[IIIIIIIIIILaj;II)I")
    public static int method791(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class43 arg13, int arg14, int arg15) {
        arg13.field319 -= arg13.field323 * arg5;
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
        arg13.field319 += arg13.field323 * var26;
        arg13.field331 = arg6;
        arg13.field325 = arg7;
        arg13.field324 = arg4;
        return var26;
    }
}
